package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeConfig */
public final class ShareAwemeConfig {
    public static final Companion Companion = new Companion(null);
    private boolean autoPlay;
    private int borderRadius = C34728n.m70946a(4.0d);
    private boolean enablePlayControl;
    private float height = ((float) C34728n.m70946a(252.0d));
    private boolean isLoop;
    private boolean isMute = true;
    private boolean needResize;
    private boolean showMuteBtn;
    private boolean showTitle = true;
    private float width = ((float) C34728n.m70946a(158.0d));

    static {
        Covode.recordClassIndex(63457);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeConfig$Builder */
    public static final class Builder {
        private final ShareAwemeConfig mConfig = new ShareAwemeConfig();

        static {
            Covode.recordClassIndex(63458);
        }

        public final ShareAwemeConfig build() {
            return this.mConfig;
        }

        public final Builder autoPlay(boolean z) {
            this.mConfig.setAutoPlay(z);
            return this;
        }

        public final Builder borderRadius(int i) {
            this.mConfig.setBorderRadius(i);
            return this;
        }

        public final Builder enablePlayControl(boolean z) {
            this.mConfig.setEnablePlayControl(z);
            return this;
        }

        public final Builder height(float f) {
            this.mConfig.setHeight(f);
            return this;
        }

        public final Builder isLoop(boolean z) {
            this.mConfig.setLoop(z);
            return this;
        }

        public final Builder isMute(boolean z) {
            this.mConfig.setMute(z);
            return this;
        }

        public final Builder needResize(boolean z) {
            this.mConfig.setNeedResize(z);
            return this;
        }

        public final Builder showMuteBtn(boolean z) {
            this.mConfig.setShowMuteBtn(z);
            return this;
        }

        public final Builder showTitle(boolean z) {
            this.mConfig.setShowTitle(z);
            return this;
        }

        public final Builder width(float f) {
            this.mConfig.setWidth(f);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeConfig$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(63459);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final int getBorderRadius() {
        return this.borderRadius;
    }

    public final boolean getEnablePlayControl() {
        return this.enablePlayControl;
    }

    public final float getHeight() {
        return this.height;
    }

    public final boolean getNeedResize() {
        return this.needResize;
    }

    public final boolean getShowMuteBtn() {
        return this.showMuteBtn;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean isLoop() {
        return this.isLoop;
    }

    public final boolean isMute() {
        return this.isMute;
    }

    public final void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public final void setBorderRadius(int i) {
        this.borderRadius = i;
    }

    public final void setEnablePlayControl(boolean z) {
        this.enablePlayControl = z;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    public final void setMute(boolean z) {
        this.isMute = z;
    }

    public final void setNeedResize(boolean z) {
        this.needResize = z;
    }

    public final void setShowMuteBtn(boolean z) {
        this.showMuteBtn = z;
    }

    public final void setShowTitle(boolean z) {
        this.showTitle = z;
    }

    public final void setWidth(float f) {
        this.width = f;
    }
}
