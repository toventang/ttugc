package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50524a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.n */
final /* synthetic */ class View$OnClickListenerC50401n implements View.OnClickListener {

    /* renamed from: a */
    private final C50339m f116360a;

    static {
        Covode.recordClassIndex(59533);
    }

    View$OnClickListenerC50401n(C50339m mVar) {
        this.f116360a = mVar;
    }

    public final void onClick(View view) {
        User author;
        ClickAgent.onClick(view);
        C50339m mVar = this.f116360a;
        if (view.getId() == R.id.b6j) {
            mVar.f113958Q.mo60191a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", mVar.f113953L.getAid());
            if (view.getVisibility() != 4 && !C37699a.m76202E(mVar.f113953L) && !mVar.mo81288j() && mVar.f113953L != null && !mVar.f113953L.isDelete() && (author = mVar.f113953L.getAuthor()) != null && author.getFollowStatus() == 0 && !TextUtils.equals(author.getUid(), C31575b.m65865g().getCurUserId())) {
                if (mVar.f116250c != null && C37699a.m76314s(mVar.f113953L) && !C37699a.m76222Y(mVar.f113953L)) {
                    C38000g.m77050a().mo65877a(view.getContext(), mVar.f113953L);
                    C18129a.m33746a("draw_ad", "follow", mVar.f113953L.getAwemeRawAd()).mo28897a("anchor_id", C50339m.m94440a(mVar.f113953L)).mo28897a("room_id", C50339m.m94441b(mVar.f113953L)).mo28902c();
                }
                if (C37699a.m76255aa(mVar.f113953L) || C37699a.m76222Y(mVar.f113953L)) {
                    C38000g.m77050a().mo65880a(mVar.f113959R, mVar.f113953L, "plus_sign");
                }
                if (!C34719f.C34720a.f82009a.mo61395c()) {
                    new C79459a(mVar.f113959R).mo123050a(R.string.dcq).mo123053a();
                    return;
                }
                if (mVar.f113958Q != null) {
                    C49672ag agVar = new C49672ag(12, mVar.f113953L);
                    agVar.f114319e = "feed";
                    mVar.f113958Q.mo60191a("feed_internal_event", agVar);
                }
                if (C31575b.m65865g().isLogin()) {
                    C42066d.m84193a(author, 5);
                    mVar.mo85516b();
                    C50524a.m94705a(mVar.f113959R, mVar.f113959R.getString(R.string.kl, author.getNickname()), false, 0);
                }
            }
        }
    }
}
