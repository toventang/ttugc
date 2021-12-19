package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86510a;
import com.p2082ss.ttvideoengine.p4417j.C86512b;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.o */
public final class C63028o {
    static {
        Covode.recordClassIndex(73865);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r6.f143257f.get(0).endsWith(r1) != false) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.ttvideoengine.p4417j.C86510a m113706a(com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e.C63060a r6) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C63028o.m113706a(com.ss.android.ugc.aweme.player.sdk.b.e$a):com.ss.ttvideoengine.j.a");
    }

    /* renamed from: a */
    public static AbstractC86517e m113707a(C63059e eVar) {
        C86510a a;
        if (eVar == null) {
            return null;
        }
        C86512b.C86513a aVar = new C86512b.C86513a();
        aVar.f194709a = eVar.f143236a;
        aVar.f194710b = (long) (((int) eVar.f143239d) / 1000);
        if (eVar.f143243h == null || eVar.f143243h.size() == 0) {
            if (!(eVar.f143244i == null || (a = m113706a(eVar.f143244i)) == null)) {
                aVar.mo137762a(a);
            }
            return aVar.mo137763a();
        }
        for (C63059e.C63060a aVar2 : eVar.f143243h) {
            C86510a a2 = m113706a(aVar2);
            if (a2 != null) {
                aVar.mo137762a(a2);
            }
        }
        return aVar.mo137763a();
    }

    /* renamed from: a */
    public static String m113708a(Map<String, Object> map, String str) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: a */
    public static C63059e m113705a(Map<String, String> map, C63059e eVar) {
        if (eVar != null && eVar.f143243h != null && map != null) {
            Iterator<C63059e.C63060a> it = eVar.f143242g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C63059e.C63060a next = it.next();
                if (TextUtils.equals(String.valueOf(next.f143252a), map.get("video_bitrarte"))) {
                    eVar.f143244i = next;
                    String str = map.get("speed");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            eVar.f143244i.f143266o = Float.parseFloat(str);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return eVar;
    }
}
