package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42178b;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42179c;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.z */
public final class C42995z {

    /* renamed from: a */
    public static final C42995z f100241a = new C42995z();

    /* renamed from: b */
    private static final AbstractC89244h f100242b = C89250i.m154774a(EnumC89331m.NONE, C42996a.f100245a);

    /* renamed from: c */
    private static final Set<String> f100243c = C89047am.m154439b("disable_hot_spot", "show_sort_and_filter", "use_profile_collection_tab", "use_profile_collection_tab_new_syle");

    /* renamed from: d */
    private static JSONObject f100244d;

    /* renamed from: b */
    private static Keva m85822b() {
        return (Keva) f100242b.getValue();
    }

    private C42995z() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.z$a */
    static final class C42996a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C42996a f100245a = new C42996a();

        static {
            Covode.recordClassIndex(51130);
        }

        C42996a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("repo_hybrid_abtests", 0);
        }
    }

    static {
        Covode.recordClassIndex(51129);
    }

    /* renamed from: c */
    private static Set<String> m85823c() {
        String[] strArr;
        String[] strArr2 = null;
        try {
            strArr = (String[]) SettingsManager.m29616a().mo25396a("hybrid_get_ab_test", String[].class);
            try {
                C42179c a = C42178b.m84431a();
                if (a != null) {
                    strArr2 = a.f98309b;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            strArr = null;
        }
        if (strArr != null) {
            C89070n.m154536a((Collection) f100243c, (Object[]) strArr);
        }
        if (strArr2 != null) {
            C89070n.m154536a((Collection) f100243c, (Object[]) strArr2);
        }
        return f100243c;
    }

    /* renamed from: a */
    public final synchronized JSONObject mo73180a() {
        MethodCollector.m26663i(6218);
        JSONObject jSONObject = f100244d;
        if (jSONObject != null) {
            MethodCollector.m26664o(6218);
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(m85822b().getString("hybrid_abtest", ""));
            MethodCollector.m26664o(6218);
            return jSONObject2;
        } catch (Exception e) {
            e.printStackTrace();
            JSONObject jSONObject3 = new JSONObject();
            MethodCollector.m26664o(6218);
            return jSONObject3;
        }
    }

    /* renamed from: a */
    public final synchronized void mo73181a(C28022o oVar) {
        String lVar;
        MethodCollector.m26663i(6070);
        C89219l.m154721d(oVar, "");
        JSONObject jSONObject = null;
        AbstractC28019l c = oVar.mo46803c("data");
        if (!(c == null || (lVar = c.toString()) == null)) {
            jSONObject = new JSONObject(lVar);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            for (String str : m85823c()) {
                Object opt = jSONObject.opt(str);
                if (opt != null) {
                    jSONObject2.put(str, opt);
                }
            }
        }
        f100244d = jSONObject2;
        m85822b().storeString("hybrid_abtest", jSONObject2.toString());
        MethodCollector.m26664o(6070);
    }

    /* renamed from: a */
    public final void mo73182a(JSONObject jSONObject, AbstractC89172b<? super String, C89391z> bVar, AbstractC89172b<? super Exception, C89391z> bVar2) {
        JSONArray jSONArray;
        Object opt;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.optJSONArray("ab_test_names");
            } catch (Exception e) {
                bVar2.invoke(e);
                e.printStackTrace();
                return;
            }
        } else {
            jSONArray = null;
        }
        JSONObject a = mo73180a();
        if (jSONArray == null) {
            String jSONObject2 = a.toString();
            C89219l.m154716b(jSONObject2, "");
            bVar.invoke(jSONObject2);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = jSONArray.optString(i);
            if (!(optString == null || (opt = a.opt(optString)) == null)) {
                jSONObject3.put(optString, opt);
            }
        }
        String jSONObject4 = jSONObject3.toString();
        C89219l.m154716b(jSONObject4, "");
        bVar.invoke(jSONObject4);
    }
}
