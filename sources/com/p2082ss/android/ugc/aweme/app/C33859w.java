package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.w */
public final class C33859w implements AbstractC68342a {
    static {
        Covode.recordClassIndex(40772);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60119a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60118a(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar.f152965aa != null) {
            int size = fVar.f152965aa.size();
            String str = "";
            for (int i = 0; i < size; i++) {
                StringBuilder append = new StringBuilder().append(str);
                C68343a aVar = fVar.f152965aa.get(i);
                C89219l.m154716b(aVar, "");
                str = append.append(aVar.getLanguageCode()).append(",").toString();
            }
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<String> userAddLanguages = inst.getUserAddLanguages();
            C89219l.m154716b(userAddLanguages, "");
            userAddLanguages.mo59940b(str);
            C39162r.m79460a("user_language_set_by_push_setting", new C33744d().mo59983a("content_language", str).f79943a);
        }
    }
}
