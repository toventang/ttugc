package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult */
public final class DraftDBSaveResult {
    private final DraftDBSaveException saveException;

    static {
        Covode.recordClassIndex(51407);
    }

    public DraftDBSaveResult() {
        this(null, 1, null);
    }

    public static /* synthetic */ DraftDBSaveResult copy$default(DraftDBSaveResult draftDBSaveResult, DraftDBSaveException draftDBSaveException, int i, Object obj) {
        if ((i & 1) != 0) {
            draftDBSaveException = draftDBSaveResult.saveException;
        }
        return draftDBSaveResult.copy(draftDBSaveException);
    }

    public final DraftDBSaveException component1() {
        return this.saveException;
    }

    public final DraftDBSaveResult copy(DraftDBSaveException draftDBSaveException) {
        C89219l.m154721d(draftDBSaveException, "");
        return new DraftDBSaveResult(draftDBSaveException);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DraftDBSaveResult) && C89219l.m154714a(this.saveException, ((DraftDBSaveResult) obj).saveException);
        }
        return true;
    }

    public final int hashCode() {
        DraftDBSaveException draftDBSaveException = this.saveException;
        if (draftDBSaveException != null) {
            return draftDBSaveException.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DraftDBSaveResult(saveException=" + this.saveException + ")";
    }

    public final DraftDBSaveException getSaveException() {
        return this.saveException;
    }

    public final boolean isSuc() {
        return this.saveException.isSuc();
    }

    public DraftDBSaveResult(DraftDBSaveException draftDBSaveException) {
        C89219l.m154721d(draftDBSaveException, "");
        this.saveException = draftDBSaveException;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftDBSaveResult(DraftDBSaveException draftDBSaveException, int i, C89214g gVar) {
        this((i & 1) != 0 ? new DraftDBSaveException(0, null, 3, null) : draftDBSaveException);
    }
}
