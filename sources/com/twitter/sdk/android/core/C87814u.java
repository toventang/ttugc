package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.twitter.sdk.android.core.internal.p4499b.AbstractC87723e;

/* renamed from: com.twitter.sdk.android.core.u */
public class C87814u extends C87691i<TwitterAuthToken> {
    @AbstractC27891c(mo46611a = "user_name")

    /* renamed from: c */
    public final String f199478c;

    static {
        Covode.recordClassIndex(103823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.twitter.sdk.android.core.u$a */
    public static class C87815a implements AbstractC87723e<C87814u> {

        /* renamed from: a */
        private final C27910f f199479a = new C27910f();

        static {
            Covode.recordClassIndex(103824);
        }

        C87815a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String mo142118a(C87814u uVar) {
            if (uVar == null || uVar.f199192a == null) {
                return "";
            }
            try {
                return this.f199479a.mo46674b(uVar);
            } catch (Exception e) {
                AbstractC87688f c = C87794k.m152811c();
                e.getMessage();
                c.mo142113b();
                return "";
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C87814u mo142117a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (C87814u) this.f199479a.mo46670a(str, C87814u.class);
            } catch (Exception e) {
                AbstractC87688f c = C87794k.m152811c();
                e.getMessage();
                c.mo142113b();
                return null;
            }
        }
    }

    @Override // com.twitter.sdk.android.core.C87691i
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.f199478c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // com.twitter.sdk.android.core.C87691i
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f199478c;
        String str2 = ((C87814u) obj).f199478c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public C87814u(TwitterAuthToken twitterAuthToken, long j, String str) {
        super(twitterAuthToken, j);
        this.f199478c = str;
    }
}
