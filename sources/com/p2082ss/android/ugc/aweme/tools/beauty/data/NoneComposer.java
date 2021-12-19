package com.p2082ss.android.ugc.aweme.tools.beauty.data;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.data.NoneComposer */
public final class NoneComposer {
    public static final C77883a Companion = new C77883a((byte) 0);
    private final String effectId;
    private final int iconResId;
    private final String itemName;
    private final String resourceId;

    static {
        Covode.recordClassIndex(90971);
    }

    public static /* synthetic */ NoneComposer copy$default(NoneComposer noneComposer, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = noneComposer.effectId;
        }
        if ((i2 & 2) != 0) {
            str2 = noneComposer.resourceId;
        }
        if ((i2 & 4) != 0) {
            i = noneComposer.iconResId;
        }
        if ((i2 & 8) != 0) {
            str3 = noneComposer.itemName;
        }
        return noneComposer.copy(str, str2, i, str3);
    }

    public final String component1() {
        return this.effectId;
    }

    public final String component2() {
        return this.resourceId;
    }

    public final int component3() {
        return this.iconResId;
    }

    public final String component4() {
        return this.itemName;
    }

    public final NoneComposer copy(String str, String str2, int i, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new NoneComposer(str, str2, i, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoneComposer)) {
            return false;
        }
        NoneComposer noneComposer = (NoneComposer) obj;
        return C89219l.m154714a(this.effectId, noneComposer.effectId) && C89219l.m154714a(this.resourceId, noneComposer.resourceId) && this.iconResId == noneComposer.iconResId && C89219l.m154714a(this.itemName, noneComposer.itemName);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.resourceId;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.iconResId) * 31;
        String str3 = this.itemName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "NoneComposer(effectId=" + this.effectId + ", resourceId=" + this.resourceId + ", iconResId=" + this.iconResId + ", itemName=" + this.itemName + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.data.NoneComposer$a */
    public static final class C77883a {
        static {
            Covode.recordClassIndex(90972);
        }

        private C77883a() {
        }

        public /* synthetic */ C77883a(byte b) {
            this();
        }
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public NoneComposer(String str, String str2, int i, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.effectId = str;
        this.resourceId = str2;
        this.iconResId = i;
        this.itemName = str3;
    }
}
