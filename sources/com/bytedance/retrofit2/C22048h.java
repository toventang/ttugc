package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.retrofit2.h */
public final class C22048h {
    static {
        Covode.recordClassIndex(25738);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.h$a */
    public static class C22049a implements AbstractC22047g {

        /* renamed from: a */
        private final String f52074a;

        /* renamed from: b */
        private final String f52075b;

        static {
            Covode.recordClassIndex(25739);
        }

        @Override // com.bytedance.retrofit2.AbstractC22047g
        /* renamed from: a */
        public final String mo35849a() {
            return this.f52074a;
        }

        C22049a(String str, String str2) {
            this.f52074a = str;
            this.f52075b = str2;
        }
    }

    /* renamed from: a */
    public static AbstractC22047g m41433a(String str) {
        return new C22049a(str, "default");
    }
}
