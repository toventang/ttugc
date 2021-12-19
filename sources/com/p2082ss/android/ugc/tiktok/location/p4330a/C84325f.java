package com.p2082ss.android.ugc.tiktok.location.p4330a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.tiktok.location.a.f */
public final class C84325f {

    /* renamed from: a */
    public static final Set<String> f188555a = new LinkedHashSet();

    /* renamed from: b */
    public static boolean f188556b;

    /* renamed from: c */
    public static final C84325f f188557c = new C84325f();

    /* renamed from: d */
    private static final AbstractC89244h f188558d = C89250i.m154773a((AbstractC89171a) C84326a.f188559a);

    /* renamed from: a */
    static Keva m145023a() {
        return (Keva) f188558d.getValue();
    }

    private C84325f() {
    }

    /* renamed from: com.ss.android.ugc.tiktok.location.a.f$a */
    static final class C84326a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C84326a f188559a = new C84326a();

        static {
            Covode.recordClassIndex(98256);
        }

        C84326a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("tiktok-location");
        }
    }

    /* renamed from: b */
    public static boolean m145024b() {
        return m145023a().getBoolean("has_consented_location_permission", false);
    }

    /* renamed from: c */
    public static boolean m145025c() {
        return m145023a().getBoolean("has_deny_location_permission_manually", false);
    }

    static {
        Covode.recordClassIndex(98255);
    }
}
