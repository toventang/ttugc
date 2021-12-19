package com.bytedance.android.livesdk.container.p513j;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.p176b.AbstractC2932i;
import com.bytedance.android.livesdk.container.AbstractC8220c;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.p505c.AbstractC8221a;
import com.bytedance.android.livesdk.container.p505c.C8223b;
import com.bytedance.android.livesdk.container.p505c.C8232c;
import com.bytedance.android.livesdk.container.p507d.EnumC8236a;
import com.bytedance.android.livesdk.container.p511h.AbstractC8249a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.j.b */
public final class C8270b extends FrameLayout implements AbstractC8220c, AbstractC8249a {

    /* renamed from: a */
    public AbstractC8221a f20510a;

    /* renamed from: b */
    private HybridConfig f20511b;

    /* renamed from: c */
    private String f20512c;

    /* renamed from: d */
    private LiveLoadingView f20513d;

    /* renamed from: e */
    private AbstractC2932i.AbstractC2935c f20514e;

    /* renamed from: com.bytedance.android.livesdk.container.j.b$b */
    public final /* synthetic */ class View$OnClickListenerC8272b implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f20516a;

        static {
            Covode.recordClassIndex(9107);
        }

        public View$OnClickListenerC8272b(AbstractC89172b bVar) {
            this.f20516a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            C89219l.m154716b(this.f20516a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(9105);
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8220c
    public final FrameLayout getFrameLayout() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8220c
    /* renamed from: c */
    public final void mo14482c() {
        AbstractC8221a aVar = this.f20510a;
        if (aVar == null) {
            C89219l.m154710a("component");
        }
        aVar.mo14495e();
    }

    public final AbstractC8221a getComponent() {
        AbstractC8221a aVar = this.f20510a;
        if (aVar == null) {
            C89219l.m154710a("component");
        }
        return aVar;
    }

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: d */
    public final void mo14598d() {
        AbstractC2932i.AbstractC2935c cVar = this.f20514e;
        if (cVar != null) {
            HybridConfig hybridConfig = this.f20511b;
            if (hybridConfig == null) {
                C89219l.m154710a("config");
            }
            cVar.mo7662b(hybridConfig.getEngineType().getType());
        }
        LiveLoadingView liveLoadingView = this.f20513d;
        if (liveLoadingView == null) {
            C89219l.m154710a("loadingView");
        }
        liveLoadingView.setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8220c
    /* renamed from: a */
    public final void mo14480a() {
        AbstractC8221a cVar;
        Context context = getContext();
        C89219l.m154716b(context, "");
        setBackgroundColor(context.getResources().getColor(R.color.l));
        LiveLoadingView liveLoadingView = new LiveLoadingView(getContext());
        liveLoadingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context2 = liveLoadingView.getContext();
        C89219l.m154716b(context2, "");
        liveLoadingView.setBackgroundColor(context2.getResources().getColor(R.color.l));
        liveLoadingView.setVisibility(0);
        this.f20513d = liveLoadingView;
        HybridConfig hybridConfig = this.f20511b;
        if (hybridConfig == null) {
            C89219l.m154710a("config");
        }
        if (hybridConfig.getEngineType() == EnumC8236a.LYNX) {
            ActivityC0945e a = C11279p.m20001a(getContext());
            if (a == null) {
                C89219l.m154715b();
            }
            HybridConfig hybridConfig2 = this.f20511b;
            if (hybridConfig2 == null) {
                C89219l.m154710a("config");
            }
            String str = this.f20512c;
            if (str == null) {
                C89219l.m154710a("containerId");
            }
            cVar = new C8223b(a, hybridConfig2, str, this);
        } else {
            ActivityC0945e a2 = C11279p.m20001a(getContext());
            if (a2 == null) {
                C89219l.m154715b();
            }
            HybridConfig hybridConfig3 = this.f20511b;
            if (hybridConfig3 == null) {
                C89219l.m154710a("config");
            }
            String str2 = this.f20512c;
            if (str2 == null) {
                C89219l.m154710a("containerId");
            }
            cVar = new C8232c(a2, hybridConfig3, str2, this);
        }
        this.f20510a = cVar;
        cVar.mo14487a();
    }

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: e */
    public final void mo14599e() {
        AbstractC2932i.AbstractC2935c cVar = this.f20514e;
        if (cVar != null) {
            HybridConfig hybridConfig = this.f20511b;
            if (hybridConfig == null) {
                C89219l.m154710a("config");
            }
            cVar.mo7663c(hybridConfig.getEngineType().getType());
        }
        LiveLoadingView liveLoadingView = this.f20513d;
        if (liveLoadingView == null) {
            C89219l.m154710a("loadingView");
        }
        liveLoadingView.setVisibility(8);
        HybridConfig hybridConfig2 = this.f20511b;
        if (hybridConfig2 == null) {
            C89219l.m154710a("config");
        }
        if (hybridConfig2.getEngineType() == EnumC8236a.LYNX) {
            HybridConfig hybridConfig3 = this.f20511b;
            if (hybridConfig3 == null) {
                C89219l.m154710a("config");
            }
            if (hybridConfig3.getFallbackUrl().length() > 0) {
                HybridConfig hybridConfig4 = this.f20511b;
                if (hybridConfig4 == null) {
                    C89219l.m154710a("config");
                }
                hybridConfig4.setEngineType(EnumC8236a.WEB_VIEW);
                AbstractC8221a aVar = this.f20510a;
                if (aVar == null) {
                    C89219l.m154710a("component");
                }
                View f = aVar.mo14496f();
                if (f != null) {
                    removeView(f);
                }
                AbstractC8221a aVar2 = this.f20510a;
                if (aVar2 == null) {
                    C89219l.m154710a("component");
                }
                aVar2.mo14495e();
                ActivityC0945e a = C11279p.m20001a(getContext());
                if (a == null) {
                    C89219l.m154715b();
                }
                HybridConfig hybridConfig5 = this.f20511b;
                if (hybridConfig5 == null) {
                    C89219l.m154710a("config");
                }
                String str = this.f20512c;
                if (str == null) {
                    C89219l.m154710a("containerId");
                }
                C8232c cVar2 = new C8232c(a, hybridConfig5, str, this);
                this.f20510a = cVar2;
                cVar2.mo14487a();
                WebView webView = cVar2.f20443f;
                if (webView != null) {
                    addView(webView, 0);
                    HybridConfig hybridConfig6 = this.f20511b;
                    if (hybridConfig6 == null) {
                        C89219l.m154710a("config");
                    }
                    cVar2.mo14490a(hybridConfig6.getFallbackUrl());
                }
                AbstractC2932i.AbstractC2935c cVar3 = this.f20514e;
                if (cVar3 != null) {
                    cVar3.mo7660a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.bytedance.android.livesdk.container.j.b, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.bytedance.android.livesdk.container.j.b$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.android.livesdk.container.AbstractC8220c
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14481b() {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.container.p513j.C8270b.mo14481b():void");
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.b$a */
    static final class C8271a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C8271a f20515a = new C8271a();

        static {
            Covode.recordClassIndex(9106);
        }

        C8271a() {
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

    public final void setComponent(AbstractC8221a aVar) {
        C89219l.m154721d(aVar, "");
        this.f20510a = aVar;
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8220c
    public final void setConfig(HybridConfig hybridConfig) {
        C89219l.m154721d(hybridConfig, "");
        this.f20511b = hybridConfig;
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8220c
    public final void setContainerId(String str) {
        C89219l.m154721d(str, "");
        this.f20512c = str;
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8220c
    public final void setHybridLoadListener(AbstractC2932i.AbstractC2935c cVar) {
        C89219l.m154721d(cVar, "");
        this.f20514e = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8270b(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8862);
        MethodCollector.m26664o(8862);
    }

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: a */
    public final void mo14597a(String str) {
        AbstractC2932i.AbstractC2935c cVar = this.f20514e;
        if (cVar != null) {
            HybridConfig hybridConfig = this.f20511b;
            if (hybridConfig == null) {
                C89219l.m154710a("config");
            }
            cVar.mo7661a(hybridConfig.getEngineType().getType());
        }
    }
}
