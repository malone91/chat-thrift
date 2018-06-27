
namespace java com.zst.chat.service
namespace cocoa ChatRoomService
namespace csharp ChatRoomService

exception InvalidSessionException{
	1: required i32 errorCode;
	2: required string message;
}

exception OperationException{
	1: required string message;
}
