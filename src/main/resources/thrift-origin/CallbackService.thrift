
include "Struct.thrift"
include "Exception.thrift"
 
namespace java com.zst.chat.service
namespace cocoa ChatRoomService
namespace csharp ChatRoomService

service CallbackService{
	
	// 接收消息
	oneway void receiveMessage(1: Struct.MessageInfo message);
}