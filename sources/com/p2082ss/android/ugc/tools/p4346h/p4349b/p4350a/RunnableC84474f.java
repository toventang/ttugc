package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84445d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84446e;
import java.util.concurrent.Future;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.tools.h.b.a.f */
public final class RunnableC84474f<KEY, RESULT> implements Comparable<Object>, Runnable {

    /* renamed from: a */
    public final C88958b<C84445d<KEY, RESULT>> f188821a;

    /* renamed from: b */
    public final KEY f188822b;

    /* renamed from: c */
    public final int f188823c;

    /* renamed from: d */
    public volatile boolean f188824d;

    /* renamed from: e */
    public volatile Future<?> f188825e;

    /* renamed from: f */
    private final AbstractC88430c<KEY, AbstractC89172b<Integer, C89391z>, RESULT> f188826f;

    static {
        Covode.recordClassIndex(98439);
    }

    public final void run() {
        this.f188821a.onNext(new C84445d<>(EnumC84446e.START, this.f188822b, null, null));
        try {
            this.f188821a.onNext(new C84445d<>(EnumC84446e.SUCCESS, this.f188822b, this.f188826f.mo9210a(this.f188822b, new C84475a(this)), null));
        } catch (Exception e) {
            this.f188821a.onNext(new C84445d<>(EnumC84446e.FAILED, this.f188822b, null, e));
        } catch (Throwable th) {
            this.f188821a.onComplete();
            throw th;
        }
        this.f188821a.onComplete();
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.a.f$a */
    static final class C84475a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RunnableC84474f f188827a;

        static {
            Covode.recordClassIndex(98440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84475a(RunnableC84474f fVar) {
            super(1);
            this.f188827a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f188827a.f188821a.onNext(new C84445d<>(EnumC84446e.START, this.f188827a.f188822b, null, null, Integer.valueOf(num.intValue())));
            return C89391z.f203057a;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C89219l.m154721d(obj, "");
        if (!(obj instanceof RunnableC84474f)) {
            return 0;
        }
        boolean z = this.f188824d;
        RunnableC84474f fVar = (RunnableC84474f) obj;
        boolean z2 = fVar.f188824d;
        int i = this.f188823c;
        int i2 = fVar.f188823c;
        if (z == z2) {
            return C89219l.m154703a(i, i2);
        }
        if (z) {
            return -1;
        }
        return 1;
    }

    private RunnableC84474f(KEY key, int i, AbstractC88430c<KEY, AbstractC89172b<Integer, C89391z>, RESULT> cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        this.f188822b = key;
        this.f188823c = i;
        this.f188826f = cVar;
        this.f188824d = z;
        this.f188825e = null;
        C88958b<C84445d<KEY, RESULT>> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f188821a = bVar;
    }

    public /* synthetic */ RunnableC84474f(Object obj, int i, AbstractC88430c cVar, boolean z, byte b) {
        this(obj, i, cVar, z);
    }
}
