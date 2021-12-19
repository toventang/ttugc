package com.bytedance.monitor.collector;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.monitor.collector.m */
public final class C21508m {
    static {
        Covode.recordClassIndex(25135);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.monitor.collector.m$a */
    public static class C21510a implements Comparable<C21510a> {

        /* renamed from: a */
        boolean f51050a;

        /* renamed from: b */
        int f51051b;

        /* renamed from: c */
        long f51052c;

        /* renamed from: d */
        long f51053d;

        /* renamed from: e */
        long f51054e;

        /* renamed from: f */
        long f51055f;

        /* renamed from: g */
        long f51056g;

        static {
            Covode.recordClassIndex(25137);
        }

        public final String toString() {
            String str;
            StringBuilder append = new StringBuilder().append(this.f51051b).append(",");
            if (this.f51050a) {
                str = "sys";
            } else {
                str = "app";
            }
            return append.append(str).append(",").append(this.f51052c).append(",").append(this.f51053d).append(",").append(this.f51054e).append(",").append(this.f51055f).toString();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C21510a aVar) {
            long j = this.f51053d;
            long j2 = aVar.f51053d;
            if (j > j2) {
                return 1;
            }
            if (j == j2) {
                return 0;
            }
            return -1;
        }

        public C21510a(boolean z, int i, long j, long j2, long j3, long j4) {
            this.f51050a = z;
            this.f51051b = i;
            this.f51052c = j;
            this.f51053d = j2;
            this.f51054e = j3;
            this.f51055f = j4;
            this.f51056g = (j3 - j2) / 1000000;
        }
    }

    /* renamed from: a */
    private static String m40406a(List<C21510a> list, long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = (long) (((float) j) * 0.3f);
        LinkedList linkedList = new LinkedList();
        for (C21510a aVar : list) {
            if (aVar.f51054e - aVar.f51053d >= j2) {
                linkedList.add(aVar);
            }
        }
        Collections.sort(linkedList, new Comparator<C21510a>() {
            /* class com.bytedance.monitor.collector.C21508m.C215091 */

            static {
                Covode.recordClassIndex(25136);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C21510a aVar, C21510a aVar2) {
                C21510a aVar3 = aVar;
                C21510a aVar4 = aVar2;
                return Long.compare(((long) (aVar4.f51051b + 1)) * (aVar4.f51054e - aVar4.f51053d), ((long) (aVar3.f51051b + 1)) * (aVar3.f51054e - aVar3.f51053d));
            }
        });
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add(list.get(0));
        }
        Iterator it = linkedList.iterator();
        if (it.hasNext()) {
            sb.append(((C21510a) it.next()).f51052c + "\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m40405a(String str, StringBuilder sb, long j) {
        LinkedList linkedList = new LinkedList();
        for (String str2 : str.split("\n")) {
            String[] split = str2.split(",");
            if (split != null && split.length >= 6) {
                linkedList.add(new C21510a(split[1].startsWith("sys"), Integer.parseInt(split[0]), Long.parseLong(split[2]), Long.parseLong(split[3]), Long.parseLong(split[4]), Long.parseLong(split[5])));
            }
        }
        Collections.sort(linkedList);
        while (linkedList.size() > 1000) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (((C21510a) it.next()).f51056g < 21) {
                    it.remove();
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            sb.append(((C21510a) it2.next()).toString()).append('\n');
        }
        if (linkedList.size() == 0) {
            return null;
        }
        return m40406a(linkedList, j);
    }
}
