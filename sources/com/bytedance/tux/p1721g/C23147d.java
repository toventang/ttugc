package com.bytedance.tux.p1721g;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.g.d */
public final class C23147d {

    /* renamed from: a */
    public static final C23147d f54789a = new C23147d();

    /* renamed from: b */
    private static final Map<Integer, C23146c> f54790b = new LinkedHashMap();

    /* renamed from: c */
    private static final Set<WeakReference<AbstractC23143a>> f54791c = new LinkedHashSet();

    private C23147d() {
    }

    static {
        Covode.recordClassIndex(27076);
    }

    /* renamed from: a */
    public static void m43621a(AbstractC23143a aVar) {
        C89219l.m154719c(aVar, "");
        f54791c.add(new WeakReference<>(aVar));
        C23146c a = aVar.mo37630a();
        f54790b.put(Integer.valueOf(a.f54788i), a);
    }

    /* renamed from: b */
    public static void m43622b(Activity activity) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = f54791c.iterator();
        while (it.hasNext()) {
            AbstractC23143a aVar = (AbstractC23143a) it.next().get();
            if (aVar != null) {
                aVar.mo37630a().f54786g = false;
                aVar.dismiss();
            }
        }
        f54791c.clear();
    }

    /* renamed from: a */
    public static void m43620a(Activity activity) {
        C89219l.m154719c(activity, "");
        Iterator<Map.Entry<Integer, C23146c>> it = f54790b.entrySet().iterator();
        while (it.hasNext()) {
            C23146c value = it.next().getValue();
            long currentTimeMillis = System.currentTimeMillis();
            Long l = value.f54780a;
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0 && currentTimeMillis < longValue) {
                    C23146c cVar = new C23146c(value.f54780a, value.f54781b, value.f54782c, value.f54783d, longValue - currentTimeMillis, false, value.f54786g, value.f54787h, value.f54788i);
                    C23144b bVar = new C23144b(activity);
                    C89219l.m154719c(cVar, "");
                    bVar.f54776a = cVar;
                    bVar.mo37637b();
                }
            }
            it.remove();
        }
    }
}
