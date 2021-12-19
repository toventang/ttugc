package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.AbstractC20757n;
import com.bytedance.lighten.p1477a.C20750g;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20736m;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.AbstractC24529ag;
import com.facebook.imagepipeline.p1889n.AbstractC24545al;
import com.facebook.imagepipeline.p1889n.AbstractC24585c;
import com.facebook.imagepipeline.p1889n.AbstractC24596k;
import com.facebook.imagepipeline.p1889n.C24587e;
import com.facebook.imagepipeline.p1889n.C24614t;
import com.p1812f.p1813a.C23836c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.lighten.loader.p */
final class C20802p extends AbstractC24585c<C20804a> {

    /* renamed from: a */
    private AbstractC20757n f49206a;

    /* renamed from: b */
    private String f49207b;

    static {
        Covode.recordClassIndex(24378);
    }

    public final String toString() {
        return "use fetcher: " + this.f49207b;
    }

    public C20802p(AbstractC20757n nVar) {
        this.f49206a = nVar;
    }

    /* renamed from: com.bytedance.lighten.loader.p$a */
    public static class C20804a extends C24614t {

        /* renamed from: a */
        public C20750g f49210a;

        static {
            Covode.recordClassIndex(24380);
        }

        public C20804a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
            super(kVar, alVar);
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final /* synthetic */ C24614t createFetchState(AbstractC24596k kVar, AbstractC24545al alVar) {
        C20804a aVar = new C20804a(kVar, alVar);
        aVar.f49210a = new C20750g();
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.n.t, int] */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24585c, com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final /* synthetic */ void onFetchCompletion(C20804a aVar, int i) {
        C20804a aVar2 = aVar;
        if (aVar2.f49210a.f48983j != null) {
            aVar2.f49210a.f48983j.run();
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final /* synthetic */ void fetch(C24614t tVar, AbstractC24529ag.AbstractC24530a aVar) {
        C20804a aVar2 = (C20804a) tVar;
        if (aVar2 != null) {
            C20800n nVar = new C20800n(aVar);
            aVar2.f49210a.f48981h = aVar2.mo40453c();
            aVar2.f49210a.f48982i = new C20801o(aVar2.f58495e);
            aVar2.f49210a.f48979f = aVar2.mo40451a();
            aVar2.f49210a.f48985l = aVar2.mo40454d();
            C23836c cVar = C20820t.f49250a;
            if (cVar != null) {
                aVar2.f49210a.f48984k = cVar.f56375b;
            }
            final AbstractC20736m a = this.f49206a.mo34173a();
            this.f49207b = a.getClass().getName();
            a.mo34163a(aVar2.f49210a);
            aVar2.f58495e.mo40414a(new C24587e() {
                /* class com.bytedance.lighten.loader.C20802p.C208031 */

                static {
                    Covode.recordClassIndex(24379);
                }

                @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
                /* renamed from: a */
                public final void mo34237a() {
                    a.mo34162a();
                }
            });
            a.mo34164a(aVar2.f49210a, nVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.imagepipeline.n.t, int] */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24585c, com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public final /* synthetic */ Map getExtraMap(C20804a aVar, int i) {
        String str;
        C20804a aVar2 = aVar;
        HashMap hashMap = new HashMap(5);
        if (aVar2.f49210a.f48975b == 0 || aVar2.f49210a.f48974a == 0) {
            hashMap.put("queue_time", Long.toString(-1));
        } else {
            hashMap.put("queue_time", Long.toString(aVar2.f49210a.f48975b - aVar2.f49210a.f48974a));
        }
        if (aVar2.f49210a.f48977d == 0 || aVar2.f49210a.f48975b == 0) {
            hashMap.put("fetch_time", Long.toString(-1));
        } else {
            hashMap.put("fetch_time", Long.toString(aVar2.f49210a.f48977d - aVar2.f49210a.f48975b));
        }
        if (aVar2.f49210a.f48977d == 0 || aVar2.f49210a.f48974a == 0) {
            hashMap.put("total_time", Long.toString(-1));
        } else {
            hashMap.put("total_time", Long.toString(aVar2.f49210a.f48977d - aVar2.f49210a.f48974a));
        }
        hashMap.put("image_size", Integer.toString(i));
        if (aVar2.f49210a.f48980g) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("hit_cdn_cache", str);
        hashMap.put("content_length", Long.toString(aVar2.f49210a.f48986m));
        return hashMap;
    }
}
