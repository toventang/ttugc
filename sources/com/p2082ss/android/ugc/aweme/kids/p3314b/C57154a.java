package com.p2082ss.android.ugc.aweme.kids.p3314b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.b.a */
public final class C57154a extends Exception {

    /* renamed from: a */
    private int f130114a;

    /* renamed from: b */
    private String f130115b;

    /* renamed from: c */
    private String f130116c;

    static {
        Covode.recordClassIndex(67054);
    }

    public C57154a() {
    }

    public final int getErrorCode() {
        return this.f130114a;
    }

    public final String getErrorMsg() {
        return this.f130115b;
    }

    public final String getErrorUrl() {
        return this.f130116c;
    }

    public final void setErrorCode(int i) {
        this.f130114a = i;
    }

    public final void setErrorMsg(String str) {
        this.f130115b = str;
    }

    public final void setErrorUrl(String str) {
        this.f130116c = str;
    }

    public C57154a(int i, String str) {
        super(str);
        this.f130114a = i;
        this.f130115b = str;
    }

    public C57154a(int i, String str, String str2) {
        super(str);
        this.f130114a = i;
        this.f130115b = str;
        this.f130116c = str2;
    }
}
