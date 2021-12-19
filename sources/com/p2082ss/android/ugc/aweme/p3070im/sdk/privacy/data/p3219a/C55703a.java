package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.p3219a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a */
public final class C55703a implements Serializable {

    /* renamed from: a */
    private final int f127057a;

    /* renamed from: b */
    private final int f127058b;

    /* renamed from: c */
    private final int f127059c;

    static {
        Covode.recordClassIndex(65486);
    }

    /* renamed from: com_ss_android_ugc_aweme_im_sdk_privacy_data_model_ChatUserSetting_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m101446xf6ee3a(int i) {
        return i;
    }

    public static /* synthetic */ C55703a copy$default(C55703a aVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = aVar.f127057a;
        }
        if ((i4 & 2) != 0) {
            i2 = aVar.f127058b;
        }
        if ((i4 & 4) != 0) {
            i3 = aVar.f127059c;
        }
        return aVar.copy(i, i2, i3);
    }

    public final int component1() {
        return this.f127057a;
    }

    public final int component2() {
        return this.f127058b;
    }

    public final int component3() {
        return this.f127059c;
    }

    public final C55703a copy(int i, int i2, int i3) {
        return new C55703a(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55703a)) {
            return false;
        }
        C55703a aVar = (C55703a) obj;
        return this.f127057a == aVar.f127057a && this.f127058b == aVar.f127058b && this.f127059c == aVar.f127059c;
    }

    public final int hashCode() {
        return (((m101446xf6ee3a(this.f127057a) * 31) + m101446xf6ee3a(this.f127058b)) * 31) + m101446xf6ee3a(this.f127059c);
    }

    public final String toString() {
        return "ChatUserSetting(chatSet=" + this.f127057a + ", chatSettingsPanel=" + this.f127058b + ", chatUserType=" + this.f127059c + ")";
    }

    public final int getChatSet() {
        return this.f127057a;
    }

    public final int getChatSettingsPanel() {
        return this.f127058b;
    }

    public final int getChatUserType() {
        return this.f127059c;
    }

    public C55703a(int i, int i2, int i3) {
        this.f127057a = i;
        this.f127058b = i2;
        this.f127059c = i3;
    }
}
