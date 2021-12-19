package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4600h.C89376n;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.f */
public enum EnumC75311f {
    TextToQuestion,
    StickerPanel,
    Recommendation,
    Invitation,
    Favorite,
    Default;

    static {
        Covode.recordClassIndex(88228);
    }

    public final String getMobValue() {
        switch (C75312g.f169307a[ordinal()]) {
            case 1:
                return "text_to_question";
            case 2:
                return "sticker_panel";
            case 3:
                return "recommendation";
            case 4:
                return "invitation";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "favorite";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "default";
            default:
                throw new C89376n();
        }
    }
}
