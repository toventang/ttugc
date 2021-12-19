package com.android.billingclient.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class PurchaseHistoryRecord {

    /* renamed from: a */
    public final String f6651a;

    /* renamed from: b */
    public final String f6652b;

    static {
        Covode.recordClassIndex(2422);
    }

    public int hashCode() {
        return this.f6651a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6651a);
        if (valueOf.length() != 0) {
            return "PurchaseHistoryRecord. Json: ".concat(valueOf);
        }
        return new String("PurchaseHistoryRecord. Json: ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (!TextUtils.equals(this.f6651a, purchaseHistoryRecord.f6651a) || !TextUtils.equals(this.f6652b, purchaseHistoryRecord.f6652b)) {
            return false;
        }
        return true;
    }
}
