package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.net.C39146a;
import com.p2082ss.android.ugc.aweme.common.net.C39147b;
import com.p2082ss.android.ugc.aweme.common.net.C39148c;
import com.p2082ss.android.ugc.aweme.common.net.C39154i;
import com.p2082ss.android.ugc.aweme.common.net.C39155j;
import com.p2082ss.android.ugc.aweme.common.net.C39156k;
import com.p2082ss.android.ugc.aweme.common.net.C39157l;
import com.p2082ss.android.ugc.aweme.common.net.C39158m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61550b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61554f;
import com.p2082ss.android.ugc.aweme.notice.api.p3508a.AbstractC61534a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56199c;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.utils.WSHelperImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.websocket.p4394a.C85618a;
import com.p2082ss.android.websocket.p4394a.p4395a.C85620a;
import com.p2082ss.android.websocket.p4394a.p4395a.C85623d;
import com.p2082ss.android.websocket.p4394a.p4395a.C85624e;
import com.p2082ss.android.websocket.p4394a.p4396b.C85626b;
import com.p2082ss.android.websocket.p4394a.p4396b.C85628d;
import com.p2082ss.android.websocket.p4394a.p4396b.C85629e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.q */
public class C61595q implements AbstractC33485al, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final String f139773a = "wss://frontier.tiktokv.com/ws/v2";

    /* renamed from: b */
    public static String f139774b;

    /* renamed from: c */
    public static String f139775c = "";

    /* renamed from: d */
    public static String f139776d = "ws:///ws/v2";

    /* renamed from: f */
    public static C61595q f139777f = new C61595q();

    /* renamed from: g */
    private static final String f139778g = C61595q.class.getName();

    /* renamed from: e */
    public volatile boolean f139779e;

    /* renamed from: h */
    private boolean f139780h;

    /* renamed from: i */
    private boolean f139781i;

    /* renamed from: j */
    private boolean f139782j;

    /* renamed from: k */
    private long f139783k;

    /* renamed from: l */
    private final HashMap<EnumC61554f, Set<AbstractC61534a>> f139784l = new HashMap<>();

    /* renamed from: m */
    private boolean f139785m;

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(371, new RunnableC90250g(C61595q.class, "onEvent", C39157l.class, ThreadMode.POSTING, 0, false));
        hashMap.put(372, new RunnableC90250g(C61595q.class, "onEvent", C39148c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(373, new RunnableC90250g(C61595q.class, "onEvent", C39154i.class, ThreadMode.POSTING, 0, false));
        hashMap.put(374, new RunnableC90250g(C61595q.class, "onEvent", C39158m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(375, new RunnableC90250g(C61595q.class, "onEvent", C39147b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(376, new RunnableC90250g(C61595q.class, "onEvent", C39155j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @AbstractC90264r
    public void onEvent(C39147b bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        m111549d();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
        m111549d();
    }

    /* renamed from: c */
    public static int m111547c() {
        if (WSHelperImpl.m138982e().mo99369c()) {
            return 1;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(72273);
    }

    private C61595q() {
        if (C29843f.m60129a(C17867d.m33078a())) {
            this.f139785m = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
    }

    /* renamed from: d */
    private static void m111549d() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsBackground", String.valueOf(m111547c()));
        AbstractC81915c.m141874a(new C39156k(new C85623d(f139774b, new C85624e(f139774b, 9000, 0, 4, new byte[]{0}, "", "", hashMap))));
    }

    /* renamed from: b */
    public static void m111546b(String str) {
        AbstractC81915c.m141874a(new C39146a(new C85620a(str)));
    }

    @AbstractC90264r
    public void onEvent(C39148c cVar) {
        Activity j;
        if (C34719f.C34720a.f82009a.mo61395c()) {
            mo99332a("netstate_change");
        } else if (!WSHelperImpl.m138982e().mo99369c() && (j = C17873f.m33102j()) != null) {
            j.runOnUiThread(new RunnableC61597s(j));
        }
    }

    /* renamed from: d */
    private static void m111550d(String str) {
        AbstractC56199c iMErrorMonitor;
        C51423a.m95784a(4, "WsLancet", "1.1->recordWsConnect: ".concat(String.valueOf(str)));
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin != null && (iMErrorMonitor = createIIMServicebyMonsterPlugin.getIMErrorMonitor()) != null) {
            iMErrorMonitor.mo92200a(str);
        }
    }

    /* renamed from: a */
    public final void mo99332a(String str) {
        if (this.f139785m) {
            C1731i.m5640b(new CallableC61596r(this, str), C40780g.m82246c());
        } else {
            m111545a(this, str);
        }
    }

    @AbstractC90264r
    public void onEvent(C39154i iVar) {
        C85626b bVar = iVar.f92368a;
        if (this.f139782j) {
            this.f139781i = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.f139783k);
                jSONObject.put("ws_connect_type", bVar.f191966c);
                C12290b.m22060a("aweme_long_connection_error_rate", 0, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f139782j = false;
    }

    @AbstractC90264r
    public void onEvent(C39155j jVar) {
        C61550b bVar;
        Set<AbstractC61534a> set;
        Object obj = jVar.f92369a.f191969c;
        if (!(!(obj instanceof C61550b) || (bVar = (C61550b) obj) == null || (set = this.f139784l.get(bVar.getType())) == null)) {
            for (AbstractC61534a aVar : set) {
                aVar.mo59576a(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        m111550d("find provider wssUrl=".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0188 A[SYNTHETIC, Splitter:B:51:0x0188] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m111548c(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61595q.m111548c(java.lang.String):void");
    }

    @AbstractC90264r
    public void onEvent(C39157l lVar) {
        C85628d dVar = lVar.f92371a;
        if (!this.f139781i && this.f139782j) {
            this.f139781i = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.f139783k);
                jSONObject.put("errorResponse", dVar.f191973b);
                jSONObject.put("ws_connect_type", dVar.f191974c);
                C12290b.m22060a("aweme_long_connection_error_rate", 1, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f139782j = false;
    }

    @AbstractC90264r
    public void onEvent(C39158m mVar) {
        C85629e eVar = mVar.f92372a;
        if ((eVar.f191976b == null || eVar.f191976b == C85618a.EnumC85619a.CLOSED) && this.f139780h) {
            this.f139780h = false;
            mo99332a("ws_status_change");
        }
        if (eVar.f191976b == C85618a.EnumC85619a.OPENING) {
            this.f139783k = SystemClock.uptimeMillis();
            this.f139782j = true;
        }
    }

    /* renamed from: a */
    public static void m111545a(C61595q qVar, String str) {
        C61575ac.m111523a("1->realConnectMessageWS ".concat(String.valueOf(str)));
        qVar.m111548c(str);
    }

    /* renamed from: a */
    public final void mo99331a(EnumC61554f fVar, AbstractC61534a aVar) {
        Set<AbstractC61534a> set = this.f139784l.get(fVar);
        if (set == null) {
            set = new HashSet<>();
            this.f139784l.put(fVar, set);
        }
        set.add(aVar);
    }
}
