package com.p2082ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;

/* renamed from: com.ss.android.ugc.aweme.draft.p */
public final class C43241p implements AbstractC43204d {

    /* renamed from: a */
    private final String f100961a = "NonExecuteDraftCheckHandler";

    static {
        Covode.recordClassIndex(51443);
    }

    @Override // com.p2082ss.android.ugc.aweme.draft.AbstractC43204d
    /* renamed from: a */
    public final DraftCheckResult mo73445a() {
        C63244g.m114602a().mo73295w();
        C43206f.m86162a(this.f100961a, "Code should not be executed to this branch !!!");
        return new DraftCheckResult(Integer.MAX_VALUE, null, null, 0, 14, null);
    }
}
