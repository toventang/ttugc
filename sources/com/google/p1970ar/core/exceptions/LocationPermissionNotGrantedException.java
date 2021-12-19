package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.LocationPermissionNotGrantedException */
public class LocationPermissionNotGrantedException extends SecurityException {
    static {
        Covode.recordClassIndex(32658);
    }

    public LocationPermissionNotGrantedException() {
        this("");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationPermissionNotGrantedException(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r0 = r2.length()
            java.lang.String r1 = "The Android permission ACCESS_FINE_LOCATION has not been granted prior to calling Session.configure() with Earth location estimation enabled (Config.EarthMode.ENABLED). "
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r1.concat(r2)
        L_0x0010:
            r3.<init>(r0)
            return
        L_0x0014:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1970ar.core.exceptions.LocationPermissionNotGrantedException.<init>(java.lang.String):void");
    }
}
