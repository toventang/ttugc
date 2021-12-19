package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.i */
public class C9878i extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "chat_id")

    /* renamed from: a */
    public long f23852a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: f */
    public String f23853f;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: g */
    public User f23854g;
    @AbstractC27891c(mo46611a = "visible_to_sender")

    /* renamed from: h */
    public boolean f23855h;
    @AbstractC27891c(mo46611a = "background_image")

    /* renamed from: i */
    public ImageModel f23856i;
    @AbstractC27891c(mo46611a = "full_screen_text_color")

    /* renamed from: j */
    public String f23857j = "#FF0000";

    /* renamed from: k */
    public transient String f23858k;

    static {
        Covode.recordClassIndex(11420);
    }

    public C9878i() {
        this.f28131L = EnumC9596a.CHAT;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (this.f28134O == null || this.f28134O.f28144j == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        if (this.f23854g == null || TextUtils.isEmpty(this.f23853f)) {
            return false;
        }
        return true;
    }
}
