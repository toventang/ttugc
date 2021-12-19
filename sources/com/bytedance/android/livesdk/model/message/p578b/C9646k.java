package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.b.k */
public final class C9646k {

    /* renamed from: e */
    public static final C9646k f23501e = new C9646k();

    /* renamed from: f */
    public static final C9646k f23502f = new C9646k();

    /* renamed from: g */
    public static final C9647a f23503g = new C9647a((byte) 0);
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: a */
    public long f23504a;
    @AbstractC27891c(mo46611a = "score")

    /* renamed from: b */
    public int f23505b;
    @AbstractC27891c(mo46611a = "nickname")

    /* renamed from: c */
    public String f23506c;
    @AbstractC27891c(mo46611a = "avatar_thumb")

    /* renamed from: d */
    public ImageModel f23507d;

    /* renamed from: com.bytedance.android.livesdk.model.message.b.k$a */
    public static final class C9647a {
        static {
            Covode.recordClassIndex(11189);
        }

        private C9647a() {
        }

        public /* synthetic */ C9647a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(11188);
    }

    public final String toString() {
        return "BattleUserArmy{userId=" + this.f23504a + ", score=" + this.f23505b + ", nickname='" + this.f23506c + '\'' + ", avatarThumb=" + this.f23507d + '}';
    }
}
