/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zst.chat.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-06-20")
public class RegisterRequest implements org.apache.thrift.TBase<RegisterRequest, RegisterRequest._Fields>, java.io.Serializable, Cloneable, Comparable<RegisterRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RegisterRequest");

  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PICTURE_FIELD_DESC = new org.apache.thrift.protocol.TField("picture", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RegisterRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RegisterRequestTupleSchemeFactory();

  public String userName; // required
  public String password; // required
  public String displayName; // required
  public java.nio.ByteBuffer picture; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_NAME((short)1, "userName"),
    PASSWORD((short)2, "password"),
    DISPLAY_NAME((short)3, "displayName"),
    PICTURE((short)4, "picture");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_NAME
          return USER_NAME;
        case 2: // PASSWORD
          return PASSWORD;
        case 3: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 4: // PICTURE
          return PICTURE;
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
  private static final _Fields optionals[] = {_Fields.PICTURE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("displayName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PICTURE, new org.apache.thrift.meta_data.FieldMetaData("picture", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RegisterRequest.class, metaDataMap);
  }

  public RegisterRequest() {
  }

  public RegisterRequest(
    String userName,
    String password,
    String displayName)
  {
    this();
    this.userName = userName;
    this.password = password;
    this.displayName = displayName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RegisterRequest(RegisterRequest other) {
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    if (other.isSetPicture()) {
      this.picture = org.apache.thrift.TBaseHelper.copyBinary(other.picture);
    }
  }

  public RegisterRequest deepCopy() {
    return new RegisterRequest(this);
  }

  @Override
  public void clear() {
    this.userName = null;
    this.password = null;
    this.displayName = null;
    this.picture = null;
  }

  public String getUserName() {
    return this.userName;
  }

  public RegisterRequest setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public RegisterRequest setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public RegisterRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public byte[] getPicture() {
    setPicture(org.apache.thrift.TBaseHelper.rightSize(picture));
    return picture == null ? null : picture.array();
  }

  public java.nio.ByteBuffer bufferForPicture() {
    return org.apache.thrift.TBaseHelper.copyBinary(picture);
  }

  public RegisterRequest setPicture(byte[] picture) {
    this.picture = picture == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(picture.clone());
    return this;
  }

  public RegisterRequest setPicture(java.nio.ByteBuffer picture) {
    this.picture = org.apache.thrift.TBaseHelper.copyBinary(picture);
    return this;
  }

  public void unsetPicture() {
    this.picture = null;
  }

  /** Returns true if field picture is set (has been assigned a value) and false otherwise */
  public boolean isSetPicture() {
    return this.picture != null;
  }

  public void setPictureIsSet(boolean value) {
    if (!value) {
      this.picture = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((String)value);
      }
      break;

    case PICTURE:
      if (value == null) {
        unsetPicture();
      } else {
        if (value instanceof byte[]) {
          setPicture((byte[])value);
        } else {
          setPicture((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_NAME:
      return getUserName();

    case PASSWORD:
      return getPassword();

    case DISPLAY_NAME:
      return getDisplayName();

    case PICTURE:
      return getPicture();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_NAME:
      return isSetUserName();
    case PASSWORD:
      return isSetPassword();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case PICTURE:
      return isSetPicture();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RegisterRequest)
      return this.equals((RegisterRequest)that);
    return false;
  }

  public boolean equals(RegisterRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_picture = true && this.isSetPicture();
    boolean that_present_picture = true && that.isSetPicture();
    if (this_present_picture || that_present_picture) {
      if (!(this_present_picture && that_present_picture))
        return false;
      if (!this.picture.equals(that.picture))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUserName()) ? 131071 : 524287);
    if (isSetUserName())
      hashCode = hashCode * 8191 + userName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
    if (isSetPassword())
      hashCode = hashCode * 8191 + password.hashCode();

    hashCode = hashCode * 8191 + ((isSetDisplayName()) ? 131071 : 524287);
    if (isSetDisplayName())
      hashCode = hashCode * 8191 + displayName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPicture()) ? 131071 : 524287);
    if (isSetPicture())
      hashCode = hashCode * 8191 + picture.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RegisterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayName()).compareTo(other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayName, other.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPicture()).compareTo(other.isSetPicture());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPicture()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.picture, other.picture);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RegisterRequest(");
    boolean first = true;

    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayName:");
    if (this.displayName == null) {
      sb.append("null");
    } else {
      sb.append(this.displayName);
    }
    first = false;
    if (isSetPicture()) {
      if (!first) sb.append(", ");
      sb.append("picture:");
      if (this.picture == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.picture, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (userName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userName' was not present! Struct: " + toString());
    }
    if (password == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'password' was not present! Struct: " + toString());
    }
    if (displayName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'displayName' was not present! Struct: " + toString());
    }
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

  private static class RegisterRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RegisterRequestStandardScheme getScheme() {
      return new RegisterRequestStandardScheme();
    }
  }

  private static class RegisterRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<RegisterRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RegisterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PICTURE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.picture = iprot.readBinary();
              struct.setPictureIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RegisterRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      if (struct.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(struct.displayName);
        oprot.writeFieldEnd();
      }
      if (struct.picture != null) {
        if (struct.isSetPicture()) {
          oprot.writeFieldBegin(PICTURE_FIELD_DESC);
          oprot.writeBinary(struct.picture);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RegisterRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RegisterRequestTupleScheme getScheme() {
      return new RegisterRequestTupleScheme();
    }
  }

  private static class RegisterRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<RegisterRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RegisterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.userName);
      oprot.writeString(struct.password);
      oprot.writeString(struct.displayName);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPicture()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPicture()) {
        oprot.writeBinary(struct.picture);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RegisterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.userName = iprot.readString();
      struct.setUserNameIsSet(true);
      struct.password = iprot.readString();
      struct.setPasswordIsSet(true);
      struct.displayName = iprot.readString();
      struct.setDisplayNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.picture = iprot.readBinary();
        struct.setPictureIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
