package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.RemoteStreamKey */
public class RemoteStreamKey {
    private String roomId;
    private StreamIndex streamIndex;
    private String userId;

    static {
        Covode.recordClassIndex(100987);
    }

    public String getRoomId() {
        return this.roomId;
    }

    public StreamIndex getStreamIndex() {
        return this.streamIndex;
    }

    public String getUserId() {
        return this.userId;
    }

    public String toString() {
        return "RemoteStreamKey{roomId='" + this.roomId + '\'' + ", userId='" + this.userId + '\'' + ", streamIndex=" + this.streamIndex + '}';
    }

    RemoteStreamKey(String str, String str2, StreamIndex streamIndex2) {
        this.roomId = str;
        this.userId = str2;
        this.streamIndex = streamIndex2;
    }
}
