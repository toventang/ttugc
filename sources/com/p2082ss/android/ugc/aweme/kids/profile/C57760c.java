package com.p2082ss.android.ugc.aweme.kids.profile;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.widget.C23669c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.ftc.p3028c.C51915a;
import com.p2082ss.android.ugc.aweme.ftc.p3028c.C51917c;
import com.p2082ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.profile.AbstractC57776e;
import com.p2082ss.android.ugc.aweme.kids.profile.api.p3364a.C57748a;
import com.p2082ss.android.ugc.aweme.kids.profile.base.C57759a;
import com.p2082ss.android.ugc.aweme.kids.profile.p3363a.AbstractC57744a;
import com.p2082ss.android.ugc.aweme.kids.profile.p3363a.C57745b;
import com.p2082ss.android.ugc.aweme.kids.profile.p3365b.C57756a;
import com.p2082ss.android.ugc.aweme.kids.profile.utils.AbstractC57782a;
import com.p2082ss.android.ugc.aweme.kids.profile.utils.MyProfileReportWidget;
import com.p2082ss.android.ugc.aweme.kids.profile.viewmodel.EnumC57787a;
import com.p2082ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel;
import com.p2082ss.android.ugc.aweme.kids.setting.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.setting.api.ISettingService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.c */
public final class C57760c extends C57759a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C57761a f131772c = new C57761a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f131773a = C89250i.m154773a((AbstractC89171a) C57769h.f131786a);

    /* renamed from: b */
    final AbstractC89244h f131774b = C89250i.m154773a((AbstractC89171a) new C57770i(this));

    /* renamed from: e */
    private final AbstractC89244h f131775e = C89250i.m154773a((AbstractC89171a) new C57762b(this));

    /* renamed from: j */
    private final AbstractC89244h f131776j = C89250i.m154773a((AbstractC89171a) new C57768g(this));

    /* renamed from: k */
    private final AbstractC89244h f131777k = C89250i.m154773a((AbstractC89171a) new C57772j(this));

    /* renamed from: l */
    private HashMap f131778l;

    static {
        Covode.recordClassIndex(67747);
    }

    /* renamed from: c */
    private final KidsProfileViewModel m104481c() {
        return (KidsProfileViewModel) this.f131777k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.profile.base.C57759a
    /* renamed from: a */
    public final View mo95084a(int i) {
        if (this.f131778l == null) {
            this.f131778l = new HashMap();
        }
        View view = (View) this.f131778l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f131778l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C57749b mo95086a() {
        return (C57749b) this.f131776j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.profile.base.C57759a
    /* renamed from: b */
    public final void mo95085b() {
        HashMap hashMap = this.f131778l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(186, new RunnableC90250g(C57760c.class, "onDeleteDraftItemEvent", C51915a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(187, new RunnableC90250g(C57760c.class, "onVideoCreatedOrSaved", C51917c.class, ThreadMode.MAIN, 0, true));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.kids.profile.base.C57759a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo95085b();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$a */
    public static final class C57761a {
        static {
            Covode.recordClassIndex(67748);
        }

        private C57761a() {
        }

        public /* synthetic */ C57761a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$h */
    static final class C57769h extends AbstractC89220m implements AbstractC89171a<C57745b> {

        /* renamed from: a */
        public static final C57769h f131786a = new C57769h();

        static {
            Covode.recordClassIndex(67756);
        }

        C57769h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C57745b invoke() {
            return new C57745b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$i */
    static final class C57770i extends AbstractC89220m implements AbstractC89171a<AbstractC89172b<? super AbstractC57782a, ? extends C89391z>> {

        /* renamed from: a */
        final /* synthetic */ C57760c f131787a;

        static {
            Covode.recordClassIndex(67757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57770i(C57760c cVar) {
            super(0);
            this.f131787a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89172b<? super AbstractC57782a, ? extends C89391z> invoke() {
            return new AbstractC89172b<AbstractC57782a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.profile.C57760c.C57770i.C577711 */

                /* renamed from: a */
                final /* synthetic */ C57770i f131788a;

                static {
                    Covode.recordClassIndex(67758);
                }

                {
                    this.f131788a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(AbstractC57782a aVar) {
                    AbstractC57782a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    if ((aVar2 instanceof AbstractC57782a.C57783a) && this.f131788a.f131787a.getActivity() != null && (this.f131788a.f131787a.getActivity() instanceof ActivityC0945e) && this.f131788a.f131787a.getFragmentManager() != null) {
                        AbstractC81915c.m141874a(new C57748a());
                        Fragment showDetailDraft = AVExternalServiceImpl.m113114a().draftService().showDetailDraft(((AbstractC57782a.C57783a) aVar2).f131802b);
                        AbstractC0952i fragmentManager = this.f131788a.f131787a.getFragmentManager();
                        Objects.requireNonNull(fragmentManager, "null cannot be cast to non-null type androidx.fragment.app.FragmentManager");
                        AbstractC0976n a = fragmentManager.mo3552a();
                        C89219l.m154716b(a, "");
                        if (showDetailDraft == null) {
                            C89219l.m154715b();
                        }
                        a.mo3453a(R.id.acf, showDetailDraft);
                        a.mo3457a("KidsProfile");
                        a.mo3467b();
                    }
                    return C89391z.f203057a;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$g */
    static final class C57768g extends AbstractC89220m implements AbstractC89171a<C57749b> {

        /* renamed from: a */
        final /* synthetic */ C57760c f131785a;

        static {
            Covode.recordClassIndex(67755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57768g(C57760c cVar) {
            super(0);
            this.f131785a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C57749b invoke() {
            return new C57749b((AbstractC89172b) this.f131785a.f131774b.getValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$b */
    static final class C57762b extends AbstractC89220m implements AbstractC89171a<GridLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ C57760c f131779a;

        static {
            Covode.recordClassIndex(67749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57762b(C57760c cVar) {
            super(0);
            this.f131779a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GridLayoutManager invoke() {
            this.f131779a.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
            gridLayoutManager.mo4320a(new C57763a(gridLayoutManager));
            return gridLayoutManager;
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$b$a */
        public static final class C57763a extends GridLayoutManager.AbstractC1337c {

            /* renamed from: e */
            final /* synthetic */ GridLayoutManager f131780e;

            static {
                Covode.recordClassIndex(67750);
            }

            C57763a(GridLayoutManager gridLayoutManager) {
                this.f131780e = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                if (i == 0) {
                    return this.f131780e.f4316b;
                }
                return 1;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$j */
    static final class C57772j extends AbstractC89220m implements AbstractC89171a<KidsProfileViewModel> {

        /* renamed from: a */
        final /* synthetic */ C57760c f131789a;

        static {
            Covode.recordClassIndex(67759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57772j(C57760c cVar) {
            super(0);
            this.f131789a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ KidsProfileViewModel invoke() {
            AbstractC1174ac a = new C1175ad(this.f131789a, new C1175ad.AbstractC1177b(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.profile.C57760c.C57772j.C577731 */

                /* renamed from: a */
                final /* synthetic */ C57772j f131790a;

                static {
                    Covode.recordClassIndex(67760);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f131790a = r1;
                }

                @Override // androidx.lifecycle.C1175ad.AbstractC1177b
                /* renamed from: a */
                public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                    C89219l.m154721d(cls, "");
                    return new KidsProfileViewModel((AbstractC57744a) this.f131790a.f131789a.f131773a.getValue());
                }
            }).mo3983a(KidsProfileViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        KidsProfileViewModel c = m104481c();
        c.f131803a = C89624i.m155555a(C89561bs.f203280a, null, null, new KidsProfileViewModel.C57784a(c, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$k  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC57774k implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ View f131791a;

        static {
            Covode.recordClassIndex(67761);
        }

        public final void onAnimationRepeat(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        animationAnimation$AnimationListenerC57774k(View view) {
            this.f131791a = view;
        }

        public final void onAnimationEnd(Animation animation) {
            C89219l.m154721d(animation, "");
            this.f131791a.setLayerType(0, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$c */
    static final class C57764c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57760c f131781a;

        static {
            Covode.recordClassIndex(67751);
        }

        C57764c(C57760c cVar) {
            this.f131781a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EnumC57787a aVar = (EnumC57787a) obj;
            if (aVar != null && C57775d.f131792a[aVar.ordinal()] == 1) {
                IKidsCommonService g = KidsCommonServiceImpl.m104422g();
                ActivityC0945e activity = this.f131781a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                g.mo94334a(activity);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$e */
    static final class C57766e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57760c f131783a;

        static {
            Covode.recordClassIndex(67753);
        }

        C57766e(C57760c cVar) {
            this.f131783a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            C57749b a = this.f131783a.mo95086a();
            C89219l.m154716b(list, "");
            C89219l.m154721d(list, "");
            a.f131753a.clear();
            a.f131753a.addAll(list);
            a.notifyItemRangeChanged(0, a.f131753a.size());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$f */
    static final class View$OnClickListenerC57767f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57760c f131784a;

        static {
            Covode.recordClassIndex(67754);
        }

        View$OnClickListenerC57767f(C57760c cVar) {
            this.f131784a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C57355f.m103962a("enter_setting_page", new C33743c().mo59976a("enter_method", "click_button").mo59976a("previous_page", "personal_homepage").mo59977a());
            ISettingService a = SettingServiceImpl.m104509a();
            ActivityC0945e activity = this.f131784a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            a.mo95124a(activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        LinearLayout linearLayout = (LinearLayout) mo95084a(R.id.ct8);
        C89219l.m154716b(linearLayout, "");
        if (linearLayout.getVisibility() == 0 && !z) {
            C57355f.m103962a("shoot_bubble_show", new C33743c().mo59976a("enter_from", "personal_homepage").mo59977a());
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDeleteDraftItemEvent(C51915a aVar) {
        C89219l.m154721d(aVar, "");
        List<AbstractC57776e> value = m104481c().f131805c.getValue();
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.kids.profile.ProfileVideoData>");
        List<AbstractC57776e> d = C89206ad.m154682d(value);
        Iterator<AbstractC57776e> it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC57776e next = it.next();
            if ((next instanceof AbstractC57776e.C57777a) && C89219l.m154714a((Object) aVar.f119607a.mo73676f(), (Object) ((AbstractC57776e.C57777a) next).f131793a.mo73676f())) {
                it.remove();
                break;
            }
        }
        m104481c().f131805c.setValue(d);
        m104481c().f131806d.setValue(Integer.valueOf(d.size() - 1));
        mo95086a().notifyDataSetChanged();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN, mo145423b = true)
    public final void onVideoCreatedOrSaved(C51917c cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar.f119608a == 1) {
            new C23144b(this).mo37632a().mo37640e(R.string.cse).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37637b();
        } else if (cVar.f119608a == 2) {
            new C23144b(this).mo37632a().mo37640e(R.string.cs8).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$d */
    static final class C57765d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57760c f131782a;

        static {
            Covode.recordClassIndex(67752);
        }

        C57765d(C57760c cVar) {
            this.f131782a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            MethodCollector.m26663i(12004);
            if (((Integer) obj).intValue() > 0) {
                TuxTextView tuxTextView = (TuxTextView) this.f131782a.mo95084a(R.id.d9o);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                TuxTextView tuxTextView2 = (TuxTextView) this.f131782a.mo95084a(R.id.avc);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
                TuxTextView tuxTextView3 = (TuxTextView) this.f131782a.mo95084a(R.id.av3);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
                ((LinearLayout) this.f131782a.mo95084a(R.id.ct8)).clearAnimation();
                LinearLayout linearLayout = (LinearLayout) this.f131782a.mo95084a(R.id.ct8);
                C89219l.m154716b(linearLayout, "");
                linearLayout.setVisibility(8);
                MethodCollector.m26664o(12004);
                return;
            }
            TuxTextView tuxTextView4 = (TuxTextView) this.f131782a.mo95084a(R.id.d9o);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(4);
            TuxTextView tuxTextView5 = (TuxTextView) this.f131782a.mo95084a(R.id.avc);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(0);
            TuxTextView tuxTextView6 = (TuxTextView) this.f131782a.mo95084a(R.id.av3);
            C89219l.m154716b(tuxTextView6, "");
            tuxTextView6.setVisibility(0);
            LinearLayout linearLayout2 = (LinearLayout) this.f131782a.mo95084a(R.id.ct8);
            linearLayout2.setVisibility(0);
            C57760c cVar = this.f131782a;
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setLayerType(2, null);
            Animation loadAnimation = AnimationUtils.loadAnimation(cVar.getContext(), R.anim.ca);
            C89219l.m154716b(loadAnimation, "");
            loadAnimation.setRepeatMode(2);
            loadAnimation.setRepeatCount(-1);
            loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC57774k(linearLayout2));
            linearLayout2.startAnimation(loadAnimation);
            if (!this.f131782a.isHidden()) {
                C57355f.m103962a("shoot_bubble_show", new C33743c().mo59976a("enter_from", "personal_homepage").mo59977a());
            }
            MethodCollector.m26664o(12004);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((FrameLayout) mo95084a(R.id.cle)).setOnClickListener(new View$OnClickListenerC57767f(this));
        RecyclerView recyclerView = (RecyclerView) mo95084a(R.id.doe);
        recyclerView.setAdapter(mo95086a());
        recyclerView.setLayoutManager((GridLayoutManager) this.f131775e.getValue());
        Resources system = Resources.getSystem();
        C89219l.m154716b(system, "");
        recyclerView.mo4402a(new C57756a((int) (system.getDisplayMetrics().density * 2.0f)));
        LiveData a = C1169aa.m3869a(m104481c().f131804b, KidsProfileViewModel.C57786b.f131813a);
        C89219l.m154716b(a, "");
        a.observe(getViewLifecycleOwner(), new C57764c(this));
        m104481c().f131806d.observe(getViewLifecycleOwner(), new C57765d(this));
        m104481c().f131805c.observe(getViewLifecycleOwner(), new C57766e(this));
        if (this.f131771d == null && getView() != null) {
            this.f131771d = C23669c.C23671a.m44763a(this, getView());
        }
        C23669c cVar = this.f131771d;
        if (cVar != null) {
            cVar.mo39102a(new MyProfileReportWidget((ViewGroup) view));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        this.f131771d = null;
        return C1764a.m5927a(layoutInflater, R.layout.adl, viewGroup, false);
    }
}
