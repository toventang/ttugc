package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14617b;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTExternRequestInfo */
public class TTExternRequestInfo {
    private byte[] data;
    private C14617b extraInfo;
    private String method;
    private JSONObject requestHeader;
    private String url;

    static {
        Covode.recordClassIndex(101471);
    }

    public TTExternRequestInfo() {
    }

    public byte[] getData() {
        return this.data;
    }

    public C14617b getExtraInfo() {
        return this.extraInfo;
    }

    public String getMethod() {
        return this.method;
    }

    public JSONObject getRequestHeader() {
        return this.requestHeader;
    }

    public String getUrl() {
        return this.url;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setExtraInfo(C14617b bVar) {
        this.extraInfo = bVar;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRequestHeader(JSONObject jSONObject) {
        this.requestHeader = jSONObject;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public TTExternRequestInfo(String str, String str2, JSONObject jSONObject, byte[] bArr, C14617b bVar) {
        this.url = str;
        this.method = str2;
        this.data = bArr;
        this.requestHeader = jSONObject;
        this.extraInfo = bVar;
    }
}
