package com.bytedance.android.livesdk.gifttray.p555b;

import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.gifttray.p557d.C8899b;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gifttray.b.a */
public final class C8877a {

    /* renamed from: a */
    public static final C8877a f21879a = new C8877a();

    private C8877a() {
    }

    static {
        Covode.recordClassIndex(9761);
    }

    /* renamed from: a */
    public static void m17206a(C8871a aVar, LinkedList<C8871a> linkedList) {
        int i;
        int size = linkedList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (linkedList.get(size).f21837b >= aVar.f21837b) {
                i = size + 1;
                break;
            } else {
                size--;
            }
        }
        linkedList.add(i, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.b.a$a */
    public static final class C8878a<T> implements Comparator {

        /* renamed from: a */
        public static final C8878a f21880a = new C8878a();

        static {
            Covode.recordClassIndex(9762);
        }

        C8878a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C8871a aVar = (C8871a) obj;
            C8871a aVar2 = (C8871a) obj2;
            int b = C8899b.m17244b(aVar);
            int b2 = C8899b.m17244b(aVar2);
            if (b < b2) {
                return 1;
            }
            if (b > b2 || C8899b.m17245c(aVar2) >= C8899b.m17245c(aVar)) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: a */
    public static C8871a m17205a(String str, LinkedList<C8871a> linkedList) {
        Iterator<C8871a> it = linkedList.iterator();
        C89219l.m154716b(it, "");
        while (it.hasNext()) {
            C8871a next = it.next();
            C89219l.m154716b(next, "");
            C8871a aVar = next;
            if (C89219l.m154714a((Object) aVar.f21836a, (Object) str)) {
                it.remove();
                return aVar;
            }
        }
        return null;
    }
}
