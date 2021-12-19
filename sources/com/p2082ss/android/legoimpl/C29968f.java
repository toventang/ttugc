package com.p2082ss.android.legoimpl;

import android.content.Context;
import android.util.Log;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1746v.p1747a.C23535b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.legoimpl.f */
public final class C29968f {

    /* renamed from: a */
    public static final C29968f f71477a = new C29968f();

    private C29968f() {
    }

    static {
        Covode.recordClassIndex(36397);
    }

    /* renamed from: a */
    private static File m60489a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: a */
    static void m60490a(Context context, int i, String str) {
        long j;
        if (context == null || m60489a(context) == null) {
            j = -1;
        } else {
            File a = m60489a(context);
            C89219l.m154716b(a, "");
            j = a.getUsableSpace();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", i);
            jSONObject.put("reason", str);
            jSONObject.put("size", j);
            jSONObject.put("flag", 0);
            jSONObject.put("desc", Log.getStackTraceString(new Exception()));
        } catch (Exception unused) {
        }
        C12290b.m22064a("migrate_err", jSONObject);
    }

    /* renamed from: a */
    public static void m60491a(Context context, String str, String str2, Exception exc) {
        HashSet<String> d;
        C89219l.m154721d(context, "");
        C89219l.m154721d(exc, "");
        C89219l.m154721d(context, "");
        if (str != null && (d = C23535b.m44240d(context)) != null && !d.isEmpty()) {
            Iterator<String> it = d.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C89219l.m154716b(next, "");
                if (C89361p.m154908a((CharSequence) str, (CharSequence) next, false)) {
                    return;
                }
            }
            HashSet<String> c = C23535b.m44238c(context);
            if (c != null && !c.isEmpty()) {
                Iterator<String> it2 = c.iterator();
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    C89219l.m154716b(next2, "");
                    if (C89361p.m154908a((CharSequence) str, (CharSequence) next2, false)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("data_uri", str);
                            jSONObject.put("reason", str2 + "#" + C40353e.m81539a(exc));
                        } catch (Exception unused) {
                        }
                        C12290b.m22064a("storage_access_err", jSONObject);
                        return;
                    }
                }
            }
        }
    }
}
