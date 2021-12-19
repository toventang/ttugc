package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C27917g;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67438c;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67442g;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a.b */
public final class C42619b {

    /* renamed from: a */
    public static final String f99426a = "";

    /* renamed from: b */
    public static final C42619b f99427b = new C42619b();

    /* renamed from: c */
    private static List<C42618a> f99428c;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.a.b$a */
    public static final class C42620a extends C27895a<List<? extends C42618a>> {
        static {
            Covode.recordClassIndex(50724);
        }

        C42620a() {
        }
    }

    private C42619b() {
    }

    static {
        Covode.recordClassIndex(50723);
    }

    /* renamed from: a */
    public final synchronized List<C42618a> mo72819a() {
        List<C42618a> list;
        MethodCollector.m26663i(10791);
        try {
            String a = SettingsManager.m29616a().mo25398a("search_filter_options_config", "");
            C89219l.m154716b(a, "");
            C27917g gVar = new C27917g();
            gVar.f65564d = true;
            gVar.f65566f = true;
            f99428c = (List) gVar.mo46682b().mo46671a(a, new C42620a().type);
        } catch (Throwable unused) {
        }
        list = f99428c;
        MethodCollector.m26664o(10791);
        return list;
    }

    /* renamed from: a */
    public final C42618a mo72818a(String str) {
        C89219l.m154721d(str, "");
        if (f99428c == null) {
            mo72819a();
        }
        List<C42618a> list = f99428c;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (TextUtils.equals(t.f99422a, str)) {
                arrayList.add(t);
            }
        }
        return (C42618a) C89070n.m154583g((List) arrayList);
    }

    /* renamed from: a */
    public static boolean m85133a(C42618a aVar) {
        if (!(aVar == null || aVar.f99423b == null)) {
            C67438c cVar = aVar.f99423b;
            if (cVar == null) {
                C89219l.m154715b();
            }
            if (cVar.getOptionStructList() != null) {
                C67438c cVar2 = aVar.f99423b;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                List<C67442g> optionStructList = cVar2.getOptionStructList();
                if (!(optionStructList == null || optionStructList.isEmpty() || aVar.f99424c == null)) {
                    C67438c cVar3 = aVar.f99424c;
                    if (cVar3 == null) {
                        C89219l.m154715b();
                    }
                    if (cVar3.getOptionStructList() != null) {
                        C67438c cVar4 = aVar.f99424c;
                        if (cVar4 == null) {
                            C89219l.m154715b();
                        }
                        List<C67442g> optionStructList2 = cVar4.getOptionStructList();
                        if (optionStructList2 == null || optionStructList2.isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
