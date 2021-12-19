package com.bytedance.common.p894a.p896b;

import android.app.Application;
import android.content.Context;
import com.bytedance.common.p894a.C13477a;
import com.bytedance.common.p894a.p898d.C13496c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.common.a.b.a */
public final class C13483a {

    /* renamed from: a */
    public static boolean f32829a;

    /* renamed from: b */
    public static Executor f32830b = Executors.newCachedThreadPool();

    /* renamed from: c */
    private static boolean f32831c;

    static {
        Covode.recordClassIndex(15491);
    }

    /* renamed from: a */
    public static C13485a m24247a() {
        return new C13485a(C13477a.m24233a());
    }

    /* renamed from: com.bytedance.common.a.b.a$a */
    public static class C13485a {

        /* renamed from: a */
        public String f32833a = "none";

        /* renamed from: b */
        public String f32834b = "0";

        /* renamed from: c */
        public boolean f32835c;

        /* renamed from: d */
        final Context f32836d;

        /* renamed from: e */
        public boolean f32837e;

        /* renamed from: f */
        public boolean f32838f;

        /* renamed from: g */
        public final List<String> f32839g = new ArrayList();

        /* renamed from: h */
        private boolean f32840h;

        /* renamed from: i */
        private String f32841i;

        /* renamed from: j */
        private boolean f32842j;

        static {
            Covode.recordClassIndex(15493);
        }

        /* renamed from: a */
        public final C13488d mo21758a() {
            C13488d dVar = new C13488d(this.f32836d);
            dVar.f32860q = this.f32835c;
            dVar.f32861r = this.f32840h;
            dVar.f32862s = this.f32841i;
            dVar.f32863t = this.f32837e;
            dVar.f32857n = this.f32833a;
            dVar.f32858o = this.f32834b;
            dVar.f32866w = this.f32839g;
            dVar.f32864u = this.f32842j;
            dVar.f32865v = this.f32838f;
            return dVar;
        }

        C13485a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f32836d = applicationContext;
        }
    }

    /* renamed from: a */
    public static void m24248a(Context context, final boolean z) {
        C134841 r1 = new C13486b() {
            /* class com.bytedance.common.p894a.p896b.C13483a.C134841 */

            static {
                Covode.recordClassIndex(15492);
            }

            @Override // com.bytedance.common.p894a.p896b.C13486b
            /* renamed from: a */
            public final boolean mo21757a() {
                return z;
            }
        };
        if (!f32831c) {
            if (C13477a.f32819a == null) {
                if (!(context instanceof Application)) {
                    context = context.getApplicationContext();
                    if (C58003a.f132201c && context == null) {
                        context = C58003a.f132199a;
                    }
                }
                C13477a.f32819a = context;
            }
            f32831c = true;
            boolean a = r1.mo21757a();
            f32829a = a;
            C13496c.f32874a = a;
        }
    }
}
