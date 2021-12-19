package com.google.android.gms.internal.p1949h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;

/* renamed from: com.google.android.gms.internal.h.c */
public final class C25757c extends C25758d implements AbstractC25755a {
    static {
        Covode.recordClassIndex(31172);
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: a */
    public final Bundle mo41991a(String str, List<String> list, String str2, String str3) {
        MethodCollector.m26663i(5185);
        Parcel a = mo41996a();
        a.writeInt(5);
        a.writeString(str);
        a.writeStringList(list);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString(null);
        Parcel a2 = mo41997a(7, a);
        Bundle bundle = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5185);
        return bundle;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: a */
    public final Bundle mo41990a(String str, String str2, String str3, Bundle bundle) {
        MethodCollector.m26663i(5305);
        Parcel a = mo41996a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        C25759e.m49735a(a, bundle);
        Parcel a2 = mo41997a(11, a);
        Bundle bundle2 = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5305);
        return bundle2;
    }

    public C25757c(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
        MethodCollector.m26663i(5150);
        MethodCollector.m26664o(5150);
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: a */
    public final int mo41985a(String str, String str2) {
        MethodCollector.m26663i(5178);
        Parcel a = mo41996a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        Parcel a2 = mo41997a(5, a);
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.m26664o(5178);
        return readInt;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: a */
    public final int mo41984a(int i, String str, String str2) {
        MethodCollector.m26663i(5156);
        Parcel a = mo41996a();
        a.writeInt(i);
        a.writeString(str);
        a.writeString(str2);
        Parcel a2 = mo41997a(1, a);
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.m26664o(5156);
        return readInt;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: b */
    public final int mo41992b(String str, String str2, Bundle bundle) {
        MethodCollector.m26663i(5248);
        Parcel a = mo41996a();
        a.writeInt(7);
        a.writeString(str);
        a.writeString(str2);
        C25759e.m49735a(a, bundle);
        Parcel a2 = mo41997a(10, a);
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.m26664o(5248);
        return readInt;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: c */
    public final Bundle mo41994c(String str, String str2, Bundle bundle) {
        MethodCollector.m26663i(5307);
        Parcel a = mo41996a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        C25759e.m49735a(a, bundle);
        Parcel a2 = mo41997a(12, a);
        Bundle bundle2 = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5307);
        return bundle2;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: d */
    public final Bundle mo41995d(String str, String str2, Bundle bundle) {
        MethodCollector.m26663i(5312);
        Parcel a = mo41996a();
        a.writeInt(9);
        a.writeString(str);
        a.writeString(str2);
        C25759e.m49735a(a, bundle);
        Parcel a2 = mo41997a(902, a);
        Bundle bundle2 = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5312);
        return bundle2;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: b */
    public final Bundle mo41993b(String str, String str2, String str3) {
        MethodCollector.m26663i(5173);
        Parcel a = mo41996a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = mo41997a(4, a);
        Bundle bundle = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5173);
        return bundle;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: a */
    public final Bundle mo41987a(String str, String str2, Bundle bundle) {
        MethodCollector.m26663i(5162);
        Parcel a = mo41996a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        C25759e.m49735a(a, bundle);
        Parcel a2 = mo41997a(2, a);
        Bundle bundle2 = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5162);
        return bundle2;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: a */
    public final Bundle mo41989a(String str, String str2, String str3) {
        MethodCollector.m26663i(5167);
        Parcel a = mo41996a();
        a.writeInt(3);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString(null);
        Parcel a2 = mo41997a(3, a);
        Bundle bundle = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5167);
        return bundle;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: a */
    public final Bundle mo41988a(String str, String str2, Bundle bundle, Bundle bundle2) {
        MethodCollector.m26663i(5310);
        Parcel a = mo41996a();
        a.writeInt(10);
        a.writeString(str);
        a.writeString(str2);
        C25759e.m49735a(a, bundle);
        C25759e.m49735a(a, bundle2);
        Parcel a2 = mo41997a(901, a);
        Bundle bundle3 = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5310);
        return bundle3;
    }

    @Override // com.google.android.gms.internal.p1949h.AbstractC25755a
    /* renamed from: a */
    public final Bundle mo41986a(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        MethodCollector.m26663i(5238);
        Parcel a = mo41996a();
        a.writeInt(i);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        a.writeString(str4);
        C25759e.m49735a(a, bundle);
        Parcel a2 = mo41997a(8, a);
        Bundle bundle2 = (Bundle) C25759e.m49734a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.m26664o(5238);
        return bundle2;
    }
}
