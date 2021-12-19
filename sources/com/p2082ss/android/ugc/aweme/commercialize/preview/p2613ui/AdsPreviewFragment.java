package com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.preview.experiment.C38317a;
import com.p2082ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2608a.AbstractC38305a;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2610c.AbstractC38307a;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui.C38342c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment */
public final class AdsPreviewFragment extends AbstractC38341b implements AbstractC38305a {

    /* renamed from: a */
    public AdsPreviewStateManager f90573a;

    /* renamed from: b */
    public String f90574b;

    /* renamed from: c */
    public TuxDualBallView f90575c;

    /* renamed from: d */
    private TuxStatusView f90576d;

    /* renamed from: e */
    private HashMap f90577e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment$f */
    static final class C38335f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C38335f f90592a = new C38335f();

        static {
            Covode.recordClassIndex(45829);
        }

        C38335f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(45821);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.p2608a.AbstractC38305a
    /* renamed from: c */
    public final void mo66898c() {
        TuxStatusView tuxStatusView = this.f90576d;
        if (tuxStatusView != null) {
            tuxStatusView.mo37867a();
        }
    }

    /* renamed from: g */
    private static boolean m77723g() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final AdsPreviewStateManager mo66936f() {
        AdsPreviewStateManager adsPreviewStateManager = this.f90573a;
        if (adsPreviewStateManager == null) {
            C89219l.m154710a("adsPreviewStateManager");
        }
        return adsPreviewStateManager;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f90577e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment$a */
    public static final class C38328a implements TuxStatusView.AbstractC23262b {

        /* renamed from: a */
        final /* synthetic */ AdsPreviewFragment f90578a;

        static {
            Covode.recordClassIndex(45822);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.AbstractC23262b
        /* renamed from: a */
        public final void mo37874a() {
            TuxDualBallView tuxDualBallView = this.f90578a.f90575c;
            if (tuxDualBallView != null) {
                tuxDualBallView.mo37884b();
            }
            TuxDualBallView tuxDualBallView2 = this.f90578a.f90575c;
            if (tuxDualBallView2 != null) {
                tuxDualBallView2.setVisibility(0);
            }
        }

        @Override // com.bytedance.tux.status.TuxStatusView.AbstractC23262b
        /* renamed from: b */
        public final void mo37875b() {
            TuxDualBallView tuxDualBallView = this.f90578a.f90575c;
            if (tuxDualBallView != null) {
                tuxDualBallView.mo37885c();
            }
            TuxDualBallView tuxDualBallView2 = this.f90578a.f90575c;
            if (tuxDualBallView2 != null) {
                tuxDualBallView2.setVisibility(8);
            }
        }

        C38328a(AdsPreviewFragment adsPreviewFragment) {
            this.f90578a = adsPreviewFragment;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.p2608a.AbstractC38305a
    /* renamed from: d */
    public final void mo66899d() {
        AbstractC88412b a = AbstractC88979t.m154307b((long) C38317a.m77706a().getDelayTimeInMillisecond(), TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C38334e(this), C38335f.f90592a);
        C89219l.m154716b(a, "");
        AdsPreviewStateManager adsPreviewStateManager = this.f90573a;
        if (adsPreviewStateManager == null) {
            C89219l.m154710a("adsPreviewStateManager");
        }
        C88934a.m154195a(a, adsPreviewStateManager.f90558b);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.p2608a.AbstractC38305a
    /* renamed from: a */
    public final void mo66896a() {
        Context context = getContext();
        TuxStatusView tuxStatusView = this.f90576d;
        if (context != null && tuxStatusView != null) {
            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
            String string = context.getResources().getString(R.string.q3);
            C89219l.m154716b(string, "");
            cVar.mo37879a(string);
            String string2 = context.getResources().getString(R.string.q2);
            C89219l.m154716b(string2, "");
            cVar.mo37878a((CharSequence) string2);
            cVar.mo37877a(C23005c.m43393a(C38342c.C38345c.INSTANCE));
            cVar.f55132j = new C38338h(context, cVar, context, this);
            tuxStatusView.setStatus(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.p2608a.AbstractC38305a
    /* renamed from: b */
    public final void mo66897b() {
        Context context = getContext();
        TuxStatusView tuxStatusView = this.f90576d;
        if (context != null && tuxStatusView != null) {
            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
            String string = context.getResources().getString(R.string.q0);
            C89219l.m154716b(string, "");
            cVar.mo37879a(string);
            String string2 = context.getResources().getString(R.string.pz);
            C89219l.m154716b(string2, "");
            cVar.mo37878a((CharSequence) string2);
            cVar.mo37877a(C23005c.m43393a(C38342c.C38344b.INSTANCE));
            cVar.f55132j = new C38336g(context, cVar, context, context, this);
            tuxStatusView.setStatus(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.p2608a.AbstractC38305a
    /* renamed from: e */
    public final void mo66900e() {
        getContext();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m77723g();
        }
        if (!C58029j.f132253e) {
            Context context = getContext();
            TuxStatusView tuxStatusView = this.f90576d;
            if (context != null && tuxStatusView != null) {
                TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                String string = context.getResources().getString(R.string.pw);
                C89219l.m154716b(string, "");
                cVar.mo37879a(string);
                String string2 = context.getResources().getString(R.string.pv);
                C89219l.m154716b(string2, "");
                cVar.mo37878a((CharSequence) string2);
                cVar.mo37877a(C23005c.m43393a(C38342c.C38343a.INSTANCE));
                cVar.f55132j = new C38330c(context, cVar, context, this);
                tuxStatusView.setStatus(cVar);
                return;
            }
            return;
        }
        Context context2 = getContext();
        TuxStatusView tuxStatusView2 = this.f90576d;
        if (context2 != null && tuxStatusView2 != null) {
            TuxStatusView.C23263c cVar2 = new TuxStatusView.C23263c();
            String string3 = context2.getResources().getString(R.string.q0);
            C89219l.m154716b(string3, "");
            cVar2.mo37879a(string3);
            String string4 = context2.getResources().getString(R.string.pz);
            C89219l.m154716b(string4, "");
            cVar2.mo37878a((CharSequence) string4);
            cVar2.mo37877a(C23005c.m43393a(C38342c.C38344b.INSTANCE));
            cVar2.f55132j = new C38332d(context2, cVar2, context2, context2, this);
            tuxStatusView2.setStatus(cVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment$b */
    public static final class C38329b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ AdsPreviewFragment f90579a;

        static {
            Covode.recordClassIndex(45823);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38329b(AdsPreviewFragment adsPreviewFragment) {
            this.f90579a = adsPreviewFragment;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            ActivityC0945e activity = this.f90579a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment$c */
    public static final class C38330c extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f90580a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView.C23263c f90581b;

        /* renamed from: c */
        final /* synthetic */ Context f90582c;

        /* renamed from: d */
        final /* synthetic */ AdsPreviewFragment f90583d;

        static {
            Covode.recordClassIndex(45824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38330c(Context context, TuxStatusView.C23263c cVar, Context context2, AdsPreviewFragment adsPreviewFragment) {
            super(1);
            this.f90580a = context;
            this.f90581b = cVar;
            this.f90582c = context2;
            this.f90583d = adsPreviewFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            invoke(tuxButton);
            return C89391z.f203057a;
        }

        public final void invoke(TuxButton tuxButton) {
            C89219l.m154721d(tuxButton, "");
            tuxButton.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui.AdsPreviewFragment.C38330c.View$OnClickListenerC383311 */

                /* renamed from: a */
                final /* synthetic */ C38330c f90584a;

                static {
                    Covode.recordClassIndex(45825);
                }

                {
                    this.f90584a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f90584a.f90583d.mo66936f().mo66927a();
                }
            });
            tuxButton.setText(this.f90580a.getResources().getString(R.string.pu));
            tuxButton.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise));
            tuxButton.setButtonSize(3);
            tuxButton.setButtonVariant(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment$d */
    public static final class C38332d extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f90585a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView.C23263c f90586b;

        /* renamed from: c */
        final /* synthetic */ Context f90587c;

        /* renamed from: d */
        final /* synthetic */ Context f90588d;

        /* renamed from: e */
        final /* synthetic */ AdsPreviewFragment f90589e;

        static {
            Covode.recordClassIndex(45826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38332d(Context context, TuxStatusView.C23263c cVar, Context context2, Context context3, AdsPreviewFragment adsPreviewFragment) {
            super(1);
            this.f90585a = context;
            this.f90586b = cVar;
            this.f90587c = context2;
            this.f90588d = context3;
            this.f90589e = adsPreviewFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            invoke(tuxButton);
            return C89391z.f203057a;
        }

        public final void invoke(TuxButton tuxButton) {
            C89219l.m154721d(tuxButton, "");
            tuxButton.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui.AdsPreviewFragment.C38332d.View$OnClickListenerC383331 */

                /* renamed from: a */
                final /* synthetic */ C38332d f90590a;

                static {
                    Covode.recordClassIndex(45827);
                }

                {
                    this.f90590a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    SmartRouter.buildRoute(this.f90590a.f90588d, "//aweme/scan").withParam("finishAfterScan", true).open();
                    ActivityC0945e activity = this.f90590a.f90589e.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
            tuxButton.setText(this.f90585a.getResources().getString(R.string.py));
            tuxButton.setButtonSize(3);
            tuxButton.setButtonVariant(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment$e */
    static final class C38334e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AdsPreviewFragment f90591a;

        static {
            Covode.recordClassIndex(45828);
        }

        C38334e(AdsPreviewFragment adsPreviewFragment) {
            this.f90591a = adsPreviewFragment;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AwemeService.m70060b().mo60681a();
            SmartRouter.buildRoute(this.f90591a.getContext(), "//main").addFlags(268468224).open();
            ActivityC0945e activity = this.f90591a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment$g */
    public static final class C38336g extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f90593a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView.C23263c f90594b;

        /* renamed from: c */
        final /* synthetic */ Context f90595c;

        /* renamed from: d */
        final /* synthetic */ Context f90596d;

        /* renamed from: e */
        final /* synthetic */ AdsPreviewFragment f90597e;

        static {
            Covode.recordClassIndex(45830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38336g(Context context, TuxStatusView.C23263c cVar, Context context2, Context context3, AdsPreviewFragment adsPreviewFragment) {
            super(1);
            this.f90593a = context;
            this.f90594b = cVar;
            this.f90595c = context2;
            this.f90596d = context3;
            this.f90597e = adsPreviewFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            invoke(tuxButton);
            return C89391z.f203057a;
        }

        public final void invoke(TuxButton tuxButton) {
            C89219l.m154721d(tuxButton, "");
            tuxButton.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui.AdsPreviewFragment.C38336g.View$OnClickListenerC383371 */

                /* renamed from: a */
                final /* synthetic */ C38336g f90598a;

                static {
                    Covode.recordClassIndex(45831);
                }

                {
                    this.f90598a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    SmartRouter.buildRoute(this.f90598a.f90596d, "//aweme/scan").withParam("finishAfterScan", true).open();
                    ActivityC0945e activity = this.f90598a.f90597e.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
            tuxButton.setText(this.f90593a.getResources().getString(R.string.py));
            tuxButton.setButtonSize(3);
            tuxButton.setButtonVariant(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment$h */
    public static final class C38338h extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f90599a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView.C23263c f90600b;

        /* renamed from: c */
        final /* synthetic */ Context f90601c;

        /* renamed from: d */
        final /* synthetic */ AdsPreviewFragment f90602d;

        static {
            Covode.recordClassIndex(45832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38338h(Context context, TuxStatusView.C23263c cVar, Context context2, AdsPreviewFragment adsPreviewFragment) {
            super(1);
            this.f90599a = context;
            this.f90600b = cVar;
            this.f90601c = context2;
            this.f90602d = adsPreviewFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            invoke(tuxButton);
            return C89391z.f203057a;
        }

        public final void invoke(TuxButton tuxButton) {
            C89219l.m154721d(tuxButton, "");
            tuxButton.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui.AdsPreviewFragment.C38338h.View$OnClickListenerC383391 */

                /* renamed from: a */
                final /* synthetic */ C38338h f90603a;

                static {
                    Covode.recordClassIndex(45833);
                }

                {
                    this.f90603a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f90603a.f90602d.mo66936f().mo66927a();
                    C39162r.onEventV3("ads_interface_preview_ad_click_ttuser");
                }
            });
            tuxButton.setText(this.f90599a.getResources().getString(R.string.q1));
            tuxButton.setButtonSize(3);
            tuxButton.setButtonVariant(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ActivityC0945e activity;
        Window window;
        View decorView;
        super.onCreate(bundle);
        AbstractC1196i lifecycle = getLifecycle();
        AdsPreviewStateManager adsPreviewStateManager = this.f90573a;
        if (adsPreviewStateManager == null) {
            C89219l.m154710a("adsPreviewStateManager");
        }
        lifecycle.mo4012a(adsPreviewStateManager);
        AdsPreviewStateManager adsPreviewStateManager2 = this.f90573a;
        if (adsPreviewStateManager2 == null) {
            C89219l.m154710a("adsPreviewStateManager");
        }
        String str = this.f90574b;
        String str2 = "";
        C89219l.m154721d(this, str2);
        adsPreviewStateManager2.f90559c = this;
        AbstractC88412b a = adsPreviewStateManager2.f90557a.mo143283c().mo143266a(C88446a.f200695a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AdsPreviewStateManager.C38319b(adsPreviewStateManager2), AdsPreviewStateManager.C38320c.f90564a);
        C89219l.m154716b(a, str2);
        C88934a.m154195a(a, adsPreviewStateManager2.f90558b);
        if (str != null) {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, str2);
            String path = parse.getPath();
            if (path == null) {
                path = str2;
            }
            adsPreviewStateManager2.f90560d = path;
            String queryParameter = parse.getQueryParameter("token");
            if (queryParameter != null) {
                str2 = queryParameter;
            }
            adsPreviewStateManager2.f90561e = str2;
            if (adsPreviewStateManager2.f90560d.length() == 0 || adsPreviewStateManager2.f90561e.length() == 0) {
                adsPreviewStateManager2.mo66928a(AbstractC38307a.C38311d.f90535a);
            } else {
                adsPreviewStateManager2.mo66928a(AbstractC38307a.C38312e.f90536a);
            }
        } else {
            adsPreviewStateManager2.mo66928a(AbstractC38307a.C38311d.f90535a);
        }
        C23073a.C23074a.m43506a(this).mo37494a(R.color.l).f54627a.mo33415d();
        if (!(Build.VERSION.SDK_INT < 23 || (activity = getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.setSystemUiVisibility(8192);
        }
        C39162r.onEventV3("ads_interface_qrcode_preview_scan");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((TextTitleBar) view.findViewById(R.id.eim)).setOnTitleBarClickListener(new C38329b(this));
        this.f90575c = (TuxDualBallView) view.findViewById(R.id.cff);
        TuxStatusView tuxStatusView = (TuxStatusView) view.findViewById(R.id.e77);
        tuxStatusView.mo37869a(new C38328a(this));
        this.f90576d = tuxStatusView;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0k, viewGroup, false);
    }
}
