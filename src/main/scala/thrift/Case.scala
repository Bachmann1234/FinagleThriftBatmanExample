/**
 * Generated by Scrooge
 *   version: 18.6.0
 *   rev: 4d5c08c211c7320d0d225bba35a74bdc47c750e6
 *   built at: 20180617-175206
 */
package thrift

import com.twitter.io.Buf
import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob,
  ThriftException,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUtil,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport, TIOStreamTransport}
import java.io.ByteArrayInputStream
import java.nio.ByteBuffer
import java.util.Arrays
import java.util.concurrent.atomic.AtomicInteger
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object Case extends ValidatingThriftStructCodec3[Case] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("Case")
  val CaseNameField = new TField("caseName", TType.STRING, 2)
  val CaseNameFieldManifest = implicitly[Manifest[String]]
  val CrimeTypeField = new TField("CrimeType", TType.ENUM, 3)
  val CrimeTypeFieldI32 = new TField("CrimeType", TType.I32, 3)
  val CrimeTypeFieldManifest = implicitly[Manifest[thrift.CrimeType]]
  val MainSuspectField = new TField("mainSuspect", TType.STRUCT, 4)
  val MainSuspectFieldManifest = implicitly[Manifest[thrift.Villain]]
  val NotesField = new TField("notes", TType.LIST, 5)
  val NotesFieldManifest = implicitly[Manifest[Seq[String]]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      CaseNameField,
      true,
      false,
      CaseNameFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      CrimeTypeField,
      true,
      false,
      CrimeTypeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      MainSuspectField,
      true,
      false,
      MainSuspectFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      NotesField,
      true,
      false,
      NotesFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[String]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: Case): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: Case): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.caseName)
    buf ++= validateField(item.crimeType)
    buf ++= validateField(item.mainSuspect)
    buf ++= validateField(item.notes)
    buf.toList
  }

  def withoutPassthroughFields(original: Case): Case =
    new Immutable(
      caseName =
        {
          val field = original.caseName
          field.map { field =>
            field
          }
        },
      crimeType =
        {
          val field = original.crimeType
          field.map { field =>
            field
          }
        },
      mainSuspect =
        {
          val field = original.mainSuspect
          field.map { field =>
            thrift.Villain.withoutPassthroughFields(field)
          }
        },
      notes =
        {
          val field = original.notes
          field.map { field =>
            field.map { field =>
              field
            }
          }
        }
    )

  override def encode(_item: Case, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): Case = {

    var caseNameOffset: Int = -1
    var crimeType: Option[thrift.CrimeType] = None
    var mainSuspect: Option[thrift.Villain] = None
    var notes: Option[Seq[String]] = None

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                caseNameOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'caseName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 | TType.ENUM =>
    
                crimeType = Some(readCrimeTypeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.ENUM
                throw new TProtocolException(
                  "Received wrong type for field 'crimeType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRUCT =>
    
                mainSuspect = Some(readMainSuspectValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'mainSuspect' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.LIST =>
    
                notes = Some(readNotesValue(_iprot))
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'notes' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      caseNameOffset,
      crimeType,
      mainSuspect,
      notes,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): Case =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[thrift] def eagerDecode(_iprot: TProtocol): Case = {
    var caseName: _root_.scala.Option[String] = _root_.scala.None
    var crimeType: _root_.scala.Option[thrift.CrimeType] = _root_.scala.None
    var mainSuspect: _root_.scala.Option[thrift.Villain] = _root_.scala.None
    var notes: _root_.scala.Option[Seq[String]] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                caseName = _root_.scala.Some(readCaseNameValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'caseName' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 | TType.ENUM =>
                crimeType = _root_.scala.Some(readCrimeTypeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.ENUM
                throw new TProtocolException(
                  "Received wrong type for field 'crimeType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.STRUCT =>
                mainSuspect = _root_.scala.Some(readMainSuspectValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'mainSuspect' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.LIST =>
                notes = _root_.scala.Some(readNotesValue(_iprot))
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'notes' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      caseName,
      crimeType,
      mainSuspect,
      notes,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    caseName: _root_.scala.Option[String] = _root_.scala.None,
    crimeType: _root_.scala.Option[thrift.CrimeType] = _root_.scala.None,
    mainSuspect: _root_.scala.Option[thrift.Villain] = _root_.scala.None,
    notes: _root_.scala.Option[Seq[String]] = _root_.scala.None
  ): Case =
    new Immutable(
      caseName,
      crimeType,
      mainSuspect,
      notes
    )

  def unapply(_item: Case): _root_.scala.Option[_root_.scala.Tuple4[Option[String], Option[thrift.CrimeType], Option[thrift.Villain], Option[Seq[String]]]] = _root_.scala.Some(_item.toTuple)


  @inline private[thrift] def readCaseNameValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writeCaseNameField(caseName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(CaseNameField)
    writeCaseNameValue(caseName_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeCaseNameValue(caseName_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(caseName_item)
  }

  @inline private[thrift] def readCrimeTypeValue(_iprot: TProtocol): thrift.CrimeType = {
    thrift.CrimeType.getOrUnknown(_iprot.readI32())
  }

  @inline private def writeCrimeTypeField(crimeType_item: thrift.CrimeType, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(CrimeTypeFieldI32)
    writeCrimeTypeValue(crimeType_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeCrimeTypeValue(crimeType_item: thrift.CrimeType, _oprot: TProtocol): Unit = {
    _oprot.writeI32(crimeType_item.value)
  }

  @inline private[thrift] def readMainSuspectValue(_iprot: TProtocol): thrift.Villain = {
    thrift.Villain.decode(_iprot)
  }

  @inline private def writeMainSuspectField(mainSuspect_item: thrift.Villain, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(MainSuspectField)
    writeMainSuspectValue(mainSuspect_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeMainSuspectValue(mainSuspect_item: thrift.Villain, _oprot: TProtocol): Unit = {
    mainSuspect_item.write(_oprot)
  }

  @inline private[thrift] def readNotesValue(_iprot: TProtocol): Seq[String] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[String](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          _iprot.readString()
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeNotesField(notes_item: Seq[String], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(NotesField)
    writeNotesValue(notes_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeNotesValue(notes_item: Seq[String], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.STRING, notes_item.size))
    notes_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = notes_item.size
        while (_i < _size) {
          val notes_item_element = notes_item(_i)
          _oprot.writeString(notes_item_element)
          _i += 1
        }
      case _ =>
        notes_item.foreach { notes_item_element =>
          _oprot.writeString(notes_item_element)
        }
    }
    _oprot.writeListEnd()
  }


  object Immutable extends ThriftStructCodec3[Case] {
    override def encode(_item: Case, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): Case = Case.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[Case] = Case.metaData
  }

  /**
   * The default read-only implementation of Case.  You typically should not need to
   * directly reference this class; instead, use the Case.apply method to construct
   * new instances.
   */
  class Immutable(
      val caseName: _root_.scala.Option[String],
      val crimeType: _root_.scala.Option[thrift.CrimeType],
      val mainSuspect: _root_.scala.Option[thrift.Villain],
      val notes: _root_.scala.Option[Seq[String]],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends Case {
    def this(
      caseName: _root_.scala.Option[String] = _root_.scala.None,
      crimeType: _root_.scala.Option[thrift.CrimeType] = _root_.scala.None,
      mainSuspect: _root_.scala.Option[thrift.Villain] = _root_.scala.None,
      notes: _root_.scala.Option[Seq[String]] = _root_.scala.None
    ) = this(
      caseName,
      crimeType,
      mainSuspect,
      notes,
      Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      caseNameOffset: Int,
      val crimeType: _root_.scala.Option[thrift.CrimeType],
      val mainSuspect: _root_.scala.Option[thrift.Villain],
      val notes: _root_.scala.Option[Seq[String]],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends Case {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val caseName: _root_.scala.Option[String] =
      if (caseNameOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, caseNameOffset))
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the Case trait with additional state or
   * behavior and implement the read-only methods from Case using an underlying
   * instance.
   */
  trait Proxy extends Case {
    protected def _underlying_Case: Case
    override def caseName: _root_.scala.Option[String] = _underlying_Case.caseName
    override def crimeType: _root_.scala.Option[thrift.CrimeType] = _underlying_Case.crimeType
    override def mainSuspect: _root_.scala.Option[thrift.Villain] = _underlying_Case.mainSuspect
    override def notes: _root_.scala.Option[Seq[String]] = _underlying_Case.notes
    override def _passthroughFields = _underlying_Case._passthroughFields
  }
}

/**
 * Prefer the companion object's [[thrift.Case.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait Case
  extends ThriftStruct
  with _root_.scala.Product4[Option[String], Option[thrift.CrimeType], Option[thrift.Villain], Option[Seq[String]]]
  with ValidatingThriftStruct[Case]
  with java.io.Serializable
{
  import Case._

  def caseName: _root_.scala.Option[String]
  def crimeType: _root_.scala.Option[thrift.CrimeType]
  def mainSuspect: _root_.scala.Option[thrift.Villain]
  def notes: _root_.scala.Option[Seq[String]]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = caseName
  def _2 = crimeType
  def _3 = mainSuspect
  def _4 = notes

  def toTuple: _root_.scala.Tuple4[Option[String], Option[thrift.CrimeType], Option[thrift.Villain], Option[Seq[String]]] = {
    (
      caseName,
      crimeType,
      mainSuspect,
      notes
    )
  }


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 2 =>
              if (caseName.isDefined) {
                writeCaseNameValue(caseName.get, _oprot)
                _root_.scala.Some(Case.CaseNameField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (crimeType.isDefined) {
                writeCrimeTypeValue(crimeType.get, _oprot)
                _root_.scala.Some(Case.CrimeTypeField)
              } else {
                _root_.scala.None
              }
            case 4 =>
              if (mainSuspect.isDefined) {
                writeMainSuspectValue(mainSuspect.get, _oprot)
                _root_.scala.Some(Case.MainSuspectField)
              } else {
                _root_.scala.None
              }
            case 5 =>
              if (notes.isDefined) {
                writeNotesValue(notes.get, _oprot)
                _root_.scala.Some(Case.NotesField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): Case = {
    var caseName: _root_.scala.Option[String] = this.caseName
    var crimeType: _root_.scala.Option[thrift.CrimeType] = this.crimeType
    var mainSuspect: _root_.scala.Option[thrift.Villain] = this.mainSuspect
    var notes: _root_.scala.Option[Seq[String]] = this.notes
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 2 =>
        caseName = _root_.scala.Some(readCaseNameValue(_blob.read))
      case 3 =>
        crimeType = _root_.scala.Some(readCrimeTypeValue(_blob.read))
      case 4 =>
        mainSuspect = _root_.scala.Some(readMainSuspectValue(_blob.read))
      case 5 =>
        notes = _root_.scala.Some(readNotesValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      caseName,
      crimeType,
      mainSuspect,
      notes,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): Case = {
    var caseName: _root_.scala.Option[String] = this.caseName
    var crimeType: _root_.scala.Option[thrift.CrimeType] = this.crimeType
    var mainSuspect: _root_.scala.Option[thrift.Villain] = this.mainSuspect
    var notes: _root_.scala.Option[Seq[String]] = this.notes

    _fieldId match {
      case 2 =>
        caseName = _root_.scala.None
      case 3 =>
        crimeType = _root_.scala.None
      case 4 =>
        mainSuspect = _root_.scala.None
      case 5 =>
        notes = _root_.scala.None
      case _ =>
    }
    new Immutable(
      caseName,
      crimeType,
      mainSuspect,
      notes,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetCaseName: Case = unsetField(2)

  def unsetCrimeType: Case = unsetField(3)

  def unsetMainSuspect: Case = unsetField(4)

  def unsetNotes: Case = unsetField(5)


  override def write(_oprot: TProtocol): Unit = {
    Case.validate(this)
    _oprot.writeStructBegin(Struct)
    if (caseName.isDefined) writeCaseNameField(caseName.get, _oprot)
    if (crimeType.isDefined) writeCrimeTypeField(crimeType.get, _oprot)
    if (mainSuspect.isDefined) writeMainSuspectField(mainSuspect.get, _oprot)
    if (notes.isDefined) writeNotesField(notes.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    caseName: _root_.scala.Option[String] = this.caseName,
    crimeType: _root_.scala.Option[thrift.CrimeType] = this.crimeType,
    mainSuspect: _root_.scala.Option[thrift.Villain] = this.mainSuspect,
    notes: _root_.scala.Option[Seq[String]] = this.notes,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): Case =
    new Immutable(
      caseName,
      crimeType,
      mainSuspect,
      notes,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[Case]

  private def _equals(x: Case, y: Case): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator)

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[Case]) &&
      _passthroughFields == other.asInstanceOf[Case]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 4

  override def productElement(n: Int): Any = n match {
    case 0 => this.caseName
    case 1 => this.crimeType
    case 2 => this.mainSuspect
    case 3 => this.notes
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "Case"

  def _codec: ValidatingThriftStructCodec3[Case] = Case
}

