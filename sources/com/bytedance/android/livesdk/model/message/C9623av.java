package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.av */
public class C9623av extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public User f23424a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: f */
    public C9698b f23425f;
    @AbstractC27891c(mo46611a = "describe")

    /* renamed from: g */
    public C9698b f23426g;
    @AbstractC27891c(mo46611a = "combo_count")

    /* renamed from: h */
    public int f23427h;
    @AbstractC27891c(mo46611a = "group_count")

    /* renamed from: i */
    public int f23428i;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: j */
    public ImageModel f23429j;

    static {
        Covode.recordClassIndex(11165);
    }

    public C9623av() {
        this.f28131L = EnumC9596a.TRAY_MESSAGE;
    }
}
