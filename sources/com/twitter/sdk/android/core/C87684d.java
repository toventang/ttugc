package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.p4499b.AbstractC87723e;
import java.lang.reflect.Type;

/* renamed from: com.twitter.sdk.android.core.d */
public class C87684d extends C87691i<GuestAuthToken> {
    static {
        Covode.recordClassIndex(103671);
    }

    public C87684d(GuestAuthToken guestAuthToken) {
        super(guestAuthToken, 0);
    }

    /* renamed from: com.twitter.sdk.android.core.d$a */
    public static class C87685a implements AbstractC87723e<C87684d> {

        /* renamed from: a */
        private final C27910f f199177a = new C27917g().mo46681a((Type) GuestAuthToken.class, (Object) new AuthTokenAdapter()).mo46682b();

        static {
            Covode.recordClassIndex(103672);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String mo142118a(C87684d dVar) {
            if (dVar == null || dVar.f199192a == null) {
                return "";
            }
            try {
                return this.f199177a.mo46674b(dVar);
            } catch (Exception e) {
                AbstractC87688f c = C87794k.m152811c();
                e.getMessage();
                c.mo142113b();
                return "";
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C87684d mo142117a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (C87684d) this.f199177a.mo46670a(str, C87684d.class);
            } catch (Exception e) {
                AbstractC87688f c = C87794k.m152811c();
                e.getMessage();
                c.mo142113b();
                return null;
            }
        }
    }
}
