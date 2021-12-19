package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.livesdk.gift.C8788b;
import com.bytedance.android.livesdk.livesetting.gift.TTliveStartGiftLocalDefaultSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.live.broadcast.model.f */
public final class C3260f {
    @AbstractC27891c(mo46611a = "show_gift_setting_switch")

    /* renamed from: a */
    public int f9326a;
    @AbstractC27891c(mo46611a = "live_commercial")

    /* renamed from: b */
    public boolean f9327b;
    @AbstractC27891c(mo46611a = "show_promote")

    /* renamed from: c */
    public boolean f9328c;
    @AbstractC27891c(mo46611a = "live_ba_link")

    /* renamed from: d */
    public boolean f9329d;
    @AbstractC27891c(mo46611a = "play_back")

    /* renamed from: e */
    public int f9330e;
    @AbstractC27891c(mo46611a = "transaction_history")

    /* renamed from: f */
    public int f9331f;

    static {
        Covode.recordClassIndex(3742);
    }

    /* renamed from: b */
    public final boolean mo8601b() {
        int i = this.f9326a;
        if (i == 1 || i == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo8600a() {
        int i = this.f9326a;
        if (i == 3) {
            return true;
        }
        if (i == 4 || i == 5 || i != 1) {
            return false;
        }
        if (TTliveStartGiftLocalDefaultSetting.INSTANCE.getValue()) {
            return C8788b.m17097a();
        }
        return true;
    }
}
