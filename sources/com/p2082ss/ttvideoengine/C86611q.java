package com.p2082ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.q */
public final class C86611q {

    /* renamed from: a */
    public String f195148a;

    /* renamed from: b */
    public String f195149b;

    /* renamed from: c */
    public String f195150c;

    /* renamed from: d */
    public String f195151d = "";

    /* renamed from: e */
    public String f195152e = "";

    /* renamed from: f */
    public long f195153f;

    /* renamed from: g */
    public int f195154g;

    /* renamed from: h */
    public String[] f195155h;

    /* renamed from: i */
    public AbstractC86424f f195156i;

    /* renamed from: j */
    public AbstractC86509j f195157j;

    /* renamed from: k */
    public HashMap<String, String> f195158k;

    static {
        Covode.recordClassIndex(101839);
    }

    public C86611q(String str, String str2, long j, String[] strArr) {
        this.f195148a = str;
        this.f195150c = str2;
        this.f195153f = j;
        this.f195155h = strArr;
    }

    public C86611q(String str, String str2, long j, AbstractC86424f fVar, String str3) {
        this.f195156i = fVar;
        this.f195150c = str2;
        this.f195153f = j;
        this.f195148a = str;
        this.f195149b = str3;
    }

    public C86611q(String str, String str2, long j, String[] strArr, String str3) {
        this.f195148a = str;
        this.f195150c = str2;
        this.f195153f = j;
        this.f195155h = strArr;
        this.f195149b = str3;
    }
}
