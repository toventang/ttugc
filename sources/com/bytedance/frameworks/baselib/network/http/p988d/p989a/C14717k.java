package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14678b;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14694d;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.C90055h;
import okhttp3.C90198s;
import okhttp3.EnumC90035af;
import okhttp3.EnumC90211z;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.k */
public final class C14717k {

    /* renamed from: A */
    long f35792A = 0;

    /* renamed from: B */
    EnumC90211z f35793B = null;

    /* renamed from: C */
    boolean f35794C = false;

    /* renamed from: D */
    boolean f35795D = false;

    /* renamed from: E */
    String f35796E = "";

    /* renamed from: F */
    Socket f35797F;

    /* renamed from: G */
    C90198s f35798G;

    /* renamed from: H */
    String f35799H = "";

    /* renamed from: I */
    int f35800I = 0;

    /* renamed from: J */
    List<C14720m> f35801J = new ArrayList();

    /* renamed from: K */
    EnumC14707d f35802K = EnumC14707d.IDLE;

    /* renamed from: L */
    String f35803L = "";

    /* renamed from: M */
    int f35804M = -1;

    /* renamed from: N */
    EnumC14727p f35805N = EnumC14727p.UNKNOWN;

    /* renamed from: O */
    String f35806O = "";

    /* renamed from: P */
    boolean f35807P = false;

    /* renamed from: Q */
    boolean f35808Q = false;

    /* renamed from: R */
    List<C14694d> f35809R;

    /* renamed from: S */
    int f35810S = 0;

    /* renamed from: T */
    C14678b.EnumC14679a f35811T = C14678b.EnumC14679a.UNKNOWN;

    /* renamed from: U */
    CopyOnWriteArrayList<String> f35812U = new CopyOnWriteArrayList<>();

    /* renamed from: V */
    String f35813V = "";

    /* renamed from: a */
    long f35814a = -1;

    /* renamed from: b */
    long f35815b = -1;

    /* renamed from: c */
    long f35816c = -1;

    /* renamed from: d */
    long f35817d = -1;

    /* renamed from: e */
    long f35818e = -1;

    /* renamed from: f */
    long f35819f = -1;

    /* renamed from: g */
    long f35820g = -1;

    /* renamed from: h */
    long f35821h = -1;

    /* renamed from: i */
    long f35822i = -1;

    /* renamed from: j */
    long f35823j = -1;

    /* renamed from: k */
    long f35824k = -1;

    /* renamed from: l */
    long f35825l = -1;

    /* renamed from: m */
    long f35826m = -1;

    /* renamed from: n */
    long f35827n = -1;

    /* renamed from: o */
    long f35828o = -1;

    /* renamed from: p */
    long f35829p = -1;

    /* renamed from: q */
    long f35830q = -1;

    /* renamed from: r */
    long f35831r = -1;

    /* renamed from: s */
    List<Pair<InetSocketAddress, Integer>> f35832s = new ArrayList();

    /* renamed from: t */
    Proxy.Type f35833t = Proxy.Type.DIRECT;

    /* renamed from: u */
    EnumC14706c f35834u = EnumC14706c.HANDSHAKE_UNKNOWN;

    /* renamed from: v */
    EnumC90035af f35835v;

    /* renamed from: w */
    C90055h f35836w;

    /* renamed from: x */
    long f35837x = 0;

    /* renamed from: y */
    C90198s f35838y;

    /* renamed from: z */
    int f35839z = -1;

    static {
        Covode.recordClassIndex(16814);
    }

    /* renamed from: a */
    private static long m26944a(long j, long j2) {
        if (j2 == -1 || j == -1) {
            return -1;
        }
        return j - j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.k$1 */
    public static /* synthetic */ class C147181 {

        /* renamed from: a */
        static final /* synthetic */ int[] f35840a;

        /* renamed from: b */
        static final /* synthetic */ int[] f35841b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        static {
            /*
            // Method dump skipped, instructions count: 147
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14717k.C147181.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static long m26945a(String str) {
        String[] split = str.split("=");
        if (split.length != 2) {
            return -1;
        }
        try {
            long parseLong = Long.parseLong(split[1]);
            if (parseLong < 0) {
                return -1;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0342 A[LOOP:3: B:101:0x033c->B:103:0x0342, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x04a3 A[LOOP:5: B:132:0x049d->B:134:0x04a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04df A[PHI: r3 r4 
      PHI: (r3v9 com.bytedance.frameworks.baselib.network.http.d.a.q) = (r3v6 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v10 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v11 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v6 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v6 com.bytedance.frameworks.baselib.network.http.d.a.q), (r3v6 com.bytedance.frameworks.baselib.network.http.d.a.q) binds: [B:136:0x04c9, B:141:0x04db, B:140:0x04d6, B:139:0x04d3, B:138:0x04d0, B:137:0x04cd] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v11 com.bytedance.frameworks.baselib.network.http.d.a.r) = (r4v8 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v12 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v13 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v14 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v15 com.bytedance.frameworks.baselib.network.http.d.a.r), (r4v16 com.bytedance.frameworks.baselib.network.http.d.a.r) binds: [B:136:0x04c9, B:141:0x04db, B:140:0x04d6, B:139:0x04d3, B:138:0x04d0, B:137:0x04cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0328  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m26946a(android.content.Context r18) {
        /*
        // Method dump skipped, instructions count: 1350
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14717k.m26946a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public final void mo23718a(C14612a aVar, Context context) {
        boolean z;
        aVar.f35358a = this.f35796E;
        aVar.f35367j = m26944a(this.f35816c, this.f35815b);
        aVar.f35368k = m26944a(this.f35819f, this.f35817d);
        aVar.f35369l = m26944a(this.f35820g, this.f35819f);
        aVar.f35370m = m26944a(this.f35822i, this.f35821h) + m26944a(this.f35824k, this.f35823j);
        aVar.f35371n = -1;
        aVar.f35372o = m26944a(this.f35826m, this.f35822i);
        if (this.f35817d != -1 || this.f35830q == -1) {
            z = false;
        } else {
            z = true;
        }
        aVar.f35373p = z;
        aVar.f35374q = -1;
        aVar.f35375r = m26944a(this.f35829p, this.f35814a);
        aVar.f35376s = this.f35837x;
        aVar.f35377t = this.f35792A;
        aVar.f35382y = m26946a(context);
        aVar.f35378u = -1;
        C90198s sVar = this.f35838y;
        if (sVar != null) {
            aVar.f35348B = sVar.toString();
            aVar.f35376s += this.f35838y.mo145030b();
        }
        C90198s sVar2 = this.f35798G;
        if (sVar2 != null) {
            aVar.f35349C = sVar2.toString();
            aVar.f35377t += this.f35798G.mo145030b();
        }
        aVar.f35357K = this.f35799H;
        aVar.f35351E = -1;
        aVar.f35350D = -1;
        aVar.f35352F = -1;
    }

    /* renamed from: a */
    private static void m26947a(String str, JSONObject jSONObject, long j) {
        String[] split;
        HashMap hashMap = new HashMap();
        C14721n nVar = new C14721n();
        if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null) {
            for (String str2 : split) {
                String[] split2 = str2.split(";");
                if (split2 != null && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String trim = ((String) entry.getKey()).trim();
            String trim2 = ((String) entry.getValue()).trim();
            if (trim.equalsIgnoreCase("cdn-cache")) {
                nVar.f35846a = true;
                String[] split3 = trim2.split("=");
                if (split3.length != 2 || !split3[1].equalsIgnoreCase("hit")) {
                    nVar.f35847b = false;
                } else {
                    nVar.f35847b = true;
                }
            } else if (trim.equalsIgnoreCase("edge")) {
                nVar.f35848c = m26945a(trim2);
            } else if (trim.equalsIgnoreCase("origin")) {
                nVar.f35849d = m26945a(trim2);
            } else if (trim.equalsIgnoreCase("inner")) {
                nVar.f35850e = m26945a(trim2);
            } else if (!TextUtils.isEmpty(trim)) {
                jSONObject.put(trim, m26945a(trim2));
            }
        }
        if (nVar.f35846a && nVar.f35847b) {
            jSONObject.put("edge", nVar.f35848c);
            jSONObject.put("cdn-cache", "hit");
            if (j != -1 && j > nVar.f35848c) {
                nVar.f35851f = j - nVar.f35848c;
            }
            jSONObject.put("rtt", nVar.f35851f);
        } else if (nVar.f35846a) {
            jSONObject.put("edge", nVar.f35848c);
            jSONObject.put("cdn-cache", "miss");
            if (nVar.f35849d > nVar.f35850e) {
                jSONObject.put("origin", nVar.f35849d - nVar.f35850e);
            } else {
                jSONObject.put("origin", -1);
            }
            jSONObject.put("inner", nVar.f35850e);
            if (j != -1 && j > nVar.f35849d + nVar.f35848c) {
                nVar.f35851f = (j - nVar.f35849d) - nVar.f35848c;
            }
            jSONObject.put("rtt", nVar.f35851f);
        } else {
            jSONObject.put("inner", nVar.f35850e);
            if (j != -1 && j > nVar.f35850e) {
                nVar.f35851f = j - nVar.f35850e;
            }
            jSONObject.put("rtt", nVar.f35851f);
        }
    }
}
