package com.p2082ss.android.ugc.asve.p2213b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.asve.b.f */
public enum EnumC31024f {
    AS_OPTION_FLAG_PICTURE_SIZE((byte) 1),
    AS_OPTION_FLAG_FPS_RANGE((byte) 2),
    AS_OPTION_FLAG_MTK_3DNR((byte) 4),
    AS_OPTION_FLAG_FIRST_FRAME_NOT_INVERTED((byte) 8);
    

    /* renamed from: b */
    private final byte f74346b;

    public final byte getOption() {
        return this.f74346b;
    }

    static {
        Covode.recordClassIndex(37653);
    }

    private EnumC31024f(byte b) {
        this.f74346b = b;
    }
}
