package com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.settings.C68728ac;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.d */
public final class C40624d {

    /* renamed from: b */
    public static final AbstractC89244h f95082b = C89250i.m154773a((AbstractC89171a) C40626b.f95085a);

    /* renamed from: c */
    public static final C40625a f95083c = new C40625a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f95084a;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.d$a */
    public static final class C40625a {
        static {
            Covode.recordClassIndex(48465);
        }

        private C40625a() {
        }

        public /* synthetic */ C40625a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.d$b */
    static final class C40626b extends AbstractC89220m implements AbstractC89171a<C40624d> {

        /* renamed from: a */
        public static final C40626b f95085a = new C40626b();

        static {
            Covode.recordClassIndex(48466);
        }

        C40626b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40624d invoke() {
            return new C40624d((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.d$c */
    static final class C40627c extends AbstractC89220m implements AbstractC89171a<Map<String, String>> {

        /* renamed from: a */
        public static final C40627c f95086a = new C40627c();

        static {
            Covode.recordClassIndex(48467);
        }

        C40627c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, String> invoke() {
            return m81999a();
        }

        /* renamed from: a */
        private static Map<String, String> m81999a() {
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                C68728ac[] acVarArr = (C68728ac[]) SettingsManager.m29616a().mo25396a("android_source_url", C68728ac[].class);
                if (acVarArr != null) {
                    for (C68728ac acVar : acVarArr) {
                        String str2 = acVar.f153746a;
                        if (!(str2 == null || (str = acVar.f153747b) == null)) {
                            linkedHashMap.put(str2, str);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return linkedHashMap;
        }
    }

    private C40624d() {
        this.f95084a = C89250i.m154773a((AbstractC89171a) C40627c.f95086a);
    }

    static {
        Covode.recordClassIndex(48464);
    }

    public /* synthetic */ C40624d(byte b) {
        this();
    }
}
