package com.bytedance.lynx.hybrid.p1515a;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1522h.C21198c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.a.a */
public class C21147a extends C21198c {

    /* renamed from: a */
    private final String f50176a;

    /* renamed from: b */
    private final String f50177b;

    /* renamed from: c */
    private final String f50178c;

    /* renamed from: d */
    private final String f50179d;

    /* renamed from: e */
    private final boolean f50180e;

    static {
        Covode.recordClassIndex(24763);
    }

    public final String getAppId() {
        return this.f50177b;
    }

    public final String getAppVersion() {
        return this.f50178c;
    }

    public final String getDid() {
        return this.f50179d;
    }

    public final String getRegion() {
        return this.f50176a;
    }

    public final boolean isDebug() {
        return this.f50180e;
    }

    public C21147a(String str, String str2, String str3, String str4, boolean z) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str4, "");
        this.f50176a = str;
        this.f50177b = str2;
        this.f50178c = str3;
        this.f50179d = str4;
        this.f50180e = z;
    }
}
