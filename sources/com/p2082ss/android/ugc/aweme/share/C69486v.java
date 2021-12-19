package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import java.util.List;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.share.v */
public final class C69486v {

    /* renamed from: a */
    public static List<String> f155224a;

    /* renamed from: b */
    public static final C69486v f155225b = new C69486v();

    private C69486v() {
    }

    static {
        Covode.recordClassIndex(81826);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.v$a */
    public static final class C69487a implements IAVProcessService.IProcessCallback<Integer> {

        /* renamed from: a */
        final /* synthetic */ C1743j f155226a;

        static {
            Covode.recordClassIndex(81827);
        }

        public C69487a(C1743j jVar) {
            this.f155226a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
        public final /* synthetic */ void finish(Integer num) {
            this.f155226a.mo5557b(Integer.valueOf(num.intValue()));
        }
    }
}
