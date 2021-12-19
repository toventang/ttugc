package com.bytedance.bdlocation.traceroute.service;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bdlocation.traceroute.AbstractC13215b;
import com.bytedance.bdlocation.traceroute.C13213a;
import com.bytedance.bdlocation.traceroute.C13217c;
import com.bytedance.bdlocation.traceroute.TraceRoute;
import com.bytedance.bdlocation.traceroute.data.HopData;
import com.bytedance.bdlocation.traceroute.data.HopInfo;
import com.bytedance.bdlocation.traceroute.data.TraceEntity;
import com.bytedance.bdlocation.traceroute.data.TracerouteInfo;
import com.bytedance.bdlocation.traceroute.internet.C13223a;
import com.bytedance.bdlocation.traceroute.p855a.C13214a;
import com.bytedance.bdlocation.traceroute.p857c.C13219b;
import com.bytedance.bdlocation.traceroute.p858d.C13220a;
import com.bytedance.bdlocation.traceroute.p859e.C13221a;
import com.bytedance.bdlocation.traceroute.p860f.C13222a;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class TraceRouteService {
    public List<HopData> hopDataList = new ArrayList();
    public List<HopInfo> hopInfoList;
    public Context mContext;
    public TracerouteInfo tracerouteInfo;
    public List<TracerouteInfo> tracerouteInfoList;

    static {
        Covode.recordClassIndex(15179);
    }

    /* renamed from: com_bytedance_bdlocation_traceroute_service_TraceRouteService_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m23777xcbbc852e() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        return C40780g.m82242a(a.mo70028a());
    }

    public void resetHopDataList() {
        List<HopData> list = this.hopDataList;
        if (list != null && list.size() > 1) {
            for (int i = 0; i < this.hopDataList.size() - 1; i++) {
                for (int size = this.hopDataList.size() - 1; size > i; size--) {
                    if (this.hopDataList.get(size).getIp().equals(this.hopDataList.get(i).getIp())) {
                        this.hopDataList.get(i).getCost().add(this.hopDataList.get(size).getCost().get(0));
                        this.hopDataList.remove(size);
                    }
                }
            }
        }
    }

    private void startTraceRoute(C13220a aVar) {
        execute(this.mContext, aVar.f32316f, aVar.f32314d, aVar.f32315e);
    }

    private void executeTraceRouteInterval(C13220a aVar) {
        if (aVar == null) {
            try {
                C13219b.m23768d();
            } catch (Exception unused) {
                C13219b.m23768d();
            }
        } else {
            boolean z = aVar.f32311a;
            "traceroute server enable is:".concat(String.valueOf(z));
            C13219b.m23768d();
            if (z) {
                int i = aVar.f32313c;
                long j = C13214a.m23759a(this.mContext).f32305a.getLong("trace_router_interval", 0);
                C13219b.m23768d();
                if ((System.currentTimeMillis() / 1000) - j < ((long) i)) {
                    C13219b.m23768d();
                    return;
                }
                double d = aVar.f32312b;
                if (d >= 1.0d) {
                    startTraceRoute(aVar);
                    return;
                }
                C13219b.m23768d();
                if (((double) (C13222a.f32323a.nextInt(99999) + 1)) <= d * 100000.0d) {
                    startTraceRoute(aVar);
                }
            }
        }
    }

    private void initConfig(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("is_debug", false);
        if (optBoolean) {
            C13219b.f32309a.f32308a = true;
        }
        C13213a.f32299b = optBoolean;
        String optString = jSONObject.optString("base_url");
        if (TextUtils.isEmpty(optString) || optString.contains("https") || C13213a.f32299b) {
            C13213a.f32298a = optString;
            C13213a.f32300c = jSONObject.optBoolean("is_privacy_confirmed");
            C13213a.f32301d = jSONObject.optBoolean("is_inner");
            C13213a.f32302e = jSONObject.optBoolean("x-use-boe");
            return;
        }
        throw new IllegalArgumentException("need fix host is https");
    }

    public void executeTraceRoute(Context context, String str, JSONObject jSONObject) {
        this.mContext = context;
        try {
            initConfig(jSONObject);
            executeTraceRouteInterval((C13220a) new C27910f().mo46670a(str, C13220a.class));
        } catch (Exception e) {
            e.getMessage();
            C13219b.m23768d();
        }
    }

    public void execute(final Context context, final ArrayList<String> arrayList, final int i, final int i2) {
        m23777xcbbc852e().execute(new Runnable() {
            /* class com.bytedance.bdlocation.traceroute.service.TraceRouteService.RunnableC132241 */

            static {
                Covode.recordClassIndex(15180);
            }

            public final void run() {
                C13221a aVar;
                if (i == 0 || i2 == 0) {
                    C13219b.m23768d();
                    return;
                }
                ArrayList arrayList = arrayList;
                if (arrayList == null || arrayList.size() <= 0) {
                    C13219b.m23768d();
                    return;
                }
                try {
                    TraceEntity traceEntity = new TraceEntity();
                    TraceRouteService.this.tracerouteInfoList = new ArrayList();
                    traceEntity.setTracerouteInfo(TraceRouteService.this.tracerouteInfoList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        TraceRouteService.this.doTraceRoute(context, (String) it.next(), i, i2);
                    }
                    String b = new C27910f().mo46674b(traceEntity);
                    Context context = TraceRouteService.this.mContext;
                    if (!C13213a.f32300c) {
                        C13219b.m23765a();
                    } else if (b == null) {
                        C13219b.m23765a();
                    } else if (C13213a.f32301d) {
                        "upload request".concat(String.valueOf(b));
                        C13219b.m23768d();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("report", C13223a.m23776b(b));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("sdk_version", "1.5.6-alpha.2.3-bugfix");
                        String a = C13223a.m23773a("/location/report/", linkedHashMap, linkedHashMap2);
                        "upload result:".concat(String.valueOf(a));
                        C13219b.m23768d();
                        if (!TextUtils.isEmpty(a) && (aVar = (C13221a) new C27910f().mo46670a(a, C13221a.class)) != null && aVar.f32320c == 0) {
                            C13223a.m23775a(context);
                        }
                    } else {
                        String a2 = C13223a.m23772a(b);
                        "setOuterTraceRouterCache upload result:".concat(String.valueOf(a2));
                        C13219b.m23768d();
                        if (!TextUtils.isEmpty(a2)) {
                            try {
                                C13221a aVar2 = (C13221a) new C27910f().mo46670a(a2, C13221a.class);
                                if (aVar2 != null && aVar2.f32318a == 0) {
                                    C13223a.m23775a(context);
                                }
                            } catch (Exception e) {
                                e.getMessage();
                                C13219b.m23769e();
                            }
                        }
                    }
                } catch (Exception unused) {
                    C13219b.m23768d();
                }
                C13219b.m23768d();
            }
        });
    }

    public void doTraceRoute(final Context context, String str, int i, final int i2) {
        MethodCollector.m26663i(6057);
        TraceRoute traceRoute = new TraceRoute();
        traceRoute.f32296b = i;
        traceRoute.f32297c = i2;
        traceRoute.f32295a = new AbstractC13215b() {
            /* class com.bytedance.bdlocation.traceroute.service.TraceRouteService.C132252 */

            static {
                Covode.recordClassIndex(15181);
            }

            @Override // com.bytedance.bdlocation.traceroute.AbstractC13215b
            /* renamed from: a */
            public final void mo21341a(C13217c cVar) {
                C13219b.m23768d();
            }

            @Override // com.bytedance.bdlocation.traceroute.AbstractC13215b
            /* renamed from: a */
            public final void mo21342a(String str) {
                double d;
                "traceroute update:".concat(String.valueOf(str));
                C13219b.m23768d();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String[] split = str.split(",");
                        if (split != null && split.length > 0) {
                            if (split[0].equals("header")) {
                                TraceRouteService.this.hopInfoList = new ArrayList();
                                String str2 = split[1];
                                String str3 = "traceroute to " + str2 + "(" + split[2] + ")," + split[3] + " hops max," + split[4] + " byte packets";
                                TraceRouteService.this.tracerouteInfo = new TracerouteInfo();
                                TraceRouteService.this.tracerouteInfo.setDomain(str2);
                                TraceRouteService.this.tracerouteInfo.setTimestamp(System.currentTimeMillis());
                                Context context = context;
                                if (C58029j.f132251c == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
                                    C58029j.f132251c = C13624l.m24488d(context);
                                }
                                TraceRouteService.this.tracerouteInfo.setNetworkType(C13624l.m24481a(C58029j.f132251c));
                                TraceRouteService.this.tracerouteInfo.setExecInfo(str3);
                                TraceRouteService.this.tracerouteInfo.setHopInfo(TraceRouteService.this.hopInfoList);
                                TraceRouteService.this.tracerouteInfoList.add(TraceRouteService.this.tracerouteInfo);
                            }
                            if (split[0].equals("hop")) {
                                int parseInt = Integer.parseInt(split[1]);
                                String str4 = split[2];
                                String str5 = split[3];
                                if (split[4].contains("null")) {
                                    d = -1.0d;
                                } else {
                                    d = Double.parseDouble(split[4]);
                                }
                                HopData hopData = new HopData();
                                hopData.setIp(str5);
                                hopData.setHost(str4);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Double.valueOf(d));
                                hopData.setCost(arrayList);
                                TraceRouteService.this.hopDataList.add(hopData);
                                if (TraceRouteService.this.hopDataList.size() == i2) {
                                    TraceRouteService.this.resetHopDataList();
                                    HopInfo hopInfo = new HopInfo();
                                    hopInfo.setHop(parseInt);
                                    hopInfo.setHopData(TraceRouteService.this.hopDataList);
                                    TraceRouteService.this.hopDataList = new ArrayList();
                                    TraceRouteService.this.hopInfoList.add(hopInfo);
                                }
                            }
                        }
                    } catch (Exception unused) {
                        C13219b.m23768d();
                    }
                }
            }

            @Override // com.bytedance.bdlocation.traceroute.AbstractC13215b
            /* renamed from: a */
            public final void mo21340a(int i, String str) {
                C13219b.m23768d();
            }
        };
        try {
            String[] strArr = {str, String.valueOf(traceRoute.f32297c), String.valueOf(traceRoute.f32296b)};
            C13217c cVar = new C13217c();
            cVar.f32306a = traceRoute.execute(strArr);
            if (cVar.f32306a == 0) {
                cVar.f32307b = "execute traceroute successed";
                traceRoute.f32295a.mo21341a(cVar);
                MethodCollector.m26664o(6057);
                return;
            }
            cVar.f32307b = "execute traceroute failed.";
            traceRoute.f32295a.mo21340a(cVar.f32306a, cVar.f32307b);
            MethodCollector.m26664o(6057);
        } catch (Exception unused) {
            C13219b.m23768d();
            MethodCollector.m26664o(6057);
        }
    }
}
