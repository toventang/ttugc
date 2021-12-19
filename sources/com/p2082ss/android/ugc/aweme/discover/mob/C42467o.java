package com.p2082ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.adapter.p2763b.C41702g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.HashMap;
import java.util.Map;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.o */
public final class C42467o {

    /* renamed from: a */
    private static Map<Integer, String> f98993a;

    static {
        Covode.recordClassIndex(50416);
        HashMap hashMap = new HashMap();
        f98993a = hashMap;
        hashMap.put(3, "general_search");
        f98993a.put(6, "search_sug");
    }

    /* renamed from: a */
    public static String m84876a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "click_search_recommend";
        }
        return "click_search_result";
    }

    /* renamed from: a */
    public static String m84875a(int i) {
        String str = f98993a.get(Integer.valueOf(i));
        if (str == null || TextUtils.isEmpty(str)) {
            return "search_result";
        }
        return str;
    }

    /* renamed from: a */
    public static void m84877a(int i, String str, String str2) {
        C33743c cVar = new C33743c();
        if (i != 3) {
            cVar.mo59976a("group_id", "");
            cVar.mo59976a("request_id", str);
            cVar.mo59976a("enter_from", "search_result");
            cVar.mo59976a("enter_method", "click_card");
            cVar.mo59976a("enter_type", "normal_way");
            C39162r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str2).setJsonObject(cVar.mo59977a()));
            return;
        }
        cVar.mo59976a("enter_from", "general_search");
        cVar.mo59976a("enter_method", "click_card");
        cVar.mo59976a("enter_type", "normal_way");
        C39162r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str2).setJsonObject(cVar.mo59977a()));
    }

    /* renamed from: b */
    public static void m84882b(int i, String str, String str2) {
        if (i == 3) {
            C39162r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("general_search").setValue(str));
            return;
        }
        C33743c cVar = new C33743c();
        if (!TextUtils.isEmpty(str2)) {
            cVar.mo59976a("search_keyword", str2);
            C39162r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setExtValueString(str).setJsonObject(cVar.mo59977a()));
            return;
        }
        cVar.mo59976a("source", "recommend");
        cVar.mo59976a("id", str);
        C39162r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setJsonObject(cVar.mo59977a()));
    }

    /* renamed from: a */
    public static void m84880a(View view, String str, Aweme aweme, String str2, int i) {
        m84881a(view, str, aweme, str2, i, "", "", "");
    }

    /* renamed from: a */
    public static void m84878a(int i, String str, String str2, AbstractC59233c cVar, int i2, String str3) {
        new C42455g().setOrder(i).setSearchKeyword(str).setRid(str2).setEnterFrom(m84875a(i2)).setEnterMethod(str3).installToMetrics(cVar);
        cVar.mo96792f();
    }

    /* renamed from: a */
    public static void m84881a(View view, String str, Aweme aweme, String str2, int i, String str3, String str4, String str5) {
        if (str.equals("general_search") || str.equals("search_result") || str.equals("ecommerce")) {
            C42452d.m84858a(view, aweme.getAid(), i);
            C1731i.m5640b(new CallableC42468p(str, aweme, view, str2, str3, str4, str5), C40780g.m82246c());
        }
    }

    /* renamed from: a */
    public static void m84879a(View view, int i, String str, int i2, String str2, String str3, String str4, String str5, Map<String, String> map) {
        C42452d.m84858a(view, str3, i);
        C59252q o = ((C59252q) new C59252q().mo96742b()).mo96825o(m84875a(i2));
        o.f135315r = str2;
        C59252q qVar = (C59252q) o.mo96744c().mo96743b(String.valueOf(i));
        qVar.f135314q = str3;
        qVar.f135291ae = C41702g.f97285a;
        qVar.f135289ac = str5;
        if (map != null) {
            qVar.mo96788a(map);
        }
        m84878a(i, str, str2, qVar, i2, str4);
        m84877a(i2, str2, str3);
    }
}
