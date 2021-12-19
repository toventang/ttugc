package com.bytedance.android.livesdk.container.p513j;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7124bg;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7127bh;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7140bn;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7144bo;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7150br;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7186n;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t;
import com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7057g;
import com.bytedance.android.livesdk.browser.p468i.C7030b;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.p505c.AbstractC8221a;
import com.bytedance.android.livesdk.container.p505c.C8223b;
import com.bytedance.android.livesdk.container.p505c.C8232c;
import com.bytedance.android.livesdk.container.p507d.EnumC8236a;
import com.bytedance.android.livesdk.container.p510g.AbstractC8248b;
import com.bytedance.android.livesdk.container.p511h.AbstractC8249a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.C18368x;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.j.a */
public final class C8258a extends C10935a implements C7124bg.AbstractC7125a, AbstractC8248b, AbstractC8249a {

    /* renamed from: f */
    public static final C8259a f20490f = new C8259a((byte) 0);

    /* renamed from: a */
    public AbstractC8221a f20491a;

    /* renamed from: b */
    public LiveLoadingView f20492b;

    /* renamed from: c */
    public AbstractC8249a f20493c;

    /* renamed from: d */
    public String f20494d = "";

    /* renamed from: e */
    public List<AbstractC7044a> f20495e = new ArrayList();

    /* renamed from: g */
    private final AbstractC89244h f20496g = C11831d.m20835a(new C8260b(this));

    /* renamed from: h */
    private FrameLayout f20497h;

    /* renamed from: i */
    private C7030b f20498i;

    /* renamed from: j */
    private HashMap f20499j;

    /* renamed from: com.bytedance.android.livesdk.container.j.a$k */
    public final /* synthetic */ class View$OnClickListenerC8269k implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f20509a;

        static {
            Covode.recordClassIndex(9104);
        }

        public View$OnClickListenerC8269k(AbstractC89172b bVar) {
            this.f20509a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            C89219l.m154716b(this.f20509a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(9093);
    }

    /* renamed from: a */
    private final HybridConfig m16404a() {
        return (HybridConfig) this.f20496g.getValue();
    }

    @Override // com.bytedance.android.livesdk.container.p510g.AbstractC8248b
    /* renamed from: a */
    public final boolean mo14596a(KeyEvent keyEvent) {
        C89219l.m154721d(keyEvent, "");
        return false;
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$a */
    public static final class C8259a {
        static {
            Covode.recordClassIndex(9094);
        }

        private C8259a() {
        }

        public /* synthetic */ C8259a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C8258a m16412a(HybridConfig hybridConfig) {
            C89219l.m154721d(hybridConfig, "");
            C8258a aVar = new C8258a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("argument_key_config", hybridConfig);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7124bg.AbstractC7125a
    /* renamed from: c */
    public final C7030b mo13299c() {
        return this.f20498i;
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$c */
    static final class C8261c implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C8258a f20501a;

        static {
            Covode.recordClassIndex(9096);
        }

        C8261c(C8258a aVar) {
            this.f20501a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            return new C7127bh(this.f20501a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$d */
    static final class C8262d implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C8258a f20502a;

        static {
            Covode.recordClassIndex(9097);
        }

        C8262d(C8258a aVar) {
            this.f20502a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            return new C7124bg(this.f20502a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$e */
    static final class C8263e implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C8258a f20503a;

        static {
            Covode.recordClassIndex(9098);
        }

        C8263e(C8258a aVar) {
            this.f20503a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            return new C7127bh(this.f20503a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$f */
    static final class C8264f implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C8258a f20504a;

        static {
            Covode.recordClassIndex(9099);
        }

        C8264f(C8258a aVar) {
            this.f20504a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            C7140bn bnVar = new C7140bn(this.f20504a);
            this.f20504a.f20495e.add(bnVar);
            return bnVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$g */
    static final class C8265g implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C8258a f20505a;

        static {
            Covode.recordClassIndex(9100);
        }

        C8265g(C8258a aVar) {
            this.f20505a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            C7144bo boVar = new C7144bo(this.f20505a);
            this.f20505a.f20495e.add(boVar);
            return boVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$h */
    static final class C8266h implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C8258a f20506a;

        static {
            Covode.recordClassIndex(9101);
        }

        C8266h(C8258a aVar) {
            this.f20506a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            C7150br brVar = new C7150br(this.f20506a);
            this.f20506a.f20495e.add(brVar);
            return brVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$i */
    static final class C8267i implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ C8258a f20507a;

        static {
            Covode.recordClassIndex(9102);
        }

        C8267i(C8258a aVar) {
            this.f20507a = aVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            C7206t tVar = new C7206t(this.f20507a);
            this.f20507a.f20495e.add(tVar);
            return tVar;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC8221a aVar = this.f20491a;
        if (aVar != null) {
            aVar.mo14495e();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f20499j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$b */
    static final class C8260b extends AbstractC89220m implements AbstractC89171a<HybridConfig> {

        /* renamed from: a */
        final /* synthetic */ C8258a f20500a;

        static {
            Covode.recordClassIndex(9095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8260b(C8258a aVar) {
            super(0);
            this.f20500a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HybridConfig invoke() {
            Bundle arguments = this.f20500a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("argument_key_config");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.bytedance.android.livesdk.container.config.base.HybridConfig");
            return serializable;
        }
    }

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: d */
    public final void mo14598d() {
        LiveLoadingView liveLoadingView = this.f20492b;
        if (liveLoadingView != null) {
            liveLoadingView.setVisibility(8);
        }
        AbstractC8249a aVar = this.f20493c;
        if (aVar != null) {
            aVar.mo14598d();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            AbstractC8221a aVar = this.f20491a;
            if (aVar != null) {
                aVar.mo14491a("container_disappear", new JSONObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            AbstractC8221a aVar = this.f20491a;
            if (aVar != null) {
                aVar.mo14491a("container_appear", new JSONObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: e */
    public final void mo14599e() {
        View f;
        FrameLayout frameLayout;
        MethodCollector.m26663i(6163);
        LiveLoadingView liveLoadingView = this.f20492b;
        if (liveLoadingView != null) {
            liveLoadingView.setVisibility(8);
        }
        AbstractC8249a aVar = this.f20493c;
        if (aVar != null) {
            aVar.mo14599e();
        }
        if (m16404a().getEngineType() == EnumC8236a.LYNX && m16404a().getFallbackUrl().length() > 0) {
            m16404a().setEngineType(EnumC8236a.WEB_VIEW);
            AbstractC8221a aVar2 = this.f20491a;
            if (!(aVar2 == null || (f = aVar2.mo14496f()) == null || (frameLayout = this.f20497h) == null)) {
                frameLayout.removeView(f);
            }
            AbstractC8221a aVar3 = this.f20491a;
            if (aVar3 != null) {
                aVar3.mo14495e();
            }
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            C8232c cVar = new C8232c(activity, m16404a(), this.f20494d, this);
            this.f20491a = cVar;
            cVar.mo14487a();
            WebView webView = cVar.f20443f;
            if (webView != null) {
                FrameLayout frameLayout2 = this.f20497h;
                if (frameLayout2 != null) {
                    frameLayout2.addView(webView, 0);
                }
                cVar.mo14490a(m16404a().getFallbackUrl());
            }
        }
        MethodCollector.m26664o(6163);
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7124bg.AbstractC7125a
    /* renamed from: a */
    public final void mo13293a(C7030b bVar) {
        this.f20498i = bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.a$j */
    static final class C8268j extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C8268j f20508a = new C8268j();

        static {
            Covode.recordClassIndex(9103);
        }

        C8268j() {
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

    @Override // com.bytedance.android.livesdk.container.p511h.AbstractC8249a
    /* renamed from: a */
    public final void mo14597a(String str) {
        AbstractC8249a aVar = this.f20493c;
        if (aVar != null) {
            aVar.mo14597a(str);
        }
    }

    /* renamed from: b */
    public final void mo14601b(String str) {
        C89219l.m154721d(str, "");
        this.f20494d = str;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC8221a cVar;
        C7038b bVar;
        C18364w wVar;
        C7038b bVar2;
        C18368x xVar;
        super.onCreate(bundle);
        if (m16404a().getEngineType() == EnumC8236a.LYNX) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            cVar = new C8223b(activity, m16404a(), this.f20494d, this);
        } else {
            ActivityC0945e activity2 = getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            cVar = new C8232c(activity2, m16404a(), this.f20494d, this);
        }
        this.f20491a = cVar;
        cVar.mo14487a();
        AbstractC8221a aVar = this.f20491a;
        if (aVar != null && (bVar = aVar.f20419a) != null && (wVar = bVar.f17644b) != null) {
            Fragment parentFragment = getParentFragment();
            if (!(parentFragment instanceof DialogInterface$OnCancelListenerC0944d)) {
                parentFragment = null;
            }
            DialogInterface$OnCancelListenerC0944d dVar = (DialogInterface$OnCancelListenerC0944d) parentFragment;
            if (dVar != null) {
                wVar.mo29405b("close", new C7186n(dVar));
                wVar.mo29400a("sharePanel", (AbstractC18334e.AbstractC18336b) new C8261c(this));
                wVar.mo29400a("shareInfo", (AbstractC18334e.AbstractC18336b) new C8262d(this));
                wVar.mo29400a("sharePanel", (AbstractC18334e.AbstractC18336b) new C8263e(this));
                wVar.mo29400a("uploadPhoto", (AbstractC18334e.AbstractC18336b) new C8264f(this));
                wVar.mo29400a("uploadPicture", (AbstractC18334e.AbstractC18336b) new C8265g(this));
                wVar.mo29400a("uploadVideo", (AbstractC18334e.AbstractC18336b) new C8266h(this));
                wVar.mo29400a("upload", (AbstractC18334e.AbstractC18336b) new C8267i(this));
                AbstractC8221a aVar2 = this.f20491a;
                if (aVar2 != null && (bVar2 = aVar2.f20419a) != null && (xVar = bVar2.f17645c) != null) {
                    xVar.mo29410a("share", new C7057g(new WeakReference(getContext()), this));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.bytedance.android.livesdk.container.j.a$k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.container.p513j.C8258a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(getLayoutInflater(), R.layout.b9a, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C89219l.m154721d(intent, "");
        super.onActivityResult(i, i2, intent);
        AbstractC8221a aVar = this.f20491a;
        if (aVar != null) {
            aVar.mo14488a(i, i2, intent);
        }
        Iterator<T> it = this.f20495e.iterator();
        while (it.hasNext()) {
            it.next().mo13336a(i, i2, intent);
        }
    }
}
