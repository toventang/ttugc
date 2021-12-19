package com.p2082ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39366b;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39367c;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61404b;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.lancet.f */
public class C58023f {
    static {
        Covode.recordClassIndex(68058);
    }

    /* renamed from: a */
    public static Map<String, List<String>> m104844a(URI uri, Map<String, List<String>> map) {
        boolean z;
        if (uri != null) {
            try {
                if (uri.toString().startsWith("http://") && !map.isEmpty()) {
                    C61404b a = C39367c.C39368a.m80044a();
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    HashMap hashMap = new HashMap();
                    Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
                    while (true) {
                        int i = 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        ArrayList arrayList = new ArrayList();
                        for (String str : next.getValue()) {
                            StringBuilder sb = new StringBuilder();
                            String[] split = str.split(";");
                            int length = split.length;
                            int i2 = 0;
                            while (i2 < length) {
                                String str2 = split[i2];
                                String[] split2 = str2.split("=");
                                if (split2.length > i) {
                                    String trim = split2[0].trim();
                                    hashSet.add(trim);
                                    if (a == null || a.f139404d == null || !a.f139404d.contains(trim.toLowerCase(Locale.ROOT)) || C39367c.C39368a.m80046a(a, uri.toString())) {
                                        sb.append(str2).append(";");
                                    } else {
                                        hashSet2.add(trim);
                                    }
                                } else {
                                    sb.append(str2).append(";");
                                }
                                i2++;
                                i = 1;
                            }
                            arrayList.add(sb.toString());
                            i = 1;
                        }
                        hashMap.put(next.getKey(), arrayList);
                    }
                    if (!hashSet.isEmpty()) {
                        if (!hashSet2.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C39367c.C39368a.m80045a(new C39366b(z, null, uri.toString(), new HashSet(), new HashSet(), hashSet, hashSet2, new HashSet(), new HashSet()));
                    }
                    return hashMap;
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
