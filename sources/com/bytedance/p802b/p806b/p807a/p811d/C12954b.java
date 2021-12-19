package com.bytedance.p802b.p806b.p807a.p811d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.C13113a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.b.b.a.d.b */
public final class C12954b {

    /* renamed from: a */
    SharedPreferences f31544a;

    /* renamed from: b */
    JSONArray f31545b = new JSONArray();

    /* renamed from: c */
    public String f31546c;

    /* renamed from: d */
    public long f31547d;

    /* renamed from: e */
    private volatile boolean f31548e;

    static {
        Covode.recordClassIndex(14790);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b.a.d.b$b */
    public enum EnumC12956b {
        SERVER_DROP("server drop message"),
        FULL_DISK("disk is full");
        

        /* renamed from: c */
        private String f31553c;

        public final String toString() {
            return this.f31553c;
        }

        static {
            Covode.recordClassIndex(14792);
        }

        private EnumC12956b(String str) {
            this.f31553c = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b.a.d.b$a */
    public static final class C12955a {

        /* renamed from: a */
        public static final C12954b f31549a = new C12954b();

        static {
            Covode.recordClassIndex(14791);
        }
    }

    C12954b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONArray mo20810a() {
        mo20811b();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < this.f31545b.length(); i++) {
            try {
                if (i < 10) {
                    jSONArray.put(this.f31545b.get(i));
                } else {
                    jSONArray2.put(this.f31545b.get(i));
                }
            } catch (Exception unused) {
            }
        }
        this.f31545b = jSONArray2;
        this.f31544a.edit().putString("drop_data_items", this.f31545b.toString()).commit();
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo20811b() {
        if (!this.f31548e) {
            this.f31548e = true;
            SharedPreferences a = C34822d.m71158a(C13113a.f31955g, C13037a.m23436d() + "_drop_message", 0);
            this.f31544a = a;
            String string = a.getString("drop_data_items", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f31545b = new JSONArray(string);
                } catch (Exception unused) {
                }
            }
        }
    }
}
