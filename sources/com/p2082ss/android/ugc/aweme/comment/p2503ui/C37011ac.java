package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.ac */
public final /* synthetic */ class C37011ac implements AbstractC34543f {

    /* renamed from: a */
    private final C37157k f87175a;

    /* renamed from: b */
    private final AbstractC36425k f87176b;

    /* renamed from: c */
    private final Comment f87177c;

    static {
        Covode.recordClassIndex(44365);
    }

    C37011ac(C37157k kVar, AbstractC36425k kVar2, Comment comment) {
        this.f87175a = kVar;
        this.f87176b = kVar2;
        this.f87177c = comment;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: b */
    public final void mo57674b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: a */
    public final void mo57673a() {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC37031aw(this.f87175a, this.f87176b, this.f87177c), 500);
    }
}
