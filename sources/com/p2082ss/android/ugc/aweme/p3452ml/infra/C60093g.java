package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictRealConfig;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.g */
public final class C60093g {

    /* renamed from: c */
    public static final LinkedList<C60093g> f136920c = new LinkedList<>();

    /* renamed from: d */
    public static final C60094a f136921d = new C60094a((byte) 0);

    /* renamed from: a */
    public JSONObject f136922a;

    /* renamed from: b */
    public OnePlaytimePredictRealConfig f136923b;

    /* renamed from: e */
    private LinkedHashMap<String, Long> f136924e = new LinkedHashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.g$a */
    public static final class C60094a {
        static {
            Covode.recordClassIndex(70602);
        }

        private C60094a() {
        }

        public /* synthetic */ C60094a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(70601);
    }

    public C60093g(JSONObject jSONObject, OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(onePlaytimePredictRealConfig, "");
        this.f136922a = jSONObject;
        this.f136923b = onePlaytimePredictRealConfig;
    }

    /* renamed from: a */
    public final boolean mo97625a(Aweme aweme, long j) {
        String str;
        long j2;
        C89219l.m154721d(aweme, "");
        String aid = aweme.getAid();
        int i = 0;
        if (aid == null) {
            return false;
        }
        if (this.f136924e.containsKey(aid)) {
            Long l = this.f136924e.get(aid);
            if (l != null) {
                l.longValue();
            }
        } else {
            this.f136924e.put(aid, Long.valueOf(j));
        }
        int size = this.f136924e.size();
        if (size < this.f136923b.getCount() || size <= 0) {
            return false;
        }
        int type = this.f136923b.getType();
        if (type != 0) {
            long j3 = 0;
            if (type != 1) {
                if (type == 2) {
                    for (Long l2 : this.f136924e.values()) {
                        C89219l.m154716b(l2, "");
                        j3 += l2.longValue();
                    }
                    j3 /= (long) size;
                } else if (type != 3) {
                    if (type == 4) {
                        j2 = 1000000000;
                        for (Long l3 : this.f136924e.values()) {
                            if (l3.longValue() < j2) {
                                C89219l.m154716b(l3, "");
                                j2 = l3.longValue();
                            }
                        }
                    } else if (type == 5) {
                        Collection<Long> values = this.f136924e.values();
                        C89219l.m154716b(values, "");
                        List g = C89070n.m154585g((Collection) values);
                        C89070n.m154531c(g);
                        j2 = ((Number) g.get(size / 2)).longValue();
                    }
                    i = (int) j2;
                } else {
                    for (Long l4 : this.f136924e.values()) {
                        if (l4.longValue() > j3) {
                            C89219l.m154716b(l4, "");
                            j3 = l4.longValue();
                        }
                    }
                }
                i = (int) j3;
            } else {
                for (Long l5 : this.f136924e.values()) {
                    C89219l.m154716b(l5, "");
                    j3 += l5.longValue();
                }
                i = (int) j3;
            }
            JSONObject jSONObject = this.f136922a;
            if (i >= this.f136923b.getDuration()) {
                str = "gt";
            } else {
                str = "lt";
            }
            jSONObject.put("ss_result", str);
            this.f136922a.put("ff_result", Float.valueOf((float) i));
            return true;
        }
        JSONArray jSONArray = new JSONArray();
        for (Long l6 : this.f136924e.values()) {
            C89219l.m154716b(l6, "");
            jSONArray.put(l6.longValue());
        }
        this.f136922a.put("ss_result", jSONArray.toString());
        return true;
    }
}
