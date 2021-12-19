package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1934b.AbstractC25324a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ox */
public interface AbstractC26220ox extends IInterface {
    static {
        Covode.recordClassIndex(31635);
    }

    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(AbstractC26221oy oyVar);

    void getAppInstanceId(AbstractC26221oy oyVar);

    void getCachedAppInstanceId(AbstractC26221oy oyVar);

    void getConditionalUserProperties(String str, String str2, AbstractC26221oy oyVar);

    void getCurrentScreenClass(AbstractC26221oy oyVar);

    void getCurrentScreenName(AbstractC26221oy oyVar);

    void getGmpAppId(AbstractC26221oy oyVar);

    void getMaxUserProperties(String str, AbstractC26221oy oyVar);

    void getTestFlag(AbstractC26221oy oyVar, int i);

    void getUserProperties(String str, String str2, boolean z, AbstractC26221oy oyVar);

    void initForTests(Map map);

    void initialize(AbstractC25324a aVar, zzae zzae, long j);

    void isDataCollectionEnabled(AbstractC26221oy oyVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, AbstractC26221oy oyVar, long j);

    void logHealthData(int i, String str, AbstractC25324a aVar, AbstractC25324a aVar2, AbstractC25324a aVar3);

    void onActivityCreated(AbstractC25324a aVar, Bundle bundle, long j);

    void onActivityDestroyed(AbstractC25324a aVar, long j);

    void onActivityPaused(AbstractC25324a aVar, long j);

    void onActivityResumed(AbstractC25324a aVar, long j);

    void onActivitySaveInstanceState(AbstractC25324a aVar, AbstractC26221oy oyVar, long j);

    void onActivityStarted(AbstractC25324a aVar, long j);

    void onActivityStopped(AbstractC25324a aVar, long j);

    void performAction(Bundle bundle, AbstractC26221oy oyVar, long j);

    void registerOnMeasurementEventListener(AbstractC25830b bVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(AbstractC25324a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(AbstractC25830b bVar);

    void setInstanceIdProvider(AbstractC25857c cVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, AbstractC25324a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(AbstractC25830b bVar);
}
