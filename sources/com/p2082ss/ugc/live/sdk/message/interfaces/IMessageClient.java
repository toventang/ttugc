package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.data.JsonApiResult;
import com.p2082ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87085g;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageClient */
public interface IMessageClient extends AbstractC87085g {

    /* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageClient$Callback */
    public interface Callback {
        static {
            Covode.recordClassIndex(102862);
        }

        void onApiError(Exception exc);

        void onApiSuccess(JsonApiResult jsonApiResult);

        void onApiSuccess(ProtoApiResult protoApiResult);

        void onWebSocketMessage(IMessage iMessage);
    }

    static {
        Covode.recordClassIndex(102861);
    }

    void apiCall(Map<String, String> map);

    void connectToWebSocket();

    void disconnectFromWebSocket();

    long getUserId();

    void onRelease();

    void setCallback(Callback callback);
}
