package com.p2082ss.android.ugc.aweme.homepage.p3055ui.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry */
public final class SpecialTopicEntry {
    @AbstractC27891c(mo46611a = "child_viewable")
    private final boolean childViewable;
    @AbstractC27891c(mo46611a = "enable")
    private final boolean enable;
    @AbstractC27891c(mo46611a = "event_name")
    private final String eventName;
    @AbstractC27891c(mo46611a = "icon_url")
    private final String iconUrl;
    @AbstractC27891c(mo46611a = "landing_route")
    private final String landingRoute;
    @AbstractC27891c(mo46611a = "landing_type")
    private final String landingType;

    static {
        Covode.recordClassIndex(62859);
    }

    public SpecialTopicEntry() {
        this(false, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SpecialTopicEntry copy$default(SpecialTopicEntry specialTopicEntry, boolean z, boolean z2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = specialTopicEntry.enable;
        }
        if ((i & 2) != 0) {
            z2 = specialTopicEntry.childViewable;
        }
        if ((i & 4) != 0) {
            str = specialTopicEntry.eventName;
        }
        if ((i & 8) != 0) {
            str2 = specialTopicEntry.iconUrl;
        }
        if ((i & 16) != 0) {
            str3 = specialTopicEntry.landingType;
        }
        if ((i & 32) != 0) {
            str4 = specialTopicEntry.landingRoute;
        }
        return specialTopicEntry.copy(z, z2, str, str2, str3, str4);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final boolean component2() {
        return this.childViewable;
    }

    public final String component3() {
        return this.eventName;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final String component5() {
        return this.landingType;
    }

    public final String component6() {
        return this.landingRoute;
    }

    public final SpecialTopicEntry copy(boolean z, boolean z2, String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return new SpecialTopicEntry(z, z2, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialTopicEntry)) {
            return false;
        }
        SpecialTopicEntry specialTopicEntry = (SpecialTopicEntry) obj;
        return this.enable == specialTopicEntry.enable && this.childViewable == specialTopicEntry.childViewable && C89219l.m154714a(this.eventName, specialTopicEntry.eventName) && C89219l.m154714a(this.iconUrl, specialTopicEntry.iconUrl) && C89219l.m154714a(this.landingType, specialTopicEntry.landingType) && C89219l.m154714a(this.landingRoute, specialTopicEntry.landingRoute);
    }

    public final int hashCode() {
        boolean z = this.enable;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.childViewable) {
            i = 0;
        }
        int i6 = (i5 + i) * 31;
        String str = this.eventName;
        int i7 = 0;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.iconUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.landingType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.landingRoute;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return hashCode3 + i7;
    }

    public final String toString() {
        return "SpecialTopicEntry(enable=" + this.enable + ", childViewable=" + this.childViewable + ", eventName=" + this.eventName + ", iconUrl=" + this.iconUrl + ", landingType=" + this.landingType + ", landingRoute=" + this.landingRoute + ")";
    }

    public final boolean getChildViewable() {
        return this.childViewable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLandingRoute() {
        return this.landingRoute;
    }

    public final String getLandingType() {
        return this.landingType;
    }

    public SpecialTopicEntry(boolean z, boolean z2, String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.enable = z;
        this.childViewable = z2;
        this.eventName = str;
        this.iconUrl = str2;
        this.landingType = str3;
        this.landingRoute = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SpecialTopicEntry(boolean r8, boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, p4600h.p4611f.p4613b.C89214g r15) {
        /*
            r7 = this;
            r5 = r12
            r4 = r11
            r3 = r10
            r1 = r8
            r0 = r14 & 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r1 = 0
        L_0x000a:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x002a
        L_0x000e:
            r0 = r14 & 4
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0015
            r3 = r6
        L_0x0015:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x001a
            r4 = r6
        L_0x001a:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x001f
            r5 = r6
        L_0x001f:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0028:
            r6 = r13
            goto L_0x0023
        L_0x002a:
            r2 = r9
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.experiment.SpecialTopicEntry.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
