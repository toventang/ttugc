package com.p2082ss.android.ugc.aweme.search.feedback;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.discover.helper.C41987ag;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42180d;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.EnumC67453i;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.feedback.a */
public final class C67434a {

    /* renamed from: a */
    public static Integer f151074a;

    /* renamed from: b */
    static boolean f151075b;

    /* renamed from: c */
    public static final C67434a f151076c = new C67434a();

    private C67434a() {
    }

    static {
        Covode.recordClassIndex(79070);
    }

    /* renamed from: a */
    public static void m119467a(ActivityC0945e eVar) {
        C80375ef.m139356a(eVar, new FeedbackHelper$startObserver$1(eVar));
    }

    /* renamed from: a */
    private static Map<String, String> m119466a(Map<String, String> map) {
        String value;
        if (map == null || !(!map.isEmpty())) {
            return null;
        }
        if (!C89219l.m154714a((Object) map.get("search_type"), (Object) EnumC67453i.HASHTAG.getTabName())) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (C89219l.m154714a((Object) entry.getKey(), (Object) "search_type")) {
                value = C41987ag.m84047a(entry.getValue());
            } else {
                value = entry.getValue();
            }
            linkedHashMap.put(entry.getKey(), value);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static void m119468a(ActivityC0945e eVar, Intent intent) {
        C84349a.m145093a(intent, eVar);
        eVar.startActivity(intent);
    }

    /* renamed from: a */
    public static boolean m119469a(Context context, String str, boolean z, Map<String, String> map, String str2) {
        int i;
        C67469ad c;
        C67469ad c2;
        C42180d.C42181a a;
        Uri uri = null;
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar == null) {
            return false;
        }
        AbstractC67567q a2 = C67486am.m119565a(eVar.hashCode());
        AbstractC1174ac a3 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        C89219l.m154716b(a3, "");
        Integer value = ((SearchIntermediateViewModel) a3).getSearchTabIndex().getValue();
        if (value == null) {
            value = -1;
        }
        C89219l.m154716b(value, "");
        int intValue = value.intValue();
        if (str == null && ((a = C42180d.m84432a(C67458j.m119528a(intValue))) == null || (str = a.getSchema()) == null || str.length() <= 0)) {
            if (z) {
                str = "https://www.tiktok.com/web-inapp/search-feedback?hide_nav_bar=1";
            }
            return false;
        }
        if (!(str == null || str.length() == 0)) {
            if (C89219l.m154714a((Object) str2, (Object) "survey")) {
                i = 1;
            } else {
                i = 0;
            }
            f151074a = i;
            Map<String, String> a4 = m119466a(map);
            if (a4 == null) {
                C89378p[] pVarArr = new C89378p[5];
                pVarArr[0] = C89387v.m154943a("search_id", (a2 == null || (c2 = a2.mo106431c()) == null) ? null : c2.f151151a);
                pVarArr[1] = C89387v.m154943a("search_type", C41987ag.m84047a(C67458j.m119528a(intValue)));
                pVarArr[2] = C89387v.m154943a("search_keyword", (a2 == null || (c = a2.mo106431c()) == null) ? null : c.f151152b);
                pVarArr[3] = C89387v.m154943a("enter_from", C67458j.m119529a(eVar));
                pVarArr[4] = C89387v.m154943a("from_source", str2);
                a4 = C89041ag.m154427b(pVarArr);
            }
            Intent intent = new Intent(eVar, CrossPlatformActivity.class);
            Uri parse = Uri.parse(str);
            if (parse != null) {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                Uri.Builder buildUpon = parse.buildUpon();
                if (buildUpon != null) {
                    for (Map.Entry<String, String> entry : a4.entrySet()) {
                        if (!queryParameterNames.contains(entry.getKey())) {
                            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                        }
                    }
                    uri = buildUpon.build();
                }
            }
            intent.setData(uri);
            m119468a(eVar, intent);
            f151075b = true;
            return true;
        }
        return false;
    }
}
