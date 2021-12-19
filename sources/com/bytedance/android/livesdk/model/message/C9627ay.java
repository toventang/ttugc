package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.model.utils.C9906a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.Comparator;

/* renamed from: com.bytedance.android.livesdk.model.message.ay */
public class C9627ay extends AbstractC6571a implements Comparator {
    @AbstractC27891c(mo46611a = "member_count")

    /* renamed from: a */
    public int f23443a;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: f */
    public User f23444f;
    @AbstractC27891c(mo46611a = "is_top_user")

    /* renamed from: g */
    public boolean f23445g;
    @AbstractC27891c(mo46611a = "action")

    /* renamed from: h */
    public int f23446h;
    @AbstractC27891c(mo46611a = "top_user_no")

    /* renamed from: i */
    public int f23447i;
    @AbstractC27891c(mo46611a = "operator")

    /* renamed from: j */
    public User f23448j;
    @AbstractC27891c(mo46611a = "is_set_to_admin")

    /* renamed from: k */
    public boolean f23449k;
    @AbstractC27891c(mo46611a = "rank_score")

    /* renamed from: l */
    public int f23450l;
    @AbstractC27891c(mo46611a = "enter_type")

    /* renamed from: m */
    public int f23451m;
    @AbstractC27891c(mo46611a = "action_description")

    /* renamed from: n */
    public String f23452n;
    @AbstractC27891c(mo46611a = "enter_effect_config")

    /* renamed from: o */
    public C9628a f23453o;
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: p */
    public long f23454p;
    @AbstractC27891c(mo46611a = "pop_str")

    /* renamed from: q */
    public String f23455q;
    @AbstractC27891c(mo46611a = "background_image_v2")

    /* renamed from: r */
    public ImageModel f23456r;
    @AbstractC27891c(mo46611a = "anchor_display_text")

    /* renamed from: s */
    public C9698b f23457s;
    @AbstractC27891c(mo46611a = "client_enter_source")

    /* renamed from: t */
    public String f23458t;
    @AbstractC27891c(mo46611a = "client_enter_type")

    /* renamed from: u */
    public String f23459u;
    @AbstractC27891c(mo46611a = "client_live_reason")

    /* renamed from: v */
    public String f23460v;
    @AbstractC27891c(mo46611a = "action_duration")

    /* renamed from: w */
    public Long f23461w;

    /* renamed from: x */
    public boolean f23462x;

    /* renamed from: y */
    public boolean f23463y = true;

    /* renamed from: com.bytedance.android.livesdk.model.message.ay$a */
    public static class C9628a {
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: a */
        public int f23464a;
        @AbstractC27891c(mo46611a = "icon")

        /* renamed from: b */
        public ImageModel f23465b;
        @AbstractC27891c(mo46611a = "text")

        /* renamed from: c */
        public C9698b f23466c;
        @AbstractC27891c(mo46611a = "badge")

        /* renamed from: d */
        public ImageModel f23467d;

        static {
            Covode.recordClassIndex(11170);
        }
    }

    static {
        Covode.recordClassIndex(11169);
    }

    public C9627ay() {
        this.f28131L = EnumC9596a.MEMBER;
    }

    public int hashCode() {
        return C9906a.m18207a(17, Long.valueOf(this.f28134O.f28138d));
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (!this.f23463y || this.f28134O == null || this.f28134O.f28144j == null || this.f23445g) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        if (this.f23444f == null) {
            return false;
        }
        if (this.f23462x || this.f23446h != 7) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MemberMessage{action=" + this.f23446h + ", enterType=" + this.f23451m + ", actionDescription='" + this.f23452n + '\'' + ", enterEffectConfig=" + this.f23453o + ", userId=" + this.f23454p + '}';
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9627ay) || this.f28134O.f28138d != ((C11777a) obj).f28134O.f28138d) {
            return false;
        }
        return true;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i = ((C9627ay) obj).f23450l;
        int i2 = ((C9627ay) obj2).f23450l;
        if (i == i2) {
            return -1;
        }
        return i - i2;
    }
}
