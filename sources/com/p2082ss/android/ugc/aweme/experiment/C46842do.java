package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.do */
public final class C46842do {

    /* renamed from: a */
    public static final Keva f109131a = Keva.getRepo("remove_onboarding_steps");

    /* renamed from: b */
    public static final String f109132b;

    /* renamed from: c */
    public static final AbstractC89244h f109133c = C89250i.m154773a((AbstractC89171a) C46844b.f109135a);

    /* renamed from: d */
    public static final C46843a f109134d = new C46843a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.experiment.do$a */
    public static final class C46843a {
        static {
            Covode.recordClassIndex(55444);
        }

        /* renamed from: a */
        public static Boolean m90156a() {
            return (Boolean) C46842do.f109133c.getValue();
        }

        private C46843a() {
        }

        /* renamed from: b */
        public static String m90157b() {
            if (!m90156a().booleanValue()) {
                return null;
            }
            if (C46845c.m90158a() != null) {
                return C46845c.m90158a();
            }
            if (C46846d.m90160a() != null) {
                return C46846d.m90160a();
            }
            return null;
        }

        public /* synthetic */ C46843a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.do$c */
    public static final class C46845c {

        /* renamed from: a */
        public static final int f109136a = 0;

        /* renamed from: b */
        public static final C46845c f109137b = new C46845c();

        /* renamed from: c */
        private static final int f109138c = 1;

        /* renamed from: d */
        private static final int f109139d = 2;

        /* renamed from: e */
        private static final int f109140e = 3;

        /* renamed from: f */
        private static final int f109141f = 4;

        /* renamed from: g */
        private static final Set<String> f109142g = C89047am.m154438a((Object[]) new String[]{"IL", "PH", "TH", "TW"});

        private C46845c() {
        }

        /* renamed from: b */
        private static boolean m90159b() {
            if (!f109142g.contains(C46842do.f109132b)) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(55446);
            C46843a.m90156a();
        }

        /* renamed from: a */
        public static String m90158a() {
            if (m90159b()) {
                return null;
            }
            int a = C16048b.m29633a().mo25411a("gender_selection_onboarding_countries", ClientExpManager.gender_selection_onboarding_countries());
            if (a == f109136a) {
                return "70315650";
            }
            if (a == f109138c) {
                return "70315651";
            }
            if (a == f109139d) {
                return "70315652";
            }
            if (a == f109140e) {
                return "70315653";
            }
            if (a == f109141f) {
                return "70315654";
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.do$d */
    public static final class C46846d {

        /* renamed from: a */
        public static final int f109143a = 0;

        /* renamed from: b */
        public static final C46846d f109144b = new C46846d();

        /* renamed from: c */
        private static final int f109145c = 1;

        /* renamed from: d */
        private static final int f109146d = 2;

        /* renamed from: e */
        private static final int f109147e = 3;

        /* renamed from: f */
        private static final int f109148f = 4;

        /* renamed from: g */
        private static final Set<String> f109149g = C89047am.m154438a((Object[]) new String[]{"AE", "BD", "EG", "ID", "MY", "NG", "PK", "SA"});

        private C46846d() {
        }

        /* renamed from: b */
        private static boolean m90161b() {
            if (!f109149g.contains(C46842do.f109132b)) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(55447);
        }

        /* renamed from: a */
        public static String m90160a() {
            if (m90161b()) {
                return null;
            }
            int a = C16048b.m29633a().mo25411a("gender_selection_onboarding_gender_sensitive_countries", ClientExpManager.gender_selection_onboarding_gender_sensitive_countries());
            if (a == f109143a) {
                return "70315655";
            }
            if (a == f109145c) {
                return "70315656";
            }
            if (a == f109146d) {
                return "70315657";
            }
            if (a == f109147e) {
                return "70315658";
            }
            if (a == f109148f) {
                return "70315659";
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.do$b */
    static final class C46844b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46844b f109135a = new C46844b();

        static {
            Covode.recordClassIndex(55445);
        }

        C46844b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            if (C46842do.f109131a.contains("is_new_user_key")) {
                return Boolean.valueOf(C46842do.f109131a.getBoolean("is_new_user_key", false));
            }
            Boolean a = C49907s.m93685a();
            Keva keva = C46842do.f109131a;
            C89219l.m154716b(a, "");
            keva.storeBoolean("is_new_user_key", a.booleanValue());
            return a;
        }
    }

    static {
        Covode.recordClassIndex(55443);
        String a = C58071d.m104907a();
        C89219l.m154716b(a, "");
        Locale locale = Locale.ROOT;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        f109132b = upperCase;
    }
}
