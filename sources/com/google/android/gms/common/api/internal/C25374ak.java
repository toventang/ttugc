package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C25539d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.ak */
public final class C25374ak extends AbstractRunnableC25378ao {

    /* renamed from: a */
    private final ArrayList<C25335a.AbstractC25343f> f60205a;

    /* renamed from: b */
    private final /* synthetic */ C25368ae f60206b;

    static {
        Covode.recordClassIndex(30773);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC25378ao
    /* renamed from: a */
    public final void mo41578a() {
        Set<Scope> hashSet;
        C25380aq aqVar = this.f60206b.f60175a.f60253m;
        C25368ae aeVar = this.f60206b;
        if (aeVar.f60185k == null) {
            hashSet = Collections.emptySet();
        } else {
            hashSet = new HashSet<>(aeVar.f60185k.f60586b);
            Map<C25335a<?>, C25539d.C25541b> map = aeVar.f60185k.f60588d;
            for (C25335a<?> aVar : map.keySet()) {
                if (!aeVar.f60175a.f60247g.containsKey(aVar.mo41483b())) {
                    hashSet.addAll(map.get(aVar).f60605a);
                }
            }
        }
        aqVar.f60216e = hashSet;
        ArrayList<C25335a.AbstractC25343f> arrayList = this.f60205a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C25335a.AbstractC25343f fVar = arrayList.get(i);
            i++;
            fVar.mo41489a(this.f60206b.f60182h, this.f60206b.f60175a.f60253m.f60216e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25374ak(C25368ae aeVar, ArrayList<C25335a.AbstractC25343f> arrayList) {
        super(aeVar, (byte) 0);
        this.f60206b = aeVar;
        this.f60205a = arrayList;
    }
}
