package com.p2082ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.es */
public final class C80403es {

    /* renamed from: e */
    public static final ArrayMap<Object, C80403es> f179959e = new ArrayMap<>();

    /* renamed from: f */
    public static final C80404a f179960f = new C80404a((byte) 0);

    /* renamed from: a */
    int f179961a;

    /* renamed from: b */
    String f179962b;

    /* renamed from: c */
    JSONObject f179963c;

    /* renamed from: d */
    public final Object f179964d;

    /* renamed from: g */
    private final AbstractC89244h f179965g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final LinkedHashMap<Uri, C80405b> mo123719a() {
        return (LinkedHashMap) this.f179965g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.es$a */
    public static final class C80404a {
        static {
            Covode.recordClassIndex(93672);
        }

        private C80404a() {
        }

        public /* synthetic */ C80404a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C80403es m139387a(Object obj) {
            C89219l.m154721d(obj, "");
            if (C80403es.f179959e.containsKey(obj)) {
                C80403es esVar = C80403es.f179959e.get(obj);
                if (esVar == null) {
                    C89219l.m154715b();
                }
                return esVar;
            }
            C80403es esVar2 = new C80403es(obj, (byte) 0);
            C80403es.f179959e.put(obj, esVar2);
            return esVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.es$d */
    static final class C80407d extends AbstractC89220m implements AbstractC89171a<LinkedHashMap<Uri, C80405b>> {

        /* renamed from: a */
        public static final C80407d f179969a = new C80407d();

        static {
            Covode.recordClassIndex(93675);
        }

        C80407d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkedHashMap<Uri, C80405b> invoke() {
            return new LinkedHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo123724d() {
        mo123719a().clear();
        this.f179962b = "";
        this.f179963c = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.es$b */
    public static final class C80405b {

        /* renamed from: a */
        public final long f179966a;

        /* renamed from: b */
        public final long f179967b;

        static {
            Covode.recordClassIndex(93673);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C80405b)) {
                return false;
            }
            C80405b bVar = (C80405b) obj;
            return this.f179966a == bVar.f179966a && this.f179967b == bVar.f179967b;
        }

        public final String toString() {
            return "CostInfo(startTime=" + this.f179966a + ", endTime=" + this.f179967b + ")";
        }

        public final int hashCode() {
            long j = this.f179966a;
            long j2 = this.f179967b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public C80405b(long j, long j2) {
            this.f179966a = j;
            this.f179967b = j2;
        }
    }

    static {
        Covode.recordClassIndex(93671);
    }

    /* renamed from: c */
    public final void mo123723c() {
        if (this.f179961a != 0) {
            new Handler().postDelayed(new RunnableC80406c(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    /* renamed from: b */
    public final void mo123722b() {
        mo123719a();
        mo123724d();
        new StringBuilder().append(this).append(" and ").append(this.f179964d).append(" startRecordOnce");
        this.f179961a = 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.es$c */
    static final class RunnableC80406c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C80403es f179968a;

        static {
            Covode.recordClassIndex(93674);
        }

        RunnableC80406c(C80403es esVar) {
            this.f179968a = esVar;
        }

        public final void run() {
            String a;
            C80403es esVar = this.f179968a;
            if (esVar.f179963c != null) {
                if (esVar.mo123719a().isEmpty()) {
                    String str = esVar.f179962b;
                    JSONObject jSONObject = esVar.f179963c;
                    if (jSONObject == null) {
                        C89219l.m154715b();
                    }
                    C80403es.m139380b(str, jSONObject);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder();
                    String str2 = "";
                    int i = 0;
                    long j = 0;
                    for (Map.Entry<Uri, C80405b> entry : esVar.mo123719a().entrySet()) {
                        String queryParameter = entry.getKey().getQueryParameter("bundle");
                        if (TextUtils.isEmpty(queryParameter)) {
                            a = "unknow";
                        } else {
                            if (queryParameter == null) {
                                C89219l.m154715b();
                            }
                            a = C89361p.m154868a(queryParameter, "/template.js", "");
                        }
                        if (sb.length() == 0) {
                            sb.append(a);
                        } else {
                            sb.append(",".concat(String.valueOf(a)));
                        }
                        C80405b value = entry.getValue();
                        long j2 = value.f179967b - value.f179966a;
                        if (j2 <= 0) {
                            j2 = 0;
                        }
                        if (j2 > ((long) i)) {
                            i = (int) j2;
                            str2 = a;
                        }
                        long j3 = value.f179966a;
                        if (j3 < currentTimeMillis) {
                            currentTimeMillis = j3;
                        }
                        long j4 = value.f179967b;
                        if (j4 > j) {
                            j = j4;
                        }
                    }
                    JSONObject jSONObject2 = esVar.f179963c;
                    if (jSONObject2 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject2.put("lynx_longest_cost", i);
                    JSONObject jSONObject3 = esVar.f179963c;
                    if (jSONObject3 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject3.put("lynx_type_cost_longest", str2);
                    JSONObject jSONObject4 = esVar.f179963c;
                    if (jSONObject4 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject4.put("lynx_cards_type", sb.toString());
                    JSONObject jSONObject5 = esVar.f179963c;
                    if (jSONObject5 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject5.put("lynx_cards_count", esVar.mo123719a().size());
                    long j5 = j - currentTimeMillis;
                    if (j5 > 0) {
                        JSONObject jSONObject6 = esVar.f179963c;
                        if (jSONObject6 == null) {
                            C89219l.m154715b();
                        }
                        jSONObject6.put("lynx_all_draw_cost", j5);
                    }
                    new StringBuilder("lynxLongestCost:").append(i).append("\nlynxTypeLongest:").append(str2).append("\nlynxCardsType:").append((Object) sb).append("\nlynxCardsCount:").append(esVar.mo123719a().size()).append('\n').append("lynxAllDrawCost:").append(j5);
                    String str3 = esVar.f179962b;
                    JSONObject jSONObject7 = esVar.f179963c;
                    if (jSONObject7 == null) {
                        C89219l.m154715b();
                    }
                    C80403es.m139380b(str3, jSONObject7);
                }
            }
            C80403es esVar2 = this.f179968a;
            esVar2.mo123724d();
            esVar2.f179961a = 0;
            C80403es.f179959e.remove(esVar2.f179964d);
        }
    }

    private C80403es(Object obj) {
        this.f179964d = obj;
        this.f179962b = "";
        this.f179965g = C89250i.m154773a((AbstractC89171a) C80407d.f179969a);
    }

    public /* synthetic */ C80403es(Object obj, byte b) {
        this(obj);
    }

    /* renamed from: b */
    static void m139380b(String str, JSONObject jSONObject) {
        C29819a.m60077a(str, jSONObject);
        C34611o.m70668a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo123721a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (this.f179961a != 0) {
            new StringBuilder().append(this).append(" and ").append(this.f179964d).append(" setLogData ").append(str);
            this.f179962b = str;
            this.f179963c = jSONObject;
        }
    }

    /* renamed from: a */
    public final void mo123720a(Uri uri, C80405b bVar) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(bVar, "");
        if (this.f179961a != 0) {
            new StringBuilder().append(this).append(" and ").append(this.f179964d).append(" appendLoadUrlTime ").append(uri).append(" and time").append(bVar);
            if (mo123719a().containsKey(uri)) {
                String uri2 = uri.toString();
                C89219l.m154716b(uri2, "");
                Uri parse = Uri.parse(uri2 + uri.hashCode());
                LinkedHashMap<Uri, C80405b> a = mo123719a();
                C89219l.m154716b(parse, "");
                a.put(parse, bVar);
                return;
            }
            mo123719a().put(uri, bVar);
        }
    }
}
