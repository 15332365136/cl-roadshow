package com.cl.roadshow.thrift.demo;

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-25")
public class StudentResponse implements org.apache.thrift.TBase<StudentResponse, StudentResponse._Fields>, java.io.Serializable, Cloneable, Comparable<StudentResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StudentResponse");

  private static final org.apache.thrift.protocol.TField STUDENT_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("studentList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StudentResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StudentResponseTupleSchemeFactory());
  }

  public List<Student> studentList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STUDENT_LIST((short)1, "studentList");

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
        case 1: // STUDENT_LIST
          return STUDENT_LIST;
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
    tmpMap.put(_Fields.STUDENT_LIST, new org.apache.thrift.meta_data.FieldMetaData("studentList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Student.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StudentResponse.class, metaDataMap);
  }

  public StudentResponse() {
  }

  public StudentResponse(
    List<Student> studentList)
  {
    this();
    this.studentList = studentList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StudentResponse(StudentResponse other) {
    if (other.isSetStudentList()) {
      List<Student> __this__studentList = new ArrayList<Student>(other.studentList.size());
      for (Student other_element : other.studentList) {
        __this__studentList.add(new Student(other_element));
      }
      this.studentList = __this__studentList;
    }
  }

  public StudentResponse deepCopy() {
    return new StudentResponse(this);
  }

  @Override
  public void clear() {
    this.studentList = null;
  }

  public int getStudentListSize() {
    return (this.studentList == null) ? 0 : this.studentList.size();
  }

  public java.util.Iterator<Student> getStudentListIterator() {
    return (this.studentList == null) ? null : this.studentList.iterator();
  }

  public void addToStudentList(Student elem) {
    if (this.studentList == null) {
      this.studentList = new ArrayList<Student>();
    }
    this.studentList.add(elem);
  }

  public List<Student> getStudentList() {
    return this.studentList;
  }

  public StudentResponse setStudentList(List<Student> studentList) {
    this.studentList = studentList;
    return this;
  }

  public void unsetStudentList() {
    this.studentList = null;
  }

  /** Returns true if field studentList is set (has been assigned a value) and false otherwise */
  public boolean isSetStudentList() {
    return this.studentList != null;
  }

  public void setStudentListIsSet(boolean value) {
    if (!value) {
      this.studentList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STUDENT_LIST:
      if (value == null) {
        unsetStudentList();
      } else {
        setStudentList((List<Student>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STUDENT_LIST:
      return getStudentList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STUDENT_LIST:
      return isSetStudentList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StudentResponse)
      return this.equals((StudentResponse)that);
    return false;
  }

  public boolean equals(StudentResponse that) {
    if (that == null)
      return false;

    boolean this_present_studentList = true && this.isSetStudentList();
    boolean that_present_studentList = true && that.isSetStudentList();
    if (this_present_studentList || that_present_studentList) {
      if (!(this_present_studentList && that_present_studentList))
        return false;
      if (!this.studentList.equals(that.studentList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_studentList = true && (isSetStudentList());
    list.add(present_studentList);
    if (present_studentList)
      list.add(studentList);

    return list.hashCode();
  }

  @Override
  public int compareTo(StudentResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStudentList()).compareTo(other.isSetStudentList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStudentList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.studentList, other.studentList);
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
    StringBuilder sb = new StringBuilder("StudentResponse(");
    boolean first = true;

    sb.append("studentList:");
    if (this.studentList == null) {
      sb.append("null");
    } else {
      sb.append(this.studentList);
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

  private static class StudentResponseStandardSchemeFactory implements SchemeFactory {
    public StudentResponseStandardScheme getScheme() {
      return new StudentResponseStandardScheme();
    }
  }

  private static class StudentResponseStandardScheme extends StandardScheme<StudentResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StudentResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STUDENT_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.studentList = new ArrayList<Student>(_list0.size);
                Student _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Student();
                  _elem1.read(iprot);
                  struct.studentList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setStudentListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StudentResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.studentList != null) {
        oprot.writeFieldBegin(STUDENT_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.studentList.size()));
          for (Student _iter3 : struct.studentList)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StudentResponseTupleSchemeFactory implements SchemeFactory {
    public StudentResponseTupleScheme getScheme() {
      return new StudentResponseTupleScheme();
    }
  }

  private static class StudentResponseTupleScheme extends TupleScheme<StudentResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StudentResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStudentList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStudentList()) {
        {
          oprot.writeI32(struct.studentList.size());
          for (Student _iter4 : struct.studentList)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StudentResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.studentList = new ArrayList<Student>(_list5.size);
          Student _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new Student();
            _elem6.read(iprot);
            struct.studentList.add(_elem6);
          }
        }
        struct.setStudentListIsSet(true);
      }
    }
  }

}
