package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.C55675b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.i */
public final class C55667i {

    /* renamed from: f */
    public static final C55668a f126963f = new C55668a((byte) 0);

    /* renamed from: a */
    public final EnumC55669j f126964a;

    /* renamed from: b */
    public final C19538ai f126965b;

    /* renamed from: c */
    public final C55671l f126966c;

    /* renamed from: d */
    public final Integer f126967d;

    /* renamed from: e */
    public final C55675b f126968e;

    static {
        Covode.recordClassIndex(65450);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.i$a */
    public static final class C55668a {
        static {
            Covode.recordClassIndex(65451);
        }

        private C55668a() {
        }

        public /* synthetic */ C55668a(byte b) {
            this();
        }
    }

    public final String toString() {
        return "MessageNotification(message=" + this.f126965b + ", property=" + this.f126966c + ')';
    }

    private C55667i(EnumC55669j jVar, C19538ai aiVar, C55671l lVar, Integer num, C55675b bVar) {
        C89219l.m154721d(jVar, "");
        this.f126964a = jVar;
        this.f126965b = aiVar;
        this.f126966c = lVar;
        this.f126967d = num;
        this.f126968e = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C55667i(EnumC55669j jVar, C19538ai aiVar, C55671l lVar, Integer num, C55675b bVar, int i) {
        this(jVar, (i & 2) != 0 ? null : aiVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : num, (i & 16) == 0 ? bVar : null);
    }
}
