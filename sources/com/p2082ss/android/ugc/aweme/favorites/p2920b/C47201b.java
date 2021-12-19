package com.p2082ss.android.ugc.aweme.favorites.p2920b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.b.b */
public final class C47201b {
    @AbstractC27891c(mo46611a = "sticker_list")

    /* renamed from: a */
    public List<C75445g> f109870a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public int f109871b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public int f109872c;

    static {
        Covode.recordClassIndex(55814);
    }

    /* renamed from: a */
    public final boolean mo79641a() {
        if (this.f109872c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo79640a(boolean z) {
        this.f109872c = z ? 1 : 0;
    }
}
