package com.google.p1971b.p1972a.p1986e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27160c;
import com.google.p1971b.p1972a.p1993g.C27173c;
import com.google.p1971b.p1972a.p1993g.C27185j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.b.a.e.a */
public class C27150a extends C27185j implements Cloneable {

    /* renamed from: a */
    public AbstractC27153b f64293a;

    static {
        Covode.recordClassIndex(32730);
    }

    /* renamed from: a */
    public C27150a clone() {
        return (C27150a) super.clone();
    }

    public String toString() {
        MethodCollector.m26663i(12094);
        AbstractC27153b bVar = this.f64293a;
        if (bVar != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                AbstractC27154c a = bVar.mo45197a(byteArrayOutputStream, C27173c.f64323a);
                a.mo45213a(false, this);
                a.mo45198a();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                MethodCollector.m26664o(12094);
                return byteArrayOutputStream2;
            } catch (IOException e) {
                RuntimeException a2 = C27160c.m53986a(e);
                MethodCollector.m26664o(12094);
                throw a2;
            }
        } else {
            String jVar = super.toString();
            MethodCollector.m26664o(12094);
            return jVar;
        }
    }

    @Override // com.google.p1971b.p1972a.p1993g.C27185j
    /* renamed from: a */
    public C27150a mo45179b(String str, Object obj) {
        return (C27150a) super.mo45179b(str, obj);
    }
}
