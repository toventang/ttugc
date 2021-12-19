package com.bytedance.android.p126a.p136b.p138b;

import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.a.b.b.b */
public final class C2665b {

    /* renamed from: a */
    public C2666a f7956a;

    /* renamed from: b */
    public String f7957b;

    /* renamed from: c */
    public String f7958c;

    /* renamed from: d */
    public Map<String, List<String>> f7959d;

    /* renamed from: e */
    public final C2626b f7960e;

    static {
        Covode.recordClassIndex(3053);
    }

    /* renamed from: com.bytedance.android.a.b.b.b$a */
    public static final class C2666a {

        /* renamed from: a */
        public String f7961a;

        /* renamed from: b */
        public String f7962b;

        /* renamed from: c */
        public Map<String, List<String>> f7963c;

        /* renamed from: d */
        public C2626b f7964d;

        static {
            Covode.recordClassIndex(3054);
        }

        /* renamed from: a */
        public final C2665b mo7182a() {
            if (this.f7964d == null) {
                C2640a.m7643a("c2s event is null");
            }
            return new C2665b(this);
        }
    }

    public C2665b(C2666a aVar) {
        this.f7956a = aVar;
        this.f7957b = aVar.f7961a;
        this.f7958c = aVar.f7962b;
        this.f7959d = aVar.f7963c;
        this.f7960e = aVar.f7964d;
    }
}
