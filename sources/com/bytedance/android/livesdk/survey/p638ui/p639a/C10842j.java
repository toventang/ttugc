package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.live.gift.C4333i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.j */
public final class C10842j extends AbstractC10836f {
    static {
        Covode.recordClassIndex(12444);
    }

    public C10842j() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        DataChannel dataChannel = this.f26068e;
        if (dataChannel != null) {
            dataChannel.mo28317b(this, C4333i.class, new C10843a(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.j$a */
    static final class C10843a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10842j f26077a;

        static {
            Covode.recordClassIndex(12445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10843a(C10842j jVar) {
            super(1);
            this.f26077a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26077a.mo17739a(bool.booleanValue());
            return C89391z.f203057a;
        }
    }
}
