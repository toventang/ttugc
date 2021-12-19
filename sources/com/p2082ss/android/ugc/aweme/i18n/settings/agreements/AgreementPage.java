package com.p2082ss.android.ugc.aweme.i18n.settings.agreements;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.web.C81549j;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage */
public final class AgreementPage extends AbstractC68195a implements View.OnClickListener {

    /* renamed from: j */
    public static final C53513a f122860j = new C53513a((byte) 0);

    /* renamed from: e */
    public WebView f122861e;

    /* renamed from: f */
    public TextView f122862f;

    /* renamed from: g */
    public TextView f122863g;

    /* renamed from: h */
    public View f122864h;

    /* renamed from: i */
    public View f122865i;

    /* renamed from: k */
    private SparseArray f122866k;

    static {
        Covode.recordClassIndex(63086);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f122866k == null) {
            this.f122866k = new SparseArray();
        }
        View view = (View) this.f122866k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f122866k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f122866k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ax3;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage$a */
    public static final class C53513a {
        static {
            Covode.recordClassIndex(63087);
        }

        private C53513a() {
        }

        public /* synthetic */ C53513a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WebView webView = this.f122861e;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.f122861e;
        if (webView != null) {
            webView.onResume();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage$b */
    public static final class C53514b extends C81549j {

        /* renamed from: a */
        final /* synthetic */ AgreementPage f122867a;

        static {
            Covode.recordClassIndex(63088);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53514b(AgreementPage agreementPage) {
            this.f122867a = agreementPage;
        }

        public final void onPageFinished(WebView webView, String str) {
            C89219l.m154721d(webView, "");
            C89219l.m154721d(str, "");
            super.onPageFinished(webView, str);
            View view = this.f122867a.f122864h;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            C89219l.m154721d(webView, "");
            C89219l.m154721d(str, "");
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            String scheme = parse.getScheme();
            if (scheme != null) {
                Locale locale = Locale.getDefault();
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
                str2 = scheme.toLowerCase(locale);
                C89219l.m154716b(str2, "");
            } else {
                str2 = null;
            }
            if (!C89219l.m154714a((Object) "market", (Object) str2)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            Context context = webView.getContext();
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return true;
        }
    }

    /* renamed from: a */
    private static Bundle m98730a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        mo108725h();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
