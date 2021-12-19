package com.bytedance.android.live;

import com.bytedance.android.live.slot.AbstractC6190x;
import com.bytedance.android.live.slot.AbstractC6191y;
import com.bytedance.android.live.slot.C6161ad;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.g */
public class C4321g {

    /* renamed from: b */
    private static C4321g f11871b;

    /* renamed from: a */
    final C4322a f11872a = new C4322a();

    static {
        Covode.recordClassIndex(4894);
    }

    /* renamed from: com.bytedance.android.live.g$a */
    static class C4322a {

        /* renamed from: a */
        Map<IIconSlot.EnumC6149b, List<AbstractC6191y>> f11873a = new HashMap();

        /* renamed from: b */
        Map<IFrameSlot.EnumC6146b, List<AbstractC6191y>> f11874b = new HashMap();

        /* renamed from: c */
        Map<IIconSlot.EnumC6149b, AbstractC6190x> f11875c = new HashMap();

        /* renamed from: d */
        public Map<String, AbstractC6191y> f11876d = new HashMap();

        /* renamed from: e */
        Map<String, AbstractC6190x> f11877e = new HashMap();

        static {
            Covode.recordClassIndex(4895);
        }

        C4322a() {
        }

        /* renamed from: a */
        public final AbstractC6191y mo10013a(String str) {
            return this.f11876d.get(str);
        }
    }

    /* renamed from: a */
    public static C4321g m10436a() {
        MethodCollector.m26663i(12187);
        if (f11871b == null) {
            synchronized (C4321g.class) {
                try {
                    if (f11871b == null) {
                        f11871b = new C4321g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12187);
                    throw th;
                }
            }
        }
        C4321g gVar = f11871b;
        MethodCollector.m26664o(12187);
        return gVar;
    }

    /* renamed from: a */
    public final List<C6161ad> mo10010a(IFrameSlot.EnumC6146b bVar) {
        return m10437a(this.f11872a.f11874b.get(bVar));
    }

    /* renamed from: b */
    public final AbstractC6190x mo10012b(IIconSlot.EnumC6149b bVar) {
        return this.f11872a.f11875c.get(bVar);
    }

    /* renamed from: a */
    public final List<C6161ad> mo10011a(IIconSlot.EnumC6149b bVar) {
        return m10437a(this.f11872a.f11873a.get(bVar));
    }

    /* renamed from: a */
    private static List<C6161ad> m10437a(List<AbstractC6191y> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (AbstractC6191y yVar : list) {
            C6161ad adVar = new C6161ad();
            adVar.f15391b = yVar;
            adVar.f15390a = 1;
            arrayList.add(adVar);
        }
        return arrayList;
    }
}
