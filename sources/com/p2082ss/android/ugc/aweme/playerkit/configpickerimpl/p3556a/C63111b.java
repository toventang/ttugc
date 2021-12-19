package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c.C63122b;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.b */
public final class C63111b {

    /* renamed from: a */
    public C63102f f143432a;

    /* renamed from: b */
    public List<List<ConditionConfig>> f143433b;

    /* renamed from: c */
    public List<ConditionConfig> f143434c;

    static {
        Covode.recordClassIndex(73953);
    }

    /* renamed from: a */
    public final List<List<ConditionConfig>> mo101337a() {
        Type type = new C27895a<List<ConditionConfig>>() {
            /* class com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a.C63111b.C631121 */

            static {
                Covode.recordClassIndex(73954);
            }
        }.type;
        List<ConditionConfig> a = m114049a((List) C63122b.m114064a(this.f143432a.f143402a, type), (List) C63122b.m114064a(this.f143432a.f143403b, type));
        Collections.sort(a, new C63106a());
        ArrayList arrayList = new ArrayList();
        this.f143434c = arrayList;
        arrayList.addAll(a);
        return m114048a(a);
    }

    /* renamed from: a */
    private static List<List<ConditionConfig>> m114048a(List<ConditionConfig> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < size - i; i2++) {
                int i3 = i + i2;
                arrayList2.add(list.get(i3));
                int i4 = i3 + 1;
                if (i4 < size && list.get(i4).mo101343a() < list.get(i).mo101343a()) {
                    break;
                }
            }
            arrayList.add(arrayList2);
            i += arrayList2.size();
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<ConditionConfig> m114049a(List<ConditionConfig> list, List<ConditionConfig> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }
}
