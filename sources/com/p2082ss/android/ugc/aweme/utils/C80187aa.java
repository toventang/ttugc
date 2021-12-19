package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.bddatefmt.EnumC13147a;
import com.bytedance.covode.number.Covode;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.aa */
public final class C80187aa {

    /* renamed from: a */
    public static final AbstractC89244h f179638a = C89250i.m154773a((AbstractC89171a) C80200m.f179668a);

    /* renamed from: b */
    public static final AbstractC89244h f179639b = C89250i.m154773a((AbstractC89171a) C80194g.f179662a);

    /* renamed from: c */
    public static final AbstractC89244h f179640c = C89250i.m154773a((AbstractC89171a) C80195h.f179663a);

    /* renamed from: d */
    public static final AbstractC89244h f179641d = C89250i.m154773a((AbstractC89171a) C80193f.f179661a);

    /* renamed from: e */
    public static final AbstractC89244h f179642e = C89250i.m154773a((AbstractC89171a) C80197j.f179665a);

    /* renamed from: f */
    public static final AbstractC89244h f179643f = C89250i.m154773a((AbstractC89171a) C80192e.f179660a);

    /* renamed from: g */
    public static final AbstractC89244h f179644g = C89250i.m154773a((AbstractC89171a) C80189b.f179657a);

    /* renamed from: h */
    public static final AbstractC89244h f179645h = C89250i.m154773a((AbstractC89171a) C80191d.f179659a);

    /* renamed from: i */
    public static final AbstractC89244h f179646i = C89250i.m154773a((AbstractC89171a) C80190c.f179658a);

    /* renamed from: j */
    public static final AbstractC89244h f179647j = C89250i.m154773a((AbstractC89171a) C80198k.f179666a);

    /* renamed from: k */
    public static final AbstractC89244h f179648k = C89250i.m154773a((AbstractC89171a) C80199l.f179667a);

    /* renamed from: l */
    public static final AbstractC89244h f179649l = C89250i.m154773a((AbstractC89171a) C80205r.f179673a);

    /* renamed from: m */
    public static final AbstractC89244h f179650m = C89250i.m154773a((AbstractC89171a) C80196i.f179664a);

    /* renamed from: n */
    public static final AbstractC89244h f179651n = C89250i.m154773a((AbstractC89171a) C80206s.f179674a);

    /* renamed from: o */
    public static final AbstractC89244h f179652o = C89250i.m154773a((AbstractC89171a) C80201n.f179669a);

    /* renamed from: p */
    public static final AbstractC89244h f179653p = C89250i.m154773a((AbstractC89171a) C80202o.f179670a);

    /* renamed from: q */
    public static final AbstractC89244h f179654q = C89250i.m154773a((AbstractC89171a) C80203p.f179671a);

    /* renamed from: r */
    public static final AbstractC89244h f179655r = C89250i.m154773a((AbstractC89171a) C80204q.f179672a);

    /* renamed from: s */
    public static final C80188a f179656s = new C80188a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$a */
    public static final class C80188a {
        static {
            Covode.recordClassIndex(93456);
        }

        /* renamed from: a */
        public static BDDateFormat m139005a() {
            return (BDDateFormat) C80187aa.f179643f.getValue();
        }

        /* renamed from: b */
        public static BDDateFormat m139007b() {
            return (BDDateFormat) C80187aa.f179647j.getValue();
        }

        /* renamed from: c */
        public static BDDateFormat m139009c() {
            return (BDDateFormat) C80187aa.f179651n.getValue();
        }

        /* renamed from: d */
        public static BDDateFormat m139011d() {
            return (BDDateFormat) C80187aa.f179653p.getValue();
        }

        /* renamed from: e */
        public static BDDateFormat m139013e() {
            return (BDDateFormat) C80187aa.f179655r.getValue();
        }

        /* renamed from: f */
        private static BDDateFormat m139015f() {
            return (BDDateFormat) C80187aa.f179638a.getValue();
        }

        /* renamed from: g */
        private static BDDateFormat m139017g() {
            return (BDDateFormat) C80187aa.f179639b.getValue();
        }

        /* renamed from: h */
        private static BDDateFormat m139019h() {
            return (BDDateFormat) C80187aa.f179640c.getValue();
        }

        /* renamed from: i */
        private static BDDateFormat m139021i() {
            return (BDDateFormat) C80187aa.f179641d.getValue();
        }

        /* renamed from: j */
        private static BDDateFormat m139022j() {
            return (BDDateFormat) C80187aa.f179642e.getValue();
        }

        /* renamed from: k */
        private static BDDateFormat m139023k() {
            return (BDDateFormat) C80187aa.f179644g.getValue();
        }

        /* renamed from: l */
        private static BDDateFormat m139024l() {
            return (BDDateFormat) C80187aa.f179646i.getValue();
        }

        /* renamed from: m */
        private static BDDateFormat m139025m() {
            return (BDDateFormat) C80187aa.f179648k.getValue();
        }

        /* renamed from: n */
        private static BDDateFormat m139026n() {
            return (BDDateFormat) C80187aa.f179649l.getValue();
        }

        /* renamed from: o */
        private static BDDateFormat m139027o() {
            return (BDDateFormat) C80187aa.f179652o.getValue();
        }

        /* renamed from: p */
        private static BDDateFormat m139028p() {
            return (BDDateFormat) C80187aa.f179654q.getValue();
        }

        private C80188a() {
        }

        public /* synthetic */ C80188a(byte b) {
            this();
        }

        /* renamed from: f */
        public static boolean m139016f(long j) {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            C89219l.m154716b(instance2, "");
            instance2.setTimeInMillis(j);
            if (instance2.get(1) == instance.get(1)) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private static boolean m139018g(long j) {
            if (System.currentTimeMillis() < j) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        private static boolean m139020h(long j) {
            if (System.currentTimeMillis() - j < 604800000) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public static String m139012d(long j) {
            long millis = TimeUnit.SECONDS.toMillis(j);
            if (j == 0) {
                return "";
            }
            if (C80257bo.m139107a(millis)) {
                return BDDateFormat.m23653a(m139027o(), millis);
            }
            if (C80257bo.m139111c(millis)) {
                return BDDateFormat.m23653a(m139028p(), millis);
            }
            return BDDateFormat.m23653a(m139023k(), millis);
        }

        /* renamed from: a */
        public static String m139006a(long j) {
            if (System.currentTimeMillis() - j < 60000) {
                return BDDateFormat.m23653a((BDDateFormat) C80187aa.f179650m.getValue(), j);
            }
            if (System.currentTimeMillis() - j < 3600000) {
                return BDDateFormat.C13146a.m23657a(m139004a(j, 60000), EnumC13147a.MINUTE);
            }
            if (System.currentTimeMillis() - j < 86400000) {
                return BDDateFormat.C13146a.m23657a(m139004a(j, 3600000), EnumC13147a.HOUR);
            }
            if (m139020h(j)) {
                return BDDateFormat.C13146a.m23657a(m139004a(j, 86400000), EnumC13147a.DAY);
            }
            if (m139004a(j, 86400000) == 7) {
                return BDDateFormat.C13146a.m23657a(1, EnumC13147a.WEEK);
            }
            if (m139016f(j)) {
                return BDDateFormat.m23653a(m139021i(), j);
            }
            return BDDateFormat.m23653a(m139022j(), j);
        }

        /* renamed from: b */
        public static String m139008b(long j) {
            if (j == 0) {
                return "";
            }
            if (!m139018g(j)) {
                if (C80257bo.m139107a(j)) {
                    return BDDateFormat.m23653a(m139015f(), j);
                }
                if (C80257bo.m139109b(j)) {
                    return BDDateFormat.m23653a(m139026n(), j);
                }
                if (m139020h(j)) {
                    return BDDateFormat.m23653a(m139017g(), j);
                }
                if (m139016f(j)) {
                    return BDDateFormat.m23653a(m139021i(), j);
                }
            }
            return BDDateFormat.m23653a(m139022j(), j);
        }

        /* renamed from: c */
        public static String m139010c(long j) {
            if (j == 0) {
                return "";
            }
            if (!m139018g(j)) {
                if (C80257bo.m139107a(j)) {
                    return BDDateFormat.m23653a(m139015f(), j);
                }
                if (C80257bo.m139109b(j)) {
                    return BDDateFormat.m23653a(m139009c(), j);
                }
                if (m139020h(j)) {
                    return BDDateFormat.m23653a(m139019h(), j);
                }
                if (m139016f(j)) {
                    return BDDateFormat.m23653a(m139024l(), j);
                }
            }
            return BDDateFormat.m23653a(m139005a(), j);
        }

        /* renamed from: e */
        public static String m139014e(long j) {
            long millis = TimeUnit.SECONDS.toMillis(j);
            if (j == 0) {
                return "";
            }
            if (C80257bo.m139109b(millis)) {
                return BDDateFormat.m23653a(m139009c(), millis);
            }
            if (C80257bo.m139107a(millis)) {
                return BDDateFormat.m23653a(m139011d(), millis);
            }
            if (C80257bo.m139111c(millis)) {
                return BDDateFormat.m23653a(m139013e(), millis);
            }
            if (!m139016f(millis)) {
                return BDDateFormat.m23653a(m139007b(), millis);
            }
            return BDDateFormat.m23653a(m139025m(), millis);
        }

        /* renamed from: a */
        private static int m139004a(long j, long j2) {
            long currentTimeMillis = (System.currentTimeMillis() - j) / j2;
            if (currentTimeMillis > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) currentTimeMillis;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$b */
    static final class C80189b extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80189b f179657a = new C80189b();

        static {
            Covode.recordClassIndex(93457);
        }

        C80189b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("LL-Y, LT");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$c */
    static final class C80190c extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80190c f179658a = new C80190c();

        static {
            Covode.recordClassIndex(93458);
        }

        C80190c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("LL-Y, lt");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$d */
    static final class C80191d extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80191d f179659a = new C80191d();

        static {
            Covode.recordClassIndex(93459);
        }

        C80191d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("LL-Y lt");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$e */
    static final class C80192e extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80192e f179660a = new C80192e();

        static {
            Covode.recordClassIndex(93460);
        }

        C80192e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("LL lt");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$f */
    static final class C80193f extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80193f f179661a = new C80193f();

        static {
            Covode.recordClassIndex(93461);
        }

        C80193f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("M/D");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$g */
    static final class C80194g extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80194g f179662a = new C80194g();

        static {
            Covode.recordClassIndex(93462);
        }

        C80194g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("dddd");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$h */
    static final class C80195h extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80195h f179663a = new C80195h();

        static {
            Covode.recordClassIndex(93463);
        }

        C80195h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("dddd lt");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$i */
    static final class C80196i extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80196i f179664a = new C80196i();

        static {
            Covode.recordClassIndex(93464);
        }

        C80196i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("jn");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$j */
    static final class C80197j extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80197j f179665a = new C80197j();

        static {
            Covode.recordClassIndex(93465);
        }

        C80197j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("l");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$k */
    static final class C80198k extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80198k f179666a = new C80198k();

        static {
            Covode.recordClassIndex(93466);
        }

        C80198k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("lll");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$l */
    static final class C80199l extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80199l f179667a = new C80199l();

        static {
            Covode.recordClassIndex(93467);
        }

        C80199l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("lll-Y");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$m */
    static final class C80200m extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80200m f179668a = new C80200m();

        static {
            Covode.recordClassIndex(93468);
        }

        C80200m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("lt");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$n */
    static final class C80201n extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80201n f179669a = new C80201n();

        static {
            Covode.recordClassIndex(93469);
        }

        C80201n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("tdy LT");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$o */
    static final class C80202o extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80202o f179670a = new C80202o();

        static {
            Covode.recordClassIndex(93470);
        }

        C80202o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("tdy lt");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$p */
    static final class C80203p extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80203p f179671a = new C80203p();

        static {
            Covode.recordClassIndex(93471);
        }

        C80203p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("tmr LT");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$q */
    static final class C80204q extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80204q f179672a = new C80204q();

        static {
            Covode.recordClassIndex(93472);
        }

        C80204q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("tmr lt");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$r */
    static final class C80205r extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80205r f179673a = new C80205r();

        static {
            Covode.recordClassIndex(93473);
        }

        C80205r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("ytd");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.aa$s */
    static final class C80206s extends AbstractC89220m implements AbstractC89171a<BDDateFormat> {

        /* renamed from: a */
        public static final C80206s f179674a = new C80206s();

        static {
            Covode.recordClassIndex(93474);
        }

        C80206s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BDDateFormat invoke() {
            return new BDDateFormat("ytd lt");
        }
    }

    static {
        Covode.recordClassIndex(93455);
    }
}
