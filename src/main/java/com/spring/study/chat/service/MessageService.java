package com.spring.study.chat.service;

import java.util.List;

import com.spring.study.chat.model.InputMessage;
import com.spring.study.chat.model.MessagePage;
import com.spring.study.chat.model.OutputMessage;

public interface MessageService {

	public OutputMessage insertMessage(InputMessage message);
	
	public List<OutputMessage> selectMessagesByChatRoomId(MessagePage info);
	
	public int selectTotalCountOfMessageByChatRoomId(int chatRoomId);
	
}
