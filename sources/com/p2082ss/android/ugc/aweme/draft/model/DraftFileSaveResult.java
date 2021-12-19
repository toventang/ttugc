package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult */
public final class DraftFileSaveResult {
    private final DraftFileSaveException saveException;
    private final int saveType;

    static {
        Covode.recordClassIndex(51412);
    }

    public DraftFileSaveResult() {
        this(0, null, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DraftFileSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86189xcf1ca884(int i) {
        return i;
    }

    public static /* synthetic */ DraftFileSaveResult copy$default(DraftFileSaveResult draftFileSaveResult, int i, DraftFileSaveException draftFileSaveException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = draftFileSaveResult.saveType;
        }
        if ((i2 & 2) != 0) {
            draftFileSaveException = draftFileSaveResult.saveException;
        }
        return draftFileSaveResult.copy(i, draftFileSaveException);
    }

    public final int component1() {
        return this.saveType;
    }

    public final DraftFileSaveException component2() {
        return this.saveException;
    }

    public final DraftFileSaveResult copy(int i, DraftFileSaveException draftFileSaveException) {
        C89219l.m154721d(draftFileSaveException, "");
        return new DraftFileSaveResult(i, draftFileSaveException);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileSaveResult)) {
            return false;
        }
        DraftFileSaveResult draftFileSaveResult = (DraftFileSaveResult) obj;
        return this.saveType == draftFileSaveResult.saveType && C89219l.m154714a(this.saveException, draftFileSaveResult.saveException);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftFileSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m86189xcf1ca884(this.saveType) * 31;
        DraftFileSaveException draftFileSaveException = this.saveException;
        return com_ss_android_ugc_aweme_draft_model_DraftFileSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (draftFileSaveException != null ? draftFileSaveException.hashCode() : 0);
    }

    public final String toString() {
        return "DraftFileSaveResult(saveType=" + this.saveType + ", saveException=" + this.saveException + ")";
    }

    public final DraftFileSaveException getSaveException() {
        return this.saveException;
    }

    public final int getSaveType() {
        return this.saveType;
    }

    public final boolean isSuc() {
        return this.saveException.isSuc();
    }

    public DraftFileSaveResult(int i, DraftFileSaveException draftFileSaveException) {
        C89219l.m154721d(draftFileSaveException, "");
        this.saveType = i;
        this.saveException = draftFileSaveException;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftFileSaveResult(int i, DraftFileSaveException draftFileSaveException, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new DraftFileSaveException(0, null, 3, null) : draftFileSaveException);
    }
}
