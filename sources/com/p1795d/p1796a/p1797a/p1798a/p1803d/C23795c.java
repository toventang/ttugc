package com.p1795d.p1796a.p1797a.p1798a.p1803d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23783a;
import com.p1795d.p1796a.p1797a.p1798a.p1803d.AbstractC23792a;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23798b;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23802e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.d.c */
public final class C23795c implements AbstractC23792a {

    /* renamed from: a */
    private final AbstractC23792a f56297a;

    static {
        Covode.recordClassIndex(27903);
    }

    public C23795c(AbstractC23792a aVar) {
        this.f56297a = aVar;
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1803d.AbstractC23792a
    /* renamed from: a */
    public final JSONObject mo39261a(View view) {
        return C23798b.m44982a(0, 0, 0, 0);
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1803d.AbstractC23792a
    /* renamed from: a */
    public final void mo39262a(View view, JSONObject jSONObject, AbstractC23792a.AbstractC23793a aVar, boolean z) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        C23783a aVar2 = C23783a.f56269a;
        if (aVar2 != null) {
            Collection<C23781l> unmodifiableCollection = Collections.unmodifiableCollection(aVar2.f56271c);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            for (C23781l lVar : unmodifiableCollection) {
                View c = lVar.mo39245c();
                if (c != null && C23802e.m44998b(c) && (rootView = c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a = C23802e.m44997a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C23802e.m44997a((View) arrayList.get(size - 1)) > a) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.mo39263a((View) it.next(), this.f56297a, jSONObject);
        }
    }
}
