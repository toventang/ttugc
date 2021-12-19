package com.bytedance.bdlocation;

import android.location.Address;
import android.location.Location;
import com.bytedance.covode.number.Covode;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.bdlocation.e */
public final class C13167e {
    static {
        Covode.recordClassIndex(15114);
    }

    /* renamed from: a */
    public static boolean m23700a(Location location) {
        if (location == null) {
            return true;
        }
        if (Double.compare(location.getLatitude(), 0.0d) == 0 && Double.compare(location.getLongitude(), 0.0d) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m23699a(long j, long j2) {
        if (j != 0 && Calendar.getInstance().getTimeInMillis() - j < j2 + 5000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static BDLocation m23698a(List<Address> list, BDLocation bDLocation) {
        if (C13182f.m23710a((Collection) list)) {
            return null;
        }
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        Iterator<Address> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Address next = it.next();
            if (next.hasLatitude() && next.hasLongitude()) {
                bDLocation2.f32009b = next.getCountryName();
                bDLocation2.f32010c = next.getAdminArea();
                bDLocation2.f32011d = next.getSubAdminArea();
                bDLocation2.f32012e = next.getLocality();
                bDLocation2.f32013f = next.getSubLocality();
                break;
            }
        }
        return bDLocation2;
    }

    /* renamed from: a */
    public static BDLocation m23697a(BDLocation bDLocation, BDLocation bDLocation2) {
        BDLocation bDLocation3 = new BDLocation(bDLocation);
        bDLocation3.f32008a = bDLocation2.f32008a;
        bDLocation3.f32012e = bDLocation2.f32012e;
        bDLocation3.f32010c = bDLocation2.f32010c;
        bDLocation3.f32011d = bDLocation2.f32011d;
        bDLocation3.setProvider(bDLocation2.getProvider());
        bDLocation3.f32013f = bDLocation2.f32013f;
        bDLocation3.f32009b = bDLocation2.f32009b;
        bDLocation3.f32029v = bDLocation2.f32029v;
        bDLocation3.f32033z = bDLocation2.f32033z;
        bDLocation3.f31989A = bDLocation2.f31989A;
        bDLocation3.f31990B = bDLocation2.f31990B;
        bDLocation3.f31992D = bDLocation2.f31992D;
        bDLocation3.f31993E = bDLocation2.f31993E;
        bDLocation3.f31995G = bDLocation2.f31995G;
        bDLocation3.f31996H = bDLocation2.f31996H;
        bDLocation3.f31997I = bDLocation2.f31997I;
        bDLocation3.f31998J = bDLocation2.f31998J;
        bDLocation3.f31999K = bDLocation2.f31999K;
        bDLocation3.f32000L = bDLocation2.f32000L;
        bDLocation3.f32001M = bDLocation2.f32001M;
        bDLocation3.f32002N = bDLocation2.f32002N;
        bDLocation3.f32003O = bDLocation2.f32003O;
        bDLocation3.f32016i = bDLocation2.f32016i;
        bDLocation3.f32017j = bDLocation2.f32017j;
        bDLocation3.f32018k = bDLocation2.f32018k;
        bDLocation3.f32019l = bDLocation2.f32019l;
        bDLocation3.f32022o = bDLocation2.f32022o;
        bDLocation3.f32023p = bDLocation2.f32023p;
        bDLocation3.f32024q = bDLocation2.f32024q;
        bDLocation3.f32025r = bDLocation2.f32025r;
        return bDLocation3;
    }
}
