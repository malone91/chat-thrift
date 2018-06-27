/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.zst.chat.service;


public enum MessageType implements org.apache.thrift.TEnum {
  String(1),
  emoji(2),
  image(3),
  file(4);

  private final int value;

  private MessageType(int value) {
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
  public static MessageType findByValue(int value) { 
    switch (value) {
      case 1:
        return String;
      case 2:
        return emoji;
      case 3:
        return image;
      case 4:
        return file;
      default:
        return null;
    }
  }
}