package com.microsoft.bot.connector.connectorapi;

import com.microsoft.bot.connector.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import java.io.File;
import com.microsoft.bot.connector.connectorapi.model.ErrorResponse;
import com.microsoft.bot.connector.connectorapi.model.AttachmentInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AttachmentsApi {
  /**
   * GetAttachment
   * Get the named view as binary content
   * @param attachmentId attachment id (required)
   * @param viewId View id from attachmentInfo (required)
   * @return Call&lt;File&gt;
   */
  
  @GET("v3/attachments/{attachmentId}/views/{viewId}")
  Call<File> attachmentsGetAttachment(
    @Path("attachmentId") String attachmentId, @Path("viewId") String viewId
  );

  /**
   * GetAttachmentInfo
   * Get AttachmentInfo structure describing the attachment views
   * @param attachmentId attachment id (required)
   * @return Call&lt;AttachmentInfo&gt;
   */
  
  @GET("v3/attachments/{attachmentId}")
  Call<AttachmentInfo> attachmentsGetAttachmentInfo(
    @Path("attachmentId") String attachmentId
  );

}
