package com.p2082ss.android.ugc.aweme.tools.draft.p4112j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43232f;
import com.p2082ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63276d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.j.b */
public final class C78396b implements AbstractC63276d {
    static {
        Covode.recordClassIndex(91522);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63276d
    /* renamed from: a */
    public final void mo101854a(DraftLoadResult draftLoadResult) {
        C89219l.m154721d(draftLoadResult, "");
        C39162r.m79460a("draft_load", new C84425b().mo129403a("status", !draftLoadResult.isSuc()).mo129408a(C43232f.m86343a(draftLoadResult)).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63276d
    /* renamed from: a */
    public final void mo101855a(DraftSaveResult draftSaveResult) {
        C89219l.m154721d(draftSaveResult, "");
        C39162r.m79460a("draft_save", new C84425b().mo129403a("status", !draftSaveResult.isSuc()).mo129408a(C43232f.m86344a(draftSaveResult)).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63276d
    /* renamed from: a */
    public final void mo101853a(int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C84425b a = new C84425b().mo129403a("status", i).mo129406a("creation_id", str);
        if (i == 1) {
            if (str2 == null) {
                str2 = "no reason";
            }
            a.mo129406a("failed_reason", str2);
        }
        C39162r.m79460a("draft_recover", a.f188764a);
    }
}
