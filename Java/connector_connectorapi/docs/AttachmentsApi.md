# AttachmentsApi

All URIs are relative to *https://api.botframework.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentsGetAttachment**](AttachmentsApi.md#attachmentsGetAttachment) | **GET** v3/attachments/{attachmentId}/views/{viewId} | GetAttachment
[**attachmentsGetAttachmentInfo**](AttachmentsApi.md#attachmentsGetAttachmentInfo) | **GET** v3/attachments/{attachmentId} | GetAttachmentInfo


<a name="attachmentsGetAttachment"></a>
# **attachmentsGetAttachment**
> File attachmentsGetAttachment(attachmentId, viewId)

GetAttachment

Get the named view as binary content

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.AttachmentsApi;


AttachmentsApi apiInstance = new AttachmentsApi();
String attachmentId = "attachmentId_example"; // String | attachment id
String viewId = "viewId_example"; // String | View id from attachmentInfo
try {
    File result = apiInstance.attachmentsGetAttachment(attachmentId, viewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#attachmentsGetAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| attachment id |
 **viewId** | **String**| View id from attachmentInfo |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="attachmentsGetAttachmentInfo"></a>
# **attachmentsGetAttachmentInfo**
> AttachmentInfo attachmentsGetAttachmentInfo(attachmentId)

GetAttachmentInfo

Get AttachmentInfo structure describing the attachment views

### Example
```java
// Import classes:
//import com.microsoft.bot.connector.ApiException;
//import com.microsoft.bot.connector.connectorapi.AttachmentsApi;


AttachmentsApi apiInstance = new AttachmentsApi();
String attachmentId = "attachmentId_example"; // String | attachment id
try {
    AttachmentInfo result = apiInstance.attachmentsGetAttachmentInfo(attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#attachmentsGetAttachmentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| attachment id |

### Return type

[**AttachmentInfo**](AttachmentInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

