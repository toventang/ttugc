package com.bytedance.lynx.hybrid.p1517c;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.C21344o;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.c.b */
public final class C21167b {

    /* renamed from: a */
    public static C21168c f50214a;

    /* renamed from: b */
    public static final C21167b f50215b = new C21167b();

    private C21167b() {
    }

    static {
        Covode.recordClassIndex(24783);
    }

    /* renamed from: a */
    private static String m39863a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return C89361p.m154940j(str, str2);
    }

    /* renamed from: a */
    private static String m39861a(C21166a aVar, String str) {
        T t;
        List<String> list = aVar.f50212f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89361p.m154874b(str, (String) t, false)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                int length = t2.length();
                if (str != null) {
                    String substring = str.substring(length);
                    C89219l.m154709a((Object) substring, "");
                    return C89361p.m154896a(substring, '?');
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m39862a(IResourceService iResourceService, C21166a aVar, String str, String str2, String str3, C21284j jVar) {
        String a = m39861a(aVar, str);
        if (a != null) {
            String a2 = m39863a(a, str3);
            if (iResourceService != null) {
                String uri = C21344o.m40087a(str2).toString();
                C89219l.m154709a((Object) uri, "");
                C21294e loadSync = iResourceService.loadSync(uri, jVar);
                if (loadSync != null) {
                    File file = new File(loadSync.f50547n + File.separator + a2);
                    if (file.exists()) {
                        return file.getAbsolutePath();
                    }
                }
            }
        }
        return null;
    }
}
