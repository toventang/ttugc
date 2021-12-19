package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public final class ControlConfig {
    @AbstractC27891c(mo46611a = "condition_expression")
    private final String conditionExpression;
    @AbstractC27891c(mo46611a = "effect_expression")
    private final String effectExpression;
    @AbstractC27891c(mo46611a = "extra_info")
    private final Map<String, String> extraInfo;
    @AbstractC27891c(mo46611a = "filter_event_extra_info")
    private final boolean filterEventExtraInfo;
    @AbstractC27891c(mo46611a = "upload_alog")
    private final boolean uploadALog;
    @AbstractC27891c(mo46611a = "warning_type")
    private final String warningType;

    static {
        Covode.recordClassIndex(17563);
    }

    public ControlConfig() {
        this(null, null, null, null, false, false, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.ControlConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ControlConfig copy$default(ControlConfig controlConfig, String str, String str2, String str3, Map map, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = controlConfig.warningType;
        }
        if ((i & 2) != 0) {
            str2 = controlConfig.effectExpression;
        }
        if ((i & 4) != 0) {
            str3 = controlConfig.conditionExpression;
        }
        if ((i & 8) != 0) {
            map = controlConfig.extraInfo;
        }
        if ((i & 16) != 0) {
            z = controlConfig.uploadALog;
        }
        if ((i & 32) != 0) {
            z2 = controlConfig.filterEventExtraInfo;
        }
        return controlConfig.copy(str, str2, str3, map, z, z2);
    }

    public final String component1() {
        return this.warningType;
    }

    public final String component2() {
        return this.effectExpression;
    }

    public final String component3() {
        return this.conditionExpression;
    }

    public final Map<String, String> component4() {
        return this.extraInfo;
    }

    public final boolean component5() {
        return this.uploadALog;
    }

    public final boolean component6() {
        return this.filterEventExtraInfo;
    }

    public final ControlConfig copy(String str, String str2, String str3, Map<String, String> map, boolean z, boolean z2) {
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        return new ControlConfig(str, str2, str3, map, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlConfig)) {
            return false;
        }
        ControlConfig controlConfig = (ControlConfig) obj;
        return C89219l.m154714a(this.warningType, controlConfig.warningType) && C89219l.m154714a(this.effectExpression, controlConfig.effectExpression) && C89219l.m154714a(this.conditionExpression, controlConfig.conditionExpression) && C89219l.m154714a(this.extraInfo, controlConfig.extraInfo) && this.uploadALog == controlConfig.uploadALog && this.filterEventExtraInfo == controlConfig.filterEventExtraInfo;
    }

    public final int hashCode() {
        String str = this.warningType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.effectExpression;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.conditionExpression;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.extraInfo;
        if (map != null) {
            i = map.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.uploadALog;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.filterEventExtraInfo) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "ControlConfig(warningType=" + this.warningType + ", effectExpression=" + this.effectExpression + ", conditionExpression=" + this.conditionExpression + ", extraInfo=" + this.extraInfo + ", uploadALog=" + this.uploadALog + ", filterEventExtraInfo=" + this.filterEventExtraInfo + ")";
    }

    public final String getConditionExpression() {
        return this.conditionExpression;
    }

    public final String getEffectExpression() {
        return this.effectExpression;
    }

    public final Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    public final boolean getFilterEventExtraInfo() {
        return this.filterEventExtraInfo;
    }

    public final boolean getUploadALog() {
        return this.uploadALog;
    }

    public final String getWarningType() {
        return this.warningType;
    }

    public ControlConfig(String str, String str2, String str3, Map<String, String> map, boolean z, boolean z2) {
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.warningType = str;
        this.effectExpression = str2;
        this.conditionExpression = str3;
        this.extraInfo = map;
        this.uploadALog = z;
        this.filterEventExtraInfo = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ControlConfig(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map r12, boolean r13, boolean r14, int r15, p4600h.p4611f.p4613b.C89214g r16) {
        /*
            r8 = this;
            r6 = r13
            r3 = r10
            r7 = r14
            r2 = r9
            r0 = r15 & 1
            r5 = 0
            if (r0 == 0) goto L_0x000a
            r2 = r5
        L_0x000a:
            r0 = r15 & 2
            java.lang.String r4 = "true"
            if (r0 == 0) goto L_0x0011
            r3 = r4
        L_0x0011:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x002b
        L_0x0015:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x0029
        L_0x0019:
            r1 = r15 & 16
            r0 = 0
            if (r1 == 0) goto L_0x001f
            r6 = 0
        L_0x001f:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0024
            r7 = 0
        L_0x0024:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x0029:
            r5 = r12
            goto L_0x0019
        L_0x002b:
            r4 = r11
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.ControlConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean, int, h.f.b.g):void");
    }
}
