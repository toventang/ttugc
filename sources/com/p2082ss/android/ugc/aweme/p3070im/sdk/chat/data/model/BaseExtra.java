package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseExtra */
public class BaseExtra implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")
    int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    StatusMessage statusMsg;

    static {
        Covode.recordClassIndex(63420);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseExtra$MessageContent */
    public static class MessageContent {
        @AbstractC27891c(mo46611a = "template")
        SystemContent.Key[] template;
        @AbstractC27891c(mo46611a = "tips")
        String tips;

        static {
            Covode.recordClassIndex(63421);
        }

        public SystemContent.Key[] getTemplate() {
            return this.template;
        }

        public String getTips() {
            return this.tips;
        }

        public void setTemplate(SystemContent.Key[] keyArr) {
            this.template = keyArr;
        }

        public void setTips(String str) {
            this.tips = str;
        }

        public static SystemContent toSystemContent(MessageContent messageContent) {
            SystemContent systemContent = new SystemContent();
            systemContent.setType(100);
            systemContent.tips = messageContent.tips;
            systemContent.template = messageContent.template;
            return systemContent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseExtra$StatusMessage */
    public static class StatusMessage {
        @AbstractC27891c(mo46611a = "msg_content")
        MessageContent msgContent;
        @AbstractC27891c(mo46611a = "msg_type")
        int msgType;

        static {
            Covode.recordClassIndex(63422);
        }

        public MessageContent getMsgContent() {
            return this.msgContent;
        }

        public int getMsgType() {
            return this.msgType;
        }

        public void setMsgContent(MessageContent messageContent) {
            this.msgContent = messageContent;
        }

        public void setMsgType(int i) {
            this.msgType = i;
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public StatusMessage getStatusMsg() {
        return this.statusMsg;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(StatusMessage statusMessage) {
        this.statusMsg = statusMessage;
    }
}
