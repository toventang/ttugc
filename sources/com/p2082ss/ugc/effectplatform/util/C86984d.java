package com.p2082ss.ugc.effectplatform.util;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.util.C86985e;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.d */
public final class C86984d {
    static {
        Covode.recordClassIndex(102750);
    }

    /* renamed from: a */
    public static String m150636a(Object obj) {
        Object obj2;
        HashMap hashMap = new HashMap();
        hashMap.put("platform", 1);
        try {
            obj2 = C89379q.m157068constructorimpl(Float.valueOf(Float.parseFloat(C86995l.m150679a().f196160b)));
        } catch (Throwable th) {
            obj2 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj2)) {
            obj2 = null;
        }
        Float f = (Float) obj2;
        if (f != null) {
            hashMap.put("gl_version", Float.valueOf(f.floatValue()));
        }
        hashMap.put("gl_vendor", C86995l.m150679a().f196161c);
        hashMap.put("gl_renderer", C86995l.m150679a().f196159a);
        hashMap.put("gl_extension", C86995l.m150679a().f196166h);
        if (obj != null && (obj instanceof Context)) {
            C86985e.C86986a a = C86985e.m150638a((Context) obj);
            C89219l.m154709a((Object) a, "");
            long j = a.f196134a;
            if (j > 0) {
                hashMap.put("memory_total_size", Long.valueOf(j));
            }
        }
        String a2 = C86985e.m150640a();
        C89219l.m154709a((Object) a2, "");
        hashMap.put("cpu_vendor", a2);
        String str = Build.VERSION.RELEASE;
        C89219l.m154709a((Object) str, "");
        hashMap.put("os_version", str);
        return new JSONObject(hashMap).toString();
    }
}
