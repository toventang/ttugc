package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.EnumC25111d;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
public final class C25218c extends AbstractC25223g {

    /* renamed from: a */
    private final AbstractC25148a f59710a;

    /* renamed from: b */
    private final Map<EnumC25111d, AbstractC25223g.AbstractC25225b> f59711b;

    static {
        Covode.recordClassIndex(30586);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g
    /* renamed from: a */
    public final AbstractC25148a mo41194a() {
        return this.f59710a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g
    /* renamed from: b */
    public final Map<EnumC25111d, AbstractC25223g.AbstractC25225b> mo41195b() {
        return this.f59711b;
    }

    public final int hashCode() {
        return ((this.f59710a.hashCode() ^ 1000003) * 1000003) ^ this.f59711b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f59710a + ", values=" + this.f59711b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25223g) {
            AbstractC25223g gVar = (AbstractC25223g) obj;
            if (!this.f59710a.equals(gVar.mo41194a()) || !this.f59711b.equals(gVar.mo41195b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C25218c(AbstractC25148a aVar, Map<EnumC25111d, AbstractC25223g.AbstractC25225b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f59710a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f59711b = map;
    }
}
