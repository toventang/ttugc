package com.facebook.p1814a;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24693ad;
import java.io.Serializable;

/* renamed from: com.facebook.a.a */
public final class C23866a implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final String f56489a;

    /* renamed from: b */
    private final String f56490b;

    static {
        Covode.recordClassIndex(27987);
    }

    public final String getAccessTokenString() {
        return this.f56489a;
    }

    public final String getApplicationId() {
        return this.f56490b;
    }

    /* renamed from: com.facebook.a.a$a */
    static class C23867a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a */
        private final String f56491a;

        /* renamed from: b */
        private final String f56492b;

        static {
            Covode.recordClassIndex(27988);
        }

        private Object readResolve() {
            return new C23866a(this.f56491a, this.f56492b);
        }

        private C23867a(String str, String str2) {
            this.f56491a = str;
            this.f56492b = str2;
        }

        /* synthetic */ C23867a(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    private Object writeReplace() {
        return new C23867a(this.f56489a, this.f56490b, (byte) 0);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f56489a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.f56490b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23866a(com.facebook.AccessToken r3) {
        /*
            r2 = this;
            java.lang.String r1 = r3.f56404e
            com.facebook.internal.C24699ae.m47299a()
            java.lang.String r0 = com.facebook.C24872m.f59041a
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.C23866a.<init>(com.facebook.AccessToken):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23866a)) {
            return false;
        }
        C23866a aVar = (C23866a) obj;
        if (!C24693ad.m47260a((Object) aVar.f56489a, (Object) this.f56489a) || !C24693ad.m47260a((Object) aVar.f56490b, (Object) this.f56490b)) {
            return false;
        }
        return true;
    }

    public C23866a(String str, String str2) {
        this.f56489a = C24693ad.m47261a(str) ? null : str;
        this.f56490b = str2;
    }
}
