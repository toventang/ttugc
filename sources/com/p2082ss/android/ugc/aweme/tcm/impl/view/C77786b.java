package com.p2082ss.android.ugc.aweme.tcm.impl.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77735b;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4075a.C77736a;
import com.p2082ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.view.b */
public final class C77786b implements AbstractC77735b {

    /* renamed from: a */
    private TcmCheckLayout f174425a;

    /* renamed from: b */
    private final ViewStub f174426b;

    static {
        Covode.recordClassIndex(90849);
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77735b
    /* renamed from: a */
    public final void mo121270a() {
        TcmCheckLayout tcmCheckLayout = this.f174425a;
        if (tcmCheckLayout != null) {
            tcmCheckLayout.removeAllViews();
            tcmCheckLayout.setVisibility(8);
        }
    }

    public C77786b(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        this.f174426b = viewStub;
    }

    @Override // com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77735b
    /* renamed from: a */
    public final void mo121271a(Aweme aweme) {
        User user;
        String str;
        Integer reviewStatus;
        User user2;
        Integer reviewStatus2;
        MethodCollector.m26663i(12299);
        AbstractC77727a a = C77736a.m135835a();
        String str2 = null;
        if (a != null) {
            user = a.mo65702b();
        } else {
            user = null;
        }
        if (aweme != null) {
            String authorUid = aweme.getAuthorUid();
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (!(!TextUtils.equals(authorUid, str) || aweme.getTcmInfo() == null || aweme.getTcmInfo().getReviewStatus() == null || (reviewStatus = aweme.getTcmInfo().getReviewStatus()) == null || reviewStatus.intValue() != 1)) {
                if (this.f174425a == null) {
                    if (this.f174426b.getParent() != null) {
                        this.f174426b.setLayoutResource(R.layout.b2w);
                        this.f174426b.setInflatedId(R.id.b19);
                        View inflate = this.f174426b.inflate();
                        if (inflate != null) {
                            this.f174425a = (TcmCheckLayout) inflate;
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tcm.impl.view.TcmCheckLayout");
                            MethodCollector.m26664o(12299);
                            throw nullPointerException;
                        }
                    } else {
                        this.f174425a = (TcmCheckLayout) this.f174426b.findViewById(R.id.b19);
                    }
                    this.f174425a = this.f174425a;
                }
                TcmCheckLayout tcmCheckLayout = this.f174425a;
                if (tcmCheckLayout != null) {
                    AbstractC77727a a2 = C77736a.m135835a();
                    if (a2 != null) {
                        user2 = a2.mo65702b();
                    } else {
                        user2 = null;
                    }
                    if (aweme != null) {
                        String authorUid2 = aweme.getAuthorUid();
                        if (user2 != null) {
                            str2 = user2.getUid();
                        }
                        if (!(!TextUtils.equals(authorUid2, str2) || aweme.getTcmInfo() == null || aweme.getTcmInfo().getReviewStatus() == null || (reviewStatus2 = aweme.getTcmInfo().getReviewStatus()) == null || reviewStatus2.intValue() != 1)) {
                            C1764a.m5927a(LayoutInflater.from(tcmCheckLayout.getContext()), R.layout.b2v, tcmCheckLayout, true);
                            tcmCheckLayout.setVisibility(0);
                            C39162r.m79460a("show_video_review", new C33744d().f79943a);
                            tcmCheckLayout.setOnClickListener(new TcmCheckLayout.View$OnClickListenerC77780a(tcmCheckLayout));
                            MethodCollector.m26664o(12299);
                            return;
                        }
                    }
                    tcmCheckLayout.setVisibility(8);
                    MethodCollector.m26664o(12299);
                    return;
                }
                MethodCollector.m26664o(12299);
                return;
            }
        }
        MethodCollector.m26664o(12299);
    }
}
