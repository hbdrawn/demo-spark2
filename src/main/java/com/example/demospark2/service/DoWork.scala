package com.example.demospark2.service

import org.apache.spark.{SparkConf, SparkContext}
import org.springframework.stereotype.Service

@Service
class DoWork {
  def work () = {
    var conf = new SparkConf().setMaster("local[2]").setAppName("test")

    var sc = new SparkContext(conf)
    var arrayRDD = sc.makeRDD(Array[Int]( 1,2,3,4))
    println(arrayRDD.count())
  }
}
