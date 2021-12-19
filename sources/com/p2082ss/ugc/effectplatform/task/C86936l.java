package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import com.p2082ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.util.C86989g;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4530d.p4531a.AbstractC88054k;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.l */
public final class C86936l extends AbstractC86891b {

    /* renamed from: c */
    public static final C86937a f196009c = new C86937a((byte) 0);

    /* renamed from: a */
    public final C86687a f196010a;

    /* renamed from: b */
    public final String f196011b;

    /* renamed from: d */
    private final String f196012d;

    /* renamed from: f */
    private final String f196013f;

    /* renamed from: g */
    private final int f196014g;

    /* renamed from: h */
    private final int f196015h;

    /* renamed from: i */
    private final int f196016i;

    static {
        Covode.recordClassIndex(102701);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.l$a */
    public static final class C86937a {
        static {
            Covode.recordClassIndex(102702);
        }

        private C86937a() {
        }

        public /* synthetic */ C86937a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.l$b */
    static final class C86938b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86936l f196017a;

        static {
            Covode.recordClassIndex(102703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86938b(C86936l lVar) {
            super(0);
            this.f196017a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f196017a.f196010a.f195443K.mo140037b(this.f196017a.f196011b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86938b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.l$c */
    public static final class C86939c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86936l f196018a;

        /* renamed from: b */
        final /* synthetic */ C86840e f196019b;

        static {
            Covode.recordClassIndex(102704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86939c(C86936l lVar, C86840e eVar) {
            super(0);
            this.f196018a = lVar;
            this.f196019b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196018a.f196010a.f195443K.mo140035a(this.f196018a.f196011b);
            if (a != null) {
                a.onFail(null, this.f196019b);
            }
            this.f196018a.f196010a.f195443K.mo140037b(this.f196018a.f196011b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.l$d */
    static final class C86940d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86936l f196020a;

        /* renamed from: b */
        final /* synthetic */ CategoryPageModel f196021b;

        static {
            Covode.recordClassIndex(102705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86940d(C86936l lVar, CategoryPageModel categoryPageModel) {
            super(0);
            this.f196020a = lVar;
            this.f196021b = categoryPageModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196020a.f196010a.f195443K.mo140035a(this.f196020a.f196011b);
            if (a != null) {
                a.onSuccess(this.f196021b);
            }
            this.f196020a.f196010a.f195443K.mo140037b(this.f196020a.f196011b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        C88044c cVar;
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f196010a.f195467w);
        CategoryEffectListResponse categoryEffectListResponse = null;
        if (fVar != null) {
            cVar = fVar.mo140009c(C86989g.m150649a(this.f196012d, this.f196013f, this.f196014g, this.f196015h, this.f196016i));
        } else {
            cVar = null;
        }
        if (cVar == null) {
            m150569a(new C86840e(10004));
            return;
        }
        try {
            String str = C88045d.m153104a(cVar, EnumC88043b.Utf8);
            C86695b bVar = this.f196010a.f195461q;
            if (bVar != null) {
                categoryEffectListResponse = (CategoryEffectListResponse) bVar.f195508a.convertJsonToObj(str, CategoryEffectListResponse.class);
            }
        } catch (Exception e) {
            C88060b.m153136a("FetchCategoryEffectCacheTask", "Json Parse Exception: ".concat(String.valueOf(e)), null);
        } catch (Throwable th) {
            C88045d.m153106a((AbstractC88054k) cVar);
            throw th;
        }
        C88045d.m153106a((AbstractC88054k) cVar);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            long j = currentTimeMillis2 - currentTimeMillis;
            V v = this.f196010a.f195463s.f199870a;
            if (v != null) {
                C86687a aVar = this.f196010a;
                String str2 = this.f196012d;
                String str3 = this.f196013f;
                if (str3 == null) {
                    str3 = "";
                }
                C86802b.m150353a(v, true, aVar, str2, str3, C89041ag.m154421a(C89387v.m154943a("duration", Long.valueOf(j)), C89387v.m154943a("from_cache", "true")), "");
            }
            m150569a(new C86840e(10004));
            return;
        }
        CategoryPageModel data = categoryEffectListResponse.getData();
        if (data != null) {
            m150523a(new C86940d(this, data));
        }
    }

    /* renamed from: a */
    private final void m150569a(C86840e eVar) {
        m150523a(new C86939c(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86936l(C86687a aVar, String str, String str2, String str3, int i, int i2, int i3) {
        super(str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f196010a = aVar;
        this.f196012d = str;
        this.f196011b = str2;
        this.f196013f = str3;
        this.f196014g = i;
        this.f196015h = i2;
        this.f196016i = i3;
    }
}
