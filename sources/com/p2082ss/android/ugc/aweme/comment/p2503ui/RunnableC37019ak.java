package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.C36546n;
import com.p2082ss.android.ugc.aweme.comment.CommentViewModelImpl;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49676d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.ak */
public final /* synthetic */ class RunnableC37019ak implements Runnable {

    /* renamed from: a */
    private final C37157k f87193a;

    static {
        Covode.recordClassIndex(44373);
    }

    RunnableC37019ak(C37157k kVar) {
        this.f87193a = kVar;
    }

    public final void run() {
        C37157k kVar = this.f87193a;
        ActivityC0945e activity = kVar.getActivity();
        if (activity != null) {
            C49676d dVar = new C49676d(0);
            dVar.f114333b = kVar.f87573O;
            dVar.f114335d = activity.hashCode();
            dVar.f114334c = kVar.f87622b.getAid();
            AbstractC81915c.m141874a(dVar);
            C36546n nVar = ((CommentViewModelImpl) C1181ae.m3881a(C37157k.m74965a((Context) activity), (C1175ad.AbstractC1177b) null).mo3983a(CommentViewModelImpl.class)).f85428a;
            nVar.f86532b--;
            if (nVar.f86532b <= 0) {
                nVar.f86531a.setValue(false);
            }
        }
    }
}
