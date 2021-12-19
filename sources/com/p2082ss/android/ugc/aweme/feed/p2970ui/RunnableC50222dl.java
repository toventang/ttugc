package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.dl */
public final /* synthetic */ class RunnableC50222dl implements Runnable {

    /* renamed from: a */
    private final C50211dg f115978a;

    /* renamed from: b */
    private final int f115979b;

    static {
        Covode.recordClassIndex(59348);
    }

    RunnableC50222dl(C50211dg dgVar, int i) {
        this.f115978a = dgVar;
        this.f115979b = i;
    }

    public final void run() {
        String aid;
        C50211dg dgVar = this.f115978a;
        int i = this.f115979b;
        if (dgVar.f113961T == null) {
            return;
        }
        if (dgVar.f113953L == null || dgVar.f113953L.getExposeSharer() == null || C50211dg.m94230a(dgVar.f115959j)) {
            dgVar.f113961T.setVisibility(8);
            return;
        }
        dgVar.f115959j = dgVar.f113953L.getExposeSharer();
        if (dgVar.f115958i == null) {
            dgVar.f115958i = C51648a.f118980a.mo87329i();
            dgVar.f115958i.mo87468a(dgVar);
        }
        dgVar.mo85378a(false);
        dgVar.f115953d.setText(dgVar.f115959j.getNickname());
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        if (dgVar.f113953L == null) {
            aid = "no_aid";
        } else {
            aid = dgVar.f113953L.getAid();
        }
        C20766v a = C20761r.m39060a(C34735v.m70965a(dgVar.f115959j.getAvatar())).mo34179a(sb.append(aid).toString());
        a.f49098K = true;
        a.f49092E = dgVar.f115952c;
        a.mo34186c();
        if (dgVar.f113961T.getVisibility() != 8) {
            return;
        }
        if (dgVar.f115959j.isShowed()) {
            dgVar.f113961T.setVisibility(0);
        } else if (i == 3) {
            dgVar.f113961T.post(new RunnableC50223dm(dgVar));
        }
    }
}
