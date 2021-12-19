package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.model.message.ai */
public class C9605ai extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: a */
    public int f23313a;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: f */
    public int f23314f;
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: g */
    public int f23315g;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: h */
    public User f23316h;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: i */
    public String f23317i;
    @AbstractC27891c(mo46611a = "icons")

    /* renamed from: j */
    public List<ImageModel> f23318j;

    static {
        Covode.recordClassIndex(11147);
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return true;
    }

    public C9605ai() {
        this.f28131L = EnumC9596a.LIKE;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (!this.f16442c) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a, com.p2082ss.ugc.live.sdk.message.data.IMessage
    public long getMessageId() {
        return super.getMessageId();
    }

    public C9605ai(Boolean bool, User user) {
        this.f23316h = user;
        this.f28131L = EnumC9596a.LIKE;
        this.f16442c = bool.booleanValue();
    }
}
