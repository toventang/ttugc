package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.live.gift.C4345u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.h */
public final class C10838h extends AbstractC10836f {
    static {
        Covode.recordClassIndex(12440);
    }

    public C10838h() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        DataChannel dataChannel = this.f26068e;
        if (dataChannel != null) {
            dataChannel.mo28317b(this, C4345u.class, new C10839a(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.h$a */
    static final class C10839a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10838h f26075a;

        static {
            Covode.recordClassIndex(12441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10839a(C10838h hVar) {
            super(1);
            this.f26075a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26075a.mo17739a(bool.booleanValue());
            return C89391z.f203057a;
        }
    }
}
