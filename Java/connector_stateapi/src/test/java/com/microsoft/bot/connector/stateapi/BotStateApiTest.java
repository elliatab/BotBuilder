package com.microsoft.bot.connector.stateapi;

import com.microsoft.bot.connector.ApiClient;
import com.microsoft.bot.connector.stateapi.model.ErrorResponse;
import com.microsoft.bot.connector.stateapi.model.BotData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BotStateApi
 */
public class BotStateApiTest {

    private BotStateApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BotStateApi.class);
    }

    
    /**
     * DeleteStateForUser
     *
     * Delete all data for a user in a channel (UserData and PrivateConversationData)
     */
    @Test
    public void botStateDeleteStateForUserTest() {
        String channelId = null;
        String userId = null;
        // List<String> response = api.botStateDeleteStateForUser(channelId, userId);

        // TODO: test validations
    }
    
    /**
     * GetConversationData
     *
     * get the bots data for all users in a conversation
     */
    @Test
    public void botStateGetConversationDataTest() {
        String channelId = null;
        String conversationId = null;
        // BotData response = api.botStateGetConversationData(channelId, conversationId);

        // TODO: test validations
    }
    
    /**
     * GetPrivateConversationData
     *
     * get bot&#39;s data for a single user in a conversation
     */
    @Test
    public void botStateGetPrivateConversationDataTest() {
        String channelId = null;
        String conversationId = null;
        String userId = null;
        // BotData response = api.botStateGetPrivateConversationData(channelId, conversationId, userId);

        // TODO: test validations
    }
    
    /**
     * GetUserData
     *
     * Get a bots data for the user across all conversations
     */
    @Test
    public void botStateGetUserDataTest() {
        String channelId = null;
        String userId = null;
        // BotData response = api.botStateGetUserData(channelId, userId);

        // TODO: test validations
    }
    
    /**
     * SetConversationData
     *
     * Update the bot&#39;s data for all users in a conversation
     */
    @Test
    public void botStateSetConversationDataTest() {
        String channelId = null;
        String conversationId = null;
        BotData botData = null;
        // BotData response = api.botStateSetConversationData(channelId, conversationId, botData);

        // TODO: test validations
    }
    
    /**
     * SetPrivateConversationData
     *
     * Update the bot&#39;s data for a single user in a conversation
     */
    @Test
    public void botStateSetPrivateConversationDataTest() {
        String channelId = null;
        String conversationId = null;
        String userId = null;
        BotData botData = null;
        // BotData response = api.botStateSetPrivateConversationData(channelId, conversationId, userId, botData);

        // TODO: test validations
    }
    
    /**
     * SetUserData
     *
     * Update the bot&#39;s data for a user
     */
    @Test
    public void botStateSetUserDataTest() {
        String channelId = null;
        String userId = null;
        BotData botData = null;
        // BotData response = api.botStateSetUserData(channelId, userId, botData);

        // TODO: test validations
    }
    
}
