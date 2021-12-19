package com.p2082ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63266w;
import com.p2082ss.android.ugc.aweme.servicimpl.C67889ab;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.ac */
public final class C67892ac implements AbstractC63266w {

    /* renamed from: a */
    private final AbstractC89244h f152069a = C89250i.m154773a((AbstractC89171a) C67893a.f152070a);

    static {
        Covode.recordClassIndex(80061);
    }

    /* renamed from: a */
    private final AbstractC63266w m120156a() {
        return (AbstractC63266w) this.f152069a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ac$a */
    static final class C67893a extends AbstractC89220m implements AbstractC89171a<AbstractC63266w> {

        /* renamed from: a */
        public static final C67893a f152070a = new C67893a();

        static {
            Covode.recordClassIndex(80062);
        }

        C67893a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC63266w invoke() {
            return new C67889ab.C67890a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.ac$b */
    static final class C67894b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f152071a;

        static {
            Covode.recordClassIndex(80063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67894b(AbstractC89171a aVar) {
            super(0);
            this.f152071a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f152071a.invoke();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63266w
    /* renamed from: b */
    public final void mo101761b(Activity activity) {
        AbstractC63266w a = m120156a();
        if (a != null) {
            a.mo101761b(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63266w
    /* renamed from: a */
    public final boolean mo101760a(Activity activity) {
        C89219l.m154721d(activity, "");
        AbstractC63266w a = m120156a();
        if (a != null) {
            return a.mo101760a(activity);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63266w
    /* renamed from: a */
    public final void mo101759a(Activity activity, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        AbstractC63266w a = m120156a();
        if (a != null) {
            a.mo101759a(activity, new C67894b(aVar));
        }
    }
}
