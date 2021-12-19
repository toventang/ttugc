package com.bytedance.bdlocation.utils;

import android.location.Location;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.lang.reflect.Type;

public class LocationDeserializer implements AbstractC28018k<Location> {
    static {
        Covode.recordClassIndex(15186);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* synthetic */ Location mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        C28022o j = lVar.mo46789j();
        Location location = new Location(j.mo46804d("mProvider").mo46689c());
        location.setAccuracy(j.mo46804d("mAccuracy").mo46691e());
        location.setAltitude((double) j.mo46804d("mAltitude").mo46691e());
        location.setBearing(j.mo46804d("mBearing").mo46691e());
        if (Build.VERSION.SDK_INT >= 26) {
            location.setBearingAccuracyDegrees(j.mo46804d("mBearingAccuracyDegrees").mo46691e());
        }
        int i = Build.VERSION.SDK_INT;
        location.setElapsedRealtimeNanos(j.mo46804d("mElapsedRealtimeNanos").mo46693f());
        location.setLatitude(j.mo46804d("mLatitude").mo46690d());
        location.setLongitude(j.mo46804d("mLongitude").mo46690d());
        location.setProvider(j.mo46804d("mProvider").mo46689c());
        location.setSpeed(j.mo46804d("mSpeed").mo46691e());
        if (Build.VERSION.SDK_INT >= 26) {
            location.setSpeedAccuracyMetersPerSecond(j.mo46804d("mSpeedAccuracyMetersPerSecond").mo46691e());
        }
        location.setTime(j.mo46804d("mTime").mo46693f());
        if (Build.VERSION.SDK_INT >= 26) {
            location.setVerticalAccuracyMeters(j.mo46804d("mVerticalAccuracyMeters").mo46691e());
        }
        return location;
    }
}
