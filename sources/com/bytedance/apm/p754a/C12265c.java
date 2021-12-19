package com.bytedance.apm.p754a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.bytedance.apm.a.c */
public final class C12265c implements AbstractC12269f {
    static {
        Covode.recordClassIndex(14001);
    }

    /* renamed from: com.bytedance.apm.a.c$a */
    static class C12266a implements Comparable<C12266a> {

        /* renamed from: a */
        public String f29542a;

        /* renamed from: b */
        public long f29543b;

        /* renamed from: c */
        public String f29544c;

        static {
            Covode.recordClassIndex(14002);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C12266a aVar) {
            return (int) (aVar.f29543b - this.f29543b);
        }

        /* renamed from: a */
        public static C12266a m22044a(File file) {
            String str;
            long j;
            String[] split = file.getName().split("_");
            try {
                if (split.length >= 4) {
                    j = Long.parseLong(split[3]);
                    str = split[5];
                } else {
                    if (split.length > 1) {
                        j = Long.parseLong(split[0]);
                        str = split[1];
                    }
                    throw new NumberFormatException();
                }
                if (j >= 0) {
                    return new C12266a(file.getAbsolutePath(), j / 1000, str);
                }
                throw new NumberFormatException();
            } catch (NumberFormatException unused) {
                return new C12266a("INVALID_FORMAT", -1, "");
            }
        }

        private C12266a(String str, long j, String str2) {
            this.f29542a = str;
            this.f29543b = j;
            this.f29544c = str2;
        }
    }

    @Override // com.bytedance.apm.p754a.AbstractC12269f
    /* renamed from: a */
    public final List<String> mo19756a(String str, long j, long j2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && j <= j2) {
            File file = new File(str);
            if (file.exists() && file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    C12266a a = C12266a.m22044a(file2);
                    if (a.f29542a.endsWith(".hot") && !a.f29542a.equals("INVALID_FORMAT") && a.f29543b <= j2) {
                        if (!hashMap.containsKey(a.f29544c)) {
                            hashMap.put(a.f29544c, new PriorityQueue());
                        }
                        ((PriorityQueue) hashMap.get(a.f29544c)).offer(a);
                    }
                }
                for (PriorityQueue priorityQueue : hashMap.values()) {
                    while (!priorityQueue.isEmpty()) {
                        C12266a aVar = (C12266a) priorityQueue.poll();
                        arrayList.add(aVar.f29542a);
                        if (aVar.f29543b < j) {
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
