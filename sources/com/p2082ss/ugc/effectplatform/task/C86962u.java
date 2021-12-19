package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.EffectChannelModel;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import com.p2082ss.ugc.effectplatform.model.p4456a.C86832a;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.util.C86989g;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4530d.p4531a.AbstractC88054k;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.u */
public final class C86962u extends AbstractC86891b {

    /* renamed from: c */
    public static final C86963a f196070c = new C86963a((byte) 0);

    /* renamed from: a */
    public final C86687a f196071a;

    /* renamed from: b */
    public final String f196072b;

    /* renamed from: d */
    private final String f196073d;

    static {
        Covode.recordClassIndex(102727);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.u$a */
    public static final class C86963a {
        static {
            Covode.recordClassIndex(102728);
        }

        private C86963a() {
        }

        public /* synthetic */ C86963a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.u$b */
    static final class C86964b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86962u f196074a;

        static {
            Covode.recordClassIndex(102729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86964b(C86962u uVar) {
            super(0);
            this.f196074a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f196074a.f196071a.f195443K.mo140037b(this.f196074a.f196072b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86964b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.u$c */
    public static final class C86965c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86962u f196075a;

        /* renamed from: b */
        final /* synthetic */ C86840e f196076b;

        static {
            Covode.recordClassIndex(102730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86965c(C86962u uVar, C86840e eVar) {
            super(0);
            this.f196075a = uVar;
            this.f196076b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196075a.f196071a.f195443K.mo140035a(this.f196075a.f196072b);
            if (a != null) {
                a.onFail(null, this.f196076b);
            }
            this.f196075a.f196071a.f195443K.mo140037b(this.f196075a.f196072b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.u$d */
    static final class C86966d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86962u f196077a;

        /* renamed from: b */
        final /* synthetic */ EffectChannelResponse f196078b;

        static {
            Covode.recordClassIndex(102731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86966d(C86962u uVar, EffectChannelResponse effectChannelResponse) {
            super(0);
            this.f196077a = uVar;
            this.f196078b = effectChannelResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f196077a.f196071a.f195443K.mo140035a(this.f196077a.f196072b);
            if (a != null) {
                a.onSuccess(this.f196078b);
            }
            this.f196077a.f196071a.f195443K.mo140037b(this.f196077a.f196072b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        C88044c cVar;
        AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(this.f196071a.f195467w);
        EffectChannelModel effectChannelModel = null;
        if (fVar != null) {
            cVar = fVar.mo140009c(C86989g.m150648a(this.f196071a.f195450f, this.f196073d));
        } else {
            cVar = null;
        }
        if (cVar == null) {
            m150607a(new C86840e(10004));
            return;
        }
        try {
            String str = C88045d.m153104a(cVar, EnumC88043b.Utf8);
            C86695b bVar = this.f196071a.f195461q;
            if (bVar != null) {
                effectChannelModel = (EffectChannelModel) bVar.f195508a.convertJsonToObj(str, EffectChannelModel.class);
            }
        } catch (Exception e) {
            C88060b.m153136a("FetchPanelEffectListCacheTask", "Json Parse Exception: ".concat(String.valueOf(e)), null);
            AbstractC86755f fVar2 = (AbstractC86755f) C87993b.m153064a(this.f196071a.f195467w);
            if (fVar2 != null) {
                fVar2.mo140011d(C86989g.m150648a(this.f196071a.f195450f, this.f196073d));
            }
        } catch (Throwable th) {
            C88045d.m153106a((AbstractC88054k) cVar);
            throw th;
        }
        C88045d.m153106a((AbstractC88054k) cVar);
        if (effectChannelModel == null || !effectChannelModel.checkValued()) {
            m150607a(new C86840e(10004));
        } else {
            m150523a(new C86966d(this, new C86832a(this.f196073d, this.f196071a.f195453i, true).mo140149a(effectChannelModel)));
        }
    }

    /* renamed from: a */
    private final void m150607a(C86840e eVar) {
        m150523a(new C86965c(this, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86962u(C86687a aVar, String str, String str2) {
        super(str2);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f196071a = aVar;
        this.f196073d = str;
        this.f196072b = str2;
    }
}
