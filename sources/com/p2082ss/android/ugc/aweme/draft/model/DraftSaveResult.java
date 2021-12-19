package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftSaveResult */
public final class DraftSaveResult {
    private final DraftCheckResult checkResult;
    private final Throwable codeException;
    private final String creationId;
    private final int draftFrom;
    private final int draftType;
    private final boolean isStoryDraft;
    private final DraftDBSaveResult saveDBResult;
    private final long saveDraftAppVersion;
    private final String saveDraftTime;
    private final DraftFileSaveResult saveFileResult;

    static {
        Covode.recordClassIndex(51414);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j) {
        this(str, i, i2, str2, j, null, null, null, null, false, 992, null);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, DraftCheckResult draftCheckResult) {
        this(str, i, i2, str2, j, draftCheckResult, null, null, null, false, 960, null);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, DraftCheckResult draftCheckResult, DraftFileSaveResult draftFileSaveResult) {
        this(str, i, i2, str2, j, draftCheckResult, draftFileSaveResult, null, null, false, 896, null);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, DraftCheckResult draftCheckResult, DraftFileSaveResult draftFileSaveResult, DraftDBSaveResult draftDBSaveResult) {
        this(str, i, i2, str2, j, draftCheckResult, draftFileSaveResult, draftDBSaveResult, null, false, 768, null);
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, DraftCheckResult draftCheckResult, DraftFileSaveResult draftFileSaveResult, DraftDBSaveResult draftDBSaveResult, Throwable th) {
        this(str, i, i2, str2, j, draftCheckResult, draftFileSaveResult, draftDBSaveResult, th, false, 512, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DraftSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86192x17d440e8(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DraftSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86193x17d440e8(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ DraftSaveResult copy$default(DraftSaveResult draftSaveResult, String str, int i, int i2, String str2, long j, DraftCheckResult draftCheckResult, DraftFileSaveResult draftFileSaveResult, DraftDBSaveResult draftDBSaveResult, Throwable th, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = draftSaveResult.creationId;
        }
        if ((i3 & 2) != 0) {
            i = draftSaveResult.draftType;
        }
        if ((i3 & 4) != 0) {
            i2 = draftSaveResult.draftFrom;
        }
        if ((i3 & 8) != 0) {
            str2 = draftSaveResult.saveDraftTime;
        }
        if ((i3 & 16) != 0) {
            j = draftSaveResult.saveDraftAppVersion;
        }
        if ((i3 & 32) != 0) {
            draftCheckResult = draftSaveResult.checkResult;
        }
        if ((i3 & 64) != 0) {
            draftFileSaveResult = draftSaveResult.saveFileResult;
        }
        if ((i3 & 128) != 0) {
            draftDBSaveResult = draftSaveResult.saveDBResult;
        }
        if ((i3 & 256) != 0) {
            th = draftSaveResult.codeException;
        }
        if ((i3 & 512) != 0) {
            z = draftSaveResult.isStoryDraft;
        }
        return draftSaveResult.copy(str, i, i2, str2, j, draftCheckResult, draftFileSaveResult, draftDBSaveResult, th, z);
    }

    public final String component1() {
        return this.creationId;
    }

    public final boolean component10() {
        return this.isStoryDraft;
    }

    public final int component2() {
        return this.draftType;
    }

    public final int component3() {
        return this.draftFrom;
    }

    public final String component4() {
        return this.saveDraftTime;
    }

    public final long component5() {
        return this.saveDraftAppVersion;
    }

    public final DraftCheckResult component6() {
        return this.checkResult;
    }

    public final DraftFileSaveResult component7() {
        return this.saveFileResult;
    }

    public final DraftDBSaveResult component8() {
        return this.saveDBResult;
    }

    public final Throwable component9() {
        return this.codeException;
    }

    public final DraftSaveResult copy(String str, int i, int i2, String str2, long j, DraftCheckResult draftCheckResult, DraftFileSaveResult draftFileSaveResult, DraftDBSaveResult draftDBSaveResult, Throwable th, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(draftCheckResult, "");
        C89219l.m154721d(draftFileSaveResult, "");
        C89219l.m154721d(draftDBSaveResult, "");
        return new DraftSaveResult(str, i, i2, str2, j, draftCheckResult, draftFileSaveResult, draftDBSaveResult, th, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftSaveResult)) {
            return false;
        }
        DraftSaveResult draftSaveResult = (DraftSaveResult) obj;
        return C89219l.m154714a(this.creationId, draftSaveResult.creationId) && this.draftType == draftSaveResult.draftType && this.draftFrom == draftSaveResult.draftFrom && C89219l.m154714a(this.saveDraftTime, draftSaveResult.saveDraftTime) && this.saveDraftAppVersion == draftSaveResult.saveDraftAppVersion && C89219l.m154714a(this.checkResult, draftSaveResult.checkResult) && C89219l.m154714a(this.saveFileResult, draftSaveResult.saveFileResult) && C89219l.m154714a(this.saveDBResult, draftSaveResult.saveDBResult) && C89219l.m154714a(this.codeException, draftSaveResult.codeException) && this.isStoryDraft == draftSaveResult.isStoryDraft;
    }

    public final int hashCode() {
        String str = this.creationId;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + m86192x17d440e8(this.draftType)) * 31) + m86192x17d440e8(this.draftFrom)) * 31;
        String str2 = this.saveDraftTime;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m86193x17d440e8(this.saveDraftAppVersion)) * 31;
        DraftCheckResult draftCheckResult = this.checkResult;
        int hashCode3 = (hashCode2 + (draftCheckResult != null ? draftCheckResult.hashCode() : 0)) * 31;
        DraftFileSaveResult draftFileSaveResult = this.saveFileResult;
        int hashCode4 = (hashCode3 + (draftFileSaveResult != null ? draftFileSaveResult.hashCode() : 0)) * 31;
        DraftDBSaveResult draftDBSaveResult = this.saveDBResult;
        int hashCode5 = (hashCode4 + (draftDBSaveResult != null ? draftDBSaveResult.hashCode() : 0)) * 31;
        Throwable th = this.codeException;
        if (th != null) {
            i = th.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
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
        return "DraftSaveResult(creationId=" + this.creationId + ", draftType=" + this.draftType + ", draftFrom=" + this.draftFrom + ", saveDraftTime=" + this.saveDraftTime + ", saveDraftAppVersion=" + this.saveDraftAppVersion + ", checkResult=" + this.checkResult + ", saveFileResult=" + this.saveFileResult + ", saveDBResult=" + this.saveDBResult + ", codeException=" + this.codeException + ", isStoryDraft=" + this.isStoryDraft + ")";
    }

    public final DraftCheckResult getCheckResult() {
        return this.checkResult;
    }

    public final Throwable getCodeException() {
        return this.codeException;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftFrom() {
        return this.draftFrom;
    }

    public final int getDraftType() {
        return this.draftType;
    }

    public final DraftDBSaveResult getSaveDBResult() {
        return this.saveDBResult;
    }

    public final long getSaveDraftAppVersion() {
        return this.saveDraftAppVersion;
    }

    public final String getSaveDraftTime() {
        return this.saveDraftTime;
    }

    public final DraftFileSaveResult getSaveFileResult() {
        return this.saveFileResult;
    }

    public final boolean isStoryDraft() {
        return this.isStoryDraft;
    }

    public final boolean isSuc() {
        if (getErrorCode() == 0) {
            return true;
        }
        return false;
    }

    public final int getErrorCode() {
        if (this.checkResult.isSuc() && this.saveFileResult.isSuc() && this.saveDBResult.isSuc() && this.codeException == null) {
            return 0;
        }
        if (!this.checkResult.isSuc()) {
            return this.checkResult.getErrorCode();
        }
        if (!this.saveFileResult.isSuc()) {
            return this.saveFileResult.getSaveException().getErrorCode();
        }
        if (!this.saveDBResult.isSuc()) {
            return this.saveDBResult.getSaveException().getErrorCode();
        }
        if (this.codeException != null) {
            return -2000;
        }
        return -1;
    }

    public DraftSaveResult(String str, int i, int i2, String str2, long j, DraftCheckResult draftCheckResult, DraftFileSaveResult draftFileSaveResult, DraftDBSaveResult draftDBSaveResult, Throwable th, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(draftCheckResult, "");
        C89219l.m154721d(draftFileSaveResult, "");
        C89219l.m154721d(draftDBSaveResult, "");
        this.creationId = str;
        this.draftType = i;
        this.draftFrom = i2;
        this.saveDraftTime = str2;
        this.saveDraftAppVersion = j;
        this.checkResult = draftCheckResult;
        this.saveFileResult = draftFileSaveResult;
        this.saveDBResult = draftDBSaveResult;
        this.codeException = th;
        this.isStoryDraft = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftSaveResult(String str, int i, int i2, String str2, long j, DraftCheckResult draftCheckResult, DraftFileSaveResult draftFileSaveResult, DraftDBSaveResult draftDBSaveResult, Throwable th, boolean z, int i3, C89214g gVar) {
        this(str, i, i2, str2, j, (i3 & 32) != 0 ? new DraftCheckResult(1, null, null, 0, 14, null) : draftCheckResult, (i3 & 64) != 0 ? new DraftFileSaveResult(0, null, 3, null) : draftFileSaveResult, (i3 & 128) != 0 ? new DraftDBSaveResult(null, 1, null) : draftDBSaveResult, (i3 & 256) == 0 ? th : null, (i3 & 512) != 0 ? false : z);
    }
}
