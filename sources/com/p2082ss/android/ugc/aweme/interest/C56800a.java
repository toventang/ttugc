package com.p2082ss.android.ugc.aweme.interest;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.journey.C56848ah;
import com.p2082ss.android.ugc.aweme.journey.C56849ai;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56969a;
import com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56997f;
import com.p2082ss.android.ugc.aweme.journey.step.interestselector.C57010g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.interest.a */
public final class C56800a {
    static {
        Covode.recordClassIndex(66666);
    }

    /* renamed from: a */
    public static final C89378p<List<C57054w>, JSONArray> m102982a(C57010g gVar) {
        C89219l.m154721d(gVar, "");
        HashSet<C56801b> hashSet = gVar.f129793b;
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList();
        int i = 0;
        for (T t : hashSet) {
            String str = gVar.f129794c.get(t.f129363a).f129458a;
            String str2 = t.f129364b;
            int i2 = t.f129363a;
            int i3 = t.f129365c;
            linkedList.add(new C57054w(str, (byte) 0));
            JSONObject jSONObject = new JSONObject();
            i++;
            jSONObject.put("select_rank", i);
            jSONObject.put("interest", str2);
            jSONObject.put("category", str);
            jSONObject.put("show_rank", i2 + 1);
            jSONObject.put("topic_rank", i3 + 1);
            jSONArray.put(jSONObject);
        }
        return new C89378p<>(linkedList, jSONArray);
    }

    /* renamed from: a */
    public static final C33744d m102980a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C33744d a = new C33744d().mo59980a("is_default_interests_list", z ? 1 : 0).mo59983a("enter_from", str);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final C89378p<List<C57054w>, JSONArray> m102981a(C56969a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        List<Number> j = C89070n.m154590j(aVar.f129704c);
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList();
        int i = 0;
        for (Number number : j) {
            int intValue = number.intValue();
            C57054w wVar = aVar.f129705d.get(intValue);
            C57054w wVar2 = new C57054w(wVar.f129912a, (byte) 0);
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("select_rank", i + 1);
            }
            jSONObject.put("show_rank", intValue + 1).put("interest", wVar.f129912a).put("category", wVar.f129912a);
            jSONArray.put(jSONObject);
            linkedList.add(wVar2);
            i++;
        }
        return new C89378p<>(linkedList, jSONArray);
    }

    /* renamed from: a */
    public static final C33744d m102979a(String str, String str2, String str3, long j, C57010g gVar) {
        C56849ai aiVar;
        List<C56848ah> list;
        C56848ah ahVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int i = C56997f.f129760j;
        int i2 = 0;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                Integer num = C56997f.f129761k.get(Integer.valueOf(i3));
                if (num == null) {
                    C89219l.m154715b();
                }
                int intValue = num.intValue();
                if (intValue >= 0) {
                    int i4 = 0;
                    while (true) {
                        if (gVar != null) {
                            List<C56849ai> list2 = gVar.f129794c;
                            if (!(list2 == null || (aiVar = list2.get(i3)) == null || (list = aiVar.f129461d) == null || (ahVar = list.get(i4)) == null)) {
                                C56997f.f129757c.add(ahVar.f129453a);
                            }
                        }
                        if (i4 == intValue) {
                            break;
                        }
                        i4++;
                    }
                }
                if (i3 == i) {
                    break;
                }
                i3++;
            }
        }
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59981a("stay_time", j).mo59983a("exit_method", str2);
        if (!TextUtils.isEmpty(str3)) {
            a.mo59983a("interests_list", str3);
        }
        LinkedHashSet<String> linkedHashSet = C56997f.f129757c;
        StringBuilder sb = new StringBuilder();
        if (!linkedHashSet.isEmpty()) {
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                if (i2 != linkedHashSet.size() - 1) {
                    sb.append(",");
                }
                i2++;
            }
            a.mo59980a("interests_cnt", linkedHashSet.size());
            a.mo59983a("interests_show_list", sb.toString());
        }
        Integer a2 = HybridABInfoService.m69246b().mo60084a();
        if (a2 != null) {
            a.mo59980a("is_ab_backend_resp_received", a2.intValue());
        }
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final C33744d m102978a(String str, String str2, String str3, long j, C56969a aVar, FlexboxLayoutManager flexboxLayoutManager) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C33744d a = new C33744d().mo59983a("enter_from", str).mo59981a("stay_time", j).mo59983a("exit_method", str2);
        if (!TextUtils.isEmpty(str3)) {
            a.mo59983a("interests_list", str3);
        }
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            if (flexboxLayoutManager == null) {
                C89219l.m154715b();
            }
            int C = flexboxLayoutManager.mo41232C() - 1;
            int i = 0;
            if (C >= 0) {
                while (true) {
                    sb.append(aVar.f129705d.get(i).f129912a);
                    if (i != C) {
                        sb.append(",");
                    }
                    if (i == C) {
                        break;
                    }
                    i++;
                }
            }
            a.mo59980a("interests_cnt", C + 1);
            a.mo59983a("interests_show_list", sb.toString());
        }
        Integer a2 = HybridABInfoService.m69246b().mo60084a();
        if (a2 != null) {
            a.mo59980a("is_ab_backend_resp_received", a2.intValue());
        }
        C89219l.m154716b(a, "");
        return a;
    }
}
