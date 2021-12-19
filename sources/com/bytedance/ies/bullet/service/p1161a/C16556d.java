package com.bytedance.ies.bullet.service.p1161a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.a.d */
public final class C16556d {

    /* renamed from: b */
    public static final C16556d f39680b = new C16556d();

    /* renamed from: c */
    public static final AbstractC89171a<String> f39681c = C16558b.f39684a;

    /* renamed from: d */
    public static final C16557a f39682d = new C16557a((byte) 0);

    /* renamed from: a */
    public final Map<String, SoftReference<AbstractC16552b>> f39683a = new LinkedHashMap();

    /* renamed from: com.bytedance.ies.bullet.service.a.d$a */
    public static final class C16557a {
        static {
            Covode.recordClassIndex(18993);
        }

        private C16557a() {
        }

        public /* synthetic */ C16557a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.a.d$b */
    static final class C16558b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C16558b f39684a = new C16558b();

        static {
            Covode.recordClassIndex(18994);
        }

        C16558b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String uuid = UUID.randomUUID().toString();
            C89219l.m154709a((Object) uuid, "");
            return uuid;
        }
    }

    static {
        Covode.recordClassIndex(18992);
    }
}
