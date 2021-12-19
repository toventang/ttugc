package com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.e */
public final class C76992e implements AbstractC46355b {

    /* renamed from: a */
    public static final C76993a f172741a = new C76993a((byte) 0);

    /* renamed from: b */
    private AbstractC46415f f172742b;

    static {
        Covode.recordClassIndex(89990);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.e$a */
    public static final class C76993a {
        static {
            Covode.recordClassIndex(89991);
        }

        private C76993a() {
        }

        public /* synthetic */ C76993a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b
    /* renamed from: a */
    public final void mo78863a() {
        AbstractC46415f fVar = this.f172742b;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f172742b = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46355b
    /* renamed from: a */
    public final void mo78864a(IFetchEffectChannelListener iFetchEffectChannelListener) {
        C89219l.m154721d(iFetchEffectChannelListener, "");
        if (this.f172742b == null) {
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            this.f172742b = C46404c.m89554a(application, null);
        }
        AbstractC46415f fVar = this.f172742b;
        if (fVar != null) {
            fVar.mo78907a("story-editeffects", false, iFetchEffectChannelListener);
        }
    }
}
