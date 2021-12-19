package com.p2082ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.p122a.C2541b;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a;
import com.p2082ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38659ay;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40543j;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41360al;
import com.p2082ss.android.ugc.aweme.experiment.C46932fi;
import com.p2082ss.android.ugc.aweme.experiment.C46934fk;
import com.p2082ss.android.ugc.aweme.experiment.C46938fo;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49679g;
import com.p2082ss.android.ugc.aweme.feed.p2958o.C49766a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50104bc;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50543k;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkService;
import com.p2082ss.android.ugc.aweme.p2481cm.C36141a;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40913e;
import com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63764ac;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64149b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i;
import com.p2082ss.android.ugc.aweme.profile.service.C63866a;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.share.model.C69329a;
import com.p2082ss.android.ugc.aweme.share.model.C69332d;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.k */
public class C63810k extends C34685e implements AbstractC15497d, AwemeChangeCallBack.AbstractC59111a {

    /* renamed from: A */
    private Bundle f144630A;

    /* renamed from: B */
    private boolean f144631B = false;

    /* renamed from: C */
    private boolean f144632C = false;

    /* renamed from: D */
    private boolean f144633D = false;

    /* renamed from: a */
    AbstractC64151d f144634a;

    /* renamed from: b */
    AbstractC64149b f144635b;

    /* renamed from: c */
    Object f144636c;

    /* renamed from: d */
    public AbstractC18234b f144637d;

    /* renamed from: e */
    Aweme f144638e;

    /* renamed from: j */
    String f144639j;

    /* renamed from: k */
    AbstractC1214u<Integer> f144640k;

    /* renamed from: l */
    List<Pair<Aweme, Integer>> f144641l = new ArrayList(2);

    /* renamed from: m */
    String f144642m = "";

    /* renamed from: n */
    boolean f144643n = false;

    /* renamed from: o */
    boolean f144644o = false;

    /* renamed from: p */
    String f144645p = "page_profile";

    /* renamed from: q */
    private Fragment f144646q;

    /* renamed from: r */
    private String f144647r = "";

    /* renamed from: s */
    private String f144648s = "other_places";

    /* renamed from: t */
    private boolean f144649t = true;

    /* renamed from: u */
    private boolean f144650u;

    /* renamed from: v */
    private boolean f144651v;

    /* renamed from: w */
    private String f144652w;

    /* renamed from: y */
    private String f144653y;

    /* renamed from: z */
    private final Object f144654z = new Object();

    static {
        Covode.recordClassIndex(75138);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo102378a(boolean z) {
        m115411a(new C64396v(this, z));
    }

    /* renamed from: a */
    public final void mo102376a(Aweme aweme, boolean z) {
        ActivityC0945e activity;
        if (aweme.getAwemeRawAd() != null) {
            C63867b.f144793a.getBulletABHelper().mo61841a(this.f144637d, m115418d(), this);
            if (!m115421f(aweme)) {
                m115423g(aweme);
            }
            if (z && (activity = getActivity()) != null) {
                ScrollSwitchStateManager.C52950a.m97811a(activity).mo89345a(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
    /* renamed from: a */
    public final void mo37101a(Aweme aweme) {
        boolean z;
        Aweme aweme2;
        if (aweme != null) {
            if (C49766a.f114511a && getActivity() != null && (aweme2 = HomePageDataViewModel.C52942a.m97777a(getActivity()).f121745k) != null && (!TextUtils.equals(aweme2.getAid(), aweme.getAid()) || !TextUtils.equals(aweme2.getSecAuthorUid(), aweme.getSecAuthorUid()))) {
                C51423a.m95791b(4, "feed2profile", "ProfilePageFragment onAwemeChange invalid aweme, aid: " + aweme.getAid() + ", secUid: " + aweme.getSecAuthorUid() + "; homepage_aid: " + aweme2.getAid() + ", homepage_secUid: " + aweme2.getSecAuthorUid());
            }
            if (!aweme.isAwemeFromXiGua()) {
                if (getUserVisibleHint()) {
                    this.f144641l.add(Pair.create(aweme, 17));
                    mo102374a(this.f144641l, 1);
                    z = false;
                } else {
                    this.f144641l.add(Pair.create(aweme, 1));
                    z = true;
                }
                int i = 300;
                if (this.f144650u) {
                    if (this.f144651v) {
                        if (!z) {
                            C29339a.m58753a(new RunnableC65222y(this), 300);
                        } else if (C46932fi.f109367a == 2) {
                            this.f144644o = true;
                        } else if (C46932fi.f109367a == 1) {
                            RunnableC65223z zVar = new RunnableC65223z(this);
                            if (C46938fo.f109397a > 5000) {
                                i = 5000;
                            } else if (C46938fo.f109397a >= 300) {
                                i = C46938fo.f109397a;
                            }
                            C29339a.m58753a(zVar, i);
                            this.f144644o = true;
                        } else {
                            C29339a.m58753a(new RunnableC63414aa(this), 300);
                        }
                        if (C16048b.m29633a().mo25421a(true, "profile_params_async_open", false) && C63866a.f144791a.shouldShowAdBrowser(aweme)) {
                            C1731i.m5640b(new CallableC63415ab(this, aweme), C39162r.m79452a());
                        }
                    }
                    m115427i(aweme);
                } else {
                    RunnableC63818n nVar = new RunnableC63818n(this);
                    if (this.f144649t && (getContext() instanceof C17873f.AbstractC17876c)) {
                        i = 3000;
                    }
                    C29339a.m58753a(nVar, i);
                    m115427i(aweme);
                }
                this.f144649t = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo102375a(Fragment fragment, String str) {
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        a.mo3470b(R.id.acf, fragment, str);
        a.mo3473c();
        C63764ac.m115313a("replaceFragment(), tag is ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public final void mo102377a(String str) {
        this.f144642m = str;
        String str2 = this.f144647r;
        switch (str2.hashCode()) {
            case -803549229:
                if (str2.equals("page_ad")) {
                }
                return;
            case -803548836:
                if (str2.equals("page_my")) {
                }
                return;
            case -331427643:
                if (str2.equals("page_fake_user")) {
                    m115411a(new C63865s(str));
                    return;
                }
                return;
            case 883917691:
                if (str2.equals("page_user")) {
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m115431k();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m115432l();
    }

    /* renamed from: k */
    private void m115431k() {
        IBenchmarkService c;
        if (this.f144631B && (c = BenchmarkServiceImpl.m71140c()) != null) {
            c.mo61662a(2);
        }
    }

    /* renamed from: l */
    private void m115432l() {
        IBenchmarkService c;
        if (this.f144631B && (c = BenchmarkServiceImpl.m71140c()) != null) {
            c.mo61661a();
        }
    }

    /* renamed from: b */
    public final void mo102380b() {
        ScrollSwitchStateManager.C52950a.m97811a(getActivity()).mo89342a("page_feed", true);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C2541b.m7439c("profile", "");
    }

    /* renamed from: j */
    private static boolean m115429j() {
        try {
            return C52912c.f121688a.f121689b.getProfilePageSkipRemove().booleanValue();
        } catch (C16041a e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    private void m115422g() {
        if (this.f144646q != null || this.f144637d != null) {
            if (!(this.f144637d == null || this.f144638e.getAwemeRawAd() == null)) {
                C63867b.f144793a.getBulletABHelper().mo61842b(this.f144637d);
            }
            if (this.f144646q != null) {
                C63866a.f144791a.getAdFlutterLandPageUtil().mo95566b(this.f144646q);
            }
        }
    }

    /* renamed from: h */
    private AbstractC64151d m115424h() {
        getChildFragmentManager().mo3551a("tag_fragment_page_user");
        C64250i iVar = new C64250i();
        iVar.setArguments(m115426i());
        iVar.mo103750a(new C63820p(this));
        iVar.mo103753a(this.f144639j);
        iVar.mo103758b(this.f144639j);
        iVar.mo103760c("other_places");
        return iVar;
    }

    /* renamed from: i */
    private Bundle m115426i() {
        Bundle bundle = new Bundle();
        bundle.putString("profile_from", "feed_detail");
        bundle.putString("previous_page", "homepage_hot");
        bundle.putString("enter_from", "homepage_hot");
        bundle.putString("is_first_time", "true");
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundle.putInt("from_recommend_card", arguments.getInt("from_recommend_card", 0));
        }
        return bundle;
    }

    /* renamed from: c */
    private void m115415c() {
        if (af_()) {
            m115416c(true);
            if (this.f144641l.size() > 0) {
                List<Pair<Aweme, Integer>> list = this.f144641l;
                Pair<Aweme, Integer> pair = list.get(list.size() - 1);
                List<Pair<Aweme, Integer>> list2 = this.f144641l;
                list2.set(list2.size() - 1, Pair.create(pair.first, Integer.valueOf(((Integer) pair.second).intValue() | 16)));
            }
            this.f144641l = mo102374a(this.f144641l, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        if (r1.equals("click_title") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        if (r1.equals("click_avatar") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        if (r1.equals("slide") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        return r4.f144638e.getAwemeRawAd().getAuthorUrl();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m115418d() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.C63810k.m115418d():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC64149b mo102373a() {
        AbstractC64149b bVar = (AbstractC64149b) getChildFragmentManager().mo3551a("tag_fragment_page_my");
        if (bVar == null) {
            bVar = (AbstractC64149b) C63867b.f144793a.createMyProfileFragment();
        }
        bVar.mo103744a(new AbstractC50104bc() {
            /* class com.p2082ss.android.ugc.aweme.profile.C63810k.C638144 */

            static {
                Covode.recordClassIndex(75142);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50104bc
            /* renamed from: a */
            public final void mo85241a() {
                C63810k.this.mo102380b();
            }
        });
        return bVar;
    }

    /* renamed from: c */
    private void m115416c(boolean z) {
        AbstractC64151d dVar = this.f144634a;
        if (dVar != null) {
            dVar.mo103759b(z);
        }
    }

    /* renamed from: b */
    public final C63810k mo102379b(boolean z) {
        if (z) {
            this.f144648s = "main_head";
        }
        return this;
    }

    /* renamed from: a */
    private void m115409a(Fragment fragment) {
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        a.mo3455a(fragment);
        a.mo3473c();
    }

    /* renamed from: c */
    private boolean m115417c(String str) {
        return TextUtils.equals(this.f144647r, str);
    }

    /* renamed from: m */
    private boolean m115434m(Aweme aweme) {
        TextUtils.equals(this.f144639j, "homepage_hot");
        return false;
    }

    /* renamed from: a */
    private void m115411a(AbstractC89172b<AbstractC64147a, Void> bVar) {
        m115412a("tag_fragment_page_fake_user", AbstractC64147a.class, bVar);
    }

    /* renamed from: b */
    static boolean m115414b(Aweme aweme) {
        if (aweme == null || !TextUtils.equals(C31575b.m65865g().getCurUserId(), aweme.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m115421f(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getPreloadWeb() != 7) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!(getActivity() instanceof AbstractC41360al)) {
            return;
        }
        if (z) {
            m115415c();
            C63867b.f144793a.onFeedStop();
            return;
        }
        this.f144641l = mo102374a(this.f144641l, 2);
    }

    /* renamed from: k */
    private AbstractC64147a m115430k(Aweme aweme) {
        AbstractC64147a createFakeUserProfileFragment;
        Bundle bundle = new Bundle();
        if (aweme == null || !C37699a.m76296f(aweme.getAwemeRawAd())) {
            createFakeUserProfileFragment = C63866a.f144791a.createFakeUserProfileFragment();
        } else {
            createFakeUserProfileFragment = C63866a.f144791a.createNewFakeUserProfileFragment();
            bundle.putAll(m115437p(aweme));
        }
        if (createFakeUserProfileFragment != null) {
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putString("enter_from", this.f144639j);
            createFakeUserProfileFragment.mo67008c().setArguments(bundle);
        }
        return createFakeUserProfileFragment;
    }

    /* renamed from: l */
    private void m115433l(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null && getActivity() != null && !getActivity().isFinishing()) {
            aweme.getAid();
            m115434m(aweme);
            this.f144634a.mo103763j();
            this.f144634a.mo103754a(aweme.getAuthorUid(), aweme.getAuthor().getSecUid());
            this.f144634a.mo103749a(aweme);
            m115410a(aweme, 2);
        }
    }

    /* renamed from: n */
    private static String m115435n(Aweme aweme) {
        if (C63866a.f144791a.shouldShowFakeUserProfile(aweme)) {
            return "page_fake_user";
        }
        if (C63866a.f144791a.shouldShowAdBrowser(aweme)) {
            return "page_ad";
        }
        if (m115414b(aweme)) {
            return "page_my";
        }
        return "page_user";
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
        this.f144641l = mo102374a(this.f144641l, 2);
        m115432l();
        this.f144631B = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo102382c(Aweme aweme) {
        MethodCollector.m26663i(8643);
        C63866a.f144791a.getAdFlutterLandPageUtil();
        aweme.getAwemeRawAd();
        synchronized (this.f144654z) {
            try {
                this.f144630A = m115437p(aweme);
            } catch (Throwable th) {
                MethodCollector.m26664o(8643);
                throw th;
            }
        }
        MethodCollector.m26664o(8643);
        return null;
    }

    /* renamed from: h */
    private void m115425h(final Aweme aweme) {
        if (this.f144646q != null || this.f144637d != null) {
            AbstractC18234b bVar = this.f144637d;
            if (bVar != null) {
                if (bVar instanceof C40543j) {
                    MixActivityContainer mixActivityContainer = ((C40543j) bVar).f94864a;
                    if (mixActivityContainer != null) {
                        mo102376a(aweme, mixActivityContainer.getCrossPlatformParams().f95071d.f95193z);
                    } else {
                        getChildFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) new AbstractC0952i.AbstractC0954b() {
                            /* class com.p2082ss.android.ugc.aweme.profile.C63810k.C638122 */

                            static {
                                Covode.recordClassIndex(75140);
                            }

                            @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
                            public final void onFragmentViewCreated(AbstractC0952i iVar, Fragment fragment, View view, Bundle bundle) {
                                if (C63810k.this.f144637d == null) {
                                    C51423a.m95784a(5, "ProfilePageFragment", "adBrowserContainerFragment is null when onFragmentViewCreated is called");
                                    return;
                                }
                                MixActivityContainer mixActivityContainer = ((C40543j) C63810k.this.f144637d).f94864a;
                                if (mixActivityContainer != null) {
                                    C63810k.this.mo102376a(aweme, mixActivityContainer.getCrossPlatformParams().f95071d.f95193z);
                                } else {
                                    C51423a.m95787a("MixActivityContainer is null when onFragmentViewCreated is called");
                                }
                                C63810k.this.getChildFragmentManager().mo3554a(this);
                            }
                        }, false);
                    }
                } else {
                    final AbstractC63744f bulletABHelper = C63867b.f144793a.getBulletABHelper();
                    final boolean c = bulletABHelper.mo61844c(this.f144637d);
                    if (bulletABHelper.mo61845d(this.f144637d)) {
                        mo102376a(aweme, c);
                    } else {
                        getChildFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) new AbstractC0952i.AbstractC0954b() {
                            /* class com.p2082ss.android.ugc.aweme.profile.C63810k.C638133 */

                            static {
                                Covode.recordClassIndex(75141);
                            }

                            @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
                            public final void onFragmentViewCreated(AbstractC0952i iVar, Fragment fragment, View view, Bundle bundle) {
                                if (bulletABHelper.mo61845d(C63810k.this.f144637d)) {
                                    C63810k.this.mo102376a(aweme, c);
                                } else {
                                    C51423a.m95787a("BulletContainerView is null when onFragmentViewCreated is called");
                                }
                                C63810k.this.getChildFragmentManager().mo3554a(this);
                            }
                        }, false);
                    }
                }
            }
            if (this.f144646q != null && !m115421f(aweme)) {
                m115423g(aweme);
            }
            AwemeRawAd awemeRawAd = null;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C38659ay.f91340a = awemeRawAd;
            getActivity();
        }
    }

    /* renamed from: i */
    private void m115427i(Aweme aweme) {
        ActivityC0945e activity = getActivity();
        if (!(activity instanceof AbstractC40912d) || !(((AbstractC40912d) activity).getInflater() instanceof AbstractC40913e)) {
            return;
        }
        if (m115414b(aweme)) {
            if (!this.f144633D) {
                this.f144633D = true;
                C63420af.m114997a(activity);
            }
        } else if (!m115417c("page_user") && this.f144634a == null && !this.f144632C) {
            this.f144632C = true;
            C63420af.m114997a(activity);
        }
    }

    /* renamed from: o */
    private AbstractC18234b m115436o(Aweme aweme) {
        Bundle bundle;
        MethodCollector.m26663i(8483);
        System.currentTimeMillis();
        if (C16048b.m29633a().mo25421a(true, "profile_params_async_open", false)) {
            synchronized (this.f144654z) {
                try {
                    Bundle bundle2 = this.f144630A;
                    if (bundle2 == null || m115407a(bundle2, "aweme_id") != aweme.getAid()) {
                        bundle = m115437p(aweme);
                    } else {
                        bundle = this.f144630A;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8483);
                    throw th;
                }
            }
        } else {
            bundle = m115437p(aweme);
        }
        AbstractC63744f bulletABHelper = C63867b.f144793a.getBulletABHelper();
        AbstractC18234b a = bulletABHelper.mo61838a(getActivity(), bundle, m115418d());
        bulletABHelper.mo61843b(a, new RunnableC63863q(this));
        bulletABHelper.mo61840a(a, new RunnableC63864r(this));
        a.setArguments(bundle);
        MethodCollector.m26664o(8483);
        return a;
    }

    /* renamed from: b */
    public final void mo102381b(String str) {
        AbstractC64151d dVar = this.f144634a;
        if (dVar != null) {
            dVar.mo103762e(str);
        }
    }

    /* renamed from: g */
    private void m115423g(Aweme aweme) {
        if (this.f144646q != null || this.f144637d != null) {
            if (C63866a.f144791a.getAdLynxLandPageUtil().mo95568a(aweme.getAwemeRawAd())) {
                C63866a.f144791a.logFeedRawLynxAdOpenUrlH5(getContext(), aweme);
                C18129a.m33746a("draw_ad", "open_url_h5", aweme.getAwemeRawAd()).mo28897a("render_type", "lynx").mo28902c();
            } else {
                C63866a.f144791a.getAdFlutterLandPageUtil();
                aweme.getAwemeRawAd();
                int i = C49625h.m93072a().f114197i;
                if (i == 53) {
                    C18129a.m33746a("result_ad", "open_url_h5", aweme.getAwemeRawAd()).mo28900b("refer", "button").mo28901b();
                    C49625h.m93072a().f114197i = -1;
                } else if (i == 54) {
                    C18129a.m33746a("result_ad_bg", "open_url_h5", aweme.getAwemeRawAd()).mo28900b("refer", "bg_more_button").mo28901b();
                    C49625h.m93072a().f114197i = -1;
                } else {
                    C63866a.f144791a.logFeedRawAdOpenUrlH5(getContext(), aweme);
                    C18129a.m33746a("draw_ad", "open_url_h5", aweme.getAwemeRawAd()).mo28902c();
                    C49625h.m93072a().f114197i = -1;
                }
            }
            C63866a.f144791a.onProfileWebPageShow(getContext(), aweme, this.f144642m);
            if (this.f144637d != null) {
                C63867b.f144793a.getBulletABHelper().mo61839a(this.f144637d);
            }
            if (this.f144646q != null) {
                C63866a.f144791a.getAdFlutterLandPageUtil().mo95565a(this.f144646q);
            }
        }
    }

    /* renamed from: a */
    static boolean m115413a(List<Pair<Aweme, Integer>> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m115419d(Aweme aweme) {
        AbstractC64151d dVar;
        m115416c(false);
        String n = m115435n(aweme);
        n.hashCode();
        switch (n.hashCode()) {
            case -803549229:
                if (n.equals("page_ad")) {
                    if (m115421f(aweme)) {
                        m115422g();
                        return;
                    } else if (this.f144646q != null || this.f144637d != null) {
                        m115422g();
                        C38659ay.f91340a = null;
                        ActivityC0945e activity = getActivity();
                        if (activity != null) {
                            ScrollSwitchStateManager a = ScrollSwitchStateManager.C52950a.m97811a(activity);
                            if (!a.mo89346a()) {
                                a.mo89345a(true);
                            }
                        }
                        getActivity();
                        C38754l.m78608a(getContext());
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case -803548836:
                if (n.equals("page_my") && this.f144635b != null) {
                }
                return;
            case -331427643:
                if (n.equals("page_fake_user")) {
                    mo102378a(false);
                    return;
                }
                return;
            case 883917691:
                if (n.equals("page_user") && (dVar = this.f144634a) != null) {
                    dVar.mo103755a(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m115420e(com.p2082ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.C63810k.m115420e(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: j */
    private void m115428j(Aweme aweme) {
        if (af_()) {
            this.f144651v = true;
            boolean equals = true ^ TextUtils.equals(C59208ac.m108771e(this.f144638e), C59208ac.m108771e(aweme));
            C63764ac.m115313a("doAwemeChange(), isAwemeChange is " + equals + ", old aid is " + C59208ac.m108771e(this.f144638e) + ", new aid is " + C59208ac.m108771e(aweme));
            this.f144638e = aweme;
            if (C63866a.f144791a.shouldShowFakeUserProfile(aweme)) {
                AbstractC64147a k = m115430k(aweme);
                if (k != null) {
                    mo102375a(k.mo67008c(), "tag_fragment_page_fake_user");
                    this.f144636c = k;
                }
                this.f144647r = "page_fake_user";
            } else if (C63866a.f144791a.shouldShowAdBrowser(aweme)) {
                C63866a.f144791a.getAdFlutterLandPageUtil();
                aweme.getAwemeRawAd();
                if (this.f144637d == null || equals) {
                    if (m115429j()) {
                        this.f144637d = null;
                        this.f144646q = null;
                    } else {
                        if (this.f144637d != null && !m115417c("page_ad")) {
                            m115409a(this.f144637d);
                            this.f144637d = null;
                        }
                        if (this.f144646q != null && !m115417c("page_ad")) {
                            m115409a(this.f144646q);
                            this.f144646q = null;
                        }
                    }
                    AbstractC18234b o = m115436o(aweme);
                    this.f144637d = o;
                    mo102375a(o, "tag_fragment_page_ad");
                    this.f144636c = this.f144637d;
                }
                this.f144647r = "page_ad";
                if (m115421f(this.f144638e)) {
                    m115425h(this.f144638e);
                }
            } else {
                if (m115429j()) {
                    this.f144637d = null;
                    this.f144646q = null;
                } else {
                    if (this.f144637d != null && !m115417c("page_ad")) {
                        m115409a(this.f144637d);
                        this.f144637d = null;
                    }
                    if (this.f144646q != null && !m115417c("page_ad")) {
                        m115409a(this.f144646q);
                        this.f144646q = null;
                    }
                }
                if (m115414b(aweme)) {
                    if (!m115417c("page_my")) {
                        if (this.f144635b == null) {
                            this.f144635b = mo102373a();
                        }
                        if (!C76706a.m134281g(aweme)) {
                            mo102375a((Fragment) this.f144635b, "tag_fragment_page_my");
                            this.f144636c = this.f144635b;
                        }
                        this.f144647r = "page_my";
                    } else if (!C76706a.m134281g(aweme) && !(this.f144636c instanceof AbstractC64149b)) {
                        mo102375a((Fragment) this.f144635b, "tag_fragment_page_my");
                        this.f144636c = this.f144635b;
                        this.f144647r = "page_my";
                    }
                    if (!equals) {
                        return;
                    }
                    return;
                }
                if (!m115417c("page_user")) {
                    if (this.f144634a == null) {
                        this.f144634a = m115424h();
                    }
                    Fragment fragment = (Fragment) this.f144634a;
                    mo102375a(fragment, "tag_fragment_page_user");
                    this.f144636c = fragment;
                    this.f144647r = "page_user";
                }
                if (equals) {
                    m115433l(aweme);
                }
            }
        }
    }

    /* renamed from: p */
    private Bundle m115437p(Aweme aweme) {
        String webTitle;
        String jSONObject;
        boolean z;
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
        bundle.putBoolean("control_request_url", true);
        if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
            webTitle = aweme.getAwemeRawAd().getSource();
        } else {
            webTitle = aweme.getAwemeRawAd().getWebTitle();
        }
        bundle.putString("bundle_download_app_name", webTitle);
        bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putString("ad_js_url", SharePrefCache.inst().getJsActlogUrl().mo59941c());
        bundle.putBoolean("use_ordinary_web", C50543k.m94758a(aweme.getAwemeRawAd()));
        bundle.putBoolean("bundle_is_ad_fake", true);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
        bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
        bundle.putString("aweme_id", aweme.getAid());
        Long creativeId = aweme.getAwemeRawAd().getCreativeId();
        bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
        bundle.putString("landing_page_info", aweme.getAwemeRawAd().getLandingPageInfo());
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        if (!TextUtils.isEmpty(downloadUrl)) {
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("bundle_download_url", downloadUrl);
            bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
            bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
            }
            bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
            bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
            bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
            bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
            bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
        }
        bundle.putString("bundle_web_title", C63420af.m114996a(aweme.getAwemeRawAd().getWebTitle()));
        String packageName = aweme.getAwemeRawAd().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            bundle.putString("aweme_package_name", packageName);
        }
        String str2 = "";
        JSONObject extJson = C63866a.f144791a.getExtJson(getContext(), aweme, str2);
        if (extJson == null) {
            jSONObject = str2;
        } else {
            jSONObject = extJson.toString();
        }
        bundle.putString("aweme_json_extra", jSONObject);
        Long groupId = aweme.getAwemeRawAd().getGroupId();
        if (!(groupId == null || groupId.longValue() == 0)) {
            bundle.putString("aweme_group_id", String.valueOf(groupId));
        }
        if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
            bundle.putString("aweme_creative_id", String.valueOf(creativeId));
        }
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        bundle.putString("preload_channel_name", aweme.getAwemeRawAd().getChannelName());
        bundle.putString("preload_scene", "feed");
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_web_status_new", aweme.getAwemeRawAd().getPreloadWebNew());
        bundle.putInt("preload_is_web_url", 1);
        bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
        bundle.putBoolean("enable_web_google_login", aweme.getAwemeRawAd().isEnableWebGoogleLogin());
        bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
        bundle.putString("commerce_enter_from", "feedad");
        Context context = getContext();
        if (context == null || !aweme.getAwemeRawAd().isUseDefaultColor()) {
            bundle.putInt("bundle_webview_background", -1);
        } else {
            bundle.putInt("bundle_webview_background", C0643b.m2378c(context, R.color.l));
        }
        if (aweme.getAwemeRawAd().getWebviewProgressBar() == 1) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("webview_progress_bar", z);
        if (C63866a.f144791a.getAdLynxLandPageUtil().mo95568a(aweme.getAwemeRawAd())) {
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("should_full_screen", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            if (aweme.getAwemeRawAd().getNativeSiteConfig().getLynxLandingStyle() == 1) {
                if (!(aweme.getVideo() == null || aweme.getVideo().getOriginCover() == null || C13603b.m24435a((Collection) aweme.getVideo().getOriginCover().getUrlList()))) {
                    bundle.putString("bundle_full_screen_bg_image", aweme.getVideo().getOriginCover().getUrlList().get(0));
                }
                bundle.putInt("bundle_webview_background", 0);
            }
            List<String> geckoChannel = aweme.getAwemeRawAd().getNativeSiteConfig().getGeckoChannel();
            if (!C13603b.m24435a((Collection) geckoChannel)) {
                str = geckoChannel.get(0);
            } else {
                str = str2;
            }
            bundle.putString("lynx_channel_name", str);
            bundle.putString("bundle_native_site_custom_data", aweme.getAwemeRawAd().getNativeSiteCustomData());
            if (!C13603b.m24435a((Collection) aweme.getAwemeRawAd().getNativeSiteConfig().getSecondPageGeckoChannel())) {
                if (f != null) {
                    str2 = f.mo59382b(aweme.getAwemeRawAd().getAdId());
                }
                bundle.putString("second_page_preload_channel_prefix", str2);
            }
            bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(C13628n.m24504a(context), 1073741824));
            bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(C13628n.m24521b(context) - C80534hh.m139609b(), 1073741824));
            Uri parse = Uri.parse(aweme.getAwemeRawAd().getNativeSiteConfig().getLynxScheme());
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", 2);
                }
            }
        }
        bundle.putBoolean("hide_web_button", aweme.getAwemeRawAd().isHideWebButton());
        bundle.putBoolean("bundle_show_lynx_bottom_label", aweme.getAwemeRawAd().isShowWebViewBottomLynxButton());
        bundle.putString("bundle_lynx_bottom_label_template_url", aweme.getAwemeRawAd().getLynxButtonUrl());
        bundle.putString("bundle_lynx_bottom_label_data", aweme.getAwemeRawAd().getLynxRawData());
        return bundle;
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
        String d = Hox.C15490a.m28529a(getActivity()).mo25216d(this.f144645p);
        String str = "";
        if (bundle.getString(C34792be.f82123b, str).equals(C34792be.f82124c) || bundle.getBoolean(d)) {
            ActivityC0945e activity = getActivity();
            if (!C46934fk.f109379c) {
                C63419ae.f143971a.preloadProfile(activity, this.f144645p);
            }
            AbstractC81915c.m141874a(new C69332d(false));
            AbstractC81915c.m141874a(new C69329a());
            if (TextUtils.isEmpty(C36141a.C36142a.f85377d)) {
                C36141a.C36142a.f85374a = this.f144645p;
            }
            HomePageDataViewModel a = HomePageDataViewModel.C52942a.m97777a(activity);
            Aweme aweme = a.f121741g;
            String str2 = a.f121740f;
            if (aweme != null) {
                str = aweme.getAid();
            }
            AbstractC64005b.C64007b.m115770a(str2, str);
            AbstractC81915c.m141874a(new C49679g());
            ((MainAnimViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MainAnimViewModel.class)).f134237d.setValue(this.f144645p);
            C17233a.f41165a = false;
            C49907s.m93686a(EnumC48310af.PROFILE);
            a.f121746l = false;
        }
        m115415c();
        C63867b.f144793a.onFeedStop();
        this.f144631B = true;
        m115431k();
    }

    /* renamed from: a */
    private static Object m115407a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> T m115408a(String str, Class<T> cls) {
        Fragment a;
        if (!TextUtils.isEmpty(str) && cls != null && (a = getChildFragmentManager().mo3551a(str)) != null && cls.isInstance(a)) {
            return cls.cast(a);
        }
        return null;
    }

    /* renamed from: a */
    private void m115410a(Aweme aweme, int i) {
        C63764ac.m115313a("setUserProfileSimpleUserData(), aid is " + aweme.getAid() + ", period is " + i);
        if (i != 2 || !TextUtils.equals(this.f144639j, "homepage_hot") || !C34671a.f81927a.mo61330d()) {
            this.f144634a.mo103751a(aweme.getAuthor());
            this.f144643n = true;
            return;
        }
        C58254p.f132679a.postAtFrontOfQueue(new RunnableC63819o(this, aweme, i));
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AwemeChangeCallBack.m108594a(getActivity(), this, this);
        HomePageDataViewModel a = HomePageDataViewModel.C52942a.m97777a(getActivity());
        C63815l lVar = new C63815l(this);
        C89219l.m154721d(this, "");
        C89219l.m154721d(lVar, "");
        a.f121742h.observe(this, lVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f144652w = arguments.getString("related_gid", "");
        }
        ScrollSwitchStateManager a2 = ScrollSwitchStateManager.C52950a.m97811a(getActivity());
        if (getActivity() != null && this.f144650u) {
            C63816m mVar = new C63816m(this, a2);
            this.f144640k = mVar;
            a2.mo89353c(this, mVar);
        }
        a2.mo89353c(this, new C63910u(this, a2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<Pair<Aweme, Integer>> mo102374a(List<Pair<Aweme, Integer>> list, int i) {
        if (!m115413a(list)) {
            return list;
        }
        ListIterator<Pair<Aweme, Integer>> listIterator = list.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            Pair<Aweme, Integer> next = listIterator.next();
            if (i == 0) {
                this.f144644o = false;
                if (((Integer) next.second).intValue() == 1) {
                    if (!listIterator.hasNext()) {
                        m115428j((Aweme) next.first);
                        listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() | 4096)));
                        break;
                    }
                    listIterator.remove();
                } else if (((Integer) next.second).intValue() == 4097) {
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                } else if (((Integer) next.second).intValue() == 17) {
                    m115428j((Aweme) next.first);
                    listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() | 4096)));
                    break;
                } else if (((Integer) next.second).intValue() == 273) {
                    if (getHost() == null) {
                        C51423a.m95787a("getHost() is null, isAdded:" + isAdded() + " isRemoving:" + isRemoving() + " isResumed:" + isResumed() + " isDetached:" + isDetached() + " isVisible:" + isVisible());
                    } else {
                        m115428j((Aweme) next.first);
                        m115420e((Aweme) next.first);
                    }
                    listIterator.set(Pair.create(next.first, 69649));
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                }
            } else if (i == 1) {
                if (((Integer) next.second).intValue() == 4113) {
                    m115420e((Aweme) next.first);
                    listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() | 65536)));
                    if (listIterator.hasNext()) {
                        listIterator.remove();
                    }
                } else if (((Integer) next.second).intValue() == 17) {
                    listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() | 256)));
                    break;
                }
            } else if (i != 2) {
                continue;
            } else if ((((Integer) next.second).intValue() & 65536) == 65536) {
                m115419d((Aweme) next.first);
                listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() & -17 & -65537)));
                break;
            } else if ((((Integer) next.second).intValue() & 256) == 256) {
                listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() & -17 & -257)));
                break;
            } else if ((((Integer) next.second).intValue() & 16) == 16) {
                listIterator.set(Pair.create(next.first, Integer.valueOf(((Integer) next.second).intValue() & -17)));
                break;
            }
        }
        list.size();
        return list;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f144650u = true;
        C63764ac.m115313a("UserProfileInitMethodExperiment lazyLoad is " + this.f144650u);
        return C1870c.m6045a((Activity) getActivity(), (int) R.layout.aj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<T, java.lang.Void> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> void m115412a(String str, Class<T> cls, AbstractC89172b<T, Void> bVar) {
        Object a = m115408a(str, cls);
        if (a != null && bVar != 0) {
            bVar.invoke(a);
        }
    }
}
