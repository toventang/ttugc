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
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.j */
public final class C38447j extends RecyclerView.AbstractC1350a<C38448a> {

    /* renamed from: a */
    public CrossPlatformWebView f90815a;

    /* renamed from: b */
    String f90816b = null;

    /* renamed from: c */
    private final Activity f90817c;

    /* renamed from: d */
    private AbstractC40691e f90818d;

    /* renamed from: e */
    private final Fragment f90819e;

    /* renamed from: f */
    private boolean f90820f;

    /* renamed from: g */
    private final boolean f90821g;

    static {
        Covode.recordClassIndex(45955);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return 1;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C38448a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m77878a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.j$b */
    public static final class C38449b implements AbstractC40691e {
        static {
            Covode.recordClassIndex(45957);
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

        C38449b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.j$a */
    public static final class C38448a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(45956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38448a(CrossPlatformWebView crossPlatformWebView) {
            super(crossPlatformWebView);
            C89219l.m154721d(crossPlatformWebView, "");
        }
    }

    public C38447j(Fragment fragment, boolean z) {
        C89219l.m154721d(fragment, "");
        this.f90819e = fragment;
        this.f90820f = z;
        this.f90821g = true;
        ActivityC0945e activity = fragment.getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        this.f90817c = activity;
        this.f90818d = new C38449b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C38448a aVar, int i) {
        C38448a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        Objects.requireNonNull(aVar2.itemView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
        int f = (((C34723i.m70933f(this.f90817c) - C34723i.m70927b()) - ((int) this.f90817c.getResources().getDimension(R.dimen.a0s))) + 0) - C34728n.m70946a(40.0d);
        if (this.f90820f) {
            f -= (int) this.f90817c.getResources().getDimension(R.dimen.n5);
        }
        View view = aVar2.itemView;
        C89219l.m154716b(view, "");
        ((CrossPlatformWebView) view).setLayoutParams(new ViewGroup.LayoutParams(C34723i.m70928b(this.f90817c), f));
        String str = this.f90816b;
        if (str != null) {
            ((CrossPlatformWebView) aVar2.itemView).mo69912a(1, C34728n.m70946a(80.0d));
            ((CrossPlatformWebView) aVar2.itemView).mo69920a(str, this.f90821g, true);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m77878a(C38447j jVar, ViewGroup viewGroup, int i) {
        Bundle bundle;
        boolean a;
        MethodCollector.m26663i(9031);
        String str = "";
        C89219l.m154721d(viewGroup, str);
        jVar.f90815a = new CrossPlatformWebView(jVar.f90817c, (AttributeSet) null, 6);
        Fragment fragment = jVar.f90819e;
        if (fragment instanceof C38453l) {
            bundle = ((C38453l) fragment).mo67015a();
        } else {
            bundle = new Bundle();
        }
        String str2 = jVar.f90816b;
        if (str2 != null) {
            str = str2;
        }
        bundle.putString("url", str);
        CrossPlatformWebView crossPlatformWebView = jVar.f90815a;
        if (crossPlatformWebView == null) {
            C89219l.m154715b();
        }
        CommercializeWebViewHelper.m78329a(crossPlatformWebView, jVar.f90818d, jVar.f90819e, jVar.f90817c, bundle);
        CrossPlatformWebView crossPlatformWebView2 = jVar.f90815a;
        if (crossPlatformWebView2 == null) {
            C89219l.m154715b();
        }
        C38448a aVar = new C38448a(crossPlatformWebView2);
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
        MethodCollector.m26664o(9031);
        return aVar;
    }
}
