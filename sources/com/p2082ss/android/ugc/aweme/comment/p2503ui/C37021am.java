package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.am */
final /* synthetic */ class C37021am implements AbstractC34543f {

    /* renamed from: a */
    private final C37157k f87197a;

    /* renamed from: b */
    private final Comment f87198b;

    static {
        Covode.recordClassIndex(44375);
    }

    C37021am(C37157k kVar, Comment comment) {
        this.f87197a = kVar;
        this.f87198b = comment;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: b */
    public final void mo57674b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: a */
    public final void mo57673a() {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC37026ar(this.f87197a, this.f87198b), 500);
    }
}
