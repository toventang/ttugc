package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public final class DefaultDonationStickerPosition {
    private static final C9300a Companion = new C9300a((byte) 0);
    public static final float DEFAULT_POSITION = 0.5f;
    @AbstractC27891c(mo46611a = "x_ratio")
    private final float xRatio;
    @AbstractC27891c(mo46611a = "y_ratio")
    private final float yRatio;

    public static final float getDEFAULT_POSITION() {
        return DEFAULT_POSITION;
    }

    /* renamed from: com.bytedance.android.livesdk.live.model.DefaultDonationStickerPosition$a */
    static final class C9300a {
        static {
            Covode.recordClassIndex(10225);
        }

        private C9300a() {
        }

        public /* synthetic */ C9300a(byte b) {
            this();
        }
    }

    public final float getXRatio() {
        return this.xRatio;
    }

    public final float getYRatio() {
        return this.yRatio;
    }

    public DefaultDonationStickerPosition() {
        float f = DEFAULT_POSITION;
        this.xRatio = f;
        this.yRatio = f;
    }

    static {
        Covode.recordClassIndex(10224);
    }
}
