package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.p1934b.AbstractC25324a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.oz */
public final class C26222oz extends C25760a implements AbstractC26220ox {
    static {
        Covode.recordClassIndex(31637);
    }

    C26222oz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        MethodCollector.m26663i(7579);
        MethodCollector.m26664o(7579);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void generateEventId(AbstractC26221oy oyVar) {
        MethodCollector.m26663i(10114);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, oyVar);
        mo42002b(22, F_);
        MethodCollector.m26664o(10114);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getAppInstanceId(AbstractC26221oy oyVar) {
        MethodCollector.m26663i(9962);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, oyVar);
        mo42002b(20, F_);
        MethodCollector.m26664o(9962);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getCachedAppInstanceId(AbstractC26221oy oyVar) {
        MethodCollector.m26663i(9819);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, oyVar);
        mo42002b(19, F_);
        MethodCollector.m26664o(9819);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getCurrentScreenClass(AbstractC26221oy oyVar) {
        MethodCollector.m26663i(9514);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, oyVar);
        mo42002b(17, F_);
        MethodCollector.m26664o(9514);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getCurrentScreenName(AbstractC26221oy oyVar) {
        MethodCollector.m26663i(9374);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, oyVar);
        mo42002b(16, F_);
        MethodCollector.m26664o(9374);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getGmpAppId(AbstractC26221oy oyVar) {
        MethodCollector.m26663i(10113);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, oyVar);
        mo42002b(21, F_);
        MethodCollector.m26664o(10113);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void initForTests(Map map) {
        MethodCollector.m26663i(11482);
        Parcel F_ = mo41999F_();
        F_.writeMap(map);
        mo42002b(37, F_);
        MethodCollector.m26664o(11482);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void isDataCollectionEnabled(AbstractC26221oy oyVar) {
        MethodCollector.m26663i(11485);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, oyVar);
        mo42002b(40, F_);
        MethodCollector.m26664o(11485);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void registerOnMeasurementEventListener(AbstractC25830b bVar) {
        MethodCollector.m26663i(11480);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, bVar);
        mo42002b(35, F_);
        MethodCollector.m26664o(11480);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void resetAnalyticsData(long j) {
        MethodCollector.m26663i(8922);
        Parcel F_ = mo41999F_();
        F_.writeLong(j);
        mo42002b(12, F_);
        MethodCollector.m26664o(8922);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setDataCollectionEnabled(boolean z) {
        MethodCollector.m26663i(11484);
        Parcel F_ = mo41999F_();
        C26232w.m51360a(F_, z);
        mo42002b(39, F_);
        MethodCollector.m26664o(11484);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setDefaultEventParameters(Bundle bundle) {
        MethodCollector.m26663i(11486);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, bundle);
        mo42002b(42, F_);
        MethodCollector.m26664o(11486);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setEventInterceptor(AbstractC25830b bVar) {
        MethodCollector.m26663i(11479);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, bVar);
        mo42002b(34, F_);
        MethodCollector.m26664o(11479);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setInstanceIdProvider(AbstractC25857c cVar) {
        MethodCollector.m26663i(9665);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, cVar);
        mo42002b(18, F_);
        MethodCollector.m26664o(9665);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setMinimumSessionDuration(long j) {
        MethodCollector.m26663i(9082);
        Parcel F_ = mo41999F_();
        F_.writeLong(j);
        mo42002b(13, F_);
        MethodCollector.m26664o(9082);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setSessionTimeoutDuration(long j) {
        MethodCollector.m26663i(9084);
        Parcel F_ = mo41999F_();
        F_.writeLong(j);
        mo42002b(14, F_);
        MethodCollector.m26664o(9084);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void unregisterOnMeasurementEventListener(AbstractC25830b bVar) {
        MethodCollector.m26663i(11481);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, bVar);
        mo42002b(36, F_);
        MethodCollector.m26664o(11481);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void beginAdUnitExposure(String str, long j) {
        MethodCollector.m26663i(10279);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeLong(j);
        mo42002b(23, F_);
        MethodCollector.m26664o(10279);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void endAdUnitExposure(String str, long j) {
        MethodCollector.m26663i(10280);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeLong(j);
        mo42002b(24, F_);
        MethodCollector.m26664o(10280);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getMaxUserProperties(String str, AbstractC26221oy oyVar) {
        MethodCollector.m26663i(8184);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        C26232w.m51358a(F_, oyVar);
        mo42002b(6, F_);
        MethodCollector.m26664o(8184);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getTestFlag(AbstractC26221oy oyVar, int i) {
        MethodCollector.m26663i(11483);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, oyVar);
        F_.writeInt(i);
        mo42002b(38, F_);
        MethodCollector.m26664o(11483);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void onActivityDestroyed(AbstractC25324a aVar, long j) {
        MethodCollector.m26663i(10740);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        F_.writeLong(j);
        mo42002b(28, F_);
        MethodCollector.m26664o(10740);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void onActivityPaused(AbstractC25324a aVar, long j) {
        MethodCollector.m26663i(10887);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        F_.writeLong(j);
        mo42002b(29, F_);
        MethodCollector.m26664o(10887);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void onActivityResumed(AbstractC25324a aVar, long j) {
        MethodCollector.m26663i(11032);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        F_.writeLong(j);
        mo42002b(30, F_);
        MethodCollector.m26664o(11032);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void onActivityStarted(AbstractC25324a aVar, long j) {
        MethodCollector.m26663i(10432);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        F_.writeLong(j);
        mo42002b(25, F_);
        MethodCollector.m26664o(10432);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void onActivityStopped(AbstractC25324a aVar, long j) {
        MethodCollector.m26663i(10597);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        F_.writeLong(j);
        mo42002b(26, F_);
        MethodCollector.m26664o(10597);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        MethodCollector.m26663i(8476);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, bundle);
        F_.writeLong(j);
        mo42002b(8, F_);
        MethodCollector.m26664o(8476);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setMeasurementEnabled(boolean z, long j) {
        MethodCollector.m26663i(8781);
        Parcel F_ = mo41999F_();
        C26232w.m51360a(F_, z);
        F_.writeLong(j);
        mo42002b(11, F_);
        MethodCollector.m26664o(8781);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setUserId(String str, long j) {
        MethodCollector.m26663i(8332);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeLong(j);
        mo42002b(7, F_);
        MethodCollector.m26664o(8332);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        MethodCollector.m26663i(8477);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51359a(F_, bundle);
        mo42002b(9, F_);
        MethodCollector.m26664o(8477);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getConditionalUserProperties(String str, String str2, AbstractC26221oy oyVar) {
        MethodCollector.m26663i(8628);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51358a(F_, oyVar);
        mo42002b(10, F_);
        MethodCollector.m26664o(8628);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void initialize(AbstractC25324a aVar, zzae zzae, long j) {
        MethodCollector.m26663i(7757);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        C26232w.m51359a(F_, zzae);
        F_.writeLong(j);
        mo42002b(1, F_);
        MethodCollector.m26664o(7757);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void onActivityCreated(AbstractC25324a aVar, Bundle bundle, long j) {
        MethodCollector.m26663i(10739);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        C26232w.m51359a(F_, bundle);
        F_.writeLong(j);
        mo42002b(27, F_);
        MethodCollector.m26664o(10739);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void onActivitySaveInstanceState(AbstractC25324a aVar, AbstractC26221oy oyVar, long j) {
        MethodCollector.m26663i(11178);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        C26232w.m51358a(F_, oyVar);
        F_.writeLong(j);
        mo42002b(31, F_);
        MethodCollector.m26664o(11178);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void performAction(Bundle bundle, AbstractC26221oy oyVar, long j) {
        MethodCollector.m26663i(11325);
        Parcel F_ = mo41999F_();
        C26232w.m51359a(F_, bundle);
        C26232w.m51358a(F_, oyVar);
        F_.writeLong(j);
        mo42002b(32, F_);
        MethodCollector.m26664o(11325);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void getUserProperties(String str, String str2, boolean z, AbstractC26221oy oyVar) {
        MethodCollector.m26663i(8182);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51360a(F_, z);
        C26232w.m51358a(F_, oyVar);
        mo42002b(5, F_);
        MethodCollector.m26664o(8182);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setCurrentScreen(AbstractC25324a aVar, String str, String str2, long j) {
        MethodCollector.m26663i(9224);
        Parcel F_ = mo41999F_();
        C26232w.m51358a(F_, aVar);
        F_.writeString(str);
        F_.writeString(str2);
        F_.writeLong(j);
        mo42002b(15, F_);
        MethodCollector.m26664o(9224);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void logEventAndBundle(String str, String str2, Bundle bundle, AbstractC26221oy oyVar, long j) {
        MethodCollector.m26663i(7897);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51359a(F_, bundle);
        C26232w.m51358a(F_, oyVar);
        F_.writeLong(j);
        mo42002b(3, F_);
        MethodCollector.m26664o(7897);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void setUserProperty(String str, String str2, AbstractC25324a aVar, boolean z, long j) {
        MethodCollector.m26663i(8048);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51358a(F_, aVar);
        C26232w.m51360a(F_, z);
        F_.writeLong(j);
        mo42002b(4, F_);
        MethodCollector.m26664o(8048);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void logHealthData(int i, String str, AbstractC25324a aVar, AbstractC25324a aVar2, AbstractC25324a aVar3) {
        MethodCollector.m26663i(11478);
        Parcel F_ = mo41999F_();
        F_.writeInt(i);
        F_.writeString(str);
        C26232w.m51358a(F_, aVar);
        C26232w.m51358a(F_, aVar2);
        C26232w.m51358a(F_, aVar3);
        mo42002b(33, F_);
        MethodCollector.m26664o(11478);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        MethodCollector.m26663i(7896);
        Parcel F_ = mo41999F_();
        F_.writeString(str);
        F_.writeString(str2);
        C26232w.m51359a(F_, bundle);
        C26232w.m51360a(F_, z);
        C26232w.m51360a(F_, z2);
        F_.writeLong(j);
        mo42002b(2, F_);
        MethodCollector.m26664o(7896);
    }
}
