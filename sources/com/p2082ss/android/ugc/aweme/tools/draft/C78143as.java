package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.as */
final /* synthetic */ class C78143as implements AbstractC1729g {

    /* renamed from: a */
    private final C43223c f175483a;

    static {
        Covode.recordClassIndex(91258);
    }

    C78143as(C43223c cVar) {
        this.f175483a = cVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C78397c.m136927a().notifyDraftDelete(this.f175483a);
        return null;
    }
}
