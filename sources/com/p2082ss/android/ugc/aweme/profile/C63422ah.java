package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ah */
public final class C63422ah implements AbstractC68342a {

    /* renamed from: a */
    public static final C63422ah f143974a = new C63422ah();

    /* renamed from: b */
    private static C68348f f143975b;

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60119a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    private C63422ah() {
    }

    static {
        Covode.recordClassIndex(74713);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60118a(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        f143975b = fVar;
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (fVar.f152958U > repo.getInt(C63807h.m115405a("post_guide_count_follow_from_recommend"), 0)) {
            repo.storeInt(C63807h.m115405a("post_guide_count_follow_from_recommend"), fVar.f152958U);
        }
        C51648a.f118980a.mo87317b(fVar.f152961X);
    }
}
