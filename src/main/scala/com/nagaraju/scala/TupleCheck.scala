package com.nagaraju.scala
/*
  TupleCheck
 */

object TupleCheck extends App {
           //Creating tuple
  val tpleOne = (1,2,3,4,5)
  /*// accesssing tuple
  println("First:"+tpleOne._1)
  // Iterating through tuple and printing the values
  tpleOne.productIterator.foreach( v=> println(v))*/
  println(tpleOne.productPrefix)
  println("productElement"+tpleOne.productArity)
  println("productElement"+tpleOne.productElement(1))
  println("productElementName"+tpleOne.productElementName(1))
  println("Product elementsNames;:")
  println(tpleOne.productElementNames.foreach(s => println(s)))
}

