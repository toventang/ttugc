package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a.p3557a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c.C63120a;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63101e;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.a.a */
public final class C63107a {

    /* renamed from: a */
    private final List<AbstractC63101e> f143422a = new ArrayList();

    /* renamed from: b */
    private final List<AbstractC63101e> f143423b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private C63102f f143424c;

    /* renamed from: d */
    private String f143425d;

    static {
        Covode.recordClassIndex(73949);
    }

    /* renamed from: a */
    public final Map<String, String> mo101333a() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f143422a);
        arrayList.addAll(this.f143423b);
        List<AbstractC63101e> a = m114042a(arrayList);
        m114043b(a);
        for (AbstractC63101e eVar : a) {
            eVar.mo101329a();
            C63120a.m114060a(new C63108b(this, hashMap, eVar));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo101334a(C63102f fVar) {
        this.f143424c = fVar;
        this.f143425d = fVar.f143408g;
        this.f143423b.clear();
        List<AbstractC63101e> list = fVar.f143407f;
        if (list != null && list.size() > 0) {
            this.f143423b.addAll(list);
        }
    }

    /* renamed from: a */
    private static List<AbstractC63101e> m114042a(List<AbstractC63101e> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() == 0) {
            C63120a.m114061a("portraitParsers filter: null parsers：".concat(String.valueOf(list)));
            return arrayList;
        }
        for (AbstractC63101e eVar : list) {
            if (eVar != null) {
                arrayList.add(eVar);
            } else {
                C63120a.m114061a("portraitParsers filter: parser is null");
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m114043b(List<AbstractC63101e> list) {
        HashSet hashSet = new HashSet();
        for (AbstractC63101e eVar : list) {
            if (!hashSet.add(eVar.mo101329a())) {
                C63120a.m114061a("portraitParsers key duplicate!! ");
            }
        }
    }
}
