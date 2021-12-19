package com.p2082ss.android.ugc.aweme.feed.p2949i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.i.v */
public final class C49694v {

    /* renamed from: a */
    public final C84215n f114361a;

    /* renamed from: b */
    public final Aweme f114362b;

    /* renamed from: c */
    public final Aweme f114363c;

    static {
        Covode.recordClassIndex(58541);
    }

    /* renamed from: a */
    public final HashMap<String, String> mo81455a() {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        Aweme aweme = this.f114362b;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "be_null";
        }
        hashMap.put("current_aweme_id", str);
        hashMap.put("player_aweme_id", this.f114361a.f188111a);
        hashMap.put("current_aweme_order", C59208ac.m108764b(this.f114362b, 0));
        if (this.f114363c != null) {
            hashMap.put("player_aweme_find_in_cache", "1");
            hashMap.put("player_aweme_order", C59208ac.m108764b(this.f114363c, 0));
        } else {
            hashMap.put("player_aweme_find_in_cache", "0");
            hashMap.put("player_aweme_order", "be_null");
        }
        if (C89219l.m154714a((Object) hashMap.get("current_aweme_id"), (Object) hashMap.get("player_aweme_id"))) {
            hashMap.put("is_synchronize", "1");
        } else {
            hashMap.put("is_synchronize", "0");
        }
        return hashMap;
    }

    public C49694v(C84215n nVar, Aweme aweme, Aweme aweme2) {
        C89219l.m154721d(nVar, "");
        this.f114361a = nVar;
        this.f114362b = aweme;
        this.f114363c = aweme2;
    }
}
