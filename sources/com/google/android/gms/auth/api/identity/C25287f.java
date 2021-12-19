package com.google.android.gms.auth.api.identity;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25350d;
import com.google.android.gms.common.internal.C25565r;
import java.util.Arrays;

/* renamed from: com.google.android.gms.auth.api.identity.f */
public final class C25287f implements AbstractC25350d {

    /* renamed from: a */
    public final String f59975a;

    static {
        Covode.recordClassIndex(30669);
    }

    /* renamed from: com.google.android.gms.auth.api.identity.f$a */
    public static class C25288a {

        /* renamed from: a */
        private String f59976a;

        static {
            Covode.recordClassIndex(30670);
        }

        public C25288a() {
        }

        /* renamed from: a */
        public final C25287f mo41358a() {
            return new C25287f(this.f59976a);
        }

        public /* synthetic */ C25288a(byte b) {
            this();
        }

        /* renamed from: a */
        public final C25288a mo41357a(String str) {
            this.f59976a = C25565r.m49316a(str);
            return this;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C25287f.class});
    }

    public final boolean equals(Object obj) {
        return obj instanceof C25287f;
    }

    public C25287f(String str) {
        this.f59975a = str;
    }
}
