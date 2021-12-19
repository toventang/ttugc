package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice */
public final class PostNotice {
    @AbstractC27891c(mo46611a = "aweme")
    private final Aweme aweme;

    static {
        Covode.recordClassIndex(72348);
    }

    public PostNotice() {
        this(null, 1, null);
    }

    public static /* synthetic */ PostNotice copy$default(PostNotice postNotice, Aweme aweme2, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme2 = postNotice.aweme;
        }
        return postNotice.copy(aweme2);
    }

    public final Aweme component1() {
        return this.aweme;
    }

    public final PostNotice copy(Aweme aweme2) {
        return new PostNotice(aweme2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PostNotice) && C89219l.m154714a(this.aweme, ((PostNotice) obj).aweme);
        }
        return true;
    }

    public final String toString() {
        return "PostNotice(aweme=" + this.aweme + ")";
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int hashCode() {
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            return aweme2.hashCode();
        }
        return 0;
    }

    public PostNotice(Aweme aweme2) {
        this.aweme = aweme2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostNotice(Aweme aweme2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : aweme2);
    }
}
