package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38426i;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h */
public final class C38409h extends C34685e implements AbstractC64147a {

    /* renamed from: c */
    public static final C38410a f90754c = new C38410a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f90755a = C89250i.m154773a((AbstractC89171a) new C38415f(this));

    /* renamed from: b */
    public Aweme f90756b;

    /* renamed from: d */
    private final AbstractC89244h f90757d = C89250i.m154773a((AbstractC89171a) new C38417h(this));

    /* renamed from: j */
    private final AbstractC89244h f90758j = C89250i.m154773a((AbstractC89171a) new C38419j(this));

    /* renamed from: k */
    private final AbstractC89244h f90759k = C89250i.m154773a((AbstractC89171a) new C38420k(this));

    /* renamed from: l */
    private final AbstractC89244h f90760l = C89250i.m154773a((AbstractC89171a) new C38414e(this));

    /* renamed from: m */
    private final AbstractC89244h f90761m = C89250i.m154773a((AbstractC89171a) new C38418i(this));

    /* renamed from: n */
    private final AbstractC89244h f90762n = C89250i.m154773a((AbstractC89171a) new C38413d(this));

    /* renamed from: o */
    private final AbstractC89244h f90763o = C89250i.m154773a((AbstractC89171a) new C38416g(this));

    /* renamed from: p */
    private DataCenter f90764p;

    /* renamed from: q */
    private C33947e f90765q;

    /* renamed from: r */
    private HashMap f90766r;

    static {
        Covode.recordClassIndex(45916);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: a */
    public final View mo61343a(int i) {
        if (this.f90766r == null) {
            this.f90766r = new HashMap();
        }
        View view = (View) this.f90766r.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f90766r.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ConstraintLayout mo67003a() {
        return (ConstraintLayout) this.f90758j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a
    /* renamed from: a */
    public final void mo67005a(String str) {
    }

    /* renamed from: b */
    public final TextView mo67007b() {
        return (TextView) this.f90759k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: e */
    public final void mo61344e() {
        HashMap hashMap = this.f90766r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo61344e();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$a */
    public static final class C38410a {
        static {
            Covode.recordClassIndex(45917);
        }

        private C38410a() {
        }

        public /* synthetic */ C38410a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a
    /* renamed from: c */
    public final Fragment mo67008c() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$d */
    static final class C38413d extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90769a;

        static {
            Covode.recordClassIndex(45920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38413d(C38409h hVar) {
            super(0);
            this.f90769a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f90769a.mo61343a(R.id.pi);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$e */
    static final class C38414e extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90770a;

        static {
            Covode.recordClassIndex(45921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38414e(C38409h hVar) {
            super(0);
            this.f90770a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f90770a.mo61343a(R.id.ew);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$f */
    static final class C38415f extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90771a;

        static {
            Covode.recordClassIndex(45922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38415f(C38409h hVar) {
            super(0);
            this.f90771a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f90771a.mo61343a(R.id.d9e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$g */
    static final class C38416g extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90772a;

        static {
            Covode.recordClassIndex(45923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38416g(C38409h hVar) {
            super(0);
            this.f90772a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f90772a.mo61343a(R.id.clm);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$h */
    static final class C38417h extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90773a;

        static {
            Covode.recordClassIndex(45924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38417h(C38409h hVar) {
            super(0);
            this.f90773a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f90773a.mo61343a(R.id.dnk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$i */
    static final class C38418i extends AbstractC89220m implements AbstractC89171a<DampScrollableLayout> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90774a;

        static {
            Covode.recordClassIndex(45925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38418i(C38409h hVar) {
            super(0);
            this.f90774a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DampScrollableLayout invoke() {
            return this.f90774a.mo61343a(R.id.dqd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$j */
    static final class C38419j extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90775a;

        static {
            Covode.recordClassIndex(45926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38419j(C38409h hVar) {
            super(0);
            this.f90775a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.f90775a.mo61343a(R.id.eiz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$k */
    static final class C38420k extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90776a;

        static {
            Covode.recordClassIndex(45927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38420k(C38409h hVar) {
            super(0);
            this.f90776a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f90776a.mo61343a(R.id.csk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$c */
    public static final class C38412c implements ScrollableLayout.AbstractC39210b {

        /* renamed from: a */
        final /* synthetic */ C38409h f90768a;

        static {
            Covode.recordClassIndex(45919);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        /* renamed from: a */
        public final void mo62628a(float f, float f2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        public final boolean av_() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38412c(C38409h hVar) {
            this.f90768a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        /* renamed from: b */
        public final void mo62635b(int i, int i2) {
            Rect c = C34729o.m70961c(this.f90768a.mo67003a());
            Rect c2 = C34729o.m70961c((TextView) this.f90768a.f90755a.getValue());
            if (c.bottom > c2.bottom && this.f90768a.mo67007b().getAlpha() == 0.0f) {
                this.f90768a.mo67007b().animate().alpha(1.0f).setDuration(350).start();
            } else if (c.bottom < c2.bottom && this.f90768a.mo67007b().getAlpha() == 1.0f) {
                this.f90768a.mo67007b().animate().alpha(0.0f).setDuration(350).start();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a
    /* renamed from: a */
    public final void mo67006a(boolean z) {
        setUserVisibleHint(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$l */
    static final class View$OnClickListenerC38421l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f90777a;

        static {
            Covode.recordClassIndex(45928);
        }

        View$OnClickListenerC38421l(AbstractC89171a aVar) {
            this.f90777a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f90777a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$m */
    static final class View$OnClickListenerC38422m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38409h f90778a;

        static {
            Covode.recordClassIndex(45929);
        }

        View$OnClickListenerC38422m(C38409h hVar) {
            this.f90778a = hVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$m$a */
        static final class C38423a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC38422m f90779a;

            static {
                Covode.recordClassIndex(45930);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38423a(View$OnClickListenerC38422m mVar) {
                super(1);
                this.f90779a = mVar;
            }

            /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$m$a$a */
            static final class C38424a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

                /* renamed from: a */
                public static final C38424a f90780a = new C38424a();

                static {
                    Covode.recordClassIndex(45931);
                }

                C38424a() {
                    super(1);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23025b bVar) {
                    C23025b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    bVar2.mo37416a(R.string.a7h, (AbstractC89172b<? super C23024a, C89391z>) null);
                    return C89391z.f203057a;
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(View view) {
                AwemeRawAd awemeRawAd;
                C89219l.m154721d(view, "");
                Aweme aweme = this.f90779a.f90778a.f90756b;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("homepage_ad", "otherclick", awemeRawAd).mo28900b("refer", "hint").mo28901b();
                ActivityC0945e activity = this.f90779a.f90778a.getActivity();
                if (activity != null) {
                    C89219l.m154716b(activity, "");
                    C23028c.m43435a((C23023b) new C23023b(activity).mo37479a(R.string.of).mo37483b(R.string.og), C38424a.f90780a).mo37405a().mo37396b().show();
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$m$b */
        static final class C38425b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC38422m f90781a;

            static {
                Covode.recordClassIndex(45932);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38425b(View$OnClickListenerC38422m mVar) {
                super(1);
                this.f90781a = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(View view) {
                Activity activity;
                C89219l.m154721d(view, "");
                Aweme aweme = this.f90781a.f90778a.f90756b;
                if (!(aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null)) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(awemeRawAd, "");
                    if (awemeRawAd.isReportEnable()) {
                        IReportService a = C39223a.m79587a();
                        Context context = this.f90781a.f90778a.getContext();
                        if (context != null) {
                            activity = C69124b.m122223a(context);
                        } else {
                            activity = null;
                        }
                        a.mo68694b(activity, C67105b.m118760a(aweme, "homepage_ad", "ad"));
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$d[] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new C23208a.C23211b().mo37796a(new C23208a.C23213d().mo37801c(R.raw.icon_info_circle).mo37785a(R.string.of).mo37787a(new C38423a(this)), new C23208a.C23213d().mo37801c(R.raw.icon_flag).mo37785a(R.string.fa_).mo37787a(new C38425b(this))).mo37800b().show(this.f90778a.getFragmentManager(), "new_fake_author_more_sheet");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$b */
    static final class C38411b extends AbstractC89220m implements AbstractC89172b<C38426i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C38409h f90767a;

        static {
            Covode.recordClassIndex(45918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38411b(C38409h hVar) {
            super(1);
            this.f90767a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C38426i iVar) {
            C38426i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.f90782a = this.f90767a.f90756b;
            iVar2.f90783b = this.f90767a;
            iVar2.f90784c = null;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64147a
    /* renamed from: a */
    public final void mo67004a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        ((View) this.f90762n.getValue()).setOnClickListener(new View$OnClickListenerC38421l(aVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        AwemeRawAd awemeRawAd;
        super.setUserVisibleHint(z);
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
        DataCenter dataCenter = this.f90764p;
        if (dataCenter != null) {
            dataCenter.mo60191a("AD_PROFILE_VISIBILITY_CHANGED", Boolean.valueOf(z));
        }
        if (!z) {
            Aweme aweme = this.f90756b;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("homepage_ad", "close", awemeRawAd).mo28901b();
            AwemeService.m70060b().mo60677a(this.f90756b);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        User author;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("aweme_id");
        } else {
            str = null;
        }
        this.f90756b = C37699a.m76289d(str);
        DataCenter a = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        this.f90764p = a;
        if (a != null) {
            a.mo60191a("AD_PROFILE_PARAMS", (Object) new C38426i.C38427a().mo67169a(new C38411b(this)).f91182a);
        }
        ViewGroup.LayoutParams layoutParams = mo67003a().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C33403c.m68511d(getContext());
            mo67003a().setLayoutParams(marginLayoutParams);
        }
        if (!C37699a.m76239aK(this.f90756b) && !C37699a.m76240aL(this.f90756b)) {
            ((ViewGroup) this.f90760l.getValue()).setVisibility(8);
        }
        TextView b = mo67007b();
        Aweme aweme = this.f90756b;
        if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
            str2 = author.getNickname();
        }
        b.setText(str2);
        ((DampScrollableLayout) this.f90761m.getValue()).mo68059a(new C38412c(this));
        ((View) this.f90763o.getValue()).setOnClickListener(new View$OnClickListenerC38422m(this));
        C33947e a2 = C33947e.m69516a(this, (View) this.f90757d.getValue());
        this.f90765q = a2;
        if (a2 != null) {
            a2.mo60218a(this.f90764p);
        }
        C33947e eVar = this.f90765q;
        if (eVar != null) {
            boolean z = false;
            if (C37699a.m76239aK(this.f90756b)) {
                eVar.mo60221b(R.id.ew, new AdNewFakeBottomDescBarWidget(false));
            } else {
                Aweme aweme2 = this.f90756b;
                if (!(aweme2 == null || aweme2.getAwemeRawAd() == null)) {
                    AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                    if (C37699a.m76304j(awemeRawAd) && !TextUtils.isEmpty(awemeRawAd.getWebUrl()) && ((!C37699a.m76298g(awemeRawAd) && !C37699a.m76242aN(aweme2) && C37699a.m76306k(awemeRawAd) && C37699a.m76245aQ(aweme2)) || ((!C37699a.m76298g(awemeRawAd) && !C37699a.m76242aN(aweme2) && !C37699a.m76306k(awemeRawAd) && C37699a.m76245aQ(aweme2)) || (C37699a.m76298g(awemeRawAd) && ((C37699a.m76300h(awemeRawAd) && !C37699a.m76302i(awemeRawAd)) || (!C37699a.m76300h(awemeRawAd) && C37699a.m76245aQ(aweme2))))))) {
                        z = true;
                    }
                }
                if (z) {
                    eVar.mo60221b(R.id.f1, new AdNewFakePopUpWebPageWidget());
                } else if (C37699a.m76240aL(this.f90756b)) {
                    eVar.mo60221b(R.id.ew, new AdNewFakeBottomDescBarWidget(true));
                    eVar.mo60221b(R.id.f1, new AdNewFakePopUpWebPageWidget());
                }
            }
            eVar.mo60221b(R.id.aye, new AdNewFakeUserProfileHeaderWidget());
            eVar.mo60221b(R.id.dqd, new AdNewFakeUserProfileDetailFragmentWidget());
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.an_, viewGroup, false);
    }
}
