package com.p2082ss.android.ugc.aweme.sticker.repository.internals;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.p950a.AbstractC14403a;
import com.bytedance.cukaie.closet.p950a.AbstractC14404b;
import com.bytedance.cukaie.closet.p950a.AbstractC14405c;

@AbstractC14403a(mo23216a = "av_settings.xml")
/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences */
public interface StickerPreferences {
    static {
        Covode.recordClassIndex(88673);
    }

    @AbstractC14405c(mo23218a = "time_auto_apply_sticker")
    long getAutoApplyStickerTime(long j);

    @AbstractC14405c(mo23218a = "setting_bubble_guide_shown")
    boolean getBubbleGuideShown(boolean z);

    @AbstractC14405c(mo23218a = "setting_sticker_first")
    boolean getStickerFirst(boolean z);

    @AbstractC14404b(mo23217a = "time_auto_apply_sticker")
    void setAutoApplyStickerTime(long j);

    @AbstractC14404b(mo23217a = "setting_bubble_guide_shown")
    void setBubbleGuideShown(boolean z);

    @AbstractC14404b(mo23217a = "setting_sticker_first")
    void setStickerFirst(boolean z);
}
