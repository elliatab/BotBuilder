package com.microsoft.bot.connector.connectorapi;

import com.microsoft.bot.connector.ApiClient;
import java.io.File;
import com.microsoft.bot.connector.connectorapi.model.ErrorResponse;
import com.microsoft.bot.connector.connectorapi.model.AttachmentInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttachmentsApi
 */
public class AttachmentsApiTest {

    private AttachmentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AttachmentsApi.class);
    }

    
    /**
     * GetAttachment
     *
     * Get the named view as binary content
     */
    @Test
    public void attachmentsGetAttachmentTest() {
        String attachmentId = null;
        String viewId = null;
        // File response = api.attachmentsGetAttachment(attachmentId, viewId);

        // TODO: test validations
    }
    
    /**
     * GetAttachmentInfo
     *
     * Get AttachmentInfo structure describing the attachment views
     */
    @Test
    public void attachmentsGetAttachmentInfoTest() {
        String attachmentId = null;
        // AttachmentInfo response = api.attachmentsGetAttachmentInfo(attachmentId);

        // TODO: test validations
    }
    
}
