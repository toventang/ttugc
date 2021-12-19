package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.p453ap.C6808a;
import com.bytedance.android.livesdk.p453ap.C6810c;
import com.bytedance.android.livesdk.p453ap.C6811d;
import com.bytedance.android.livesdk.survey.p637b.C10796a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.d */
public final class C10827d extends AbstractC10836f {

    /* renamed from: a */
    public boolean f26052a;

    /* renamed from: b */
    public boolean f26053b;

    /* renamed from: c */
    public boolean f26054c;

    /* renamed from: g */
    private final C10796a f26055g = new C10796a(30, new C10831d(this));

    static {
        Covode.recordClassIndex(12429);
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.d$d */
    static final class C10831d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10827d f26059a;

        static {
            Covode.recordClassIndex(12433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10831d(C10827d dVar) {
            super(0);
            this.f26059a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f26059a.mo17739a(false);
            return C89391z.f203057a;
        }
    }

    public C10827d() {
        super((byte) 0);
    }

    /* renamed from: b */
    public final void mo17735b() {
        if (this.f26052a || this.f26053b || this.f26054c) {
            mo17739a(true);
            this.f26055g.mo17711c();
            this.f26055g.mo17708a();
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        DataChannel dataChannel = this.f26068e;
        if (dataChannel != null) {
            dataChannel.mo28317b(this, C6810c.class, new C10828a(this));
        }
        DataChannel dataChannel2 = this.f26068e;
        if (dataChannel2 != null) {
            dataChannel2.mo28317b(this, C6808a.class, new C10829b(this));
        }
        DataChannel dataChannel3 = this.f26068e;
        if (dataChannel3 != null) {
            dataChannel3.mo28317b(this, C6811d.class, new C10830c(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.d$a */
    static final class C10828a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10827d f26056a;

        static {
            Covode.recordClassIndex(12430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10828a(C10827d dVar) {
            super(1);
            this.f26056a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26056a.f26052a = bool.booleanValue();
            this.f26056a.mo17735b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.d$b */
    static final class C10829b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10827d f26057a;

        static {
            Covode.recordClassIndex(12431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10829b(C10827d dVar) {
            super(1);
            this.f26057a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26057a.f26053b = bool.booleanValue();
            this.f26057a.mo17735b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.d$c */
    static final class C10830c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10827d f26058a;

        static {
            Covode.recordClassIndex(12432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10830c(C10827d dVar) {
            super(1);
            this.f26058a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f26058a.f26054c = bool.booleanValue();
            this.f26058a.mo17735b();
            return C89391z.f203057a;
        }
    }
}
