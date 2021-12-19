package com.p2082ss.android.ugc.musicprovider;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.musicprovider.a */
public final class C84125a extends Exception {

    /* renamed from: a */
    private int f187733a;

    /* renamed from: b */
    private String f187734b;

    /* renamed from: c */
    private String f187735c;

    static {
        Covode.recordClassIndex(98024);
    }

    public C84125a() {
    }

    public final int getErrorCode() {
        return this.f187733a;
    }

    public final String getErrorMsg() {
        return this.f187734b;
    }

    public final String getErrorUrl() {
        return this.f187735c;
    }

    public final void setErrorCode(int i) {
        this.f187733a = i;
    }

    public final void setErrorMsg(String str) {
        this.f187734b = str;
    }

    public final void setErrorUrl(String str) {
        this.f187735c = str;
    }

    public C84125a(int i, String str) {
        super(str);
        this.f187733a = i;
        this.f187734b = str;
    }

    public C84125a(int i, String str, String str2) {
        super(str);
        this.f187733a = i;
        this.f187734b = str;
        this.f187735c = str2;
    }
}
