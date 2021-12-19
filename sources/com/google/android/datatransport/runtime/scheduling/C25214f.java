package com.google.android.datatransport.runtime.scheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.EnumC25111d;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25218c;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.f */
public final class C25214f implements AbstractC88078c<AbstractC25223g> {

    /* renamed from: a */
    private final AbstractC89405a<AbstractC25148a> f59699a;

    static {
        Covode.recordClassIndex(30580);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        AbstractC25223g.C25224a a = new AbstractC25223g.C25224a().mo41211a(EnumC25111d.DEFAULT, AbstractC25223g.AbstractC25225b.m48378d().mo41206a(30000).mo41205a().mo41208b()).mo41211a(EnumC25111d.HIGHEST, AbstractC25223g.AbstractC25225b.m48378d().mo41206a(1000).mo41205a().mo41208b()).mo41211a(EnumC25111d.VERY_LOW, AbstractC25223g.AbstractC25225b.m48378d().mo41206a(86400000).mo41205a().mo41207a(Collections.unmodifiableSet(new HashSet(Arrays.asList(AbstractC25223g.EnumC25227c.NETWORK_UNMETERED, AbstractC25223g.EnumC25227c.DEVICE_IDLE)))).mo41208b());
        a.f59723a = this.f59699a.get();
        Objects.requireNonNull(a.f59723a, "missing required property: clock");
        if (a.f59724b.keySet().size() >= EnumC25111d.values().length) {
            Map<EnumC25111d, AbstractC25223g.AbstractC25225b> map = a.f59724b;
            a.f59724b = new HashMap();
            return C88081f.m153153a(new C25218c(a.f59723a, map), "Cannot return null from a non-@Nullable @Provides method");
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }

    public C25214f(AbstractC89405a<AbstractC25148a> aVar) {
        this.f59699a = aVar;
    }
}
