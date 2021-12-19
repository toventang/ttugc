package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.aw */
final /* synthetic */ class RunnableC37031aw implements Runnable {

    /* renamed from: a */
    private final C37157k f87217a;

    /* renamed from: b */
    private final AbstractC36425k f87218b;

    /* renamed from: c */
    private final Comment f87219c;

    static {
        Covode.recordClassIndex(44385);
    }

    RunnableC37031aw(C37157k kVar, AbstractC36425k kVar2, Comment comment) {
        this.f87217a = kVar;
        this.f87218b = kVar2;
        this.f87219c = comment;
    }

    public final void run() {
        this.f87217a.mo63743a(this.f87218b, this.f87219c);
    }
}
