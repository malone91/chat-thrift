
include "Struct.thrift"
include "Exception.thrift"
 
namespace java com.zst.chat.service

service CallbackService{
	
	// 接收消息（客户端实现，服务器调用）
	oneway void receiveMessage(1: Struct.MessageInfo message);
	
	// 订阅回调（服务器实现，客户端调用）
	oneway void subscribe(1: i32 userId);
	
	// 取消订阅（服务器实现，客户端调用）
	oneway void unsubscribe(1: i32 userId);
}