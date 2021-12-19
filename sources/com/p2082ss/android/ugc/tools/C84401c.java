package com.p2082ss.android.ugc.tools;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.tools.p4344f.AbstractC84429c;
import com.p2082ss.android.ugc.tools.p4344f.C84424a;
import com.p2082ss.android.ugc.tools.p4345g.AbstractC84433b;
import com.p2082ss.android.ugc.tools.p4345g.C84432a;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import com.p2082ss.android.ugc.tools.utils.C84895g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.c */
public final class C84401c {

    /* renamed from: a */
    public static Application f188717a;

    /* renamed from: b */
    public static boolean f188718b;

    /* renamed from: c */
    public static C27910f f188719c;

    /* renamed from: d */
    public static AbstractC84429c f188720d = new C84424a();

    /* renamed from: e */
    public static AbstractC84433b f188721e = new C84432a();

    /* renamed from: f */
    public static AbstractC84903j f188722f = C84895g.f189730a;

    /* renamed from: g */
    public static final C84401c f188723g = new C84401c();

    private C84401c() {
    }

    /* renamed from: a */
    public static final Application m145164a() {
        Application application = f188717a;
        if (application == null) {
            C89219l.m154710a("backendContext");
        }
        return application;
    }

    static {
        Covode.recordClassIndex(98366);
        C27910f b = new C27917g().mo46682b();
        C89219l.m154716b(b, "");
        f188719c = b;
    }
}
