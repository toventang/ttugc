package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.profile.model.PrivacySetting */
public final class PrivacySetting implements Serializable {
    @AbstractC27891c(mo46611a = "following_visibility")
    private final int followingVisibility;

    static {
        Covode.recordClassIndex(75196);
    }

    public PrivacySetting() {
        this(0, 1, null);
    }

    public final int getFollowingVisibility() {
        return this.followingVisibility;
    }

    public PrivacySetting(int i) {
        this.followingVisibility = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivacySetting(int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
