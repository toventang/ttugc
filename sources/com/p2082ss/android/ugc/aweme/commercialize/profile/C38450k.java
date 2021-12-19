package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.k */
public final class C38450k extends RecyclerView.AbstractC1350a<C38451a> {

    /* renamed from: a */
    public CommonBizWebView f90822a;

    /* renamed from: b */
    public String f90823b = null;

    /* renamed from: c */
    private final Activity f90824c;

    /* renamed from: d */
    private AbstractC40691e f90825d;

    /* renamed from: e */
    private final Fragment f90826e;

    /* renamed from: f */
    private boolean f90827f = false;

    /* renamed from: g */
    private AbstractC17045g f90828g;

    static {
        Covode.recordClassIndex(45958);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return 1;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C38451a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m77887a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.k$b */
    public static final class C38452b implements AbstractC40691e {
        static {
            Covode.recordClassIndex(45960);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65791a(WebView webView, int i, String str, String str2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo61846a(WebView webView, String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: b */
        public final boolean mo65796b(WebView webView, String str) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: c */
        public final void mo65797c(WebView webView, String str) {
        }

        C38452b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.k$a */
    public static final class C38451a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(45959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38451a(CommonBizWebView commonBizWebView) {
            super(commonBizWebView);
            C89219l.m154721d(commonBizWebView, "");
        }
    }

    public C38450k(Fragment fragment, AbstractC17045g gVar) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(gVar, "");
        this.f90826e = fragment;
        this.f90828g = gVar;
        ActivityC0945e activity = fragment.getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        this.f90824c = activity;
        this.f90825d = new C38452b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C38451a aVar, int i) {
        C38451a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        Objects.requireNonNull(aVar2.itemView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView");
        int f = (((C34723i.m70933f(this.f90824c) - C34723i.m70927b()) - ((int) this.f90824c.getResources().getDimension(R.dimen.a0s))) + 0) - C34728n.m70946a(40.0d);
        if (this.f90827f) {
            f -= (int) this.f90824c.getResources().getDimension(R.dimen.n5);
        }
        View view = aVar2.itemView;
        C89219l.m154716b(view, "");
        ((CommonBizWebView) view).setLayoutParams(new ViewGroup.LayoutParams(C34723i.m70928b(this.f90824c), f));
        String str = this.f90823b;
        if (str != null) {
            ((BulletContainerView) aVar2.itemView).mo26839a(BulletService.m71938f().mo61849a(this.f90824c), 1, 0, C34728n.m70946a(80.0d), 0, 0);
            CommonBizWebView.m72053a((CommonBizWebView) aVar2.itemView, C35301c.m72246a(str));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m77887a(C38450k kVar, ViewGroup viewGroup, int i) {
        Bundle bundle;
        boolean a;
        MethodCollector.m26663i(9188);
        String str = "";
        C89219l.m154721d(viewGroup, str);
        CommonBizWebView commonBizWebView = new CommonBizWebView(kVar.f90824c, (AttributeSet) null, 6);
        commonBizWebView.mo25820a(C34963b.m71411a().mo61850a());
        commonBizWebView.setActivityWrapper(kVar.f90828g);
        commonBizWebView.setIsAutoReleasableWhenDetached(false);
        kVar.f90822a = commonBizWebView;
        Fragment fragment = kVar.f90826e;
        if (fragment instanceof C38453l) {
            bundle = ((C38453l) fragment).mo67015a();
        } else {
            bundle = new Bundle();
        }
        String str2 = kVar.f90823b;
        if (str2 != null) {
            str = str2;
        }
        bundle.putString("url", str);
        CommercializeWebViewHelper.m78329a(new CrossPlatformWebView(kVar.f90824c, (AttributeSet) null, 6), kVar.f90825d, kVar.f90826e, kVar.f90824c, bundle);
        CommonBizWebView commonBizWebView2 = kVar.f90822a;
        if (commonBizWebView2 == null) {
            C89219l.m154715b();
        }
        C38451a aVar = new C38451a(commonBizWebView2);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(9188);
        return aVar;
    }
}
