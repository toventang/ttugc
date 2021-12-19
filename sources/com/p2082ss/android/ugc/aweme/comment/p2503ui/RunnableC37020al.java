package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.al */
public final /* synthetic */ class RunnableC37020al implements Runnable {

    /* renamed from: a */
    private final C37157k f87194a;

    /* renamed from: b */
    private final int f87195b;

    /* renamed from: c */
    private final Comment f87196c;

    static {
        Covode.recordClassIndex(44374);
    }

    RunnableC37020al(C37157k kVar, int i, Comment comment) {
        this.f87194a = kVar;
        this.f87195b = i;
        this.f87196c = comment;
    }

    public final void run() {
        int i;
        C37157k kVar = this.f87194a;
        int i2 = this.f87195b;
        Comment comment = this.f87196c;
        int i3 = -1;
        if (kVar.mo63708a()) {
            i3 = kVar.f87637u.mo4371k();
            i = kVar.f87637u.mo4374n();
        } else {
            i = -1;
        }
        if (new int[]{i3, i}[1] < i2 && kVar.f87637u != null) {
            kVar.f87637u.mo4347a(Math.max(0, i2 - 2), -kVar.f87585a);
        }
        if (kVar.f87622b.showReplyWithInsertCid()) {
            kVar.f87624d = comment;
            kVar.f87626j.setHint(C17867d.m33078a().getString(R.string.fa2, C80580in.m139676a(comment.getUser())));
            kVar.f87626j.setMaxLines(1);
            kVar.f87626j.setEllipsize(TextUtils.TruncateAt.END);
            kVar.f87627k.setIconRes(R.raw.icon_gift);
            kVar.f87627k.setAlpha(0.5f);
            kVar.f87627k.setOnClickListener(new View$OnClickListenerC37027as(kVar));
        }
    }
}
