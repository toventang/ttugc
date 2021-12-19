package com.bytedance.android.livesdk.browser;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2932i;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdk.lynx.AbstractC9341b;
import com.bytedance.android.livesdk.lynx.AbstractC9353d;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.b */
public final class C6943b implements AbstractC2932i {

    /* renamed from: b */
    String f17358b;

    /* renamed from: c */
    String f17359c;

    /* renamed from: d */
    public String f17360d = "h5";

    /* renamed from: e */
    AbstractC9341b f17361e;

    /* renamed from: f */
    AbstractC6956d.C6962f f17362f;

    /* renamed from: g */
    public boolean f17363g;

    /* renamed from: h */
    public AbstractC2932i.AbstractC2935c f17364h;

    /* renamed from: i */
    private Context f17365i;

    /* renamed from: j */
    private ViewGroup f17366j;

    /* renamed from: com.bytedance.android.livesdk.browser.b$f */
    public final /* synthetic */ class View$OnClickListenerC6949f implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f17372a;

        static {
            Covode.recordClassIndex(7688);
        }

        public View$OnClickListenerC6949f(AbstractC89172b bVar) {
            this.f17372a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            C89219l.m154716b(this.f17372a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(7682);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$a */
    public static final class C6944a implements AbstractC9353d {

        /* renamed from: a */
        final /* synthetic */ C6943b f17367a;

        static {
            Covode.recordClassIndex(7683);
        }

        @Override // com.bytedance.android.livesdk.lynx.AbstractC9353d
        /* renamed from: a */
        public final void mo13229a() {
            AbstractC2932i.AbstractC2935c cVar = this.f17367a.f17364h;
            if (cVar != null) {
                cVar.mo7660a();
            }
            AbstractC2932i.AbstractC2935c cVar2 = this.f17367a.f17364h;
            if (cVar2 != null) {
                cVar2.mo7663c(this.f17367a.f17360d);
            }
            this.f17367a.f17360d = "h5";
            this.f17367a.mo13228b();
            C6943b bVar = this.f17367a;
            String str = bVar.f17359c;
            if (str != null) {
                ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13251a(bVar.f17362f, str);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6944a(C6943b bVar) {
            this.f17367a = bVar;
        }

        @Override // com.bytedance.android.livesdk.lynx.AbstractC9353d
        /* renamed from: a */
        public final void mo13230a(View view) {
            C89219l.m154721d(view, "");
            AbstractC2932i.AbstractC2935c cVar = this.f17367a.f17364h;
            if (cVar != null) {
                cVar.mo7662b(this.f17367a.f17360d);
            }
        }
    }

    public C6943b() {
        boolean z;
        AbstractC2953a a = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a, "");
        if (!((IHostContext) a).isLocalTest() || !EnableLynxDebugBadgeSetting.INSTANCE.getValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f17363g = z;
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2932i
    /* renamed from: a */
    public final void mo7669a() {
        if (C89219l.m154714a((Object) "lynx", (Object) this.f17360d)) {
            AbstractC9341b bVar = this.f17361e;
            if (bVar != null) {
                bVar.mo16223c();
                return;
            }
            return;
        }
        ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13250a(this.f17362f);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$e */
    static final class RunnableC6948e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6943b f17371a;

        static {
            Covode.recordClassIndex(7687);
        }

        RunnableC6948e(C6943b bVar) {
            this.f17371a = bVar;
        }

        public final void run() {
            C6943b bVar = this.f17371a;
            if (C89219l.m154714a((Object) "lynx", (Object) bVar.f17360d) && bVar.f17361e != null) {
                AbstractC2932i.AbstractC2935c cVar = bVar.f17364h;
                if (cVar != null) {
                    cVar.mo7661a(bVar.f17360d);
                }
                AbstractC9341b bVar2 = bVar.f17361e;
                if (bVar2 != null) {
                    String str = bVar.f17358b;
                    if (str == null) {
                        str = "";
                    }
                    bVar2.mo16221a(str);
                }
            } else if (bVar.f17362f != null) {
                AbstractC2932i.AbstractC2935c cVar2 = bVar.f17364h;
                if (cVar2 != null) {
                    cVar2.mo7661a(bVar.f17360d);
                }
                ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13251a(bVar.f17362f, bVar.f17358b);
            }
        }
    }

    /* renamed from: b */
    public final void mo13228b() {
        WebView webView;
        MethodCollector.m26663i(7988);
        if (this.f17362f == null) {
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f17365i;
            if (context == null) {
                C89219l.m154710a("mContext");
            }
            ActivityC0945e a = C11279p.m20001a(context);
            if (a == null) {
                C89219l.m154715b();
            }
            this.f17362f = webViewManager.mo13247a(a, new C6946c(this));
        }
        AbstractC6956d.C6962f fVar = this.f17362f;
        if (fVar == null || (webView = fVar.f17423a) == null) {
            MethodCollector.m26664o(7988);
            return;
        }
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webView.setBackgroundColor(0);
        ViewGroup viewGroup = this.f17366j;
        if (viewGroup == null) {
            C89219l.m154710a("mRootContainer");
        }
        viewGroup.removeAllViews();
        ViewGroup viewGroup2 = this.f17366j;
        if (viewGroup2 == null) {
            C89219l.m154710a("mRootContainer");
        }
        viewGroup2.addView(webView, 0);
        if (this.f17363g) {
            ViewGroup viewGroup3 = this.f17366j;
            if (viewGroup3 == null) {
                C89219l.m154710a("mRootContainer");
            }
            m14824a(viewGroup3, C6947d.f17370a);
        }
        MethodCollector.m26664o(7988);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$b */
    static final class C6945b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C6945b f17368a = new C6945b();

        static {
            Covode.recordClassIndex(7684);
        }

        C6945b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$c */
    public static final class C6946c implements AbstractC6956d.AbstractC6961e {

        /* renamed from: a */
        final /* synthetic */ C6943b f17369a;

        static {
            Covode.recordClassIndex(7685);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6946c(C6943b bVar) {
            this.f17369a = bVar;
        }

        @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d.AbstractC6961e
        /* renamed from: a */
        public final void mo13231a(WebView webView, String str) {
            C89219l.m154721d(webView, "");
            C89219l.m154721d(str, "");
            C3854a.m9453a(4, "HybridContainer", "onPageFinished");
            AbstractC2932i.AbstractC2935c cVar = this.f17369a.f17364h;
            if (cVar != null) {
                cVar.mo7662b(this.f17369a.f17360d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.b$d */
    public static final class C6947d extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C6947d f17370a = new C6947d();

        static {
            Covode.recordClassIndex(7686);
        }

        C6947d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            return C89391z.f203057a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.livesdk.browser.b$f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14824a(android.view.ViewGroup r5, p4600h.p4611f.p4612a.AbstractC89172b<? super android.view.View, p4600h.C89391z> r6) {
        /*
            r4 = this;
            r3 = 8132(0x1fc4, float:1.1395E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            com.bytedance.android.live.design.widget.LiveTextView r2 = new com.bytedance.android.live.design.widget.LiveTextView
            android.content.Context r1 = r4.f17365i
            if (r1 != 0) goto L_0x0010
            java.lang.String r0 = "mContext"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0010:
            r2.<init>(r1)
            java.lang.String r0 = r4.f17360d
            r2.setText(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r2.setTextSize(r0)
            java.lang.String r0 = "#FFFFFF"
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r0)
            java.lang.String r0 = "#88008800"
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setBackgroundColor(r0)
            if (r6 == 0) goto L_0x0037
            com.bytedance.android.livesdk.browser.b$f r0 = new com.bytedance.android.livesdk.browser.b$f
            r0.<init>(r6)
            r6 = r0
        L_0x0037:
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r2.setOnClickListener(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r1.<init>(r0, r0)
            r0 = 8388661(0x800035, float:1.1755018E-38)
            r1.gravity = r0
            r5.addView(r2, r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.C6943b.m14824a(android.view.ViewGroup, h.f.a.b):void");
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2932i
    /* renamed from: a */
    public final void mo7671a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (C89219l.m154714a((Object) "lynx", (Object) this.f17360d)) {
            AbstractC9341b bVar = this.f17361e;
            if (bVar != null) {
                bVar.mo13267a(str, jSONObject);
                return;
            }
            return;
        }
        AbstractC6956d.C6962f fVar = this.f17362f;
        if (fVar != null) {
            fVar.mo13267a(str, jSONObject);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002f  */
    @Override // com.bytedance.android.live.p176b.AbstractC2932i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7670a(java.lang.String r13, java.lang.String r14, java.lang.String r15, android.view.ViewGroup r16, com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c r17) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.C6943b.mo7670a(java.lang.String, java.lang.String, java.lang.String, android.view.ViewGroup, com.bytedance.android.live.b.i$c):void");
    }
}
