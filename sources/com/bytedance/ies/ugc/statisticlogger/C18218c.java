package com.bytedance.ies.ugc.statisticlogger;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.c */
public final class C18218c {

    /* renamed from: a */
    public final EnumC18227d f43402a;

    /* renamed from: b */
    public final long f43403b;

    /* renamed from: c */
    public final String f43404c;

    /* renamed from: d */
    public final JSONObject f43405d;

    static {
        Covode.recordClassIndex(20875);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18218c)) {
            return false;
        }
        C18218c cVar = (C18218c) obj;
        return C89219l.m154714a(this.f43402a, cVar.f43402a) && this.f43403b == cVar.f43403b && C89219l.m154714a(this.f43404c, cVar.f43404c) && C89219l.m154714a(this.f43405d, cVar.f43405d);
    }

    public final String toString() {
        return "SessionChangeEvent(type=" + this.f43402a + ", sessionId=" + this.f43403b + ", session=" + this.f43404c + ", app_log=" + this.f43405d + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        EnumC18227d dVar = this.f43402a;
        int i3 = 0;
        if (dVar != null) {
            i = dVar.hashCode();
        } else {
            i = 0;
        }
        long j = this.f43403b;
        int i4 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f43404c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        JSONObject jSONObject = this.f43405d;
        if (jSONObject != null) {
            i3 = jSONObject.hashCode();
        }
        return i5 + i3;
    }

    public /* synthetic */ C18218c(EnumC18227d dVar, long j) {
        this(dVar, j, "", null);
    }

    public C18218c(EnumC18227d dVar, long j, String str, JSONObject jSONObject) {
        C89219l.m154721d(dVar, "");
        this.f43402a = dVar;
        this.f43403b = j;
        this.f43404c = str;
        this.f43405d = jSONObject;
    }
}
