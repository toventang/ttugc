package com.bytedance.apm.p778j;

import com.bytedance.apm.p775g.AbstractC12473a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.apm.j.a */
public class C12511a {

    /* renamed from: b */
    private static volatile C12511a f30380b;

    /* renamed from: a */
    public CopyOnWriteArraySet<AbstractC12473a> f30381a = new CopyOnWriteArraySet<>();

    static {
        Covode.recordClassIndex(14327);
    }

    private C12511a() {
    }

    /* renamed from: a */
    public static C12511a m22484a() {
        if (f30380b == null) {
            synchronized (C12511a.class) {
                if (f30380b == null) {
                    f30380b = new C12511a();
                }
            }
        }
        return f30380b;
    }
}
