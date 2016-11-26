
# Activity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the activity [message|contactRelationUpdate|converationUpdate|typing] |  [optional]
**id** | **String** | Id for the activity |  [optional]
**timestamp** | [**DateTime**](DateTime.md) | UTC Time when message was sent (Set by service) |  [optional]
**localTimestamp** | [**DateTime**](DateTime.md) | Local time when message was sent (set by client Ex: 2016-09-23T13:07:49.4714686-07:00) |  [optional]
**serviceUrl** | **String** | Service endpoint |  [optional]
**channelId** | **String** | ChannelId the activity was on |  [optional]
**from** | [**ChannelAccount**](ChannelAccount.md) | Sender address |  [optional]
**conversation** | [**ConversationAccount**](ConversationAccount.md) | Conversation |  [optional]
**recipient** | [**ChannelAccount**](ChannelAccount.md) | (Outbound to bot only) Bot&#39;s address that received the message |  [optional]
**textFormat** | **String** | Format of text fields [plain|markdown] Default:markdown |  [optional]
**attachmentLayout** | **String** | AttachmentLayout - hint for how to deal with multiple attachments Values: [list|carousel] Default:list |  [optional]
**membersAdded** | [**List&lt;ChannelAccount&gt;**](ChannelAccount.md) | Array of address added |  [optional]
**membersRemoved** | [**List&lt;ChannelAccount&gt;**](ChannelAccount.md) | Array of addresses removed |  [optional]
**topicName** | **String** | Conversations new topic name |  [optional]
**historyDisclosed** | **Boolean** | the previous history of the channel was disclosed |  [optional]
**locale** | **String** | The language code of the Text field |  [optional]
**text** | **String** | Content for the message |  [optional]
**summary** | **String** | Text to display if you can&#39;t render cards |  [optional]
**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Attachments |  [optional]
**entities** | [**List&lt;Entity&gt;**](Entity.md) | Collection of Entity objects, each of which contains metadata about this activity. Each Entity object is typed. |  [optional]
**channelData** | **Object** | Channel specific payload |  [optional]
**action** | **String** | ContactAdded/Removed action |  [optional]
**replyToId** | **String** | the original id this message is a response to |  [optional]
**value** | **Object** | Open ended value |  [optional]



