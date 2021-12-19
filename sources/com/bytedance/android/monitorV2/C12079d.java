package com.bytedance.android.monitorV2;

import android.util.LruCache;
import com.bytedance.android.monitorV2.p735h.p736a.C12099b;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.d */
public final class C12079d {

    /* renamed from: a */
    public static final C12079d f28944a;

    /* renamed from: b */
    private static final int f28945b;

    /* renamed from: c */
    private static final LruCache<String, String> f28946c;

    private C12079d() {
    }

    static {
        Covode.recordClassIndex(13808);
        C12079d dVar = new C12079d();
        f28944a = dVar;
        int maxMemory = ((int) Runtime.getRuntime().maxMemory()) / 1024;
        f28945b = maxMemory;
        f28946c = new C12080a(dVar, maxMemory / 8);
    }

    /* renamed from: com.bytedance.android.monitorV2.d$a */
    public static final class C12080a extends LruCache<String, String> {

        /* renamed from: a */
        final /* synthetic */ C12079d f28947a;

        static {
            Covode.recordClassIndex(13809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12080a(C12079d dVar, int i) {
            super(i);
            this.f28947a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public final /* synthetic */ int sizeOf(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            int i = 0;
            if (str3 == null) {
                return 0;
            }
            int length = str3.length();
            if (str4 != null) {
                i = str4.length();
            }
            return length + i;
        }
    }

    /* renamed from: a */
    public static String m21505a(String str, List<C12099b> list) {
        C89219l.m154719c(str, "");
        if (list == null || list.isEmpty()) {
            return "";
        }
        String str2 = f28946c.get(str);
        if (str2 != null) {
            System.out.println((Object) "hit cache: ".concat(String.valueOf(str2)));
            return str2;
        }
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        for (T t : list) {
            if (t.f29074b.containsMatchIn(str)) {
                System.out.print((Object) (t.f29074b + " match " + t.f29073a));
                f28946c.put(str, t.f29073a);
                return t.f29073a;
            }
        }
        return "";
    }
}
