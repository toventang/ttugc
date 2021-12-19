package com.p2082ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.api.EOYApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.live.C58589b;
import com.p2082ss.android.ugc.aweme.settings.C68740f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88956a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.k */
public final class C80135k {

    /* renamed from: a */
    public static final C80135k f179553a = new C80135k();

    /* renamed from: b */
    private static C88956a<JSONObject> f179554b;

    /* renamed from: c */
    private static long f179555c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.util.k$a */
    public static final class C80136a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ int f179556a;

        static {
            Covode.recordClassIndex(93380);
        }

        C80136a(int i) {
            this.f179556a = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.util.k$a$a */
        public static final class C80137a extends C27895a<ArrayList<Aweme>> {
            static {
                Covode.recordClassIndex(93381);
            }

            C80137a() {
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            Map map = (Map) obj;
            C89219l.m154721d(map, "");
            JSONObject jSONObject = new JSONObject(map);
            JSONArray optJSONArray = jSONObject.optJSONArray("aweme_list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                    if (!(optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("author")) == null)) {
                        optJSONObject2.remove("secret");
                        optJSONObject2.remove("need_recommend");
                        optJSONObject2.remove("watch_status");
                    }
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i);
                    if (!(optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("video")) == null)) {
                        optJSONObject.remove("is_long_video");
                    }
                }
                ArrayList arrayList = (ArrayList) C58589b.m107696a().mo46671a(optJSONArray.toString(), new C80137a().type);
                if (this.f179556a == 0) {
                    C80134j.f179551a.clear();
                }
                C89219l.m154716b(arrayList, "");
                for (T t : arrayList) {
                    C89219l.m154721d(t, "");
                    HashMap<String, Aweme> hashMap = C80134j.f179551a;
                    String aid = t.getAid();
                    C89219l.m154716b(aid, "");
                    hashMap.put(aid, t);
                }
                jSONObject.remove("aweme_list");
            }
            return jSONObject;
        }
    }

    private C80135k() {
    }

    static {
        Covode.recordClassIndex(93379);
    }

    /* renamed from: a */
    private static AbstractC88979t<JSONObject> m138900a(int i, int i2, String str, boolean z) {
        AbstractC88979t<R> b = EOYApi.C33530a.m68693a().discoverMore(i, i2, str, z).mo143292d(new C80136a(i2)).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    public static AbstractC88979t<JSONObject> m138901a(int i, int i2, String str, boolean z, boolean z2) {
        if (z2) {
            f179555c = 0;
        }
        if (i2 != 0) {
            return m138900a(i, i2, str, z);
        }
        if (f179554b == null || f179555c < System.currentTimeMillis()) {
            C88956a<JSONObject> aVar = new C88956a<>();
            f179554b = aVar;
            f179555c = System.currentTimeMillis() + (((long) C68740f.m121172a()) * 1000);
            m138900a(i, i2, str, z).mo143062b((AbstractC88986z<? super JSONObject>) aVar);
            C89219l.m154716b(aVar, "");
            return aVar;
        }
        C88956a<JSONObject> aVar2 = f179554b;
        if (aVar2 != null) {
            return aVar2;
        }
        C89219l.m154715b();
        return aVar2;
    }
}
