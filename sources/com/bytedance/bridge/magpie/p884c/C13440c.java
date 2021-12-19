package com.bytedance.bridge.magpie.p884c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.bridge.magpie.c.c */
public final class C13440c {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f32766a = {new C89232y(C89204ab.m154669a(C13440c.class), "mainHandler", "getMainHandler()Landroid/os/Handler;")};

    /* renamed from: b */
    static ExecutorService f32767b;

    /* renamed from: c */
    static final AbstractC89244h f32768c = C89250i.m154773a((AbstractC89171a) C13441a.f32770a);

    /* renamed from: d */
    public static final C13440c f32769d = new C13440c();

    private C13440c() {
    }

    /* renamed from: com.bytedance.bridge.magpie.c.c$a */
    static final class C13441a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C13441a f32770a = new C13441a();

        static {
            Covode.recordClassIndex(15441);
        }

        C13441a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(15440);
    }
}
