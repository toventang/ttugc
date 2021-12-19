package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftCheckResult */
public final class DraftCheckResult {
    private final int checkStage;
    private final int fileCount;
    private final List<DraftFileCheckResult> invalidFileList;
    private final List<DraftVECheckResult> invalidVEFileList;

    static {
        Covode.recordClassIndex(51405);
    }

    public DraftCheckResult(int i) {
        this(i, null, null, 0, 14, null);
    }

    public DraftCheckResult(int i, List<DraftFileCheckResult> list) {
        this(i, list, null, 0, 12, null);
    }

    public DraftCheckResult(int i, List<DraftFileCheckResult> list, List<DraftVECheckResult> list2) {
        this(i, list, list2, 0, 8, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DraftCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86185xffa08c7(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.draft.model.DraftCheckResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftCheckResult copy$default(DraftCheckResult draftCheckResult, int i, List list, List list2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = draftCheckResult.fileCount;
        }
        if ((i3 & 2) != 0) {
            list = draftCheckResult.invalidFileList;
        }
        if ((i3 & 4) != 0) {
            list2 = draftCheckResult.invalidVEFileList;
        }
        if ((i3 & 8) != 0) {
            i2 = draftCheckResult.checkStage;
        }
        return draftCheckResult.copy(i, list, list2, i2);
    }

    public final int component1() {
        return this.fileCount;
    }

    public final List<DraftFileCheckResult> component2() {
        return this.invalidFileList;
    }

    public final List<DraftVECheckResult> component3() {
        return this.invalidVEFileList;
    }

    public final int component4() {
        return this.checkStage;
    }

    public final DraftCheckResult copy(int i, List<DraftFileCheckResult> list, List<DraftVECheckResult> list2, int i2) {
        C89219l.m154721d(list, "");
        return new DraftCheckResult(i, list, list2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftCheckResult)) {
            return false;
        }
        DraftCheckResult draftCheckResult = (DraftCheckResult) obj;
        return this.fileCount == draftCheckResult.fileCount && C89219l.m154714a(this.invalidFileList, draftCheckResult.invalidFileList) && C89219l.m154714a(this.invalidVEFileList, draftCheckResult.invalidVEFileList) && this.checkStage == draftCheckResult.checkStage;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m86185xffa08c7(this.fileCount) * 31;
        List<DraftFileCheckResult> list = this.invalidFileList;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_draft_model_DraftCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<DraftVECheckResult> list2 = this.invalidVEFileList;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((hashCode + i) * 31) + m86185xffa08c7(this.checkStage);
    }

    public final String toString() {
        return "DraftCheckResult(fileCount=" + this.fileCount + ", invalidFileList=" + this.invalidFileList + ", invalidVEFileList=" + this.invalidVEFileList + ", checkStage=" + this.checkStage + ")";
    }

    public final int getCheckStage() {
        return this.checkStage;
    }

    public final int getFileCount() {
        return this.fileCount;
    }

    public final List<DraftFileCheckResult> getInvalidFileList() {
        return this.invalidFileList;
    }

    public final List<DraftVECheckResult> getInvalidVEFileList() {
        return this.invalidVEFileList;
    }

    public final boolean isSuc() {
        List<DraftVECheckResult> list;
        if (this.fileCount <= 0 || !this.invalidFileList.isEmpty() || ((list = this.invalidVEFileList) != null && !list.isEmpty())) {
            return false;
        }
        return true;
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        if (!this.invalidFileList.isEmpty()) {
            return ((DraftFileCheckResult) C89070n.m154579f((List) this.invalidFileList)).getErrorCode();
        }
        List<DraftVECheckResult> list = this.invalidVEFileList;
        if (list == null || list.isEmpty()) {
            return -103;
        }
        return ((DraftVECheckResult) C89070n.m154579f((List) this.invalidVEFileList)).getErrorCode();
    }

    public DraftCheckResult(int i, List<DraftFileCheckResult> list, List<DraftVECheckResult> list2, int i2) {
        C89219l.m154721d(list, "");
        this.fileCount = i;
        this.invalidFileList = list;
        this.invalidVEFileList = list2;
        this.checkStage = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftCheckResult(int i, List list, List list2, int i2, int i3, C89214g gVar) {
        this(i, (i3 & 2) != 0 ? C89086z.INSTANCE : list, (i3 & 4) != 0 ? null : list2, (i3 & 8) != 0 ? 0 : i2);
    }
}
