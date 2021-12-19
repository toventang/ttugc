package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.model.message.s */
public class C9889s extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "emote_list")

    /* renamed from: a */
    public List<EmoteModel> f23913a;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: f */
    public User f23914f;

    static {
        Covode.recordClassIndex(11431);
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        return false;
    }

    public C9889s() {
        this.f28131L = EnumC9596a.EMOTE_CHAT;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        List<EmoteModel> list;
        if (this.f23914f == null || (list = this.f23913a) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
