package com.p2082ss.bduploader.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.net.Error */
public class Error {
    int code;
    public String errStr;
    public String host;

    /* renamed from: id */
    public String f192012id;

    static {
        Covode.recordClassIndex(100831);
    }

    public Error(int i, String str, String str2) {
        this.code = i;
        this.host = str;
        this.f192012id = str2;
    }

    public Error(int i, String str, String str2, String str3) {
        this.code = i;
        this.host = str;
        this.f192012id = str2;
        this.errStr = str3;
    }
}
