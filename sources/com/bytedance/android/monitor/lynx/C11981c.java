package com.bytedance.android.monitor.lynx;

import android.os.Build;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.lynx.p715a.C11960b;
import com.bytedance.android.monitor.lynx.p716b.C11980b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11985b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11987d;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11989f;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11991g;
import com.bytedance.android.monitor.p706d.C11927j;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p712j.AbstractC11940b;
import com.bytedance.android.monitor.p712j.C11941c;
import com.bytedance.android.monitor.p713k.C11943a;
import com.bytedance.android.monitor.p714l.C11947a;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.p714l.C11952f;
import com.bytedance.android.monitor.p714l.C11955i;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.c */
public final class C11981c implements AbstractC11957a {

    /* renamed from: a */
    private volatile AtomicInteger f28684a = new AtomicInteger();

    /* renamed from: b */
    private C11991g f28685b;

    static {
        Covode.recordClassIndex(13707);
    }

    /* renamed from: com.bytedance.android.monitor.lynx.c$b */
    static final class C11983b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxView f28689a;

        static {
            Covode.recordClassIndex(13709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11983b(LynxView lynxView) {
            super(0);
            this.f28689a = lynxView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            HybridMonitor.getInstance().wrapTouchTraceCallback(C11947a.m21085a(this.f28689a));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static C11941c m21156a() {
        HybridMonitor instance = HybridMonitor.getInstance();
        C89219l.m154709a((Object) instance, "");
        AbstractC11940b settingManager = instance.getSettingManager();
        C89219l.m154709a((Object) settingManager, "");
        C11941c c = settingManager.mo19155c();
        C89219l.m154709a((Object) c, "");
        return c;
    }

    /* renamed from: f */
    private static C11987d m21157f(LynxView lynxView) {
        return (C11987d) C11969b.f28620f.f28625c.mo19194b(lynxView);
    }

    @Override // com.bytedance.android.monitor.lynx.AbstractC11957a
    /* renamed from: d */
    public final void mo19164d(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C11969b.f28620f.mo19186a(lynxView);
    }

    /* renamed from: g */
    private final void m21158g(LynxView lynxView) {
        this.f28684a.getAndIncrement();
        if (this.f28684a.get() == 3) {
            C11969b.f28620f.mo19182a(lynxView, this.f28685b);
            this.f28684a.set(0);
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.c$a */
    public static final class View$OnAttachStateChangeListenerC11982a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ String f28686a;

        /* renamed from: b */
        final /* synthetic */ LynxView f28687b;

        /* renamed from: c */
        final /* synthetic */ C11980b f28688c;

        static {
            Covode.recordClassIndex(13708);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!C11969b.f28620f.mo19187a(this.f28686a, "blank")) {
                C11960b bVar = new C11960b(this.f28687b, this.f28688c.f28683k);
                bVar.f28600b = true;
                bVar.run();
                if (view != null) {
                    view.removeOnAttachStateChangeListener(this);
                }
            } else if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
        }

        View$OnAttachStateChangeListenerC11982a(String str, LynxView lynxView, C11980b bVar) {
            this.f28686a = str;
            this.f28687b = lynxView;
            this.f28688c = bVar;
        }
    }

    @Override // com.bytedance.android.monitor.lynx.AbstractC11957a
    /* renamed from: b */
    public final void mo19162b(LynxView lynxView) {
        C11987d f;
        C89219l.m154719c(lynxView, "");
        C11985b c = C11969b.f28620f.f28624b.mo19194b(lynxView);
        if (c == null) {
            c = C11969b.f28620f.f28624b.mo19193a(lynxView);
        }
        String pageVersion = lynxView.getPageVersion();
        C89219l.m154709a((Object) pageVersion, "");
        C89219l.m154719c(pageVersion, "");
        c.f28700m = pageVersion;
        if (C11969b.f28620f.mo19186a(lynxView) && (f = m21157f(lynxView)) != null) {
            f.f28711b = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.monitor.lynx.AbstractC11957a
    /* renamed from: a */
    public final void mo19160a(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        if (C11969b.f28620f.mo19186a(lynxView)) {
            C11987d dVar = (C11987d) C11969b.f28620f.f28625c.mo19194b(lynxView);
            if (dVar != null) {
                dVar.f28715f = System.currentTimeMillis();
            }
            m21158g(lynxView);
        }
    }

    @Override // com.bytedance.android.monitor.lynx.AbstractC11957a
    /* renamed from: c */
    public final void mo19163c(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        if (C11969b.f28620f.mo19186a(lynxView)) {
            C11987d f = m21157f(lynxView);
            if (f != null) {
                f.f28714e = System.currentTimeMillis();
            }
            m21158g(lynxView);
            C11985b c = C11969b.f28620f.f28624b.mo19194b(lynxView);
            if (c == null) {
                c = C11969b.f28620f.f28624b.mo19193a(lynxView);
            }
            String str = c.f28530b;
            C11980b a = C11969b.f28620f.f28623a.mo19190a(lynxView);
            if (a != null && a.f28676d && m21156a().f28564b && !(!C89219l.m154714a((Object) a.f28677e, (Object) "detect_when_load_success")) && !C11969b.f28620f.mo19187a(str, "blank")) {
                C11960b bVar = new C11960b(lynxView, a.f28683k);
                bVar.f28600b = true;
                new Timer().schedule(bVar, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.AbstractC11957a
    /* renamed from: e */
    public final void mo19165e(LynxView lynxView) {
        String str;
        C89219l.m154719c(lynxView, "");
        C11987d dVar = (C11987d) C11969b.f28620f.f28625c.mo19194b(lynxView);
        if (C11969b.f28620f.mo19186a(lynxView)) {
            C11985b c = C11969b.f28620f.f28624b.mo19194b(lynxView);
            if (c != null) {
                str = c.f28530b;
            } else {
                str = null;
            }
            if (!C11969b.f28620f.mo19187a(str, "perf")) {
                C11991g gVar = new C11991g();
                if (dVar == null || !dVar.f28716g || !dVar.f28717h) {
                    gVar.f28739n = 3;
                    C11937b.m21063b("LynxState", "lynx_state = 3");
                } else {
                    gVar.f28739n = 2;
                    C11937b.m21063b("LynxState", "lynx_state = 2");
                }
                C11969b.f28620f.mo19182a(lynxView, gVar);
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.AbstractC11957a
    /* renamed from: a */
    public final void mo19158a(C11989f fVar, LynxView lynxView) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(lynxView, "");
        if (C11969b.f28620f.mo19186a(lynxView)) {
            C11969b.f28620f.mo19181a(lynxView, fVar);
            int i = fVar.f28725c;
            if (i == 100 || i == 103) {
                C11991g gVar = new C11991g();
                gVar.f28739n = 1;
                C11937b.m21063b("LynxState", "lynx_state = 1");
                C11969b.f28620f.mo19182a(lynxView, gVar);
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.AbstractC11957a
    /* renamed from: a */
    public final void mo19159a(C11991g gVar, LynxView lynxView) {
        C11985b c;
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(lynxView, "");
        C11985b c2 = C11969b.f28620f.f28624b.mo19194b(lynxView);
        if (c2 == null) {
            c2 = C11969b.f28620f.f28624b.mo19193a(lynxView);
        }
        JSONObject jSONObject = gVar.f28738m;
        if (jSONObject != null) {
            try {
                c2.f28536h = jSONObject.getJSONObject("timing").getLong("init_end");
            } catch (Exception unused) {
            }
        }
        if (C11969b.f28620f.mo19186a(lynxView)) {
            gVar.f28739n = 0;
            C11937b.m21063b("LynxState", "lynx_state = 1");
            this.f28685b = gVar;
            m21158g(lynxView);
            C11969b bVar = C11969b.f28620f;
            C89219l.m154719c(lynxView, "");
            C11980b a = bVar.f28623a.mo19190a(lynxView);
            if (a != null && a.f28681i && (c = bVar.f28624b.mo19194b(lynxView)) != null) {
                JSONObject jSONObject2 = new JSONObject();
                C11950d.m21101a(jSONObject2, "prefEnable", String.valueOf(a.f28675c));
                C11950d.m21101a(jSONObject2, "url", c.f28529a);
                C11950d.m21101a(jSONObject2, "container_type", "lynx");
                JSONObject jSONObject3 = new JSONObject();
                C11950d.m21100a(jSONObject3, "tti", Double.valueOf(gVar.f28729d));
                if (a.f28680h != null) {
                    bVar.mo19184a(lynxView, "performance_test", lynxView.getTemplateUrl(), jSONObject2, jSONObject3, null, null, true);
                }
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.AbstractC11957a
    /* renamed from: a */
    public final void mo19161a(String str, LynxView lynxView) {
        boolean z;
        C11985b c;
        String str2;
        C89219l.m154719c(lynxView, "");
        if (C11969b.f28620f.mo19186a(lynxView)) {
            C11985b c2 = C11969b.f28620f.f28624b.mo19194b(lynxView);
            if (c2 == null) {
                c2 = C11969b.f28620f.f28624b.mo19193a(lynxView);
            }
            if (c2.f28529a != null) {
                z = true;
            } else {
                z = false;
            }
            c2.f28539k = Boolean.valueOf(z);
            c2.f28529a = str;
            c2.f28533e = C11955i.m21114a();
            c2.f28530b = C11952f.m21108a();
            ((C11987d) C11969b.f28620f.f28625c.mo19193a(lynxView)).f28710a = System.currentTimeMillis();
            C11969b bVar = C11969b.f28620f;
            C11927j jVar = new C11927j();
            C89219l.m154719c(lynxView, "");
            C89219l.m154719c(jVar, "");
            C11980b a = bVar.f28623a.mo19190a(lynxView);
            if (!(a == null || (c = bVar.f28624b.mo19194b(lynxView)) == null)) {
                bVar.mo19185a(C11929a.m21040a(), new C11969b.C11976g(bVar, c, C11943a.m21078a(lynxView), jVar, a));
            }
            C11980b a2 = C11969b.f28620f.f28623a.mo19190a(lynxView);
            if (a2 != null && a2.f28676d && m21156a().f28564b && !(!C89219l.m154714a((Object) a2.f28677e, (Object) "detect_when_detach"))) {
                C11985b c3 = C11969b.f28620f.f28624b.mo19194b(lynxView);
                if (c3 != null) {
                    str2 = c3.f28530b;
                } else {
                    str2 = null;
                }
                if (lynxView != null) {
                    lynxView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC11982a(str2, lynxView, a2));
                }
            }
            C11929a.m21041a(new C11983b(lynxView));
            C11987d f = m21157f(lynxView);
            int i = Build.VERSION.SDK_INT;
            if (f != null) {
                f.f28716g = lynxView.isAttachedToWindow();
            }
            if (lynxView.getVisibility() == 0 && f != null) {
                f.f28717h = true;
            }
        }
    }
}
