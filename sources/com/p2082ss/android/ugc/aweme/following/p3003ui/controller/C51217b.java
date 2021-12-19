package com.p2082ss.android.ugc.aweme.following.p3003ui.controller;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.TopRecommendVM;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74707c;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74760e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.controller.b */
public final class C51217b extends C51216a {

    /* renamed from: d */
    private final WeakReference<Fragment> f118142d;

    static {
        Covode.recordClassIndex(60421);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j, com.p2082ss.android.ugc.aweme.following.p3003ui.controller.C51216a
    /* renamed from: a */
    public final void mo86627a(User user) {
        C89219l.m154721d(user, "");
        C74707c.m131160d();
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j, com.p2082ss.android.ugc.aweme.following.p3003ui.controller.C51216a
    /* renamed from: a */
    public final void mo86628a(EnumC74761f fVar, EnumC74760e eVar, List<? extends User> list) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(eVar, "");
        C74707c.m131160d();
        Fragment fragment = this.f118142d.get();
        if (fragment != null && fragment.isResumed() && eVar == EnumC74760e.ON_AUTHORIZE && list != null && !list.isEmpty()) {
            if (fVar == EnumC74761f.CONTACT) {
                SmartRouter.buildRoute(fragment, "//friends/contacts").withParam("enter_from", "following_list").withParam("scene", 7).open();
            } else if (fVar == EnumC74761f.FACEBOOK) {
                SmartRouter.buildRoute(fragment, "//friend/find").withParam("enter_from", "following_list").withParam(StringSet.type, 3).withParam("scene", 7).open();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51217b(Fragment fragment, TopRecommendVM topRecommendVM, DmtStatusView dmtStatusView, AbstractC74788j jVar) {
        super(topRecommendVM, dmtStatusView, jVar);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(topRecommendVM, "");
        C89219l.m154721d(dmtStatusView, "");
        C89219l.m154721d(jVar, "");
        this.f118142d = new WeakReference<>(fragment);
    }
}
