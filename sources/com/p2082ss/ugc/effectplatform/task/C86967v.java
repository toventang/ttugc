package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import com.p2082ss.ugc.effectplatform.model.net.PanelInfoResponse;
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

/* renamed from: com.ss.ugc.effectplatform.task.v */
public final class C86967v extends AbstractC86891b {

    /* renamed from: c */
    public static final C86968a f196079c = new C86968a((byte) 0);

    /* renamed from: a */
    public final C86687a f196080a;

    /* renamed from: b */
    public final String f196081b;

    /* renamed from: d */
    private final String f196082d;

    /* renamed from: f */
    private final boolean f196083f;

    /* renamed from: g */
    private final String f196084g;

    /* renamed from: h */
    private final int f196085h;

    /* renamed from: i */
    private final int f196086i;

    static {
        Covode.recordClassIndex(102732);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.v$a */
    public static final class C86968a {
        static {
            Covode.recordClassIndex(102733);
        }

        private C86968a() {
        }

        public /* synthetic */ C86968a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.v$b */
    static final class C86969b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86967v f196087a;

        static {
            Covode.recordClassIndex(102734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86969b(C86967v vVar) {
            super(0);
            this.f196087a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f196087a.f196080a.f195443K.mo140037b(this.f196087a.f196081b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86969b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.v$c */
    public static final class C86970c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86967v f196088a;

        /* renamed from: b */
        final /* synthetic */ C86840e f196089b;

        static {
            Covode.recordClassIndex(102735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86970c(C86967v vVar, C86840e eVar) {
            super(0);
            this.f196088a = vVar;
            this.f196089b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196088a.f196080a.f195443K.mo140035a(this.f196088a.f196081b);
            if (a != null) {
                a.onFail(null, this.f196089b);
            }
            this.f196088a.f196080a.f195443K.mo140037b(this.f196088a.f196081b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.v$d */
    static final class C86971d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86967v f196090a;

        /* renamed from: b */
        final /* synthetic */ PanelInfoModel f196091b;

        static {
            Covode.recordClassIndex(102736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86971d(C86967v vVar, PanelInfoModel panelInfoModel) {
            super(0);
            this.f196090a = vVar;
            this.f196091b = panelInfoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196090a.f196080a.f195443K.mo140035a(this.f196090a.f196081b);
            if (a != null) {
                a.onSuccess(this.f196091b);
            }
            this.f196090a.f196080a.f195443K.mo140037b(this.f196090a.f196081b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        C88044c cVar;
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f196080a.f195467w);
        PanelInfoResponse panelInfoResponse = null;
        if (fVar != null) {
            cVar = fVar.mo140009c(C86989g.m150650a(this.f196080a.f195450f, this.f196082d, this.f196083f, this.f196084g, this.f196086i, this.f196085h));
        } else {
            cVar = null;
        }
        if (cVar == null) {
            m150610a(new C86840e(10004));
            return;
        }
        try {
            String str = C88045d.m153104a(cVar, EnumC88043b.Utf8);
            C86695b bVar = this.f196080a.f195461q;
            if (bVar != null) {
                panelInfoResponse = (PanelInfoResponse) bVar.f195508a.convertJsonToObj(str, PanelInfoResponse.class);
            }
        } catch (Exception e) {
            C88060b.m153136a("FetchPanelInfoCacheTask", "Json Parse Exception: ".concat(String.valueOf(e)), null);
        } catch (Throwable th) {
            C88045d.m153106a((AbstractC88054k) cVar);
            throw th;
        }
        C88045d.m153106a((AbstractC88054k) cVar);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
            long j = currentTimeMillis2 - currentTimeMillis;
            V v = this.f196080a.f195463s.f199870a;
            if (v != null) {
                C86802b.m150354a(v, true, this.f196080a, this.f196082d, C89041ag.m154421a(C89387v.m154943a("duration", Long.valueOf(j)), C89387v.m154943a("from_cache", "true")), "");
            }
            m150610a(new C86840e(10004));
            return;
        }
        PanelInfoModel data = panelInfoResponse.getData();
        if (data != null) {
            m150523a(new C86971d(this, data));
        }
    }

    /* renamed from: a */
    private final void m150610a(C86840e eVar) {
        C88060b.m153136a("FetchPanelInfoCacheTask", "Failed: ".concat(String.valueOf(eVar)), null);
        m150523a(new C86970c(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86967v(C86687a aVar, String str, String str2, boolean z, String str3, int i, int i2) {
        super(str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f196080a = aVar;
        this.f196082d = str;
        this.f196081b = str2;
        this.f196083f = z;
        this.f196084g = str3;
        this.f196085h = i;
        this.f196086i = i2;
    }
}
