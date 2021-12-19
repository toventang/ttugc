package com.p2082ss.android.token;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.C29845d;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39366b;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39367c;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61404b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.token.d */
public final class C30628d {

    /* renamed from: a */
    public static volatile boolean f73193a;

    /* renamed from: b */
    public static volatile boolean f73194b = true;

    /* renamed from: c */
    public static Set<String> f73195c = Collections.synchronizedSet(new HashSet());

    static {
        Covode.recordClassIndex(37166);
    }

    /* renamed from: a */
    public static void m62923a(Collection<String> collection) {
        if (f73193a) {
            C30630f.f73196a.mo54903a(collection);
            return;
        }
        Set<String> set = f73195c;
        if (set != null) {
            set.addAll(collection);
        }
    }

    /* renamed from: a */
    public static Map m62921a(String str) {
        Map<String, String> map;
        boolean z;
        if (f73193a) {
            map = C30630f.f73196a.mo54907c(str);
        } else {
            map = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("http://") && map != null && !map.isEmpty()) {
                C61404b a = C39367c.C39368a.m80044a();
                HashSet hashSet = new HashSet();
                HashSet<String> hashSet2 = new HashSet();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    hashSet.add(entry.getKey());
                    if (a != null && a.f139404d != null && a.f139404d.contains(entry.getKey().toLowerCase(Locale.ROOT)) && !C39367c.C39368a.m80046a(a, str)) {
                        hashSet2.add(entry.getKey());
                    }
                }
                if (!hashSet2.isEmpty()) {
                    for (String str2 : hashSet2) {
                        map.remove(str2);
                    }
                }
                if (!hashSet.isEmpty()) {
                    if (!hashSet2.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C39367c.C39368a.m80045a(new C39366b(z, null, str, hashSet, hashSet2, new HashSet(), new HashSet(), new HashSet(), new HashSet()));
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    /* renamed from: a */
    public static void m62922a(String str, List<C30627c> list) {
        String str2;
        if (f73193a) {
            C30630f fVar = C30630f.f73196a;
            if (!(!C30630f.f73198j || C30630f.f73196a == null || !C30630f.f73196a.mo54905a(str) || C30630f.f73196a.mo54906b(str) || list == null || list.isEmpty())) {
                String str3 = null;
                String str4 = null;
                for (C30627c cVar : list) {
                    if ("X-Tt-Token-Sign".equalsIgnoreCase(cVar.f73191a)) {
                        str4 = cVar.f73192b;
                    } else if ("X-Tt-Token".equalsIgnoreCase(cVar.f73191a)) {
                        str3 = cVar.f73192b;
                    }
                    if (!(TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) {
                        Iterator<C30627c> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str2 = "";
                                break;
                            }
                            C30627c next = it.next();
                            if ("X-Tt-Logid".equalsIgnoreCase(next.f73191a)) {
                                str2 = next.f73192b;
                                C29845d.m60144a("TokenFactory", "processResponseHeader logid = ".concat(String.valueOf(str2)));
                                break;
                            }
                        }
                        C30630f.f73196a.mo54901a(str4, str3, str2);
                        for (C30627c cVar2 : list) {
                            if ("x-tt-multi-sids".equalsIgnoreCase(cVar2.f73191a)) {
                                String str5 = cVar2.f73192b;
                                fVar.f73202c = str5;
                                if (fVar.f73210m != null) {
                                    fVar.f73210m.mo54892a().mo54890a("x-tt-multi-sids", str5).mo54891a();
                                }
                            }
                        }
                        return;
                    }
                }
            }
        }
    }
}
