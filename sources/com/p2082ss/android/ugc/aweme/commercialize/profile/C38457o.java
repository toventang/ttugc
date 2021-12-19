package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38212aa;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38426i;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38741f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoNewDescWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o */
public final class C38457o extends C34685e implements AbstractC1214u<C33942b>, AbstractC64147a {

    /* renamed from: c */
    public static final String f90843c = C38457o.class.getSimpleName();

    /* renamed from: d */
    public static final C38458a f90844d = new C38458a((byte) 0);

    /* renamed from: A */
    private C33947e f90845A;

    /* renamed from: B */
    private SparseArray f90846B;

    /* renamed from: a */
    public Aweme f90847a;

    /* renamed from: b */
    public String f90848b;

    /* renamed from: j */
    private final AbstractC89244h f90849j = C89250i.m154773a((AbstractC89171a) new C38466i(this));

    /* renamed from: k */
    private final AbstractC89244h f90850k = C89250i.m154773a((AbstractC89171a) new C38470m(this));

    /* renamed from: l */
    private final AbstractC89244h f90851l = C89250i.m154773a((AbstractC89171a) new C38463f(this));

    /* renamed from: m */
    private final AbstractC89244h f90852m = C89250i.m154773a((AbstractC89171a) new C38469l(this));

    /* renamed from: n */
    private final AbstractC89244h f90853n = C89250i.m154773a((AbstractC89171a) new C38467j(this));

    /* renamed from: o */
    private final AbstractC89244h f90854o = C89250i.m154773a((AbstractC89171a) new C38471n(this));

    /* renamed from: p */
    private final AbstractC89244h f90855p = C89250i.m154773a((AbstractC89171a) new C38473p(this));

    /* renamed from: q */
    private final AbstractC89244h f90856q = C89250i.m154773a((AbstractC89171a) new C38472o(this));

    /* renamed from: r */
    private final AbstractC89244h f90857r = C89250i.m154773a((AbstractC89171a) new C38468k(this));

    /* renamed from: s */
    private final AbstractC89244h f90858s = C89250i.m154773a((AbstractC89171a) new C38461d(this));

    /* renamed from: t */
    private final AbstractC89244h f90859t = C89250i.m154773a((AbstractC89171a) new C38462e(this));

    /* renamed from: u */
    private final AbstractC89244h f90860u = C89250i.m154773a((AbstractC89171a) new C38474q(this));

    /* renamed from: v */
    private final AbstractC89244h f90861v = C89250i.m154773a((AbstractC89171a) new C38465h(this));

    /* renamed from: w */
    private final AbstractC89244h f90862w = C89250i.m154773a((AbstractC89171a) new C38464g(this));

    /* renamed from: y */
    private String f90863y;

    /* renamed from: z */
    private DataCenter f90864z;

    /* renamed from: g */
    private final View m77902g() {
        return (View) this.f90849j.getValue();
    }

    /* renamed from: h */
    private final TextView m77903h() {
        return (TextView) this.f90856q.getValue();
    }

    /* renamed from: i */
    private final TextView m77904i() {
        return (TextView) this.f90857r.getValue();
    }

    /* renamed from: j */
    private final ConstraintLayout m77905j() {
        return (ConstraintLayout) this.f90859t.getValue();
    }

    /* renamed from: k */
    private final View m77906k() {
        return (View) this.f90862w.getValue();
    }

    /* renamed from: a */
    public final View mo67019a() {
        return (View) this.f90850k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: a */
    public final View mo61343a(int i) {
        if (this.f90846B == null) {
            this.f90846B = new SparseArray();
        }
        View view = (View) this.f90846B.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f90846B.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final TextView mo67020b() {
        return (TextView) this.f90852m.getValue();
    }

    /* renamed from: d */
    public final TextView mo67021d() {
        return (TextView) this.f90855p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: e */
    public final void mo61344e() {
        SparseArray sparseArray = this.f90846B;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo61344e();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$a */
    public static final class C38458a {
        static {
            Covode.recordClassIndex(45966);
        }

        private C38458a() {
        }

        public /* synthetic */ C38458a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C20714a m77917a(User user) {
            UrlModel avatarLarger;
            if (user == null) {
                return null;
            }
            if (user.getAvatarMedium() != null) {
                avatarLarger = user.getAvatarMedium();
            } else if (user.getAvatarThumb() != null) {
                avatarLarger = user.getAvatarThumb();
            } else {
                if (user.getAvatarLarger() != null) {
                    avatarLarger = user.getAvatarLarger();
                }
                return null;
            }
            if (avatarLarger != null) {
                return new C20714a(avatarLarger.getUrlList());
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a
    /* renamed from: c */
    public final Fragment mo67008c() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$d */
    static final class C38461d extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90867a;

        static {
            Covode.recordClassIndex(45969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38461d(C38457o oVar) {
            super(0);
            this.f90867a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f90867a.mo61343a(R.id.d_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$e */
    static final class C38462e extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90868a;

        static {
            Covode.recordClassIndex(45970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38462e(C38457o oVar) {
            super(0);
            this.f90868a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f90868a.mo61343a(R.id.da);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$f */
    static final class C38463f extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90869a;

        static {
            Covode.recordClassIndex(45971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38463f(C38457o oVar) {
            super(0);
            this.f90869a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f90869a.mo61343a(R.id.pf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$g */
    static final class C38464g extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90870a;

        static {
            Covode.recordClassIndex(45972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38464g(C38457o oVar) {
            super(0);
            this.f90870a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f90870a.mo61343a(R.id.ave);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$h */
    static final class C38465h extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90871a;

        static {
            Covode.recordClassIndex(45973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38465h(C38457o oVar) {
            super(0);
            this.f90871a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f90871a.mo61343a(R.id.fcd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$i */
    static final class C38466i extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90872a;

        static {
            Covode.recordClassIndex(45974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38466i(C38457o oVar) {
            super(0);
            this.f90872a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f90872a.mo61343a(R.id.dnk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$j */
    static final class C38467j extends AbstractC89220m implements AbstractC89171a<NestedScrollView> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90873a;

        static {
            Covode.recordClassIndex(45975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38467j(C38457o oVar) {
            super(0);
            this.f90873a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NestedScrollView invoke() {
            return this.f90873a.mo61343a(R.id.dqb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$k */
    static final class C38468k extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90874a;

        static {
            Covode.recordClassIndex(45976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38468k(C38457o oVar) {
            super(0);
            this.f90874a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f90874a.mo61343a(R.id.eih);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$l */
    static final class C38469l extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90875a;

        static {
            Covode.recordClassIndex(45977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38469l(C38457o oVar) {
            super(0);
            this.f90875a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f90875a.mo61343a(R.id.title);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$m */
    static final class C38470m extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90876a;

        static {
            Covode.recordClassIndex(45978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38470m(C38457o oVar) {
            super(0);
            this.f90876a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f90876a.mo61343a(R.id.eiz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$n */
    static final class C38471n extends AbstractC89220m implements AbstractC89171a<SmartRoundImageView> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90877a;

        static {
            Covode.recordClassIndex(45979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38471n(C38457o oVar) {
            super(0);
            this.f90877a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartRoundImageView invoke() {
            return this.f90877a.mo61343a(R.id.f__);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$o */
    static final class C38472o extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90878a;

        static {
            Covode.recordClassIndex(45980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38472o(C38457o oVar) {
            super(0);
            this.f90878a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f90878a.mo61343a(R.id.f_o);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$p */
    static final class C38473p extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90879a;

        static {
            Covode.recordClassIndex(45981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38473p(C38457o oVar) {
            super(0);
            this.f90879a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f90879a.mo61343a(R.id.fa1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$q */
    static final class C38474q extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90880a;

        static {
            Covode.recordClassIndex(45982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38474q(C38457o oVar) {
            super(0);
            this.f90880a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f90880a.mo61343a(R.id.fcb);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.f90864z;
        if (dataCenter != null) {
            dataCenter.mo60188a(this);
        }
    }

    static {
        Covode.recordClassIndex(45965);
    }

    /* renamed from: l */
    private final boolean m77907l() {
        AwemeRawAd awemeRawAd;
        C38212aa fakeAuthor;
        Integer fakeAuthorVersion;
        Aweme aweme = this.f90847a;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || (fakeAuthorVersion = fakeAuthor.getFakeAuthorVersion()) == null || fakeAuthorVersion.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a
    /* renamed from: a */
    public final void mo67005a(String str) {
        this.f90863y = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a
    /* renamed from: a */
    public final void mo67006a(boolean z) {
        setUserVisibleHint(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$r */
    static final class View$OnClickListenerC38475r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f90881a;

        static {
            Covode.recordClassIndex(45983);
        }

        View$OnClickListenerC38475r(AbstractC89171a aVar) {
            this.f90881a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90881a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$b */
    static final class C38459b extends AbstractC89220m implements AbstractC89172b<C38426i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C38457o f90865a;

        static {
            Covode.recordClassIndex(45967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38459b(C38457o oVar) {
            super(1);
            this.f90865a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C38426i iVar) {
            C38426i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.f90782a = this.f90865a.f90847a;
            iVar2.f90783b = this.f90865a;
            iVar2.f90784c = this.f90865a.f90848b;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a
    /* renamed from: a */
    public final void mo67004a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        ((ImageView) this.f90851l.getValue()).setOnClickListener(new View$OnClickListenerC38475r(aVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        DataCenter dataCenter = this.f90864z;
        if (dataCenter != null) {
            dataCenter.mo60191a("AD_PROFILE_VISIBILITY_CHANGED", Boolean.valueOf(z));
        }
        C34729o.m70953a((Activity) getActivity());
        if (z) {
            ActivityC0945e activity = getActivity();
            if (activity != null && Build.VERSION.SDK_INT >= 23) {
                Window window = activity.getWindow();
                C89219l.m154716b(window, "");
                View decorView = window.getDecorView();
                C89219l.m154716b(decorView, "");
                int systemUiVisibility = decorView.getSystemUiVisibility();
                Window window2 = activity.getWindow();
                C89219l.m154716b(window2, "");
                View decorView2 = window2.getDecorView();
                C89219l.m154716b(decorView2, "");
                decorView2.setSystemUiVisibility(systemUiVisibility | 8192);
            }
        } else {
            ActivityC0945e activity2 = getActivity();
            if (activity2 != null && Build.VERSION.SDK_INT >= 23) {
                Window window3 = activity2.getWindow();
                C89219l.m154716b(window3, "");
                View decorView3 = window3.getDecorView();
                C89219l.m154716b(decorView3, "");
                decorView3.setSystemUiVisibility(1024);
            }
        }
        C38741f.f91490c = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f80277a) != null && str.hashCode() == 860337036 && str.equals("ON_VIDEO_CONTAINER_SIZE_CHANGE")) {
            Rect c = C34729o.m70961c(m77902g().findViewById(R.id.fc6));
            View findViewById = m77902g().findViewById(R.id.fc5);
            Rect c2 = C34729o.m70961c(findViewById);
            View findViewById2 = m77902g().findViewById(R.id.d_);
            Rect c3 = C34729o.m70961c(m77902g().findViewById(R.id.d_));
            C89219l.m154716b(findViewById2, "");
            float a = (((float) c3.top) + (((float) C34728n.m70946a(-16.0d)) - findViewById2.getTranslationY())) - ((float) c.top);
            if (m77907l()) {
                a = (float) (C34729o.m70961c(m77902g().findViewById(R.id.ave)).top - c.top);
            }
            if (a - ((float) c2.height()) > 0.0f) {
                C89219l.m154716b(findViewById, "");
                findViewById.setTranslationY((a - ((float) c2.height())) / 2.0f);
            }
            Rect c4 = C34729o.m70961c(m77902g());
            View findViewById3 = m77902g().findViewById(R.id.fc8);
            int i = c4.bottom - C34729o.m70961c(findViewById3).top;
            if (i > 0) {
                C89219l.m154716b(findViewById3, "");
                ViewWrapper viewWrapper = new ViewWrapper(findViewById3);
                viewWrapper.setWidth(c4.width());
                viewWrapper.setHeight(i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        User user;
        String str5;
        AwemeRawAd awemeRawAd;
        C38212aa fakeAuthor;
        String str6;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        String str7;
        String str8;
        String str9;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        AwemeRawAd awemeRawAd6;
        C38212aa fakeAuthor2;
        User author;
        User author2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str10 = null;
        if (arguments != null) {
            str = arguments.getString("aweme_id");
        } else {
            str = null;
        }
        this.f90847a = C37699a.m76289d(str);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("enter_from");
        } else {
            str2 = null;
        }
        this.f90848b = str2;
        DataCenter a = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        this.f90864z = a;
        if (a != null) {
            a.mo60191a("AD_PROFILE_PARAMS", (Object) new C38426i.C38427a().mo67169a(new C38459b(this)).f91182a);
        }
        ViewGroup.LayoutParams layoutParams = mo67019a().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C33403c.m68511d(getContext());
            mo67019a().setLayoutParams(marginLayoutParams);
        }
        TextView b = mo67020b();
        Aweme aweme = this.f90847a;
        if (aweme == null || (author2 = aweme.getAuthor()) == null) {
            str3 = null;
        } else {
            str3 = author2.getNickname();
        }
        b.setText(str3);
        ((NestedScrollView) this.f90853n.getValue()).setOnScrollChangeListener(new C38460c(this));
        TextView d = mo67021d();
        Aweme aweme2 = this.f90847a;
        if (aweme2 == null || (author = aweme2.getAuthor()) == null) {
            str4 = null;
        } else {
            str4 = author.getNickname();
        }
        d.setText(str4);
        Aweme aweme3 = this.f90847a;
        if (aweme3 != null) {
            user = aweme3.getAuthor();
        } else {
            user = null;
        }
        C20714a a2 = C38458a.m77917a(user);
        if (a2 != null) {
            C20766v a3 = C20761r.m39058a(a2);
            a3.f49092E = (SmartRoundImageView) this.f90854o.getValue();
            a3.mo34186c();
        }
        if (m77907l()) {
            m77904i().setVisibility(0);
            m77903h().setVisibility(8);
            TextView i = m77904i();
            Aweme aweme4 = this.f90847a;
            if (aweme4 == null || (awemeRawAd6 = aweme4.getAwemeRawAd()) == null || (fakeAuthor2 = awemeRawAd6.getFakeAuthor()) == null) {
                str7 = null;
            } else {
                str7 = fakeAuthor2.getDescription();
            }
            i.setText(str7);
            ((ConstraintLayout) this.f90858s.getValue()).setVisibility(8);
            ((FrameLayout) this.f90860u.getValue()).setVisibility(8);
            m77906k().setVisibility(0);
            Aweme aweme5 = this.f90847a;
            if (aweme5 == null || (awemeRawAd5 = aweme5.getAwemeRawAd()) == null) {
                str8 = null;
            } else {
                str8 = awemeRawAd5.getOpenUrl();
            }
            if (!C37699a.m76288c(str8)) {
                Aweme aweme6 = this.f90847a;
                if (aweme6 == null || (awemeRawAd4 = aweme6.getAwemeRawAd()) == null) {
                    str9 = null;
                } else {
                    str9 = awemeRawAd4.getType();
                }
                if (!C89219l.m154714a((Object) str9, (Object) "app")) {
                    m77905j().setVisibility(8);
                }
            }
        } else {
            m77904i().setVisibility(8);
            m77903h().setVisibility(0);
            TextView h = m77903h();
            Aweme aweme7 = this.f90847a;
            if (aweme7 == null || (awemeRawAd = aweme7.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null) {
                str5 = null;
            } else {
                str5 = fakeAuthor.getDescription();
            }
            h.setText(str5);
            ((LinearLayout) this.f90861v.getValue()).setVisibility(8);
            m77905j().setVisibility(8);
            m77906k().setVisibility(8);
        }
        DataCenter dataCenter = this.f90864z;
        if (dataCenter != null) {
            dataCenter.mo60189a("ON_VIDEO_CONTAINER_SIZE_CHANGE", (AbstractC1214u<C33942b>) this);
        }
        C33947e a4 = C33947e.m69516a(this, m77902g());
        this.f90845A = a4;
        if (a4 != null) {
            a4.mo60218a(this.f90864z);
        }
        C33947e eVar = this.f90845A;
        if (eVar != null) {
            eVar.mo60221b(R.id.fc6, new AdFakeUserProfileVideoPlayWidget());
            if (m77907l()) {
                eVar.mo60221b(R.id.fcd, new AdFakeUserProfileVideoNewDescWidget());
                Aweme aweme8 = this.f90847a;
                if (aweme8 == null || (awemeRawAd3 = aweme8.getAwemeRawAd()) == null) {
                    str6 = null;
                } else {
                    str6 = awemeRawAd3.getOpenUrl();
                }
                if (!C37699a.m76288c(str6)) {
                    Aweme aweme9 = this.f90847a;
                    if (!(aweme9 == null || (awemeRawAd2 = aweme9.getAwemeRawAd()) == null)) {
                        str10 = awemeRawAd2.getType();
                    }
                    if (!C89219l.m154714a((Object) str10, (Object) "app")) {
                        eVar.mo60221b(R.id.e0, new AdFakePopUpWebPageWidget());
                        return;
                    }
                }
                eVar.mo60221b(R.id.da, new AdFakeUserProfileNewBottomBarWidget());
                return;
            }
            eVar.mo60221b(R.id.d_, new AdFakeUserProfileBottomBarWidget());
            eVar.mo60221b(R.id.fcb, new AdFakeUserProfileVideoDescWidget());
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0x, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$c */
    static final class C38460c implements NestedScrollView.AbstractC0813b {

        /* renamed from: a */
        final /* synthetic */ C38457o f90866a;

        static {
            Covode.recordClassIndex(45968);
        }

        C38460c(C38457o oVar) {
            this.f90866a = oVar;
        }

        @Override // androidx.core.widget.NestedScrollView.AbstractC0813b
        /* renamed from: a */
        public final void mo381a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            Rect c = C34729o.m70961c(this.f90866a.mo67019a());
            Rect c2 = C34729o.m70961c(this.f90866a.mo67021d());
            if (c.bottom > c2.bottom && this.f90866a.mo67020b().getAlpha() == 0.0f) {
                this.f90866a.mo67020b().animate().alpha(1.0f).setDuration(350).start();
            } else if (c.bottom < c2.bottom && this.f90866a.mo67020b().getAlpha() == 1.0f) {
                this.f90866a.mo67020b().animate().alpha(0.0f).setDuration(350).start();
            }
        }
    }
}
