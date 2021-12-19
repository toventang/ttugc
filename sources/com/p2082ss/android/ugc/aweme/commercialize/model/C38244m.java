package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.m */
public final class C38244m implements Serializable {
    @AbstractC27891c(mo46611a = "position_x")

    /* renamed from: a */
    private float f90360a;
    @AbstractC27891c(mo46611a = "position_y")

    /* renamed from: b */
    private float f90361b;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: c */
    private float f90362c;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: d */
    private float f90363d;
    @AbstractC27891c(mo46611a = "angle")

    /* renamed from: e */
    private float f90364e;
    @AbstractC27891c(mo46611a = "show_seconds")

    /* renamed from: f */
    private int f90365f;
    @AbstractC27891c(mo46611a = "sticker_url")

    /* renamed from: g */
    private String f90366g;
    @AbstractC27891c(mo46611a = "gecko_channel")

    /* renamed from: h */
    private List<String> f90367h;
    @AbstractC27891c(mo46611a = "sticker_data")

    /* renamed from: i */
    private String f90368i;

    static {
        Covode.recordClassIndex(45728);
    }

    public C38244m() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, null, null, 511, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77600xb2eb7eba(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.m */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38244m copy$default(C38244m mVar, float f, float f2, float f3, float f4, float f5, int i, String str, List list, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = mVar.f90360a;
        }
        if ((i2 & 2) != 0) {
            f2 = mVar.f90361b;
        }
        if ((i2 & 4) != 0) {
            f3 = mVar.f90362c;
        }
        if ((i2 & 8) != 0) {
            f4 = mVar.f90363d;
        }
        if ((i2 & 16) != 0) {
            f5 = mVar.f90364e;
        }
        if ((i2 & 32) != 0) {
            i = mVar.f90365f;
        }
        if ((i2 & 64) != 0) {
            str = mVar.f90366g;
        }
        if ((i2 & 128) != 0) {
            list = mVar.f90367h;
        }
        if ((i2 & 256) != 0) {
            str2 = mVar.f90368i;
        }
        return mVar.copy(f, f2, f3, f4, f5, i, str, list, str2);
    }

    public final float component1() {
        return this.f90360a;
    }

    public final float component2() {
        return this.f90361b;
    }

    public final float component3() {
        return this.f90362c;
    }

    public final float component4() {
        return this.f90363d;
    }

    public final float component5() {
        return this.f90364e;
    }

    public final int component6() {
        return this.f90365f;
    }

    public final String component7() {
        return this.f90366g;
    }

    public final List<String> component8() {
        return this.f90367h;
    }

    public final String component9() {
        return this.f90368i;
    }

    public final C38244m copy(float f, float f2, float f3, float f4, float f5, int i, String str, List<String> list, String str2) {
        return new C38244m(f, f2, f3, f4, f5, i, str, list, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38244m)) {
            return false;
        }
        C38244m mVar = (C38244m) obj;
        return Float.compare(this.f90360a, mVar.f90360a) == 0 && Float.compare(this.f90361b, mVar.f90361b) == 0 && Float.compare(this.f90362c, mVar.f90362c) == 0 && Float.compare(this.f90363d, mVar.f90363d) == 0 && Float.compare(this.f90364e, mVar.f90364e) == 0 && this.f90365f == mVar.f90365f && C89219l.m154714a(this.f90366g, mVar.f90366g) && C89219l.m154714a(this.f90367h, mVar.f90367h) && C89219l.m154714a(this.f90368i, mVar.f90368i);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((m77599xb2eb7eba(this.f90360a) * 31) + m77599xb2eb7eba(this.f90361b)) * 31) + m77599xb2eb7eba(this.f90362c)) * 31) + m77599xb2eb7eba(this.f90363d)) * 31) + m77599xb2eb7eba(this.f90364e)) * 31) + m77600xb2eb7eba(this.f90365f)) * 31;
        String str = this.f90366g;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.f90367h;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f90368i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AdStickerData(positionX=" + this.f90360a + ", positionY=" + this.f90361b + ", height=" + this.f90362c + ", width=" + this.f90363d + ", angle=" + this.f90364e + ", showSeconds=" + this.f90365f + ", stickerUrl=" + this.f90366g + ", geckoChannel=" + this.f90367h + ", stickerData=" + this.f90368i + ")";
    }

    public final float getAngle() {
        return this.f90364e;
    }

    public final List<String> getGeckoChannel() {
        return this.f90367h;
    }

    public final float getHeight() {
        return this.f90362c;
    }

    public final float getPositionX() {
        return this.f90360a;
    }

    public final float getPositionY() {
        return this.f90361b;
    }

    public final int getShowSeconds() {
        return this.f90365f;
    }

    public final String getStickerData() {
        return this.f90368i;
    }

    public final String getStickerUrl() {
        return this.f90366g;
    }

    public final float getWidth() {
        return this.f90363d;
    }

    public final void setAngle(float f) {
        this.f90364e = f;
    }

    public final void setGeckoChannel(List<String> list) {
        this.f90367h = list;
    }

    public final void setHeight(float f) {
        this.f90362c = f;
    }

    public final void setPositionX(float f) {
        this.f90360a = f;
    }

    public final void setPositionY(float f) {
        this.f90361b = f;
    }

    public final void setShowSeconds(int i) {
        this.f90365f = i;
    }

    public final void setStickerData(String str) {
        this.f90368i = str;
    }

    public final void setStickerUrl(String str) {
        this.f90366g = str;
    }

    public final void setWidth(float f) {
        this.f90363d = f;
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77599xb2eb7eba(float f) {
        return Float.floatToIntBits(f);
    }

    public C38244m(float f, float f2, float f3, float f4, float f5, int i, String str, List<String> list, String str2) {
        this.f90360a = f;
        this.f90361b = f2;
        this.f90362c = f3;
        this.f90363d = f4;
        this.f90364e = f5;
        this.f90365f = i;
        this.f90366g = str;
        this.f90367h = list;
        this.f90368i = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38244m(float f, float f2, float f3, float f4, float f5, int i, String str, List list, String str2, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) == 0 ? f5 : 0.0f, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : list, (i2 & 256) == 0 ? str2 : null);
    }
}
