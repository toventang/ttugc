package com.p2082ss.android.ugc.aweme.p2690cr.p2702e;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40332b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.C40347a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40348a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.sticker.p3957e.C75326f;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.cr.e.k */
public final class C40373k extends AbstractC40358a {
    static {
        Covode.recordClassIndex(48174);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: f */
    public final String mo69499f() {
        return "av-moji";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: g */
    public final String mo69500g() {
        return "person-effect";
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
        return C63244g.m114602a().mo73279g().mo69470c().mo69481g(C75326f.m132130a());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: j */
    public final boolean mo69503j() {
        Keva.getRepo("personal_effect").clear();
        FileUtils.INSTANCE.removeDir(C75326f.m132130a());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: k */
    public final long mo69504k() {
        C40348a aVar = new C40348a(null, null, 3);
        if (mo38200c().exists()) {
            C40347a aVar2 = new C40347a();
            aVar2.mo69491a(aVar);
            aVar2.mo69492a(mo38200c());
        }
        return aVar.f94521a + 0;
    }
}
