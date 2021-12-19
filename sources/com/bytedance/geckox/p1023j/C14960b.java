package com.bytedance.geckox.p1023j;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.p1012b.C14884b;
import com.bytedance.geckox.p1026m.AbstractC14969a;
import com.bytedance.geckox.p1026m.C14970b;
import com.bytedance.geckox.statistic.C15035c;
import com.bytedance.geckox.statistic.model.C15040b;
import com.bytedance.geckox.utils.C15052e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.geckox.j.b */
public final class C14960b {

    /* renamed from: a */
    public static Map<String, ConcurrentHashMap<String, C14959a>> f36542a = new ConcurrentHashMap();

    /* renamed from: b */
    static Map<String, File> f36543b = new ConcurrentHashMap();

    /* renamed from: c */
    public static Map<String, Boolean> f36544c = new ConcurrentHashMap();

    /* renamed from: d */
    public static boolean f36545d;

    /* renamed from: e */
    public static int f36546e = 7;

    /* renamed from: f */
    public static int f36547f;

    /* renamed from: g */
    public static Map<String, ? extends ArrayList<String>> f36548g;

    /* renamed from: h */
    public static C14970b f36549h = new C14970b("meta-timer-task");

    /* renamed from: i */
    public static final C14960b f36550i = new C14960b();

    /* renamed from: com.bytedance.geckox.j.b$b */
    public static final class C14962b extends AbstractC14969a<Void> {
        static {
            Covode.recordClassIndex(17075);
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: a */
        public final int mo24079a() {
            return 5;
        }

        C14962b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
            if (r6 == null) goto L_0x00ed;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8 A[SYNTHETIC, Splitter:B:26:0x00c8] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0011 A[SYNTHETIC] */
        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo24080b() {
            /*
            // Method dump skipped, instructions count: 245
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p1023j.C14960b.C14962b.mo24080b():void");
        }
    }

    private C14960b() {
    }

    static {
        Covode.recordClassIndex(17073);
    }

    /* renamed from: com.bytedance.geckox.j.b$a */
    public static final class C14961a extends AbstractC14969a<Void> {

        /* renamed from: a */
        final /* synthetic */ long f36551a;

        static {
            Covode.recordClassIndex(17074);
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: a */
        public final int mo24079a() {
            return 5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.geckox.j.a>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: b */
        public final void mo24080b() {
            Map<String, ? extends ArrayList<String>> map = C14960b.f36548g;
            if (map == null) {
                C89219l.m154707a();
            }
            for (String str : map.keySet()) {
                if (C14960b.m27548a(str) == null && !C14960b.m27550b(str)) {
                    Map<String, ? extends ArrayList<String>> map2 = C14960b.f36548g;
                    if (map2 == null) {
                        C89219l.m154707a();
                    }
                    ArrayList arrayList = (ArrayList) map2.get(str);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            concurrentHashMap.put(it.next(), new C14959a(this.f36551a, false, 2, null));
                        }
                        C14960b.f36544c.put(str, true);
                        C14960b.f36542a.put(str, concurrentHashMap);
                    }
                }
            }
            C14960b.f36549h.mo24085a(new C14962b());
        }

        public C14961a(long j) {
            this.f36551a = j;
        }
    }

    /* renamed from: b */
    public static boolean m27550b(String str) {
        if (f36543b.get(str) != null) {
            return true;
        }
        File file = new File(C14930f.m27473a().f36475a.get(str) + File.separator + str + File.separator + "metaData.json");
        if (!file.exists()) {
            return false;
        }
        f36543b.put(str, file);
        return true;
    }

    /* renamed from: a */
    public static long m27547a(boolean z) {
        int i;
        long j = 0;
        if (!f36545d) {
            return 0;
        }
        int i2 = f36546e * 24 * 60 * 60 * 1000;
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, ConcurrentHashMap<String, C14959a>> entry : f36542a.entrySet()) {
            String key = entry.getKey();
            String str = C14930f.m27473a().f36475a.get(key) + File.separator + key;
            for (Map.Entry<String, C14959a> entry2 : entry.getValue().entrySet()) {
                String key2 = entry2.getKey();
                C14959a value = entry2.getValue();
                if (currentTimeMillis - value.lastReadTimeStamp >= ((long) i2)) {
                    File file = new File(str, key2);
                    if (file.exists()) {
                        j += C15052e.m27715d(file);
                        if (z) {
                            value.allowUpdate = false;
                            f36544c.put(key, true);
                            long currentTimeMillis2 = System.currentTimeMillis();
                            boolean a = C14884b.m27329a(file.getAbsolutePath());
                            long currentTimeMillis3 = System.currentTimeMillis();
                            if (a) {
                                i = 202;
                            } else {
                                i = 203;
                            }
                            C15035c.m27682a(new C15040b(key2, currentTimeMillis3 - currentTimeMillis2, i, f36546e, f36547f));
                        }
                    }
                }
            }
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a A[SYNTHETIC, Splitter:B:41:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a0 A[SYNTHETIC, Splitter:B:50:0x00a0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.geckox.p1023j.C14959a> m27548a(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p1023j.C14960b.m27548a(java.lang.String):java.util.concurrent.ConcurrentHashMap");
    }

    /* renamed from: a */
    public static void m27549a(String str, String str2, String str3, String str4, String str5, long j) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str4, "");
        C89219l.m154719c(str5, "");
        ConcurrentHashMap<String, C14959a> concurrentHashMap = f36542a.get(str);
        if (concurrentHashMap == null || concurrentHashMap.get(str2) == null) {
            C15035c.m27683a(str, str2, str3, str4, str5, "false", 0, 0);
            return;
        }
        C14959a aVar = concurrentHashMap.get(str2);
        if (aVar == null) {
            C89219l.m154707a();
        }
        C89219l.m154709a((Object) aVar, "");
        C14959a aVar2 = aVar;
        C15035c.m27683a(str, str2, str3, str4, str5, String.valueOf(!aVar2.allowUpdate), f36546e, f36547f);
        if (aVar2.allowUpdate) {
            aVar2.lastReadTimeStamp = j;
        } else {
            aVar2.allowUpdate = true;
        }
        f36544c.put(str, true);
    }
}
