package com.bytedance.p1562p.p1563a;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.block.p766a.C12377h;
import com.bytedance.apm.block.p766a.C12378i;
import com.bytedance.apm.p776h.C12490f;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.bytedance.p.a.a */
public final class C21608a {

    /* renamed from: com.bytedance.p.a.a$a */
    public interface AbstractC21610a {
        static {
            Covode.recordClassIndex(25251);
        }

        /* renamed from: a */
        void mo35273a(List<C12377h> list, int i);

        /* renamed from: a */
        boolean mo35274a(long j, int i);
    }

    static {
        Covode.recordClassIndex(25249);
    }

    /* renamed from: a */
    private static boolean m40550a(long j) {
        return ((j >> 63) & 1) == 1;
    }

    /* renamed from: b */
    private static int m40551b(long j) {
        return (int) ((j >> 43) & 1048575);
    }

    /* renamed from: com.bytedance.p.a.a$b */
    public static final class C21611b {

        /* renamed from: a */
        C12377h f51247a;

        /* renamed from: b */
        C21611b f51248b;

        /* renamed from: c */
        LinkedList<C21611b> f51249c = new LinkedList<>();

        static {
            Covode.recordClassIndex(25252);
        }

        /* renamed from: a */
        public final int mo35275a() {
            C12377h hVar = this.f51247a;
            if (hVar == null) {
                return 0;
            }
            return hVar.f29850d;
        }

        /* renamed from: b */
        public final int mo35277b() {
            if (this.f51249c.isEmpty()) {
                return this.f51247a.f29848b;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.f51249c.size(); i2++) {
                i += this.f51249c.get(i2).f51247a.f29848b;
            }
            return this.f51247a.f29848b - i;
        }

        /* renamed from: a */
        public final void mo35276a(C21611b bVar) {
            this.f51249c.addFirst(bVar);
        }

        C21611b(C12377h hVar, C21611b bVar) {
            this.f51247a = hVar;
            this.f51248b = bVar;
        }
    }

    /* renamed from: a */
    public static void m40547a(List<C12377h> list) {
        ListIterator<C12377h> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C12377h previous = listIterator.previous();
            if (previous != null && previous.f29848b <= 0) {
                listIterator.remove();
            }
        }
    }

    /* renamed from: b */
    public static void m40552b(List<C12377h> list) {
        ListIterator<C12377h> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().f29848b < 5) {
                listIterator.remove();
            }
        }
    }

    /* renamed from: c */
    public static String m40554c(List<C12377h> list) {
        StringBuilder sb = new StringBuilder();
        HashSet hashSet = new HashSet();
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList, new Comparator<C12377h>() {
            /* class com.bytedance.p1562p.p1563a.C21608a.C216091 */

            static {
                Covode.recordClassIndex(25250);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C12377h hVar, C12377h hVar2) {
                int i = hVar2.f29852f;
                int i2 = hVar.f29852f;
                if (i < i2) {
                    return -1;
                }
                if (i == i2) {
                    return 0;
                }
                return 1;
            }
        });
        for (int i = 0; i < linkedList.size(); i++) {
            int i2 = ((C12377h) linkedList.get(i)).f29847a;
            if (i2 != 1048574) {
                if (((C12377h) linkedList.get(i)).f29852f < 16 || hashSet.size() >= 5) {
                    break;
                }
                hashSet.add(Integer.valueOf(i2));
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            sb.append(num).append("\n");
            C12378i.C12380a.f29863a.mo20140a(num.intValue());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static int m40543a(LinkedList<C12377h> linkedList, C12377h hVar) {
        C12377h peek;
        int i;
        if (linkedList.isEmpty() || (peek = linkedList.peek()) == null || peek.f29847a != hVar.f29847a || peek.f29850d != hVar.f29850d || hVar.f29850d == 0) {
            linkedList.push(hVar);
            return hVar.f29848b;
        }
        if (hVar.f29848b == 5000) {
            i = peek.f29848b;
        } else {
            i = hVar.f29848b;
        }
        hVar.f29848b = i;
        peek.mo20136a((long) hVar.f29848b);
        return peek.f29848b;
    }

    /* renamed from: a */
    private static int m40544a(LinkedList<C12377h> linkedList, C21611b bVar) {
        ListIterator<C12377h> listIterator = linkedList.listIterator(0);
        C21611b bVar2 = null;
        int i = 0;
        while (listIterator.hasNext()) {
            C21611b bVar3 = new C21611b(listIterator.next(), bVar2);
            i++;
            if (bVar2 != null || bVar3.mo35275a() == 0) {
                int a = bVar3.mo35275a();
                if (bVar2 == null || a == 0) {
                    bVar.mo35276a(bVar3);
                } else if (bVar2.mo35275a() >= a) {
                    while (true) {
                        if (bVar2.mo35275a() > a) {
                            bVar2 = bVar2.f51248b;
                            if (bVar2 == null) {
                                break;
                            }
                        } else if (bVar2.f51248b != null) {
                            bVar3.f51248b = bVar2.f51248b;
                            bVar2.f51248b.mo35276a(bVar3);
                        }
                    }
                } else {
                    bVar2.mo35276a(bVar3);
                }
                bVar2 = bVar3;
            } else {
                if (C12397c.m22288e()) {
                    C12490f.m22458c("[stackToTree] SceneMethodsInfo begin error! why the first node'depth is not 0!", new Object[0]);
                }
                return 0;
            }
        }
        C12490f.m22456a("[stackToTree] count [%d] ", Integer.valueOf(i));
        return i;
    }

    /* renamed from: a */
    public static long m40545a(LinkedList<C12377h> linkedList, StringBuilder sb) {
        Iterator<C12377h> it = linkedList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C12377h next = it.next();
            sb.append(next.toString()).append('\n');
            if (j < ((long) next.f29848b)) {
                j = (long) next.f29848b;
            }
        }
        return j;
    }

    /* renamed from: a */
    private static void m40546a(C21611b bVar, LinkedList<C12377h> linkedList) {
        LinkedList linkedList2 = new LinkedList();
        while (bVar != null) {
            if (bVar.f51247a != null) {
                bVar.f51247a.f29852f = bVar.mo35277b();
                linkedList.add(bVar.f51247a);
            }
            LinkedList<C21611b> linkedList3 = bVar.f51249c;
            if (!linkedList3.isEmpty()) {
                for (int size = linkedList3.size() - 1; size >= 0; size--) {
                    linkedList2.add(linkedList3.get(size));
                }
            }
            bVar = (C21611b) linkedList2.pollLast();
        }
    }

    /* renamed from: a */
    public static void m40548a(List<C12377h> list, AbstractC21610a aVar) {
        int size = list.size();
        int i = 1;
        while (size > 30) {
            ListIterator<C12377h> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (aVar.mo35274a((long) listIterator.previous().f29848b, i)) {
                    listIterator.remove();
                    size--;
                    if (size <= 30) {
                        return;
                    }
                }
            }
            size = list.size();
            i++;
            if (60 < i) {
                break;
            }
        }
        int size2 = list.size();
        if (size2 > 30) {
            aVar.mo35273a(list, size2);
        }
    }

    /* renamed from: a */
    public static void m40549a(long[] jArr, LinkedList<C12377h> linkedList, long j) {
        m40553b(jArr, linkedList, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m40553b(long[] r21, java.util.LinkedList<com.bytedance.apm.block.p766a.C12377h> r22, long r23) {
        /*
        // Method dump skipped, instructions count: 557
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1562p.p1563a.C21608a.m40553b(long[], java.util.LinkedList, long):void");
    }
}
