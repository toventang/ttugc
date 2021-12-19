package com.bytedance.crash.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13881i;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.runtime.C14004d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.entity.c */
public final class C13865c extends C13862a {

    /* renamed from: a */
    public static ConcurrentLinkedQueue<C13881i> f33759a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public static final Object f33760b = new Object();

    /* renamed from: c */
    private static ConcurrentHashMap<Integer, C13881i> f33761c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(15924);
    }

    /* renamed from: a */
    public static JSONArray m25081a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<C13881i> it = f33759a.iterator();
        while (true) {
            if (it.hasNext()) {
                C13881i next = it.next();
                if (next != null && next.mo22362a(obj)) {
                    jSONArray.put(next.mo22361a(CrashType.JAVA));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static JSONArray m25082b(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<C13881i> it = f33759a.iterator();
        while (true) {
            if (it.hasNext()) {
                C13881i next = it.next();
                if (next != null && next.mo22362a(obj)) {
                    jSONArray.put(next.mo22364b(CrashType.JAVA));
                    break;
                }
            } else {
                break;
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static String m25083c(Object obj) {
        if (obj == f33760b) {
            return C14004d.m25375a(C13933m.m25221a());
        }
        Iterator<C13881i> it = f33759a.iterator();
        while (it.hasNext()) {
            C13881i next = it.next();
            if (next != null && next.mo22362a(obj)) {
                return next.mo22363b();
            }
        }
        return null;
    }
}
