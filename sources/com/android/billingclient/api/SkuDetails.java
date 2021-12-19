package com.android.billingclient.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import org.json.JSONObject;

public class SkuDetails {

    /* renamed from: a */
    public final String f6653a;

    /* renamed from: b */
    private final JSONObject f6654b;

    static {
        Covode.recordClassIndex(2423);
    }

    public int hashCode() {
        return this.f6653a.hashCode();
    }

    /* renamed from: a */
    public final String mo6171a() {
        return this.f6654b.optString("productId");
    }

    /* renamed from: b */
    public final String mo6172b() {
        return this.f6654b.optString("packageName");
    }

    /* renamed from: c */
    public final String mo6173c() {
        return this.f6654b.optString(StringSet.type);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo6174d() {
        return this.f6654b.optString("skuDetailsToken");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6653a);
        if (valueOf.length() != 0) {
            return "SkuDetails: ".concat(valueOf);
        }
        return new String("SkuDetails: ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.f6653a, ((SkuDetails) obj).f6653a);
    }

    public SkuDetails(String str) {
        this.f6653a = str;
        this.f6654b = new JSONObject(str);
        if (TextUtils.isEmpty(mo6171a())) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(mo6173c())) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    /* renamed from: com.android.billingclient.api.SkuDetails$a */
    static class C2219a {

        /* renamed from: a */
        public final List<SkuDetails> f6655a;

        /* renamed from: b */
        public final int f6656b;

        /* renamed from: c */
        public final String f6657c;

        static {
            Covode.recordClassIndex(2424);
        }

        public C2219a(int i, String str, List<SkuDetails> list) {
            this.f6656b = i;
            this.f6657c = str;
            this.f6655a = list;
        }
    }
}
