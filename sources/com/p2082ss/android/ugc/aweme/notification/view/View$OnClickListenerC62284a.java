package com.p2082ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.experiment.C46912et;
import com.p2082ss.android.ugc.aweme.experiment.C46913eu;
import com.p2082ss.android.ugc.aweme.experiment.C46927fd;
import com.p2082ss.android.ugc.aweme.experiment.C46928fe;
import com.p2082ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56359f;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56364g;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.logger.C58949c;
import com.p2082ss.android.ugc.aweme.main.IMainPageFragment;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61548d;
import com.p2082ss.android.ugc.aweme.notice.api.services.C61611b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.a */
public final class View$OnClickListenerC62284a implements View.OnClickListener {

    /* renamed from: a */
    public final ActivityC0945e f141371a;

    /* renamed from: b */
    public final Context f141372b;

    static {
        Covode.recordClassIndex(73064);
    }

    public View$OnClickListenerC62284a(Context context) {
        C89219l.m154721d(context, "");
        this.f141372b = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f141371a = (ActivityC0945e) context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C35434c.m72461a("mus_new_notification");
        C61611b.f139811a.mo99383d();
        if (!C56318b.m102311b()) {
            C56346e.m102333a();
        } else if (C56359f.m102344a("inbox_enter_perf_v1", 1.0f)) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (!(currentUserID == null || currentUserID.length() == 0 || C89219l.m154714a((Object) C56364g.f128567b, (Object) currentUserID))) {
                C56364g.f128567b = currentUserID;
                C56364g.f128566a = new C56364g.C56365a();
                C56364g.m102349a(C56364g.C56375k.f128590a);
            }
        }
        ScrollSwitchStateManager a = ScrollSwitchStateManager.C52950a.m97811a(this.f141371a);
        AVExternalServiceImpl.m113114a().enterFromService().setEnterFrom("NOTIFICATION");
        C61542b.m111463a(true);
        C61542b.m111470d(998);
        C58949c.f134187a = false;
        C58945a.C58947b.f134185a.f134176c = false;
        C58945a.C58947b.f134185a.f134180g = false;
        C68909c.f154156d = null;
        IMainPageFragment j = MainPageFragmentImpl.m43110j();
        j.mo37211c();
        String str = a.f121768j;
        if (!C89219l.m154714a((Object) str, (Object) "NOTIFICATION")) {
            AbstractC81915c.m141875b(new C61548d());
            j.mo37216h();
        }
        if (str != null) {
            j.mo37208a(str, "NOTIFICATION");
        }
        j.mo37206a(a);
        C29823c.m60080a(C17867d.m33078a(), "message", "click");
        C46928fe a2 = C46913eu.m90215a();
        if (a2 == null || a2.f109364d != 0) {
            C46927fd a3 = C51648a.f118980a.mo87295a(2);
            if (!C46912et.m90214a() ? a3.f109358a : !(!a3.f109358a && !a3.f109359b)) {
                C51648a.f118980a.mo87306a(a3, "notification_page", "auto", this.f141372b);
            }
        } else {
            int a4 = C51648a.f118980a.mo87293a("notification_page");
            if (a4 != 0) {
                if (TextUtils.equals("notification_page", "personal_homepage")) {
                    C63419ae.f143971a.updateProfilePermission(true);
                }
                Context context = this.f141372b;
                if (context != null && (context instanceof ActivityC0945e)) {
                    C51648a.f118980a.mo87303a(a4, "notification_page", (ActivityC0945e) context);
                }
            }
        }
        FollowFeedServiceImpl.m95503c().mo86501a();
    }
}
