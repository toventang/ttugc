package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult */
public final class DraftFileCheckResult {
    private final int errorCode;
    private final String path;

    static {
        Covode.recordClassIndex(51410);
    }

    public DraftFileCheckResult() {
        this(0, null, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DraftFileCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86187x41be94ab(int i) {
        return i;
    }

    public static /* synthetic */ DraftFileCheckResult copy$default(DraftFileCheckResult draftFileCheckResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = draftFileCheckResult.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = draftFileCheckResult.path;
        }
        return draftFileCheckResult.copy(i, str);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.path;
    }

    public final DraftFileCheckResult copy(int i, String str) {
        return new DraftFileCheckResult(i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileCheckResult)) {
            return false;
        }
        DraftFileCheckResult draftFileCheckResult = (DraftFileCheckResult) obj;
        return this.errorCode == draftFileCheckResult.errorCode && C89219l.m154714a(this.path, draftFileCheckResult.path);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftFileCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m86187x41be94ab(this.errorCode) * 31;
        String str = this.path;
        return com_ss_android_ugc_aweme_draft_model_DraftFileCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DraftFileCheckResult(errorCode=" + this.errorCode + ", path=" + this.path + ")";
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean isSuc() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }

    public DraftFileCheckResult(int i, String str) {
        this.errorCode = i;
        this.path = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftFileCheckResult(int i, String str, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
