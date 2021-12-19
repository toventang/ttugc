package com.p2082ss.android.ugc.effectmanager.common.cache;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.effectmanager.common.cache.EffectCacheManager */
public final class EffectCacheManager {
    public static final Companion Companion = new Companion(null);
    public static final AbstractC89244h instance$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, EffectCacheManager$Companion$instance$2.INSTANCE);
    private HashMap<String, ICache> caches;

    /* renamed from: com.ss.android.ugc.effectmanager.common.cache.EffectCacheManager$Companion */
    public static final class Companion {
        static final /* synthetic */ AbstractC89286i[] $$delegatedProperties = {new C89232y(C89204ab.m154669a(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager;")};

        public final EffectCacheManager getInstance() {
            return (EffectCacheManager) EffectCacheManager.instance$delegate.getValue();
        }

        private Companion() {
        }

        static {
            Covode.recordClassIndex(95442);
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    private EffectCacheManager() {
        this.caches = new HashMap<>();
    }

    static {
        Covode.recordClassIndex(95441);
    }

    public /* synthetic */ EffectCacheManager(C89214g gVar) {
        this();
    }

    public final synchronized ICache getCache(String str) {
        MethodCollector.m26663i(508);
        C89219l.m154719c(str, "");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(508);
            return null;
        } else if (!this.caches.containsKey(str)) {
            MethodCollector.m26664o(508);
            return null;
        } else {
            ICache iCache = this.caches.get(str);
            MethodCollector.m26664o(508);
            return iCache;
        }
    }

    public final synchronized void setCache(String str, ICache iCache) {
        MethodCollector.m26663i(509);
        C89219l.m154719c(str, "");
        this.caches.put(str, iCache);
        MethodCollector.m26664o(509);
    }
}
