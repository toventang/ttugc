package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1481d.ExecutorC20742b;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1825b.C24019b;
import com.facebook.p1826c.p1827a.AbstractC24023c;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24021a;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.lighten.loader.m */
public final class C20796m extends C24021a {

    /* renamed from: a */
    public ConcurrentHashMap<AbstractC24026e, List<SoftReference<AbstractC20799b>>> f49200a;

    /* renamed from: com.bytedance.lighten.loader.m$b */
    interface AbstractC20799b {
        static {
            Covode.recordClassIndex(24375);
        }

        /* renamed from: a */
        void mo34231a(File file);
    }

    static {
        Covode.recordClassIndex(24372);
    }

    /* renamed from: com.bytedance.lighten.loader.m$a */
    static class C20798a {

        /* renamed from: a */
        public static final C20796m f49203a = new C20796m((byte) 0);

        static {
            Covode.recordClassIndex(24374);
        }
    }

    private C20796m() {
        this.f49200a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C20796m(byte b) {
        this();
    }

    @Override // com.facebook.p1826c.p1827a.C24021a, com.facebook.p1826c.p1827a.AbstractC24024d
    /* renamed from: a */
    public final void mo34229a(AbstractC24023c cVar) {
        final AbstractC24026e a = cVar.mo39542a();
        ExecutorC20742b.C20743a.f48948a.execute(new Runnable() {
            /* class com.bytedance.lighten.loader.C20796m.RunnableC207971 */

            static {
                Covode.recordClassIndex(24373);
            }

            public final void run() {
                AbstractC24026e eVar;
                File file;
                AbstractC20799b bVar;
                if (!(C20796m.this.f49200a.size() == 0 || (eVar = a) == null)) {
                    AbstractC24018a a = C24428k.m46551a().mo40246d().mo39575a(eVar);
                    if (a == null) {
                        a = C24428k.m46551a().mo40250h().mo39575a(eVar);
                    }
                    if ((a instanceof C24019b) && (file = ((C24019b) a).f56886a) != null && file.exists()) {
                        C20796m mVar = C20796m.this;
                        AbstractC24026e eVar2 = a;
                        List<SoftReference<AbstractC20799b>> list = mVar.f49200a.get(eVar2);
                        if (!(list == null || list.isEmpty())) {
                            for (int i = 0; i < list.size(); i++) {
                                SoftReference<AbstractC20799b> softReference = list.get(i);
                                if (!(softReference == null || (bVar = softReference.get()) == null)) {
                                    bVar.mo34231a(file);
                                }
                            }
                            mVar.f49200a.remove(eVar2);
                        }
                    }
                }
            }
        });
    }
}
