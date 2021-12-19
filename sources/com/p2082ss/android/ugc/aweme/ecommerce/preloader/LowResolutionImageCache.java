package com.p2082ss.android.ugc.aweme.ecommerce.preloader;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.LowResolutionImageCache */
public final class LowResolutionImageCache implements ILowResolutionImageCache {

    /* renamed from: a */
    public static final C0490e<String, String> f105128a = new C0490e<>(128);

    /* renamed from: b */
    public static final C45086a f105129b = new C45086a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.LowResolutionImageCache$a */
    public static final class C45086a {
        static {
            Covode.recordClassIndex(53517);
        }

        private C45086a() {
        }

        public /* synthetic */ C45086a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(53516);
    }

    /* renamed from: a */
    public static ILowResolutionImageCache m87735a() {
        MethodCollector.m26663i(7235);
        Object a = C81908b.m141854a(ILowResolutionImageCache.class, false);
        if (a != null) {
            ILowResolutionImageCache iLowResolutionImageCache = (ILowResolutionImageCache) a;
            MethodCollector.m26664o(7235);
            return iLowResolutionImageCache;
        }
        if (C81908b.f183230bg == null) {
            synchronized (ILowResolutionImageCache.class) {
                try {
                    if (C81908b.f183230bg == null) {
                        C81908b.f183230bg = new LowResolutionImageCache();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7235);
                    throw th;
                }
            }
        }
        LowResolutionImageCache lowResolutionImageCache = (LowResolutionImageCache) C81908b.f183230bg;
        MethodCollector.m26664o(7235);
        return lowResolutionImageCache;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache
    /* renamed from: a */
    public final void mo76181a(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            f105128a.mo2092a(str, str2);
        }
    }
}
