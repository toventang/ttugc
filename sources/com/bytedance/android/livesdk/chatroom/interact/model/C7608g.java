package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.g */
public final class C7608g {
    @AbstractC27891c(mo46611a = "avatars")

    /* renamed from: a */
    public List<ImageModel> f18885a;
    @AbstractC27891c(mo46611a = "settings")

    /* renamed from: b */
    private String f18886b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.g$a */
    public static class C7609a {
        @AbstractC27891c(mo46611a = "except_match_time")

        /* renamed from: a */
        public int f18887a;
        @AbstractC27891c(mo46611a = "timeout_time")

        /* renamed from: b */
        public int f18888b;
        @AbstractC27891c(mo46611a = "round_time")

        /* renamed from: c */
        public int f18889c;
        @AbstractC27891c(mo46611a = "bubble_text_first_round")

        /* renamed from: d */
        public String f18890d;
        @AbstractC27891c(mo46611a = "bubble_text_second_round")

        /* renamed from: e */
        public String f18891e;
        @AbstractC27891c(mo46611a = "bubble_text_connecting")

        /* renamed from: f */
        public String f18892f;

        static {
            Covode.recordClassIndex(8384);
        }
    }

    static {
        Covode.recordClassIndex(8383);
    }

    /* renamed from: a */
    public final C7609a mo13843a() {
        if (m15623a((C7609a) C4139e.C4140a.f11576c.mo46670a(this.f18886b, C7609a.class))) {
            return (C7609a) C4139e.C4140a.f11576c.mo46670a(this.f18886b, C7609a.class);
        }
        C7609a aVar = new C7609a();
        aVar.f18887a = 16;
        aVar.f18888b = LiveFeedRefreshTimeSetting.DEFAULT;
        aVar.f18889c = 4;
        return aVar;
    }

    /* renamed from: a */
    private static boolean m15623a(C7609a aVar) {
        if (aVar != null && aVar.f18887a > 0 && aVar.f18888b > 0 && aVar.f18889c > 0) {
            return true;
        }
        return false;
    }
}
