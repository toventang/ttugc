package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.i */
public class C7611i {
    @AbstractC27891c(mo46611a = "followed_list")

    /* renamed from: a */
    public List<Room> f18899a;
    @AbstractC27891c(mo46611a = "recommend_list")

    /* renamed from: b */
    public List<Room> f18900b;
    @AbstractC27891c(mo46611a = "rival_extra_infos")

    /* renamed from: c */
    public Map<Long, C7610h> f18901c;
    @AbstractC27891c(mo46611a = "auto_match_info")

    /* renamed from: d */
    public C7612a f18902d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.i$a */
    public static class C7612a {
        @AbstractC27891c(mo46611a = "title")

        /* renamed from: a */
        public String f18903a;
        @AbstractC27891c(mo46611a = "subtitle")

        /* renamed from: b */
        public String f18904b;
        @AbstractC27891c(mo46611a = "button")

        /* renamed from: c */
        public String f18905c;
        @AbstractC27891c(mo46611a = "match_valid")

        /* renamed from: d */
        public boolean f18906d;

        static {
            Covode.recordClassIndex(8387);
        }
    }

    static {
        Covode.recordClassIndex(8386);
    }
}
