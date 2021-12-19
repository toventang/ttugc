package com.android.billingclient.api;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.api.l */
public final class C2248l {

    /* renamed from: a */
    public String f6738a;

    /* renamed from: b */
    public String f6739b;

    /* renamed from: c */
    public List<String> f6740c;

    static {
        Covode.recordClassIndex(2453);
    }

    /* renamed from: com.android.billingclient.api.l$a */
    public static class C2249a {

        /* renamed from: a */
        public String f6741a;

        /* renamed from: b */
        private List<String> f6742b;

        static {
            Covode.recordClassIndex(2454);
        }

        private C2249a() {
        }

        /* renamed from: a */
        public final C2248l mo6215a() {
            if (this.f6741a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.f6742b != null) {
                C2248l lVar = new C2248l();
                lVar.f6738a = this.f6741a;
                lVar.f6740c = this.f6742b;
                lVar.f6739b = null;
                return lVar;
            } else {
                throw new IllegalArgumentException("SKUs list must be set");
            }
        }

        /* synthetic */ C2249a(byte b) {
            this();
        }

        /* renamed from: a */
        public final C2249a mo6214a(List<String> list) {
            this.f6742b = new ArrayList(list);
            return this;
        }
    }

    /* renamed from: a */
    public static C2249a m6868a() {
        return new C2249a((byte) 0);
    }
}
