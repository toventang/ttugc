package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftLoadResult */
public final class DraftLoadResult {
    private final DraftCheckResult checkResult;
    private final String creationId;
    private final int draftType;
    private final boolean isStoryDraft;
    private final long saveDraftAppVersion;
    private final String saveDraftTime;

    static {
        Covode.recordClassIndex(51413);
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DraftLoadResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86190x1f7b4291(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DraftLoadResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86191x1f7b4291(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ DraftLoadResult copy$default(DraftLoadResult draftLoadResult, String str, int i, String str2, long j, DraftCheckResult draftCheckResult, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = draftLoadResult.creationId;
        }
        if ((i2 & 2) != 0) {
            i = draftLoadResult.draftType;
        }
        if ((i2 & 4) != 0) {
            str2 = draftLoadResult.saveDraftTime;
        }
        if ((i2 & 8) != 0) {
            j = draftLoadResult.saveDraftAppVersion;
        }
        if ((i2 & 16) != 0) {
            draftCheckResult = draftLoadResult.checkResult;
        }
        if ((i2 & 32) != 0) {
            z = draftLoadResult.isStoryDraft;
        }
        return draftLoadResult.copy(str, i, str2, j, draftCheckResult, z);
    }

    public final String component1() {
        return this.creationId;
    }

    public final int component2() {
        return this.draftType;
    }

    public final String component3() {
        return this.saveDraftTime;
    }

    public final long component4() {
        return this.saveDraftAppVersion;
    }

    public final DraftCheckResult component5() {
        return this.checkResult;
    }

    public final boolean component6() {
        return this.isStoryDraft;
    }

    public final DraftLoadResult copy(String str, int i, String str2, long j, DraftCheckResult draftCheckResult, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(draftCheckResult, "");
        return new DraftLoadResult(str, i, str2, j, draftCheckResult, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftLoadResult)) {
            return false;
        }
        DraftLoadResult draftLoadResult = (DraftLoadResult) obj;
        return C89219l.m154714a(this.creationId, draftLoadResult.creationId) && this.draftType == draftLoadResult.draftType && C89219l.m154714a(this.saveDraftTime, draftLoadResult.saveDraftTime) && this.saveDraftAppVersion == draftLoadResult.saveDraftAppVersion && C89219l.m154714a(this.checkResult, draftLoadResult.checkResult) && this.isStoryDraft == draftLoadResult.isStoryDraft;
    }

    public final int hashCode() {
        String str = this.creationId;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m86190x1f7b4291(this.draftType)) * 31;
        String str2 = this.saveDraftTime;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m86191x1f7b4291(this.saveDraftAppVersion)) * 31;
        DraftCheckResult draftCheckResult = this.checkResult;
        if (draftCheckResult != null) {
            i = draftCheckResult.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.isStoryDraft;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "DraftLoadResult(creationId=" + this.creationId + ", draftType=" + this.draftType + ", saveDraftTime=" + this.saveDraftTime + ", saveDraftAppVersion=" + this.saveDraftAppVersion + ", checkResult=" + this.checkResult + ", isStoryDraft=" + this.isStoryDraft + ")";
    }

    public final DraftCheckResult getCheckResult() {
        return this.checkResult;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftType() {
        return this.draftType;
    }

    public final long getSaveDraftAppVersion() {
        return this.saveDraftAppVersion;
    }

    public final String getSaveDraftTime() {
        return this.saveDraftTime;
    }

    public final boolean isStoryDraft() {
        return this.isStoryDraft;
    }

    public final int getErrorCode() {
        return this.checkResult.getErrorCode();
    }

    public final boolean isSuc() {
        if (getErrorCode() == 0) {
            return true;
        }
        return false;
    }

    public DraftLoadResult(String str, int i, String str2, long j, DraftCheckResult draftCheckResult, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(draftCheckResult, "");
        this.creationId = str;
        this.draftType = i;
        this.saveDraftTime = str2;
        this.saveDraftAppVersion = j;
        this.checkResult = draftCheckResult;
        this.isStoryDraft = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftLoadResult(String str, int i, String str2, long j, DraftCheckResult draftCheckResult, boolean z, int i2, C89214g gVar) {
        this(str, i, str2, j, (i2 & 16) != 0 ? new DraftCheckResult(1, null, null, 0, 14, null) : draftCheckResult, (i2 & 32) != 0 ? false : z);
    }
}
