package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63097a;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.AbstractC63100d;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.BitrateFilter */
public final class BitrateFilter {

    /* renamed from: a */
    private final AbstractC63097a f167781a = AbstractC63100d.m114034a().mo101328b();

    static {
        Covode.recordClassIndex(87450);
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.BitrateFilter$Filter */
    public static class Filter {
        @AbstractC27891c(mo46611a = "allow_gears")
        private List<String> allowGears;
        @AbstractC27891c(mo46611a = "forbidden_gears")
        private List<String> forbiddenGears;

        static {
            Covode.recordClassIndex(87452);
        }

        public List<String> getAllowGears() {
            return this.allowGears;
        }

        public List<String> getForbiddenGears() {
            return this.forbiddenGears;
        }

        public void setAllowGears(List<String> list) {
            this.allowGears = list;
        }

        public void setForbiddenGears(List<String> list) {
            this.forbiddenGears = list;
        }
    }

    /* renamed from: a */
    private static Set<String> m131061a(List<Filter> list) {
        HashSet hashSet = new HashSet();
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Filter filter : list) {
            if (!(filter == null || filter.getAllowGears() == null || filter.getAllowGears().size() <= 0)) {
                arrayList.add(filter);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        hashSet.addAll(((Filter) arrayList.get(0)).getAllowGears());
        for (int i = 1; i < arrayList.size(); i++) {
            Filter filter2 = (Filter) arrayList.get(i);
            if (!(filter2 == null || filter2.getAllowGears() == null || filter2.getAllowGears().size() <= 0)) {
                hashSet.retainAll(filter2.getAllowGears());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private static List<C84237e> m131060a(List<C84237e> list, Set<String> set) {
        ArrayList arrayList = new ArrayList(list);
        for (C84237e eVar : list) {
            if (set.contains(String.valueOf(eVar.getQualityType()))) {
                arrayList.remove(eVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<C84237e> m131062b(List<C84237e> list, Set<String> set) {
        if (set == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (set.size() == 0) {
            return arrayList;
        }
        for (C84237e eVar : list) {
            if (set.contains(String.valueOf(eVar.getQualityType()))) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<C84237e> mo117453a(List<C84237e> list, String str) {
        IDimensionBitrateFilterConfig dimensionBitrateFilterConfig;
        System.currentTimeMillis();
        if (!(list == null || list.size() == 0 || (dimensionBitrateFilterConfig = AbstractC74616d.m131036a().mo117290b().getDimensionBitrateFilterConfig()) == null || !dimensionBitrateFilterConfig.mo117322a())) {
            AbstractC63097a aVar = this.f167781a;
            C63102f b = dimensionBitrateFilterConfig.mo117323b();
            b.f143408g = str;
            List<Filter> a = aVar.mo101325a(b, new C27895a<Filter>() {
                /* class com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.BitrateFilter.C746291 */

                static {
                    Covode.recordClassIndex(87451);
                }
            }.type);
            HashSet hashSet = new HashSet();
            if (a != null) {
                for (Filter filter : a) {
                    if (!(filter == null || filter.getForbiddenGears() == null || filter.getForbiddenGears().size() <= 0)) {
                        hashSet.addAll(filter.getForbiddenGears());
                    }
                }
            }
            Set<String> a2 = m131061a(a);
            List<C84237e> b2 = m131062b(m131060a(list, hashSet), a2);
            C1764a.m5928a("filter: forbiddenGears:%s, allowGears:%s, input:%s, output:%s", new Object[]{hashSet, a2, list, b2});
            if (b2.size() != 0) {
                list = b2;
            }
        }
        System.currentTimeMillis();
        return list;
    }
}
