package com.p2082ss.android.ugc.aweme.bullet.p2417e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bullet.p2417e.C35143a;
import java.util.Iterator;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.e.b */
public final class C35145b {

    /* renamed from: a */
    public static final C35143a f82934a = new C35143a();

    /* renamed from: b */
    public static final C35145b f82935b = new C35145b();

    private C35145b() {
    }

    static {
        Covode.recordClassIndex(42300);
    }

    /* renamed from: a */
    public static C35146c m71913a(Uri uri) {
        C89219l.m154721d(uri, "");
        C35143a aVar = f82934a;
        C89219l.m154721d(uri, "");
        Iterator<C35143a.C35144a> it = aVar.f82931a.iterator();
        while (it.hasNext()) {
            C35143a.C35144a next = it.next();
            if (C89219l.m154714a(next.f82932a, uri)) {
                it.remove();
                return next.f82933b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C35146c m71915b(Uri uri) {
        T t;
        C89219l.m154721d(uri, "");
        C35143a aVar = f82934a;
        C89219l.m154721d(uri, "");
        Iterator<T> it = aVar.f82931a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a(t.f82932a, uri)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2.f82933b;
        }
        return null;
    }

    /* renamed from: a */
    public static void m71914a(String str, AbstractC89172b<? super Uri, C35146c> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        C89219l.m154721d(parse, "");
        C89219l.m154721d(bVar, "");
        C35143a aVar = f82934a;
        C89219l.m154721d(parse, "");
        C89219l.m154721d(bVar, "");
        aVar.f82931a.add(new C35143a.C35144a(parse, bVar.invoke(parse)));
    }
}
