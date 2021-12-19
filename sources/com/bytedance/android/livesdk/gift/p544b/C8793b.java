package com.bytedance.android.livesdk.gift.p544b;

import com.bytedance.android.livesdk.gift.p544b.C8789a;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.b.b */
public final class C8793b {
    static {
        Covode.recordClassIndex(9671);
    }

    /* JADX WARN: Init of enum SHOW can be incorrect */
    /* renamed from: com.bytedance.android.livesdk.gift.b.b$a */
    public enum EnumC8794a {
        SHOW("Show the gift icon", r3),
        TOAST("Show the toast but not the low age Dialog", null);
        

        /* renamed from: a */
        String f21669a;

        /* renamed from: b */
        List<C8789a.C8792c> f21670b;

        static {
            Covode.recordClassIndex(9672);
            LinkedList linkedList = new LinkedList();
            linkedList.add(new C8789a.C8792c(C8789a.EnumC8791b.YES, C8789a.EnumC8791b.WHATEVER, C8789a.EnumC8791b.YES, C8789a.EnumC8791b.WHATEVER, C8789a.EnumC8791b.YES));
            C8789a.EnumC8791b bVar = C8789a.EnumC8791b.NO;
            C8789a.EnumC8791b bVar2 = C8789a.EnumC8791b.WHATEVER;
            C8789a.EnumC8791b bVar3 = C8789a.EnumC8791b.YES;
            linkedList.add(new C8789a.C8792c(bVar, bVar2, bVar3, bVar3, C8789a.EnumC8791b.YES));
        }

        private EnumC8794a(String str, List list) {
            this.f21669a = str;
            this.f21670b = list;
        }
    }

    /* renamed from: a */
    public static EnumC8794a m17101a(boolean z, boolean z2, boolean z3) {
        C8789a.C8792c b = C8789a.m17099b(z, z2, z3);
        EnumC8794a[] values = EnumC8794a.values();
        for (EnumC8794a aVar : values) {
            if (aVar.f21670b != null) {
                boolean z4 = false;
                for (C8789a.C8792c cVar : aVar.f21670b) {
                    if (cVar.mo15076a(b)) {
                        z4 = true;
                    }
                }
                if (z4) {
                    return aVar;
                }
            }
        }
        return EnumC8794a.TOAST;
    }
}
