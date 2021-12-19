package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AdGestureGuidance */
public final class AdGestureGuidance implements Serializable {
    @AbstractC27891c(mo46611a = "height")
    private float height;
    @AbstractC27891c(mo46611a = "image")
    private UrlModel image;
    @AbstractC27891c(mo46611a = "position_x")
    private float positionX;
    @AbstractC27891c(mo46611a = "position_y")
    private float positionY;
    @AbstractC27891c(mo46611a = "show_time")
    private float showTime;
    @AbstractC27891c(mo46611a = "width")
    private float width;

    static {
        Covode.recordClassIndex(58594);
    }

    public AdGestureGuidance() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 63, null);
    }

    public static /* synthetic */ AdGestureGuidance copy$default(AdGestureGuidance adGestureGuidance, float f, float f2, float f3, float f4, float f5, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            f = adGestureGuidance.showTime;
        }
        if ((i & 2) != 0) {
            f2 = adGestureGuidance.positionX;
        }
        if ((i & 4) != 0) {
            f3 = adGestureGuidance.positionY;
        }
        if ((i & 8) != 0) {
            f4 = adGestureGuidance.width;
        }
        if ((i & 16) != 0) {
            f5 = adGestureGuidance.height;
        }
        if ((i & 32) != 0) {
            urlModel = adGestureGuidance.image;
        }
        return adGestureGuidance.copy(f, f2, f3, f4, f5, urlModel);
    }

    public final float component1() {
        return this.showTime;
    }

    public final float component2() {
        return this.positionX;
    }

    public final float component3() {
        return this.positionY;
    }

    public final float component4() {
        return this.width;
    }

    public final float component5() {
        return this.height;
    }

    public final UrlModel component6() {
        return this.image;
    }

    public final AdGestureGuidance copy(float f, float f2, float f3, float f4, float f5, UrlModel urlModel) {
        return new AdGestureGuidance(f, f2, f3, f4, f5, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdGestureGuidance)) {
            return false;
        }
        AdGestureGuidance adGestureGuidance = (AdGestureGuidance) obj;
        return Float.compare(this.showTime, adGestureGuidance.showTime) == 0 && Float.compare(this.positionX, adGestureGuidance.positionX) == 0 && Float.compare(this.positionY, adGestureGuidance.positionY) == 0 && Float.compare(this.width, adGestureGuidance.width) == 0 && Float.compare(this.height, adGestureGuidance.height) == 0 && C89219l.m154714a(this.image, adGestureGuidance.image);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((m93155x7d33bd6(this.showTime) * 31) + m93155x7d33bd6(this.positionX)) * 31) + m93155x7d33bd6(this.positionY)) * 31) + m93155x7d33bd6(this.width)) * 31) + m93155x7d33bd6(this.height)) * 31;
        UrlModel urlModel = this.image;
        return com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        return "AdGestureGuidance(showTime=" + this.showTime + ", positionX=" + this.positionX + ", positionY=" + this.positionY + ", width=" + this.width + ", height=" + this.height + ", image=" + this.image + ")";
    }

    public final float getHeight() {
        return this.height;
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final float getShowTime() {
        return this.showTime;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setImage(UrlModel urlModel) {
        this.image = urlModel;
    }

    public final void setPositionX(float f) {
        this.positionX = f;
    }

    public final void setPositionY(float f) {
        this.positionY = f;
    }

    public final void setShowTime(float f) {
        this.showTime = f;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93155x7d33bd6(float f) {
        return Float.floatToIntBits(f);
    }

    public AdGestureGuidance(float f, float f2, float f3, float f4, float f5, UrlModel urlModel) {
        this.showTime = f;
        this.positionX = f2;
        this.positionY = f3;
        this.width = f4;
        this.height = f5;
        this.image = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdGestureGuidance(float f, float f2, float f3, float f4, float f5, UrlModel urlModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) == 0 ? f5 : 0.0f, (i & 32) != 0 ? null : urlModel);
    }
}
