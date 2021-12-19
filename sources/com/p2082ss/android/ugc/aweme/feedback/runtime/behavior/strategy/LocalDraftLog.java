package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.LocalDraftLog */
public final class LocalDraftLog {
    @AbstractC27891c(mo46611a = "created_at")
    private final String createdAt;
    @AbstractC27891c(mo46611a = "current_count")
    private final int currentCount;
    @AbstractC27891c(mo46611a = "available_size")
    private final String internalAvailable;
    @AbstractC27891c(mo46611a = "last_modified")
    private final String lastModified;
    @AbstractC27891c(mo46611a = StringSet.name)
    private final String name;
    @AbstractC27891c(mo46611a = "other_count_list")
    private final List<Integer> otherCountList;
    @AbstractC27891c(mo46611a = "total_count")
    private final int totalCount;

    static {
        Covode.recordClassIndex(59739);
    }

    public LocalDraftLog() {
        this(null, null, null, 0, 0, null, null, 127, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_LocalDraftLog_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m94827x93ee4b7d(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.LocalDraftLog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalDraftLog copy$default(LocalDraftLog localDraftLog, String str, String str2, String str3, int i, int i2, List list, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = localDraftLog.name;
        }
        if ((i3 & 2) != 0) {
            str2 = localDraftLog.createdAt;
        }
        if ((i3 & 4) != 0) {
            str3 = localDraftLog.lastModified;
        }
        if ((i3 & 8) != 0) {
            i = localDraftLog.currentCount;
        }
        if ((i3 & 16) != 0) {
            i2 = localDraftLog.totalCount;
        }
        if ((i3 & 32) != 0) {
            list = localDraftLog.otherCountList;
        }
        if ((i3 & 64) != 0) {
            str4 = localDraftLog.internalAvailable;
        }
        return localDraftLog.copy(str, str2, str3, i, i2, list, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.createdAt;
    }

    public final String component3() {
        return this.lastModified;
    }

    public final int component4() {
        return this.currentCount;
    }

    public final int component5() {
        return this.totalCount;
    }

    public final List<Integer> component6() {
        return this.otherCountList;
    }

    public final String component7() {
        return this.internalAvailable;
    }

    public final LocalDraftLog copy(String str, String str2, String str3, int i, int i2, List<Integer> list, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str4, "");
        return new LocalDraftLog(str, str2, str3, i, i2, list, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDraftLog)) {
            return false;
        }
        LocalDraftLog localDraftLog = (LocalDraftLog) obj;
        return C89219l.m154714a(this.name, localDraftLog.name) && C89219l.m154714a(this.createdAt, localDraftLog.createdAt) && C89219l.m154714a(this.lastModified, localDraftLog.lastModified) && this.currentCount == localDraftLog.currentCount && this.totalCount == localDraftLog.totalCount && C89219l.m154714a(this.otherCountList, localDraftLog.otherCountList) && C89219l.m154714a(this.internalAvailable, localDraftLog.internalAvailable);
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.createdAt;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.lastModified;
        int hashCode3 = (((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + m94827x93ee4b7d(this.currentCount)) * 31) + m94827x93ee4b7d(this.totalCount)) * 31;
        List<Integer> list = this.otherCountList;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.internalAvailable;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "LocalDraftLog(name=" + this.name + ", createdAt=" + this.createdAt + ", lastModified=" + this.lastModified + ", currentCount=" + this.currentCount + ", totalCount=" + this.totalCount + ", otherCountList=" + this.otherCountList + ", internalAvailable=" + this.internalAvailable + ")";
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getCurrentCount() {
        return this.currentCount;
    }

    public final String getInternalAvailable() {
        return this.internalAvailable;
    }

    public final String getLastModified() {
        return this.lastModified;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Integer> getOtherCountList() {
        return this.otherCountList;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public LocalDraftLog(String str, String str2, String str3, int i, int i2, List<Integer> list, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str4, "");
        this.name = str;
        this.createdAt = str2;
        this.lastModified = str3;
        this.currentCount = i;
        this.totalCount = i2;
        this.otherCountList = list;
        this.internalAvailable = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LocalDraftLog(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, int r14, java.util.List r15, java.lang.String r16, int r17, p4600h.p4611f.p4613b.C89214g r18) {
        /*
            r9 = this;
            r7 = r15
            r2 = r10
            r3 = r11
            r8 = r16
            r5 = r13
            r6 = r14
            r0 = r17 & 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x000e
            r2 = r4
        L_0x000e:
            r0 = r17 & 2
            if (r0 == 0) goto L_0x0013
            r3 = r4
        L_0x0013:
            r0 = r17 & 4
            if (r0 == 0) goto L_0x0033
        L_0x0017:
            r1 = r17 & 8
            r0 = 0
            if (r1 == 0) goto L_0x001d
            r5 = 0
        L_0x001d:
            r0 = r17 & 16
            if (r0 == 0) goto L_0x0022
            r6 = 0
        L_0x0022:
            r0 = r17 & 32
            if (r0 == 0) goto L_0x0028
            h.a.z r7 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0028:
            r0 = r17 & 64
            if (r0 == 0) goto L_0x002e
            java.lang.String r8 = "Unknown"
        L_0x002e:
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0033:
            r4 = r12
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.LocalDraftLog.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, java.util.List, java.lang.String, int, h.f.b.g):void");
    }
}
