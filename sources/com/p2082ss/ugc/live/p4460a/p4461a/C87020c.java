package com.p2082ss.ugc.live.p4460a.p4461a;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.ss.ugc.live.a.a.c */
public class C87020c {

    /* renamed from: a */
    public final String f196189a;

    /* renamed from: b */
    public final long f196190b;

    /* renamed from: c */
    public final String[] f196191c;

    /* renamed from: d */
    public long f196192d;

    /* renamed from: e */
    public String f196193e;

    /* renamed from: f */
    public boolean f196194f;

    /* renamed from: g */
    public boolean f196195g;

    /* renamed from: h */
    public int f196196h = -1;

    static {
        Covode.recordClassIndex(102786);
    }

    /* renamed from: b */
    public final void mo140631b() {
        this.f196196h++;
    }

    /* renamed from: a */
    public final String mo140630a() {
        return this.f196191c[Math.min(this.f196196h, this.f196191c.length - 1)];
    }

    public String toString() {
        return "GetResourceRequest{mId='" + this.f196189a + "', mResourceId=" + this.f196190b + ", mUrls='" + Arrays.toString(this.f196191c) + "', mMd5='" + this.f196193e + "', mSourceFrom='" + this.f196192d + "', mNeedToUnzip=" + this.f196194f + '}';
    }

    public C87020c(long j, String[] strArr, String str) {
        this.f196189a = String.valueOf(j);
        this.f196190b = j;
        this.f196191c = strArr;
        this.f196193e = str;
        this.f196192d = 0;
        this.f196194f = true;
    }

    public C87020c(String str, long j, String[] strArr, String str2, long j2) {
        this.f196189a = str;
        this.f196190b = j;
        this.f196191c = strArr;
        this.f196193e = str2;
        this.f196192d = j2;
        this.f196194f = true;
    }
}
