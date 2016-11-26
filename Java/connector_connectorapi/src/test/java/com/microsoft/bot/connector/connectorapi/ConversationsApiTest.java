package com.microsoft.bot.connector.connectorapi;

import com.microsoft.bot.connector.ApiClient;
import com.microsoft.bot.connector.connectorapi.model.ConversationParameters;
import com.microsoft.bot.connector.connectorapi.model.ConversationResourceResponse;
import com.microsoft.bot.connector.connectorapi.model.ErrorResponse;
import com.microsoft.bot.connector.connectorapi.model.ChannelAccount;
import com.microsoft.bot.connector.connectorapi.model.ResourceResponse;
import com.microsoft.bot.connector.connectorapi.model.Activity;
import com.microsoft.bot.connector.connectorapi.model.AttachmentData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversationsApi
 */
public class ConversationsApiTest {

    private ConversationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConversationsApi.class);
    }

    
    /**
     * CreateConversation
     *
     * Create a new Conversation.    POST to this method with a  * Bot being the bot creating the conversation  * IsGroup set to true if this is not a direct message (default is false)  * Members array contining the members you want to have be in the conversation.    The return value is a ResourceResponse which contains a conversation id which is suitable for use  in the message payload and REST API uris.    Most channels only support the semantics of bots initiating a direct message conversation.  An example of how to do that would be:    &#x60;&#x60;&#x60;  var resource &#x3D; await connector.conversations.CreateConversation(new ConversationParameters(){ Bot &#x3D; bot, members &#x3D; new ChannelAccount[] { new ChannelAccount(\&quot;user1\&quot;) } );  await connect.Conversations.SendToConversationAsync(resource.Id, new Activity() ... ) ;    &#x60;&#x60;&#x60;
     */
    @Test
    public void conversationsCreateConversationTest() {
        ConversationParameters parameters = null;
        // ConversationResourceResponse response = api.conversationsCreateConversation(parameters);

        // TODO: test validations
    }
    
    /**
     * DeleteActivity
     *
     * Delete an existing activity.    Some channels allow you to delete an existing activity, and if successful this method will remove the specified activity.
     */
    @Test
    public void conversationsDeleteActivityTest() {
        String conversationId = null;
        String activityId = null;
        // Void response = api.conversationsDeleteActivity(conversationId, activityId);

        // TODO: test validations
    }
    
    /**
     * GetActivityMembers
     *
     * Enumerate the members of an activity.     This REST API takes a ConversationId and a ActivityId, returning an array of ChannelAccount objects representing the members of the particular activity in the conversation.
     */
    @Test
    public void conversationsGetActivityMembersTest() {
        String conversationId = null;
        String activityId = null;
        // List<ChannelAccount> response = api.conversationsGetActivityMembers(conversationId, activityId);

        // TODO: test validations
    }
    
    /**
     * GetConversationMembers
     *
     * Enumerate the members of a converstion.     This REST API takes a ConversationId and returns an array of ChannelAccount objects representing the members of the conversation.
     */
    @Test
    public void conversationsGetConversationMembersTest() {
        String conversationId = null;
        // List<ChannelAccount> response = api.conversationsGetConversationMembers(conversationId);

        // TODO: test validations
    }
    
    /**
     * ReplyToActivity
     *
     * This method allows you to reply to an activity.    This is slightly different from SendToConversation().  * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.  * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.    Use ReplyToActivity when replying to a specific activity in the conversation.    Use SendToConversation in all other cases.
     */
    @Test
    public void conversationsReplyToActivityTest() {
        String conversationId = null;
        String activityId = null;
        Activity activity = null;
        // ResourceResponse response = api.conversationsReplyToActivity(conversationId, activityId, activity);

        // TODO: test validations
    }
    
    /**
     * SendToConversation
     *
     * This method allows you to send an activity to the end of a conversation.    This is slightly different from ReplyToActivity().  * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.  * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.    Use ReplyToActivity when replying to a specific activity in the conversation.    Use SendToConversation in all other cases.
     */
    @Test
    public void conversationsSendToConversationTest() {
        Activity activity = null;
        String conversationId = null;
        // ResourceResponse response = api.conversationsSendToConversation(activity, conversationId);

        // TODO: test validations
    }
    
    /**
     * UpdateActivity
     *
     * Edit an existing activity.    Some channels allow you to edit an existing activity to reflect the new state of a bot conversation.    For example, you can remove buttons after someone has clicked \&quot;Approve\&quot; button.
     */
    @Test
    public void conversationsUpdateActivityTest() {
        String conversationId = null;
        String activityId = null;
        Activity activity = null;
        // ResourceResponse response = api.conversationsUpdateActivity(conversationId, activityId, activity);

        // TODO: test validations
    }
    
    /**
     * UploadAttachment
     *
     * Upload an attachment directly into a channel&#39;s blob storage.    This is useful because it allows you to store data in a compliant store when dealing with enterprises.    The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments API.
     */
    @Test
    public void conversationsUploadAttachmentTest() {
        String conversationId = null;
        AttachmentData attachmentUpload = null;
        // ResourceResponse response = api.conversationsUploadAttachment(conversationId, attachmentUpload);

        // TODO: test validations
    }
    
}
