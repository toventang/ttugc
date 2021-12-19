package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.bz */
public final class C25416bz {

    /* renamed from: a */
    public static final Status f60306a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b */
    static final BasePendingResult<?>[] f60307b = new BasePendingResult[0];

    /* renamed from: c */
    final Set<BasePendingResult<?>> f60308c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final AbstractC25419ca f60309d = new C25415by(this);

    /* renamed from: e */
    private final Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> f60310e;

    static {
        Covode.recordClassIndex(30815);
    }

    /* renamed from: a */
    public final void mo41637a() {
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f60308c.toArray(f60307b);
        for (BasePendingResult basePendingResult : basePendingResultArr) {
            basePendingResult.mo41540a((AbstractC25419ca) null);
            basePendingResult.mo41545c();
            if (basePendingResult.mo41547d()) {
                this.f60308c.remove(basePendingResult);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41638a(BasePendingResult<? extends AbstractC25485p> basePendingResult) {
        this.f60308c.add(basePendingResult);
        basePendingResult.mo41540a(this.f60309d);
    }

    public C25416bz(Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> map) {
        this.f60310e = map;
    }
}
