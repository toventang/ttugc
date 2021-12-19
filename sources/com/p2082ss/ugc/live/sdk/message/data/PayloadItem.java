package com.p2082ss.ugc.live.sdk.message.data;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87078b;
import java.util.List;

/* renamed from: com.ss.ugc.live.sdk.message.data.PayloadItem */
public class PayloadItem {
    private String compressType;
    private List<C87078b> headers;
    private long logId;
    private byte[] payload;
    private String payloadEncoding;
    private String payloadType;
    private long seqId;
    private long serverTime;

    static {
        Covode.recordClassIndex(102856);
    }

    public String getCompressType() {
        return this.compressType;
    }

    public List<C87078b> getHeaders() {
        return this.headers;
    }

    public long getLogId() {
        return this.logId;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public String getPayloadEncoding() {
        return this.payloadEncoding;
    }

    public String getPayloadType() {
        return this.payloadType;
    }

    public long getSeqId() {
        return this.seqId;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public void setCompressType(String str) {
        this.compressType = str;
    }

    public void setHeaders(List<C87078b> list) {
        this.headers = list;
    }

    public void setLogId(long j) {
        this.logId = j;
    }

    public void setPayload(byte[] bArr) {
        this.payload = bArr;
    }

    public void setPayloadEncoding(String str) {
        this.payloadEncoding = str;
    }

    public void setPayloadType(String str) {
        this.payloadType = str;
    }

    public void setSeqId(long j) {
        this.seqId = j;
    }

    public void setServerTime(long j) {
        this.serverTime = j;
    }

    public PayloadItem(String str, byte[] bArr, String str2, long j, long j2) {
        this.payloadType = str;
        this.payload = bArr;
        this.compressType = str2;
        this.logId = j;
        this.serverTime = j2;
    }

    public PayloadItem(String str, String str2, byte[] bArr, List<C87078b> list, long j, long j2) {
        this.payloadType = str;
        this.payloadEncoding = str2;
        this.payload = bArr;
        this.headers = list;
        this.logId = j;
        this.seqId = j2;
    }

    public PayloadItem(String str, byte[] bArr, String str2, long j, long j2, List<C87078b> list) {
        this.payloadType = str;
        this.payload = bArr;
        this.compressType = str2;
        this.logId = j;
        this.serverTime = j2;
        this.headers = list;
    }
}
