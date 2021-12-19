package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.service.AbstractC35547d;
import com.p2082ss.android.ugc.aweme.commerce.challenge.C37488a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.AbstractC37571a;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41135h;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.ShowItemsStruct;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.views.ChallengeViewPager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.q */
public final class C35652q implements AbstractC35547d {

    /* renamed from: a */
    public Challenge f84089a;

    /* renamed from: b */
    public C35612j f84090b;

    /* renamed from: c */
    private final ViewPager f84091c;

    /* renamed from: d */
    private final DmtTabLayout f84092d;

    /* renamed from: e */
    private final View f84093e;

    /* renamed from: f */
    private final ImageView f84094f;

    /* renamed from: g */
    private final Context f84095g;

    /* renamed from: h */
    private ChallengeDetail f84096h;

    /* renamed from: i */
    private C75445g f84097i;

    static {
        Covode.recordClassIndex(42876);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.q$a */
    public static final class C35653a extends C27895a<C75445g> {
        static {
            Covode.recordClassIndex(42877);
        }

        C35653a() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.AbstractC35547d
    /* renamed from: a */
    public final void mo62530a() {
        this.f84092d.f41485r.clear();
    }

    /* renamed from: b */
    public final C64117cn<AbstractC34586a> mo62660b() {
        PagerAdapter adapter = this.f84091c.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter<com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment>");
        return (C64117cn) adapter;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.q$c */
    public static final class C35655c implements DmtTabLayout.AbstractC17289c {

        /* renamed from: a */
        final /* synthetic */ C35652q f84099a;

        static {
            Covode.recordClassIndex(42879);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: b */
        public final void mo27575b(DmtTabLayout.C17294f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35655c(C35652q qVar) {
            this.f84099a = qVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
        /* renamed from: a */
        public final void mo27574a(DmtTabLayout.C17294f fVar) {
            String type;
            if (fVar != null) {
                int i = fVar.f41524e;
                C35652q qVar = this.f84099a;
                if (i == 0) {
                    type = "output";
                } else {
                    Challenge challenge = qVar.f84089a;
                    if (challenge == null) {
                        C89219l.m154710a("mChallenge");
                    }
                    type = challenge.showItems.get(i - 1).getType();
                }
                C33744d dVar = new C33744d();
                Challenge challenge2 = qVar.f84089a;
                if (challenge2 == null) {
                    C89219l.m154710a("mChallenge");
                }
                C39162r.m79460a("change_inter_tag", dVar.mo59983a("tag_id", challenge2.getCid()).mo59983a("tag_name", type).f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.q$b */
    static final class C35654b implements DmtTabLayout.AbstractC17288b {

        /* renamed from: a */
        final /* synthetic */ C35652q f84098a;

        static {
            Covode.recordClassIndex(42878);
        }

        C35654b(C35652q qVar) {
            this.f84098a = qVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
        /* renamed from: a */
        public final void mo27573a(DmtTabLayout.C17294f fVar) {
            C89219l.m154716b(fVar, "");
            fVar.mo27592a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.AbstractC35547d
    /* renamed from: a */
    public final void mo62531a(float f) {
        Fragment a = mo62660b().mo3639a(this.f84091c.getCurrentItem());
        if ((a instanceof C37488a) && f != 0.0f) {
            ((C37488a) a).mo65196b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.AbstractC35547d
    /* renamed from: b */
    public final void mo62534b(int i) {
        Fragment a = mo62660b().mo3639a(this.f84091c.getCurrentItem());
        if ((a instanceof C37488a) && i != 0) {
            ((C37488a) a).mo65196b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.AbstractC35547d
    /* renamed from: a */
    public final boolean mo62533a(int i) {
        if (i == R.id.e6q) {
            AbstractC37571a b = CommerceStickerServiceImpl.m75788c().mo65425b();
            C75445g gVar = this.f84097i;
            if (gVar != null && b.mo65428a(gVar)) {
                b.mo65427a(this.f84095g, this.f84097i, "challenge");
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.q$d */
    public static final class C35656d extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ C35652q f84100a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f84101b;

        /* renamed from: c */
        private int f84102c;

        static {
            Covode.recordClassIndex(42880);
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            Fragment a = this.f84100a.mo62660b().mo3639a(i);
            if (!(a instanceof C37488a)) {
                a = null;
            }
            if (a != null) {
                Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
                new Handler().postDelayed(new C37488a.RunnableC37489a((C37488a) a), 100);
            }
            Fragment a2 = this.f84100a.mo62660b().mo3639a(this.f84102c);
            if ((a2 instanceof C37488a) && a2 != null) {
                Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
                CommonBizWebView a3 = ((C37488a) a2).mo65195a();
                if (a3 != null) {
                    a3.mo62061a("brand_room_left", new JSONObject());
                }
            }
            this.f84102c = i;
        }

        C35656d(C35652q qVar, C89233z.C89236c cVar) {
            this.f84100a = qVar;
            this.f84101b = cVar;
            this.f84102c = cVar.element;
        }
    }

    public C35652q(View view, Fragment fragment) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(fragment, "");
        View findViewById = view.findViewById(R.id.fgn);
        C89219l.m154716b(findViewById, "");
        this.f84091c = (ViewPager) findViewById;
        View findViewById2 = view.findViewById(R.id.ee7);
        C89219l.m154716b(findViewById2, "");
        this.f84092d = (DmtTabLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.crc);
        C89219l.m154716b(findViewById3, "");
        this.f84093e = findViewById3;
        this.f84094f = (ImageView) view.findViewById(R.id.e6u);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f84095g = context;
        this.f84090b = (C35612j) fragment;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.service.AbstractC35547d
    /* renamed from: a */
    public final void mo62532a(ChallengeDetail challengeDetail, int i) {
        ImageView imageView;
        C89219l.m154721d(challengeDetail, "");
        this.f84096h = challengeDetail;
        Challenge challenge = challengeDetail.challenge;
        C89219l.m154716b(challenge, "");
        this.f84089a = challenge;
        try {
            C27910f fVar = new C27910f();
            Challenge challenge2 = this.f84089a;
            if (challenge2 == null) {
                C89219l.m154710a("mChallenge");
            }
            this.f84097i = (C75445g) fVar.mo46671a(challenge2.getChallengeStickerDetail(), new C35653a().type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!(this.f84097i == null || !CommerceStickerServiceImpl.m75788c().mo65425b().mo65428a(this.f84097i) || (imageView = this.f84094f) == null)) {
            imageView.setImageResource(2131233912);
        }
        Challenge challenge3 = this.f84089a;
        if (challenge3 == null) {
            C89219l.m154710a("mChallenge");
        }
        if (C13603b.m24435a((Collection) challenge3.showItems)) {
            this.f84092d.setVisibility(8);
            return;
        }
        ViewPager viewPager = this.f84091c;
        Objects.requireNonNull(viewPager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.ChallengeViewPager");
        ((ChallengeViewPager) viewPager).setPagingEnable(true);
        this.f84091c.setOffscreenPageLimit(2);
        this.f84092d.setVisibility(0);
        this.f84093e.setVisibility(0);
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = this.f84091c.getCurrentItem();
        AbstractC41135h hVar = this.f84090b.mo62638g().get(0);
        Integer num = mo62660b().f145457c.get(0);
        T t = mo62660b().f145456b.get(0);
        C89219l.m154716b(t, "");
        t.f81623x = true;
        List<AbstractC41135h> g = this.f84090b.mo62638g();
        g.clear();
        g.add(hVar);
        List<T> list = mo62660b().f145456b;
        list.clear();
        list.add(t);
        List<Integer> list2 = mo62660b().f145457c;
        list2.clear();
        list2.add(num);
        Challenge challenge4 = this.f84089a;
        if (challenge4 == null) {
            C89219l.m154710a("mChallenge");
        }
        List<ShowItemsStruct> list3 = challenge4.showItems;
        C89219l.m154716b(list3, "");
        for (T t2 : list3) {
            C37488a aVar = new C37488a();
            aVar.f88489b = t2.getDesc();
            aVar.f88490c = t2.getSchema();
            Challenge challenge5 = this.f84089a;
            if (challenge5 == null) {
                C89219l.m154710a("mChallenge");
            }
            aVar.f88488a = challenge5.getCid();
            this.f84090b.mo62638g().add(aVar);
            mo62660b().f145456b.add(aVar);
            mo62660b().f145457c.add(Integer.valueOf(aVar.hashCode()));
        }
        Iterator<T> it = this.f84090b.mo62638g().iterator();
        while (it.hasNext()) {
            it.next().mo62672b(true);
        }
        mo62660b().notifyDataSetChanged();
        int size = mo62660b().f145456b.size();
        if (i >= 0 && size > i) {
            cVar.element = i;
        }
        this.f84092d.setupWithViewPager(this.f84091c);
        this.f84092d.setOnTabClickListener(new C35654b(this));
        this.f84092d.mo27521a(new C35655c(this));
        this.f84091c.setCurrentItem(cVar.element);
        this.f84091c.addOnPageChangeListener(new C35656d(this, cVar));
        this.f84090b.onPageSelected(cVar.element);
    }
}
