package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.live.liveinteract.api.C4455y;
import com.bytedance.android.livesdk.chatroom.p488c.C7393k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.k */
public final class C10844k extends AbstractC10836f {
    static {
        Covode.recordClassIndex(12446);
    }

    public C10844k() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        DataChannel dataChannel = this.f26068e;
        if (dataChannel != null) {
            dataChannel.mo28317b(this, C4455y.class, new C10845a(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.k$a */
    static final class C10845a extends AbstractC89220m implements AbstractC89172b<C7393k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10844k f26078a;

        static {
            Covode.recordClassIndex(12447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10845a(C10844k kVar) {
            super(1);
            this.f26078a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7393k kVar) {
            C7393k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            this.f26078a.mo17739a(kVar2.f18319a);
            return C89391z.f203057a;
        }
    }
}
