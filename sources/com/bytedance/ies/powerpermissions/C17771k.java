package com.bytedance.ies.powerpermissions;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.p1238a.C17743a;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.k */
public final class C17771k implements AbstractC17748c {

    /* renamed from: c */
    public static final C17772a f42433c = new C17772a((byte) 0);

    /* renamed from: a */
    public WeakReference<ActivityC0945e> f42434a;

    /* renamed from: b */
    PrivacyCert f42435b;

    /* renamed from: d */
    private final List<String> f42436d = new LinkedList();

    /* renamed from: e */
    private final C17775m f42437e = new C17775m();

    static {
        Covode.recordClassIndex(20335);
    }

    /* renamed from: com.bytedance.ies.powerpermissions.k$a */
    public static final class C17772a {
        static {
            Covode.recordClassIndex(20336);
        }

        private C17772a() {
        }

        public /* synthetic */ C17772a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17748c
    /* renamed from: a */
    public final AbstractC17748c mo28228a(AbstractC17764e eVar) {
        C89219l.m154719c(eVar, "");
        this.f42437e.mo28246a(eVar);
        return this;
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17748c
    /* renamed from: a */
    public final AbstractC17748c mo28229a(String... strArr) {
        C89219l.m154719c(strArr, "");
        C89070n.m154536a((Collection) this.f42436d, (Object[]) strArr);
        C17768h hVar = new C17768h();
        hVar.mo28240a((String[]) Arrays.copyOf(strArr, strArr.length));
        this.f42437e.mo28246a(hVar);
        return this;
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17748c
    /* renamed from: a */
    public final void mo28230a(AbstractC17765f fVar) {
        C89219l.m154719c(fVar, "");
        WeakReference<ActivityC0945e> weakReference = this.f42434a;
        if (weakReference != null) {
            ActivityC0945e eVar = weakReference.get();
            if (eVar != null && !eVar.isFinishing()) {
                int i = Build.VERSION.SDK_INT;
                if (!eVar.isDestroyed() && (!this.f42436d.isEmpty() || !this.f42437e.f42443b.isEmpty())) {
                    Iterator<String> it = this.f42436d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!C17770j.m32957a((Context) eVar, it.next())) {
                                break;
                            }
                        } else if (this.f42437e.f42445d) {
                            C17743a.m32883a("PowerPermissions", "all granted");
                            ArrayList arrayList = new ArrayList();
                            for (String str : this.f42436d) {
                                arrayList.add(new C17749a(str, C17749a.EnumC17750a.GRANTED));
                            }
                            Object[] array = arrayList.toArray(new C17749a[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            C17749a[] aVarArr = (C17749a[]) array;
                            fVar.mo28241a((C17749a[]) Arrays.copyOf(aVarArr, aVarArr.length));
                            return;
                        }
                    }
                    if (eVar.getSupportFragmentManager().mo3551a("PermissionFragment") == null) {
                        C17744b bVar = new C17744b();
                        C17744b bVar2 = bVar;
                        C89219l.m154719c(fVar, "");
                        bVar2.f42416a = fVar;
                        C17775m mVar = this.f42437e;
                        C89219l.m154719c(mVar, "");
                        bVar2.f42418c = mVar;
                        C17775m mVar2 = this.f42437e;
                        C89219l.m154719c(bVar, "");
                        mVar2.f42444c = new WeakReference<>(bVar);
                        PrivacyCert privacyCert = this.f42435b;
                        if (privacyCert != null) {
                            C17775m mVar3 = this.f42437e;
                            C89219l.m154719c(privacyCert, "");
                            mVar3.f42446e = privacyCert;
                        }
                        C17775m mVar4 = this.f42437e;
                        List<String> list = this.f42436d;
                        C89219l.m154719c(list, "");
                        mVar4.f42442a.addAll(list);
                        eVar.getSupportFragmentManager().mo3552a().mo3456a(bVar, "PermissionFragment").mo3473c();
                        C17743a.m32883a("PowerPermissions", "try to request permissions");
                        return;
                    }
                    return;
                }
            }
            C89219l.m154719c("PowerPermissions", "");
            C89219l.m154719c("return directly", "");
            return;
        }
        C17743a.m32883a("PowerPermissions", "activity is null");
    }
}
