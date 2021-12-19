package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.DraftOperationLog */
public final class DraftOperationLog {
    @AbstractC27891c(mo46611a = "count")
    private final int count;
    @AbstractC27891c(mo46611a = "e_code")
    private final List<DraftOperationCode> errorCode;
    @AbstractC27891c(mo46611a = StringSet.name)
    private final String name;
    @AbstractC27891c(mo46611a = "success_count")
    private final int successCount;

    static {
        Covode.recordClassIndex(59738);
    }

    public DraftOperationLog() {
        this(null, 0, null, 0, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_DraftOperationLog_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m94826xb6e14a2d(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.DraftOperationLog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftOperationLog copy$default(DraftOperationLog draftOperationLog, String str, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = draftOperationLog.name;
        }
        if ((i3 & 2) != 0) {
            i = draftOperationLog.count;
        }
        if ((i3 & 4) != 0) {
            list = draftOperationLog.errorCode;
        }
        if ((i3 & 8) != 0) {
            i2 = draftOperationLog.successCount;
        }
        return draftOperationLog.copy(str, i, list, i2);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.count;
    }

    public final List<DraftOperationCode> component3() {
        return this.errorCode;
    }

    public final int component4() {
        return this.successCount;
    }

    public final DraftOperationLog copy(String str, int i, List<DraftOperationCode> list, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        return new DraftOperationLog(str, i, list, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftOperationLog)) {
            return false;
        }
        DraftOperationLog draftOperationLog = (DraftOperationLog) obj;
        return C89219l.m154714a(this.name, draftOperationLog.name) && this.count == draftOperationLog.count && C89219l.m154714a(this.errorCode, draftOperationLog.errorCode) && this.successCount == draftOperationLog.successCount;
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m94826xb6e14a2d(this.count)) * 31;
        List<DraftOperationCode> list = this.errorCode;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode + i) * 31) + m94826xb6e14a2d(this.successCount);
    }

    public final String toString() {
        return "DraftOperationLog(name=" + this.name + ", count=" + this.count + ", errorCode=" + this.errorCode + ", successCount=" + this.successCount + ")";
    }

    public final int getCount() {
        return this.count;
    }

    public final List<DraftOperationCode> getErrorCode() {
        return this.errorCode;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public DraftOperationLog(String str, int i, List<DraftOperationCode> list, int i2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.name = str;
        this.count = i;
        this.errorCode = list;
        this.successCount = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftOperationLog(String str, int i, List list, int i2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? C89086z.INSTANCE : list, (i3 & 8) != 0 ? 0 : i2);
    }
}
