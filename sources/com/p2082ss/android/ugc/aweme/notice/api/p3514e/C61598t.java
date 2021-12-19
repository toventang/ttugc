package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.C13642a;
import com.bytedance.common.wschannel.C13752j;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.net.C39146a;
import com.p2082ss.android.ugc.aweme.common.net.C39147b;
import com.p2082ss.android.ugc.aweme.common.net.C39153h;
import com.p2082ss.android.ugc.aweme.common.net.C39154i;
import com.p2082ss.android.ugc.aweme.common.net.C39155j;
import com.p2082ss.android.ugc.aweme.common.net.C39156k;
import com.p2082ss.android.ugc.aweme.common.net.C39157l;
import com.p2082ss.android.ugc.aweme.common.net.C39158m;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61540c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.WSHelperImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.websocket.internal.proto.Frame;
import com.p2082ss.android.websocket.p4394a.C85618a;
import com.p2082ss.android.websocket.p4394a.p4395a.C85623d;
import com.p2082ss.android.websocket.p4394a.p4395a.C85624e;
import com.p2082ss.android.websocket.p4394a.p4396b.C85625a;
import com.p2082ss.android.websocket.p4394a.p4396b.C85626b;
import com.p2082ss.android.websocket.p4394a.p4396b.C85627c;
import com.p2082ss.android.websocket.p4394a.p4396b.C85628d;
import com.p2082ss.android.websocket.p4394a.p4396b.C85629e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.t */
public final class C61598t implements AbstractC90252i, AbstractC90253j {

    /* renamed from: h */
    public static final boolean f139789h = true;

    /* renamed from: i */
    public static C61598t f139790i;

    /* renamed from: j */
    public static final C61599a f139791j = new C61599a((byte) 0);

    /* renamed from: a */
    public volatile String f139792a;

    /* renamed from: b */
    public final C61590l f139793b;

    /* renamed from: c */
    public String f139794c;

    /* renamed from: d */
    public final AbstractC13651e f139795d;

    /* renamed from: e */
    public final List<AbstractC13651e> f139796e;

    /* renamed from: f */
    public final List<AbstractC61578ae> f139797f;

    /* renamed from: g */
    public final ConcurrentHashMap<C61591m, AbstractC61607z> f139798g;

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(340, new RunnableC90250g(C61598t.class, "onSendWs", C39156k.class, ThreadMode.POSTING, 0, false));
        hashMap.put(341, new RunnableC90250g(C61598t.class, "onOpenWs", C39153h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(342, new RunnableC90250g(C61598t.class, "onCloseWs", C39146a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.e.t$a */
    public static final class C61599a {
        static {
            Covode.recordClassIndex(72277);
        }

        private C61599a() {
        }

        /* renamed from: a */
        public final synchronized C61598t mo99346a() {
            C61598t tVar;
            MethodCollector.m26663i(8478);
            if (C61598t.f139790i == null) {
                C61598t.f139790i = new C61598t((byte) 0);
            }
            tVar = C61598t.f139790i;
            if (tVar == null) {
                C89219l.m154715b();
            }
            MethodCollector.m26664o(8478);
            return tVar;
        }

        public /* synthetic */ C61599a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.e.t$c */
    static final class CallableC61601c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C61598t f139800a;

        static {
            Covode.recordClassIndex(72279);
        }

        CallableC61601c(C61598t tVar) {
            this.f139800a = tVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f139800a.mo99341a();
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(72276);
    }

    private C61598t() {
        this.f139792a = "unknown";
        this.f139793b = new C61590l();
        this.f139794c = "";
        this.f139795d = new C61600b(this);
        this.f139796e = Collections.synchronizedList(new ArrayList());
        this.f139797f = Collections.synchronizedList(new ArrayList());
        this.f139798g = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final void mo99341a() {
        if (C61540c.m111454c()) {
            C39109f.m79404c("WsChannelBridge", "innerOpen ignored by reversing ws");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(new ArrayList());
        if (arrayList.isEmpty()) {
            arrayList.add(C61595q.f139774b);
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        C29803q.m60037b(hashMap, false);
        hashMap.remove("mac_address");
        Context a = C17867d.m33078a();
        if (C58029j.f132255g == NetworkUtils.EnumC29835h.NONE || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132255g = NetworkUtils.getNetworkType(a);
        }
        NetworkUtils.EnumC29835h hVar = C58029j.f132255g;
        if (hVar == NetworkUtils.EnumC29835h.WIFI) {
            i = 1;
        } else if (hVar == NetworkUtils.EnumC29835h.MOBILE_2G) {
            i = 2;
        } else if (hVar == NetworkUtils.EnumC29835h.MOBILE_3G) {
            i = 3;
        } else if (hVar == NetworkUtils.EnumC29835h.MOBILE_4G) {
            i = 4;
        }
        hashMap.put("ne", String.valueOf(i));
        hashMap.put("is_background", String.valueOf(C61595q.m111547c()));
        hashMap.put("em", this.f139792a);
        String b = SettingServiceImpl.m120782v().mo108857a(C17867d.m33078a()).mo90018b();
        C89219l.m154716b(b, "");
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("language", b);
        }
        C13642a.C13643a a2 = C13642a.C13643a.m24565a(1239108);
        a2.f33162f = "e1bd35ec9db7b8d846de66ed140b1ad9";
        a2.f33160d = 9;
        a2.f33159c = AppLog.getAppId();
        a2.f33161e = WSHelperImpl.m138982e().mo99368b();
        a2.f33163g = AppLog.getServerDeviceId();
        a2.f33164h = AppLog.getInstallId();
        C13642a a3 = a2.mo21922a(arrayList).mo21923a(hashMap).mo21924a();
        a3.f33151d.put("sid", AppLog.getSessionKey());
        C13752j.m24798a(a3);
    }

    public /* synthetic */ C61598t(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.e.t$b */
    public static final class C61600b implements AbstractC13651e {

        /* renamed from: a */
        final /* synthetic */ C61598t f139799a;

        static {
            Covode.recordClassIndex(72278);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61600b(C61598t tVar) {
            this.f139799a = tVar;
        }

        @Override // com.bytedance.common.wschannel.app.AbstractC13651e
        /* renamed from: a */
        public final void mo21945a(WsChannelMsg wsChannelMsg) {
            if (C61540c.m111454c()) {
                C39109f.m79404c("WsChannelBridge", "onReceiveMsg ignored by reversing ws");
                return;
            }
            if (wsChannelMsg != null) {
                C85627c cVar = new C85627c(this.f139799a.f139794c, wsChannelMsg.mo22159a(), this.f139799a.f139793b.mo92083a(new C61603v(wsChannelMsg)));
                cVar.f191970d = wsChannelMsg.f33469g;
                cVar.f191971e = Integer.valueOf(wsChannelMsg.f33468f).intValue();
                AbstractC81915c.m141874a(new C39155j(cVar));
            }
            for (AbstractC13651e eVar : this.f139799a.f139796e) {
                eVar.mo21945a(wsChannelMsg);
            }
            if (wsChannelMsg != null) {
                AbstractC61607z zVar = this.f139799a.f139798g.get(new C61591m(wsChannelMsg.f33468f, wsChannelMsg.f33469g));
                if (zVar != null) {
                    zVar.mo99326a(wsChannelMsg);
                }
            }
        }

        @Override // com.bytedance.common.wschannel.app.AbstractC13651e
        /* renamed from: a */
        public final void mo21944a(C13654b bVar, JSONObject jSONObject) {
            C85618a.EnumC85619a aVar;
            if (C61540c.m111454c()) {
                C39109f.m79404c("WsChannelBridge", "onReceiveConnectEvent ignored by reversing ws");
            } else if (bVar != null && jSONObject != null) {
                SocketState a = SocketState.m24814a(jSONObject);
                C56244a.m102190b("WsConnectionReportManager", "onConnectEvent connectionState: " + bVar.f33173b.name());
                C56244a.m102190b("WsConnectionReportManager", "onConnectEvent socketState: ".concat(String.valueOf(a)));
                EnumC13655c cVar = bVar.f33173b;
                if (cVar != null) {
                    int i = C61606y.f139808a[cVar.ordinal()];
                    if (i == 1) {
                        C61605x.f139806b = SystemClock.uptimeMillis();
                    } else if (i != 3) {
                        if (i == 4) {
                            C89219l.m154716b(a, "");
                            C61605x.m111560a(0, a);
                            C61605x.f139805a = true;
                        }
                    } else if (a.f33438a == 0 && C61605x.f139805a) {
                        if (TextUtils.equals(" is not in freshly constructed state...", a.f33443f) || TextUtils.equals(" internet is down, skip...", a.f33443f)) {
                            C89219l.m154716b(a, "");
                            C61605x.m111560a(2, a);
                        } else {
                            C89219l.m154716b(a, "");
                            C61605x.m111560a(1, a);
                        }
                        C61605x.f139805a = false;
                    }
                }
                SocketState a2 = SocketState.m24814a(jSONObject);
                String jSONObject2 = jSONObject.toString();
                C89219l.m154716b(jSONObject2, "");
                EnumC13655c cVar2 = bVar.f33173b;
                if (cVar2 != null) {
                    int i2 = C61602u.f139801a[cVar2.ordinal()];
                    if (i2 == 1) {
                        C61598t tVar = this.f139799a;
                        String str = a2.f33440c;
                        C89219l.m154716b(str, "");
                        tVar.f139794c = str;
                        aVar = C85618a.EnumC85619a.CONNECTED;
                        AbstractC81915c.m141874a(new C39154i(new C85626b(a2.f33440c, jSONObject2, a2.f33442e)));
                    } else if (i2 == 2) {
                        aVar = C85618a.EnumC85619a.CLOSED;
                        AbstractC81915c.m141874a(new C39147b(new C85625a(a2.f33440c, jSONObject2)));
                    } else if (i2 == 3) {
                        AbstractC81915c.m141874a(new C39157l(new C85628d(a2.f33440c, a2.f33443f, a2.f33442e)));
                    } else if (i2 == 4) {
                        aVar = C85618a.EnumC85619a.OPENING;
                    }
                    if (aVar != null) {
                        AbstractC81915c.m141874a(new C39158m(new C85629e(a2.f33440c, aVar)));
                    }
                }
                for (AbstractC13651e eVar : this.f139799a.f139796e) {
                    eVar.mo21944a(bVar, jSONObject);
                }
                List<AbstractC61578ae> list = this.f139799a.f139797f;
                C89219l.m154716b(list, "");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo99327a(new C61604w(bVar, jSONObject));
                }
            }
        }
    }

    @AbstractC90264r
    public final void onOpenWs(C39153h hVar) {
        C89219l.m154721d(hVar, "");
        if (f139789h) {
            C1731i.m5640b(new CallableC61601c(this), C40780g.m82241a());
        } else {
            mo99341a();
        }
    }

    @AbstractC90264r
    public final void onCloseWs(C39146a aVar) {
        MethodCollector.m26663i(10333);
        C89219l.m154721d(aVar, "");
        AbstractC81915c.m141874a(new C39158m(new C85629e(this.f139794c, C85618a.EnumC85619a.CLOSING)));
        C13752j.m24801b();
        WsConstants.remove(1239108);
        C13752j.f33398d.remove(1239108);
        synchronized (C13752j.f33395a) {
            try {
                if (C13752j.f33400f != null && !C13752j.f33400f.f33406a) {
                    C13752j.f33400f.f33407b.remove(1239108);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(10333);
                throw th;
            }
        }
        C13752j.m24796a();
        C13752j.f33396b.mo22081a(C13752j.f33397c, 1239108);
        MethodCollector.m26664o(10333);
    }

    @AbstractC90264r
    public final void onSendWs(C39156k kVar) {
        C89219l.m154721d(kVar, "");
        C85623d dVar = kVar.f92370a;
        if (dVar.f191951b != null) {
            WsChannelMsg.C13768a a = WsChannelMsg.C13768a.m24830a(1239108);
            C85624e eVar = dVar.f191951b;
            C89219l.m154716b(eVar, "");
            a.f33480a = eVar.f191955d;
            C85624e eVar2 = dVar.f191951b;
            C89219l.m154716b(eVar2, "");
            a.f33486g = eVar2.f191954c;
            C85624e eVar3 = dVar.f191951b;
            C89219l.m154716b(eVar3, "");
            a.f33482c = eVar3.f191957f;
            C85624e eVar4 = dVar.f191951b;
            C89219l.m154716b(eVar4, "");
            a.f33481b = eVar4.f191956e;
            C85624e eVar5 = dVar.f191951b;
            C89219l.m154716b(eVar5, "");
            a.f33483d = eVar5.f191953b;
            C85624e eVar6 = dVar.f191951b;
            C89219l.m154716b(eVar6, "");
            a.f33484e = eVar6.f191958g;
            C85624e eVar7 = dVar.f191951b;
            C89219l.m154716b(eVar7, "");
            a.f33485f = eVar7.f191959h;
            C85624e eVar8 = dVar.f191951b;
            C89219l.m154716b(eVar8, "");
            new Frame.ExtendedEntry("", "");
            Map<String, String> map = eVar8.f191960i;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    a.mo22170a(entry.getKey(), entry.getValue());
                }
            }
            WsChannelMsg a2 = a.mo22171a();
            C13752j.m24801b();
            if (a2.f33475m <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (a2.f33468f <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (a2.f33469g <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (a2.mo22159a() != null) {
                if (C13752j.f33400f != null && !C13752j.f33400f.f33406a) {
                    C13752j.m24796a();
                }
                C13752j.f33396b.mo22083a(C13752j.f33397c, a2);
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }
    }

    /* renamed from: a */
    public final void mo99342a(C61591m mVar, AbstractC61607z zVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(zVar, "");
        this.f139798g.put(mVar, zVar);
    }
}
