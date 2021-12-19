package com.bytedance.android.monitorV2.lynx;

import android.os.Build;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.monitorV2.C12079d;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.lynx.C12155c;
import com.bytedance.android.monitorV2.lynx.p741a.C12139b;
import com.bytedance.android.monitorV2.lynx.p742b.C12152b;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12166b;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12167c;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12169e;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12171f;
import com.bytedance.android.monitorV2.lynx.p743c.p746c.C12176e;
import com.bytedance.android.monitorV2.p731d.C12091j;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p735h.AbstractC12113f;
import com.bytedance.android.monitorV2.p735h.p736a.C12103e;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p739k.C12118a;
import com.bytedance.android.monitorV2.p740l.C12124a;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.p740l.C12131g;
import com.bytedance.android.monitorV2.p740l.C12134j;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.b */
public final class C12148b implements AbstractC12136a {

    /* renamed from: a */
    private volatile AtomicInteger f29195a = new AtomicInteger();

    /* renamed from: b */
    private C12171f f29196b;

    /* renamed from: c */
    private final String f29197c = "LynxViewLifeCycle";

    static {
        Covode.recordClassIndex(13877);
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.b$b */
    static final class C12150b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxView f29201a;

        static {
            Covode.recordClassIndex(13879);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12150b(LynxView lynxView) {
            super(0);
            this.f29201a = lynxView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            HybridMultiMonitor.getInstance().wrapTouchTraceCallback(C12124a.m21625a(this.f29201a));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static C12103e m21692a() {
        HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
        C89219l.m154709a((Object) instance, "");
        AbstractC12113f hybridSettingManager = instance.getHybridSettingManager();
        C89219l.m154709a((Object) hybridSettingManager, "");
        C12103e c = hybridSettingManager.mo19480c();
        C89219l.m154709a((Object) c, "");
        return c;
    }

    /* renamed from: f */
    private static C12167c m21693f(LynxView lynxView) {
        return (C12167c) C12155c.f29212j.f29219e.mo19536b(lynxView);
    }

    /* renamed from: g */
    private final void m21694g(LynxView lynxView) {
        this.f29195a.getAndIncrement();
        if (this.f29195a.get() == 3) {
            C12155c.f29212j.mo19523a(lynxView, this.f29196b);
            this.f29195a.set(0);
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.AbstractC12136a
    /* renamed from: d */
    public final void mo19503d(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C12115b.m21583b(this.f29197c, "onPageUpdate");
        C12155c.f29212j.mo19530c(lynxView);
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.b$a */
    public static final class View$OnAttachStateChangeListenerC12149a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f29198a;

        /* renamed from: b */
        final /* synthetic */ LynxView f29199b;

        /* renamed from: c */
        final /* synthetic */ C12152b f29200c;

        static {
            Covode.recordClassIndex(13878);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!C12155c.f29212j.mo19527a(this.f29198a, "blank")) {
                C12139b bVar = new C12139b(this.f29199b, this.f29200c.f29209g);
                bVar.f29175b = true;
                bVar.run();
                if (view != null) {
                    view.removeOnAttachStateChangeListener(this);
                }
            } else if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
        }

        View$OnAttachStateChangeListenerC12149a(String str, LynxView lynxView, C12152b bVar) {
            this.f29198a = str;
            this.f29199b = lynxView;
            this.f29200c = bVar;
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.AbstractC12136a
    /* renamed from: a */
    public final void mo19499a(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C12115b.m21583b(this.f29197c, "onRuntimeReady");
        if (C12155c.f29212j.mo19530c(lynxView)) {
            C12167c cVar = (C12167c) C12155c.f29212j.f29219e.mo19536b(lynxView);
            if (cVar != null) {
                cVar.f29280f = System.currentTimeMillis();
            }
            m21694g(lynxView);
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.AbstractC12136a
    /* renamed from: b */
    public final void mo19501b(LynxView lynxView) {
        C12167c f;
        C89219l.m154719c(lynxView, "");
        C12115b.m21583b(this.f29197c, "onLoadSuccess");
        C12166b c = C12155c.f29212j.f29218d.mo19536b(lynxView);
        if (c == null) {
            c = C12155c.f29212j.f29218d.mo19535a(lynxView);
        }
        String pageVersion = lynxView.getPageVersion();
        C89219l.m154709a((Object) pageVersion, "");
        C89219l.m154719c(pageVersion, "");
        c.f29273l = pageVersion;
        if (C12155c.f29212j.mo19530c(lynxView) && (f = m21693f(lynxView)) != null) {
            f.f29276b = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.AbstractC12136a
    /* renamed from: c */
    public final void mo19502c(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C12115b.m21583b(this.f29197c, "onFirstScreen");
        if (C12155c.f29212j.mo19530c(lynxView)) {
            C12167c f = m21693f(lynxView);
            if (f != null) {
                f.f29279e = System.currentTimeMillis();
            }
            m21694g(lynxView);
            C12166b c = C12155c.f29212j.f29218d.mo19536b(lynxView);
            if (c == null) {
                c = C12155c.f29212j.f29218d.mo19535a(lynxView);
            }
            String str = c.f29010b;
            C12152b a = C12155c.f29212j.f29217c.mo19514a(lynxView);
            if (a != null && m21692a().mo19474h() && !(!C89219l.m154714a((Object) a.f29205c, (Object) "detect_when_load_success")) && !C12155c.f29212j.mo19527a(str, "blank")) {
                C12139b bVar = new C12139b(lynxView, a.f29209g);
                bVar.f29175b = true;
                new Timer().schedule(bVar, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.AbstractC12136a
    /* renamed from: e */
    public final void mo19504e(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C12115b.m21583b(this.f29197c, "onDestroy");
        if (C12155c.f29212j.mo19530c(lynxView)) {
            C12167c cVar = (C12167c) C12155c.f29212j.f29219e.mo19536b(lynxView);
            C12166b c = C12155c.f29212j.f29218d.mo19536b(lynxView);
            if (!C12155c.f29212j.mo19527a(C12155c.f29212j.f29221g.mo19540a(lynxView), "perf")) {
                C12171f fVar = new C12171f();
                if (cVar == null || !cVar.f29281g || !cVar.f29282h) {
                    fVar.f29304n = 3;
                    C12115b.m21583b("LynxState", "lynx_state = 3");
                } else {
                    fVar.f29304n = 2;
                    C12115b.m21583b("LynxState", "lynx_state = 2");
                }
                C12155c.f29212j.mo19523a(lynxView, fVar);
            }
            if (c != null) {
                C12176e eVar = C12155c.f29212j.f29221g;
                String str = c.f29010b;
                C89219l.m154709a((Object) str, "");
                eVar.mo19541a(lynxView, str);
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.AbstractC12136a
    /* renamed from: a */
    public final void mo19497a(C12169e eVar, LynxView lynxView) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(lynxView, "");
        String str = this.f29197c;
        StringBuilder append = new StringBuilder("onReceivedError: errorCode: ").append(eVar.f29290c).append(", errorMsg: ");
        String str2 = eVar.f29291d;
        if (str2 == null) {
            str2 = null;
        } else if (str2.length() > 100) {
            str2 = str2.substring(0, 100);
            C89219l.m154709a((Object) str2, "");
        }
        C12115b.m21583b(str, append.append(str2).toString());
        if (C12155c.f29212j.mo19530c(lynxView)) {
            C12155c.f29212j.mo19522a(lynxView, eVar);
            int i = eVar.f29290c;
            if (i == 100 || i == 103) {
                C12171f fVar = new C12171f();
                fVar.f29304n = 1;
                C12115b.m21583b("LynxState", "lynx_state = 1");
                C12155c.f29212j.mo19523a(lynxView, fVar);
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.AbstractC12136a
    /* renamed from: a */
    public final void mo19498a(C12171f fVar, LynxView lynxView) {
        C12166b c;
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(lynxView, "");
        C12115b.m21583b(this.f29197c, "onFirstLoadPerfReady");
        C12166b c2 = C12155c.f29212j.f29218d.mo19536b(lynxView);
        if (c2 == null) {
            c2 = C12155c.f29212j.f29218d.mo19535a(lynxView);
        }
        JSONObject jSONObject = fVar.f29303m;
        if (jSONObject != null) {
            try {
                c2.f29017i = jSONObject.getJSONObject("timing").getLong("init_end");
            } catch (Exception unused) {
            }
        }
        if (C12155c.f29212j.mo19530c(lynxView)) {
            fVar.f29304n = 0;
            C12115b.m21583b("LynxState", "lynx_state = 1");
            this.f29196b = fVar;
            m21694g(lynxView);
            C12155c cVar = C12155c.f29212j;
            C89219l.m154719c(lynxView, "");
            C12115b.m21583b("LynxViewMonitor", "reportABTest");
            C12152b a = cVar.f29217c.mo19514a(lynxView);
            if (a != null && a.f29207e && (c = cVar.f29218d.mo19536b(lynxView)) != null) {
                c.mo19442a(cVar.mo19528b(lynxView), cVar.mo19519a(lynxView));
                JSONObject jSONObject2 = new JSONObject();
                C12130f.m21652a(jSONObject2, "url", c.f29009a);
                C12130f.m21652a(jSONObject2, "container_type", "lynx");
                JSONObject jSONObject3 = new JSONObject();
                C12130f.m21651a(jSONObject3, "tti", Double.valueOf(fVar.f29294d));
                if (a.f29206d != null) {
                    cVar.mo19525a(lynxView, "performance_test", lynxView.getTemplateUrl(), jSONObject2, jSONObject3, null, null, 0);
                }
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.AbstractC12136a
    /* renamed from: a */
    public final void mo19500a(String str, LynxView lynxView) {
        boolean z;
        C12166b c;
        String str2;
        C89219l.m154719c(lynxView, "");
        C12115b.m21583b(this.f29197c, "onPageStart: ".concat(String.valueOf(str)));
        if (C12155c.f29212j.mo19530c(lynxView)) {
            C12155c cVar = C12155c.f29212j;
            C89219l.m154719c(lynxView, "");
            String templateUrl = lynxView.getTemplateUrl();
            if (templateUrl != null) {
                C89219l.m154709a((Object) templateUrl, "");
                HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
                C89219l.m154709a((Object) instance, "");
                AbstractC12113f hybridSettingManager = instance.getHybridSettingManager();
                C89219l.m154709a((Object) hybridSettingManager, "");
                String a = C12079d.m21505a(templateUrl, hybridSettingManager.mo19481d());
                C12115b.m21583b("LynxViewMonitor", "regexMatcher: ".concat(String.valueOf(a)));
                cVar.mo19524a(lynxView, a);
            }
            C12166b c2 = C12155c.f29212j.f29218d.mo19536b(lynxView);
            if (c2 == null) {
                c2 = C12155c.f29212j.f29218d.mo19535a(lynxView);
            }
            String a2 = C12131g.m21660a();
            if (c2.f29009a != null) {
                z = true;
            } else {
                z = false;
            }
            c2.f29018j = Boolean.valueOf(z);
            if (!c2.f29010b.equals(C12155c.f29212j.f29221g.mo19540a(lynxView))) {
                C12176e eVar = C12155c.f29212j.f29221g;
                C89219l.m154709a((Object) a2, "");
                eVar.mo19541a(lynxView, a2);
            }
            c2.f29009a = str;
            c2.f29012d = C12134j.m21666a();
            c2.f29010b = a2;
            ((C12167c) C12155c.f29212j.f29219e.mo19535a(lynxView)).f29275a = System.currentTimeMillis();
            C12155c cVar2 = C12155c.f29212j;
            C12091j jVar = new C12091j();
            C89219l.m154719c(lynxView, "");
            C89219l.m154719c(jVar, "");
            C12115b.m21583b("LynxViewMonitor", "reportPV");
            C12152b a3 = cVar2.f29217c.mo19514a(lynxView);
            if (!(a3 == null || (c = cVar2.f29218d.mo19536b(lynxView)) == null)) {
                c.mo19442a(cVar2.mo19528b(lynxView), cVar2.mo19519a(lynxView));
                cVar2.mo19526a(C12093a.m21522a(), new C12155c.C12161f(cVar2, lynxView, c, C12118a.m21594a(lynxView), jVar, a3));
            }
            C12152b a4 = C12155c.f29212j.f29217c.mo19514a(lynxView);
            if (a4 != null && m21692a().mo19474h() && !(!C89219l.m154714a((Object) a4.f29205c, (Object) "detect_when_detach"))) {
                C12166b c3 = C12155c.f29212j.f29218d.mo19536b(lynxView);
                if (c3 != null) {
                    str2 = c3.f29010b;
                } else {
                    str2 = null;
                }
                lynxView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC12149a(str2, lynxView, a4));
            }
            C12093a.m21523a(new C12150b(lynxView));
            C12167c f = m21693f(lynxView);
            int i = Build.VERSION.SDK_INT;
            if (f != null) {
                f.f29281g = lynxView.isAttachedToWindow();
            }
            if (lynxView.getVisibility() == 0 && f != null) {
                f.f29282h = true;
            }
        }
    }
}
