package com.android.billingclient.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.android.billingclient.api.g */
public final class C2240g {

    /* renamed from: a */
    public String f6717a;

    /* renamed from: b */
    public String f6718b;

    /* renamed from: c */
    public String f6719c;

    /* renamed from: d */
    public String f6720d;

    /* renamed from: e */
    public String f6721e;

    /* renamed from: f */
    public int f6722f;

    /* renamed from: g */
    ArrayList<SkuDetails> f6723g;

    /* renamed from: h */
    public boolean f6724h;

    static {
        Covode.recordClassIndex(2445);
    }

    /* renamed from: com.android.billingclient.api.g$a */
    public static class C2241a {

        /* renamed from: a */
        public String f6725a;

        /* renamed from: b */
        public String f6726b;

        /* renamed from: c */
        private String f6727c;

        /* renamed from: d */
        private String f6728d;

        /* renamed from: e */
        private int f6729e;

        /* renamed from: f */
        private ArrayList<SkuDetails> f6730f;

        /* renamed from: g */
        private boolean f6731g;

        static {
            Covode.recordClassIndex(2446);
        }

        private C2241a() {
        }

        /* renamed from: a */
        public final C2240g mo6210a() {
            ArrayList<SkuDetails> arrayList = this.f6730f;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<SkuDetails> arrayList2 = this.f6730f;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                SkuDetails skuDetails = arrayList2.get(i);
                i++;
                if (skuDetails == null) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            }
            if (this.f6730f.size() > 1) {
                SkuDetails skuDetails2 = this.f6730f.get(0);
                String c = skuDetails2.mo6173c();
                ArrayList<SkuDetails> arrayList3 = this.f6730f;
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    SkuDetails skuDetails3 = arrayList3.get(i2);
                    i2++;
                    if (!c.equals(skuDetails3.mo6173c())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String b = skuDetails2.mo6172b();
                if (TextUtils.isEmpty(b)) {
                    ArrayList<SkuDetails> arrayList4 = this.f6730f;
                    int size3 = arrayList4.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        SkuDetails skuDetails4 = arrayList4.get(i3);
                        i3++;
                        if (!TextUtils.isEmpty(skuDetails4.mo6172b())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                } else {
                    ArrayList<SkuDetails> arrayList5 = this.f6730f;
                    int size4 = arrayList5.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        SkuDetails skuDetails5 = arrayList5.get(i4);
                        i4++;
                        if (!b.equals(skuDetails5.mo6172b())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            C2240g gVar = new C2240g((byte) 0);
            gVar.f6717a = null;
            gVar.f6718b = this.f6725a;
            gVar.f6721e = this.f6726b;
            gVar.f6719c = this.f6727c;
            gVar.f6720d = this.f6728d;
            gVar.f6722f = this.f6729e;
            gVar.f6723g = this.f6730f;
            gVar.f6724h = this.f6731g;
            return gVar;
        }

        /* synthetic */ C2241a(byte b) {
            this();
        }

        /* renamed from: a */
        public final C2241a mo6209a(SkuDetails skuDetails) {
            ArrayList<SkuDetails> arrayList = new ArrayList<>();
            arrayList.add(skuDetails);
            this.f6730f = arrayList;
            return this;
        }
    }

    private C2240g() {
    }

    /* renamed from: b */
    public static C2241a m6860b() {
        return new C2241a((byte) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo6208a() {
        boolean z;
        ArrayList<SkuDetails> arrayList = this.f6723g;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            SkuDetails skuDetails = arrayList.get(i);
            i++;
            if (skuDetails.mo6172b().isEmpty()) {
                z = false;
                break;
            }
        }
        if (!this.f6724h && this.f6718b == null && this.f6717a == null && this.f6721e == null && this.f6722f == 0 && !z) {
            return false;
        }
        return true;
    }

    /* synthetic */ C2240g(byte b) {
        this();
    }
}
