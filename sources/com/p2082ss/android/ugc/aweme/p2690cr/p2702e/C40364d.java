package com.p2082ss.android.ugc.aweme.p2690cr.p2702e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2690cr.C40318a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40332b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.C40346b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.C40347a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40348a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40351c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.e.d */
public final class C40364d extends AbstractC40358a {

    /* renamed from: b */
    public static final C40365a f94555b = new C40365a((byte) 0);

    static {
        Covode.recordClassIndex(48165);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: f */
    public final String mo69499f() {
        return "av-effect";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: g */
    public final String mo69500g() {
        return "effect";
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.e.d$a */
    public static final class C40365a {
        static {
            Covode.recordClassIndex(48166);
        }

        private C40365a() {
        }

        public /* synthetic */ C40365a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: h */
    public final EnumC40332b mo69501h() {
        return EnumC40332b.RESOURCE;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: i */
    public final void mo69502i() {
        super.mo69502i();
        C40318a.m81470a(true);
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public final File mo38200c() {
        AbstractC40389c c = C63244g.m114602a().mo73279g().mo69470c();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        return c.mo69474a(filesDir, "effect");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: j */
    public final boolean mo69503j() {
        if (!mo38200c().exists()) {
            return true;
        }
        C40351c cVar = new C40351c(C40346b.m81526a(), null, 2);
        cVar.f94525a = true;
        C40347a aVar = new C40347a();
        aVar.mo69491a(cVar);
        aVar.mo69492a(mo38200c());
        cVar.mo69495a();
        C70837c a = C70837c.C70838a.m125105a();
        C70837c.C70838a.m125107c().f158636a.mo2094a(-1);
        a.f158599a = null;
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: k */
    public final long mo69504k() {
        C40348a aVar = new C40348a(C40346b.m81526a(), null, 2);
        if (mo38200c().exists()) {
            C40347a aVar2 = new C40347a();
            aVar2.mo69491a(aVar);
            aVar2.mo69492a(mo38200c());
        }
        return aVar.f94521a + 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: a */
    public final void mo69498a(boolean z) {
        super.mo69498a(z);
        C40318a.m81470a(false);
    }
}
