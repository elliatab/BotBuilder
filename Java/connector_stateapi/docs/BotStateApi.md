# BotStateApi

All URIs are relative to *https://state.botframework.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**botStateDeleteStateForUser**](BotStateApi.md#botStateDeleteStateForUser) | **DELETE** v3/botstate/{channelId}/users/{userId} | DeleteStateForUser
[**botStateGetConversationData**](BotStateApi.md#botStateGetConversationData) | **GET** v3/botstate/{channelId}/conversations/{conversationId} | GetConversationData
[**botStateGetPrivateConversationData**](BotStateApi.md#botStateGetPrivateConversationData) | **GET** v3/botstate/{channelId}/conversations/{conversationId}/users/{userId} | GetPrivateConversationData
[**botStateGetUserData**](BotStateApi.md#botStateGetUserData) | **GET** v3/botstate/{channelId}/users/{userId} | GetUserData
[**botStateSetConversationData**](BotStateApi.md#botStateSetConversationData) | **POST** v3/botstate/{channelId}/conversations/{conversationId} | SetConversationData
[**botStateSetPrivateConversationData**](BotStateApi.md#botStateSetPrivateConversationData) | **POST** v3/botstate/{channelId}/conversations/{conversationId}/users/{userId} | SetPrivateConversationData
[**botStateSetUserData**](BotStateApi.md#botStateSetUserData) | **POST** v3/botstate/{channelId}/users/{userId} | SetUserData


<a name="botStateDeleteStateForUser"></a>
# **botStateDeleteStateForUser**
> List&lt;String&gt; botStateDeleteStateForUser(channelId, userId)

DeleteStateForUser

Delete all data for a user in a channel (UserData and PrivateConversationData)

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.stateapi.BotStateApi;


BotStateApi apiInstance = new BotStateApi();
String channelId = "channelId_example"; // String | channelId
String userId = "userId_example"; // String | id for the user on the channel
try {
    List<String> result = apiInstance.botStateDeleteStateForUser(channelId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotStateApi#botStateDeleteStateForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| channelId |
 **userId** | **String**| id for the user on the channel |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="botStateGetConversationData"></a>
# **botStateGetConversationData**
> BotData botStateGetConversationData(channelId, conversationId)

GetConversationData

get the bots data for all users in a conversation

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.stateapi.BotStateApi;


BotStateApi apiInstance = new BotStateApi();
String channelId = "channelId_example"; // String | the channelId
String conversationId = "conversationId_example"; // String | The id for the conversation on the channel
try {
    BotData result = apiInstance.botStateGetConversationData(channelId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotStateApi#botStateGetConversationData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| the channelId |
 **conversationId** | **String**| The id for the conversation on the channel |

### Return type

[**BotData**](BotData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="botStateGetPrivateConversationData"></a>
# **botStateGetPrivateConversationData**
> BotData botStateGetPrivateConversationData(channelId, conversationId, userId)

GetPrivateConversationData

get bot&#39;s data for a single user in a conversation

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.stateapi.BotStateApi;


BotStateApi apiInstance = new BotStateApi();
String channelId = "channelId_example"; // String | channelId
String conversationId = "conversationId_example"; // String | The id for the conversation on the channel
String userId = "userId_example"; // String | id for the user on the channel
try {
    BotData result = apiInstance.botStateGetPrivateConversationData(channelId, conversationId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotStateApi#botStateGetPrivateConversationData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| channelId |
 **conversationId** | **String**| The id for the conversation on the channel |
 **userId** | **String**| id for the user on the channel |

### Return type

[**BotData**](BotData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="botStateGetUserData"></a>
# **botStateGetUserData**
> BotData botStateGetUserData(channelId, userId)

GetUserData

Get a bots data for the user across all conversations

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.stateapi.BotStateApi;


BotStateApi apiInstance = new BotStateApi();
String channelId = "channelId_example"; // String | channelId
String userId = "userId_example"; // String | id for the user on the channel
try {
    BotData result = apiInstance.botStateGetUserData(channelId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotStateApi#botStateGetUserData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| channelId |
 **userId** | **String**| id for the user on the channel |

### Return type

[**BotData**](BotData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="botStateSetConversationData"></a>
# **botStateSetConversationData**
> BotData botStateSetConversationData(channelId, conversationId, botData)

SetConversationData

Update the bot&#39;s data for all users in a conversation

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.stateapi.BotStateApi;


BotStateApi apiInstance = new BotStateApi();
String channelId = "channelId_example"; // String | channelId
String conversationId = "conversationId_example"; // String | The id for the conversation on the channel
BotData botData = new BotData(); // BotData | the new botdata
try {
    BotData result = apiInstance.botStateSetConversationData(channelId, conversationId, botData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotStateApi#botStateSetConversationData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| channelId |
 **conversationId** | **String**| The id for the conversation on the channel |
 **botData** | [**BotData**](BotData.md)| the new botdata |

### Return type

[**BotData**](BotData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="botStateSetPrivateConversationData"></a>
# **botStateSetPrivateConversationData**
> BotData botStateSetPrivateConversationData(channelId, conversationId, userId, botData)

SetPrivateConversationData

Update the bot&#39;s data for a single user in a conversation

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.stateapi.BotStateApi;


BotStateApi apiInstance = new BotStateApi();
String channelId = "channelId_example"; // String | channelId
String conversationId = "conversationId_example"; // String | The id for the conversation on the channel
String userId = "userId_example"; // String | id for the user on the channel
BotData botData = new BotData(); // BotData | the new botdata
try {
    BotData result = apiInstance.botStateSetPrivateConversationData(channelId, conversationId, userId, botData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotStateApi#botStateSetPrivateConversationData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| channelId |
 **conversationId** | **String**| The id for the conversation on the channel |
 **userId** | **String**| id for the user on the channel |
 **botData** | [**BotData**](BotData.md)| the new botdata |

### Return type

[**BotData**](BotData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="botStateSetUserData"></a>
# **botStateSetUserData**
> BotData botStateSetUserData(channelId, userId, botData)

SetUserData

Update the bot&#39;s data for a user

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.stateapi.BotStateApi;


BotStateApi apiInstance = new BotStateApi();
String channelId = "channelId_example"; // String | channelId
String userId = "userId_example"; // String | id for the user on the channel
BotData botData = new BotData(); // BotData | the new botdata
try {
    BotData result = apiInstance.botStateSetUserData(channelId, userId, botData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotStateApi#botStateSetUserData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelId** | **String**| channelId |
 **userId** | **String**| id for the user on the channel |
 **botData** | [**BotData**](BotData.md)| the new botdata |

### Return type

[**BotData**](BotData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

