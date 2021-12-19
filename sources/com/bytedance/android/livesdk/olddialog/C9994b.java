package com.bytedance.android.livesdk.olddialog;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.C6889az;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.p621a.C10635b;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.olddialog.b */
final /* synthetic */ class C9994b implements AbstractC1214u {

    /* renamed from: a */
    private final C9991a f24288a;

    static {
        Covode.recordClassIndex(11548);
    }

    C9994b(C9991a aVar) {
        this.f24288a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C9991a aVar = this.f24288a;
        C10700d dVar = (C10700d) obj;
        dVar.f25767i = aVar.f24273c.f24295b;
        dVar.f25768j = aVar.f24274d;
        if (dVar.f25759a == GiftDialogViewModel.EnumC10039a.GIFT) {
            C10715e eVar = C10715e.f25799h;
            long j = dVar.f25760b;
            boolean z = dVar.f25769k;
            String str = aVar.f24274d;
            String str2 = dVar.f25770l;
            String str3 = dVar.f25773o;
            Boolean.valueOf(C10635b.C10636a.C10637a.f25639a.f25638a);
            eVar.mo17643a(j, false, z, str, str2, str3);
        }
        if (aVar.f27010p != null) {
            aVar.f27010p.mo28320c(C6889az.class, dVar);
        }
    }
}
