# ConversationsApi

All URIs are relative to *https://api.botframework.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversationsCreateConversation**](ConversationsApi.md#conversationsCreateConversation) | **POST** v3/conversations | CreateConversation
[**conversationsDeleteActivity**](ConversationsApi.md#conversationsDeleteActivity) | **DELETE** v3/conversations/{conversationId}/activities/{activityId} | DeleteActivity
[**conversationsGetActivityMembers**](ConversationsApi.md#conversationsGetActivityMembers) | **GET** v3/conversations/{conversationId}/activities/{activityId}/members | GetActivityMembers
[**conversationsGetConversationMembers**](ConversationsApi.md#conversationsGetConversationMembers) | **GET** v3/conversations/{conversationId}/members | GetConversationMembers
[**conversationsReplyToActivity**](ConversationsApi.md#conversationsReplyToActivity) | **POST** v3/conversations/{conversationId}/activities/{activityId} | ReplyToActivity
[**conversationsSendToConversation**](ConversationsApi.md#conversationsSendToConversation) | **POST** v3/conversations/{conversationId}/activities | SendToConversation
[**conversationsUpdateActivity**](ConversationsApi.md#conversationsUpdateActivity) | **PUT** v3/conversations/{conversationId}/activities/{activityId} | UpdateActivity
[**conversationsUploadAttachment**](ConversationsApi.md#conversationsUploadAttachment) | **POST** v3/conversations/{conversationId}/attachments | UploadAttachment


<a name="conversationsCreateConversation"></a>
# **conversationsCreateConversation**
> ConversationResourceResponse conversationsCreateConversation(parameters)

CreateConversation

Create a new Conversation.    POST to this method with a  * Bot being the bot creating the conversation  * IsGroup set to true if this is not a direct message (default is false)  * Members array contining the members you want to have be in the conversation.    The return value is a ResourceResponse which contains a conversation id which is suitable for use  in the message payload and REST API uris.    Most channels only support the semantics of bots initiating a direct message conversation.  An example of how to do that would be:    &#x60;&#x60;&#x60;  var resource &#x3D; await connector.conversations.CreateConversation(new ConversationParameters(){ Bot &#x3D; bot, members &#x3D; new ChannelAccount[] { new ChannelAccount(\&quot;user1\&quot;) } );  await connect.Conversations.SendToConversationAsync(resource.Id, new Activity() ... ) ;    &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
ConversationParameters parameters = new ConversationParameters(); // ConversationParameters | Parameters to create the conversation from
try {
    ConversationResourceResponse result = apiInstance.conversationsCreateConversation(parameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationsCreateConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**ConversationParameters**](ConversationParameters.md)| Parameters to create the conversation from |

### Return type

[**ConversationResourceResponse**](ConversationResourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="conversationsDeleteActivity"></a>
# **conversationsDeleteActivity**
> Void conversationsDeleteActivity(conversationId, activityId)

DeleteActivity

Delete an existing activity.    Some channels allow you to delete an existing activity, and if successful this method will remove the specified activity.

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String activityId = "activityId_example"; // String | activityId to delete
try {
    Void result = apiInstance.conversationsDeleteActivity(conversationId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationsDeleteActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **activityId** | **String**| activityId to delete |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="conversationsGetActivityMembers"></a>
# **conversationsGetActivityMembers**
> List&lt;ChannelAccount&gt; conversationsGetActivityMembers(conversationId, activityId)

GetActivityMembers

Enumerate the members of an activity.     This REST API takes a ConversationId and a ActivityId, returning an array of ChannelAccount objects representing the members of the particular activity in the conversation.

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String activityId = "activityId_example"; // String | Activity ID
try {
    List<ChannelAccount> result = apiInstance.conversationsGetActivityMembers(conversationId, activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationsGetActivityMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **activityId** | **String**| Activity ID |

### Return type

[**List&lt;ChannelAccount&gt;**](ChannelAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="conversationsGetConversationMembers"></a>
# **conversationsGetConversationMembers**
> List&lt;ChannelAccount&gt; conversationsGetConversationMembers(conversationId)

GetConversationMembers

Enumerate the members of a converstion.     This REST API takes a ConversationId and returns an array of ChannelAccount objects representing the members of the conversation.

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
try {
    List<ChannelAccount> result = apiInstance.conversationsGetConversationMembers(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationsGetConversationMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |

### Return type

[**List&lt;ChannelAccount&gt;**](ChannelAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="conversationsReplyToActivity"></a>
# **conversationsReplyToActivity**
> ResourceResponse conversationsReplyToActivity(conversationId, activityId, activity)

ReplyToActivity

This method allows you to reply to an activity.    This is slightly different from SendToConversation().  * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.  * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.    Use ReplyToActivity when replying to a specific activity in the conversation.    Use SendToConversation in all other cases.

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String activityId = "activityId_example"; // String | activityId the reply is to (OPTIONAL)
Activity activity = new Activity(); // Activity | Activity to send
try {
    ResourceResponse result = apiInstance.conversationsReplyToActivity(conversationId, activityId, activity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationsReplyToActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **activityId** | **String**| activityId the reply is to (OPTIONAL) |
 **activity** | [**Activity**](Activity.md)| Activity to send |

### Return type

[**ResourceResponse**](ResourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="conversationsSendToConversation"></a>
# **conversationsSendToConversation**
> ResourceResponse conversationsSendToConversation(activity, conversationId)

SendToConversation

This method allows you to send an activity to the end of a conversation.    This is slightly different from ReplyToActivity().  * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.  * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.    Use ReplyToActivity when replying to a specific activity in the conversation.    Use SendToConversation in all other cases.

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
Activity activity = new Activity(); // Activity | Activity to send
String conversationId = "conversationId_example"; // String | Conversation ID
try {
    ResourceResponse result = apiInstance.conversationsSendToConversation(activity, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationsSendToConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activity** | [**Activity**](Activity.md)| Activity to send |
 **conversationId** | **String**| Conversation ID |

### Return type

[**ResourceResponse**](ResourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="conversationsUpdateActivity"></a>
# **conversationsUpdateActivity**
> ResourceResponse conversationsUpdateActivity(conversationId, activityId, activity)

UpdateActivity

Edit an existing activity.    Some channels allow you to edit an existing activity to reflect the new state of a bot conversation.    For example, you can remove buttons after someone has clicked \&quot;Approve\&quot; button.

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String activityId = "activityId_example"; // String | activityId to update
Activity activity = new Activity(); // Activity | replacement Activity
try {
    ResourceResponse result = apiInstance.conversationsUpdateActivity(conversationId, activityId, activity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationsUpdateActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **activityId** | **String**| activityId to update |
 **activity** | [**Activity**](Activity.md)| replacement Activity |

### Return type

[**ResourceResponse**](ResourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="conversationsUploadAttachment"></a>
# **conversationsUploadAttachment**
> ResourceResponse conversationsUploadAttachment(conversationId, attachmentUpload)

UploadAttachment

Upload an attachment directly into a channel&#39;s blob storage.    This is useful because it allows you to store data in a compliant store when dealing with enterprises.    The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments API.

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.ConversationsApi;


ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
AttachmentData attachmentUpload = new AttachmentData(); // AttachmentData | Attachment data
try {
    ResourceResponse result = apiInstance.conversationsUploadAttachment(conversationId, attachmentUpload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#conversationsUploadAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**| Conversation ID |
 **attachmentUpload** | [**AttachmentData**](AttachmentData.md)| Attachment data |

### Return type

[**ResourceResponse**](ResourceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

