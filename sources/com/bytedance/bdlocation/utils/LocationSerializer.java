package com.bytedance.bdlocation.utils;

import android.location.Location;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28026s;
import com.google.gson.C28022o;

public class LocationSerializer implements AbstractC28026s<Location> {
    static {
        Covode.recordClassIndex(15187);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.AbstractC28026s
    /* renamed from: a */
    public final /* synthetic */ AbstractC28019l mo16610a(Location location) {
        Location location2 = location;
        C28022o oVar = new C28022o();
        oVar.mo46801a("mProvider", location2.getProvider());
        oVar.mo46800a("mAccuracy", Float.valueOf(location2.getAccuracy()));
        oVar.mo46800a("mAltitude", Double.valueOf(location2.getAltitude()));
        oVar.mo46800a("mBearing", Float.valueOf(location2.getBearing()));
        if (Build.VERSION.SDK_INT >= 26) {
            oVar.mo46800a("mBearingAccuracyDegrees", Float.valueOf(location2.getBearingAccuracyDegrees()));
        }
        int i = Build.VERSION.SDK_INT;
        oVar.mo46800a("mElapsedRealtimeNanos", Long.valueOf(location2.getElapsedRealtimeNanos()));
        oVar.mo46800a("mLatitude", Double.valueOf(location2.getLatitude()));
        oVar.mo46800a("mLongitude", Double.valueOf(location2.getLongitude()));
        oVar.mo46801a("mProvider", location2.getProvider());
        oVar.mo46800a("mSpeed", Float.valueOf(location2.getSpeed()));
        if (Build.VERSION.SDK_INT >= 26) {
            oVar.mo46800a("mSpeedAccuracyMetersPerSecond", Float.valueOf(location2.getSpeedAccuracyMetersPerSecond()));
        }
        oVar.mo46800a("mTime", Long.valueOf(location2.getTime()));
        if (Build.VERSION.SDK_INT >= 26) {
            oVar.mo46800a("mVerticalAccuracyMeters", Float.valueOf(location2.getVerticalAccuracyMeters()));
        }
        return oVar;
    }
}
