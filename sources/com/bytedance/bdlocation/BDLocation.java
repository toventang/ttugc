package com.bytedance.bdlocation;

import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p846a.C13155d;
import com.bytedance.bdlocation.p850e.p851a.C13170b;
import com.bytedance.bdlocation.p850e.p851a.C13176h;
import com.bytedance.covode.number.Covode;

public class BDLocation extends Location {

    /* renamed from: A */
    public String f31989A;

    /* renamed from: B */
    public String f31990B;

    /* renamed from: C */
    public long f31991C;

    /* renamed from: D */
    public C13155d f31992D;

    /* renamed from: E */
    public int f31993E;

    /* renamed from: F */
    public transient boolean f31994F;

    /* renamed from: G */
    public String f31995G;

    /* renamed from: H */
    public String f31996H;

    /* renamed from: I */
    public String f31997I;

    /* renamed from: J */
    public String f31998J;

    /* renamed from: K */
    public String f31999K;

    /* renamed from: L */
    public C13170b f32000L;

    /* renamed from: M */
    public C13176h f32001M;

    /* renamed from: N */
    public boolean f32002N;

    /* renamed from: O */
    public boolean f32003O;

    /* renamed from: P */
    public String f32004P = "wgs84";

    /* renamed from: Q */
    public C13154c f32005Q;

    /* renamed from: R */
    private float f32006R;

    /* renamed from: S */
    private float f32007S;

    /* renamed from: a */
    public String f32008a;

    /* renamed from: b */
    public String f32009b;

    /* renamed from: c */
    public String f32010c;

    /* renamed from: d */
    public String f32011d;

    /* renamed from: e */
    public String f32012e;

    /* renamed from: f */
    public String f32013f;

    /* renamed from: g */
    public String f32014g;

    /* renamed from: h */
    public String f32015h;

    /* renamed from: i */
    public long f32016i;

    /* renamed from: j */
    public long f32017j;

    /* renamed from: k */
    public long f32018k;

    /* renamed from: l */
    public long f32019l;

    /* renamed from: m */
    public long f32020m;

    /* renamed from: n */
    public long f32021n;

    /* renamed from: o */
    public String f32022o;

    /* renamed from: p */
    public String f32023p;

    /* renamed from: q */
    public String f32024q;

    /* renamed from: r */
    public String f32025r;

    /* renamed from: s */
    public String f32026s;

    /* renamed from: t */
    public String f32027t;

    /* renamed from: u */
    public int f32028u = 2;

    /* renamed from: v */
    public String f32029v;

    /* renamed from: w */
    public String f32030w;

    /* renamed from: x */
    double f32031x;

    /* renamed from: y */
    double f32032y;

    /* renamed from: z */
    public String f32033z;

    static {
        Covode.recordClassIndex(15094);
    }

    public float getBearing() {
        return this.f32006R;
    }

    public double getLatitude() {
        return this.f32031x;
    }

    public double getLongitude() {
        return this.f32032y;
    }

    public float getSpeed() {
        return this.f32007S;
    }

    /* renamed from: a */
    public final boolean mo21225a() {
        if (Double.compare(this.f32031x, 0.0d) != 0 || Double.compare(this.f32032y, 0.0d) != 0 || !TextUtils.isEmpty(this.f32008a) || !TextUtils.isEmpty(this.f32009b) || !TextUtils.isEmpty(this.f32010c) || !TextUtils.isEmpty(this.f32011d) || !TextUtils.isEmpty(this.f32012e) || !TextUtils.isEmpty(this.f32013f)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "BDLocation{mAddress='" + this.f32008a + '\'' + ", mCountry='" + this.f32009b + '\'' + ", mAdministrativeArea='" + this.f32010c + '\'' + ", mSubAdministrativeArea='" + this.f32011d + '\'' + ", mCity='" + this.f32012e + '\'' + ", mDistrict='" + this.f32013f + '\'' + ", mTown='" + this.f32014g + '\'' + ", mVillage='" + this.f32015h + '\'' + ", mCityCode='" + this.f32029v + '\'' + ", mAdCode='" + this.f32030w + '\'' + ", mLatitude=" + this.f32031x + ", mLongitude=" + this.f32032y + ", mStreet='" + this.f32033z + '\'' + ", mStreetNum='" + this.f31989A + '\'' + ", mFloor='" + this.f31990B + '\'' + ", mLocationMs=" + this.f31991C + ", mGCJ02=" + this.f31992D + ", mLocationType=" + this.f31993E + ", isCache=" + this.f31994F + ", mCountryCode=" + this.f31995G + ", mCountryLocalID='" + this.f31996H + '\'' + ", mLocalID='" + this.f31997I + '\'' + ", mDistrictLocalID='" + this.f31998J + '\'' + ", mGeoNameID='" + this.f31999K + '\'' + ", mSubdivisionId='" + this.f32017j + '\'' + ", mBdLBSResult=" + this.f32000L + ", mLocationResult=" + this.f32001M + ", mIsDisputed='" + this.f32002N + '\'' + ", mIsCompliance='" + this.f32003O + '\'' + ", mCoordinateSystem='" + this.f32004P + '\'' + ", mBearing='" + this.f32006R + '\'' + ", mSpeed='" + this.f32007S + '\'' + '}';
    }

    public void setBearing(float f) {
        this.f32006R = f;
    }

    public void setSpeed(float f) {
        this.f32007S = f;
    }

    public void setLatitude(double d) {
        super.setLatitude(d);
        this.f32031x = d;
    }

    public void setLongitude(double d) {
        super.setLongitude(d);
        this.f32032y = d;
    }

    public BDLocation(String str) {
        super(str);
        this.f31993E = m23658a(str);
    }

    public BDLocation(Location location) {
        super(location.getProvider());
        m23659a(location);
        this.f32031x = location.getLatitude();
        this.f32032y = location.getLongitude();
        this.f31991C = location.getTime();
        this.f31993E = m23658a(location.getProvider());
        this.f32006R = location.getBearing();
        this.f32007S = location.getSpeed();
    }

    /* renamed from: a */
    private static int m23658a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if ("gps".equalsIgnoreCase(str)) {
            return 1;
        }
        if (!"network".equalsIgnoreCase(str) && !"bd_lbs".equalsIgnoreCase(str) && !"lbs".equalsIgnoreCase(str)) {
            return 0;
        }
        return 4;
    }

    /* renamed from: a */
    private void m23659a(Location location) {
        setProvider(location.getProvider());
        setTime(location.getTime());
        int i = Build.VERSION.SDK_INT;
        setElapsedRealtimeNanos(location.getElapsedRealtimeNanos());
        setLatitude(location.getLatitude());
        setLongitude(location.getLongitude());
        setAltitude(location.getAltitude());
        setSpeed(location.getSpeed());
        setBearing(location.getBearing());
        setAccuracy(location.getAccuracy());
        setAltitude(location.getAltitude());
        if (Build.VERSION.SDK_INT >= 26) {
            setVerticalAccuracyMeters(location.getVerticalAccuracyMeters());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            setVerticalAccuracyMeters(location.getVerticalAccuracyMeters());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            setSpeedAccuracyMetersPerSecond(location.getSpeedAccuracyMetersPerSecond());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            setBearingAccuracyDegrees(location.getBearingAccuracyDegrees());
        }
    }

    public BDLocation(BDLocation bDLocation) {
        super(bDLocation.getProvider());
        m23659a(bDLocation);
        this.f31991C = bDLocation.getTime();
        this.f32008a = bDLocation.f32008a;
        this.f32009b = bDLocation.f32009b;
        this.f32016i = bDLocation.f32016i;
        this.f32010c = bDLocation.f32010c;
        this.f32017j = bDLocation.f32017j;
        this.f32011d = bDLocation.f32011d;
        this.f32012e = bDLocation.f32012e;
        this.f32018k = bDLocation.f32018k;
        this.f32013f = bDLocation.f32013f;
        this.f32019l = bDLocation.f32019l;
        this.f32014g = bDLocation.f32014g;
        this.f32020m = bDLocation.f32020m;
        this.f32015h = bDLocation.f32015h;
        this.f32021n = bDLocation.f32021n;
        this.f32022o = bDLocation.f32022o;
        this.f32023p = bDLocation.f32023p;
        this.f32024q = bDLocation.f32024q;
        this.f32025r = bDLocation.f32025r;
        this.f32026s = bDLocation.f32026s;
        this.f32027t = bDLocation.f32027t;
        this.f32029v = bDLocation.f32029v;
        this.f32030w = bDLocation.f32030w;
        setLatitude(bDLocation.getLatitude());
        setLongitude(bDLocation.getLongitude());
        this.f31991C = bDLocation.getTime();
        this.f32033z = bDLocation.f32033z;
        this.f31989A = bDLocation.f31989A;
        this.f31990B = bDLocation.f31990B;
        this.f31992D = bDLocation.f31992D;
        this.f31993E = bDLocation.f31993E;
        this.f31994F = bDLocation.f31994F;
        this.f31995G = bDLocation.f31995G;
        this.f31996H = bDLocation.f31996H;
        this.f31997I = bDLocation.f31997I;
        this.f31998J = bDLocation.f31998J;
        this.f31999K = bDLocation.f31999K;
        this.f32000L = bDLocation.f32000L;
        this.f32001M = bDLocation.f32001M;
        this.f32002N = bDLocation.f32002N;
        this.f32003O = bDLocation.f32003O;
        this.f32004P = bDLocation.f32004P;
        this.f32005Q = bDLocation.f32005Q;
        this.f32006R = bDLocation.f32006R;
        this.f32007S = bDLocation.f32007S;
        this.f32028u = bDLocation.f32028u;
    }
}
