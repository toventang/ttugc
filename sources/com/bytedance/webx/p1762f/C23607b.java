package com.bytedance.webx.p1762f;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1751b.p1752a.C23556a;
import com.bytedance.webx.p1755d.AbstractC23566b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.webx.f.b */
public class C23607b {

    /* renamed from: a */
    public static Set<AbstractC23566b> f55868a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: com.bytedance.webx.f.b$a */
    public static class C23608a<K, V> extends TreeMap<K, V> {

        /* renamed from: a */
        public int f55869a;

        static {
            Covode.recordClassIndex(27707);
        }

        private C23608a() {
            this.f55869a = -1;
        }

        public /* synthetic */ C23608a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(27706);
    }

    /* renamed from: a */
    public static AbstractC23606a m44642a(AbstractC23566b bVar, String str) {
        TreeMap<Integer, AbstractC23606a> treeMap;
        if (bVar == null) {
            C23556a.m44304a("EventManager");
            return null;
        }
        Map<String, TreeMap<Integer, AbstractC23606a>> a = bVar.mo38641a();
        if (a == null || (treeMap = a.get(str)) == null || treeMap.size() <= 0) {
            return null;
        }
        AbstractC23606a value = treeMap.firstEntry().getValue();
        AbstractC23547a a2 = value.mo34966a();
        if (!a2.f55779f || !a2.mo34965a()) {
            if (C23612h.f55874a.f55890a) {
                value.mo39033x().hashCode();
                C23556a.m44304a("WebX");
                value.mo39033x().hashCode();
                a2.getClass().getCanonicalName();
                C23556a.m44304a("WebX");
            }
            return m44641a(bVar, value, str);
        } else if (!C23612h.f55874a.f55890a) {
            return value;
        } else {
            value.mo39033x().hashCode();
            C23556a.m44304a("WebX");
            value.mo39033x().hashCode();
            a2.getClass().getCanonicalName();
            C23556a.m44304a("WebX");
            return value;
        }
    }

    /* renamed from: a */
    public static AbstractC23606a m44641a(AbstractC23566b bVar, AbstractC23606a aVar, String str) {
        TreeMap<Integer, AbstractC23606a> treeMap;
        Map<String, TreeMap<Integer, AbstractC23606a>> a = bVar.mo38641a();
        if (a == null || (treeMap = a.get(str)) == null || treeMap.size() <= 0) {
            return null;
        }
        Iterator<AbstractC23606a> it = treeMap.values().iterator();
        while (it.hasNext()) {
            if (aVar == it.next()) {
                while (it.hasNext()) {
                    AbstractC23606a next = it.next();
                    AbstractC23547a a2 = next.mo34966a();
                    if (a2.f55779f && a2.mo34965a()) {
                        if (C23612h.f55874a.f55890a) {
                            aVar.mo39033x().hashCode();
                            a2.getClass().getCanonicalName();
                            C23556a.m44304a("WebX");
                        }
                        return next;
                    } else if (C23612h.f55874a.f55890a) {
                        aVar.mo39033x().hashCode();
                        a2.getClass().getCanonicalName();
                        C23556a.m44304a("WebX");
                    }
                }
                if (C23612h.f55874a.f55890a) {
                    aVar.mo39033x().hashCode();
                    aVar.mo39033x().getClass().getCanonicalName();
                    C23556a.m44304a("WebX");
                    aVar.mo39033x().hashCode();
                    C23556a.m44304a("WebX");
                }
                return null;
            }
        }
        if (C23612h.f55874a.f55890a) {
            aVar.mo39033x().getClass().getCanonicalName();
            C23556a.m44304a("WebX");
            C23556a.m44304a("WebX");
        }
        return null;
    }
}
