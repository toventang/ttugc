package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.a */
public final class C55337a {

    /* renamed from: a */
    static final Map<Long, Boolean> f126550a = new HashMap();

    /* renamed from: b */
    public static final C55337a f126551b = new C55337a();

    private C55337a() {
    }

    static {
        Covode.recordClassIndex(65102);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.a$a */
    public static final class C55338a implements AbstractC19479b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Long f126552a;

        static {
            Covode.recordClassIndex(65103);
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
        }

        public C55338a(Long l) {
            this.f126552a = l;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(Boolean bool) {
            C55337a.f126550a.put(this.f126552a, Boolean.valueOf(C89219l.m154714a((Object) bool, (Object) true)));
        }
    }

    /* renamed from: a */
    public static Boolean m101143a(long j) {
        return f126550a.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m101144a(long j, boolean z) {
        f126550a.put(Long.valueOf(j), Boolean.valueOf(z));
    }
}
