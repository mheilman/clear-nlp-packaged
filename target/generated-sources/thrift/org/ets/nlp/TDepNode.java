/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.ets.nlp;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * the thrift representation of a single node
 */
public class TDepNode implements org.apache.thrift.TBase<TDepNode, TDepNode._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDepNode");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField WORD_FIELD_DESC = new org.apache.thrift.protocol.TField("word", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LEMMA_FIELD_DESC = new org.apache.thrift.protocol.TField("lemma", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField POS_FIELD_DESC = new org.apache.thrift.protocol.TField("pos", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField FEATS_FIELD_DESC = new org.apache.thrift.protocol.TField("feats", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField HEAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("headId", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField DEPREL_FIELD_DESC = new org.apache.thrift.protocol.TField("deprel", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField SHEADS_FIELD_DESC = new org.apache.thrift.protocol.TField("sheads", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDepNodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDepNodeTupleSchemeFactory());
  }

  public String id; // required
  public String word; // required
  public String lemma; // required
  public String pos; // required
  public String feats; // required
  public String headId; // required
  public String deprel; // required
  public String sheads; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    WORD((short)2, "word"),
    LEMMA((short)3, "lemma"),
    POS((short)4, "pos"),
    FEATS((short)5, "feats"),
    HEAD_ID((short)6, "headId"),
    DEPREL((short)7, "deprel"),
    SHEADS((short)8, "sheads");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // WORD
          return WORD;
        case 3: // LEMMA
          return LEMMA;
        case 4: // POS
          return POS;
        case 5: // FEATS
          return FEATS;
        case 6: // HEAD_ID
          return HEAD_ID;
        case 7: // DEPREL
          return DEPREL;
        case 8: // SHEADS
          return SHEADS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WORD, new org.apache.thrift.meta_data.FieldMetaData("word", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LEMMA, new org.apache.thrift.meta_data.FieldMetaData("lemma", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POS, new org.apache.thrift.meta_data.FieldMetaData("pos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FEATS, new org.apache.thrift.meta_data.FieldMetaData("feats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HEAD_ID, new org.apache.thrift.meta_data.FieldMetaData("headId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEPREL, new org.apache.thrift.meta_data.FieldMetaData("deprel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHEADS, new org.apache.thrift.meta_data.FieldMetaData("sheads", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDepNode.class, metaDataMap);
  }

  public TDepNode() {
  }

  public TDepNode(
    String id,
    String word,
    String lemma,
    String pos,
    String feats,
    String headId,
    String deprel,
    String sheads)
  {
    this();
    this.id = id;
    this.word = word;
    this.lemma = lemma;
    this.pos = pos;
    this.feats = feats;
    this.headId = headId;
    this.deprel = deprel;
    this.sheads = sheads;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDepNode(TDepNode other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetWord()) {
      this.word = other.word;
    }
    if (other.isSetLemma()) {
      this.lemma = other.lemma;
    }
    if (other.isSetPos()) {
      this.pos = other.pos;
    }
    if (other.isSetFeats()) {
      this.feats = other.feats;
    }
    if (other.isSetHeadId()) {
      this.headId = other.headId;
    }
    if (other.isSetDeprel()) {
      this.deprel = other.deprel;
    }
    if (other.isSetSheads()) {
      this.sheads = other.sheads;
    }
  }

  public TDepNode deepCopy() {
    return new TDepNode(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.word = null;
    this.lemma = null;
    this.pos = null;
    this.feats = null;
    this.headId = null;
    this.deprel = null;
    this.sheads = null;
  }

  public String getId() {
    return this.id;
  }

  public TDepNode setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public String getWord() {
    return this.word;
  }

  public TDepNode setWord(String word) {
    this.word = word;
    return this;
  }

  public void unsetWord() {
    this.word = null;
  }

  /** Returns true if field word is set (has been assigned a value) and false otherwise */
  public boolean isSetWord() {
    return this.word != null;
  }

  public void setWordIsSet(boolean value) {
    if (!value) {
      this.word = null;
    }
  }

  public String getLemma() {
    return this.lemma;
  }

  public TDepNode setLemma(String lemma) {
    this.lemma = lemma;
    return this;
  }

  public void unsetLemma() {
    this.lemma = null;
  }

  /** Returns true if field lemma is set (has been assigned a value) and false otherwise */
  public boolean isSetLemma() {
    return this.lemma != null;
  }

  public void setLemmaIsSet(boolean value) {
    if (!value) {
      this.lemma = null;
    }
  }

  public String getPos() {
    return this.pos;
  }

  public TDepNode setPos(String pos) {
    this.pos = pos;
    return this;
  }

  public void unsetPos() {
    this.pos = null;
  }

  /** Returns true if field pos is set (has been assigned a value) and false otherwise */
  public boolean isSetPos() {
    return this.pos != null;
  }

  public void setPosIsSet(boolean value) {
    if (!value) {
      this.pos = null;
    }
  }

  public String getFeats() {
    return this.feats;
  }

  public TDepNode setFeats(String feats) {
    this.feats = feats;
    return this;
  }

  public void unsetFeats() {
    this.feats = null;
  }

  /** Returns true if field feats is set (has been assigned a value) and false otherwise */
  public boolean isSetFeats() {
    return this.feats != null;
  }

  public void setFeatsIsSet(boolean value) {
    if (!value) {
      this.feats = null;
    }
  }

  public String getHeadId() {
    return this.headId;
  }

  public TDepNode setHeadId(String headId) {
    this.headId = headId;
    return this;
  }

  public void unsetHeadId() {
    this.headId = null;
  }

  /** Returns true if field headId is set (has been assigned a value) and false otherwise */
  public boolean isSetHeadId() {
    return this.headId != null;
  }

  public void setHeadIdIsSet(boolean value) {
    if (!value) {
      this.headId = null;
    }
  }

  public String getDeprel() {
    return this.deprel;
  }

  public TDepNode setDeprel(String deprel) {
    this.deprel = deprel;
    return this;
  }

  public void unsetDeprel() {
    this.deprel = null;
  }

  /** Returns true if field deprel is set (has been assigned a value) and false otherwise */
  public boolean isSetDeprel() {
    return this.deprel != null;
  }

  public void setDeprelIsSet(boolean value) {
    if (!value) {
      this.deprel = null;
    }
  }

  public String getSheads() {
    return this.sheads;
  }

  public TDepNode setSheads(String sheads) {
    this.sheads = sheads;
    return this;
  }

  public void unsetSheads() {
    this.sheads = null;
  }

  /** Returns true if field sheads is set (has been assigned a value) and false otherwise */
  public boolean isSetSheads() {
    return this.sheads != null;
  }

  public void setSheadsIsSet(boolean value) {
    if (!value) {
      this.sheads = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case WORD:
      if (value == null) {
        unsetWord();
      } else {
        setWord((String)value);
      }
      break;

    case LEMMA:
      if (value == null) {
        unsetLemma();
      } else {
        setLemma((String)value);
      }
      break;

    case POS:
      if (value == null) {
        unsetPos();
      } else {
        setPos((String)value);
      }
      break;

    case FEATS:
      if (value == null) {
        unsetFeats();
      } else {
        setFeats((String)value);
      }
      break;

    case HEAD_ID:
      if (value == null) {
        unsetHeadId();
      } else {
        setHeadId((String)value);
      }
      break;

    case DEPREL:
      if (value == null) {
        unsetDeprel();
      } else {
        setDeprel((String)value);
      }
      break;

    case SHEADS:
      if (value == null) {
        unsetSheads();
      } else {
        setSheads((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case WORD:
      return getWord();

    case LEMMA:
      return getLemma();

    case POS:
      return getPos();

    case FEATS:
      return getFeats();

    case HEAD_ID:
      return getHeadId();

    case DEPREL:
      return getDeprel();

    case SHEADS:
      return getSheads();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case WORD:
      return isSetWord();
    case LEMMA:
      return isSetLemma();
    case POS:
      return isSetPos();
    case FEATS:
      return isSetFeats();
    case HEAD_ID:
      return isSetHeadId();
    case DEPREL:
      return isSetDeprel();
    case SHEADS:
      return isSetSheads();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDepNode)
      return this.equals((TDepNode)that);
    return false;
  }

  public boolean equals(TDepNode that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_word = true && this.isSetWord();
    boolean that_present_word = true && that.isSetWord();
    if (this_present_word || that_present_word) {
      if (!(this_present_word && that_present_word))
        return false;
      if (!this.word.equals(that.word))
        return false;
    }

    boolean this_present_lemma = true && this.isSetLemma();
    boolean that_present_lemma = true && that.isSetLemma();
    if (this_present_lemma || that_present_lemma) {
      if (!(this_present_lemma && that_present_lemma))
        return false;
      if (!this.lemma.equals(that.lemma))
        return false;
    }

    boolean this_present_pos = true && this.isSetPos();
    boolean that_present_pos = true && that.isSetPos();
    if (this_present_pos || that_present_pos) {
      if (!(this_present_pos && that_present_pos))
        return false;
      if (!this.pos.equals(that.pos))
        return false;
    }

    boolean this_present_feats = true && this.isSetFeats();
    boolean that_present_feats = true && that.isSetFeats();
    if (this_present_feats || that_present_feats) {
      if (!(this_present_feats && that_present_feats))
        return false;
      if (!this.feats.equals(that.feats))
        return false;
    }

    boolean this_present_headId = true && this.isSetHeadId();
    boolean that_present_headId = true && that.isSetHeadId();
    if (this_present_headId || that_present_headId) {
      if (!(this_present_headId && that_present_headId))
        return false;
      if (!this.headId.equals(that.headId))
        return false;
    }

    boolean this_present_deprel = true && this.isSetDeprel();
    boolean that_present_deprel = true && that.isSetDeprel();
    if (this_present_deprel || that_present_deprel) {
      if (!(this_present_deprel && that_present_deprel))
        return false;
      if (!this.deprel.equals(that.deprel))
        return false;
    }

    boolean this_present_sheads = true && this.isSetSheads();
    boolean that_present_sheads = true && that.isSetSheads();
    if (this_present_sheads || that_present_sheads) {
      if (!(this_present_sheads && that_present_sheads))
        return false;
      if (!this.sheads.equals(that.sheads))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_id = true && (isSetId());
    builder.append(present_id);
    if (present_id)
      builder.append(id);

    boolean present_word = true && (isSetWord());
    builder.append(present_word);
    if (present_word)
      builder.append(word);

    boolean present_lemma = true && (isSetLemma());
    builder.append(present_lemma);
    if (present_lemma)
      builder.append(lemma);

    boolean present_pos = true && (isSetPos());
    builder.append(present_pos);
    if (present_pos)
      builder.append(pos);

    boolean present_feats = true && (isSetFeats());
    builder.append(present_feats);
    if (present_feats)
      builder.append(feats);

    boolean present_headId = true && (isSetHeadId());
    builder.append(present_headId);
    if (present_headId)
      builder.append(headId);

    boolean present_deprel = true && (isSetDeprel());
    builder.append(present_deprel);
    if (present_deprel)
      builder.append(deprel);

    boolean present_sheads = true && (isSetSheads());
    builder.append(present_sheads);
    if (present_sheads)
      builder.append(sheads);

    return builder.toHashCode();
  }

  public int compareTo(TDepNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TDepNode typedOther = (TDepNode)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWord()).compareTo(typedOther.isSetWord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWord()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.word, typedOther.word);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLemma()).compareTo(typedOther.isSetLemma());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLemma()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lemma, typedOther.lemma);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPos()).compareTo(typedOther.isSetPos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pos, typedOther.pos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFeats()).compareTo(typedOther.isSetFeats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFeats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.feats, typedOther.feats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeadId()).compareTo(typedOther.isSetHeadId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeadId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headId, typedOther.headId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeprel()).compareTo(typedOther.isSetDeprel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeprel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deprel, typedOther.deprel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSheads()).compareTo(typedOther.isSetSheads());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSheads()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sheads, typedOther.sheads);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TDepNode(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("word:");
    if (this.word == null) {
      sb.append("null");
    } else {
      sb.append(this.word);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lemma:");
    if (this.lemma == null) {
      sb.append("null");
    } else {
      sb.append(this.lemma);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pos:");
    if (this.pos == null) {
      sb.append("null");
    } else {
      sb.append(this.pos);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("feats:");
    if (this.feats == null) {
      sb.append("null");
    } else {
      sb.append(this.feats);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("headId:");
    if (this.headId == null) {
      sb.append("null");
    } else {
      sb.append(this.headId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("deprel:");
    if (this.deprel == null) {
      sb.append("null");
    } else {
      sb.append(this.deprel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sheads:");
    if (this.sheads == null) {
      sb.append("null");
    } else {
      sb.append(this.sheads);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDepNodeStandardSchemeFactory implements SchemeFactory {
    public TDepNodeStandardScheme getScheme() {
      return new TDepNodeStandardScheme();
    }
  }

  private static class TDepNodeStandardScheme extends StandardScheme<TDepNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDepNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.word = iprot.readString();
              struct.setWordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LEMMA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.lemma = iprot.readString();
              struct.setLemmaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // POS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pos = iprot.readString();
              struct.setPosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FEATS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.feats = iprot.readString();
              struct.setFeatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // HEAD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.headId = iprot.readString();
              struct.setHeadIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DEPREL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deprel = iprot.readString();
              struct.setDeprelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // SHEADS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sheads = iprot.readString();
              struct.setSheadsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDepNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.word != null) {
        oprot.writeFieldBegin(WORD_FIELD_DESC);
        oprot.writeString(struct.word);
        oprot.writeFieldEnd();
      }
      if (struct.lemma != null) {
        oprot.writeFieldBegin(LEMMA_FIELD_DESC);
        oprot.writeString(struct.lemma);
        oprot.writeFieldEnd();
      }
      if (struct.pos != null) {
        oprot.writeFieldBegin(POS_FIELD_DESC);
        oprot.writeString(struct.pos);
        oprot.writeFieldEnd();
      }
      if (struct.feats != null) {
        oprot.writeFieldBegin(FEATS_FIELD_DESC);
        oprot.writeString(struct.feats);
        oprot.writeFieldEnd();
      }
      if (struct.headId != null) {
        oprot.writeFieldBegin(HEAD_ID_FIELD_DESC);
        oprot.writeString(struct.headId);
        oprot.writeFieldEnd();
      }
      if (struct.deprel != null) {
        oprot.writeFieldBegin(DEPREL_FIELD_DESC);
        oprot.writeString(struct.deprel);
        oprot.writeFieldEnd();
      }
      if (struct.sheads != null) {
        oprot.writeFieldBegin(SHEADS_FIELD_DESC);
        oprot.writeString(struct.sheads);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDepNodeTupleSchemeFactory implements SchemeFactory {
    public TDepNodeTupleScheme getScheme() {
      return new TDepNodeTupleScheme();
    }
  }

  private static class TDepNodeTupleScheme extends TupleScheme<TDepNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDepNode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetWord()) {
        optionals.set(1);
      }
      if (struct.isSetLemma()) {
        optionals.set(2);
      }
      if (struct.isSetPos()) {
        optionals.set(3);
      }
      if (struct.isSetFeats()) {
        optionals.set(4);
      }
      if (struct.isSetHeadId()) {
        optionals.set(5);
      }
      if (struct.isSetDeprel()) {
        optionals.set(6);
      }
      if (struct.isSetSheads()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetWord()) {
        oprot.writeString(struct.word);
      }
      if (struct.isSetLemma()) {
        oprot.writeString(struct.lemma);
      }
      if (struct.isSetPos()) {
        oprot.writeString(struct.pos);
      }
      if (struct.isSetFeats()) {
        oprot.writeString(struct.feats);
      }
      if (struct.isSetHeadId()) {
        oprot.writeString(struct.headId);
      }
      if (struct.isSetDeprel()) {
        oprot.writeString(struct.deprel);
      }
      if (struct.isSetSheads()) {
        oprot.writeString(struct.sheads);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDepNode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.word = iprot.readString();
        struct.setWordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lemma = iprot.readString();
        struct.setLemmaIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pos = iprot.readString();
        struct.setPosIsSet(true);
      }
      if (incoming.get(4)) {
        struct.feats = iprot.readString();
        struct.setFeatsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.headId = iprot.readString();
        struct.setHeadIdIsSet(true);
      }
      if (incoming.get(6)) {
        struct.deprel = iprot.readString();
        struct.setDeprelIsSet(true);
      }
      if (incoming.get(7)) {
        struct.sheads = iprot.readString();
        struct.setSheadsIsSet(true);
      }
    }
  }

}
