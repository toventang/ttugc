package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.b */
public final class C47471b {
    @AbstractC27891c(mo46611a = "ch_list")

    /* renamed from: a */
    public List<Challenge> f110280a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public int f110281b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public int f110282c;

    static {
        Covode.recordClassIndex(56085);
    }

    /* renamed from: a */
    public final boolean mo79744a() {
        if (this.f110282c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo79743a(boolean z) {
        this.f110282c = z ? 1 : 0;
    }
}
