package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AbstractC9918z;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.y */
public class C9895y extends AbstractC6571a {

    /* renamed from: a */
    public boolean f23930a;

    /* renamed from: f */
    public AbstractC9918z f23931f;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: g */
    public User f23932g;
    @AbstractC27891c(mo46611a = "to_user")

    /* renamed from: h */
    public User f23933h;
    @AbstractC27891c(mo46611a = "gift_id")

    /* renamed from: i */
    public long f23934i;
    @AbstractC27891c(mo46611a = "repeat_count")

    /* renamed from: j */
    public int f23935j;
    @AbstractC27891c(mo46611a = "fan_ticket_count")

    /* renamed from: k */
    public int f23936k;
    @AbstractC27891c(mo46611a = "room_fan_ticket_count")

    /* renamed from: l */
    long f23937l;
    @AbstractC27891c(mo46611a = "repeat_end")

    /* renamed from: m */
    public int f23938m;
    @AbstractC27891c(mo46611a = "combo_count")

    /* renamed from: n */
    public int f23939n;
    @AbstractC27891c(mo46611a = "group_count")

    /* renamed from: o */
    public int f23940o;
    @AbstractC27891c(mo46611a = "group_id")

    /* renamed from: p */
    public long f23941p;
    @AbstractC27891c(mo46611a = "text_effect")

    /* renamed from: q */
    public C9722cf f23942q;

    /* renamed from: r */
    public boolean f23943r;

    /* renamed from: s */
    public transient boolean f23944s;
    @AbstractC27891c(mo46611a = "gift")

    /* renamed from: t */
    public C9904t f23945t;
    @AbstractC27891c(mo46611a = "tray_info")

    /* renamed from: u */
    public GiftTrayInfo f23946u;

    /* renamed from: v */
    public String f23947v;
    @AbstractC27891c(mo46611a = "monitor_info")

    /* renamed from: w */
    public C9896z f23948w;

    static {
        Covode.recordClassIndex(11441);
    }

    public C9895y() {
        this.f28131L = EnumC9596a.GIFT;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        if (this.f23932g != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (this.f28134O == null || this.f28134O.f28144j == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        long j;
        StringBuilder append = new StringBuilder("GiftMessage{fromUserId=").append(this.f23932g).append(", toUserId=");
        User user = this.f23933h;
        if (user != null) {
            j = user.getId();
        } else {
            j = 0;
        }
        return append.append(j).append(", giftId=").append(this.f23934i).append(", repeatCount=").append(this.f23935j).append(", fanTicketCount=").append(this.f23936k).append(", repeatEnd=").append(this.f23938m).append(", comboCount=").append(this.f23939n).append(", groupCount=").append(this.f23940o).append(", groupId=").append(this.f23941p).append(", textEffect=").append(C4139e.C4140a.f11575b.mo46674b(this.f23942q)).append(", isUrgent=").append(this.f23943r).append(", isLocal=").append(this.f23944s).append('}').toString();
    }
}
