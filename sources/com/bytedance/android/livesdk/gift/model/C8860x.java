package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.model.x */
public class C8860x {
    @AbstractC27891c(mo46611a = "list")

    /* renamed from: a */
    public C8864c f21801a;

    /* renamed from: com.bytedance.android.livesdk.gift.model.x$a */
    public static class C8861a {
        @AbstractC27891c(mo46611a = "id")

        /* renamed from: a */
        public long f21802a;
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: b */
        public int f21803b;
        @AbstractC27891c(mo46611a = "progress")

        /* renamed from: c */
        public int f21804c;
        @AbstractC27891c(mo46611a = "target")

        /* renamed from: d */
        public int f21805d;
        @AbstractC27891c(mo46611a = "gift")

        /* renamed from: e */
        public C8862a f21806e;

        /* renamed from: com.bytedance.android.livesdk.gift.model.x$a$a */
        public static class C8862a {
            @AbstractC27891c(mo46611a = StringSet.name)

            /* renamed from: a */
            public String f21807a;
            @AbstractC27891c(mo46611a = "icon")

            /* renamed from: b */
            public ImageModel f21808b;
            @AbstractC27891c(mo46611a = "diamond_count")

            /* renamed from: c */
            public int f21809c;
            @AbstractC27891c(mo46611a = StringSet.type)

            /* renamed from: d */
            public int f21810d;

            static {
                Covode.recordClassIndex(9743);
            }
        }

        static {
            Covode.recordClassIndex(9742);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.model.x$b */
    public static class C8863b {
        @AbstractC27891c(mo46611a = "avatar")

        /* renamed from: a */
        public ImageModel f21811a;

        static {
            Covode.recordClassIndex(9744);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.model.x$c */
    public static class C8864c {
        @AbstractC27891c(mo46611a = "status")

        /* renamed from: a */
        public int f21812a;
        @AbstractC27891c(mo46611a = "wishes")

        /* renamed from: b */
        public List<C8861a> f21813b;
        @AbstractC27891c(mo46611a = "contributors")

        /* renamed from: c */
        public List<C8863b> f21814c;
        @AbstractC27891c(mo46611a = "contributors_length")

        /* renamed from: d */
        public int f21815d;
        @AbstractC27891c(mo46611a = "description")

        /* renamed from: e */
        public String f21816e;

        static {
            Covode.recordClassIndex(9745);
        }
    }

    static {
        Covode.recordClassIndex(9741);
    }
}
