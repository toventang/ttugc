package com.bytedance.android.ecommerce.p159e;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.android.ecommerce.p157c.AbstractC2767b;
import com.bytedance.android.ecommerce.p158d.C2772a;
import com.bytedance.android.ecommerce.p163i.AbstractC2801b;
import com.bytedance.android.ecommerce.p164j.AbstractC2813k;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.ecommerce.e.a */
public final class C2773a {

    /* renamed from: a */
    public final Application f8315a;

    /* renamed from: b */
    public String f8316b;

    /* renamed from: c */
    public JSONArray f8317c;

    /* renamed from: d */
    public JSONArray f8318d;

    /* renamed from: e */
    public JSONArray f8319e;

    /* renamed from: f */
    public final boolean f8320f;

    /* renamed from: g */
    public String f8321g;

    /* renamed from: h */
    public String f8322h;

    /* renamed from: i */
    public String f8323i;

    /* renamed from: j */
    public String f8324j;

    /* renamed from: k */
    public AbstractC2801b f8325k;

    /* renamed from: l */
    public String f8326l;

    /* renamed from: m */
    public AbstractC13621j f8327m;

    /* renamed from: n */
    public String f8328n;

    /* renamed from: o */
    public String f8329o;

    /* renamed from: p */
    public AbstractC2813k f8330p;

    /* renamed from: q */
    public String f8331q;

    /* renamed from: r */
    public String f8332r;

    /* renamed from: s */
    public AbstractC2767b f8333s;

    static {
        Covode.recordClassIndex(3199);
    }

    /* renamed from: com.bytedance.android.ecommerce.e.a$a */
    public static class C2774a {

        /* renamed from: a */
        public final Application f8334a;

        /* renamed from: b */
        public String f8335b;

        /* renamed from: c */
        public JSONObject f8336c;

        /* renamed from: d */
        public JSONArray f8337d;

        /* renamed from: e */
        public JSONArray f8338e;

        /* renamed from: f */
        public JSONArray f8339f;

        /* renamed from: g */
        public boolean f8340g = true;

        /* renamed from: h */
        public String f8341h;

        /* renamed from: i */
        public String f8342i;

        /* renamed from: j */
        public String f8343j;

        /* renamed from: k */
        public String f8344k;

        /* renamed from: l */
        public AbstractC2801b f8345l;

        /* renamed from: m */
        public String f8346m;

        /* renamed from: n */
        public AbstractC13621j f8347n;

        /* renamed from: o */
        public String f8348o;

        /* renamed from: p */
        public String f8349p;

        /* renamed from: q */
        public AbstractC2813k f8350q;

        /* renamed from: r */
        public String f8351r;

        /* renamed from: s */
        public String f8352s;

        /* renamed from: t */
        public AbstractC2767b f8353t;

        static {
            Covode.recordClassIndex(3200);
        }

        /* renamed from: a */
        public final C2773a mo7355a() {
            JSONObject jSONObject = this.f8336c;
            if (jSONObject != null) {
                if (this.f8337d == null) {
                    this.f8337d = jSONObject.optJSONArray("bank_card_rules");
                }
                if (this.f8338e == null) {
                    this.f8338e = this.f8336c.optJSONArray("methods");
                }
                if (this.f8339f == null) {
                    this.f8339f = this.f8336c.optJSONArray("stored_methods");
                }
            }
            if (this.f8337d == null) {
                this.f8337d = new JSONArray();
            }
            if (this.f8338e == null) {
                this.f8338e = new JSONArray();
            }
            if (this.f8339f == null) {
                this.f8339f = new JSONArray();
            }
            TextUtils.isEmpty(this.f8343j);
            if (TextUtils.isEmpty(this.f8341h)) {
                this.f8341h = "k8vif92e";
            }
            if (TextUtils.isEmpty(this.f8342i)) {
                this.f8342i = "bytedance";
            }
            if (TextUtils.isEmpty(this.f8346m)) {
                this.f8346m = "en";
            }
            if (this.f8345l == null) {
                this.f8345l = new C2782f();
            }
            if (this.f8347n == null) {
                this.f8347n = AbstractC13621j.f33100a;
            }
            return new C2773a(this);
        }

        public C2774a(Application application) {
            this.f8334a = application;
        }
    }

    public final String toString() {
        return "{mContext=" + this.f8315a + ", mHost='" + this.f8316b + '\'' + ", mBankCardRules=" + this.f8317c + ", mMethods=" + this.f8318d + ", mStoredMethods=" + this.f8319e + ", mOrgId='" + this.f8321g + '\'' + ", mMerchantId='" + this.f8322h + '\'' + ", mSessionId='" + this.f8323i + '\'' + ", mRsaPublicKey='" + this.f8324j + '\'' + '}';
    }

    public C2773a(C2774a aVar) {
        this.f8315a = aVar.f8334a;
        this.f8316b = aVar.f8335b;
        this.f8317c = aVar.f8337d;
        this.f8318d = aVar.f8338e;
        this.f8319e = aVar.f8339f;
        this.f8320f = aVar.f8340g;
        this.f8321g = aVar.f8341h;
        this.f8322h = aVar.f8342i;
        this.f8323i = aVar.f8343j;
        this.f8324j = aVar.f8344k;
        this.f8325k = aVar.f8345l;
        this.f8326l = aVar.f8346m;
        this.f8327m = aVar.f8347n;
        this.f8328n = aVar.f8348o;
        this.f8329o = aVar.f8349p;
        this.f8330p = aVar.f8350q;
        this.f8331q = aVar.f8351r;
        this.f8332r = aVar.f8352s;
        this.f8333s = aVar.f8353t;
        if (!TextUtils.isEmpty(this.f8316b)) {
            C2772a.f8314a = this.f8316b;
        }
    }
}
