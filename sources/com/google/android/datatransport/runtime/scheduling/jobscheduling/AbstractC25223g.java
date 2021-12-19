package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.EnumC25111d;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25219d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
public abstract class AbstractC25223g {
    static {
        Covode.recordClassIndex(30591);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC25148a mo41194a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Map<EnumC25111d, AbstractC25225b> mo41195b();

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b */
    public static abstract class AbstractC25225b {

        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$b$a */
        public static abstract class AbstractC25226a {
            static {
                Covode.recordClassIndex(30594);
            }

            /* renamed from: a */
            public abstract AbstractC25226a mo41205a();

            /* renamed from: a */
            public abstract AbstractC25226a mo41206a(long j);

            /* renamed from: a */
            public abstract AbstractC25226a mo41207a(Set<EnumC25227c> set);

            /* renamed from: b */
            public abstract AbstractC25225b mo41208b();
        }

        static {
            Covode.recordClassIndex(30593);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract long mo41199a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo41200b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<EnumC25227c> mo41201c();

        /* renamed from: d */
        public static AbstractC25226a m48378d() {
            return new C25219d.C25220a().mo41207a(Collections.emptySet());
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$c */
    public enum EnumC25227c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING;

        static {
            Covode.recordClassIndex(30595);
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g$a */
    public static class C25224a {

        /* renamed from: a */
        public AbstractC25148a f59723a;

        /* renamed from: b */
        public Map<EnumC25111d, AbstractC25225b> f59724b = new HashMap();

        static {
            Covode.recordClassIndex(30592);
        }

        /* renamed from: a */
        public final C25224a mo41211a(EnumC25111d dVar, AbstractC25225b bVar) {
            this.f59724b.put(dVar, bVar);
            return this;
        }
    }

    /* renamed from: a */
    public final long mo41210a(EnumC25111d dVar, long j, int i) {
        long a = j - mo41194a().mo41134a();
        AbstractC25225b bVar = mo41195b().get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * bVar.mo41199a(), a), bVar.mo41200b());
    }
}
