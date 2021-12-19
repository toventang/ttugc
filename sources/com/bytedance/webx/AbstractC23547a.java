package com.bytedance.webx;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.p1755d.AbstractC23566b;
import com.bytedance.webx.p1755d.AbstractC23567c;
import com.bytedance.webx.p1755d.C23565a;
import com.bytedance.webx.p1756e.AbstractC23595b;
import com.bytedance.webx.p1762f.AbstractC23606a;
import com.bytedance.webx.p1762f.C23607b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.webx.a */
public abstract class AbstractC23547a<T> implements AbstractC23567c {

    /* renamed from: c */
    public static C23548a f55776c = new C23548a();

    /* renamed from: d */
    public C23612h f55777d;

    /* renamed from: e */
    public AbstractC23566b f55778e;

    /* renamed from: f */
    public boolean f55779f = true;

    /* renamed from: g */
    public String f55780g;

    /* renamed from: h */
    public boolean f55781h = true;

    /* renamed from: i */
    public boolean f55782i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo34964a(C23548a aVar);

    /* renamed from: a */
    public boolean mo34965a() {
        return this.f55781h;
    }

    /* renamed from: b */
    public final T mo38631b() {
        return (T) this.f55778e.mo38646b();
    }

    /* renamed from: c */
    public final boolean mo38632c() {
        if (this.f55780g != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(27645);
    }

    /* renamed from: com.bytedance.webx.a$a */
    public static class C23548a {
        static {
            Covode.recordClassIndex(27646);
        }

        /* renamed from: a */
        public static void m44294a(AbstractC23595b bVar, AbstractC23547a aVar) {
            C23565a extendableContext = bVar.getExtendableContext();
            AbstractC23547a[] aVarArr = {aVar};
            int i = 0;
            do {
                AbstractC23547a aVar2 = aVarArr[0];
                Class<?> cls = aVar2.getClass();
                if (!extendableContext.mo38645a((Class<? extends AbstractC23547a>) cls)) {
                    extendableContext.mo38642a((Class<? extends AbstractC23547a>) cls, aVar2);
                    C23628i.m44674a(aVar2);
                    i++;
                } else {
                    return;
                }
            } while (i <= 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38630a(String str, AbstractC23606a aVar, int i) {
        AbstractC23566b bVar = this.f55778e;
        if (bVar != null) {
            Map<String, TreeMap<Integer, AbstractC23606a>> a = bVar.mo38641a();
            if (a == null) {
                a = Collections.synchronizedMap(new HashMap());
                bVar.mo38644a(a);
                C23607b.f55868a.add(bVar);
            }
            C23607b.C23608a aVar2 = (C23607b.C23608a) a.get(str);
            if (aVar2 == null) {
                aVar2 = new C23607b.C23608a((byte) 0);
                a.put(str, aVar2);
            }
            if (!aVar2.containsValue(aVar)) {
                synchronized (C23607b.class) {
                    aVar2.f55869a++;
                    if (aVar2.f55869a != 10000) {
                        aVar2.put(Integer.valueOf((i * 10000) + aVar2.f55869a), aVar);
                    } else {
                        throw new Error("listener id > 999");
                    }
                }
            }
        }
    }
}
