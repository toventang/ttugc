package com.google.android.gms.internal.p1949h;

import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.C2242h;
import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.h.b */
public final class C25756b {

    /* renamed from: a */
    public static int f60875a = Runtime.getRuntime().availableProcessors();

    static {
        Covode.recordClassIndex(31171);
    }

    /* renamed from: b */
    private static Bundle m49717b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m49713a(Bundle bundle) {
        if (bundle == null) {
            return 6;
        }
        Object a = m49716a(bundle, "RESPONSE_CODE");
        if (a == null) {
            return 0;
        }
        if (a instanceof Integer) {
            return ((Integer) a).intValue();
        }
        String valueOf = String.valueOf(a.getClass().getName());
        if (valueOf.length() != 0) {
            "Unexpected type for bundle response code: ".concat(valueOf);
        } else {
            new String("Unexpected type for bundle response code: ");
        }
        return 6;
    }

    /* renamed from: b */
    public static String m49718b(Bundle bundle) {
        Object a;
        if (bundle == null || (a = m49716a(bundle, "DEBUG_MESSAGE")) == null) {
            return "";
        }
        if (a instanceof String) {
            return (String) a;
        }
        String valueOf = String.valueOf(a.getClass().getName());
        if (valueOf.length() != 0) {
            "Unexpected type for debug message: ".concat(valueOf);
        } else {
            new String("Unexpected type for debug message: ");
        }
        return "";
    }

    /* renamed from: a */
    public static C2242h m49715a(Intent intent) {
        if (intent == null) {
            C2242h.C2243a a = C2242h.m6864a();
            a.f6734a = 6;
            a.f6735b = "An internal error occurred.";
            return a.mo6211a();
        }
        C2242h.C2243a a2 = C2242h.m6864a();
        a2.f6734a = m49713a(m49717b(intent));
        a2.f6735b = m49718b(m49717b(intent));
        return a2.mo6211a();
    }

    /* renamed from: c */
    public static List<Purchase> m49719c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase a = m49714a(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (a == null) {
                return null;
            }
            arrayList.add(a);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                Purchase a2 = m49714a(stringArrayList.get(i), stringArrayList2.get(i));
                if (a2 != null) {
                    arrayList.add(a2);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Object m49716a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Purchase m49714a(String str, String str2) {
        Purchase purchase = null;
        if (str == null || str2 == null) {
            return null;
        }
        try {
            purchase = new Purchase(str, str2);
            return purchase;
        } catch (JSONException e) {
            String.valueOf(String.valueOf(e)).length();
            return purchase;
        }
    }
}
