package com.p2082ss.android.ugc.aweme.following.p3003ui.controller;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.TopRecommendVM;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74707c;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74760e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.controller.c */
public final class C51218c extends C51216a {
    static {
        Covode.recordClassIndex(60422);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j, com.p2082ss.android.ugc.aweme.following.p3003ui.controller.C51216a
    /* renamed from: a */
    public final void mo86627a(User user) {
        C89219l.m154721d(user, "");
        C74707c.m131160d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51218c(TopRecommendVM topRecommendVM, DmtStatusView dmtStatusView, AbstractC74788j jVar) {
        super(topRecommendVM, dmtStatusView, jVar);
        C89219l.m154721d(topRecommendVM, "");
        C89219l.m154721d(dmtStatusView, "");
        C89219l.m154721d(jVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j, com.p2082ss.android.ugc.aweme.following.p3003ui.controller.C51216a
    /* renamed from: a */
    public final void mo86628a(EnumC74761f fVar, EnumC74760e eVar, List<? extends User> list) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        C74707c.m131160d();
    }
}
