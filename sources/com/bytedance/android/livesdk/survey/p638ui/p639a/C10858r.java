package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.survey.p638ui.C10805a;
import com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.r */
public final class C10858r extends C10825c {

    /* renamed from: j */
    private boolean f26085j;

    static {
        Covode.recordClassIndex(12460);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.C10825c, com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a
    /* renamed from: f */
    public final boolean mo17726f() {
        if (!mo17732l()) {
            return false;
        }
        if (!this.f26085j) {
            this.f26085j = true;
            this.f26035g = true;
            mo17720a(AbstractC10819a.EnumC10820a.QUESTION);
            mo17731k();
            mo17724d();
            this.f26032d.mo17709a(this.f26029a);
            this.f26032d.mo17708a();
            return true;
        } else if (this.f26034f != AbstractC10819a.EnumC10820a.DISMISSED) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.C10825c
    /* renamed from: m */
    public final C10837g mo17733m() {
        C10837g gVar = new C10837g(this.f26036h, ((C10825c) this).f26048i);
        gVar.mo17740a(new C10852o());
        gVar.mo17740a(new C10840i());
        gVar.mo17740a(new C10867w());
        gVar.mo17740a(new C10850n());
        gVar.mo17740a(new C10848m());
        gVar.mo17740a(new C10827d());
        gVar.mo17740a(new C10842j());
        gVar.mo17740a(new C10863u());
        gVar.mo17740a(new C10854p());
        return gVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10858r(DataChannel dataChannel, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super C10805a.C10806a.EnumC10807a, C89391z> bVar2) {
        super(dataChannel, bVar, aVar, aVar2, bVar2);
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar2, "");
    }
}
