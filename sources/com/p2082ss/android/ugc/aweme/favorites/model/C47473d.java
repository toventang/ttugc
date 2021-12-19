package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.d */
public final class C47473d extends BaseResponse {
    @AbstractC27891c(mo46611a = "questions")

    /* renamed from: a */
    public List<C66504c> f110287a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public int f110288b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public int f110289c;
    @AbstractC27891c(mo46611a = "invalid_count")

    /* renamed from: d */
    public int f110290d;

    static {
        Covode.recordClassIndex(56087);
    }

    /* renamed from: a */
    public final boolean mo79748a() {
        if (this.f110289c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo79747a(boolean z) {
        this.f110289c = z ? 1 : 0;
    }
}
