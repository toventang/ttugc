package com.p2082ss.android.ugc.aweme.p2690cr.p2702e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40332b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.C40346b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.C40347a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40348a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40351c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import java.io.File;
import p4600h.p4601a.C89047am;

/* renamed from: com.ss.android.ugc.aweme.cr.e.g */
public final class C40369g extends AbstractC40358a {
    static {
        Covode.recordClassIndex(48170);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: f */
    public final String mo69499f() {
        return "av-mvtheme";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: g */
    public final String mo69500g() {
        return "mv-theme";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: h */
    public final EnumC40332b mo69501h() {
        return EnumC40332b.RESOURCE;
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public final File mo38200c() {
        return C63244g.m114602a().mo73279g().mo69470c().mo69481g(C63253l.f143623a.mo73308d().mo101651a().mo101661c());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: j */
    public final boolean mo69503j() {
        if (!mo38200c().exists()) {
            return true;
        }
        C40351c cVar = new C40351c(C40346b.m81526a(), C89047am.m154436a("contact_video"));
        cVar.f94525a = true;
        C40347a aVar = new C40347a();
        aVar.mo69491a(cVar);
        aVar.mo69492a(mo38200c());
        cVar.mo69495a();
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
}
