package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.p */
public final class C25560p {
    static {
        Covode.recordClassIndex(30963);
    }

    /* renamed from: com.google.android.gms.common.internal.p$a */
    public static final class C25561a {

        /* renamed from: a */
        private final List<String> f60633a;

        /* renamed from: b */
        private final Object f60634b;

        static {
            Covode.recordClassIndex(30964);
        }

        public final String toString() {
            StringBuilder append = new StringBuilder(100).append(this.f60634b.getClass().getSimpleName()).append('{');
            int size = this.f60633a.size();
            for (int i = 0; i < size; i++) {
                append.append(this.f60633a.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
            }
            return append.append('}').toString();
        }

        private C25561a(Object obj) {
            this.f60634b = C25565r.m49314a(obj);
            this.f60633a = new ArrayList();
        }

        /* synthetic */ C25561a(Object obj, byte b) {
            this(obj);
        }

        /* renamed from: a */
        public final C25561a mo41827a(String str, Object obj) {
            List<String> list = this.f60633a;
            String str2 = (String) C25565r.m49314a((Object) str);
            String valueOf = String.valueOf(obj);
            list.add(new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
            return this;
        }
    }

    /* renamed from: a */
    public static int m49306a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C25561a m49307a(Object obj) {
        return new C25561a(obj, (byte) 0);
    }

    /* renamed from: a */
    public static boolean m49308a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
