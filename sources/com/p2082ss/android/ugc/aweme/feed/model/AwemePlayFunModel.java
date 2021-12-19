package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel */
public final class AwemePlayFunModel implements Serializable {
    @AbstractC27891c(mo46611a = "angle")
    private final int angle;
    @AbstractC27891c(mo46611a = "end_duration")
    private final float endDuration;
    @AbstractC27891c(mo46611a = "image_info")
    private final UrlModel imageInfo;
    @AbstractC27891c(mo46611a = "position_x")
    private final float positionX;
    @AbstractC27891c(mo46611a = "position_y")
    private final float positionY;
    @AbstractC27891c(mo46611a = "show_duration")
    private final float showDuration;
    @AbstractC27891c(mo46611a = "show_time")
    private final float showTime;
    @AbstractC27891c(mo46611a = "start_duration")
    private final float startDuration;
    @AbstractC27891c(mo46611a = "tips")
    private final String tips;

    static {
        Covode.recordClassIndex(58631);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93164xa7daa05d(int i) {
        return i;
    }

    public static /* synthetic */ AwemePlayFunModel copy$default(AwemePlayFunModel awemePlayFunModel, UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = awemePlayFunModel.imageInfo;
        }
        if ((i2 & 2) != 0) {
            str = awemePlayFunModel.tips;
        }
        if ((i2 & 4) != 0) {
            f = awemePlayFunModel.startDuration;
        }
        if ((i2 & 8) != 0) {
            f2 = awemePlayFunModel.endDuration;
        }
        if ((i2 & 16) != 0) {
            f3 = awemePlayFunModel.showDuration;
        }
        if ((i2 & 32) != 0) {
            f4 = awemePlayFunModel.showTime;
        }
        if ((i2 & 64) != 0) {
            f5 = awemePlayFunModel.positionX;
        }
        if ((i2 & 128) != 0) {
            f6 = awemePlayFunModel.positionY;
        }
        if ((i2 & 256) != 0) {
            i = awemePlayFunModel.angle;
        }
        return awemePlayFunModel.copy(urlModel, str, f, f2, f3, f4, f5, f6, i);
    }

    public final UrlModel component1() {
        return this.imageInfo;
    }

    public final String component2() {
        return this.tips;
    }

    public final float component3() {
        return this.startDuration;
    }

    public final float component4() {
        return this.endDuration;
    }

    public final float component5() {
        return this.showDuration;
    }

    public final float component6() {
        return this.showTime;
    }

    public final float component7() {
        return this.positionX;
    }

    public final float component8() {
        return this.positionY;
    }

    public final int component9() {
        return this.angle;
    }

    public final AwemePlayFunModel copy(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        return new AwemePlayFunModel(urlModel, str, f, f2, f3, f4, f5, f6, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemePlayFunModel)) {
            return false;
        }
        AwemePlayFunModel awemePlayFunModel = (AwemePlayFunModel) obj;
        return C89219l.m154714a(this.imageInfo, awemePlayFunModel.imageInfo) && C89219l.m154714a(this.tips, awemePlayFunModel.tips) && Float.compare(this.startDuration, awemePlayFunModel.startDuration) == 0 && Float.compare(this.endDuration, awemePlayFunModel.endDuration) == 0 && Float.compare(this.showDuration, awemePlayFunModel.showDuration) == 0 && Float.compare(this.showTime, awemePlayFunModel.showTime) == 0 && Float.compare(this.positionX, awemePlayFunModel.positionX) == 0 && Float.compare(this.positionY, awemePlayFunModel.positionY) == 0 && this.angle == awemePlayFunModel.angle;
    }

    public final int hashCode() {
        UrlModel urlModel = this.imageInfo;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.tips;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((((((hashCode + i) * 31) + m93163xa7daa05d(this.startDuration)) * 31) + m93163xa7daa05d(this.endDuration)) * 31) + m93163xa7daa05d(this.showDuration)) * 31) + m93163xa7daa05d(this.showTime)) * 31) + m93163xa7daa05d(this.positionX)) * 31) + m93163xa7daa05d(this.positionY)) * 31) + m93164xa7daa05d(this.angle);
    }

    public final String toString() {
        return "AwemePlayFunModel(imageInfo=" + this.imageInfo + ", tips=" + this.tips + ", startDuration=" + this.startDuration + ", endDuration=" + this.endDuration + ", showDuration=" + this.showDuration + ", showTime=" + this.showTime + ", positionX=" + this.positionX + ", positionY=" + this.positionY + ", angle=" + this.angle + ")";
    }

    public final int getAngle() {
        return this.angle;
    }

    public final float getEndDuration() {
        return this.endDuration;
    }

    public final UrlModel getImageInfo() {
        return this.imageInfo;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final float getShowDuration() {
        return this.showDuration;
    }

    public final float getShowTime() {
        return this.showTime;
    }

    public final float getStartDuration() {
        return this.startDuration;
    }

    public final String getTips() {
        return this.tips;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93163xa7daa05d(float f) {
        return Float.floatToIntBits(f);
    }

    public AwemePlayFunModel(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.imageInfo = urlModel;
        this.tips = str;
        this.startDuration = f;
        this.endDuration = f2;
        this.showDuration = f3;
        this.showTime = f4;
        this.positionX = f5;
        this.positionY = f6;
        this.angle = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemePlayFunModel(UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, C89214g gVar) {
        this(urlModel, str, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.0f : f2, (i2 & 16) != 0 ? 0.0f : f3, (i2 & 32) != 0 ? 0.0f : f4, (i2 & 64) != 0 ? 0.0f : f5, (i2 & 128) != 0 ? 0.0f : f6, (i2 & 256) != 0 ? 0 : i);
    }
}
