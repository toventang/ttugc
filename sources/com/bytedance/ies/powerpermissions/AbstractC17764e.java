package com.bytedance.ies.powerpermissions;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.e */
public abstract class AbstractC17764e {

    /* renamed from: a */
    final ArrayList<String> f42429a = new ArrayList<>();

    /* renamed from: b */
    private C17775m f42430b;

    static {
        Covode.recordClassIndex(20328);
    }

    /* renamed from: a */
    public abstract void mo28239a(C17775m mVar, String... strArr);

    /* renamed from: a */
    public final void mo28237a() {
        C17775m mVar = this.f42430b;
        Object[] array = this.f42429a.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        mo28239a(mVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: a */
    public final void mo28238a(C17775m mVar) {
        C89219l.m154719c(mVar, "");
        this.f42430b = mVar;
    }

    /* renamed from: a */
    public final void mo28240a(String... strArr) {
        C89219l.m154719c(strArr, "");
        if (strArr.length != 0) {
            C89070n.m154536a((Collection) this.f42429a, (Object[]) strArr);
        }
    }
}
