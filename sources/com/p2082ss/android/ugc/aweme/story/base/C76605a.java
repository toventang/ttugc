package com.p2082ss.android.ugc.aweme.story.base;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.story.record.C77496d;
import com.p2082ss.android.ugc.aweme.story.record.C77517e;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.a */
public final class C76605a implements AbstractC76612b {

    /* renamed from: a */
    public final boolean f171930a;

    /* renamed from: b */
    public final boolean f171931b;

    /* renamed from: c */
    public final Bundle f171932c;

    /* renamed from: d */
    private final AbstractC89244h f171933d = C89250i.m154773a((AbstractC89171a) new C76606a(this));

    static {
        Covode.recordClassIndex(89591);
    }

    /* renamed from: a */
    public final AbstractC22219j mo120317a() {
        return (AbstractC22219j) this.f171933d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: b */
    public final boolean mo120320b() {
        AbstractC22219j a = mo120317a();
        if (!(a instanceof AbstractC76616c)) {
            a = null;
        }
        AbstractC76616c cVar = (AbstractC76616c) a;
        if (cVar != null) {
            return cVar.mo120320b();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: c */
    public final void mo120321c() {
        AbstractC22219j a = mo120317a();
        if (!(a instanceof AbstractC76616c)) {
            a = null;
        }
        AbstractC76616c cVar = (AbstractC76616c) a;
        if (cVar != null) {
            cVar.mo120321c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.a$a */
    static final class C76606a extends AbstractC89220m implements AbstractC89171a<AbstractC22219j> {

        /* renamed from: a */
        final /* synthetic */ C76605a f171934a;

        static {
            Covode.recordClassIndex(89592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76606a(C76605a aVar) {
            super(0);
            this.f171934a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC22219j invoke() {
            if (!this.f171934a.f171930a) {
                AbstractC22219j createLighteningFakeScene = C63244g.m114602a().mo73284l().createLighteningFakeScene();
                createLighteningFakeScene.f52554r = this.f171934a.f171932c;
                return createLighteningFakeScene;
            } else if (this.f171934a.f171931b) {
                return new C77496d(this.f171934a.f171932c);
            } else {
                return C77517e.C77520c.m135547a(this.f171934a.f171932c);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: a */
    public final void mo120319a(EnterStoryParam enterStoryParam) {
        C89219l.m154721d(enterStoryParam, "");
        AbstractC22219j a = mo120317a();
        if (!(a instanceof AbstractC76616c)) {
            a = null;
        }
        AbstractC76616c cVar = (AbstractC76616c) a;
        if (cVar != null) {
            cVar.mo120319a(enterStoryParam);
        }
    }

    public C76605a(boolean z, boolean z2, Bundle bundle) {
        C89219l.m154721d(bundle, "");
        this.f171930a = z;
        this.f171931b = z2;
        this.f171932c = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.base.AbstractC76616c
    /* renamed from: a */
    public final void mo120318a(int i, int i2, Intent intent) {
        AbstractC22219j a = mo120317a();
        if (!(a instanceof AbstractC76616c)) {
            a = null;
        }
        AbstractC76616c cVar = (AbstractC76616c) a;
        if (cVar != null) {
            cVar.mo120318a(i, i2, intent);
        }
    }
}
