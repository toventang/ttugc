package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4415h.C86476o;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.u */
public final class C86489u {

    /* renamed from: a */
    public C86476o f194242a;

    /* renamed from: b */
    public HashMap f194243b;

    /* renamed from: c */
    public C86492b f194244c;

    /* renamed from: d */
    public long f194245d;

    /* renamed from: e */
    public ArrayList<String> f194246e = new ArrayList<>();

    /* renamed from: f */
    public long f194247f = -2147483648L;

    /* renamed from: g */
    private C86497x f194248g;

    static {
        Covode.recordClassIndex(101717);
    }

    /* renamed from: d */
    private void m149596d() {
        this.f194242a.mo137679a();
        C86641i.m150110a("VideoEventOneEvent", "report async");
        C86631b.m150044a(new RunnableC86490a(this.f194242a.f193973ac, this, this.f194242a, this.f194244c));
    }

    /* renamed from: a */
    public final void mo137703a() {
        MethodCollector.m26663i(6225);
        synchronized (this.f194243b) {
            try {
                this.f194243b = new HashMap();
            } catch (Throwable th) {
                MethodCollector.m26664o(6225);
                throw th;
            }
        }
        this.f194245d = 0;
        this.f194246e = new ArrayList<>();
        this.f194247f = -2147483648L;
        MethodCollector.m26664o(6225);
    }

    /* renamed from: b */
    public final long mo137705b() {
        MethodCollector.m26663i(6230);
        if (this.f194244c.f194269f > 0) {
            MethodCollector.m26664o(6230);
            return 0;
        }
        synchronized (this.f194243b) {
            try {
                if (this.f194243b.containsKey("block_net")) {
                    return ((Long) this.f194243b.get("block_net")).longValue();
                }
                MethodCollector.m26664o(6230);
                return -1;
            } finally {
                MethodCollector.m26664o(6230);
            }
        }
    }

    /* renamed from: c */
    private void m149595c() {
        C86476o oVar = this.f194242a;
        if (oVar != null && oVar.f193970a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cost_time", Long.valueOf(this.f194244c.f194265b));
            hashMap.put("exit_type", this.f194244c.f194266c);
            JSONObject b = this.f194242a.mo137682b();
            if (b == null) {
                hashMap.put("cur_url", this.f194242a.f194007v);
                hashMap.put("cur_ip", this.f194242a.f194009x);
                try {
                    hashMap.put("cur_host", Uri.parse(this.f194242a.f194007v).getHost());
                } catch (Exception e) {
                    C86641i.m150110a("VideoEventOneEvent", "_triggerBufferEndCb:" + e.toString());
                }
            } else if (!b.isNull("video")) {
                try {
                    C86476o.C86478a a = this.f194242a.mo137678a(b.getJSONObject("video"));
                    hashMap.put("cur_url", a.f194040g);
                    hashMap.put("cur_ip", a.f194038e);
                    hashMap.put("cur_host", Uri.parse(a.f194040g).getHost());
                } catch (Exception unused) {
                }
            }
            this.f194242a.f193970a.mo137289a(1, hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.u$a */
    public static class RunnableC86490a implements Runnable {

        /* renamed from: a */
        private C86489u f194249a;

        /* renamed from: b */
        private Handler f194250b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private C86476o f194251c;

        /* renamed from: d */
        private Context f194252d;

        /* renamed from: e */
        private C86492b f194253e;

        static {
            Covode.recordClassIndex(101718);
        }

        public final void run() {
            final boolean z;
            long j;
            long j2;
            MethodCollector.m26663i(5129);
            if (this.f194249a == null) {
                MethodCollector.m26664o(5129);
                return;
            }
            C86476o oVar = this.f194251c;
            if (oVar == null || !oVar.f193989as) {
                z = false;
            } else {
                z = true;
            }
            C86489u uVar = this.f194249a;
            C86492b bVar = this.f194253e;
            C86476o oVar2 = this.f194251c;
            HashMap hashMap = new HashMap();
            if (oVar2 != null) {
                C86470l.m149395a(hashMap, "player_sessionid", oVar2.f194003r);
                if (oVar2.f194007v == null || oVar2.f194007v.isEmpty()) {
                    C86470l.m149395a(hashMap, "cdn_url", oVar2.f194004s);
                } else {
                    C86470l.m149395a(hashMap, "cdn_url", oVar2.f194007v);
                }
                if (oVar2.f194009x == null || oVar2.f194009x.isEmpty()) {
                    C86470l.m149395a(hashMap, "cdn_ip", oVar2.f194006u);
                } else {
                    C86470l.m149395a(hashMap, "cdn_ip", oVar2.f194009x);
                }
                C86470l.m149395a(hashMap, "resolution", oVar2.f193960Q);
                C86470l.m149395a(hashMap, "source_type", oVar2.f193947D);
                C86470l.m149395a(hashMap, "v", oVar2.f193946C);
                C86470l.m149395a(hashMap, "pv", oVar2.f193993h);
                C86470l.m149395a(hashMap, "pc", oVar2.f193994i);
                C86470l.m149395a(hashMap, "sv", oVar2.f193995j);
                C86470l.m149395a(hashMap, "sdk_version", oVar2.f193996k);
                C86470l.m149395a(hashMap, "vtype", oVar2.f193957N);
                C86470l.m149395a(hashMap, "tag", oVar2.f193963T);
                C86470l.m149395a(hashMap, "subtag", oVar2.f193964U);
                C86470l.m149393a((Map) hashMap, "p2p_cdn_type", oVar2.f193962S);
                C86470l.m149395a(hashMap, "codec", oVar2.f193953J);
                C86470l.m149393a((Map) hashMap, "video_codec_nameid", oVar2.f193955L);
                C86470l.m149393a((Map) hashMap, "audio_codec_nameid", oVar2.f193954K);
                C86470l.m149393a((Map) hashMap, "format_type", oVar2.f193956M);
                C86470l.m149393a((Map) hashMap, "drm_type", oVar2.f193966W);
                C86470l.m149392a((Map) hashMap, "play_speed", oVar2.f193968Y);
                C86470l.m149395a(hashMap, "nt", oVar2.f193972ab);
                C86470l.m149395a(hashMap, "mdl_version", oVar2.f193974ad);
                C86470l.m149393a((Map) hashMap, "enable_mdl", oVar2.f193988ar);
                C86470l.m149393a((Map) hashMap, "video_hw", oVar2.f193948E);
                C86470l.m149393a((Map) hashMap, "user_hw", oVar2.f193949F);
                C86470l.m149393a((Map) hashMap, "cur_task_num", oVar2.f193981ak);
                C86470l.m149394a(hashMap, "cur_req_pos", oVar2.f193979ai.f194034a);
                C86470l.m149394a(hashMap, "cur_end_pos", oVar2.f193979ai.f194035b);
                C86470l.m149394a(hashMap, "cur_cache_pos", oVar2.f193979ai.f194036c);
                C86470l.m149393a((Map) hashMap, "cache_type", oVar2.f193979ai.f194037d);
                C86470l.m149395a(hashMap, "cur_ip", oVar2.f193979ai.f194038e);
                C86470l.m149395a(hashMap, "cur_host", oVar2.f193979ai.f194039f);
                C86470l.m149394a(hashMap, "reply_size", oVar2.f193979ai.f194041h);
                C86470l.m149394a(hashMap, "down_pos", oVar2.f193979ai.f194042i);
                C86470l.m149394a(hashMap, "player_wait_time", oVar2.f193979ai.f194043j);
                C86470l.m149393a((Map) hashMap, "player_wait_num", oVar2.f193979ai.f194044k);
                C86470l.m149393a((Map) hashMap, "mdl_stage", oVar2.f193979ai.f194045l);
                C86470l.m149393a((Map) hashMap, "mdl_ec", oVar2.f193979ai.f194046m);
                C86470l.m149393a((Map) hashMap, "mdl_speed", oVar2.f193979ai.f194047n);
                C86470l.m149395a(hashMap, "mdl_file_key", oVar2.f193979ai.f194048o);
                C86470l.m149393a((Map) hashMap, "mdl_is_socrf", oVar2.f193979ai.f194049p);
                C86470l.m149393a((Map) hashMap, "mdl_req_num", oVar2.f193979ai.f194029Q);
                C86470l.m149393a((Map) hashMap, "mdl_url_index", oVar2.f193979ai.f194050q);
                C86470l.m149395a(hashMap, "mdl_re_url", oVar2.f193979ai.f194051r);
                C86470l.m149393a((Map) hashMap, "mdl_cur_source", oVar2.f193979ai.f194052s);
                C86470l.m149395a(hashMap, "mdl_extra_info", oVar2.f193979ai.f194053t);
                C86470l.m149394a(hashMap, "mdl_fs", oVar2.f193979ai.f194016D);
                C86470l.m149393a((Map) hashMap, "mdl_p2p_sp", oVar2.f193979ai.f194017E);
                C86470l.m149394a(hashMap, "mdl_tbs", oVar2.f193979ai.f194018F);
                C86470l.m149394a(hashMap, "mdl_lbs", oVar2.f193979ai.f194019G);
                C86470l.m149395a(hashMap, "mdl_response_cache", uVar.f194242a.f193979ai.f194030R);
                C86470l.m149395a(hashMap, "mdl_response_cinfo", uVar.f194242a.f193979ai.f194031S);
                C86470l.m149394a(hashMap, "a_cur_req_pos", oVar2.f193980aj.f194034a);
                C86470l.m149394a(hashMap, "a_cur_end_pos", oVar2.f193980aj.f194035b);
                C86470l.m149394a(hashMap, "a_cur_cache_pos", oVar2.f193980aj.f194036c);
                C86470l.m149393a((Map) hashMap, "a_cache_type", oVar2.f193980aj.f194037d);
                C86470l.m149395a(hashMap, "a_cur_ip", oVar2.f193980aj.f194038e);
                C86470l.m149395a(hashMap, "a_cur_host", oVar2.f193980aj.f194039f);
                C86470l.m149394a(hashMap, "a_reply_size", oVar2.f193980aj.f194041h);
                C86470l.m149394a(hashMap, "a_down_pos", oVar2.f193980aj.f194042i);
                C86470l.m149394a(hashMap, "a_player_wait_time", oVar2.f193980aj.f194043j);
                C86470l.m149393a((Map) hashMap, "a_player_wait_num", oVar2.f193980aj.f194044k);
                C86470l.m149393a((Map) hashMap, "a_mdl_stage", oVar2.f193980aj.f194045l);
                C86470l.m149393a((Map) hashMap, "a_mdl_ec", oVar2.f193980aj.f194046m);
                C86470l.m149393a((Map) hashMap, "a_mdl_speed", oVar2.f193980aj.f194047n);
                C86470l.m149395a(hashMap, "a_mdl_file_key", oVar2.f193980aj.f194048o);
                C86470l.m149393a((Map) hashMap, "a_mdl_is_socrf", oVar2.f193980aj.f194049p);
                C86470l.m149393a((Map) hashMap, "a_mdl_req_num", oVar2.f193980aj.f194029Q);
                C86470l.m149393a((Map) hashMap, "a_mdl_url_index", oVar2.f193980aj.f194050q);
                C86470l.m149395a(hashMap, "a_mdl_re_url", oVar2.f193980aj.f194051r);
                C86470l.m149393a((Map) hashMap, "a_mdl_cur_source", oVar2.f193980aj.f194052s);
                C86470l.m149395a(hashMap, "a_mdl_extra_info", oVar2.f193980aj.f194053t);
                C86470l.m149394a(hashMap, "a_mdl_fs", oVar2.f193980aj.f194016D);
                C86470l.m149393a((Map) hashMap, "a_mdl_p2p_sp", oVar2.f193980aj.f194017E);
                C86470l.m149394a(hashMap, "a_mdl_tbs", oVar2.f193980aj.f194018F);
                C86470l.m149394a(hashMap, "a_mdl_lbs", oVar2.f193980aj.f194019G);
                C86470l.m149395a(hashMap, "a_mdl_response_cache", uVar.f194242a.f193980aj.f194030R);
                C86470l.m149395a(hashMap, "a_mdl_response_cinfo", uVar.f194242a.f193980aj.f194031S);
            }
            C86470l.m149395a(hashMap, "event_type", bVar.f194264a);
            C86470l.m149394a(hashMap, "cost_time", bVar.f194265b);
            C86470l.m149395a(hashMap, "end_type", bVar.f194266c);
            C86470l.m149393a((Map) hashMap, "index", bVar.f194279p);
            long j3 = -1;
            if (uVar.f194247f > 0) {
                j = bVar.f194269f - uVar.f194247f;
            } else {
                j = -1;
            }
            C86470l.m149394a(hashMap, "first_frame_interval", j);
            if (bVar.f194271h > 0) {
                j2 = bVar.f194269f - bVar.f194271h;
            } else {
                j2 = -1;
            }
            C86470l.m149394a(hashMap, "last_seek_interval", j2);
            if (uVar.f194243b.containsKey(bVar.f194264a)) {
                long longValue = ((Long) uVar.f194243b.get(bVar.f194264a)).longValue();
                if (longValue > 0) {
                    j3 = bVar.f194269f - longValue;
                }
            }
            C86470l.m149394a(hashMap, "last_event_interval", j3);
            C86470l.m149393a((Map) hashMap, "last_switch_interval", -1);
            C86470l.m149393a((Map) hashMap, "video_pos", bVar.f194272i);
            C86470l.m149393a((Map) hashMap, "retry_count", bVar.f194273j);
            C86470l.m149393a((Map) hashMap, "reuse_socket", oVar2.f193965V);
            C86470l.m149394a(hashMap, "read_count_mdl", bVar.f194278o);
            C86470l.m149394a(hashMap, "audio_len_before", bVar.f194275l);
            C86470l.m149394a(hashMap, "video_len_before", bVar.f194274k);
            C86470l.m149394a(hashMap, "audio_len_after", bVar.f194277n);
            C86470l.m149394a(hashMap, "video_len_after", bVar.f194276m);
            C86470l.m149394a(hashMap, "vlen_dec_before", bVar.f194280q);
            C86470l.m149394a(hashMap, "vlen_base_before", bVar.f194284u);
            C86470l.m149394a(hashMap, "alen_dec_before", bVar.f194282s);
            C86470l.m149394a(hashMap, "alen_base_before", bVar.f194286w);
            C86470l.m149394a(hashMap, "vlen_dec_after", bVar.f194281r);
            C86470l.m149394a(hashMap, "vlen_base_after", bVar.f194285v);
            C86470l.m149394a(hashMap, "alen_dec_after", bVar.f194283t);
            C86470l.m149394a(hashMap, "alen_base_after", bVar.f194287x);
            C86470l.m149394a(hashMap, "av_gap", bVar.f194288y);
            C86470l.m149393a((Map) hashMap, "buffer_reason", bVar.f194268e);
            C86470l.m149394a(hashMap, "pst", bVar.f194267d);
            C86470l.m149394a(hashMap, "st", bVar.f194269f);
            C86470l.m149394a(hashMap, "et", bVar.f194270g);
            C86470l.m149395a(hashMap, "resolution_before", bVar.f194289z);
            C86470l.m149395a(hashMap, "resolution_after", bVar.f194257A);
            C86470l.m149393a((Map) hashMap, "bitrate_before", bVar.f194258B);
            C86470l.m149393a((Map) hashMap, "bitrate_after", bVar.f194259C);
            C86470l.m149393a((Map) hashMap, "is_abr", bVar.f194260D);
            C86470l.m149395a(hashMap, "quality_desc_before", bVar.f194261E);
            C86470l.m149395a(hashMap, "quality_desc_after", bVar.f194262F);
            C86641i.m150113b("VideoEventOneEvent", "OneEvent:" + hashMap.toString());
            final JSONObject jSONObject = new JSONObject(hashMap);
            Handler handler = this.f194250b;
            if (handler == null || handler.getLooper() == null) {
                EnumC86487t.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                MethodCollector.m26664o(5129);
                return;
            }
            this.f194250b.post(new Runnable() {
                /* class com.p2082ss.ttvideoengine.p4415h.C86489u.RunnableC86490a.RunnableC864911 */

                static {
                    Covode.recordClassIndex(101719);
                }

                public final void run() {
                    EnumC86487t.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                }
            });
            synchronized (this.f194249a.f194243b) {
                try {
                    this.f194249a.f194243b.remove(this.f194253e.f194264a);
                    this.f194249a.f194243b.put(this.f194253e.f194264a, Long.valueOf(this.f194253e.f194270g));
                } finally {
                    MethodCollector.m26664o(5129);
                }
            }
        }

        public RunnableC86490a(Context context, C86489u uVar, C86476o oVar, C86492b bVar) {
            this.f194249a = uVar;
            this.f194251c = oVar;
            this.f194252d = context;
            this.f194253e = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.u$b */
    public class C86492b {

        /* renamed from: A */
        public String f194257A;

        /* renamed from: B */
        public int f194258B;

        /* renamed from: C */
        public int f194259C;

        /* renamed from: D */
        public int f194260D;

        /* renamed from: E */
        public String f194261E;

        /* renamed from: F */
        public String f194262F;

        /* renamed from: a */
        public String f194264a;

        /* renamed from: b */
        public long f194265b;

        /* renamed from: c */
        public String f194266c;

        /* renamed from: d */
        public long f194267d;

        /* renamed from: e */
        public int f194268e;

        /* renamed from: f */
        public long f194269f;

        /* renamed from: g */
        public long f194270g;

        /* renamed from: h */
        public long f194271h;

        /* renamed from: i */
        public int f194272i;

        /* renamed from: j */
        public int f194273j;

        /* renamed from: k */
        public long f194274k;

        /* renamed from: l */
        public long f194275l;

        /* renamed from: m */
        public long f194276m;

        /* renamed from: n */
        public long f194277n;

        /* renamed from: o */
        public long f194278o;

        /* renamed from: p */
        public int f194279p;

        /* renamed from: q */
        public long f194280q;

        /* renamed from: r */
        public long f194281r;

        /* renamed from: s */
        public long f194282s;

        /* renamed from: t */
        public long f194283t;

        /* renamed from: u */
        public long f194284u;

        /* renamed from: v */
        public long f194285v;

        /* renamed from: w */
        public long f194286w;

        /* renamed from: x */
        public long f194287x;

        /* renamed from: y */
        public long f194288y;

        /* renamed from: z */
        public String f194289z;

        static {
            Covode.recordClassIndex(101720);
        }

        private C86492b() {
            this.f194264a = "";
            this.f194265b = -2147483648L;
            this.f194266c = "";
            this.f194267d = -2147483648L;
            this.f194268e = -1;
            this.f194269f = -2147483648L;
            this.f194270g = -2147483648L;
            this.f194271h = -2147483648L;
            this.f194272i = Integer.MIN_VALUE;
            this.f194274k = -1;
            this.f194275l = -1;
            this.f194289z = "";
            this.f194257A = "";
            this.f194258B = Integer.MIN_VALUE;
            this.f194259C = Integer.MIN_VALUE;
            this.f194260D = Integer.MIN_VALUE;
            this.f194261E = "";
            this.f194262F = "";
        }

        /* synthetic */ C86492b(C86489u uVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo137704a(String str) {
        if (this.f194244c.f194269f <= 0 || this.f194244c.f194264a.isEmpty()) {
            C86641i.m150113b("VideoEventOneEvent", "movieStallEnd without movieStalled, return.");
            this.f194244c.f194267d = -2147483648L;
            this.f194244c.f194268e = -1;
            return;
        }
        this.f194244c.f194270g = System.currentTimeMillis();
        C86641i.m150113b("VideoEventOneEvent", "movieStallEnd");
        C86492b bVar = this.f194244c;
        bVar.f194265b = bVar.f194270g - this.f194244c.f194269f;
        if (this.f194244c.f194265b > 0) {
            this.f194245d += this.f194244c.f194265b;
        }
        this.f194244c.f194266c = str;
        this.f194244c.f194271h = this.f194248g.mo137713b();
        if (this.f194244c.f194271h == 0) {
            C86492b bVar2 = this.f194244c;
            bVar2.f194271h = bVar2.f194269f;
        }
        C86476o oVar = this.f194242a;
        if (!(oVar == null || oVar.f193970a == null)) {
            this.f194244c.f194257A = this.f194242a.f193960Q;
            this.f194244c.f194259C = this.f194242a.f193961R;
            this.f194244c.f194262F = this.f194242a.f193976af;
            Map<String, Long> b = this.f194242a.f193970a.mo137291b();
            if (b != null) {
                this.f194244c.f194276m = b.get("vlen").longValue();
                this.f194244c.f194277n = b.get("alen").longValue();
                this.f194244c.f194281r = b.get("vDecLen").longValue();
                this.f194244c.f194285v = b.get("vBaseLen").longValue();
                this.f194244c.f194283t = b.get("aDecLen").longValue();
                this.f194244c.f194287x = b.get("aBaseLen").longValue();
                this.f194244c.f194288y = b.get("avGap").longValue();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("p", Integer.valueOf(this.f194244c.f194272i));
        hashMap.put("t", Long.valueOf(this.f194244c.f194270g));
        hashMap.put("c", Long.valueOf(this.f194244c.f194265b));
        this.f194246e.add(new JSONObject(hashMap).toString());
        this.f194242a.mo137684e();
        m149596d();
        m149595c();
        this.f194244c = new C86492b(this, (byte) 0);
    }

    C86489u(C86476o oVar, C86497x xVar) {
        this.f194242a = oVar;
        this.f194248g = xVar;
        this.f194243b = new HashMap();
        this.f194244c = new C86492b(this, (byte) 0);
    }
}
