package com.bytedance.android.livesdk.chatroom.model.p495b;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.e */
public class C7666e {
    @AbstractC27891c(mo46611a = "fan_ticket")

    /* renamed from: a */
    public long f18999a;
    @AbstractC27891c(mo46611a = "linkmic_id")

    /* renamed from: b */
    public int f19000b;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: c */
    public User f19001c;
    @AbstractC27891c(mo46611a = "modify_time")

    /* renamed from: d */
    public long f19002d;
    @AbstractC27891c(mo46611a = "link_status")

    /* renamed from: e */
    public int f19003e;
    @AbstractC27891c(mo46611a = "link_type")

    /* renamed from: f */
    public int f19004f;
    @AbstractC27891c(mo46611a = "role_type")

    /* renamed from: g */
    public int f19005g;
    @AbstractC27891c(mo46611a = "payed_money")

    /* renamed from: h */
    public int f19006h;
    @AbstractC27891c(mo46611a = "link_duration")

    /* renamed from: i */
    public int f19007i;
    @AbstractC27891c(mo46611a = "linkmic_id_str")

    /* renamed from: j */
    public String f19008j;

    /* renamed from: k */
    public int f19009k;

    static {
        Covode.recordClassIndex(8448);
    }

    public int hashCode() {
        User user = this.f19001c;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public final String mo13898a() {
        if (TextUtils.isEmpty(this.f19008j)) {
            return String.valueOf(this.f19000b);
        }
        return this.f19008j;
    }

    public String toString() {
        return "LinkPlayerInfo{, mFanTicket=" + this.f18999a + ", mInteractId=" + this.f19000b + ", mUser=" + this.f19001c + ", mModifyTime=" + this.f19002d + ", mLinkStatus=" + this.f19003e + ", mLinkType=" + this.f19004f + ", mRoleType=" + this.f19005g + ", paidMoney=" + this.f19006h + ", linkDuration=" + this.f19007i + ", mInteractIdStr='" + this.f19008j + '\'' + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7666e eVar = (C7666e) obj;
            User user = this.f19001c;
            if (user == null || eVar.f19001c == null || !user.getIdStr().equals(eVar.f19001c.getIdStr())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
