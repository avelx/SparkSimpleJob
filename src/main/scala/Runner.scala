import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]): Unit = {
    val dataFile = "/Users/pavel/devcore/Spark/SimpleJob/data/GoogleStockPrices.csv"

    val conf = new SparkConf()
      .setMaster("local[2]")
      .setAppName("SimpleApp")

    val spark = SparkSession.builder
      .appName("SimpleApp")
      .config(conf)
      .getOrCreate()
    val df = spark.read.csv(dataFile).cache()

    val numberOfRecords  = df.count()

    df.explain()
//    val numAs = logData.filter(line => line.contains("a")).count()
//    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numberOfRecords")
    spark.stop()
  }
}