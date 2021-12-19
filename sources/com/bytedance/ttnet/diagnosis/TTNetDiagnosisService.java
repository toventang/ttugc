package com.bytedance.ttnet.diagnosis;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.bytedance.ttnet.C22932c;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TTNetDiagnosisService {
    private static final Map<Integer, String> sTypeStringMap;

    private static C14659h getCronetHttpClient() {
        if (C22932c.m43218a()) {
            return C14659h.m26802a(TTNetInit.getTTNetDepend().mo37259a());
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    static {
        Covode.recordClassIndex(26858);
        HashMap hashMap = new HashMap();
        sTypeStringMap = hashMap;
        hashMap.put(0, "DNS_RESOLVE_TARGET");
        hashMap.put(1, "RACE_TARGETS");
        hashMap.put(2, "ACCELERATE_TARGET");
        hashMap.put(3, "DIAGNOSE_TARGET");
        hashMap.put(4, "DIAGNOSE_V2_TARGET");
    }

    private static String requestTypeToString(int i) {
        return sTypeStringMap.get(Integer.valueOf(i));
    }

    private static boolean isOneTargetRequestType(int i) {
        if (i != 0) {
            if (i == 1) {
                return false;
            }
            if (!(i == 2 || i == 3 || i == 4)) {
                throw new IllegalArgumentException("Illegal request type: ".concat(String.valueOf(i)));
            }
        }
        return true;
    }

    public static void reportUserLog(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                if (getCronetHttpClient() == null) {
                    return;
                }
                if (C14659h.f35584c != null) {
                    Reflect.m24529on(C14659h.f35584c).call("reportNetDiagnosisUserLog", new Class[]{String.class}, str);
                    return;
                }
                throw new UnsupportedOperationException("CronetEngine has not been initialized.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isValidNetDetect(int i, long j) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                throw new IllegalArgumentException("Illegal request type: ".concat(String.valueOf(i)));
            } else if (j == 1 || j == 2 || j == 64) {
                return true;
            } else {
                return false;
            }
        } else if ((67 & j) == 0 || (j & -68) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static IDiagnosisRequest createRequest(int i, String str, int i2, int i3) {
        if (!isOneTargetRequestType(i)) {
            throw new IllegalArgumentException("Type " + requestTypeToString(i) + " of request should be created with multiple targets.");
        } else if (!isValidNetDetect(i, (long) i2)) {
            throw new IllegalArgumentException("Illegal netDetectType: ".concat(String.valueOf(i2)));
        } else if (i != 0 && i != 2 && i != 3 && i != 4) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            return new C22946a(i, arrayList, i2, i3);
        }
    }

    public static IDiagnosisRequest createRequest(int i, List<String> list, int i2, int i3) {
        if (isOneTargetRequestType(i)) {
            throw new IllegalArgumentException("Type " + requestTypeToString(i) + " of request should be created with only one target.");
        } else if (!isValidNetDetect(i, (long) i2)) {
            throw new IllegalArgumentException("Illegal netDetectType: ".concat(String.valueOf(i2)));
        } else if (i != 1) {
            return null;
        } else {
            return new C22946a(i, list, i2, i3);
        }
    }
}
