package com.bytedance.android.ecommerce.p153a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.bytedance.android.ecommerce.a.h */
public final class C2748h {

    /* renamed from: a */
    public JSONArray f8258a;

    /* renamed from: b */
    List<Integer> f8259b;

    /* renamed from: c */
    public String f8260c;

    /* renamed from: d */
    public JSONArray f8261d;

    /* renamed from: e */
    List<Integer> f8262e;

    /* renamed from: f */
    public String f8263f;

    /* renamed from: g */
    public String f8264g;

    /* renamed from: h */
    public String f8265h;

    /* renamed from: i */
    public String f8266i;

    /* renamed from: j */
    public String f8267j;

    static {
        Covode.recordClassIndex(3174);
    }

    /* renamed from: a */
    public final List<Integer> mo7334a() {
        if (this.f8262e == null) {
            this.f8262e = new ArrayList();
            if (this.f8261d != null) {
                for (int i = 0; i < this.f8261d.length(); i++) {
                    try {
                        this.f8262e.add((Integer) this.f8261d.get(i));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.f8262e;
    }

    public final String toString() {
        return "{mCvvLength=" + this.f8258a + ", mCvvLengthList=" + this.f8259b + ", mCardBrandRegex='" + this.f8260c + '\'' + ", mCardBrandLength=" + this.f8261d + ", mCardBrandLengthList=" + this.f8262e + ", mCardBrandDisplayName='" + this.f8263f + '\'' + ", mCardBrand='" + this.f8264g + '\'' + ", mPaymentMethodId='" + this.f8265h + '\'' + ", mIconUrl='" + this.f8266i + '\'' + ", mDarkIconUrl='" + this.f8267j + '\'' + '}';
    }

    public C2748h(C2733a aVar, C2746f fVar) {
        this.f8258a = aVar.f8147b;
        this.f8260c = aVar.f8148c;
        this.f8261d = aVar.f8149d;
        this.f8263f = aVar.f8150e;
        this.f8264g = aVar.f8151f;
        this.f8265h = fVar.f8238a;
        this.f8266i = fVar.f8240c;
        this.f8267j = fVar.f8241d;
    }
}
