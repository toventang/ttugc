package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.n */
public final class C86946n extends AbstractC86891b {

    /* renamed from: a */
    public final C86687a f196031a;

    /* renamed from: b */
    public final Effect f196032b;

    /* renamed from: c */
    public final String f196033c;

    static {
        Covode.recordClassIndex(102711);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.n$b */
    static final class C86948b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86946n f196036a;

        static {
            Covode.recordClassIndex(102713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86948b(C86946n nVar) {
            super(0);
            this.f196036a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f196036a.f196031a.f195443K.mo140037b(this.f196036a.f196033c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86948b(this));
    }

    /* renamed from: com.ss.ugc.effectplatform.task.n$a */
    static final class C86947a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86946n f196034a;

        /* renamed from: b */
        final /* synthetic */ Effect f196035b;

        static {
            Covode.recordClassIndex(102712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86947a(C86946n nVar, Effect effect) {
            super(0);
            this.f196034a = nVar;
            this.f196035b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196034a.f196031a.f195443K.mo140035a(this.f196034a.f196033c);
            if (a != null) {
                a.onSuccess(this.f196035b);
            }
            this.f196034a.f196031a.f195443K.mo140037b(this.f196034a.f196033c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.n$c */
    public static final class C86949c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86946n f196037a;

        /* renamed from: b */
        final /* synthetic */ C86840e f196038b;

        static {
            Covode.recordClassIndex(102714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86949c(C86946n nVar, C86840e eVar) {
            super(0);
            this.f196037a = nVar;
            this.f196038b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196037a.f196031a.f195443K.mo140035a(this.f196037a.f196033c);
            if (a != null) {
                a.onFail(this.f196037a.f196032b, this.f196038b);
            }
            this.f196037a.f196031a.f195443K.mo140037b(this.f196037a.f196033c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r5.mo140013e(r3.getId() + "_trans_" + r2) != false) goto L_0x0068;
     */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139952a() {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.task.C86946n.mo139952a():void");
    }

    /* renamed from: a */
    private final void m150579a(C86840e eVar) {
        m150523a(new C86949c(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86946n(C86687a aVar, Effect effect, String str) {
        super(str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f196031a = aVar;
        this.f196032b = effect;
        this.f196033c = str;
    }
}
