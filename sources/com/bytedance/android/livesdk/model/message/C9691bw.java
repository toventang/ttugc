package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bw */
public class C9691bw extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    public String f23600a;
    @AbstractC27891c(mo46611a = "notify_type")

    /* renamed from: f */
    public long f23601f;
    @AbstractC27891c(mo46611a = "notify_class")

    /* renamed from: g */
    public int f23602g;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: h */
    public String f23603h;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: i */
    public RoomNotifyMessageExtra f23604i;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: j */
    public User f23605j;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: k */
    public String f23606k;

    /* renamed from: l */
    public long f23607l;

    /* renamed from: m */
    public boolean f23608m;

    /* renamed from: n */
    public ImageModel f23609n;

    static {
        Covode.recordClassIndex(11233);
    }

    public C9691bw() {
        this.f28131L = EnumC9596a.ROOM_NOTIFY;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (this.f28134O == null || this.f28134O.f28144j == null) {
            return false;
        }
        return true;
    }
}
