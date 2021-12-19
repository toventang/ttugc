package com.bytedance.assem.arch.extensions;

import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p796c.ExecutorC12736a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import java.util.concurrent.Executor;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.extensions.j */
public final class C12787j {

    /* renamed from: a */
    public static boolean f31107a = true;

    /* renamed from: b */
    public static AbstractC12789k f31108b;

    /* renamed from: c */
    public static boolean f31109c;

    /* renamed from: d */
    public static boolean f31110d;

    /* renamed from: e */
    public static AbstractC89277c<? extends AbstractC12693u<? extends AbstractC22876d>> f31111e;

    /* renamed from: f */
    public static Executor f31112f;

    /* renamed from: g */
    public static final C12787j f31113g = new C12787j();

    /* renamed from: h */
    private static final AbstractC89244h f31114h = C89250i.m154773a((AbstractC89171a) C12788a.f31115a);

    private C12787j() {
    }

    /* renamed from: com.bytedance.assem.arch.extensions.j$a */
    static final class C12788a extends AbstractC89220m implements AbstractC89171a<ExecutorC12736a> {

        /* renamed from: a */
        public static final C12788a f31115a = new C12788a();

        static {
            Covode.recordClassIndex(14616);
        }

        C12788a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorC12736a invoke() {
            return new ExecutorC12736a();
        }
    }

    /* renamed from: a */
    public static Executor m23009a() {
        Executor executor = f31112f;
        if (executor == null) {
            return (Executor) f31114h.getValue();
        }
        return executor;
    }

    static {
        Covode.recordClassIndex(14615);
    }
}
