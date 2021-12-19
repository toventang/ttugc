package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.survey.p638ui.C10805a;
import com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.c */
public class C10825c extends AbstractC10819a {

    /* renamed from: i */
    public final AbstractC89172b<Boolean, C89391z> f26048i = new C10826a(this);

    /* renamed from: j */
    private final C10837g f26049j;

    /* renamed from: k */
    private boolean f26050k;

    static {
        Covode.recordClassIndex(12427);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a
    /* renamed from: e */
    public final void mo17725e() {
        mo17719a(C10805a.C10806a.EnumC10807a.CANCEL);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a
    /* renamed from: g */
    public final void mo17727g() {
        mo17719a(C10805a.C10806a.EnumC10807a.CANCEL);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a
    /* renamed from: i */
    public final void mo17729i() {
        mo17719a(C10805a.C10806a.EnumC10807a.CANCEL);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a
    /* renamed from: j */
    public final void mo17730j() {
        mo17719a(C10805a.C10806a.EnumC10807a.NOT_LOG);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo17732l() {
        return this.f26049j.mo17742a();
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a
    /* renamed from: h */
    public final void mo17728h() {
        mo17720a(AbstractC10819a.EnumC10820a.QUESTION);
        mo17731k();
        mo17724d();
        this.f26032d.mo17709a(this.f26029a);
        this.f26032d.mo17708a();
    }

    /* renamed from: k */
    public final void mo17731k() {
        if (this.f26049j.mo17742a()) {
            super.mo17721a(true);
        } else {
            mo17722b();
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a
    /* renamed from: f */
    public boolean mo17726f() {
        if (!this.f26049j.mo17742a() || this.f26050k) {
            return false;
        }
        this.f26050k = true;
        this.f26035g = true;
        mo17720a(AbstractC10819a.EnumC10820a.QUESTION);
        mo17731k();
        mo17724d();
        this.f26032d.mo17709a(this.f26029a);
        this.f26032d.mo17708a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C10837g mo17733m() {
        C10837g gVar = new C10837g(this.f26036h, this.f26048i);
        gVar.mo17740a(new C10852o());
        gVar.mo17740a(new C10840i());
        gVar.mo17740a(new C10861t());
        gVar.mo17740a(new C10867w());
        gVar.mo17740a(new C10850n());
        gVar.mo17740a(new C10848m());
        gVar.mo17740a(new C10844k());
        gVar.mo17740a(new C10832e());
        gVar.mo17740a(new C10859s());
        gVar.mo17740a(new C10838h());
        gVar.mo17740a(new C10842j());
        return gVar;
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.c$a */
    static final class C10826a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10825c f26051a;

        static {
            Covode.recordClassIndex(12428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10826a(C10825c cVar) {
            super(1);
            this.f26051a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f26051a.mo17718a();
            } else if (this.f26051a.f26034f == AbstractC10819a.EnumC10820a.HOLD) {
                this.f26051a.mo17722b();
            } else {
                this.f26051a.mo17719a(C10805a.C10806a.EnumC10807a.CANCEL);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10825c(DataChannel dataChannel, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super C10805a.C10806a.EnumC10807a, C89391z> bVar2) {
        super(dataChannel, bVar, aVar, aVar2, bVar2);
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar2, "");
        C10837g m = mo17733m();
        this.f26049j = m;
        m.mo17743b();
    }
}
