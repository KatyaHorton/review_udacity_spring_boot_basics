package com.example.review.mapper;

import com.example.review.model.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MessageMapper {
   @Select("SELECT * FROM MESSAGES where username = #{username}")
   ChatMessage getMessage(String username);

   @Insert("INSERT INTO MESSAGES (username, messagetext) VALUES(#{username}, #{messageText})")
   @Options(useGeneratedKeys = true, keyProperty = "messageId")
   int insert(ChatMessage message);
}
