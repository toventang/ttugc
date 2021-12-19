package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.live.liveinteract.api.C4454x;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.p */
public final class C10854p extends AbstractC10836f {
    static {
        Covode.recordClassIndex(12456);
    }

    public C10854p() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        DataChannel dataChannel = this.f26068e;
        if (dataChannel != null) {
            dataChannel.mo28317b(this, C4454x.class, new C10855a(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.p$a */
    static final class C10855a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10854p f26083a;

        static {
            Covode.recordClassIndex(12457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10855a(C10854p pVar) {
            super(1);
            this.f26083a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26083a.mo17739a(bool.booleanValue());
            return C89391z.f203057a;
        }
    }
}
