package com.microsoft.bot.connector.connectorapi;

import com.microsoft.bot.connector.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.microsoft.bot.connector.connectorapi.model.ConversationParameters;
import com.microsoft.bot.connector.connectorapi.model.ConversationResourceResponse;
import com.microsoft.bot.connector.connectorapi.model.ErrorResponse;
import com.microsoft.bot.connector.connectorapi.model.ChannelAccount;
import com.microsoft.bot.connector.connectorapi.model.ResourceResponse;
import com.microsoft.bot.connector.connectorapi.model.Activity;
import com.microsoft.bot.connector.connectorapi.model.AttachmentData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConversationsApi {
  /**
   * CreateConversation
   * Create a new Conversation.    POST to this method with a  * Bot being the bot creating the conversation  * IsGroup set to true if this is not a direct message (default is false)  * Members array contining the members you want to have be in the conversation.    The return value is a ResourceResponse which contains a conversation id which is suitable for use  in the message payload and REST API uris.    Most channels only support the semantics of bots initiating a direct message conversation.  An example of how to do that would be:    &#x60;&#x60;&#x60;  var resource &#x3D; await connector.conversations.CreateConversation(new ConversationParameters(){ Bot &#x3D; bot, members &#x3D; new ChannelAccount[] { new ChannelAccount(\&quot;user1\&quot;) } );  await connect.Conversations.SendToConversationAsync(resource.Id, new Activity() ... ) ;    &#x60;&#x60;&#x60;
   * @param parameters Parameters to create the conversation from (required)
   * @return Call&lt;ConversationResourceResponse&gt;
   */
  
  @POST("v3/conversations")
  Call<ConversationResourceResponse> conversationsCreateConversation(
    @Body ConversationParameters parameters
  );

  /**
   * DeleteActivity
   * Delete an existing activity.    Some channels allow you to delete an existing activity, and if successful this method will remove the specified activity.
   * @param conversationId Conversation ID (required)
   * @param activityId activityId to delete (required)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("v3/conversations/{conversationId}/activities/{activityId}")
  Call<Void> conversationsDeleteActivity(
    @Path("conversationId") String conversationId, @Path("activityId") String activityId
  );

  /**
   * GetActivityMembers
   * Enumerate the members of an activity.     This REST API takes a ConversationId and a ActivityId, returning an array of ChannelAccount objects representing the members of the particular activity in the conversation.
   * @param conversationId Conversation ID (required)
   * @param activityId Activity ID (required)
   * @return Call&lt;List<ChannelAccount>&gt;
   */
  
  @GET("v3/conversations/{conversationId}/activities/{activityId}/members")
  Call<List<ChannelAccount>> conversationsGetActivityMembers(
    @Path("conversationId") String conversationId, @Path("activityId") String activityId
  );

  /**
   * GetConversationMembers
   * Enumerate the members of a converstion.     This REST API takes a ConversationId and returns an array of ChannelAccount objects representing the members of the conversation.
   * @param conversationId Conversation ID (required)
   * @return Call&lt;List<ChannelAccount>&gt;
   */
  
  @GET("v3/conversations/{conversationId}/members")
  Call<List<ChannelAccount>> conversationsGetConversationMembers(
    @Path("conversationId") String conversationId
  );

  /**
   * ReplyToActivity
   * This method allows you to reply to an activity.    This is slightly different from SendToConversation().  * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.  * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.    Use ReplyToActivity when replying to a specific activity in the conversation.    Use SendToConversation in all other cases.
   * @param conversationId Conversation ID (required)
   * @param activityId activityId the reply is to (OPTIONAL) (required)
   * @param activity Activity to send (required)
   * @return Call&lt;ResourceResponse&gt;
   */
  
  @POST("v3/conversations/{conversationId}/activities/{activityId}")
  Call<ResourceResponse> conversationsReplyToActivity(
    @Path("conversationId") String conversationId, @Path("activityId") String activityId, @Body Activity activity
  );

  /**
   * SendToConversation
   * This method allows you to send an activity to the end of a conversation.    This is slightly different from ReplyToActivity().  * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.  * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.    Use ReplyToActivity when replying to a specific activity in the conversation.    Use SendToConversation in all other cases.
   * @param activity Activity to send (required)
   * @param conversationId Conversation ID (required)
   * @return Call&lt;ResourceResponse&gt;
   */
  
  @POST("v3/conversations/{conversationId}/activities")
  Call<ResourceResponse> conversationsSendToConversation(
    @Body Activity activity, @Path("conversationId") String conversationId
  );

  /**
   * UpdateActivity
   * Edit an existing activity.    Some channels allow you to edit an existing activity to reflect the new state of a bot conversation.    For example, you can remove buttons after someone has clicked \&quot;Approve\&quot; button.
   * @param conversationId Conversation ID (required)
   * @param activityId activityId to update (required)
   * @param activity replacement Activity (required)
   * @return Call&lt;ResourceResponse&gt;
   */
  
  @PUT("v3/conversations/{conversationId}/activities/{activityId}")
  Call<ResourceResponse> conversationsUpdateActivity(
    @Path("conversationId") String conversationId, @Path("activityId") String activityId, @Body Activity activity
  );

  /**
   * UploadAttachment
   * Upload an attachment directly into a channel&#39;s blob storage.    This is useful because it allows you to store data in a compliant store when dealing with enterprises.    The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments API.
   * @param conversationId Conversation ID (required)
   * @param attachmentUpload Attachment data (required)
   * @return Call&lt;ResourceResponse&gt;
   */
  
  @POST("v3/conversations/{conversationId}/attachments")
  Call<ResourceResponse> conversationsUploadAttachment(
    @Path("conversationId") String conversationId, @Body AttachmentData attachmentUpload
  );

}
