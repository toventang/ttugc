package com.lynx.tasm.p2055d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.lynx.tasm.p2055d.C28751a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.d.b */
public final class C28753b {

    /* renamed from: a */
    public List<Pair<C28573r.AbstractC28575b, Integer>> f67805a = new ArrayList();

    /* renamed from: b */
    public Set<C28751a> f67806b = new HashSet();

    static {
        Covode.recordClassIndex(34852);
    }

    C28753b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49870a(Pair<C28573r.AbstractC28575b, Integer> pair) {
        this.f67805a.add(pair);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49871a(C28751a aVar) {
        this.f67806b.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo49872b(C28751a aVar) {
        if (this.f67806b.contains(aVar)) {
            return true;
        }
        loop0:
        for (C28751a aVar2 : this.f67806b) {
            if (aVar2 != aVar) {
                Iterator<Pair<C28751a.EnumC28752a, String>> it = aVar2.f67802b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Pair<C28751a.EnumC28752a, String> next = it.next();
                        Iterator<Pair<C28751a.EnumC28752a, String>> it2 = aVar.f67802b.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (next.equals(it2.next())) {
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
