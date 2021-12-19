package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a;

import android.view.View;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.p979a.C14588c;
import com.bytedance.frameworks.baselib.network.p979a.EnumC14591d;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApi;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a.C67594b;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a.C67595c;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a.C67596d;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a.C67598e;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.a */
public final class C67592a {

    /* renamed from: a */
    public static boolean f151368a;

    /* renamed from: b */
    public static boolean f151369b;

    /* renamed from: c */
    public static C67598e f151370c = new C67598e();

    /* renamed from: d */
    public static C67596d f151371d = new C67596d();

    /* renamed from: e */
    public static C67594b f151372e = new C67594b();

    /* renamed from: f */
    public static final C67592a f151373f = new C67592a();

    /* renamed from: g */
    private static C67595c f151374g = new C67595c();

    private C67592a() {
    }

    /* renamed from: c */
    public static boolean m119685c() {
        String str;
        if (!f151371d.mo106564e() || (str = f151372e.f151378d) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(79231);
    }

    /* renamed from: d */
    private static void m119686d() {
        f151368a = false;
        f151369b = false;
        C67595c cVar = f151374g;
        cVar.mo106556a((String) null);
        cVar.mo106554a((C13624l.EnumC13625a) null);
        cVar.mo106555a((EnumC14591d) null);
        C67598e eVar = f151370c;
        eVar.f151407b = null;
        eVar.f151408c = null;
        eVar.f151409d = -2;
        eVar.f151410e = null;
        eVar.f151411f = null;
        eVar.f151412g = null;
        eVar.f151413h = null;
        C67594b bVar = f151372e;
        bVar.f151379e = null;
        bVar.f151376b = null;
        bVar.f151378d = null;
        bVar.f151377c = null;
        C67596d dVar = f151371d;
        dVar.f151383b = -1;
        dVar.f151384c = -1;
        dVar.f151385d = -1;
        dVar.f151386e = -1;
        dVar.f151387f = -1;
        dVar.f151388g = -1;
        dVar.f151389h = -1;
        dVar.f151390i = -1;
        dVar.f151391j = -1;
        dVar.f151392k = -1;
        dVar.f151393l = -1;
        dVar.f151395n = null;
        dVar.f151394m = -1;
        dVar.f151397p = null;
        dVar.f151403v = null;
        dVar.f151404w = null;
        dVar.f151396o = false;
    }

    /* renamed from: a */
    public final void mo106550a() {
        long j;
        if (!f151368a && !f151369b && m119685c()) {
            C67596d dVar = f151371d;
            if (dVar.f151383b != -1 && dVar.f151397p == null) {
                dVar.f151397p = Long.valueOf(System.currentTimeMillis() - dVar.f151383b);
                Long l = dVar.f151397p;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                dVar.mo106552a("cost", Long.valueOf(j));
            }
            m119684b();
        }
    }

    /* renamed from: b */
    public static void m119684b() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : f151374g.f151375a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (m119683a(value)) {
                    jSONObject.put(key, value);
                }
            }
            for (Map.Entry<String, Object> entry2 : f151372e.f151375a.entrySet()) {
                String key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (m119683a(value2)) {
                    jSONObject.put(key2, value2);
                }
            }
            for (Map.Entry<String, Object> entry3 : f151371d.f151375a.entrySet()) {
                String key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if (m119683a(value3)) {
                    jSONObject.put(key3, value3);
                }
            }
            for (Map.Entry<String, Object> entry4 : f151370c.f151375a.entrySet()) {
                String key4 = entry4.getKey();
                Object value4 = entry4.getValue();
                if (m119683a(value4)) {
                    jSONObject.put(key4, value4);
                }
            }
            C29819a.m60077a("search_trigger_refresh_monitor_v3", jSONObject);
        } catch (Exception unused) {
        } finally {
            m119686d();
            f151368a = true;
        }
    }

    /* renamed from: a */
    public static void m119682a(AbstractC89172b<? super C67598e, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        bVar.invoke(f151370c);
    }

    /* renamed from: a */
    private static boolean m119683a(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num == null || Math.abs(num.intValue()) >= 1000000) {
                return false;
            }
            return true;
        } else if (!(obj instanceof Long)) {
            return true;
        } else {
            Long l = (Long) obj;
            if (l == null || Math.abs(l.longValue()) >= 1000000) {
                return false;
            }
            return true;
        }
    }

    public final void onEventStart(C67678d dVar) {
        String str;
        String str2;
        m119686d();
        C67594b bVar = f151372e;
        Integer num = null;
        if (dVar != null) {
            str = dVar.getKeyword();
        } else {
            str = null;
        }
        if (bVar.f151378d == null) {
            bVar.f151378d = str;
            if (str == null) {
                str = "";
            }
            bVar.mo106552a("search_keyword", str);
        }
        if (dVar != null) {
            str2 = dVar.getSearchFrom();
        } else {
            str2 = null;
        }
        if (bVar.f151376b == null) {
            bVar.f151376b = str2;
            if (str2 == null) {
                str2 = "";
            }
            bVar.mo106552a("search_source", str2);
        }
        if (dVar != null) {
            num = Integer.valueOf(dVar.getIndex());
        }
        if (bVar.f151377c == null && num != null) {
            num.intValue();
            bVar.f151377c = num;
            bVar.mo106552a("search_position", num);
        }
        C67595c cVar = f151374g;
        cVar.mo106556a(SearchApi.f97594a);
        C34719f fVar = C34719f.C34720a.f82009a;
        C89219l.m154716b(fVar, "");
        cVar.mo106554a(fVar.f82007a);
        C14588c cVar2 = C14588c.C14589a.f35268a;
        C89219l.m154716b(cVar2, "");
        cVar.mo106555a(cVar2.mo23462a());
        if (cVar.f151380b == C13624l.EnumC13625a.NONE || cVar.f151380b == C13624l.EnumC13625a.NONE) {
            f151370c.mo106569a(1, "NO_NETWORK");
        }
        C67598e eVar = f151370c;
        if (eVar.f151410e == null) {
            eVar.f151410e = 0;
            eVar.mo106552a("count", (Object) 0);
        }
        f151371d.f151383b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m119681a(View view, String str) {
        C89219l.m154721d(view, "");
        f151371d.mo106559a(view, str);
    }
}
