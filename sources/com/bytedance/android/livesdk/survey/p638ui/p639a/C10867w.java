package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.live.p379n.C5765aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.w */
public final class C10867w extends AbstractC10836f {
    static {
        Covode.recordClassIndex(12469);
    }

    public C10867w() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        DataChannel dataChannel = this.f26068e;
        if (dataChannel != null) {
            dataChannel.mo28317b(this, C5765aa.class, new C10868a(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.w$a */
    static final class C10868a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10867w f26094a;

        static {
            Covode.recordClassIndex(12470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10868a(C10867w wVar) {
            super(1);
            this.f26094a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26094a.mo17739a(bool.booleanValue());
            return C89391z.f203057a;
        }
    }
}
