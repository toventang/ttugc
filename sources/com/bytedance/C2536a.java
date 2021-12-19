package com.bytedance;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.a */
public final class C2536a<T> extends C2563k<T> {

    /* renamed from: a */
    private final C88960c<T> f7670a;

    /* renamed from: b */
    private T f7671b;

    /* renamed from: c */
    private final AbstractC89244h f7672c = C89250i.m154773a((AbstractC89171a) C2537a.f7673a);

    static {
        Covode.recordClassIndex(2915);
    }

    @Override // com.bytedance.als.C2559g
    /* renamed from: a */
    public final T mo6996a() {
        return this.f7671b;
    }

    /* renamed from: com.bytedance.a$c */
    static final class RunnableC2539c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2536a f7675a;

        /* renamed from: b */
        final /* synthetic */ Object f7676b;

        static {
            Covode.recordClassIndex(2918);
        }

        RunnableC2539c(C2536a aVar, Object obj) {
            this.f7675a = aVar;
            this.f7676b = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.a */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            this.f7675a.mo6999a(this.f7676b);
        }
    }

    /* renamed from: com.bytedance.a$a */
    static final class C2537a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C2537a f7673a = new C2537a();

        static {
            Covode.recordClassIndex(2916);
        }

        C2537a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public C2536a() {
        C88960c<T> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f7670a = cVar;
    }

    /* renamed from: com.bytedance.a$b */
    static final class C2538b<T> implements AbstractC88433f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC2565m f7674a;

        static {
            Covode.recordClassIndex(2917);
        }

        C2538b(AbstractC2565m mVar) {
            this.f7674a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(T t) {
            this.f7674a.onChanged(t);
        }
    }

    @Override // com.bytedance.als.C2559g, com.bytedance.als.C2563k
    /* renamed from: a */
    public final void mo6999a(T t) {
        this.f7671b = t;
        this.f7670a.onNext(t);
    }

    @Override // com.bytedance.als.C2559g
    /* renamed from: a */
    public final void mo6998a(AbstractC2565m<T> mVar) {
        C89219l.m154721d(mVar, "");
        throw new RuntimeException("user  lifecycleOwner instead");
    }

    @Override // com.bytedance.als.C2559g, com.bytedance.als.C2563k
    /* renamed from: b */
    public final void mo7000b(T t) {
        ((Handler) this.f7672c.getValue()).post(new RunnableC2539c(this, t));
    }

    @Override // com.bytedance.als.C2559g
    /* renamed from: a */
    public final void mo6997a(AbstractC1204m mVar, AbstractC2565m<T> mVar2) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar2, "");
        AbstractC1196i lifecycle = mVar.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            mVar.getLifecycle().mo4012a(new RxLiveEvent$observe$1(this.f7670a.mo143289d(new C2538b(mVar2))));
        }
    }
}
