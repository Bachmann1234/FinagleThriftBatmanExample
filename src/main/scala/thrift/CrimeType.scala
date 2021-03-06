/**
 * Generated by Scrooge
 *   version: 18.6.0
 *   rev: 4d5c08c211c7320d0d225bba35a74bdc47c750e6
 *   built at: 20180617-175206
 */
package thrift

import com.twitter.scrooge.ThriftEnum
import scala.collection.immutable.{Map => immutable$Map}


@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
case object CrimeType {

  val annotations: immutable$Map[String, String] = immutable$Map.empty

  
  case object Murder extends thrift.CrimeType {
    val value: Int = 0
    val name: String = "Murder"
    val originalName: String = "MURDER"
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  private[this] val _SomeMurder = _root_.scala.Some(thrift.CrimeType.Murder)
  
  case object Robbery extends thrift.CrimeType {
    val value: Int = 1
    val name: String = "Robbery"
    val originalName: String = "ROBBERY"
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  private[this] val _SomeRobbery = _root_.scala.Some(thrift.CrimeType.Robbery)
  
  case object Other extends thrift.CrimeType {
    val value: Int = 2
    val name: String = "Other"
    val originalName: String = "OTHER"
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  private[this] val _SomeOther = _root_.scala.Some(thrift.CrimeType.Other)

  case class EnumUnknownCrimeType(value: Int) extends thrift.CrimeType {
    val name: String = "EnumUnknownCrimeType" + value
    def originalName: String = name
  }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   */
  def apply(value: Int): thrift.CrimeType =
    value match {
      case 0 => thrift.CrimeType.Murder
      case 1 => thrift.CrimeType.Robbery
      case 2 => thrift.CrimeType.Other
      case _ => throw new NoSuchElementException(value.toString)
    }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * returns an EnumUnknownCrimeType(value) if the value is not found.
   * In particular this allows ignoring new values added to an enum
   * in the IDL on the producer side when the consumer was not updated.
   */
  def getOrUnknown(value: Int): thrift.CrimeType =
    get(value) match {
      case _root_.scala.Some(e) => e
      case _root_.scala.None => EnumUnknownCrimeType(value)
    }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * Returns None if the value is not found
   */
  def get(value: Int): _root_.scala.Option[thrift.CrimeType] =
    value match {
      case 0 => _SomeMurder
      case 1 => _SomeRobbery
      case 2 => _SomeOther
      case _ => _root_.scala.None
    }

  def valueOf(name: String): _root_.scala.Option[thrift.CrimeType] =
    name.toLowerCase match {
      case "murder" => _SomeMurder
      case "robbery" => _SomeRobbery
      case "other" => _SomeOther
      case _ => _root_.scala.None
    }

  lazy val list: List[thrift.CrimeType] = scala.List[thrift.CrimeType](
    thrift.CrimeType.Murder,
    thrift.CrimeType.Robbery,
    thrift.CrimeType.Other
  )
}



@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
sealed trait CrimeType extends ThriftEnum with Serializable