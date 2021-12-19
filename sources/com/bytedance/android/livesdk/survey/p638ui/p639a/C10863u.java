package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.p561j.C9092dd;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.u */
public final class C10863u extends AbstractC10836f {
    static {
        Covode.recordClassIndex(12465);
    }

    public C10863u() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        DataChannel dataChannel = this.f26068e;
        if (dataChannel != null) {
            dataChannel.mo28317b(this, C9092dd.class, new C10864a(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.u$a */
    static final class C10864a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10863u f26088a;

        static {
            Covode.recordClassIndex(12466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10864a(C10863u uVar) {
            super(1);
            this.f26088a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26088a.mo17739a(bool.booleanValue());
            return C89391z.f203057a;
        }
    }
}
