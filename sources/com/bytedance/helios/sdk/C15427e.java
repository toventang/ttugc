package com.bytedance.helios.sdk;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.AbstractC15310h;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.sdk.p1095c.C15382b;
import com.bytedance.helios.sdk.p1095c.C15384c;
import com.bytedance.helios.sdk.p1095c.C15389e;
import com.bytedance.helios.sdk.p1095c.p1096a.C15379a;
import com.bytedance.helios.sdk.p1095c.p1096a.C15380b;
import com.bytedance.helios.sdk.p1097d.AbstractC15395b;
import com.bytedance.helios.sdk.p1097d.AbstractC15412n;
import com.bytedance.helios.sdk.p1097d.C15400e;
import com.bytedance.helios.sdk.p1097d.C15402g;
import com.bytedance.helios.sdk.p1097d.C15404i;
import com.bytedance.helios.sdk.p1097d.C15408k;
import com.bytedance.helios.sdk.p1097d.C15416o;
import com.bytedance.helios.sdk.p1097d.C15420s;
import com.bytedance.helios.sdk.p1097d.C15425w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.e */
public final class C15427e {

    /* renamed from: a */
    public static final C15427e f37665a = new C15427e();

    /* renamed from: b */
    private static final SparseArray<AbstractC15395b> f37666b = new SparseArray<>();

    private C15427e() {
    }

    static {
        Covode.recordClassIndex(17679);
        C15320o.m28226a(new C15389e());
        C15320o.m28226a(AbstractC15310h.C15311a.m28212a());
        C15320o.f37382b = new C15382b();
        C15320o.f37384d = new C15384c();
        C15379a aVar = new C15379a(new C15380b());
        C89219l.m154719c(aVar, "");
        C15320o.f37383c.add(aVar);
        m28379a(new C15420s());
        m28379a(new C15402g());
        m28379a(new C15408k());
        m28379a(new C15404i());
        m28379a(new C15425w());
        m28379a(C15416o.f37637b);
    }

    /* renamed from: a */
    public static AbstractC15395b m28377a(int i) {
        return f37666b.get(i);
    }

    /* renamed from: b */
    public static C15400e m28380b(int i) {
        AbstractC15395b a = m28377a(i);
        if (a != null) {
            return a.mo25133a(i);
        }
        return null;
    }

    /* renamed from: a */
    private static void m28379a(AbstractC15395b bVar) {
        for (int i : bVar.mo25138a()) {
            f37666b.put(i, bVar);
        }
    }

    /* renamed from: a */
    public static AbstractC15412n m28378a(String str) {
        C89219l.m154719c(str, "");
        int size = f37666b.size();
        for (int i = 0; i < size; i++) {
            AbstractC15395b valueAt = f37666b.valueAt(i);
            if (valueAt instanceof AbstractC15412n) {
                AbstractC15412n nVar = (AbstractC15412n) valueAt;
                if (C89219l.m154714a((Object) nVar.mo25146b(), (Object) str)) {
                    return nVar;
                }
            }
        }
        return null;
    }
}
