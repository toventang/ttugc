package com.bytedance.ies.powerpermissions;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.i */
public abstract class AbstractC17769i extends AbstractC17764e {
    static {
        Covode.recordClassIndex(20333);
    }

    /* renamed from: a */
    public abstract void mo28242a(C17775m mVar, C17749a... aVarArr);

    @Override // com.bytedance.ies.powerpermissions.AbstractC17764e
    /* renamed from: a */
    public final void mo28239a(C17775m mVar, String... strArr) {
        Context context;
        C17749a aVar;
        C89219l.m154719c(strArr, "");
        ArrayList arrayList = new ArrayList();
        AbstractC17751d dVar = null;
        if (mVar != null) {
            dVar = mVar.mo28248c();
        }
        if ((dVar instanceof Fragment) && (context = ((Fragment) dVar).getContext()) != null) {
            for (String str : strArr) {
                if (C17770j.m32957a(context, str)) {
                    aVar = new C17749a(str, C17749a.EnumC17750a.GRANTED);
                } else if (C17770j.m32954a((Activity) context, str)) {
                    aVar = new C17749a(str, C17749a.EnumC17750a.DENIED_PERMANENT);
                } else {
                    aVar = new C17749a(str, C17749a.EnumC17750a.THIS_OPERATION_NOT_PERMITTED);
                }
                arrayList.add(aVar);
            }
            Object[] array = arrayList.toArray(new C17749a[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            C17749a[] aVarArr = (C17749a[]) array;
            mo28242a(mVar, (C17749a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }
}
