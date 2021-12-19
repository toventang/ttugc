package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.p453ap.C6808a;
import com.bytedance.android.livesdk.p453ap.C6810c;
import com.bytedance.android.livesdk.p453ap.C6811d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.e */
public final class C10832e extends AbstractC10836f {

    /* renamed from: a */
    public boolean f26060a;

    /* renamed from: b */
    public boolean f26061b;

    /* renamed from: c */
    public boolean f26062c;

    static {
        Covode.recordClassIndex(12434);
    }

    public C10832e() {
        super((byte) 0);
    }

    /* renamed from: b */
    public final void mo17736b() {
        if (this.f26060a || this.f26061b || this.f26062c) {
            mo17739a(true);
        } else {
            mo17739a(false);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        DataChannel dataChannel = this.f26068e;
        if (dataChannel != null) {
            dataChannel.mo28317b(this, C6810c.class, new C10833a(this));
        }
        DataChannel dataChannel2 = this.f26068e;
        if (dataChannel2 != null) {
            dataChannel2.mo28317b(this, C6808a.class, new C10834b(this));
        }
        DataChannel dataChannel3 = this.f26068e;
        if (dataChannel3 != null) {
            dataChannel3.mo28317b(this, C6811d.class, new C10835c(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.e$a */
    static final class C10833a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10832e f26063a;

        static {
            Covode.recordClassIndex(12435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10833a(C10832e eVar) {
            super(1);
            this.f26063a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26063a.f26060a = bool.booleanValue();
            this.f26063a.mo17736b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.e$b */
    static final class C10834b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10832e f26064a;

        static {
            Covode.recordClassIndex(12436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10834b(C10832e eVar) {
            super(1);
            this.f26064a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26064a.f26061b = bool.booleanValue();
            this.f26064a.mo17736b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.e$c */
    static final class C10835c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10832e f26065a;

        static {
            Covode.recordClassIndex(12437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10835c(C10832e eVar) {
            super(1);
            this.f26065a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26065a.f26062c = bool.booleanValue();
            this.f26065a.mo17736b();
            return C89391z.f203057a;
        }
    }
}
