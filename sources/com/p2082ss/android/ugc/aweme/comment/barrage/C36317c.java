package com.p2082ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.c */
public final class C36317c extends Comment implements Serializable {

    /* renamed from: a */
    private boolean f85845a = true;

    /* renamed from: b */
    private boolean f85846b = true;

    /* renamed from: c */
    private final Aweme f85847c;

    /* renamed from: d */
    private final C36305b f85848d;

    static {
        Covode.recordClassIndex(43594);
    }

    public final Aweme getAweme() {
        return this.f85847c;
    }

    public final C36305b getMobParams() {
        return this.f85848d;
    }

    public final boolean isAnchorsFold() {
        return this.f85846b;
    }

    public final boolean isTaggedPeopleFold() {
        return this.f85845a;
    }

    public final void setAnchorsFold(boolean z) {
        this.f85846b = z;
    }

    public final void setTaggedPeopleFold(boolean z) {
        this.f85845a = z;
    }

    public C36317c(Aweme aweme, C36305b bVar) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(bVar, "");
        this.f85847c = aweme;
        this.f85848d = bVar;
    }
}
