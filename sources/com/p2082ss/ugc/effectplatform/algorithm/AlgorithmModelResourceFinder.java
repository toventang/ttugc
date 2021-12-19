package com.p2082ss.ugc.effectplatform.algorithm;

import android.content.Context;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.algorithm.C86709e;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h;
import com.p2082ss.ugc.effectplatform.p4452i.AbstractC86801a;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.util.C87000n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder */
public final class AlgorithmModelResourceFinder extends C86707d implements ResourceFinder {
    public static final C86703a Companion = new C86703a((byte) 0);
    private static final ConcurrentHashMap<String, Boolean> modelsNotFoundRecord = new ConcurrentHashMap<>();
    private final C86734a algorithmModelCache;
    private final AssetResourceFinder assetResourceFinder;
    private final C86712f buildInAssetsManager;
    private final C86687a effectConfig;
    private long effectHandle;
    private final AbstractC86799h eventListener;

    public static final void modelNotFound(String str) {
        C86703a.m150196a(str);
    }

    private final native long nativeCreateResourceFinder(long j);

    /* renamed from: com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder$a */
    public static final class C86703a {
        static {
            Covode.recordClassIndex(102402);
        }

        private C86703a() {
        }

        public /* synthetic */ C86703a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m150196a(String str) {
            C89219l.m154719c(str, "");
            C88060b.m153136a("ResourceFinder", "modelNotFound:nameStr=".concat(String.valueOf(str)), null);
            C86709e.C86710a.m150208a().mo139947a().onModelNotFound(str, "asset://not_found");
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.algorithm.C86707d
    public final long getEffectHandle() {
        return this.effectHandle;
    }

    static {
        Covode.recordClassIndex(102401);
    }

    /* renamed from: com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m150195x73254756(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.algorithm.C86707d
    public final void onModelFound(String str) {
        C89219l.m154719c(str, "");
        mobModelFound(str);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final void release(long j) {
        this.effectHandle = 0;
        this.assetResourceFinder.release(j);
    }

    private final void mobModelFound(String str) {
        V v = this.effectConfig.f195463s.f199870a;
        if (v != null) {
            C86802b.m150351a((AbstractC86801a) v, true, this.effectConfig, str, "");
        }
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final long createNativeResourceFinder(long j) {
        MethodCollector.m26663i(378);
        C86705b.f195527b.mo139942a();
        this.effectHandle = j;
        this.assetResourceFinder.createNativeResourceFinder(j);
        long nativeCreateResourceFinder = nativeCreateResourceFinder(j);
        MethodCollector.m26664o(378);
        return nativeCreateResourceFinder;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.algorithm.C86707d
    public final boolean isExactBuiltInResource(String str) {
        Object obj;
        String str2 = "";
        C89219l.m154719c(str, str2);
        try {
            String substring = str.substring(0, C89361p.m154885a((CharSequence) str, "/"));
            C89219l.m154709a((Object) substring, str2);
            obj = C89379q.m157068constructorimpl(substring);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        boolean r0 = C89379q.m157073isFailureimpl(obj);
        Object obj2 = obj;
        if (r0) {
            obj2 = str2;
        }
        String str3 = (String) obj2;
        StringBuilder sb = new StringBuilder("model");
        if (str3.length() > 0) {
            str2 = "/".concat(String.valueOf(str3));
        }
        List<String> c = this.buildInAssetsManager.mo139956c(sb.append(str2).toString());
        String a = C87000n.m150684a(str);
        if (c != null) {
            Iterator<T> it = c.iterator();
            while (it.hasNext()) {
                if (C89219l.m154714a((Object) C87000n.m150684a(it.next()), (Object) a)) {
                    return true;
                }
            }
        }
        return super.isExactBuiltInResource(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.algorithm.C86707d
    public final String getBuiltInResourceUrl(String str) {
        Object obj;
        String str2 = "";
        C89219l.m154719c(str, str2);
        boolean z = false;
        try {
            String substring = str.substring(0, C89361p.m154885a((CharSequence) str, "/"));
            C89219l.m154709a((Object) substring, str2);
            obj = C89379q.m157068constructorimpl(substring);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        boolean r0 = C89379q.m157073isFailureimpl(obj);
        Object obj2 = obj;
        if (r0) {
            obj2 = str2;
        }
        String str3 = (String) obj2;
        StringBuilder sb = new StringBuilder("model");
        if (str3.length() > 0) {
            z = true;
        }
        if (z) {
            str2 = "/".concat(String.valueOf(str3));
        }
        String sb2 = sb.append(str2).toString();
        List<String> c = this.buildInAssetsManager.mo139956c(sb2);
        String a = C87000n.m150684a(str);
        if (c != null) {
            for (T t : c) {
                if (C89219l.m154714a((Object) C87000n.m150684a(t), (Object) a)) {
                    return "asset://" + sb2 + '/' + ((String) t);
                }
            }
        }
        return super.getBuiltInResourceUrl(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.algorithm.C86707d
    public final void onModelNotFound(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        super.onModelNotFound(str, str2);
        mobModelNotFound(str, str2);
    }

    private final void mobModelNotFound(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = modelsNotFoundRecord;
        if (!concurrentHashMap.contains(str)) {
            concurrentHashMap.put(str, true);
            V v = this.effectConfig.f195463s.f199870a;
            if (v != null) {
                C86802b.m150351a((AbstractC86801a) v, false, this.effectConfig, str, str2);
            }
        }
    }

    public static final String findResourceUri(String str, String str2) {
        C89219l.m154719c(str2, "");
        if (!C86709e.C86710a.m150209b()) {
            return "asset://not_initialized";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String realFindResourceUri = C86709e.C86710a.m150208a().mo139947a().realFindResourceUri(0, str, str2);
        C88060b.m153135a("checkEffect", "findResourceUri name: " + str2 + ", result: " + realFindResourceUri + ", time cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return realFindResourceUri;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlgorithmModelResourceFinder(C86734a aVar, C86712f fVar, AbstractC86799h hVar, C86687a aVar2) {
        super(aVar, fVar, hVar);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(aVar2, "");
        this.algorithmModelCache = aVar;
        this.buildInAssetsManager = fVar;
        this.eventListener = hVar;
        this.effectConfig = aVar2;
        Object obj = fVar.f195543a;
        if (obj != null) {
            Context com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m150195x73254756((Context) obj);
            C89219l.m154709a((Object) com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, "");
            this.assetResourceFinder = new AssetResourceFinder(com_ss_ugc_effectplatform_algorithm_AlgorithmModelResourceFinder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext.getAssets(), aVar.f195634a);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
