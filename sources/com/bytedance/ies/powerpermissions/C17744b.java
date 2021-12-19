package com.bytedance.ies.powerpermissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.p1238a.C17743a;
import com.bytedance.ies.powerpermissions.p1239b.C17747a;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.b */
public final class C17744b extends Fragment implements AbstractC17751d {

    /* renamed from: d */
    public static final C17745a f42415d = new C17745a((byte) 0);

    /* renamed from: a */
    AbstractC17765f f42416a;

    /* renamed from: b */
    public final HashSet<String> f42417b = new HashSet<>();

    /* renamed from: c */
    C17775m f42418c;

    /* renamed from: e */
    private int f42419e;

    /* renamed from: f */
    private final HashSet<String> f42420f = new HashSet<>();

    /* renamed from: g */
    private final HashSet<String> f42421g = new HashSet<>();

    /* renamed from: h */
    private HashMap f42422h;

    static {
        Covode.recordClassIndex(20308);
    }

    /* renamed from: com.bytedance.ies.powerpermissions.b$a */
    public static final class C17745a {
        static {
            Covode.recordClassIndex(20309);
        }

        private C17745a() {
        }

        public /* synthetic */ C17745a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17751d
    /* renamed from: a */
    public final void mo28224a() {
        m32885b();
    }

    /* renamed from: com.bytedance.ies.powerpermissions.b$b */
    static final class RunnableC17746b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17744b f42423a;

        static {
            Covode.recordClassIndex(20310);
        }

        RunnableC17746b(C17744b bVar) {
            this.f42423a = bVar;
        }

        public final void run() {
            C17744b bVar = this.f42423a;
            bVar.mo28225a(bVar.f42417b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f42422h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    private final void m32885b() {
        AbstractC0952i supportFragmentManager;
        ActivityC0945e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.mo3552a().mo3455a(this).mo3473c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17775m mVar = this.f42418c;
        if (mVar != null) {
            mVar.mo28245a();
        } else {
            m32885b();
        }
    }

    /* renamed from: a */
    public final void mo28225a(HashSet<String> hashSet) {
        if (hashSet.isEmpty()) {
            m32884a(null, null);
            return;
        }
        Object[] array = hashSet.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        requestPermissions((String[]) array, this.f42419e);
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17751d
    /* renamed from: a */
    public final void mo28226a(List<String> list) {
        boolean z;
        Context context;
        C89219l.m154719c(list, "");
        C17743a.m32883a("FakeFragment", "requestPermissions");
        this.f42420f.clear();
        this.f42421g.clear();
        this.f42417b.clear();
        this.f42419e++;
        Iterator<String> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Context context2 = getContext();
            if (context2 != null) {
                C89219l.m154709a((Object) context2, "");
                if (C17770j.m32957a(context2, next)) {
                    this.f42420f.add(next);
                } else if (Build.VERSION.SDK_INT < 23 ? C89219l.m154714a((Object) "android.permission.SYSTEM_ALERT_WINDOW", (Object) next) || C89219l.m154714a((Object) "android.permission.WRITE_SETTINGS", (Object) next) || C89219l.m154714a((Object) "android.permission.MANAGE_EXTERNAL_STORAGE", (Object) next) : C89219l.m154714a((Object) "android.permission.REQUEST_INSTALL_PACKAGES", (Object) next) || C89219l.m154714a((Object) "android.permission.SYSTEM_ALERT_WINDOW", (Object) next) || C89219l.m154714a((Object) "android.permission.ACCESS_NOTIFICATION_POLICY", (Object) next) || C89219l.m154714a((Object) "android.permission.WRITE_SETTINGS", (Object) next) || C89219l.m154714a((Object) "android.permission.MANAGE_EXTERNAL_STORAGE", (Object) next)) {
                    this.f42421g.add(next);
                } else {
                    this.f42417b.add(next);
                }
            }
        }
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154709a((Object) activity, "");
            HashSet<String> hashSet = this.f42421g;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            Iterator<String> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                C89219l.m154709a((Object) next2, "");
                AbstractC17752a a = C17741a.m32880a(next2);
                if (!(a == null || (context = getContext()) == null)) {
                    C89219l.m154709a((Object) context, "");
                    Intent a2 = a.mo28233a(context);
                    if (a2 != null) {
                        startActivityForResult(a2, this.f42419e);
                        z = true;
                    }
                }
            }
            if (!z) {
                mo28225a(this.f42417b);
            }
        }
    }

    /* renamed from: a */
    private final void m32884a(String[] strArr, int[] iArr) {
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (iArr != null && iArr[i] == -1) {
                    C17747a.m32892b(str);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            if (!this.f42420f.isEmpty()) {
                Iterator<String> it = this.f42420f.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    C89219l.m154709a((Object) next, "");
                    arrayList.add(new C17749a(next, C17749a.EnumC17750a.GRANTED));
                }
            }
            if (!(strArr == null || iArr == null)) {
                int length2 = strArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    if (iArr[i2] == 0) {
                        arrayList.add(new C17749a(strArr[i2], C17749a.EnumC17750a.GRANTED));
                    } else {
                        C89219l.m154709a((Object) activity, "");
                        if (C17770j.m32954a((Activity) activity, strArr[i2])) {
                            arrayList.add(new C17749a(strArr[i2], C17749a.EnumC17750a.DENIED_PERMANENT));
                        } else {
                            arrayList.add(new C17749a(strArr[i2], C17749a.EnumC17750a.THIS_OPERATION_NOT_PERMITTED));
                        }
                    }
                }
            }
            Iterator<String> it2 = this.f42421g.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                C89219l.m154709a((Object) activity, "");
                C89219l.m154709a((Object) next2, "");
                if (C17770j.m32957a((Context) activity, next2)) {
                    arrayList.add(new C17749a(next2, C17749a.EnumC17750a.GRANTED));
                } else if (C17770j.m32954a((Activity) activity, next2)) {
                    arrayList.add(new C17749a(next2, C17749a.EnumC17750a.DENIED_PERMANENT));
                } else {
                    arrayList.add(new C17749a(next2, C17749a.EnumC17750a.THIS_OPERATION_NOT_PERMITTED));
                }
            }
            AbstractC17765f fVar = this.f42416a;
            if (fVar != null) {
                Object[] array = arrayList.toArray(new C17749a[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                C17749a[] aVarArr = (C17749a[]) array;
                fVar.mo28241a((C17749a[]) Arrays.copyOf(aVarArr, aVarArr.length));
            }
            C17775m mVar = this.f42418c;
            if (mVar == null) {
                m32885b();
            } else if (mVar.f42443b.isEmpty()) {
                m32885b();
            } else {
                mVar.mo28245a();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f42419e) {
            new Handler().postDelayed(new RunnableC17746b(this), 300);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == this.f42419e && strArr.length != 0 && iArr.length != 0) {
            m32884a(strArr, iArr);
        }
    }
}
