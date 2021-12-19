package com.android.billingclient.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

public class Purchase {

    /* renamed from: a */
    public final String f6646a;

    /* renamed from: b */
    public final String f6647b;

    /* renamed from: c */
    public final JSONObject f6648c;

    static {
        Covode.recordClassIndex(2420);
    }

    public int hashCode() {
        return this.f6646a.hashCode();
    }

    /* renamed from: a */
    public final String mo6160a() {
        return this.f6648c.optString("orderId");
    }

    /* renamed from: b */
    public final String mo6161b() {
        return this.f6648c.optString("productId");
    }

    /* renamed from: c */
    public final String mo6162c() {
        JSONObject jSONObject = this.f6648c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: d */
    public final int mo6163d() {
        if (this.f6648c.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    /* renamed from: e */
    public final boolean mo6164e() {
        return this.f6648c.optBoolean("acknowledged", true);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6646a);
        if (valueOf.length() != 0) {
            return "Purchase. Json: ".concat(valueOf);
        }
        return new String("Purchase. Json: ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (!TextUtils.equals(this.f6646a, purchase.f6646a) || !TextUtils.equals(this.f6647b, purchase.f6647b)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.android.billingclient.api.Purchase$a */
    public static class C2218a {

        /* renamed from: a */
        public final List<Purchase> f6649a;

        /* renamed from: b */
        public final C2242h f6650b;

        static {
            Covode.recordClassIndex(2421);
        }

        public C2218a(C2242h hVar, List<Purchase> list) {
            this.f6649a = list;
            this.f6650b = hVar;
        }
    }

    public Purchase(String str, String str2) {
        this.f6646a = str;
        this.f6647b = str2;
        this.f6648c = new JSONObject(str);
    }
}
