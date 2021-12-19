package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.r */
public final class C42436r {
    @AbstractC27891c(mo46611a = "event_id")

    /* renamed from: a */
    public final String f98897a;
    @AbstractC27891c(mo46611a = "sentence")

    /* renamed from: b */
    public String f98898b = "";
    @AbstractC27891c(mo46611a = "hot_value")

    /* renamed from: c */
    public long f98899c;
    @AbstractC27891c(mo46611a = "rank_number")

    /* renamed from: d */
    public String f98900d;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: e */
    public String f98901e;
    @AbstractC27891c(mo46611a = "button_link")

    /* renamed from: f */
    public final String f98902f;
    @AbstractC27891c(mo46611a = "button_title")

    /* renamed from: g */
    public final String f98903g;

    static {
        Covode.recordClassIndex(50382);
    }

    public final int hashCode() {
        return this.f98898b.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchSpotInfo");
        if (!C89219l.m154714a((Object) this.f98898b, (Object) ((C42436r) obj).f98898b)) {
            return false;
        }
        return true;
    }
}
