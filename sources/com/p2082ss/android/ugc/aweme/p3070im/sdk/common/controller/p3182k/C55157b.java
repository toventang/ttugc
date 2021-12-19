package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3182k;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.k.b */
public final class C55157b implements Serializable {
    @AbstractC27891c(mo46611a = "action")

    /* renamed from: a */
    private final int f126204a;

    static {
        Covode.recordClassIndex(64885);
    }

    /* renamed from: com_ss_android_ugc_aweme_im_sdk_common_controller_websocket_IMBusinessWsPayload_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m100868x6963e216(int i) {
        return i;
    }

    public static /* synthetic */ C55157b copy$default(C55157b bVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f126204a;
        }
        return bVar.copy(i);
    }

    public final int component1() {
        return this.f126204a;
    }

    public final C55157b copy(int i) {
        return new C55157b(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55157b) && this.f126204a == ((C55157b) obj).f126204a;
        }
        return true;
    }

    public final int hashCode() {
        return m100868x6963e216(this.f126204a);
    }

    public final String toString() {
        return "IMBusinessWsPayload(action=" + this.f126204a + ")";
    }

    public final int getAction() {
        return this.f126204a;
    }

    public C55157b(int i) {
        this.f126204a = i;
    }
}
