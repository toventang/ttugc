package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.ab */
public final /* synthetic */ class C37010ab implements AbstractC34543f {

    /* renamed from: a */
    private final C37157k f87173a;

    /* renamed from: b */
    private final Comment f87174b;

    static {
        Covode.recordClassIndex(44364);
    }

    C37010ab(C37157k kVar, Comment comment) {
        this.f87173a = kVar;
        this.f87174b = comment;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: b */
    public final void mo57674b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: a */
    public final void mo57673a() {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC37032ax(this.f87173a, this.f87174b), 500);
    }
}
