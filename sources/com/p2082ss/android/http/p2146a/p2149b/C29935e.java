package com.p2082ss.android.http.p2146a.p2149b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.http.a.b.e */
public class C29935e implements Cloneable {

    /* renamed from: a */
    public List f71421a = new ArrayList(16);

    static {
        Covode.recordClassIndex(36347);
    }

    @Override // java.lang.Object
    public Object clone() {
        C29935e eVar = (C29935e) super.clone();
        eVar.f71421a = new ArrayList(this.f71421a);
        return eVar;
    }

    /* renamed from: a */
    public final void mo52260a(AbstractC29926a aVar) {
        this.f71421a.add(aVar);
    }

    /* renamed from: a */
    public final AbstractC29926a[] mo52261a(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f71421a.size(); i++) {
            AbstractC29926a aVar = (AbstractC29926a) this.f71421a.get(i);
            if (aVar.mo52240a().equalsIgnoreCase(str)) {
                arrayList.add(aVar);
            }
        }
        return (AbstractC29926a[]) arrayList.toArray(new AbstractC29926a[arrayList.size()]);
    }

    /* renamed from: b */
    public final AbstractC29926a mo52262b(String str) {
        for (int i = 0; i < this.f71421a.size(); i++) {
            AbstractC29926a aVar = (AbstractC29926a) this.f71421a.get(i);
            if (aVar.mo52240a().equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }
}
