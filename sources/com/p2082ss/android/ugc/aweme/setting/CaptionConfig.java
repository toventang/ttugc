package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.setting.CaptionConfig */
public final class CaptionConfig {
    @AbstractC27891c(mo46611a = "max_lines")
    private final int maxLines;
    @AbstractC27891c(mo46611a = "words_per_line")
    private final int wordsPerLine;

    static {
        Covode.recordClassIndex(80125);
    }

    /* renamed from: com_ss_android_ugc_aweme_setting_CaptionConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120253xc301177a(int i) {
        return i;
    }

    public static /* synthetic */ CaptionConfig copy$default(CaptionConfig captionConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = captionConfig.maxLines;
        }
        if ((i3 & 2) != 0) {
            i2 = captionConfig.wordsPerLine;
        }
        return captionConfig.copy(i, i2);
    }

    public final int component1() {
        return this.maxLines;
    }

    public final int component2() {
        return this.wordsPerLine;
    }

    public final CaptionConfig copy(int i, int i2) {
        return new CaptionConfig(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionConfig)) {
            return false;
        }
        CaptionConfig captionConfig = (CaptionConfig) obj;
        return this.maxLines == captionConfig.maxLines && this.wordsPerLine == captionConfig.wordsPerLine;
    }

    public final int hashCode() {
        return (m120253xc301177a(this.maxLines) * 31) + m120253xc301177a(this.wordsPerLine);
    }

    public final String toString() {
        return "CaptionConfig(maxLines=" + this.maxLines + ", wordsPerLine=" + this.wordsPerLine + ")";
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getWordsPerLine() {
        return this.wordsPerLine;
    }

    public CaptionConfig(int i, int i2) {
        this.maxLines = i;
        this.wordsPerLine = i2;
    }
}
