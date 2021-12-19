package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49679g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.p2481cm.C36141a;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.share.model.C69329a;
import com.p2082ss.android.ugc.aweme.share.model.C69332d;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.ui.ab */
public final /* synthetic */ class C41350ab implements AbstractC1214u {

    /* renamed from: a */
    private final C41426z f96512a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f96513b;

    /* renamed from: c */
    private final HomePageDataViewModel f96514c;

    static {
        Covode.recordClassIndex(49245);
    }

    C41350ab(C41426z zVar, ScrollSwitchStateManager scrollSwitchStateManager, HomePageDataViewModel homePageDataViewModel) {
        this.f96512a = zVar;
        this.f96513b = scrollSwitchStateManager;
        this.f96514c = homePageDataViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        String aid;
        String str;
        C41426z zVar = this.f96512a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f96513b;
        HomePageDataViewModel homePageDataViewModel = this.f96514c;
        Integer num = (Integer) obj;
        num.intValue();
        String a = scrollSwitchStateManager.mo89335a(num.intValue());
        C63419ae.f143971a.preloadProfile(zVar.getActivity(), a);
        AbstractC81915c.m141874a(new C69332d(scrollSwitchStateManager.mo89350b("page_feed")));
        if (num.intValue() == 1) {
            AbstractC81915c.m141874a(new C69329a());
        }
        int i = zVar.f96640o;
        zVar.f96640o = num.intValue();
        if (TextUtils.isEmpty(C36141a.C36142a.f85377d)) {
            C36141a.C36142a.f85374a = a;
        }
        if (!TextUtils.equals(a, "page_feed")) {
            C58945a.C58947b.f134185a.f134176c = false;
            C58945a.C58947b.f134185a.f134180g = false;
        }
        if (!TextUtils.equals(a, "page_feed")) {
            C81079v.m140776O().mo123908B();
            C80749k.m140049a().mo123953b();
            zVar.f96636k.mo70464a(0L, 0L);
        }
        scrollSwitchStateManager.mo89335a(i);
        a.hashCode();
        if (a.equals("page_profile")) {
            AbstractC81915c.m141874a(new C49679g());
            if (AwemeChangeCallBack.m108593a(zVar.getActivity()) != null) {
                String c = homePageDataViewModel.mo89328c();
                String str2 = "";
                if (c == null) {
                    c = str2;
                }
                C39163s sVar = new C39163s();
                sVar.mo67941a("enter_from", c);
                if (!homePageDataViewModel.f121746l) {
                    zVar.getContext();
                    String q = zVar.mo70703q();
                    if (AwemeChangeCallBack.m108593a(zVar.getActivity()) == null) {
                        aid = str2;
                    } else {
                        aid = AwemeChangeCallBack.m108593a(zVar.getActivity()).getAid();
                    }
                    C39162r.m79459a("slide_left", "left", q, aid, sVar.mo67942a());
                    Aweme a2 = AwemeChangeCallBack.m108593a(zVar.getActivity());
                    String e = TextUtils.isEmpty(FeedParamProvider.C49809a.m93270a(zVar.getContext()).getVsResultId()) ? C59208ac.m108771e(a2) : FeedParamProvider.C49809a.m93270a(zVar.getContext()).getVsResultId();
                    String searchResultId = zVar.f96635j.getSearchResultId();
                    if (TextUtils.isEmpty(searchResultId)) {
                        searchResultId = C59208ac.m108771e(a2);
                    }
                    User user = null;
                    String str3 = null;
                    if (TextUtils.equals(c, "general_search") || TextUtils.equals(c, "search_result")) {
                        C67446h hVar = C67446h.f151111a;
                        if (a2 != null) {
                            user = a2.getAuthor();
                        }
                        str3 = hVar.mo106193a(user, zVar.getContext());
                    }
                    C59252q qVar = (C59252q) new C59252q().mo96825o(c).mo96741a("slide_left");
                    qVar.f135318u = str2;
                    qVar.f135319v = str2;
                    qVar.f135317t = str2;
                    C59252q c2 = qVar.mo96823c(AwemeChangeCallBack.m108593a(zVar.getActivity()), 0);
                    c2.f135314q = zVar.mo70703q();
                    c2.f135315r = homePageDataViewModel.f121744j;
                    c2.f135289ac = str3;
                    C59252q qVar2 = (C59252q) c2.mo96740a(zVar.getContext()).mo96810l(zVar.f96635j.getSearchId()).mo96804f(searchResultId);
                    qVar2.f135216P = FeedParamProvider.C49809a.m93270a(zVar.getContext()).getVsEnterFrom();
                    qVar2.f135217Q = FeedParamProvider.C49809a.m93270a(zVar.getContext()).getVsEntranceType();
                    qVar2.f135218R = FeedParamProvider.C49809a.m93270a(zVar.getContext()).getVsSessionId();
                    qVar2.f135219S = e;
                    qVar2.f135290ad = FeedParamProvider.C49809a.m93270a(zVar.getContext()).getCategoryName();
                    qVar2.f135222V = C76598h.m134176a(a2.getAuthor());
                    if (C76706a.m134281g(a2)) {
                        str = "story";
                    } else {
                        str = UGCMonitor.TYPE_POST;
                    }
                    qVar2.f135223W = str;
                    qVar2.mo96752b_(C76706a.m134276b(a2)).mo96788a(C80632w.m139800a(a2, "enter_personal_detail", c)).mo96788a(C50560y.m94792b(zVar.f96635j.getPreviousPage(), zVar.f96635j.getFromGroupId())).mo96792f();
                }
                if (TextUtils.equals(c, "follow_card_push_publish")) {
                    C39162r.m79460a("follow_card", new C33744d().mo59983a("enter_from", c).mo59983a("event_type", "enter_profile").mo59983a("rec_uid", C59208ac.m108778l(AwemeChangeCallBack.m108593a(zVar.getActivity()))).mo59983a("req_id", homePageDataViewModel.f121744j).mo59983a("card_type", "item").mo59980a("impr_order", 0).f79943a);
                }
                sVar.mo67941a("group_id", AwemeChangeCallBack.m108593a(zVar.getActivity()) == null ? str2 : AwemeChangeCallBack.m108593a(zVar.getActivity()).getAid());
                sVar.mo67941a("enter_method", "slide_left");
                sVar.mo67941a("request_id", homePageDataViewModel.f121744j);
                sVar.mo67941a("enter_type", "normal_way");
                MobClick labelName = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage");
                if (AwemeChangeCallBack.m108593a(zVar.getActivity()) != null) {
                    str2 = AwemeChangeCallBack.m108593a(zVar.getActivity()).getAuthor().getUid();
                }
                C39162r.onEvent(labelName.setValue(str2).setJsonObject(sVar.mo67942a()));
                AwemeChangeCallBack.m108593a(zVar.getActivity());
            }
            C49907s.m93686a(EnumC48310af.PROFILE);
            homePageDataViewModel.f121746l = false;
            C17233a.f41165a = false;
        } else if (a.equals("page_feed")) {
            C17233a.f41165a = true;
        }
    }
}
