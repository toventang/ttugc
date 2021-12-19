package com.bytedance.android.ecommerce.p153a.p155b;

import android.graphics.Bitmap;
import com.bytedance.android.ecommerce.p153a.C2738b;
import com.bytedance.android.ecommerce.p165k.C2829d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.a.b.b */
public final class C2740b extends C2739a {

    /* renamed from: f */
    public String f8196f;

    /* renamed from: g */
    public C2738b f8197g;

    /* renamed from: h */
    public String f8198h;

    /* renamed from: i */
    public C2738b f8199i;

    /* renamed from: j */
    public String f8200j;

    /* renamed from: k */
    public String f8201k;

    /* renamed from: l */
    public String f8202l;

    /* renamed from: m */
    public boolean f8203m;

    /* renamed from: n */
    public Bitmap f8204n;

    static {
        Covode.recordClassIndex(3166);
    }

    /* renamed from: a */
    public final byte[] mo7323a() {
        Bitmap bitmap = this.f8204n;
        if (bitmap == null) {
            return new byte[0];
        }
        return C2829d.m8100a(bitmap);
    }

    @Override // com.bytedance.android.ecommerce.p153a.p155b.C2739a
    public final String toString() {
        return "OcrResponse{mExpiredDate='" + this.f8196f + '\'' + ", mExpiredDateCorners=" + this.f8197g + ", mNumber='" + this.f8198h + '\'' + ", mNumberCorners=" + this.f8199i + ", mBankId='" + this.f8200j + '\'' + ", mBankName='" + this.f8201k + '\'' + ", mCardName='" + this.f8202l + '\'' + ", mIsValid=" + this.f8203m + ", mNumberBitmap=" + this.f8204n + ", mResponseJsonObject=" + this.f8191a + ", mSign='" + this.f8192b + '\'' + ", mResultCode='" + this.f8193c + '\'' + ", mErrorCode='" + this.f8194d + '\'' + ", mErrorMessage='" + this.f8195e + '\'' + '}';
    }

    public C2740b(String str) {
        super(str);
        boolean z;
        JSONObject jSONObject = this.f8191a;
        try {
            this.f8196f = jSONObject.optString("expired_date");
            this.f8197g = new C2738b(jSONObject.getJSONObject("expired_date_corners"));
            this.f8198h = jSONObject.optString("number");
            this.f8199i = new C2738b(jSONObject.getJSONObject("number_corners"));
            this.f8200j = jSONObject.optString("bank_id");
            this.f8201k = jSONObject.optString("bank_name");
            this.f8202l = jSONObject.optString("card_name");
            if (!this.f8197g.f8188i || !this.f8199i.f8188i) {
                z = false;
            } else {
                z = true;
            }
            this.f8203m = z;
        } catch (Throwable th) {
            this.f8195e = th.getMessage();
        }
    }
}
