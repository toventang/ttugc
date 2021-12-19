package com.bytedance.android.monitorV2.p740l;

import com.C1764a;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p735h.p736a.C12099b;
import com.bytedance.android.monitorV2.p735h.p736a.C12102d;
import com.bytedance.android.monitorV2.p735h.p736a.C12103e;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4622m.C89350l;

/* renamed from: com.bytedance.android.monitorV2.l.b */
public final class C12125b {
    static {
        Covode.recordClassIndex(13854);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static boolean m21632a(String str, C12097a.C12098a aVar) {
        boolean z;
        str.hashCode();
        switch (str.hashCode()) {
            case -1480388560:
                if (str.equals("performance")) {
                    z = aVar.f29032A;
                    break;
                }
                z = false;
                break;
            case -1323516222:
                if (str.equals("jsbPerf")) {
                    z = aVar.f29036E;
                    break;
                }
                z = false;
                break;
            case -892481938:
                if (str.equals("static")) {
                    z = aVar.f29046O;
                    break;
                }
                z = false;
                break;
            case 93819220:
                if (str.equals("blank")) {
                    z = aVar.f29033B;
                    break;
                }
                z = false;
                break;
            case 281935726:
                if (str.equals("fetchError")) {
                    z = aVar.f29034C;
                    break;
                }
                z = false;
                break;
            case 299602137:
                if (str.equals("js_exception")) {
                    z = aVar.f29045N;
                    break;
                }
                z = false;
                break;
            case 831602183:
                if (str.equals("containerError")) {
                    z = aVar.f29044M;
                    break;
                }
                z = false;
                break;
            case 1008268974:
                if (str.equals("navigationStart")) {
                    z = aVar.f29038G;
                    break;
                }
                z = false;
                break;
            case 1727072305:
                if (str.equals("nativeError")) {
                    z = aVar.f29037F;
                    break;
                }
                z = false;
                break;
            case 1910899023:
                if (str.equals("jsbError")) {
                    z = aVar.f29035D;
                    break;
                }
                z = false;
                break;
            default:
                z = false;
                break;
        }
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("sampling eventType: %s, sampleHit: %b， use: %s", new Object[]{str, Boolean.valueOf(z), aVar.f29047a}));
        return z;
    }

    /* renamed from: b */
    public static int m21633b(String str) {
        Map<String, Integer> e = HybridMultiMonitor.getInstance().getHybridSettingManager().mo19482e();
        if (!e.containsKey(str)) {
            return -1;
        }
        return e.get(str).intValue();
    }

    /* renamed from: a */
    public static C12102d m21628a(String str) {
        C12115b.m21581a("HybridMonitor", "resToSettingsResponse: ".concat(String.valueOf(str)));
        JSONObject optJSONObject = C12130f.m21648a(str).optJSONObject("data");
        C12102d dVar = new C12102d();
        dVar.f29097c = C12130f.m21657c(optJSONObject, "update_time");
        dVar.f29098d = C12130f.m21647a(optJSONObject, "duration");
        dVar.f29099e = C12130f.m21655b(optJSONObject, "setting_id");
        dVar.f29095a = m21627a(C12130f.m21658d(optJSONObject, "bid_info"), dVar.f29099e);
        dVar.f29096b = m21629a(C12130f.m21655b(optJSONObject, "enable_switch"));
        dVar.f29100f = m21630a(C12130f.m21658d(optJSONObject, "all_event_sample"));
        return dVar;
    }

    /* renamed from: a */
    private static C12103e m21629a(long j) {
        C12103e eVar = new C12103e();
        int i = 0;
        while (true) {
            if (j % 2 == 0) {
                switch (i) {
                    case 0:
                        eVar.f29101a = false;
                        break;
                    case 1:
                        eVar.f29102b = false;
                        break;
                    case 2:
                        eVar.f29103c = false;
                        break;
                    case 3:
                        eVar.f29104d = false;
                        break;
                    case 4:
                        eVar.f29105e = false;
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f29106f = false;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f29107g = false;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        eVar.f29108h = false;
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        eVar.f29109i = false;
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f29110j = false;
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f29111k = false;
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        eVar.f29112l = false;
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        eVar.f29113m = false;
                        break;
                }
            }
            i++;
            if (i < 13) {
                if (i != 0) {
                    j >>= 1;
                }
            }
        }
        return eVar;
    }

    /* renamed from: a */
    private static Map<String, Integer> m21630a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, Integer.valueOf(C12130f.m21647a(jSONObject, next)));
        }
        return hashMap;
    }

    /* renamed from: c */
    public static boolean m21635c(String str, C12097a.C12098a aVar) {
        str.hashCode();
        if (!str.equals("containerError")) {
            return false;
        }
        return aVar.f29044M;
    }

    /* renamed from: a */
    public static int m21626a(String str, String str2) {
        Map<String, Integer> b = HybridMultiMonitor.getInstance().getHybridSettingManager().mo19479b().mo19450b(str);
        if (!b.containsKey(str2)) {
            return -1;
        }
        return b.get(str2).intValue();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static C12097a m21627a(JSONObject jSONObject, long j) {
        C12097a aVar = new C12097a();
        if (jSONObject == null) {
            return aVar;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject d = C12130f.m21658d(jSONObject, next);
            long b = C12130f.m21655b(d, "hit_sample");
            C12097a.C12098a aVar2 = new C12097a.C12098a(next);
            aVar2.f29048b = b;
            aVar2.f29049c = j;
            aVar2.f29050d = m21630a(C12130f.m21658d(d, "event_name_sample"));
            Map<String, C12097a.C12098a> map = aVar.f29030b;
            int i = 0;
            while (true) {
                if (i != 0) {
                    b >>= 1;
                }
                if (b % 2 == 1) {
                    switch (i) {
                        case 0:
                            aVar2.f29051e = true;
                            break;
                        case 1:
                            aVar2.f29052f = true;
                            break;
                        case 2:
                            aVar2.f29053g = true;
                            break;
                        case 3:
                            aVar2.f29054h = true;
                            break;
                        case 4:
                            aVar2.f29055i = true;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            aVar2.f29056j = true;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            aVar2.f29057k = true;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            aVar2.f29058l = true;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            aVar2.f29059m = true;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            aVar2.f29060n = true;
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            aVar2.f29061o = true;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            aVar2.f29062p = true;
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            aVar2.f29063q = true;
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            aVar2.f29064r = true;
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            aVar2.f29065s = true;
                            break;
                        case 15:
                            aVar2.f29066t = true;
                            break;
                        case 16:
                            aVar2.f29067u = true;
                            break;
                        case 17:
                            aVar2.f29068v = true;
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            aVar2.f29069w = true;
                            break;
                        case 19:
                            aVar2.f29070x = true;
                            break;
                        case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                            aVar2.f29071y = true;
                            break;
                        case 21:
                            aVar2.f29072z = true;
                            break;
                        case 22:
                            aVar2.f29032A = true;
                            break;
                        case 23:
                            aVar2.f29033B = true;
                            break;
                        case 24:
                            aVar2.f29034C = true;
                            break;
                        case 25:
                            aVar2.f29035D = true;
                            break;
                        case 26:
                            aVar2.f29036E = true;
                            break;
                        case 27:
                            aVar2.f29037F = true;
                            break;
                        case 28:
                            aVar2.f29038G = true;
                            break;
                        case 29:
                            aVar2.f29039H = true;
                            break;
                        case 30:
                            aVar2.f29040I = true;
                            break;
                        case 31:
                            aVar2.f29041J = true;
                            break;
                        case 32:
                            aVar2.f29042K = true;
                            break;
                        case 33:
                            aVar2.f29043L = true;
                            break;
                        case 34:
                            aVar2.f29044M = true;
                            break;
                        case 35:
                            aVar2.f29045N = true;
                            break;
                        case 36:
                            aVar2.f29046O = true;
                            break;
                    }
                }
                i++;
                if (i >= 37) {
                }
            }
            map.put(next, aVar2);
            JSONArray optJSONArray = d.optJSONArray("regex_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    aVar.f29031c.add(new C12099b(next, new C89350l(optJSONArray.optString(i2))));
                }
            }
        }
        Collections.sort(aVar.f29031c);
        return aVar;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static boolean m21634b(String str, C12097a.C12098a aVar) {
        boolean z;
        str.hashCode();
        switch (str.hashCode()) {
            case -1898518694:
                if (str.equals("falconPerf")) {
                    z = aVar.f29069w;
                    break;
                }
                z = false;
                break;
            case -1577087617:
                if (str.equals("resource_performance")) {
                    z = aVar.f29062p;
                    break;
                }
                z = false;
                break;
            case -1323516222:
                if (str.equals("jsbPerf")) {
                    z = aVar.f29068v;
                    break;
                }
                z = false;
                break;
            case -892481938:
                if (str.equals("static")) {
                    z = aVar.f29063q;
                    break;
                }
                z = false;
                break;
            case -109980519:
                if (str.equals("static_sri")) {
                    z = aVar.f29072z;
                    break;
                }
                z = false;
                break;
            case 2994720:
                if (str.equals("ajax")) {
                    z = aVar.f29061o;
                    break;
                }
                z = false;
                break;
            case 3437289:
                if (str.equals("perf")) {
                    z = aVar.f29060n;
                    break;
                }
                z = false;
                break;
            case 93819220:
                if (str.equals("blank")) {
                    z = aVar.f29065s;
                    break;
                }
                z = false;
                break;
            case 281935726:
                if (str.equals("fetchError")) {
                    z = aVar.f29066t;
                    break;
                }
                z = false;
                break;
            case 299602137:
                if (str.equals("js_exception")) {
                    z = aVar.f29064r;
                    break;
                }
                z = false;
                break;
            case 831602183:
                if (str.equals("containerError")) {
                    z = aVar.f29044M;
                    break;
                }
                z = false;
                break;
            case 1008268974:
                if (str.equals("navigationStart")) {
                    z = aVar.f29071y;
                    break;
                }
                z = false;
                break;
            case 1727072305:
                if (str.equals("nativeError")) {
                    z = aVar.f29070x;
                    break;
                }
                z = false;
                break;
            case 1910899023:
                if (str.equals("jsbError")) {
                    z = aVar.f29067u;
                    break;
                }
                z = false;
                break;
            default:
                z = false;
                break;
        }
        C12115b.m21584c("HybridMonitor", C1764a.m5928a("sampling eventType: %s, sampleHit: %b, use: %s", new Object[]{str, Boolean.valueOf(z), aVar.f29047a}));
        return z;
    }

    /* renamed from: a */
    public static boolean m21631a(C12097a.C12098a aVar, int i) {
        boolean z;
        switch (i) {
            case 0:
                z = aVar.f29051e;
                break;
            case 1:
                z = aVar.f29052f;
                break;
            case 2:
                z = aVar.f29053g;
                break;
            case 3:
                z = aVar.f29054h;
                break;
            case 4:
                z = aVar.f29055i;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                z = aVar.f29056j;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                z = aVar.f29057k;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                z = aVar.f29058l;
                break;
            default:
                z = aVar.f29059m;
                break;
        }
        C12115b.m21583b("CustomMonitor", C1764a.m5928a("canSample level: %s, sampleHit: %b, use: %s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z), aVar.f29047a}));
        return z;
    }
}
