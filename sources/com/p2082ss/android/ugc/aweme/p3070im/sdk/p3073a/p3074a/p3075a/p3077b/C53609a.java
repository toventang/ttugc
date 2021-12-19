package com.p2082ss.android.ugc.aweme.p3070im.sdk.p3073a.p3074a.p3075a.p3077b;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.p3073a.p3074a.p3075a.p3076a.C53607a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.DialogC69418s;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.a.a.a.b.a */
public final class C53609a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final AbstractC56223a f123030a;

    /* renamed from: b */
    private final HomePageDataViewModel f123031b;

    /* renamed from: c */
    private final MainPageDataViewModel f123032c;

    /* renamed from: d */
    private final DataCenter f123033d;

    /* renamed from: e */
    private final Fragment f123034e;

    static {
        Covode.recordClassIndex(63189);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(60, new RunnableC90250g(C53609a.class, "onDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @AbstractC90264r
    public final void onDislikeAwemeEvent(C49678f fVar) {
        User user;
        String str;
        String str2;
        int i;
        String g;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar, "");
        if (fVar.f114342b == 1 && fVar.f114341a) {
            this.f123030a.mo93043f();
            Aweme aweme = this.f123031b.f121745k;
            DoubleFragmentMainActivity doubleFragmentMainActivity = null;
            if (aweme != null) {
                user = aweme.getAuthor();
            } else {
                user = null;
            }
            C33744d dVar = new C33744d();
            Aweme aweme2 = this.f123031b.f121745k;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            C33744d a = dVar.mo59983a("group_id", str);
            if (user == null || (str2 = user.getUid()) == null) {
                str2 = "";
            }
            C33744d a2 = a.mo59983a("author_id", str2);
            if (user != null) {
                i = user.getFollowStatus();
            } else {
                i = -1;
            }
            C33744d a3 = a2.mo59980a("follow_status", i).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(this.f123031b.f121745k))).mo59983a("enter_from", this.f123032c.f121754b);
            C89219l.m154716b(a3, "");
            C76598h.m134177a(a3, this.f123031b.f121745k);
            C39162r.m79460a("click_trans_layer", C79900c.m138665a(a3, this.f123031b.f121745k, this.f123032c.f121754b).f79943a);
            this.f123030a.mo93041a(true);
            Aweme aweme3 = this.f123031b.f121745k;
            if (MSAdaptionService.m97895c().mo89377c(C17873f.m33102j())) {
                ActivityC0945e activity = this.f123034e.getActivity();
                if (activity instanceof DoubleFragmentMainActivity) {
                    doubleFragmentMainActivity = activity;
                }
                DoubleFragmentMainActivity doubleFragmentMainActivity2 = doubleFragmentMainActivity;
                if (doubleFragmentMainActivity2 == null || (g = doubleFragmentMainActivity2.getEnterFrom()) == null) {
                    g = "homepage_hot";
                }
            } else {
                g = this.f123030a.mo93044g();
            }
            Context requireContext = this.f123034e.requireContext();
            C89219l.m154716b(requireContext, "");
            C89219l.m154716b(g, "");
            C53607a aVar = new C53607a(DialogC69418s.C69419a.m122624a(requireContext, aweme3, g));
            DataCenter dataCenter = this.f123033d;
            Fragment fragment = this.f123034e;
            C89219l.m154721d(dataCenter, "");
            C89219l.m154721d(fragment, "");
            aVar.f123026a.mo85553c().setOnDismissListener(new C53607a.DialogInterface$OnDismissListenerC53608a(aVar, dataCenter, fragment));
            aVar.f123026a.mo85553c().show();
        }
    }

    public C53609a(AbstractC56223a aVar, HomePageDataViewModel homePageDataViewModel, MainPageDataViewModel mainPageDataViewModel, DataCenter dataCenter, Fragment fragment) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(homePageDataViewModel, "");
        C89219l.m154721d(mainPageDataViewModel, "");
        C89219l.m154721d(dataCenter, "");
        C89219l.m154721d(fragment, "");
        this.f123030a = aVar;
        this.f123031b = homePageDataViewModel;
        this.f123032c = mainPageDataViewModel;
        this.f123033d = dataCenter;
        this.f123034e = fragment;
        EventBus.m156966a(EventBus.m156962a(), this);
    }
}
