package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.x */
public final class C86497x {

    /* renamed from: a */
    public C86476o f194312a;

    /* renamed from: b */
    public HashMap f194313b;

    /* renamed from: c */
    public C86500b f194314c;

    /* renamed from: d */
    public long f194315d = -2147483648L;

    /* renamed from: e */
    public long f194316e = -2147483648L;

    /* renamed from: f */
    public int f194317f;

    /* renamed from: g */
    public ArrayList<String> f194318g = new ArrayList<>();

    /* renamed from: h */
    public int f194319h = 0;

    static {
        Covode.recordClassIndex(101725);
    }

    /* renamed from: c */
    private void m149605c() {
        this.f194312a.mo137679a();
        if ((this.f194319h & 1) != 0) {
            C86641i.m150110a("VideoEventOneOpera", "report async");
            C86631b.m150044a(new RunnableC86498a(this.f194312a.f193973ac, this, this.f194312a, this.f194314c));
        }
    }

    /* renamed from: a */
    public final void mo137711a() {
        MethodCollector.m26663i(5909);
        synchronized (this.f194313b) {
            try {
                this.f194313b = new HashMap();
            } catch (Throwable th) {
                MethodCollector.m26664o(5909);
                throw th;
            }
        }
        this.f194317f = 0;
        this.f194318g = new ArrayList<>();
        MethodCollector.m26664o(5909);
    }

    /* renamed from: b */
    public final long mo137713b() {
        MethodCollector.m26663i(5911);
        if (this.f194314c.f194333f > 0) {
            MethodCollector.m26664o(5911);
            return 0;
        }
        synchronized (this.f194313b) {
            try {
                if (this.f194313b.containsKey("seek")) {
                    return ((Long) this.f194313b.get("seek")).longValue();
                }
                MethodCollector.m26664o(5911);
                return -1;
            } finally {
                MethodCollector.m26664o(5911);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.x$a */
    public static class RunnableC86498a implements Runnable {

        /* renamed from: a */
        private C86497x f194320a;

        /* renamed from: b */
        private Handler f194321b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private C86476o f194322c;

        /* renamed from: d */
        private Context f194323d;

        /* renamed from: e */
        private C86500b f194324e;

        static {
            Covode.recordClassIndex(101726);
        }

        public final void run() {
            final boolean z;
            MethodCollector.m26663i(4923);
            if (this.f194320a == null) {
                MethodCollector.m26664o(4923);
                return;
            }
            C86476o oVar = this.f194322c;
            if (oVar != null) {
                oVar.mo137683c();
                this.f194322c.f193972ab = C86476o.m149401d();
            }
            C86476o oVar2 = this.f194322c;
            if (oVar2 == null || !oVar2.f193989as) {
                z = false;
            } else {
                z = true;
            }
            C86497x xVar = this.f194320a;
            C86500b bVar = this.f194324e;
            C86476o oVar3 = this.f194322c;
            HashMap hashMap = new HashMap();
            if (oVar3 != null) {
                C86470l.m149395a(hashMap, "player_sessionid", oVar3.f194003r);
                if (oVar3.f194007v == null || oVar3.f194007v.isEmpty()) {
                    C86470l.m149395a(hashMap, "cdn_url", oVar3.f194004s);
                } else {
                    C86470l.m149395a(hashMap, "cdn_url", oVar3.f194007v);
                }
                if (oVar3.f194009x == null || oVar3.f194009x.isEmpty()) {
                    C86470l.m149395a(hashMap, "cdn_ip", oVar3.f194006u);
                } else {
                    C86470l.m149395a(hashMap, "cdn_ip", oVar3.f194009x);
                }
                C86470l.m149395a(hashMap, "source_type", oVar3.f193947D);
                C86470l.m149395a(hashMap, "v", oVar3.f193946C);
                C86470l.m149395a(hashMap, "pv", oVar3.f193993h);
                C86470l.m149395a(hashMap, "pc", oVar3.f193994i);
                C86470l.m149395a(hashMap, "sv", oVar3.f193995j);
                C86470l.m149395a(hashMap, "sdk_version", oVar3.f193996k);
                C86470l.m149395a(hashMap, "vtype", oVar3.f193957N);
                C86470l.m149395a(hashMap, "tag", oVar3.f193963T);
                C86470l.m149395a(hashMap, "subtag", oVar3.f193964U);
                C86470l.m149393a((Map) hashMap, "p2p_cdn_type", oVar3.f193962S);
                C86470l.m149395a(hashMap, "codec", oVar3.f193953J);
                C86470l.m149393a((Map) hashMap, "video_codec_nameid", oVar3.f193955L);
                C86470l.m149393a((Map) hashMap, "audio_codec_nameid", oVar3.f193954K);
                C86470l.m149393a((Map) hashMap, "format_type", oVar3.f193956M);
                C86470l.m149393a((Map) hashMap, "drm_type", oVar3.f193966W);
                C86470l.m149393a((Map) hashMap, "mdl_speed", oVar3.f193979ai.f194047n);
                C86470l.m149395a(hashMap, "nt", oVar3.f193972ab);
                C86470l.m149393a((Map) hashMap, "reuse_socket", oVar3.f193965V);
                C86470l.m149395a(hashMap, "mdl_version", oVar3.f193974ad);
                C86470l.m149393a((Map) hashMap, "enable_mdl", oVar3.f193988ar);
                C86470l.m149394a(hashMap, "mdl_req_t", oVar3.f193979ai.f194055v);
                C86470l.m149394a(hashMap, "mdl_end_t", oVar3.f193979ai.f194056w);
                C86470l.m149394a(hashMap, "mdl_dns_t", oVar3.f193979ai.f194057x);
                C86470l.m149394a(hashMap, "mdl_tcp_start_t", oVar3.f193979ai.f194058y);
                C86470l.m149394a(hashMap, "mdl_tcp_end_t", oVar3.f193979ai.f194059z);
                C86470l.m149394a(hashMap, "mdl_ttfp", oVar3.f193979ai.f194013A);
                C86470l.m149394a(hashMap, "mdl_httpfb", oVar3.f193979ai.f194014B);
                C86470l.m149395a(hashMap, "mdl_cur_ip", oVar3.f193979ai.f194038e);
                C86470l.m149394a(hashMap, "mdl_cur_req_pos", oVar3.f193979ai.f194034a);
                C86470l.m149394a(hashMap, "mdl_cur_end_pos", oVar3.f193979ai.f194035b);
                C86470l.m149394a(hashMap, "mdl_cur_cache_pos", oVar3.f193979ai.f194036c);
                C86470l.m149393a((Map) hashMap, "mdl_cache_type", oVar3.f193979ai.f194037d);
                C86470l.m149394a(hashMap, "mdl_reply_size", oVar3.f193979ai.f194041h);
                C86470l.m149394a(hashMap, "mdl_down_pos", oVar3.f193979ai.f194042i);
                C86470l.m149393a((Map) hashMap, "mdl_error_code", oVar3.f193979ai.f194046m);
                C86470l.m149393a((Map) hashMap, "mdl_http_code", oVar3.f193979ai.f194054u);
                C86470l.m149395a(hashMap, "mdl_ip_list", oVar3.f193979ai.f194027O);
                C86470l.m149395a(hashMap, "mdl_blocked_ips", oVar3.f193979ai.f194028P);
                C86470l.m149394a(hashMap, "a_mdl_req_t", oVar3.f193980aj.f194055v);
                C86470l.m149394a(hashMap, "a_mdl_end_t", oVar3.f193980aj.f194056w);
                C86470l.m149394a(hashMap, "a_mdl_dns_t", oVar3.f193980aj.f194057x);
                C86470l.m149394a(hashMap, "a_mdl_tcp_start_t", oVar3.f193980aj.f194058y);
                C86470l.m149394a(hashMap, "a_mdl_tcp_end_t", oVar3.f193980aj.f194059z);
                C86470l.m149394a(hashMap, "a_mdl_ttfp", oVar3.f193980aj.f194013A);
                C86470l.m149394a(hashMap, "a_mdl_httpfb", oVar3.f193980aj.f194014B);
                C86470l.m149395a(hashMap, "a_mdl_cur_ip", oVar3.f193980aj.f194038e);
                C86470l.m149394a(hashMap, "a_mdl_cur_req_pos", oVar3.f193980aj.f194034a);
                C86470l.m149394a(hashMap, "a_mdl_cur_end_pos", oVar3.f193980aj.f194035b);
                C86470l.m149394a(hashMap, "a_mdl_cur_cache_pos", oVar3.f193980aj.f194036c);
                C86470l.m149393a((Map) hashMap, "a_mdl_cache_type", oVar3.f193980aj.f194037d);
                C86470l.m149394a(hashMap, "a_mdl_reply_size", oVar3.f193980aj.f194041h);
                C86470l.m149394a(hashMap, "a_mdl_down_pos", oVar3.f193980aj.f194042i);
                C86470l.m149393a((Map) hashMap, "a_mdl_error_code", oVar3.f193980aj.f194046m);
                C86470l.m149393a((Map) hashMap, "a_mdl_http_code", oVar3.f193980aj.f194054u);
                C86470l.m149395a(hashMap, "a_mdl_ip_list", oVar3.f193980aj.f194027O);
                C86470l.m149395a(hashMap, "a_mdl_blocked_ips", oVar3.f193980aj.f194028P);
            }
            C86470l.m149395a(hashMap, "opera_type", bVar.f194328a);
            C86470l.m149395a(hashMap, "state_before", bVar.f194329b);
            C86470l.m149395a(hashMap, "state_after", bVar.f194330c);
            C86470l.m149394a(hashMap, "cost_time", bVar.f194331d);
            C86470l.m149395a(hashMap, "end_type", bVar.f194332e);
            C86470l.m149393a((Map) hashMap, "index", bVar.f194339l);
            long j = -1;
            if (xVar.f194313b.containsKey(bVar.f194328a)) {
                long longValue = ((Long) xVar.f194313b.get(bVar.f194328a)).longValue();
                if (longValue > 0) {
                    j = bVar.f194333f - longValue;
                }
            }
            C86470l.m149394a(hashMap, "last_interval", j);
            C86470l.m149393a((Map) hashMap, "retry_count", bVar.f194335h);
            C86470l.m149393a((Map) hashMap, "is_seek_in_buffer", bVar.f194336i);
            C86470l.m149394a(hashMap, "video_len_after", bVar.f194337j);
            C86470l.m149394a(hashMap, "audio_len_after", bVar.f194338k);
            C86470l.m149394a(hashMap, "st", bVar.f194333f);
            C86470l.m149394a(hashMap, "et", bVar.f194334g);
            C86470l.m149395a(hashMap, "resolution_before", bVar.f194340m);
            C86470l.m149395a(hashMap, "resolution_after", bVar.f194341n);
            C86470l.m149393a((Map) hashMap, "bitrate_before", bVar.f194342o);
            C86470l.m149393a((Map) hashMap, "bitrate_after", bVar.f194343p);
            C86470l.m149394a(hashMap, "last_buf_start_t", xVar.f194315d);
            C86470l.m149394a(hashMap, "last_buf_end_t", xVar.f194316e);
            final JSONObject jSONObject = new JSONObject(hashMap);
            Handler handler = this.f194321b;
            if (handler == null) {
                EnumC86487t.instance.addEventV2(z, jSONObject, "videoplayer_oneopera");
                MethodCollector.m26664o(4923);
                return;
            }
            handler.post(new Runnable() {
                /* class com.p2082ss.ttvideoengine.p4415h.C86497x.RunnableC86498a.RunnableC864991 */

                static {
                    Covode.recordClassIndex(101727);
                }

                public final void run() {
                    EnumC86487t.instance.addEventV2(z, jSONObject, "videoplayer_oneopera");
                }
            });
            synchronized (this.f194320a.f194313b) {
                try {
                    this.f194320a.f194313b.remove(this.f194324e.f194328a);
                    this.f194320a.f194313b.put(this.f194324e.f194328a, Long.valueOf(this.f194324e.f194334g));
                } catch (Throwable th) {
                    MethodCollector.m26664o(4923);
                    throw th;
                }
            }
            this.f194320a.f194315d = -2147483648L;
            this.f194320a.f194316e = -2147483648L;
            MethodCollector.m26664o(4923);
        }

        public RunnableC86498a(Context context, C86497x xVar, C86476o oVar, C86500b bVar) {
            this.f194320a = xVar;
            this.f194322c = oVar;
            this.f194323d = context;
            this.f194324e = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.x$b */
    public class C86500b {

        /* renamed from: a */
        public String f194328a;

        /* renamed from: b */
        public String f194329b;

        /* renamed from: c */
        public String f194330c;

        /* renamed from: d */
        public long f194331d;

        /* renamed from: e */
        public String f194332e;

        /* renamed from: f */
        public long f194333f;

        /* renamed from: g */
        public long f194334g;

        /* renamed from: h */
        public int f194335h;

        /* renamed from: i */
        public int f194336i;

        /* renamed from: j */
        public long f194337j;

        /* renamed from: k */
        public long f194338k;

        /* renamed from: l */
        public int f194339l;

        /* renamed from: m */
        public String f194340m;

        /* renamed from: n */
        public String f194341n;

        /* renamed from: o */
        public int f194342o;

        /* renamed from: p */
        public int f194343p;

        static {
            Covode.recordClassIndex(101728);
        }

        private C86500b() {
            this.f194328a = "";
            this.f194329b = "";
            this.f194330c = "";
            this.f194331d = -2147483648L;
            this.f194332e = "";
            this.f194333f = -2147483648L;
            this.f194334g = -2147483648L;
            this.f194340m = "";
            this.f194341n = "";
            this.f194342o = Integer.MIN_VALUE;
            this.f194343p = Integer.MIN_VALUE;
        }

        /* synthetic */ C86500b(C86497x xVar, byte b) {
            this();
        }
    }

    C86497x(C86476o oVar) {
        this.f194312a = oVar;
        this.f194313b = new HashMap();
        this.f194314c = new C86500b(this, (byte) 0);
    }

    /* renamed from: a */
    public final void mo137712a(String str, int i) {
        if (this.f194314c.f194333f <= 0 || this.f194314c.f194328a.isEmpty()) {
            C86641i.m150113b("VideoEventOneOpera", "endSeek without beginSeek, return.");
            return;
        }
        C86641i.m150113b("VideoEventOneOpera", "endSeek, from " + this.f194314c.f194329b + " to " + this.f194314c.f194330c);
        this.f194314c.f194334g = System.currentTimeMillis();
        C86500b bVar = this.f194314c;
        bVar.f194331d = bVar.f194334g - this.f194314c.f194333f;
        if (this.f194314c.f194331d > 0) {
            this.f194317f = (int) (((long) this.f194317f) + this.f194314c.f194331d);
        }
        this.f194314c.f194332e = str;
        this.f194314c.f194336i = i;
        C86476o oVar = this.f194312a;
        if (!(oVar == null || oVar.f193970a == null)) {
            this.f194314c.f194341n = this.f194312a.f193960Q;
            this.f194314c.f194343p = this.f194312a.f193961R;
            Map<String, Long> b = this.f194312a.f193970a.mo137291b();
            if (b != null) {
                this.f194314c.f194337j = b.get("vlen").longValue();
                this.f194314c.f194338k = b.get("alen").longValue();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("fr", this.f194314c.f194329b);
        hashMap.put("to", this.f194314c.f194330c);
        hashMap.put("t", Long.valueOf(this.f194314c.f194334g));
        hashMap.put("c", Long.valueOf(this.f194314c.f194331d));
        this.f194318g.add(new JSONObject(hashMap).toString());
        this.f194312a.mo137684e();
        m149605c();
        this.f194314c = new C86500b(this, (byte) 0);
    }
}
