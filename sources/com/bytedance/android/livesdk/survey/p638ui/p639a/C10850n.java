package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.chatroom.p488c.C7385d;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.n */
public final class C10850n extends AbstractC10836f {
    static {
        Covode.recordClassIndex(12452);
    }

    public C10850n() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        this.f26067d.mo142945a(C6779a.m14563a().mo13052a(C7385d.class).mo143289d(new C10851a(this)));
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.n$a */
    static final class C10851a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10850n f26081a;

        static {
            Covode.recordClassIndex(12453);
        }

        C10851a(C10850n nVar) {
            this.f26081a = nVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f26081a.mo17739a(((C7385d) obj).f18307a);
        }
    }
}
