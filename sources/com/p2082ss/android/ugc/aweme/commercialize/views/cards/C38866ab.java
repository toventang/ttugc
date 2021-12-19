package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35222b;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35229g;
import com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35187d;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37588c;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.C38027a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.experiment.C46870e;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab */
public final class C38866ab extends AbstractC18234b implements AbstractC38878ae {

    /* renamed from: c */
    public static final C38867a f91798c = new C38867a((byte) 0);

    /* renamed from: a */
    public int f91799a;

    /* renamed from: b */
    public AbstractC38878ae.AbstractC38879a f91800b;

    /* renamed from: d */
    private boolean f91801d;

    /* renamed from: e */
    private final AbstractC89244h f91802e;

    /* renamed from: j */
    private final AbstractC89244h f91803j;

    /* renamed from: k */
    private final AbstractC89244h f91804k;

    /* renamed from: l */
    private final AbstractC89244h f91805l;

    /* renamed from: m */
    private String f91806m;

    /* renamed from: n */
    private final C38027a f91807n;

    /* renamed from: o */
    private final C35187d f91808o;

    /* renamed from: p */
    private SparseArray f91809p;

    static {
        Covode.recordClassIndex(46453);
    }

    /* renamed from: g */
    private final CrossPlatformWebView m78890g() {
        return (CrossPlatformWebView) this.f91802e.getValue();
    }

    /* renamed from: h */
    private final View m78891h() {
        return (View) this.f91804k.getValue();
    }

    /* renamed from: i */
    private final ImageView m78892i() {
        return (ImageView) this.f91805l.getValue();
    }

    /* renamed from: a */
    public final CommonBizWebView mo67530a() {
        return (CommonBizWebView) this.f91803j.getValue();
    }

    /* renamed from: b */
    public final View mo67535b(int i) {
        if (this.f91809p == null) {
            this.f91809p = new SparseArray();
        }
        View view = (View) this.f91809p.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f91809p.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab$a */
    public static final class C38867a {
        static {
            Covode.recordClassIndex(46454);
        }

        private C38867a() {
        }

        public /* synthetic */ C38867a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C38866ab m78904a(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            C38866ab abVar = new C38866ab();
            abVar.setArguments(bundle);
            return abVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: b */
    public final AbstractC1204m mo67536b() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: c */
    public final Fragment mo67538c() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab$e */
    static final class C38871e extends AbstractC89220m implements AbstractC89171a<CommonBizWebView> {

        /* renamed from: a */
        final /* synthetic */ C38866ab f91813a;

        static {
            Covode.recordClassIndex(46458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38871e(C38866ab abVar) {
            super(0);
            this.f91813a = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CommonBizWebView invoke() {
            return this.f91813a.mo67535b(R.id.zv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab$f */
    static final class C38872f extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C38866ab f91814a;

        static {
            Covode.recordClassIndex(46459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38872f(C38866ab abVar) {
            super(0);
            this.f91814a = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f91814a.mo67535b(R.id.a6q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab$g */
    static final class C38873g extends AbstractC89220m implements AbstractC89171a<CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ C38866ab f91815a;

        static {
            Covode.recordClassIndex(46460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38873g(C38866ab abVar) {
            super(0);
            this.f91815a = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CrossPlatformWebView invoke() {
            return this.f91815a.mo67535b(R.id.fii);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab$h */
    static final class C38874h extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C38866ab f91816a;

        static {
            Covode.recordClassIndex(46461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38874h(C38866ab abVar) {
            super(0);
            this.f91816a = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f91816a.mo67535b(R.id.fij);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f91809p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: d */
    public final View mo67539d() {
        if (this.f91801d) {
            return mo67530a().getWebView();
        }
        return m78889a(m78890g());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: e */
    public final boolean mo67540e() {
        if (this.f91801d) {
            C35187d dVar = this.f91808o;
            if (!dVar.f83054a || dVar.f83055b) {
                return false;
            }
            return true;
        }
        C38027a aVar = this.f91807n;
        if (!aVar.f89860a || aVar.f89861b) {
            return false;
        }
        return true;
    }

    public C38866ab() {
        CommerceAdLandpageBulletConfig c = C37588c.m75847c();
        boolean z = false;
        if (c != null && c.getTotalEnable()) {
            z = c.getAdLandpageCardEnable();
        }
        this.f91801d = z;
        this.f91802e = C89250i.m154773a((AbstractC89171a) new C38873g(this));
        this.f91803j = C89250i.m154773a((AbstractC89171a) new C38871e(this));
        this.f91804k = C89250i.m154773a((AbstractC89171a) new C38874h(this));
        this.f91805l = C89250i.m154773a((AbstractC89171a) new C38872f(this));
        this.f91799a = 2131232514;
        this.f91806m = "";
        this.f91807n = new C38027a();
        this.f91808o = new C35187d();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab$d */
    public static final class C38870d implements AbstractC17046h.AbstractC17048b {

        /* renamed from: a */
        final /* synthetic */ C38866ab f91812a;

        static {
            Covode.recordClassIndex(46457);
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25851a(Uri uri) {
            C89219l.m154721d(uri, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25852a(Uri uri, Throwable th) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(th, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(qVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38870d(C38866ab abVar) {
            this.f91812a = abVar;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
            WebSettings settings;
            C89219l.m154721d(list, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            SSWebView webView = this.f91812a.mo67530a().getWebView();
            if (webView != null && (settings = webView.getSettings()) != null) {
                settings.setTextZoom(100);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: a */
    public final void mo67531a(int i) {
        if (i != 0) {
            this.f91799a = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab$b */
    static final class View$OnClickListenerC38868b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38866ab f91810a;

        static {
            Covode.recordClassIndex(46455);
        }

        View$OnClickListenerC38868b(C38866ab abVar) {
            this.f91810a = abVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC38878ae.AbstractC38879a aVar = this.f91810a.f91800b;
            if (aVar != null) {
                aVar.mo67553a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ab$c */
    static final class View$OnClickListenerC38869c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38866ab f91811a;

        static {
            Covode.recordClassIndex(46456);
        }

        View$OnClickListenerC38869c(C38866ab abVar) {
            this.f91811a = abVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC38878ae.AbstractC38879a aVar = this.f91811a.f91800b;
            if (aVar != null) {
                aVar.mo67554b();
            }
        }
    }

    /* renamed from: a */
    private static SingleWebView m78889a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a = ((AbstractC40746j) crossPlatformWebView.mo69911a(AbstractC40746j.class)).mo69969a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: b */
    public final void mo67537b(boolean z) {
        if (af_()) {
            if (this.f91801d) {
                mo67530a().setCanScrollVertically(z);
            } else {
                m78889a(m78890g()).setCanScrollVertically(z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: a */
    public final void mo67532a(AbstractC38878ae.AbstractC38879a aVar) {
        C89219l.m154721d(aVar, "");
        this.f91800b = aVar;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (!(arguments == null || (string = arguments.getString("url", str)) == null)) {
            Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = C89361p.m154910b((CharSequence) string).toString();
            if (obj != null) {
                str = obj;
            }
        }
        this.f91806m = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: a */
    public final void mo67533a(String str) {
        if (TextUtils.isEmpty(str) || str == null) {
            return;
        }
        if (this.f91801d) {
            SSWebView webView = mo67530a().getWebView();
            if (webView != null) {
                webView.loadUrl(str);
                return;
            }
            return;
        }
        m78889a(m78890g()).loadUrl(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae
    /* renamed from: a */
    public final void mo67534a(boolean z) {
        if (af_()) {
            if (z) {
                m78891h().setVisibility(8);
            } else {
                m78891h().setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC35125b bVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f91801d) {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                CommonBizWebView a = mo67530a();
                AbstractC16239d.AbstractC16241b a2 = C34963b.m71411a().mo61850a();
                C35187d dVar = this.f91808o;
                C89219l.m154716b(activity, "");
                a.mo62060a(a2, dVar, new BulletActivityWrapper(activity), this, "ad_commerce");
            }
            C35222b rootContainer = mo67530a().getRootContainer();
            if (!(rootContainer == null || (bVar = rootContainer.f83165z) == null)) {
                bVar.mo61980c();
            }
        } else {
            ActivityC0945e activity2 = getActivity();
            if (activity2 != null) {
                CommercializeWebViewHelper.m78329a(m78890g(), this.f91807n, this, activity2, getArguments());
            }
            m78889a(m78890g()).setEnableScrollControl(true);
            m78889a(m78890g()).setCanScrollVertically(false);
            WebSettings settings = m78889a(m78890g()).getSettings();
            C89219l.m154716b(settings, "");
            settings.setTextZoom(100);
            SingleWebChromeClient singleWebChromeClient = m78889a(m78890g()).getSingleWebChromeClient();
            if (singleWebChromeClient != null) {
                singleWebChromeClient.f95285c = false;
            }
        }
        m78891h().setOnClickListener(new View$OnClickListenerC38868b(this));
        m78892i().setImageResource(this.f91799a);
        int i = this.f91799a;
        if (i == 2131232518) {
            m78892i().setPadding(C34728n.m70946a(12.0d), C34728n.m70946a(4.0d), C34728n.m70946a(4.0d), C34728n.m70946a(7.0d));
        } else if (i == 2131232515) {
            ViewGroup.LayoutParams layoutParams = m78892i().getLayoutParams();
            layoutParams.width = C34728n.m70946a(28.0d);
            layoutParams.height = C34728n.m70946a(28.0d);
            m78892i().setLayoutParams(layoutParams);
            m78892i().setPadding(C34728n.m70946a(8.0d), C34728n.m70946a(10.0d), C34728n.m70946a(8.0d), C34728n.m70946a(6.0d));
        } else if (i == 2131232517) {
            Drawable drawable = getResources().getDrawable(i);
            int i2 = Build.VERSION.SDK_INT;
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            C89219l.m154716b(drawable, "");
            if (drawable != null && C80471gb.m139483a(getContext())) {
                m78892i().setImageDrawable(drawable);
            }
            ViewGroup.LayoutParams layoutParams2 = m78892i().getLayoutParams();
            int a3 = C34728n.m70946a(40.0d);
            layoutParams2.width = a3;
            layoutParams2.height = a3;
            m78892i().setPadding(0, 0, 0, 0);
        } else if (i == 2131232516) {
            ImageView i3 = m78892i();
            i3.getLayoutParams().width = C34728n.m70946a(36.0d);
            i3.getLayoutParams().height = C34728n.m70946a(36.0d);
            int a4 = C34728n.m70946a(12.0d);
            i3.setPadding(a4, a4, a4, a4);
        }
        m78892i().setOnClickListener(new View$OnClickListenerC38869c(this));
        C80595j.m139739a(m78892i());
        if (this.f91801d) {
            mo67530a().setVisibility(0);
            m78890g().setVisibility(8);
            mo67530a().mo26838a(C35301c.m72248a(this.f91806m, C89070n.m154516a("ad_commerce"), getArguments(), new C35229g(C17867d.m33078a())), getArguments(), new C38870d(this));
            mo67530a().setEnableScrollControl(true);
            mo67530a().setCanScrollVertically(false);
            return;
        }
        CrossPlatformWebView.m82144a(m78890g(), this.f91806m, false, null, 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        if (!C46870e.f109214b || this.f91801d) {
            return C1764a.m5927a(layoutInflater, R.layout.a0j, viewGroup, false);
        }
        return ((X2CBaseInflate) C58221f.m105149b(X2CAdWebPage.class)).mo67522a(getContext(), R.layout.a0j);
    }
}
