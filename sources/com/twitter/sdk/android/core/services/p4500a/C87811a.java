package com.twitter.sdk.android.core.services.p4500a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.twitter.sdk.android.core.services.a.a */
public class C87811a {

    /* renamed from: a */
    public final double f199470a;

    /* renamed from: b */
    public final double f199471b;

    /* renamed from: c */
    public final int f199472c;

    /* renamed from: d */
    public final EnumC87812a f199473d;

    static {
        Covode.recordClassIndex(103820);
    }

    /* renamed from: com.twitter.sdk.android.core.services.a.a$a */
    public enum EnumC87812a {
        MILES("mi"),
        KILOMETERS("km");
        
        public final String identifier;

        static {
            Covode.recordClassIndex(103821);
        }

        private EnumC87812a(String str) {
            this.identifier = str;
        }
    }

    public String toString() {
        return this.f199470a + "," + this.f199471b + "," + this.f199472c + this.f199473d.identifier;
    }
}
