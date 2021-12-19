package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15423u;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.y */
public final class C86501y {

    /* renamed from: a */
    public C86476o f194345a;

    /* renamed from: b */
    public C86504b f194346b;

    /* renamed from: c */
    public ArrayList<String> f194347c = new ArrayList<>();

    /* renamed from: d */
    public int f194348d = 0;

    /* renamed from: e */
    public int f194349e = 0;

    /* renamed from: f */
    public long f194350f = -2147483648L;

    /* renamed from: g */
    public long f194351g = -2147483648L;

    static {
        Covode.recordClassIndex(101729);
    }

    /* renamed from: c */
    private void m149610c() {
        C86641i.m150110a("VideoEventOneOutSync", "report oussync event");
        this.f194345a.mo137679a();
        C86631b.m150044a(new RunnableC86502a(this.f194345a.f193973ac, this, this.f194345a, this.f194346b));
    }

    /* renamed from: a */
    public final void mo137716a() {
        this.f194347c = new ArrayList<>();
        this.f194348d = 0;
        this.f194349e = 0;
        this.f194350f = -2147483648L;
        this.f194351g = -2147483648L;
    }

    /* renamed from: b */
    private void m149609b() {
        C86476o oVar = this.f194345a;
        if (oVar != null && oVar.f193970a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("begin_pos", Integer.valueOf(this.f194346b.f194388r));
            hashMap.put("end_pos", Integer.valueOf(this.f194346b.f194389s));
            hashMap.put("render_drop_cnt", Integer.valueOf(this.f194346b.f194374d));
            hashMap.put("container_fps", Float.valueOf(this.f194345a.f193970a.mo137294d(82)));
            hashMap.put("video_out_fps", Float.valueOf(this.f194345a.f193970a.mo137294d(83)));
            hashMap.put("clock_diff", Long.valueOf(this.f194345a.f193970a.mo137290b(45)));
            int c = this.f194345a.f193970a.mo137292c(84);
            long j = 0;
            if (c > 0) {
                j = (long) (1000 / c);
            }
            hashMap.put("decode_time", Long.valueOf(j));
            this.f194345a.f193970a.mo137289a(4, hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.y$a */
    public static class RunnableC86502a implements Runnable {

        /* renamed from: a */
        private C86501y f194352a;

        /* renamed from: b */
        private Handler f194353b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private C86476o f194354c;

        /* renamed from: d */
        private Context f194355d;

        /* renamed from: e */
        private C86504b f194356e;

        static {
            Covode.recordClassIndex(101730);
        }

        public final void run() {
            final boolean z;
            long j;
            if (this.f194352a != null) {
                C86476o oVar = this.f194354c;
                if (oVar == null || !oVar.f193989as) {
                    z = false;
                } else {
                    z = true;
                }
                C86501y yVar = this.f194352a;
                C86504b bVar = this.f194356e;
                C86476o oVar2 = this.f194354c;
                HashMap hashMap = new HashMap();
                if (oVar2 != null) {
                    C86470l.m149395a(hashMap, "player_sessionid", yVar.f194345a.f194003r);
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
                }
                C86470l.m149395a(hashMap, "event_type", "av_outsync");
                C86470l.m149394a(hashMap, "st", bVar.f194371a);
                C86470l.m149394a(hashMap, "et", bVar.f194372b);
                C86470l.m149394a(hashMap, "cost_time", bVar.f194390t);
                C86470l.m149395a(hashMap, "end_type", bVar.f194391u);
                C86470l.m149394a(hashMap, "audio_len_before", bVar.f194375e);
                C86470l.m149394a(hashMap, "video_len_before", bVar.f194376f);
                C86470l.m149394a(hashMap, "alen_dec_before", bVar.f194377g);
                C86470l.m149394a(hashMap, "vlen_dec_before", bVar.f194378h);
                C86470l.m149394a(hashMap, "alen_base_before", bVar.f194379i);
                C86470l.m149394a(hashMap, "vlen_base_before", bVar.f194380j);
                C86470l.m149395a(hashMap, "resolution_before", bVar.f194381k);
                C86470l.m149395a(hashMap, "resolution_after", bVar.f194382l);
                C86470l.m149393a((Map) hashMap, "bitrate_before", bVar.f194383m);
                C86470l.m149393a((Map) hashMap, "bitrate_after", bVar.f194384n);
                C86470l.m149393a((Map) hashMap, "index", yVar.f194349e);
                C86470l.m149393a((Map) hashMap, "radio_mode", bVar.f194395y);
                C86470l.m149394a(hashMap, "last_av_switch_interval", bVar.f194396z);
                C86470l.m149394a(hashMap, "last_res_switch_interval", bVar.f194360A);
                C86470l.m149393a((Map) hashMap, "headset", bVar.f194361B);
                C86470l.m149393a((Map) hashMap, "bt", bVar.f194362C);
                C86470l.m149394a(hashMap, "last_headset_switch_interval", bVar.f194363D);
                C86470l.m149393a((Map) hashMap, "power", bVar.f194364E);
                C86470l.m149393a((Map) hashMap, "is_charging", bVar.f194365F);
                C86470l.m149394a(hashMap, "max_av_diff", bVar.f194366G);
                C86470l.m149393a((Map) hashMap, "is_background", bVar.f194367H);
                C86470l.m149394a(hashMap, "last_foreback_switch_interval", bVar.f194368I);
                long j2 = -1;
                if (yVar.f194350f > 0) {
                    j = bVar.f194371a - yVar.f194350f;
                } else {
                    j = -1;
                }
                C86470l.m149394a(hashMap, "first_frame_interval", j);
                if (yVar.f194351g > 0) {
                    j2 = bVar.f194371a - yVar.f194351g;
                }
                C86470l.m149394a(hashMap, "last_event_interval", j2);
                C86470l.m149395a(hashMap, "pts_list", bVar.f194373c);
                C86470l.m149393a((Map) hashMap, "begin_pos", bVar.f194388r);
                C86470l.m149393a((Map) hashMap, "end_pos", bVar.f194389s);
                C86470l.m149393a((Map) hashMap, "drop_cnt", bVar.f194374d);
                C86470l.m149395a(hashMap, "v_dec_fps_list", bVar.f194385o);
                if (bVar.f194386p > 0) {
                    C86470l.m149394a(hashMap, "last_rebuf_interval", bVar.f194371a - bVar.f194386p);
                }
                if (bVar.f194387q > 0) {
                    C86470l.m149394a(hashMap, "last_seek_interval", bVar.f194371a - bVar.f194387q);
                }
                C86470l.m149393a((Map) hashMap, "is_abr", bVar.f194392v);
                C86470l.m149395a(hashMap, "quality_desc_before", bVar.f194393w);
                C86470l.m149395a(hashMap, "quality_desc_after", bVar.f194394x);
                C86470l.m149396a(hashMap, "pause_time_list", bVar.f194369J);
                final JSONObject jSONObject = new JSONObject(hashMap);
                Handler handler = this.f194353b;
                if (handler == null || handler.getLooper() == null) {
                    EnumC86487t.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                    return;
                }
                this.f194353b.post(new Runnable() {
                    /* class com.p2082ss.ttvideoengine.p4415h.C86501y.RunnableC86502a.RunnableC865031 */

                    static {
                        Covode.recordClassIndex(101731);
                    }

                    public final void run() {
                        EnumC86487t.instance.addEventV2(z, jSONObject, "videoplayer_oneevent");
                    }
                });
                this.f194352a.f194351g = this.f194356e.f194372b;
            }
        }

        public RunnableC86502a(Context context, C86501y yVar, C86476o oVar, C86504b bVar) {
            this.f194352a = yVar;
            this.f194354c = oVar;
            this.f194355d = context;
            this.f194356e = bVar;
        }
    }

    public C86501y(C86476o oVar) {
        this.f194345a = oVar;
        this.f194346b = new C86504b(this, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.h.y$b */
    public class C86504b {

        /* renamed from: A */
        public long f194360A;

        /* renamed from: B */
        public int f194361B;

        /* renamed from: C */
        public int f194362C;

        /* renamed from: D */
        public long f194363D;

        /* renamed from: E */
        public int f194364E;

        /* renamed from: F */
        public int f194365F;

        /* renamed from: G */
        public long f194366G;

        /* renamed from: H */
        public int f194367H;

        /* renamed from: I */
        public long f194368I;

        /* renamed from: J */
        public ArrayList<Long> f194369J;

        /* renamed from: a */
        public long f194371a;

        /* renamed from: b */
        public long f194372b;

        /* renamed from: c */
        public String f194373c;

        /* renamed from: d */
        public int f194374d;

        /* renamed from: e */
        public long f194375e;

        /* renamed from: f */
        public long f194376f;

        /* renamed from: g */
        public long f194377g;

        /* renamed from: h */
        public long f194378h;

        /* renamed from: i */
        public long f194379i;

        /* renamed from: j */
        public long f194380j;

        /* renamed from: k */
        public String f194381k;

        /* renamed from: l */
        public String f194382l;

        /* renamed from: m */
        public int f194383m;

        /* renamed from: n */
        public int f194384n;

        /* renamed from: o */
        public String f194385o;

        /* renamed from: p */
        public long f194386p;

        /* renamed from: q */
        public long f194387q;

        /* renamed from: r */
        public int f194388r;

        /* renamed from: s */
        public int f194389s;

        /* renamed from: t */
        public long f194390t;

        /* renamed from: u */
        public String f194391u;

        /* renamed from: v */
        public int f194392v;

        /* renamed from: w */
        public String f194393w;

        /* renamed from: x */
        public String f194394x;

        /* renamed from: y */
        public int f194395y;

        /* renamed from: z */
        public long f194396z;

        static {
            Covode.recordClassIndex(101732);
        }

        private C86504b() {
            this.f194371a = -2147483648L;
            this.f194372b = -2147483648L;
            this.f194374d = Integer.MIN_VALUE;
            this.f194375e = -2147483648L;
            this.f194376f = -2147483648L;
            this.f194377g = -2147483648L;
            this.f194378h = -2147483648L;
            this.f194379i = -2147483648L;
            this.f194380j = -2147483648L;
            this.f194383m = Integer.MIN_VALUE;
            this.f194384n = Integer.MIN_VALUE;
            this.f194386p = -2147483648L;
            this.f194387q = -2147483648L;
            this.f194388r = Integer.MIN_VALUE;
            this.f194389s = Integer.MIN_VALUE;
            this.f194390t = -2147483648L;
            this.f194392v = Integer.MIN_VALUE;
            this.f194393w = "";
            this.f194394x = "";
            this.f194395y = Integer.MIN_VALUE;
            this.f194396z = -2147483648L;
            this.f194360A = -2147483648L;
            this.f194361B = Integer.MIN_VALUE;
            this.f194362C = Integer.MIN_VALUE;
            this.f194363D = -2147483648L;
            this.f194364E = Integer.MIN_VALUE;
            this.f194365F = Integer.MIN_VALUE;
            this.f194366G = -2147483648L;
            this.f194367H = Integer.MIN_VALUE;
            this.f194368I = -2147483648L;
            this.f194369J = new ArrayList<>();
        }

        /* synthetic */ C86504b(C86501y yVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo137717a(int i, String str) {
        if (this.f194346b.f194371a <= 0) {
            C86641i.m150115c("VideoEventOneOutSync", "Invalid start time, return." + this.f194346b.f194371a);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f194346b.f194371a;
        if (j <= 200) {
            m149609b();
            this.f194346b = new C86504b(this, (byte) 0);
            return;
        }
        this.f194346b.f194391u = str;
        this.f194346b.f194389s = i;
        this.f194346b.f194372b = currentTimeMillis;
        this.f194346b.f194390t = j;
        this.f194349e++;
        this.f194348d++;
        C86476o oVar = this.f194345a;
        if (oVar != null) {
            this.f194346b.f194382l = oVar.f193960Q;
            this.f194346b.f194384n = this.f194345a.f193961R;
            this.f194346b.f194394x = this.f194345a.f193976af;
            if (this.f194345a.f193970a != null) {
                this.f194346b.f194374d = this.f194345a.f193970a.mo137292c(79);
                this.f194346b.f194373c = this.f194345a.f193970a.mo137287a(78);
                this.f194346b.f194385o = this.f194345a.f193970a.mo137287a(80);
                this.f194346b.f194366G = this.f194345a.f193970a.mo137290b(96);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(C15423u.f37651a, Integer.valueOf(this.f194346b.f194388r));
        hashMap.put("pe", Integer.valueOf(this.f194346b.f194389s));
        hashMap.put("st", Long.valueOf(this.f194346b.f194371a));
        hashMap.put("c", Long.valueOf(this.f194346b.f194390t));
        this.f194347c.add(new JSONObject(hashMap).toString());
        this.f194345a.mo137684e();
        m149610c();
        m149609b();
        this.f194346b = new C86504b(this, (byte) 0);
    }
}
