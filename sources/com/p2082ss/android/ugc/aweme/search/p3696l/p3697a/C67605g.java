package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.utils.C80403es;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.g */
public final class C67605g {

    /* renamed from: a */
    public static final Map<Integer, C67603e> f151448a = new LinkedHashMap();

    /* renamed from: b */
    public static int f151449b;

    /* renamed from: c */
    public static final C67605g f151450c = new C67605g();

    /* renamed from: d */
    private static long f151451d;

    /* renamed from: e */
    private static C67603e f151452e;

    private C67605g() {
    }

    static {
        Covode.recordClassIndex(79244);
    }

    /* renamed from: a */
    public static C67603e m119730a(C67678d dVar) {
        if (dVar == null) {
            return C67604f.f151447a;
        }
        C67603e eVar = f151448a.get(Integer.valueOf(dVar.getId()));
        if (eVar == null) {
            return C67604f.f151447a;
        }
        return eVar;
    }

    /* renamed from: a */
    private static void m119731a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* renamed from: b */
    public static void m119734b(com.p2082ss.android.ugc.aweme.search.model.C67678d r18) {
        /*
        // Method dump skipped, instructions count: 984
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g.m119734b(com.ss.android.ugc.aweme.search.model.d):void");
    }

    /* renamed from: a */
    public static C67603e m119729a(int i, C67678d dVar) {
        C89219l.m154721d(dVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        f151451d = currentTimeMillis;
        if (currentTimeMillis - f151451d < 1000) {
            return null;
        }
        C67678d copy = dVar.copy();
        C89219l.m154716b(copy, "");
        C67603e eVar = new C67603e(copy);
        eVar.f151421a = currentTimeMillis;
        eVar.f151423c = 0;
        eVar.f151428h = i;
        f151448a.put(Integer.valueOf(copy.getId()), eVar);
        f151452e = eVar;
        if (dVar.getKeyword() != null) {
            String keyword = dVar.getKeyword();
            C89219l.m154716b(keyword, "");
            C80403es.C80404a.m139387a(keyword).mo123722b();
        }
        return eVar;
    }

    /* renamed from: a */
    private static boolean m119732a(boolean z, C67678d dVar) {
        if (!z || dVar == null || TextUtils.isEmpty(dVar.getKeyword())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static C67603e m119733b(int i, C67678d dVar) {
        if (dVar == null) {
            return null;
        }
        Map<Integer, C67603e> map = f151448a;
        C67603e eVar = map.get(Integer.valueOf(dVar.getId()));
        if (eVar == null) {
            C67603e eVar2 = f151452e;
            if (eVar2 != null && !eVar2.mo106581a()) {
                String keyword = dVar.getKeyword();
                C67603e eVar3 = f151452e;
                if (eVar3 == null) {
                    C89219l.m154715b();
                }
                if (C89219l.m154714a((Object) keyword, (Object) eVar3.f151420C.getKeyword())) {
                    eVar = f151452e;
                    if (eVar == null) {
                        C89219l.m154715b();
                    }
                    map.remove(Integer.valueOf(eVar.f151420C.getId()));
                    C67603e eVar4 = f151452e;
                    if (eVar4 == null) {
                        C89219l.m154715b();
                    }
                    eVar4.mo106576a(i);
                    C67603e eVar5 = f151452e;
                    if (eVar5 == null) {
                        C89219l.m154715b();
                    }
                    eVar5.mo106576a(i);
                    C67603e eVar6 = f151452e;
                    if (eVar6 == null) {
                        C89219l.m154715b();
                    }
                    Integer valueOf = Integer.valueOf(eVar6.f151420C.getId());
                    C67603e eVar7 = f151452e;
                    if (eVar7 == null) {
                        C89219l.m154715b();
                    }
                    map.put(valueOf, eVar7);
                }
            }
            eVar = m119729a(6, dVar);
            if (eVar != null) {
                eVar.mo106576a(i);
            } else {
                eVar = null;
            }
        } else {
            eVar.mo106576a(i);
        }
        f151452e = null;
        return eVar;
    }
}
