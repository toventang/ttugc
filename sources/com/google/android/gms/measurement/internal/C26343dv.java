package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.measurement.C25760a;
import com.google.android.gms.internal.measurement.C26232w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.dv */
public final class C26343dv extends C25760a implements AbstractC26341dt {
    static {
        Covode.recordClassIndex(31765);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43032a(zzao zzao, zzn zzn) {
        MethodCollector.m26663i(4605);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzao);
        C26232w.m51359a(F_, zzn);
        mo42002b(1, F_);
        MethodCollector.m26664o(4605);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43034a(zzkr zzkr, zzn zzn) {
        MethodCollector.m26663i(4694);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzkr);
        C26232w.m51359a(F_, zzn);
        mo42002b(2, F_);
        MethodCollector.m26664o(4694);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43035a(zzn zzn) {
        MethodCollector.m26663i(4767);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzn);
        mo42002b(4, F_);
        MethodCollector.m26664o(4767);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43033a(zzao zzao, String str, String str2) {
        MethodCollector.m26663i(4774);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzao);
        F_.writeString(str);
        F_.writeString(str2);
        mo42002b(5, F_);
        MethodCollector.m26664o(4774);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final byte[] mo43038a(zzao zzao, String str) {
        MethodCollector.m26663i(4787);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzao);
        F_.writeString(str);
        Parcel a = mo42000a(9, F_);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        MethodCollector.m26664o(4787);
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43037a(zzw zzw, zzn zzn) {
        MethodCollector.m26663i(4841);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzw);
        C26232w.m51359a(F_, zzn);
        mo42002b(12, F_);
        MethodCollector.m26664o(4841);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43036a(zzw zzw) {
        MethodCollector.m26663i(4845);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzw);
        mo42002b(13, F_);
        MethodCollector.m26664o(4845);
    }

    C26343dv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
        MethodCollector.m26663i(4601);
        MethodCollector.m26664o(4601);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: b */
    public final void mo43039b(zzn zzn) {
        MethodCollector.m26663i(4778);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzn);
        mo42002b(6, F_);
        MethodCollector.m26664o(4778);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: c */
    public final String mo43040c(zzn zzn) {
        MethodCollector.m26663i(4789);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzn);
        Parcel a = mo42000a(11, F_);
        String readString = a.readString();
        a.recycle();
        MethodCollector.m26664o(4789);
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: d */
    public final void mo43041d(zzn zzn) {
        MethodCollector.m26663i(4888);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzn);
        mo42002b(18, F_);
        MethodCollector.m26664o(4888);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzkr> mo43025a(zzn zzn, boolean z) {
        MethodCollector.m26663i(4782);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, zzn);
        C26232w.m51360a(F_, z);
        Parcel a = mo42000a(7, F_);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzkr.CREATOR);
        a.recycle();
        MethodCollector.m26664o(4782);
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43031a(Bundle bundle, zzn zzn) {
        MethodCollector.m26663i(4894);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, bundle);
        C26232w.m51359a(F_, zzn);
        mo42002b(19, F_);
        MethodCollector.m26664o(4894);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzw> mo43026a(String str, String str2, zzn zzn) {
        MethodCollector.m26663i(4879);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51359a(F_, zzn);
        Parcel a = mo42000a(16, F_);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzw.CREATOR);
        a.recycle();
        MethodCollector.m26664o(4879);
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzw> mo43027a(String str, String str2, String str3) {
        MethodCollector.m26663i(4883);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        F_.writeString(str3);
        Parcel a = mo42000a(17, F_);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzw.CREATOR);
        a.recycle();
        MethodCollector.m26664o(4883);
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final void mo43030a(long j, String str, String str2, String str3) {
        MethodCollector.m26663i(4788);
        Parcel F_ = mo41999F_();
        F_.writeLong(j);
        F_.writeString(str);
        F_.writeString(str2);
        F_.writeString(str3);
        mo42002b(10, F_);
        MethodCollector.m26664o(4788);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzkr> mo43028a(String str, String str2, String str3, boolean z) {
        MethodCollector.m26663i(4875);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        F_.writeString(str3);
        C26232w.m51360a(F_, z);
        Parcel a = mo42000a(15, F_);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzkr.CREATOR);
        a.recycle();
        MethodCollector.m26664o(4875);
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26341dt
    /* renamed from: a */
    public final List<zzkr> mo43029a(String str, String str2, boolean z, zzn zzn) {
        MethodCollector.m26663i(4853);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51360a(F_, z);
        C26232w.m51359a(F_, zzn);
        Parcel a = mo42000a(14, F_);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzkr.CREATOR);
        a.recycle();
        MethodCollector.m26664o(4853);
        return createTypedArrayList;
    }
}
