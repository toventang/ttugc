package com.p2082ss.android.ugc.aweme.p2917f.p2918a;

import android.os.Handler;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.nativecrash.C13964g;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.agilelogger.C29699a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p4171u.C79488a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.f.a.a */
public final class C47174a {

    /* renamed from: a */
    public static final C47174a f109801a = new C47174a();

    /* renamed from: b */
    private static ArrayList<String> f109802b;

    /* renamed from: c */
    private static HashMap<String, ArrayList<C47177b>> f109803c = new HashMap<>();

    private C47174a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.f.a.a$a */
    static final class RunnableC47175a implements Runnable {

        /* renamed from: a */
        public static final RunnableC47175a f109804a = new RunnableC47175a();

        static {
            Covode.recordClassIndex(55779);
        }

        RunnableC47175a() {
        }

        public final void run() {
            String str;
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - 10800;
            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
            C29699a aVar = ALog.sConfig;
            if (aVar != null) {
                str = aVar.f70857f;
            } else {
                str = null;
            }
            C12290b.m22062a(str, currentTimeMillis, currentTimeMillis2, "Network", C471761.f109805a, null);
        }
    }

    static {
        List<String> list;
        Covode.recordClassIndex(55778);
        f109802b = new ArrayList<>();
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            list = iESSettingsProxy.getApiAlogWhiteList();
        } catch (Exception e) {
            e.printStackTrace();
            list = null;
        }
        if (C13603b.m24435a((Collection) list)) {
            ArrayList<String> arrayList = f109802b;
            String[] stringArray = C17867d.m33078a().getResources().getStringArray(R.array.a5);
            C89219l.m154716b(stringArray, "");
            C89070n.m154536a((Collection) arrayList, (Object[]) stringArray);
            return;
        }
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        f109802b = (ArrayList) list;
    }

    /* renamed from: a */
    public static void m90348a() {
        try {
            for (Map.Entry<String, ArrayList<C47177b>> entry : f109803c.entrySet()) {
                ArrayList<C47177b> value = entry.getValue();
                if (!C13603b.m24435a((Collection) value)) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        ALog.m59865d("Network", it.next().toString());
                    }
                }
            }
            f109803c.clear();
            new Handler().postDelayed(RunnableC47175a.f109804a, 60000);
            C13964g.m25289a(true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", C79488a.m138200a());
            C12290b.m22066a("rig_feedback", jSONObject, (JSONObject) null, (JSONObject) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
