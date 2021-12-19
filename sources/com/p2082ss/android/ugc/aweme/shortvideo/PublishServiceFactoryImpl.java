package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.C74090h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.C74093j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a.C72572a;
import com.p2082ss.android.ugc.aweme.story.publish.C77447j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl */
public class PublishServiceFactoryImpl implements IPublishServiceFactory {
    static {
        Covode.recordClassIndex(82124);
    }

    /* renamed from: a */
    public static IPublishServiceFactory m123157a() {
        MethodCollector.m26663i(4206);
        Object a = C81908b.m141854a(IPublishServiceFactory.class, false);
        if (a != null) {
            IPublishServiceFactory iPublishServiceFactory = (IPublishServiceFactory) a;
            MethodCollector.m26664o(4206);
            return iPublishServiceFactory;
        }
        if (C81908b.f183329dZ == null) {
            synchronized (IPublishServiceFactory.class) {
                try {
                    if (C81908b.f183329dZ == null) {
                        C81908b.f183329dZ = new PublishServiceFactoryImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4206);
                    throw th;
                }
            }
        }
        PublishServiceFactoryImpl publishServiceFactoryImpl = (PublishServiceFactoryImpl) C81908b.f183329dZ;
        MethodCollector.m26664o(4206);
        return publishServiceFactoryImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory
    /* renamed from: a */
    public final AbstractC71893j mo104631a(C72678q qVar) {
        int i = qVar.f162935h;
        int i2 = qVar.f162934g;
        if (i == 0) {
            return new C72572a(new TTUploaderService(), qVar.f162928a, qVar.f162930c, i, i2, qVar.f162938k);
        }
        throw new AssertionError("videoType == ".concat(String.valueOf(i)));
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory
    /* renamed from: a */
    public final AbstractC74304x<C69831ai> mo104633a(int i, Object obj) {
        if (i == 0) {
            return new C70649ds(i, obj);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory
    /* renamed from: a */
    public final AbstractC74088f mo104632a(int i, AbstractC71893j jVar, int i2, int i3, String str, boolean z, C74090h hVar, AbstractC74304x<C69831ai> xVar) {
        Object obj = hVar.f166340a.get("is_story");
        Boolean bool = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null && bool2.booleanValue()) {
            return new C77447j(jVar, i, i2, i3, str, z, xVar);
        }
        Object obj2 = hVar.f166340a.get("is_shoutouts");
        if (obj2 instanceof Boolean) {
            bool = obj2;
        }
        Boolean bool3 = bool;
        if (bool3 == null || !bool3.booleanValue()) {
            return new C74062a(jVar, i, i2, i3, str, z, xVar);
        }
        return new C74093j(jVar, i, i2, i3, str, z, xVar);
    }
}
