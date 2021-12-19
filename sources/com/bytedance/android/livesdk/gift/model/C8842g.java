package com.bytedance.android.livesdk.gift.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.gift.model.g */
public class C8842g {
    @AbstractC27891c(mo46611a = "group_count")

    /* renamed from: a */
    public int f21713a;
    @AbstractC27891c(mo46611a = "group_text")

    /* renamed from: b */
    public String f21714b;

    static {
        Covode.recordClassIndex(9723);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8842g) {
            C8842g gVar = (C8842g) obj;
            if (gVar.f21713a != this.f21713a || !TextUtils.equals(gVar.f21714b, this.f21714b)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
