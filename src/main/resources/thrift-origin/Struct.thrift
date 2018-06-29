/**
 * Thrift支持的数据类型
 *  bool        Boolean, one byte
 *  i8 (byte)   Signed 8-bit integer
 *  i16         Signed 16-bit integer
 *  i32         Signed 32-bit integer
 *  i64         Signed 64-bit integer
 *  double      64-bit floating point value
 *  string      String
 *  binary      Blob (byte array)
 *  map<t1,t2>  Map from one type to another
 *  list<t1>    Ordered list of one type
 *  set<t1>     Set of unique elements of one type
 */
 
namespace java com.zst.chat.service

// 客户端类型
enum ClientType {
  PC = 1,
  AndriodPhone = 2,
  AndriodPad = 3,
  iPhone = 4,
  iPad = 5,
}

// 消息类型
enum MessageType {
  String = 1, // 字符串
  emoji = 2, // 表情
  image = 3, // 图片
  file = 4, // 文件
}

// 用户状态
enum StatusType {
  Offline = 0, // 离线
  Online = 1, // 在线
  Busy = 2, // 忙碌
  Hidden = 3, // 隐身
}

enum ErrorCode{
	// 常规错误
	OK = 0,
	NetError,
    DBError,
	OtherError,
	// 登录注册错误
	UserNotExist = 100,
	PasswordError,
	UserDisable,
	UserExist,
	DataTooLong,
	// 发送消息错误
	UserOffline = 200,
}

// 会话id
struct SessionInfo{
	1: required string sessionId;
}

// 登录参数
struct LoginRequest{
	1: required string userName;
	2: required string password;
	3: required string machineCode;
	4: required ClientType type;
}

// 登录返回值
struct LoginResponse {
	1: required bool isSuccess;
	2: required string displayName;
	3: required i32 userId;
	4: required string sessionId;
	5: required ErrorCode errorCode;
}

// 注册参数
struct RegisterRequest{
	1: required string userName;
	2: required string password;
	3: required string displayName;
	4: optional binary picture;
}

// 用户信息
struct UserInfo{
	1: required string userName;
	3: required string displayName;
	4: optional binary picture;
	5: required i32 userId;
	6: required ClientType type;
	7: required StatusType status;
}

// 消息
struct MessageInfo{
	1: required i64 seqNo;
	2: required MessageType type;
	3: optional string message;
	4: optional string emoji;
	5: optional binary image;
	6: optional binary file;
	7: required i32 srcUserId;
	8: required i32 dstUserId;
	9: required bool isGroupChat;
}

// 获取用户列表
struct GetUserListRequest{
	1: optional i32 userId;
	2: optional string userName;
	3: optional string displayName;
	4: optional ClientType type;
	5: optional StatusType status;
}

// 获取用户图像
struct GetUserLogoRequest{
	1: optional i32 userId;
	2: optional string userName;
}
// 发送消息返回值
struct SendMessageResponse{
	1: required ErrorCode errorCode;
	2: required i64 seqNo;
}

// 接收消息
struct ReceiveMessageRequest{
	1: optional i64 seqNo;
	2: optional i32 userId;
}