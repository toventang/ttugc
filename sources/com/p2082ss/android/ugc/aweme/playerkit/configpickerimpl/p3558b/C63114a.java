package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3558b;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a.p3557a.C63107a;
import com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3556a.p3557a.C63109c;
import com.p2082ss.android.ugc.aweme.playerkit.p3555a.C63102f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.a */
public final class C63114a {

    /* renamed from: a */
    private Map<String, String> f143439a;

    /* renamed from: b */
    private Map<String, String> f143440b;

    /* renamed from: c */
    private final C63109c f143441c = new C63109c();

    /* renamed from: d */
    private final C63107a f143442d = new C63107a();

    static {
        Covode.recordClassIndex(73956);
    }

    /* renamed from: a */
    private boolean m114052a(ConditionConfig conditionConfig) {
        Map<String, List<String>> map = conditionConfig.f143456a;
        Map<String, List<String>> map2 = conditionConfig.f143457b;
        if (!m114054a(this.f143440b, map) || !m114054a(this.f143439a, map2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final List<ConditionConfig> mo101338a(List<ConditionConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (ConditionConfig conditionConfig : list) {
            if (m114052a(conditionConfig)) {
                arrayList.add(conditionConfig);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo101339a(C63102f fVar) {
        this.f143441c.f143429a = fVar;
        this.f143442d.mo101334a(fVar);
        this.f143439a = this.f143441c.mo101336a();
        Map<String, String> a = this.f143442d.mo101333a();
        this.f143440b = a;
        C1764a.m5928a("ConditionMatcher update portraits: server:%s, client:%s", new Object[]{this.f143439a, a});
    }

    /* renamed from: a */
    private static boolean m114053a(String str, List<String> list) {
        if (list == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        return list.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m114054a(java.util.Map<java.lang.String, java.lang.String> r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
        /*
            r5 = 1
            if (r7 == 0) goto L_0x0009
            int r0 = r7.size()
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return r5
        L_0x000a:
            r4 = 0
            if (r6 == 0) goto L_0x0013
            int r0 = r6.size()
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            return r4
        L_0x0014:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r6.containsKey(r2)
            if (r0 != 0) goto L_0x0039
            return r4
        L_0x0039:
            java.lang.Object r0 = r6.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = m114053a(r0, r1)
            if (r0 != 0) goto L_0x001c
            return r4
        L_0x0046:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3558b.C63114a.m114054a(java.util.Map, java.util.Map):boolean");
    }
}
