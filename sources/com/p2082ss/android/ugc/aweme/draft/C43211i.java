package com.p2082ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.draft.i */
public final class C43211i {
    static {
        Covode.recordClassIndex(51398);
    }

    /* renamed from: a */
    public static final boolean m86178a(DraftSaveResult draftSaveResult) {
        String message;
        String str = "";
        C89219l.m154721d(draftSaveResult, str);
        if (draftSaveResult.isSuc()) {
            return false;
        }
        if (draftSaveResult.getSaveFileResult().getSaveException().getThrowable() instanceof C43203c) {
            return true;
        }
        Throwable throwable = draftSaveResult.getSaveFileResult().getSaveException().getThrowable();
        if (!(throwable == null || (message = throwable.getMessage()) == null)) {
            str = message;
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "disk is full", true) || C89361p.m154908a((CharSequence) str, (CharSequence) "No space left on device", true) || C89361p.m154908a((CharSequence) str, (CharSequence) "database or disk is full", true)) {
            return true;
        }
        return false;
    }
}
