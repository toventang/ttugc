package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.bytedance.android.livesdk.model.message.bg */
public class C9670bg extends AbstractC6571a {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public int f23531a;
    @AbstractC27891c(mo46611a = "portal_id")

    /* renamed from: f */
    public long f23532f;
    @AbstractC27891c(mo46611a = "room_id")

    /* renamed from: g */
    public long f23533g;
    @AbstractC27891c(mo46611a = "portal_buy")

    /* renamed from: h */
    protected C9672b f23534h;
    @AbstractC27891c(mo46611a = "portal_invite")

    /* renamed from: i */
    protected C9674d f23535i;
    @AbstractC27891c(mo46611a = "portal_finish")

    /* renamed from: j */
    protected C9673c f23536j;
    @AbstractC27891c(mo46611a = "payload")

    /* renamed from: k */
    public AbstractC9671a f23537k;

    /* renamed from: com.bytedance.android.livesdk.model.message.bg$a */
    public interface AbstractC9671a {
        static {
            Covode.recordClassIndex(11213);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.bg$b */
    public static class C9672b implements AbstractC9671a {
        @AbstractC27891c(mo46611a = "sugar_daddy")

        /* renamed from: a */
        public User f23538a;

        static {
            Covode.recordClassIndex(11214);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.bg$c */
    public static class C9673c implements AbstractC9671a {
        @AbstractC27891c(mo46611a = "lucky_person")

        /* renamed from: a */
        public User f23539a;

        static {
            Covode.recordClassIndex(11215);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.bg$d */
    public static class C9674d implements AbstractC9671a {
        @AbstractC27891c(mo46611a = "invite_count_down")

        /* renamed from: a */
        public long f23540a;
        @AbstractC27891c(mo46611a = "reward_count_down")

        /* renamed from: b */
        public long f23541b;
        @AbstractC27891c(mo46611a = "sugar_daddy")

        /* renamed from: c */
        public User f23542c;
        @AbstractC27891c(mo46611a = "anchor")

        /* renamed from: d */
        public User f23543d;

        static {
            Covode.recordClassIndex(11216);
        }
    }

    static {
        Covode.recordClassIndex(11212);
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        return true;
    }

    public C9670bg() {
        this.f28131L = EnumC9596a.PORTAL_MESSAGE;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        C11778b bVar = this.f28134O;
        if (bVar == null || bVar.f28144j == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo16595c() {
        int i = this.f23531a;
        if (i == 1) {
            this.f23537k = this.f23534h;
        } else if (i == 2) {
            this.f23537k = this.f23535i;
        } else if (i == 3) {
            this.f23537k = this.f23536j;
        }
    }
}
