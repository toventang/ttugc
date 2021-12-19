package com.p2082ss.android.ugc.aweme.search.p3687e;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.C15531c;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.p1107a.AbstractC15506b;
import com.bytedance.lynx.hybrid.AbstractC21195h;
import com.bytedance.lynx.hybrid.C21217l;
import com.lynx.tasm.TemplateData;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.p3693i.AbstractC67457c;
import com.p2082ss.android.ugc.aweme.search.p3693i.C67455a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.e.c */
public final class C67372c implements AbstractC67457c {

    /* renamed from: a */
    private static final C67373a f150945a = new C67373a((byte) 0);

    static {
        Covode.recordClassIndex(79002);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.e.c$a */
    static final class C67373a {
        static {
            Covode.recordClassIndex(79003);
        }

        private C67373a() {
        }

        public /* synthetic */ C67373a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.e.c$b */
    public static final class C67374b implements AbstractC15506b {

        /* renamed from: a */
        final /* synthetic */ String f150946a;

        static {
            Covode.recordClassIndex(79004);
        }

        C67374b(String str) {
            this.f150946a = str;
        }

        @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15506b
        /* renamed from: a */
        public final void mo25247a(AbstractC21195h hVar) {
            C89219l.m154721d(hVar, "");
            if (!(hVar instanceof C21217l)) {
                hVar = null;
            }
            C21217l lVar = (C21217l) hVar;
            if (lVar != null) {
                lVar.f50350k = TemplateData.m56771a(this.f150946a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3693i.AbstractC67457c
    /* renamed from: a */
    public final void mo106290a(C67455a aVar) {
        ActivityC0945e eVar;
        C42345d dVar;
        String schema;
        boolean z;
        boolean z2;
        C89219l.m154721d(aVar, "");
        if (C67382e.m119425a() && (eVar = aVar.f151126a) != null && (dVar = aVar.f151127b) != null && (schema = dVar.getSchema()) != null) {
            String rawData = aVar.f151127b.getRawData();
            if (!C67375d.m119421c()) {
                C67370b.m119416a((C67368a) new C67384g().mo106452c("fail_type", "1"), rawData);
                return;
            }
            AbstractC1174ac a = C1181ae.m3881a(aVar.f151126a, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
            C89219l.m154716b(a, "");
            SearchIntermediateViewModel searchIntermediateViewModel = (SearchIntermediateViewModel) a;
            Integer value = searchIntermediateViewModel.getIntermediateState().getValue();
            if (value != null && value.intValue() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (C67458j.f151133b >= 0) {
                Integer value2 = searchIntermediateViewModel.getSearchTabIndex().getValue();
                int i = C67458j.f151133b;
                if (value2 != null && value2.intValue() == i) {
                    z2 = true;
                    searchIntermediateViewModel.getSearchTabIndex().getValue();
                    if (!z && z2) {
                        C15531c.C15532a.m28665a(eVar, new SparkContext().mo25238a(schema).mo25236a(new C67374b(rawData))).mo25316a();
                        C67370b.m119416a(new C67383f(), rawData);
                        return;
                    }
                }
            }
            z2 = false;
            searchIntermediateViewModel.getSearchTabIndex().getValue();
            if (!z) {
            }
        }
    }
}
