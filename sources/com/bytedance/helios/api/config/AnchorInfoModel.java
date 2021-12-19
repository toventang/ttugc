package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class AnchorInfoModel {
    public static final C15327a Companion = new C15327a((byte) 0);
    @AbstractC27891c(mo46611a = "anchor_lifecycle")
    private final List<String> anchorLifeCycle;
    @AbstractC27891c(mo46611a = "anchor_page")
    private final String anchorPage;
    @AbstractC27891c(mo46611a = "anchor_time_delay")
    private final long anchorTimeDelay;
    @AbstractC27891c(mo46611a = "detection_page")
    private final String detectionPage;
    @AbstractC27891c(mo46611a = "max_anchor_check_count")
    private final int maxAnchorCheckCount;
    @AbstractC27891c(mo46611a = "monitor_events")
    private final List<String> monitorEvents;
    @AbstractC27891c(mo46611a = "remove_task_lifecycle")
    private final List<String> removeTaskLifeCycle;
    @AbstractC27891c(mo46611a = "skip_anchor_actions")
    private final List<String> skipAnchorActions;

    static {
        Covode.recordClassIndex(17558);
    }

    public AnchorInfoModel() {
        this(null, null, null, 0, 0, null, null, null, 255, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.AnchorInfoModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnchorInfoModel copy$default(AnchorInfoModel anchorInfoModel, String str, List list, List list2, long j, int i, String str2, List list3, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = anchorInfoModel.anchorPage;
        }
        if ((i2 & 2) != 0) {
            list = anchorInfoModel.anchorLifeCycle;
        }
        if ((i2 & 4) != 0) {
            list2 = anchorInfoModel.monitorEvents;
        }
        if ((i2 & 8) != 0) {
            j = anchorInfoModel.anchorTimeDelay;
        }
        if ((i2 & 16) != 0) {
            i = anchorInfoModel.maxAnchorCheckCount;
        }
        if ((i2 & 32) != 0) {
            str2 = anchorInfoModel.detectionPage;
        }
        if ((i2 & 64) != 0) {
            list3 = anchorInfoModel.removeTaskLifeCycle;
        }
        if ((i2 & 128) != 0) {
            list4 = anchorInfoModel.skipAnchorActions;
        }
        return anchorInfoModel.copy(str, list, list2, j, i, str2, list3, list4);
    }

    public final String component1() {
        return this.anchorPage;
    }

    public final List<String> component2() {
        return this.anchorLifeCycle;
    }

    public final List<String> component3() {
        return this.monitorEvents;
    }

    public final long component4() {
        return this.anchorTimeDelay;
    }

    public final int component5() {
        return this.maxAnchorCheckCount;
    }

    public final String component6() {
        return this.detectionPage;
    }

    public final List<String> component7() {
        return this.removeTaskLifeCycle;
    }

    public final List<String> component8() {
        return this.skipAnchorActions;
    }

    public final AnchorInfoModel copy(String str, List<String> list, List<String> list2, long j, int i, String str2, List<String> list3, List<String> list4) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(list3, "");
        C89219l.m154719c(list4, "");
        return new AnchorInfoModel(str, list, list2, j, i, str2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorInfoModel)) {
            return false;
        }
        AnchorInfoModel anchorInfoModel = (AnchorInfoModel) obj;
        return C89219l.m154714a(this.anchorPage, anchorInfoModel.anchorPage) && C89219l.m154714a(this.anchorLifeCycle, anchorInfoModel.anchorLifeCycle) && C89219l.m154714a(this.monitorEvents, anchorInfoModel.monitorEvents) && this.anchorTimeDelay == anchorInfoModel.anchorTimeDelay && this.maxAnchorCheckCount == anchorInfoModel.maxAnchorCheckCount && C89219l.m154714a(this.detectionPage, anchorInfoModel.detectionPage) && C89219l.m154714a(this.removeTaskLifeCycle, anchorInfoModel.removeTaskLifeCycle) && C89219l.m154714a(this.skipAnchorActions, anchorInfoModel.skipAnchorActions);
    }

    public final int hashCode() {
        String str = this.anchorPage;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.anchorLifeCycle;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.monitorEvents;
        int hashCode3 = list2 != null ? list2.hashCode() : 0;
        long j = this.anchorTimeDelay;
        int i2 = (((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.maxAnchorCheckCount) * 31;
        String str2 = this.detectionPage;
        int hashCode4 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list3 = this.removeTaskLifeCycle;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.skipAnchorActions;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "AnchorInfoModel(anchorPage=" + this.anchorPage + ", anchorLifeCycle=" + this.anchorLifeCycle + ", monitorEvents=" + this.monitorEvents + ", anchorTimeDelay=" + this.anchorTimeDelay + ", maxAnchorCheckCount=" + this.maxAnchorCheckCount + ", detectionPage=" + this.detectionPage + ", removeTaskLifeCycle=" + this.removeTaskLifeCycle + ", skipAnchorActions=" + this.skipAnchorActions + ")";
    }

    /* renamed from: com.bytedance.helios.api.config.AnchorInfoModel$a */
    public static final class C15327a {
        static {
            Covode.recordClassIndex(17559);
        }

        private C15327a() {
        }

        public /* synthetic */ C15327a(byte b) {
            this();
        }
    }

    public final List<String> getAnchorLifeCycle() {
        return this.anchorLifeCycle;
    }

    public final String getAnchorPage() {
        return this.anchorPage;
    }

    public final long getAnchorTimeDelay() {
        return this.anchorTimeDelay;
    }

    public final String getDetectionPage() {
        return this.detectionPage;
    }

    public final int getMaxAnchorCheckCount() {
        return this.maxAnchorCheckCount;
    }

    public final List<String> getMonitorEvents() {
        return this.monitorEvents;
    }

    public final List<String> getRemoveTaskLifeCycle() {
        return this.removeTaskLifeCycle;
    }

    public final List<String> getSkipAnchorActions() {
        return this.skipAnchorActions;
    }

    public AnchorInfoModel(String str, List<String> list, List<String> list2, long j, int i, String str2, List<String> list3, List<String> list4) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(list3, "");
        C89219l.m154719c(list4, "");
        this.anchorPage = str;
        this.anchorLifeCycle = list;
        this.monitorEvents = list2;
        this.anchorTimeDelay = j;
        this.maxAnchorCheckCount = i;
        this.detectionPage = str2;
        this.removeTaskLifeCycle = list3;
        this.skipAnchorActions = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnchorInfoModel(java.lang.String r12, java.util.List r13, java.util.List r14, long r15, int r17, java.lang.String r18, java.util.List r19, java.util.List r20, int r21, p4600h.p4611f.p4613b.C89214g r22) {
        /*
            r11 = this;
            r10 = r20
            r9 = r19
            r7 = r17
            r2 = r12
            r3 = r13
            r4 = r14
            r1 = r21
            r5 = r15
            r0 = r1 & 1
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0013
            r2 = r8
        L_0x0013:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0019
            h.a.z r3 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0019:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001f
            h.a.z r4 = p4600h.p4601a.C89086z.INSTANCE
        L_0x001f:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0025
            r5 = 3000(0xbb8, double:1.482E-320)
        L_0x0025:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002a
            r7 = 4
        L_0x002a:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x003f
        L_0x002e:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0034
            h.a.z r9 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0034:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            h.a.z r10 = p4600h.p4601a.C89086z.INSTANCE
        L_0x003a:
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            return
        L_0x003f:
            r8 = r18
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.AnchorInfoModel.<init>(java.lang.String, java.util.List, java.util.List, long, int, java.lang.String, java.util.List, java.util.List, int, h.f.b.g):void");
    }
}
