package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo */
public final class AwemeToolFeedbackInfo {
    @AbstractC27891c(mo46611a = "cancel_count")
    private final int cancelCount;
    private final int count;
    @AbstractC27891c(mo46611a = "e_code")
    private final List<AwemeToolFeedbackECode> eCode;
    private final String name;
    @AbstractC27891c(mo46611a = "success_count")
    private final int successCount;

    static {
        Covode.recordClassIndex(59736);
    }

    public AwemeToolFeedbackInfo() {
        this(null, 0, 0, 0, null, 31, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_AwemeToolFeedbackInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m94825x26c6d081(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwemeToolFeedbackInfo copy$default(AwemeToolFeedbackInfo awemeToolFeedbackInfo, String str, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = awemeToolFeedbackInfo.name;
        }
        if ((i4 & 2) != 0) {
            i = awemeToolFeedbackInfo.count;
        }
        if ((i4 & 4) != 0) {
            i2 = awemeToolFeedbackInfo.successCount;
        }
        if ((i4 & 8) != 0) {
            i3 = awemeToolFeedbackInfo.cancelCount;
        }
        if ((i4 & 16) != 0) {
            list = awemeToolFeedbackInfo.eCode;
        }
        return awemeToolFeedbackInfo.copy(str, i, i2, i3, list);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.count;
    }

    public final int component3() {
        return this.successCount;
    }

    public final int component4() {
        return this.cancelCount;
    }

    public final List<AwemeToolFeedbackECode> component5() {
        return this.eCode;
    }

    public final AwemeToolFeedbackInfo copy(String str, int i, int i2, int i3, List<AwemeToolFeedbackECode> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        return new AwemeToolFeedbackInfo(str, i, i2, i3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeToolFeedbackInfo)) {
            return false;
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo = (AwemeToolFeedbackInfo) obj;
        return C89219l.m154714a(this.name, awemeToolFeedbackInfo.name) && this.count == awemeToolFeedbackInfo.count && this.successCount == awemeToolFeedbackInfo.successCount && this.cancelCount == awemeToolFeedbackInfo.cancelCount && C89219l.m154714a(this.eCode, awemeToolFeedbackInfo.eCode);
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (((((((str != null ? str.hashCode() : 0) * 31) + m94825x26c6d081(this.count)) * 31) + m94825x26c6d081(this.successCount)) * 31) + m94825x26c6d081(this.cancelCount)) * 31;
        List<AwemeToolFeedbackECode> list = this.eCode;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AwemeToolFeedbackInfo(name=" + this.name + ", count=" + this.count + ", successCount=" + this.successCount + ", cancelCount=" + this.cancelCount + ", eCode=" + this.eCode + ")";
    }

    public final int getCancelCount() {
        return this.cancelCount;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<AwemeToolFeedbackECode> getECode() {
        return this.eCode;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public AwemeToolFeedbackInfo(String str, int i, int i2, int i3, List<AwemeToolFeedbackECode> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.name = str;
        this.count = i;
        this.successCount = i2;
        this.cancelCount = i3;
        this.eCode = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeToolFeedbackInfo(String str, int i, int i2, int i3, List list, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? new ArrayList() : list);
    }
}
