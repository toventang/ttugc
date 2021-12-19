package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.s */
public class C46109s {

    /* renamed from: c */
    private static C46109s f107367c;

    /* renamed from: a */
    public List<C46108r> f107368a;

    /* renamed from: b */
    public int f107369b;

    static {
        Covode.recordClassIndex(54667);
    }

    /* renamed from: b */
    public final C46108r mo78297b() {
        if (this.f107369b == this.f107368a.size()) {
            this.f107369b = 0;
        }
        return this.f107368a.get(this.f107369b);
    }

    /* renamed from: a */
    public static C46109s m88954a() {
        MethodCollector.m26663i(11690);
        if (f107367c == null) {
            synchronized (C46109s.class) {
                try {
                    if (f107367c == null) {
                        f107367c = new C46109s();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11690);
                    throw th;
                }
            }
        }
        C46109s sVar = f107367c;
        MethodCollector.m26664o(11690);
        return sVar;
    }

    private C46109s() {
        ArrayList arrayList = new ArrayList();
        this.f107368a = arrayList;
        arrayList.add(new C46108r(new int[]{-16716612, -16745761}, -1, -1056964609));
        this.f107368a.add(new C46108r(new int[]{-20071, -55717}, -1, -1056964609));
        this.f107368a.add(new C46108r(new int[]{-14625300, -5938690, -119723}, -1, -1056964609));
        this.f107368a.add(new C46108r(new int[]{-468142, -42147}, -1, -1056964609));
        this.f107368a.add(new C46108r(new int[]{-16352892, -15726275}, -1, -1056964609));
        this.f107368a.add(new C46108r(new int[]{-1773591, -7100977}, -16777216, 1442840576));
        this.f107368a.add(new C46108r(new int[]{-12369085, -16777216}, -1, -1056964609));
    }
}
