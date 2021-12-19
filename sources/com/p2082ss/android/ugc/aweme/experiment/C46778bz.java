package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.bz */
public final class C46778bz {

    /* renamed from: a */
    public static final C46778bz f108993a = new C46778bz();

    /* renamed from: b */
    private static final AbstractC89244h f108994b = C89250i.m154773a((AbstractC89171a) C46779a.f108997a);

    /* renamed from: c */
    private static final AbstractC89244h f108995c = C89250i.m154773a((AbstractC89171a) C46780b.f108998a);

    /* renamed from: d */
    private static final AbstractC89244h f108996d = C89250i.m154773a((AbstractC89171a) C46781c.f108999a);

    /* renamed from: a */
    public static int m90127a() {
        return ((Number) f108994b.getValue()).intValue();
    }

    /* renamed from: b */
    public static final boolean m90128b() {
        return ((Boolean) f108995c.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static final List<String> m90129c() {
        return (List) f108996d.getValue();
    }

    private C46778bz() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bz$b */
    static final class C46780b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46780b f108998a = new C46780b();

        static {
            Covode.recordClassIndex(55381);
        }

        C46780b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C46778bz.m90127a() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bz$a */
    static final class C46779a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46779a f108997a = new C46779a();

        static {
            Covode.recordClassIndex(55380);
        }

        C46779a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "detail_page_experiment", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.bz$c */
    static final class C46781c extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C46781c f108999a = new C46781c();

        static {
            Covode.recordClassIndex(55382);
        }

        C46781c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            int a = C46778bz.m90127a();
            if (a == 1) {
                return C89070n.m154522b("common_feed_item_feed", "common_feed_item_feed", "common_feed_item_feed");
            }
            if (a != 2) {
                return C89086z.INSTANCE;
            }
            return C89070n.m154522b("aweme_comment_fragment_input_detail", "common_feed_item_feed", "common_feed_item_feed", "common_feed_item_feed");
        }
    }

    static {
        Covode.recordClassIndex(55379);
    }
}
