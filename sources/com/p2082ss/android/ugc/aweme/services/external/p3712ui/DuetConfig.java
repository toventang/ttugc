package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.DuetConfig */
public final class DuetConfig {
    private Serializable author;
    private final boolean defaultUseMic;
    private String duetChallenge;
    private String duetFrom;
    private Integer duetGameScore;
    private Effect duetLayout;
    private int duetVideoHeight;
    private int duetVideoWidth;
    private final boolean isFromDuetButton;
    private final boolean isFromDuetSticker;
    private StickerDownloadConfig mStickerDownloadConfig;
    private int minDuration;
    private String mp4Path;
    private String originVideo;
    public String outputDir;
    private String wavPath;

    static {
        Covode.recordClassIndex(79850);
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z, boolean z2) {
        this(str, str2, str3, serializable, str4, i, z, z2, false, 256, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.DuetConfig$Builder */
    public static final class Builder {
        private DuetConfig config;

        static {
            Covode.recordClassIndex(79851);
        }

        public final DuetConfig build() {
            return this.config;
        }

        public Builder() {
            this.config = new DuetConfig("", "", "", new Serializable() {
                /* class com.p2082ss.android.ugc.aweme.services.external.p3712ui.DuetConfig.Builder.C678791 */

                static {
                    Covode.recordClassIndex(79852);
                }
            }, "", 0, false, false, false, 256, null);
        }

        public final Builder minDuration(int i) {
            this.config.setMinDuration(i);
            return this;
        }

        public Builder(DuetConfig duetConfig) {
            C89219l.m154721d(duetConfig, "");
            this.config = duetConfig;
        }

        public final Builder author(Serializable serializable) {
            C89219l.m154721d(serializable, "");
            this.config.setAuthor(serializable);
            return this;
        }

        public final Builder duetFrom(String str) {
            C89219l.m154721d(str, "");
            this.config.setDuetFrom(str);
            return this;
        }

        public final Builder mp4Path(String str) {
            C89219l.m154721d(str, "");
            this.config.setMp4Path(str);
            return this;
        }

        public final Builder originalVideo(String str) {
            C89219l.m154721d(str, "");
            this.config.setOriginVideo(str);
            return this;
        }

        public final Builder outputDir(String str) {
            C89219l.m154721d(str, "");
            this.config.setOutputDir(str);
            return this;
        }

        public final Builder wavPath(String str) {
            C89219l.m154721d(str, "");
            this.config.setWavPath(str);
            return this;
        }
    }

    public final Serializable getAuthor() {
        return this.author;
    }

    public final boolean getDefaultUseMic() {
        return this.defaultUseMic;
    }

    public final String getDuetChallenge() {
        return this.duetChallenge;
    }

    public final String getDuetFrom() {
        return this.duetFrom;
    }

    public final Integer getDuetGameScore() {
        return this.duetGameScore;
    }

    public final Effect getDuetLayout() {
        return this.duetLayout;
    }

    public final int getDuetVideoHeight() {
        return this.duetVideoHeight;
    }

    public final int getDuetVideoWidth() {
        return this.duetVideoWidth;
    }

    public final StickerDownloadConfig getMStickerDownloadConfig() {
        return this.mStickerDownloadConfig;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final boolean isFromDuetButton() {
        return this.isFromDuetButton;
    }

    public final boolean isFromDuetSticker() {
        return this.isFromDuetSticker;
    }

    public final String getOutputDir() {
        String str = this.outputDir;
        if (str == null) {
            C89219l.m154710a("outputDir");
        }
        return str;
    }

    public final void setDuetChallenge(String str) {
        this.duetChallenge = str;
    }

    public final void setDuetGameScore(Integer num) {
        this.duetGameScore = num;
    }

    public final void setDuetLayout(Effect effect) {
        this.duetLayout = effect;
    }

    public final void setDuetVideoHeight(int i) {
        this.duetVideoHeight = i;
    }

    public final void setDuetVideoWidth(int i) {
        this.duetVideoWidth = i;
    }

    public final void setMStickerDownloadConfig(StickerDownloadConfig stickerDownloadConfig) {
        this.mStickerDownloadConfig = stickerDownloadConfig;
    }

    public final void setMinDuration(int i) {
        this.minDuration = i;
    }

    public final void setAuthor(Serializable serializable) {
        C89219l.m154721d(serializable, "");
        this.author = serializable;
    }

    public final void setDuetFrom(String str) {
        C89219l.m154721d(str, "");
        this.duetFrom = str;
    }

    public final void setMp4Path(String str) {
        C89219l.m154721d(str, "");
        this.mp4Path = str;
    }

    public final void setOriginVideo(String str) {
        C89219l.m154721d(str, "");
        this.originVideo = str;
    }

    public final void setOutputDir(String str) {
        C89219l.m154721d(str, "");
        this.outputDir = str;
    }

    public final void setWavPath(String str) {
        C89219l.m154721d(str, "");
        this.wavPath = str;
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(serializable, "");
        C89219l.m154721d(str4, "");
        this.originVideo = str;
        this.mp4Path = str2;
        this.wavPath = str3;
        this.author = serializable;
        this.duetFrom = str4;
        this.minDuration = i;
        this.defaultUseMic = z;
        this.isFromDuetSticker = z2;
        this.isFromDuetButton = z3;
        this.duetGameScore = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z, boolean z2, boolean z3, int i2, C89214g gVar) {
        this(str, str2, str3, serializable, str4, i, z, z2, (i2 & 256) != 0 ? false : z3);
    }
}
