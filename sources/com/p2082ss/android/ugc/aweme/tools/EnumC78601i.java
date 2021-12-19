package com.p2082ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.i */
public enum EnumC78601i {
    EPIC {
        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final String description() {
            return "slowest";
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final float value() {
            return 0.333333f;
        }
    },
    SLOW {
        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final String description() {
            return "slower";
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final float value() {
            return 0.5f;
        }
    },
    NORMAL {
        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final String description() {
            return "normal";
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final float value() {
            return 1.0f;
        }
    },
    STORY_BOOM {
        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final String description() {
            return "story_boom";
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final float value() {
            return 1.5f;
        }
    },
    FAST {
        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final String description() {
            return "faster";
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final float value() {
            return 2.0f;
        }
    },
    LAPSE {
        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final String description() {
            return "fastest";
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.EnumC78601i
        public final float value() {
            return 3.0f;
        }
    };

    public abstract String description();

    public abstract float value();

    public String toString() {
        return description();
    }

    static {
        Covode.recordClassIndex(91735);
    }

    public static EnumC78601i fromValue(float f) {
        EnumC78601i iVar = EPIC;
        if (f == iVar.value()) {
            return iVar;
        }
        EnumC78601i iVar2 = SLOW;
        if (f == iVar2.value()) {
            return iVar2;
        }
        EnumC78601i iVar3 = NORMAL;
        if (f == iVar3.value()) {
            return iVar3;
        }
        EnumC78601i iVar4 = FAST;
        if (f == iVar4.value()) {
            return iVar4;
        }
        EnumC78601i iVar5 = LAPSE;
        if (f == iVar5.value()) {
            return iVar5;
        }
        EnumC78601i iVar6 = STORY_BOOM;
        if (f == iVar6.value()) {
            return iVar6;
        }
        return null;
    }

    /* synthetic */ EnumC78601i(byte b) {
        this();
    }
}
