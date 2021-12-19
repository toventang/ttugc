package com.bytedance.lynx.p1507a.p1508a.p1514f;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.a.a.f.b */
public final class C21144b {

    /* renamed from: a */
    public static final C21144b f50170a = new C21144b();

    private C21144b() {
    }

    static {
        Covode.recordClassIndex(24760);
    }

    /* renamed from: a */
    public static final int m39808a() {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return system.getDisplayMetrics().heightPixels;
    }

    /* renamed from: b */
    public static final int m39810b() {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return system.getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    public static final int m39809a(float f) {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        return (int) ((f * system.getDisplayMetrics().density) + 0.5f);
    }
}
