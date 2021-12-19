package com.bytedance.android.live.base.model.p181c;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.model.C9897n;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.live.base.model.c.a */
public class C2965a extends Extra {
    @AbstractC27891c(mo46611a = "cost")

    /* renamed from: a */
    public long f8715a;
    @AbstractC27891c(mo46611a = "unread_extra")

    /* renamed from: b */
    public String f8716b;

    /* renamed from: c */
    transient C2966a f8717c;
    @AbstractC27891c(mo46611a = "max_time")

    /* renamed from: d */
    public long f8718d;
    @AbstractC27891c(mo46611a = "min_time")

    /* renamed from: e */
    public long f8719e;
    @AbstractC27891c(mo46611a = "req_id")

    /* renamed from: f */
    public String f8720f;
    @AbstractC27891c(mo46611a = "banner")

    /* renamed from: g */
    public C9897n f8721g;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: h */
    public int f8722h;
    @AbstractC27891c(mo46611a = "style")

    /* renamed from: i */
    public int f8723i;
    @AbstractC27891c(mo46611a = "hashtag_text")

    /* renamed from: j */
    public String f8724j;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: k */
    private C28022o f8725k;

    /* renamed from: com.bytedance.android.live.base.model.c.a$a */
    public static final class C2966a {
        @AbstractC27891c(mo46611a = "impr_id")

        /* renamed from: a */
        public String f8726a;

        static {
            Covode.recordClassIndex(3411);
        }
    }

    static {
        Covode.recordClassIndex(3410);
    }

    /* renamed from: a */
    public final C28022o mo7786a() {
        if (this.f8717c == null) {
            return this.f8725k;
        }
        C28022o j = C4139e.C4140a.f11575b.mo46661a(this.f8717c).mo46789j();
        this.f8725k = j;
        this.f8717c = null;
        return j;
    }
}
