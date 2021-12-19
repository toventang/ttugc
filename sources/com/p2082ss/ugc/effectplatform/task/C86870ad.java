package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import java.util.HashMap;
import p4519d.p4520a.p4522b.C87993b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.ad */
public final class C86870ad extends AbstractC86891b {

    /* renamed from: a */
    public final C86687a f195855a;

    /* renamed from: b */
    public final String f195856b;

    static {
        Covode.recordClassIndex(102635);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.ad$a */
    static final class C86871a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86870ad f195857a;

        static {
            Covode.recordClassIndex(102636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86871a(C86870ad adVar) {
            super(0);
            this.f195857a = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f195857a.f195855a.f195443K.mo140037b(this.f195857a.f195856b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86871a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.ad$b */
    public static final class C86872b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86870ad f195858a;

        /* renamed from: b */
        final /* synthetic */ C86840e f195859b;

        static {
            Covode.recordClassIndex(102637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86872b(C86870ad adVar, C86840e eVar) {
            super(0);
            this.f195858a = adVar;
            this.f195859b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195858a.f195855a.f195443K.mo140035a(this.f195858a.f195856b);
            if (a != null) {
                a.onFail(null, this.f195859b);
            }
            this.f195858a.f195855a.f195443K.mo140037b(this.f195858a.f195856b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.ad$c */
    static final class C86873c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86870ad f195860a;

        /* renamed from: b */
        final /* synthetic */ HashMap f195861b;

        static {
            Covode.recordClassIndex(102638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86873c(C86870ad adVar, HashMap hashMap) {
            super(0);
            this.f195860a = adVar;
            this.f195861b = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195860a.f195855a.f195443K.mo140035a(this.f195860a.f195856b);
            if (a != null) {
                a.onSuccess(this.f195861b);
            }
            this.f195860a.f195855a.f195443K.mo140037b(this.f195860a.f195856b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        String b;
        HashMap hashMap;
        AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f195855a.f195467w);
        if (fVar == null || (b = fVar.mo140007b("updatetime")) == null) {
            m150486a(new C86840e(10009));
            return;
        }
        try {
            C86695b bVar = this.f195855a.f195461q;
            if (bVar == null || (hashMap = (HashMap) bVar.f195508a.convertJsonToObj(b, HashMap.class)) == null) {
                m150486a(new C86840e(new IllegalStateException("local file destroy")));
            } else {
                m150523a(new C86873c(this, hashMap));
            }
        } catch (Exception e) {
            m150486a(new C86840e(e));
        }
    }

    /* renamed from: a */
    private final void m150486a(C86840e eVar) {
        m150523a(new C86872b(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86870ad(C86687a aVar, String str) {
        super(str);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195855a = aVar;
        this.f195856b = str;
    }
}
