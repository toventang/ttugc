package com.bytedance.sdk.bdlynx.p1677a.p1678a;

import android.content.Context;
import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.defaults.network.BdpNetworkService;
import com.bytedance.bdp.serviceapi.defaults.network.BdpResponseListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14421b;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14422c;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.a.a.c */
public final class C22595c {

    /* renamed from: a */
    public static final String f53386a = C14420a.f34881a;

    /* renamed from: b */
    public static final String f53387b = C14420a.f34882b;

    /* renamed from: c */
    public static final C22595c f53388c = new C22595c();

    /* renamed from: d */
    private static final String f53389d = C14420a.f34883c;

    /* renamed from: e */
    private static final String f53390e = C14420a.f34884d;

    /* renamed from: f */
    private static final String f53391f = C14420a.f34885e;

    /* renamed from: g */
    private static final AbstractC89244h f53392g = C89250i.m154773a((AbstractC89171a) C22597b.f53394a);

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.c$a */
    public static final class C22596a implements BdpResponseListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f53393a;

        static {
            Covode.recordClassIndex(26412);
        }

        public C22596a(AbstractC89172b bVar) {
            this.f53393a = bVar;
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.c$c */
    static final class C22598c implements BdpResponseListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f53395a;

        static {
            Covode.recordClassIndex(26414);
        }

        C22598c(AbstractC89172b bVar) {
            this.f53395a = bVar;
        }
    }

    /* renamed from: a */
    public static BdpNetworkService m42631a() {
        return (BdpNetworkService) f53392g.getValue();
    }

    private C22595c() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.c$b */
    static final class C22597b extends AbstractC89220m implements AbstractC89171a<BdpNetworkService> {

        /* renamed from: a */
        public static final C22597b f53394a = new C22597b();

        static {
            Covode.recordClassIndex(26413);
        }

        C22597b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BdpNetworkService invoke() {
            return BdpManager.getInst().getService(BdpNetworkService.class);
        }
    }

    static {
        Covode.recordClassIndex(26411);
    }

    /* renamed from: a */
    public static void m42632a(Context context, C14421b bVar, Map<String, String> map, byte[] bArr, AbstractC89172b<? super C14422c, C89391z> bVar2) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        if (map != null) {
            bVar.f34888b.putAll(map);
        }
        bVar.f34893g = bArr;
        m42631a().request(context, bVar.mo23239a(), new C22598c(bVar2));
    }
}
