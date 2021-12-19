package com.p2082ss.android.ugc.aweme.livewallpaper.p3419f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.f.b */
public final class C58893b implements C58895d.AbstractC58899a {

    /* renamed from: a */
    private String f134065a;

    static {
        Covode.recordClassIndex(69209);
    }

    public C58893b(String str) {
        this.f134065a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d.AbstractC58899a
    /* renamed from: a */
    public final void mo96314a(boolean z, String str) {
        if (z) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.hay).mo123053a();
            C58901f.m108220a(0, "");
        } else {
            C58901f.m108220a(1, str);
        }
        String str2 = this.f134065a;
        if (str2 != null) {
            C58901f.m108224a(str2, "share", z);
        }
        C58895d.f134069e.mo96317a("video_share");
    }
}
