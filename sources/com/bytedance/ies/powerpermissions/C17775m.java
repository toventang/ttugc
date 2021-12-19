package com.bytedance.ies.powerpermissions;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.m */
public final class C17775m {

    /* renamed from: a */
    final ArrayList<String> f42442a = new ArrayList<>();

    /* renamed from: b */
    final ArrayDeque<AbstractC17764e> f42443b = new ArrayDeque<>();

    /* renamed from: c */
    WeakReference<AbstractC17751d> f42444c;

    /* renamed from: d */
    public boolean f42445d = true;

    /* renamed from: e */
    public PrivacyCert f42446e;

    static {
        Covode.recordClassIndex(20339);
    }

    /* renamed from: b */
    public final void mo28247b() {
        AbstractC17751d c = mo28248c();
        if (c != null) {
            c.mo28224a();
        }
        this.f42443b.clear();
    }

    /* renamed from: c */
    public final AbstractC17751d mo28248c() {
        WeakReference<AbstractC17751d> weakReference = this.f42444c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo28245a() {
        AbstractC17764e poll;
        if ((!this.f42443b.isEmpty()) && (poll = this.f42443b.poll()) != null) {
            if (poll.f42429a.isEmpty()) {
                Object[] array = this.f42442a.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                poll.mo28240a((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            poll.mo28237a();
        }
    }

    /* renamed from: a */
    public final void mo28246a(AbstractC17764e eVar) {
        C89219l.m154719c(eVar, "");
        eVar.mo28238a(this);
        if (eVar instanceof AbstractC17769i) {
            this.f42443b.addFirst(eVar);
        } else {
            this.f42443b.add(eVar);
        }
        if (!(eVar instanceof C17768h)) {
            this.f42445d = false;
        }
    }
}
