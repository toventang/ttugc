package com.p2082ss.android.ugc.playerkit.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.playerkit.model.v */
public final class C84224v {

    /* renamed from: U */
    public static final int f188239U = 20;

    /* renamed from: V */
    public static final int f188240V = 15;

    /* renamed from: W */
    public static final List<String> f188241W = C84231a.m144834a().redirectHosts();

    /* renamed from: X */
    public static final C84225a f188242X = new C84225a((byte) 0);

    /* renamed from: A */
    public int f188243A;

    /* renamed from: B */
    public String f188244B;

    /* renamed from: C */
    public int f188245C;

    /* renamed from: D */
    public int f188246D;

    /* renamed from: E */
    public String f188247E;

    /* renamed from: F */
    public String f188248F;

    /* renamed from: G */
    public String f188249G;

    /* renamed from: H */
    public String f188250H;

    /* renamed from: I */
    public String f188251I;

    /* renamed from: J */
    public String f188252J;

    /* renamed from: K */
    public String f188253K;

    /* renamed from: L */
    public String f188254L;

    /* renamed from: M */
    public long f188255M;

    /* renamed from: N */
    public long f188256N;

    /* renamed from: O */
    public Map<String, String> f188257O;

    /* renamed from: P */
    public int f188258P;

    /* renamed from: Q */
    public int f188259Q;

    /* renamed from: R */
    public int f188260R;

    /* renamed from: S */
    public long f188261S;

    /* renamed from: T */
    public int f188262T;

    /* renamed from: a */
    public int f188263a;

    /* renamed from: b */
    public String f188264b;

    /* renamed from: c */
    public String f188265c;

    /* renamed from: d */
    public String f188266d;

    /* renamed from: e */
    public int f188267e;

    /* renamed from: f */
    public Long f188268f;

    /* renamed from: g */
    public Long f188269g;

    /* renamed from: h */
    public Long f188270h;

    /* renamed from: i */
    public Long f188271i;

    /* renamed from: j */
    public Long f188272j;

    /* renamed from: k */
    public Integer f188273k;

    /* renamed from: l */
    public Integer f188274l;

    /* renamed from: m */
    public String f188275m;

    /* renamed from: n */
    public String f188276n;

    /* renamed from: o */
    public int f188277o;

    /* renamed from: p */
    public int f188278p;

    /* renamed from: q */
    public int f188279q;

    /* renamed from: r */
    public Long f188280r;

    /* renamed from: s */
    public Long f188281s;

    /* renamed from: t */
    public Long f188282t;

    /* renamed from: u */
    public Long f188283u;

    /* renamed from: v */
    public Long f188284v;

    /* renamed from: w */
    public Long f188285w;

    /* renamed from: x */
    public Long f188286x;

    /* renamed from: y */
    public Long f188287y;

    /* renamed from: z */
    public int f188288z;

    /* renamed from: com.ss.android.ugc.playerkit.model.v$a */
    public static final class C84225a {
        static {
            Covode.recordClassIndex(98132);
        }

        private C84225a() {
        }

        public /* synthetic */ C84225a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(98131);
    }

    public C84224v() {
        this.f188263a = 1;
        this.f188267e = -1;
        this.f188268f = -1L;
        this.f188269g = -1L;
        this.f188270h = -1L;
        this.f188271i = -1L;
        this.f188272j = -1L;
        this.f188273k = -1;
        this.f188274l = -1;
        this.f188277o = -1;
        this.f188278p = -1;
        this.f188279q = -100;
        this.f188280r = -1L;
        this.f188281s = -1L;
        this.f188282t = -1L;
        this.f188283u = -1L;
        this.f188284v = -1L;
        this.f188285w = -1L;
        this.f188286x = -1L;
        this.f188287y = -1L;
        this.f188288z = -1;
        this.f188243A = -1;
        this.f188245C = -1;
        this.f188246D = -1;
        this.f188259Q = -1;
    }

    /* renamed from: a */
    public final JSONObject mo129040a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ip", C84226w.m144820a(this.f188265c, f188240V));
            jSONObject.put("host", C84226w.m144820a(this.f188266d, f188239U));
            jSONObject.put("key", this.f188264b);
            jSONObject.put("is_https", this.f188267e);
            jSONObject.put("dl_size", this.f188268f);
            jSONObject.put("dl_offset", this.f188269g);
            jSONObject.put("fbb_time", this.f188270h);
            jSONObject.put("rsp_time", this.f188271i);
            jSONObject.put("file_len", this.f188272j);
            jSONObject.put("hit_code", this.f188273k);
            jSONObject.put("hit_code_l2", this.f188274l);
            jSONObject.put("cdn_hit_str", this.f188275m);
            jSONObject.put("http_code", this.f188277o);
            jSONObject.put("err_code", this.f188278p);
            jSONObject.put("err_stage", this.f188279q);
            jSONObject.put("req_st", this.f188280r);
            Long l = this.f188281s;
            if (!(l == null || l.longValue() == -1)) {
                Long l2 = this.f188281s;
                if (l2 == null) {
                    C89219l.m154707a();
                }
                jSONObject.put("dns_st", l2.longValue());
            }
            Long l3 = this.f188282t;
            if (!(l3 == null || l3.longValue() == -1)) {
                Long l4 = this.f188282t;
                if (l4 == null) {
                    C89219l.m154707a();
                }
                jSONObject.put("dns_et", l4.longValue());
            }
            Long l5 = this.f188283u;
            if (!(l5 == null || l5.longValue() == -1)) {
                Long l6 = this.f188283u;
                if (l6 == null) {
                    C89219l.m154707a();
                }
                jSONObject.put("tcp_st", l6.longValue());
            }
            Long l7 = this.f188284v;
            if (!(l7 == null || l7.longValue() == -1)) {
                Long l8 = this.f188284v;
                if (l8 == null) {
                    C89219l.m154707a();
                }
                jSONObject.put("tcp_et", l8.longValue());
            }
            Long l9 = this.f188285w;
            if (!(l9 == null || l9.longValue() == -1)) {
                Long l10 = this.f188285w;
                if (l10 == null) {
                    C89219l.m154707a();
                }
                jSONObject.put("tls_st", l10.longValue());
            }
            Long l11 = this.f188286x;
            if (!(l11 == null || l11.longValue() == -1)) {
                Long l12 = this.f188286x;
                if (l12 == null) {
                    C89219l.m154707a();
                }
                jSONObject.put("tls_et", l12.longValue());
            }
            jSONObject.put("cdn_hit", this.f188276n);
            jSONObject.put("tls_ver", this.f188244B);
            jSONObject.put("fb_t", this.f188287y);
            jSONObject.put("socket_reuse", this.f188288z);
            jSONObject.put("tls_resume", this.f188243A);
            jSONObject.put("url_idx", this.f188245C);
            jSONObject.put("task_type", this.f188246D);
            jSONObject.put("server_timing", this.f188247E);
            jSONObject.put("isRedirect", this.f188262T);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public final String toString() {
        return "RequestInfo(type=" + this.f188263a + ", key=" + this.f188264b + ", ip=" + this.f188265c + ", host=" + this.f188266d + ", is_https=" + this.f188267e + ", dl_size=" + this.f188268f + ", dl_offset=" + this.f188269g + ", fbb_time=" + this.f188270h + ", rsp_time=" + this.f188271i + ", file_len=" + this.f188272j + ", hit_code=" + this.f188273k + ", hit_code_l2=" + this.f188274l + ", cdn_hit_str=" + this.f188275m + ", cdn_hit=" + this.f188276n + ", http_code=" + this.f188277o + ", err_code=" + this.f188278p + ", err_stage=" + this.f188279q + ", req_st=" + this.f188280r + ", dns_st=" + this.f188281s + ", dns_et=" + this.f188282t + ", tcp_st=" + this.f188283u + ", tcp_et=" + this.f188284v + ", tls_st=" + this.f188285w + ", tls_et=" + this.f188286x + ", fb_t=" + this.f188287y + ", socket_reuse=" + this.f188288z + ", tls_resume=" + this.f188243A + ", tls_ver=" + this.f188244B + ", url_idx=" + this.f188245C + ", task_type=" + this.f188246D + ", server_timing=" + this.f188247E + ", dnsAddr=" + this.f188248F + ", hostName=" + this.f188249G + ", originUrl=" + this.f188250H + ", finalUrl=" + this.f188251I + ", localIp=" + this.f188252J + ", remoteIp=" + this.f188253K + ',' + " userAgent=" + this.f188254L + ", duration=" + this.f188255M + ", size=" + this.f188256N + ", headers=" + this.f188257O + ", statusCode=" + this.f188258P + ", urlIndex=" + this.f188259Q + ", urlCount=" + this.f188260R + ", ttfb=" + this.f188261S + ", isRedirect=" + this.f188262T + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C84224v(C84198b bVar) {
        this();
        int i;
        String str = "";
        C89219l.m154719c(bVar, str);
        int i2 = 0;
        if (bVar.f187953a == 1) {
            this.f188263a = 1;
            this.f188264b = bVar.f187960h;
            this.f188265c = bVar.f187966n;
            this.f188266d = bVar.f187938C;
            this.f188267e = bVar.f187962j;
            this.f188268f = Long.valueOf(bVar.f187955c);
            this.f188269g = Long.valueOf(bVar.f187942G);
            this.f188270h = Long.valueOf(bVar.f187961i - bVar.f187964l);
            this.f188271i = Long.valueOf(bVar.f187965m - bVar.f187964l);
            this.f188272j = Long.valueOf(bVar.f187954b);
            String str2 = bVar.f187978z;
            String str3 = bVar.f187936A;
            if (!TextUtils.isEmpty(str2)) {
                i = C84226w.m144819a(str2);
            } else if (!TextUtils.isEmpty(str3)) {
                i = C84226w.m144819a(str3);
            } else {
                i = 0;
            }
            this.f188273k = Integer.valueOf(i);
            String str4 = bVar.f187937B;
            this.f188274l = Integer.valueOf(TextUtils.isEmpty(str4) ? C84226w.m144819a(str4) : i2);
            String str5 = bVar.f187978z;
            String str6 = bVar.f187936A;
            if (!TextUtils.isEmpty(str5)) {
                if (str5 == null) {
                    C89219l.m154707a();
                }
                if (str5.length() >= 50) {
                    String substring = str5.substring(50);
                    C89219l.m154709a((Object) substring, str);
                    str = substring.toString();
                }
            } else if (!TextUtils.isEmpty(str6)) {
                if (str6 == null) {
                    C89219l.m154707a();
                }
                if (str6.length() >= 50) {
                    String substring2 = str6.substring(50);
                    C89219l.m154709a((Object) substring2, str);
                    str = substring2.toString();
                }
            }
            this.f188275m = str;
            this.f188276n = bVar.f187941F;
            this.f188244B = bVar.f187940E;
            this.f188277o = bVar.f187969q;
            this.f188278p = bVar.f187958f;
            this.f188279q = bVar.f187959g;
            this.f188280r = Long.valueOf(bVar.f187964l);
            this.f188281s = Long.valueOf(bVar.f187956d);
            this.f188282t = Long.valueOf(bVar.f187957e);
            this.f188283u = Long.valueOf(bVar.f187972t);
            this.f188284v = Long.valueOf(bVar.f187971s);
            this.f188285w = Long.valueOf(bVar.f187974v);
            this.f188286x = Long.valueOf(bVar.f187973u);
            this.f188287y = Long.valueOf(bVar.f187975w);
            this.f188288z = bVar.f187968p;
            this.f188243A = bVar.f187939D;
            this.f188245C = bVar.f187977y;
            this.f188246D = bVar.f187970r;
            this.f188247E = bVar.f187967o;
            this.f188262T = bVar.f187963k;
        } else if (bVar.f187953a == 2) {
            this.f188263a = 2;
            this.f188264b = bVar.f187960h;
            this.f188249G = bVar.f187938C;
            this.f188248F = bVar.f187943H;
            this.f188250H = bVar.f187944I;
            this.f188251I = bVar.f187945J;
            this.f188252J = bVar.f187946K;
            this.f188253K = bVar.f187966n;
            this.f188254L = bVar.f187947L;
            this.f188255M = bVar.f187948M;
            this.f188256N = bVar.f187949N;
            this.f188257O = bVar.f187950O;
            this.f188258P = bVar.f187969q;
            this.f188259Q = bVar.f187951P;
            this.f188260R = bVar.f187952Q;
            if (!TextUtils.equals(bVar.f187944I, bVar.f187945J)) {
                String str7 = bVar.f187944I;
                if (!TextUtils.isEmpty(str7)) {
                    for (String str8 : f188241W) {
                        if (str7 == null) {
                            C89219l.m154707a();
                        }
                        C89219l.m154709a((Object) str8, str);
                        if (C89361p.m154908a((CharSequence) str7, (CharSequence) str8, false)) {
                            this.f188262T = 1;
                            return;
                        }
                    }
                }
            }
        }
    }
}
