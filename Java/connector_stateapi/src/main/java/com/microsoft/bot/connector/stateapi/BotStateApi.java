package com.microsoft.bot.connector.stateapi;

import com.microsoft.bot.connector.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.microsoft.bot.connector.stateapi.model.ErrorResponse;
import com.microsoft.bot.connector.stateapi.model.BotData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BotStateApi {
  /**
   * DeleteStateForUser
   * Delete all data for a user in a channel (UserData and PrivateConversationData)
   * @param channelId channelId (required)
   * @param userId id for the user on the channel (required)
   * @return Call&lt;List<String>&gt;
   */
  
  @DELETE("v3/botstate/{channelId}/users/{userId}")
  Call<List<String>> botStateDeleteStateForUser(
    @Path("channelId") String channelId, @Path("userId") String userId
  );

  /**
   * GetConversationData
   * get the bots data for all users in a conversation
   * @param channelId the channelId (required)
   * @param conversationId The id for the conversation on the channel (required)
   * @return Call&lt;BotData&gt;
   */
  
  @GET("v3/botstate/{channelId}/conversations/{conversationId}")
  Call<BotData> botStateGetConversationData(
    @Path("channelId") String channelId, @Path("conversationId") String conversationId
  );

  /**
   * GetPrivateConversationData
   * get bot&#39;s data for a single user in a conversation
   * @param channelId channelId (required)
   * @param conversationId The id for the conversation on the channel (required)
   * @param userId id for the user on the channel (required)
   * @return Call&lt;BotData&gt;
   */
  
  @GET("v3/botstate/{channelId}/conversations/{conversationId}/users/{userId}")
  Call<BotData> botStateGetPrivateConversationData(
    @Path("channelId") String channelId, @Path("conversationId") String conversationId, @Path("userId") String userId
  );

  /**
   * GetUserData
   * Get a bots data for the user across all conversations
   * @param channelId channelId (required)
   * @param userId id for the user on the channel (required)
   * @return Call&lt;BotData&gt;
   */
  
  @GET("v3/botstate/{channelId}/users/{userId}")
  Call<BotData> botStateGetUserData(
    @Path("channelId") String channelId, @Path("userId") String userId
  );

  /**
   * SetConversationData
   * Update the bot&#39;s data for all users in a conversation
   * @param channelId channelId (required)
   * @param conversationId The id for the conversation on the channel (required)
   * @param botData the new botdata (required)
   * @return Call&lt;BotData&gt;
   */
  
  @POST("v3/botstate/{channelId}/conversations/{conversationId}")
  Call<BotData> botStateSetConversationData(
    @Path("channelId") String channelId, @Path("conversationId") String conversationId, @Body BotData botData
  );

  /**
   * SetPrivateConversationData
   * Update the bot&#39;s data for a single user in a conversation
   * @param channelId channelId (required)
   * @param conversationId The id for the conversation on the channel (required)
   * @param userId id for the user on the channel (required)
   * @param botData the new botdata (required)
   * @return Call&lt;BotData&gt;
   */
  
  @POST("v3/botstate/{channelId}/conversations/{conversationId}/users/{userId}")
  Call<BotData> botStateSetPrivateConversationData(
    @Path("channelId") String channelId, @Path("conversationId") String conversationId, @Path("userId") String userId, @Body BotData botData
  );

  /**
   * SetUserData
   * Update the bot&#39;s data for a user
   * @param channelId channelId (required)
   * @param userId id for the user on the channel (required)
   * @param botData the new botdata (required)
   * @return Call&lt;BotData&gt;
   */
  
  @POST("v3/botstate/{channelId}/users/{userId}")
  Call<BotData> botStateSetUserData(
    @Path("channelId") String channelId, @Path("userId") String userId, @Body BotData botData
  );

}
