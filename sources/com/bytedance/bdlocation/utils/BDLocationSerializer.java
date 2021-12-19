package com.bytedance.bdlocation.utils;

import android.os.Build;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28026s;
import com.google.gson.C28022o;

public class BDLocationSerializer implements AbstractC28026s<BDLocation> {
    static {
        Covode.recordClassIndex(15185);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.AbstractC28026s
    /* renamed from: a */
    public final /* synthetic */ AbstractC28019l mo16610a(BDLocation bDLocation) {
        BDLocation bDLocation2 = bDLocation;
        C28022o oVar = new C28022o();
        oVar.mo46801a("mProvider", bDLocation2.getProvider());
        oVar.mo46800a("mAccuracy", Float.valueOf(bDLocation2.getAccuracy()));
        oVar.mo46800a("mAltitude", Double.valueOf(bDLocation2.getAltitude()));
        oVar.mo46800a("mBearing", Float.valueOf(bDLocation2.getBearing()));
        if (Build.VERSION.SDK_INT >= 26) {
            oVar.mo46800a("mBearingAccuracyDegrees", Float.valueOf(bDLocation2.getBearingAccuracyDegrees()));
        }
        int i = Build.VERSION.SDK_INT;
        oVar.mo46800a("mElapsedRealtimeNanos", Long.valueOf(bDLocation2.getElapsedRealtimeNanos()));
        oVar.mo46800a("mLatitude", Double.valueOf(bDLocation2.getLatitude()));
        oVar.mo46800a("mLongitude", Double.valueOf(bDLocation2.getLongitude()));
        oVar.mo46801a("mProvider", bDLocation2.getProvider());
        oVar.mo46800a("mSpeed", Float.valueOf(bDLocation2.getSpeed()));
        if (Build.VERSION.SDK_INT >= 26) {
            oVar.mo46800a("mSpeedAccuracyMetersPerSecond", Float.valueOf(bDLocation2.getSpeedAccuracyMetersPerSecond()));
        }
        oVar.mo46800a("mTime", Long.valueOf(bDLocation2.getTime()));
        if (Build.VERSION.SDK_INT >= 26) {
            oVar.mo46800a("mVerticalAccuracyMeters", Float.valueOf(bDLocation2.getVerticalAccuracyMeters()));
        }
        oVar.mo46801a("mAddress", bDLocation2.f32008a);
        oVar.mo46801a("mCountry", bDLocation2.f32009b);
        oVar.mo46801a("mAdministrativeArea", bDLocation2.f32010c);
        oVar.mo46801a("mSubAdministrativeArea", bDLocation2.f32011d);
        oVar.mo46801a("mCity", bDLocation2.f32012e);
        oVar.mo46801a("mDistrict", bDLocation2.f32013f);
        oVar.mo46801a("mCityCode", bDLocation2.f32029v);
        oVar.mo46801a("mStreet", bDLocation2.f32033z);
        oVar.mo46801a("mStreetNum", bDLocation2.f31989A);
        oVar.mo46801a("mFloor", bDLocation2.f31990B);
        oVar.mo46800a("mLocationMs", Long.valueOf(bDLocation2.f31991C));
        oVar.mo46800a("mLocationType", Integer.valueOf(bDLocation2.f31993E));
        oVar.mo46801a("mCountryCode", bDLocation2.f31995G);
        oVar.mo46801a("mCountryLocalID", bDLocation2.f31996H);
        oVar.mo46801a("mLocalID", bDLocation2.f31997I);
        oVar.mo46801a("mDistrictLocalID", bDLocation2.f31998J);
        oVar.mo46801a("mGeoNameID", bDLocation2.f31999K);
        oVar.mo46797a("mBdLBSResult", C13182f.m23707a(bDLocation2.f32000L));
        oVar.mo46797a("mLocationResult", C13182f.m23707a(bDLocation2.f32001M));
        oVar.mo46797a("mGCJ02", C13182f.m23707a(bDLocation2.f31992D));
        return oVar;
    }
}
