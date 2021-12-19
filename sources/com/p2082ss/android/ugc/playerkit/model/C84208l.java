package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.playerkit.model.l */
public class C84208l {

    /* renamed from: a */
    public String f188032a;

    /* renamed from: b */
    public boolean f188033b;

    /* renamed from: c */
    public boolean f188034c;

    /* renamed from: d */
    public int f188035d;

    /* renamed from: e */
    public int f188036e;

    /* renamed from: f */
    public Object f188037f;

    /* renamed from: g */
    public boolean f188038g;

    /* renamed from: h */
    public String f188039h;

    static {
        Covode.recordClassIndex(98115);
    }

    public String toString() {
        return "MediaError{sourceId='" + this.f188032a + '\'' + ", bytevc1=" + this.f188033b + ", isDash=" + this.f188034c + ", errorCode=" + this.f188035d + ", errorExtra=" + this.f188036e + ", extraInfo=" + this.f188037f + ", playUrl='" + this.f188039h + '\'' + '}';
    }

    public C84208l(String str, boolean z, int i, int i2, Object obj) {
        this.f188032a = str;
        this.f188033b = z;
        this.f188035d = i;
        this.f188036e = i2;
        this.f188037f = obj;
    }
}
