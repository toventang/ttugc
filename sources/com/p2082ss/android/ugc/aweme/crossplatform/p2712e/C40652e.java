package com.p2082ss.android.ugc.aweme.crossplatform.p2712e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.e.e */
public final class C40652e {

    /* renamed from: b */
    public static final AbstractC89244h f95230b = C89250i.m154773a((AbstractC89171a) C40654b.f95233a);

    /* renamed from: c */
    public static final C40653a f95231c = new C40653a((byte) 0);

    /* renamed from: a */
    public final AbstractC89244h f95232a;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.e$a */
    public static final class C40653a {
        static {
            Covode.recordClassIndex(48493);
        }

        private C40653a() {
        }

        public /* synthetic */ C40653a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.e$b */
    static final class C40654b extends AbstractC89220m implements AbstractC89171a<C40652e> {

        /* renamed from: a */
        public static final C40654b f95233a = new C40654b();

        static {
            Covode.recordClassIndex(48494);
        }

        C40654b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40652e invoke() {
            return new C40652e((byte) 0);
        }
    }

    private C40652e() {
        this.f95232a = C89250i.m154773a((AbstractC89171a) new C40655c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.e.e$c */
    static final class C40655c extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C40652e f95234a;

        static {
            Covode.recordClassIndex(48495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40655c(C40652e eVar) {
            super(0);
            this.f95234a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            List i;
            Object[] objArr = (Object[]) SettingsManager.m29616a().mo25396a("aweme_data_prefetch_allow_list", String[].class);
            if (objArr == null || (i = C89064i.m154508i(objArr)) == null) {
                return C89086z.INSTANCE;
            }
            return i;
        }
    }

    static {
        Covode.recordClassIndex(48492);
    }

    public /* synthetic */ C40652e(byte b) {
        this();
    }
}
