package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.c */
public final class C47472c {
    @AbstractC27891c(mo46611a = "comment_list")

    /* renamed from: a */
    public List<? extends Comment> f110283a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public int f110284b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public int f110285c;
    @AbstractC27891c(mo46611a = "invalid_count")

    /* renamed from: d */
    public int f110286d;

    static {
        Covode.recordClassIndex(56086);
    }

    /* renamed from: a */
    public final boolean mo79746a() {
        if (this.f110285c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo79745a(boolean z) {
        this.f110285c = z ? 1 : 0;
    }
}
