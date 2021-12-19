package com.bytedance.bdlocation.utils;

import android.os.Build;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.p846a.C13155d;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p850e.p851a.C13170b;
import com.bytedance.bdlocation.p850e.p851a.C13176h;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import java.lang.reflect.Type;

public class BDLocationDeserializer implements AbstractC28018k<BDLocation> {
    static {
        Covode.recordClassIndex(15184);
    }

    /* renamed from: a */
    private static BDLocation m23784a(AbstractC28019l lVar) {
        C28022o j = lVar.mo46789j();
        BDLocation bDLocation = new BDLocation(j.mo46804d("mProvider").mo46689c());
        bDLocation.setAccuracy(j.mo46804d("mAccuracy").mo46691e());
        bDLocation.setAltitude((double) j.mo46804d("mAltitude").mo46691e());
        bDLocation.setBearing(j.mo46804d("mBearing").mo46691e());
        if (Build.VERSION.SDK_INT >= 26) {
            bDLocation.setBearingAccuracyDegrees(j.mo46804d("mBearingAccuracyDegrees").mo46691e());
        }
        int i = Build.VERSION.SDK_INT;
        bDLocation.setElapsedRealtimeNanos(j.mo46804d("mElapsedRealtimeNanos").mo46693f());
        bDLocation.setLatitude(j.mo46804d("mLatitude").mo46690d());
        bDLocation.setLongitude(j.mo46804d("mLongitude").mo46690d());
        bDLocation.setSpeed(j.mo46804d("mSpeed").mo46691e());
        if (Build.VERSION.SDK_INT >= 26) {
            bDLocation.setSpeedAccuracyMetersPerSecond(j.mo46804d("mSpeedAccuracyMetersPerSecond").mo46691e());
        }
        bDLocation.setTime(j.mo46804d("mTime").mo46693f());
        if (Build.VERSION.SDK_INT >= 26) {
            bDLocation.setVerticalAccuracyMeters(j.mo46804d("mVerticalAccuracyMeters").mo46691e());
        }
        C28025r d = j.mo46804d("mAddress");
        if (d != null) {
            bDLocation.f32008a = d.mo46689c();
        }
        C28025r d2 = j.mo46804d("mCountry");
        if (d2 != null) {
            bDLocation.f32009b = d2.mo46689c();
        }
        C28025r d3 = j.mo46804d("mAdministrativeArea");
        if (d3 != null) {
            bDLocation.f32010c = d3.mo46689c();
        }
        C28025r d4 = j.mo46804d("mSubAdministrativeArea");
        if (d4 != null) {
            bDLocation.f32011d = d4.mo46689c();
        }
        C28025r d5 = j.mo46804d("mCity");
        if (d5 != null) {
            bDLocation.f32012e = d5.mo46689c();
        }
        C28025r d6 = j.mo46804d("mDistrict");
        if (d6 != null) {
            bDLocation.f32013f = d6.mo46689c();
        }
        C28025r d7 = j.mo46804d("mCityCode");
        if (d7 != null) {
            bDLocation.f32029v = d7.mo46689c();
        }
        C28025r d8 = j.mo46804d("mStreet");
        if (d8 != null) {
            bDLocation.f32033z = d8.mo46689c();
        }
        C28025r d9 = j.mo46804d("mStreetNum");
        if (d9 != null) {
            bDLocation.f31989A = d9.mo46689c();
        }
        C28025r d10 = j.mo46804d("mFloor");
        if (d10 != null) {
            bDLocation.f31990B = d10.mo46689c();
        }
        bDLocation.f31991C = j.mo46804d("mLocationMs").mo46693f();
        C13155d dVar = new C13155d();
        C28022o f = j.mo46807f("mGCJ02");
        if (f != null) {
            C28025r d11 = f.mo46804d("provider");
            if (d11 != null) {
                dVar.f32075a = d11.mo46689c();
            }
            double d12 = f.mo46804d("longitude").mo46690d();
            if (d12 > 180.0d) {
                d12 = 180.0d;
            } else if (d12 < -180.0d) {
                d12 = -180.0d;
            }
            dVar.f32076b = d12;
            double d13 = f.mo46804d("latitude").mo46690d();
            if (d13 > 90.0d) {
                d13 = 90.0d;
            } else if (d13 < -90.0d) {
                d13 = -90.0d;
            }
            dVar.f32077c = d13;
            bDLocation.f31992D = dVar;
        }
        bDLocation.f31993E = j.mo46804d("mLocationType").mo46694g();
        C28025r d14 = j.mo46804d("mCountryCode");
        if (d14 != null) {
            bDLocation.f31995G = d14.mo46689c();
        }
        C28025r d15 = j.mo46804d("mCountryLocalID");
        if (d15 != null) {
            bDLocation.f31996H = d15.mo46689c();
        }
        C28025r d16 = j.mo46804d("mLocalID");
        if (d16 != null) {
            bDLocation.f31997I = d16.mo46689c();
        }
        C28025r d17 = j.mo46804d("mDistrictLocalID");
        if (d17 != null) {
            bDLocation.f31998J = d17.mo46689c();
        }
        C28025r d18 = j.mo46804d("mGeoNameID");
        if (d18 != null) {
            bDLocation.f31999K = d18.mo46689c();
        }
        try {
            C28022o f2 = j.mo46807f("mBdLBSResult");
            if (f2 != null) {
                bDLocation.f32000L = (C13170b) C13182f.f32181a.mo46667a((AbstractC28019l) f2, C13170b.class);
            }
        } catch (Exception e) {
            C13162b.m23685a("BDLocation", "", e);
        }
        try {
            C28022o f3 = j.mo46807f("mLocationResult");
            if (f3 != null) {
                bDLocation.f32001M = (C13176h) C13182f.f32181a.mo46667a((AbstractC28019l) f3, C13176h.class);
            }
        } catch (Exception e2) {
            C13162b.m23685a("BDLocation", "", e2);
        }
        return bDLocation;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ BDLocation mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m23784a(lVar);
    }
}
