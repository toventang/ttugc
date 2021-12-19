package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.j */
public class C9879j extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public User f23859a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: f */
    public String f23860f;
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: g */
    public String f23861g;
    @AbstractC27891c(mo46611a = "back_ground")

    /* renamed from: h */
    public ImageModel f23862h;
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: i */
    public long f23863i;
    @AbstractC27891c(mo46611a = "action_content")

    /* renamed from: j */
    public String f23864j;

    static {
        Covode.recordClassIndex(11421);
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return true;
    }

    public C9879j() {
        this.f28131L = EnumC9596a.COMMENT_IMAGE;
    }
}
