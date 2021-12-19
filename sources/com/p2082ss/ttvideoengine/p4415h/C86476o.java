package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.C1764a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.ttvideoengine.AbstractC86311ag;
import com.p2082ss.ttvideoengine.C86307af;
import com.p2082ss.ttvideoengine.p4415h.C86449aa;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.o */
public final class C86476o {

    /* renamed from: b */
    public static volatile String f193941b = "unknown";

    /* renamed from: c */
    public static volatile String f193942c = "unknown";

    /* renamed from: d */
    static C86307af f193943d;

    /* renamed from: A */
    public String f193944A;

    /* renamed from: B */
    public int f193945B;

    /* renamed from: C */
    public String f193946C = "";

    /* renamed from: D */
    public String f193947D = "";

    /* renamed from: E */
    public int f193948E;

    /* renamed from: F */
    public int f193949F;

    /* renamed from: G */
    public int f193950G;

    /* renamed from: H */
    public int f193951H = Integer.MIN_VALUE;

    /* renamed from: I */
    public int f193952I = Integer.MIN_VALUE;

    /* renamed from: J */
    public String f193953J = "";

    /* renamed from: K */
    public int f193954K = Integer.MIN_VALUE;

    /* renamed from: L */
    public int f193955L = Integer.MIN_VALUE;

    /* renamed from: M */
    public int f193956M = Integer.MIN_VALUE;

    /* renamed from: N */
    public String f193957N = "";

    /* renamed from: O */
    public String f193958O = "";

    /* renamed from: P */
    public String f193959P = "";

    /* renamed from: Q */
    public String f193960Q = "";

    /* renamed from: R */
    public int f193961R = Integer.MIN_VALUE;

    /* renamed from: S */
    public int f193962S = Integer.MIN_VALUE;

    /* renamed from: T */
    public String f193963T = "default";

    /* renamed from: U */
    public String f193964U = "default";

    /* renamed from: V */
    public int f193965V;

    /* renamed from: W */
    public int f193966W;

    /* renamed from: X */
    public String f193967X = "";

    /* renamed from: Y */
    public float f193968Y = 1.0f;

    /* renamed from: Z */
    public String f193969Z = "";

    /* renamed from: a */
    public AbstractC86462f f193970a;

    /* renamed from: aa */
    public Map f193971aa;

    /* renamed from: ab */
    public String f193972ab = "";

    /* renamed from: ac */
    public Context f193973ac;

    /* renamed from: ad */
    public String f193974ad = "";

    /* renamed from: ae */
    public String f193975ae = "";

    /* renamed from: af */
    public String f193976af = "";

    /* renamed from: ag */
    public boolean f193977ag;

    /* renamed from: ah */
    public String f193978ah;

    /* renamed from: ai */
    public C86478a f193979ai = new C86478a();

    /* renamed from: aj */
    public C86478a f193980aj = new C86478a();

    /* renamed from: ak */
    public int f193981ak = Integer.MIN_VALUE;

    /* renamed from: al */
    public Map f193982al = null;

    /* renamed from: am */
    public int f193983am;

    /* renamed from: an */
    public int f193984an = 0;

    /* renamed from: ao */
    public int f193985ao;

    /* renamed from: ap */
    public int f193986ap;

    /* renamed from: aq */
    public Map<String, Object> f193987aq = null;

    /* renamed from: ar */
    public int f193988ar = -1;

    /* renamed from: as */
    public boolean f193989as;

    /* renamed from: e */
    AbstractC86311ag f193990e;

    /* renamed from: f */
    WeakReference<AbstractC86311ag> f193991f;

    /* renamed from: g */
    public String f193992g;

    /* renamed from: h */
    public String f193993h = "";

    /* renamed from: i */
    public String f193994i = "";

    /* renamed from: j */
    public String f193995j = "";

    /* renamed from: k */
    public String f193996k = "";

    /* renamed from: l */
    public String f193997l = "";

    /* renamed from: m */
    public String f193998m = "";

    /* renamed from: n */
    public String f193999n = "";

    /* renamed from: o */
    public String f194000o = "";

    /* renamed from: p */
    public String f194001p = "";

    /* renamed from: q */
    public String f194002q = "";

    /* renamed from: r */
    public String f194003r;

    /* renamed from: s */
    public String f194004s;

    /* renamed from: t */
    public String f194005t;

    /* renamed from: u */
    public String f194006u;

    /* renamed from: v */
    public String f194007v;

    /* renamed from: w */
    public String f194008w;

    /* renamed from: x */
    public String f194009x;

    /* renamed from: y */
    public String f194010y = "";

    /* renamed from: z */
    public String f194011z;

    /* renamed from: a */
    static String m149399a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "5G" : "3G" : "2G" : "4G" : "WIFI";
    }

    /* renamed from: b */
    static String m149400b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "excellent" : "good" : "medium" : "weak";
    }

    static {
        Covode.recordClassIndex(101704);
    }

    /* renamed from: d */
    public static String m149401d() {
        C86307af afVar;
        if (f193941b.equals("unknown") && (afVar = f193943d) != null) {
            f193941b = m149399a(afVar.f192812a);
        }
        return f193941b;
    }

    /* renamed from: b */
    public final JSONObject mo137682b() {
        String c;
        MethodCollector.m26663i(6712);
        JSONObject jSONObject = null;
        if (this.f193970a != null) {
            synchronized (this) {
                try {
                    c = this.f193970a.mo137293c();
                } finally {
                    MethodCollector.m26664o(6712);
                }
            }
            C86641i.m150113b("VideoEventBase", "update mdl info: ".concat(String.valueOf(c)));
            if (!TextUtils.isEmpty(c)) {
                try {
                    jSONObject = new JSONObject(c);
                } catch (JSONException e) {
                    C86641i.m150117e("VideoEventBase", e.toString());
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final void mo137684e() {
        String str;
        if (this.f193977ag) {
            C86449aa aaVar = C86449aa.C86451b.f193836a;
            String str2 = this.f193978ah;
            if (TextUtils.isEmpty(str2)) {
                C86641i.m150110a("VideoEventOneStorage", "getSessionId return");
                str = null;
            } else {
                C86449aa.C86450a b = aaVar.mo137488b(str2);
                C86641i.m150110a("VideoEventOneStorage", "getSessionId, session id:" + b.f193833a);
                str = b.f193833a;
            }
            C86641i.m150113b("VideoEventBase", "degradeModeChangeSession, stored sessionid:" + str + ", current sessionid:" + this.f194003r);
            if (str != null && !str.equals(this.f194003r)) {
                C86641i.m150110a("VideoEventBase", C1764a.m5928a("degrade mode, change sessionId, before:%s, after:%s", new Object[]{this.f194003r, str}));
                this.f194003r = str;
                this.f193969Z = str;
            }
        }
    }

    /* renamed from: c */
    public final void mo137683c() {
        JSONObject b = mo137682b();
        if (b != null) {
            boolean z = false;
            try {
                if (!b.isNull(DataType.AUDIO)) {
                    this.f193980aj.mo137685a(b.getJSONObject(DataType.AUDIO));
                    z = true;
                }
                if (!b.isNull("video")) {
                    C86641i.m150113b("VideoEventBase", "found video: " + b.getJSONObject("video").toString());
                    this.f193979ai.mo137685a(b.getJSONObject("video"));
                } else if (!z) {
                    this.f193979ai.mo137685a(b);
                }
                if (!b.isNull("cur_task_num")) {
                    this.f193981ak = ((Integer) b.get("cur_task_num")).intValue();
                }
                if (!b.isNull("dns_type")) {
                    int intValue = ((Integer) b.get("dns_type")).intValue();
                    if (intValue == 0) {
                        this.f194010y = "localDNS";
                    } else if (intValue == 2 || intValue == 3) {
                        this.f194010y = "httpDNS";
                    } else if (intValue == 4) {
                        AbstractC86462f fVar = this.f193970a;
                        if (fVar == null || fVar.mo137292c(85) != 1) {
                            this.f194010y = "customDNS";
                        } else {
                            this.f194010y = "customDNSInnerByteDanceHTTPDNS";
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo137679a() {
        Map<String, String> a;
        Object obj;
        Map map = this.f193971aa;
        if (map != null) {
            if (this.f193951H <= 0) {
                this.f193951H = ((Integer) map.get("duration")).intValue() * 1000;
            }
            Object obj2 = ((Map) this.f193971aa.get("size")).get(this.f193960Q);
            int i = -1;
            if (obj2 != null) {
                i = ((Long) obj2).intValue();
            }
            this.f193952I = i;
            Map map2 = (Map) this.f193971aa.get("codec");
            if (map2.get(this.f193960Q) != null) {
                obj = map2.get(this.f193960Q);
            } else {
                obj = "";
            }
            this.f193953J = (String) obj;
        }
        if (this.f193970a != null) {
            String str = this.f193993h;
            if ((str == null || str.isEmpty()) && (a = this.f193970a.mo137288a()) != null) {
                this.f193993h = a.get("pv");
                this.f193994i = a.get("pc");
                this.f193995j = a.get("sv");
                this.f193996k = a.get("sdk_version");
                this.f193997l = a.get("ffv");
                this.f193998m = a.get("vcnv");
                this.f193999n = a.get("trv");
                this.f194001p = a.get("abrv");
                this.f194002q = a.get("prdtv");
                this.f194000o = a.get("prldv");
            }
            if (TextUtils.isEmpty(this.f193953J)) {
                String a2 = this.f193970a.mo137287a(0);
                if (!TextUtils.isEmpty(a2)) {
                    this.f193953J = a2;
                }
            }
            String a3 = this.f193970a.mo137287a(37);
            if (!TextUtils.isEmpty(a3)) {
                this.f193974ad = a3;
            }
            C86641i.m150110a("VideoEventBase", "video_type:" + this.f193957N);
            if (TextUtils.isEmpty(this.f193957N)) {
                String a4 = this.f193970a.mo137287a(65);
                C86641i.m150110a("VideoEventBase", "get video_type from player:".concat(String.valueOf(a4)));
                if (!TextUtils.isEmpty(a4)) {
                    if (a4.indexOf("mp4") > 0) {
                        this.f193957N = "mp4";
                    } else {
                        int indexOf = a4.indexOf(",");
                        if (indexOf < 0) {
                            this.f193957N = a4;
                        } else {
                            this.f193957N = a4.substring(0, indexOf);
                        }
                    }
                }
            }
            C86641i.m150110a("VideoEventBase", "video_size :" + this.f193952I);
            if (this.f193952I <= 0) {
                this.f193952I = (int) this.f193970a.mo137290b(66);
                C86641i.m150110a("VideoEventBase", "get video_size from player:" + this.f193952I);
            }
            this.f193955L = this.f193970a.mo137292c(24);
            this.f193954K = this.f193970a.mo137292c(25);
            switch (this.f193955L) {
                case 2:
                    this.f193948E = 1;
                    break;
                case 3:
                case 4:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    this.f193948E = 0;
                    break;
            }
            this.f193956M = this.f193970a.mo137292c(49);
        }
    }

    /* renamed from: a */
    public final C86478a mo137678a(JSONObject jSONObject) {
        C86478a aVar = new C86478a();
        aVar.mo137685a(jSONObject);
        return aVar;
    }

    /* renamed from: com.ss.ttvideoengine.h.o$a */
    public class C86478a {

        /* renamed from: A */
        public long f194013A = -2147483648L;

        /* renamed from: B */
        public long f194014B = -2147483648L;

        /* renamed from: C */
        public long f194015C = -2147483648L;

        /* renamed from: D */
        public long f194016D = -2147483648L;

        /* renamed from: E */
        public int f194017E = Integer.MIN_VALUE;

        /* renamed from: F */
        public long f194018F = -2147483648L;

        /* renamed from: G */
        public long f194019G = -2147483648L;

        /* renamed from: H */
        public int f194020H = -1;

        /* renamed from: I */
        public int f194021I = -1;

        /* renamed from: J */
        public int f194022J = -1;

        /* renamed from: K */
        public String f194023K = "";

        /* renamed from: L */
        public String f194024L = "";

        /* renamed from: M */
        public int f194025M = -1;

        /* renamed from: N */
        public int f194026N = 1;

        /* renamed from: O */
        public String f194027O = "";

        /* renamed from: P */
        public String f194028P = "";

        /* renamed from: Q */
        public int f194029Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public String f194030R = "";

        /* renamed from: S */
        public String f194031S = "";

        /* renamed from: T */
        public int f194032T = -1;

        /* renamed from: a */
        public long f194034a = -2147483648L;

        /* renamed from: b */
        public long f194035b = -2147483648L;

        /* renamed from: c */
        public long f194036c = -2147483648L;

        /* renamed from: d */
        public int f194037d;

        /* renamed from: e */
        public String f194038e = "";

        /* renamed from: f */
        public String f194039f = "";

        /* renamed from: g */
        public String f194040g = "";

        /* renamed from: h */
        public long f194041h = -2147483648L;

        /* renamed from: i */
        public long f194042i = -2147483648L;

        /* renamed from: j */
        public long f194043j = -2147483648L;

        /* renamed from: k */
        public int f194044k = Integer.MIN_VALUE;

        /* renamed from: l */
        public int f194045l = Integer.MIN_VALUE;

        /* renamed from: m */
        public int f194046m;

        /* renamed from: n */
        public int f194047n = Integer.MIN_VALUE;

        /* renamed from: o */
        public String f194048o = "";

        /* renamed from: p */
        public int f194049p = -1;

        /* renamed from: q */
        public int f194050q = -1;

        /* renamed from: r */
        public String f194051r = "";

        /* renamed from: s */
        public int f194052s = -1;

        /* renamed from: t */
        public String f194053t = "";

        /* renamed from: u */
        public int f194054u = -1;

        /* renamed from: v */
        public long f194055v = -2147483648L;

        /* renamed from: w */
        public long f194056w = -2147483648L;

        /* renamed from: x */
        public long f194057x = -2147483648L;

        /* renamed from: y */
        public long f194058y = -2147483648L;

        /* renamed from: z */
        public long f194059z = -2147483648L;

        static {
            Covode.recordClassIndex(101706);
        }

        public C86478a() {
        }

        /* renamed from: a */
        public final void mo137685a(JSONObject jSONObject) {
            if (jSONObject != null) {
                if (!jSONObject.isNull("cur_req_pos")) {
                    this.f194034a = ((Number) jSONObject.get("cur_req_pos")).longValue();
                }
                if (!jSONObject.isNull("cur_end_pos")) {
                    this.f194035b = ((Number) jSONObject.get("cur_end_pos")).longValue();
                }
                if (!jSONObject.isNull("cur_cache_pos")) {
                    this.f194036c = ((Number) jSONObject.get("cur_cache_pos")).longValue();
                }
                if (!jSONObject.isNull("cache_type")) {
                    this.f194037d = ((Number) jSONObject.get("cache_type")).intValue();
                }
                if (!jSONObject.isNull("down_pos")) {
                    this.f194042i = ((Number) jSONObject.get("down_pos")).longValue();
                }
                if (!jSONObject.isNull("err_code")) {
                    this.f194046m = ((Integer) jSONObject.get("err_code")).intValue();
                }
                if (!jSONObject.isNull("player_wait_num")) {
                    this.f194044k = ((Integer) jSONObject.get("player_wait_num")).intValue();
                }
                if (!jSONObject.isNull("player_wait_time")) {
                    this.f194043j = ((Number) jSONObject.get("player_wait_time")).longValue();
                }
                if (!jSONObject.isNull("reply_size")) {
                    this.f194041h = ((Number) jSONObject.get("reply_size")).longValue();
                }
                if (!jSONObject.isNull("stage")) {
                    this.f194045l = ((Integer) jSONObject.get("stage")).intValue();
                }
                if (!jSONObject.isNull("cur_host")) {
                    this.f194039f = jSONObject.get("cur_host").toString();
                }
                if (!jSONObject.isNull("cur_ip")) {
                    this.f194038e = jSONObject.get("cur_ip").toString();
                }
                if (!jSONObject.isNull("speed")) {
                    this.f194047n = ((Integer) jSONObject.get("speed")).intValue();
                }
                if (!jSONObject.isNull("url")) {
                    this.f194040g = jSONObject.get("url").toString();
                }
                if (!jSONObject.isNull("file_key")) {
                    this.f194048o = jSONObject.get("file_key").toString();
                }
                if (!jSONObject.isNull("is_socrf")) {
                    this.f194049p = ((Integer) jSONObject.get("is_socrf")).intValue();
                }
                if (!jSONObject.isNull("url_index")) {
                    this.f194050q = ((Integer) jSONObject.get("url_index")).intValue();
                }
                if (!jSONObject.isNull("re_url")) {
                    this.f194051r = jSONObject.get("re_url").toString();
                }
                if (!jSONObject.isNull("cur_source")) {
                    this.f194052s = ((Integer) jSONObject.get("cur_source")).intValue();
                }
                if (!jSONObject.isNull("extra_info")) {
                    this.f194053t = jSONObject.get("extra_info").toString();
                }
                if (!jSONObject.isNull("status_code")) {
                    this.f194054u = ((Integer) jSONObject.get("status_code")).intValue();
                }
                if (!jSONObject.isNull("req_t")) {
                    this.f194055v = ((Number) jSONObject.get("req_t")).longValue();
                }
                if (!jSONObject.isNull("end_t")) {
                    this.f194056w = ((Number) jSONObject.get("end_t")).longValue();
                }
                if (!jSONObject.isNull("dns_t")) {
                    this.f194057x = ((Number) jSONObject.get("dns_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_con_start_t")) {
                    this.f194058y = ((Number) jSONObject.get("tcp_con_start_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_con_t")) {
                    this.f194059z = ((Number) jSONObject.get("tcp_con_t")).longValue();
                }
                if (!jSONObject.isNull("tcp_first_pack_t")) {
                    this.f194013A = ((Number) jSONObject.get("tcp_first_pack_t")).longValue();
                }
                if (!jSONObject.isNull("http_first_body_t")) {
                    this.f194014B = ((Number) jSONObject.get("http_first_body_t")).longValue();
                }
                if (!jSONObject.isNull("http_open_end_t")) {
                    this.f194015C = ((Number) jSONObject.get("http_open_end_t")).longValue();
                }
                if (!jSONObject.isNull("fs")) {
                    this.f194016D = ((Number) jSONObject.get("fs")).longValue();
                }
                if (!jSONObject.isNull("full_speed")) {
                    this.f194017E = ((Integer) jSONObject.get("full_speed")).intValue();
                }
                if (!jSONObject.isNull("tbs")) {
                    this.f194018F = ((Number) jSONObject.get("tbs")).longValue();
                }
                if (!jSONObject.isNull("lbs")) {
                    this.f194019G = ((Number) jSONObject.get("lbs")).longValue();
                }
                if (!jSONObject.isNull("req_err")) {
                    this.f194020H = ((Integer) jSONObject.get("req_err")).intValue();
                }
                if (!jSONObject.isNull("read_src")) {
                    this.f194021I = ((Integer) jSONObject.get("read_src")).intValue();
                }
                if (!jSONObject.isNull("seek_times")) {
                    this.f194022J = ((Integer) jSONObject.get("seek_times")).intValue();
                }
                if (!jSONObject.isNull("last_msg")) {
                    this.f194023K = jSONObject.get("last_msg").toString();
                }
                if (!jSONObject.isNull("server_timing")) {
                    this.f194024L = jSONObject.get("server_timing").toString();
                }
                if (!jSONObject.isNull("v_lt")) {
                    this.f194025M = ((Integer) jSONObject.get("v_lt")).intValue();
                }
                if (!jSONObject.isNull("v_p2p_ier")) {
                    this.f194026N = ((Integer) jSONObject.get("v_p2p_ier")).intValue();
                }
                if (!jSONObject.isNull("req_num")) {
                    this.f194029Q = ((Integer) jSONObject.get("req_num")).intValue();
                }
                if (!jSONObject.isNull("ip_list")) {
                    this.f194027O = jSONObject.get("ip_list").toString();
                }
                if (!jSONObject.isNull("blocked_ip")) {
                    this.f194028P = jSONObject.get("blocked_ip").toString();
                }
                if (!jSONObject.isNull("cdn_cache")) {
                    this.f194030R = jSONObject.get("cdn_cache").toString();
                }
                if (!jSONObject.isNull("client_info")) {
                    this.f194031S = jSONObject.get("client_info").toString();
                }
                if (!jSONObject.isNull("disable_seek")) {
                    this.f194032T = ((Integer) jSONObject.get("disable_seek")).intValue();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo137680a(AbstractC86517e eVar) {
        Object obj;
        List<C86534o> b;
        if (eVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (eVar.mo137742a() && (b = eVar.mo137745b()) != null && b.size() > 0) {
                int i = 0;
                for (C86534o oVar : b) {
                    int a = oVar.mo137723a();
                    String vVar = oVar.mo137729c().toString(a);
                    hashMap.put(vVar, Long.valueOf(oVar.mo137728c(12)));
                    hashMap2.put(vVar, oVar.mo137726b(8));
                    hashMap3.put(vVar, Integer.valueOf(oVar.mo137724a(3)));
                    hashMap4.put(Integer.valueOf(oVar.mo137724a(3)), oVar.mo137726b(15));
                    hashMap5.put(Integer.valueOf(oVar.mo137724a(3)), Integer.valueOf(i));
                    if (a == 1) {
                        arrayList.add(Integer.valueOf(oVar.mo137724a(3)));
                    } else {
                        arrayList2.add(Integer.valueOf(oVar.mo137724a(3)));
                    }
                    i++;
                }
            }
            HashMap hashMap6 = new HashMap();
            String g = eVar.mo137754g();
            String h = eVar.mo137755h();
            hashMap6.put("duration", Integer.valueOf(eVar.mo137734a(3)));
            hashMap6.put("size", hashMap);
            hashMap6.put("codec", hashMap2);
            hashMap6.put("vtype", g);
            hashMap6.put("dynamic_type", h);
            hashMap6.put("bitrate", hashMap3);
            hashMap6.put("fileKey", hashMap4);
            hashMap6.put("bitrateMapTable", hashMap5);
            hashMap6.put("audio_bitrate", arrayList);
            hashMap6.put("video_bitrate", arrayList2);
            this.f193971aa = hashMap6;
            if (!TextUtils.isEmpty(this.f193960Q) && (obj = hashMap3.get(this.f193960Q)) != null) {
                this.f193961R = ((Integer) obj).intValue();
            }
            this.f193957N = g;
            this.f193958O = h;
        }
    }

    /* renamed from: a */
    public final void mo137681a(String str, String str2) {
        Object obj;
        this.f193959P = str2;
        this.f193960Q = str;
        Map map = this.f193971aa;
        if (map != null && (obj = ((Map) map.get("bitrate")).get(this.f193960Q)) != null) {
            this.f193961R = ((Integer) obj).intValue();
        }
    }

    C86476o(AbstractC86462f fVar, boolean z, Context context) {
        this.f193970a = fVar;
        this.f194003r = Base64.encodeToString(((new String() + new Random().nextInt()) + System.currentTimeMillis()).getBytes(), 2);
        this.f193989as = z;
        this.f193973ac = context;
    }
}
