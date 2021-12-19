package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a */
public final class C45706a {

    /* renamed from: a */
    public static final C45707a f106443a = new C45707a((byte) 0);

    /* renamed from: b */
    private long f106444b;

    /* renamed from: c */
    private long f106445c;

    /* renamed from: d */
    private int f106446d;

    static {
        Covode.recordClassIndex(54223);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a$a */
    public static final class C45707a {
        static {
            Covode.recordClassIndex(54224);
        }

        private C45707a() {
        }

        public /* synthetic */ C45707a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a$b */
    static final class C45708b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C45708b f106447a = new C45708b();

        static {
            Covode.recordClassIndex(54225);
        }

        C45708b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final boolean mo76996a() {
        if (this.f106446d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final long mo76998c() {
        return this.f106445c - SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final boolean mo76997b() {
        if (this.f106446d == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo76995a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f106444b;
        if (elapsedRealtime >= j) {
            long j2 = this.f106445c;
            if (j <= elapsedRealtime && j2 > elapsedRealtime) {
                if (this.f106446d != 2) {
                    this.f106446d = 2;
                    aVar.invoke();
                }
            } else if (elapsedRealtime >= j2 && this.f106446d != 3) {
                this.f106446d = 3;
                aVar.invoke();
            }
        } else if (this.f106446d != 1) {
            this.f106446d = 1;
            aVar.invoke();
        }
    }

    public C45706a(long j, long j2, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f106444b = (j2 - j) + elapsedRealtime;
        this.f106445c = (j3 - j) + elapsedRealtime;
        mo76995a(C45708b.f106447a);
    }
}
