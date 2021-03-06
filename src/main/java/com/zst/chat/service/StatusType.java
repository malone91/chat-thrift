/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zst.chat.service;


public enum StatusType implements org.apache.thrift.TEnum {
  Offline(0),
  Online(1),
  Busy(2),
  Hidden(3);

  private final int value;

  private StatusType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static StatusType findByValue(int value) { 
    switch (value) {
      case 0:
        return Offline;
      case 1:
        return Online;
      case 2:
        return Busy;
      case 3:
        return Hidden;
      default:
        return null;
    }
  }
}
