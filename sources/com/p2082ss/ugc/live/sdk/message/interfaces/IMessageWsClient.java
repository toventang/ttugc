package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.JsonApiResult;
import com.p2082ss.ugc.live.sdk.message.data.PayloadItem;
import com.p2082ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient */
public interface IMessageWsClient {

    /* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient$Callback */
    public interface Callback {
        static {
            Covode.recordClassIndex(102867);
        }

        void onApiError(Exception exc, int i);

        void onApiSuccess(JsonApiResult jsonApiResult);

        void onApiSuccess(ProtoApiResult protoApiResult, int i);

        void onDetermineMessageStrategy(ProtoApiResult protoApiResult);

        void onHostWebSocketMessage(PayloadItem payloadItem);

        void onHostWebSocketPayloadDecoded(ProtoApiResult protoApiResult);

        void onWebSocketConnected();

        void onWebSocketDisconnected();

        void onWebSocketMessage(PayloadItem payloadItem);

        void onWebSocketPayloadDecoded(ProtoApiResult protoApiResult);
    }

    static {
        Covode.recordClassIndex(102866);
    }

    void apiCall(Map<String, String> map, boolean z);

    void connectToWebSocket(Map<String, String> map, String str);

    void decodeHostWebSocketPayload(PayloadItem payloadItem);

    void decodeWebSocketPayload(PayloadItem payloadItem);

    void determineMessageStrategy(Map<String, String> map);

    void disconnectFromWebSocket(String str);

    long getUserId();

    boolean isWsConnected();

    void onRelease();

    void onStartMessage();

    void onStopMessage();

    void sendUplinkPacket(PayloadItem payloadItem);

    void sendWebSocketMessage(String str, String str2, byte[] bArr, long j, long j2);

    void setCallback(Callback callback);

    void setWebSocketServerTimeGap(long j);
}
