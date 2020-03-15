package methods

object MethodsReturningTuples {
  def main(args: Array[String]): Unit = {
    val s = new Stock
    val (symbol, currentPrice, bidPrice) = s.getStockInfo
    println(symbol)
    println(currentPrice)
    println(bidPrice)
    // like the list(...) in php

    println(s.getStockInfo._1)
    println(s.getStockInfo._2)
    println(s.getStockInfo._3)
    //                     ^______ for unnamed tuple values
  }
}

class Stock {
  def getStockInfo = ("NFLX",100.00,101.00)
}