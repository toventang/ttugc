package com.bytedance.ies.ugc.aweme.commercialize.scene.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17886b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.AbstractC17891a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1249c.p1250a.AbstractC17892a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1252a.C17904a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1253b.C17915a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1254c.C17916a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1254c.C17922b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1255d.C17927a;
import com.p2082ss.android.ugc.C81908b;

public final class AdSceneServiceImpl implements IAdSceneService {
    static {
        Covode.recordClassIndex(20512);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    /* renamed from: c */
    public final AbstractC17897a mo28466c() {
        return C17927a.f42736a;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    /* renamed from: a */
    public final IMainAdScene mo28464a() {
        return new C17904a();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    /* renamed from: b */
    public final AbstractC17886b mo28465b() {
        return new C17915a();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    /* renamed from: d */
    public final AbstractC17891a mo28467d() {
        return new C17922b();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService
    /* renamed from: e */
    public final AbstractC17892a mo28468e() {
        return new C17916a();
    }

    /* renamed from: f */
    public static IAdSceneService m33210f() {
        MethodCollector.m26663i(6385);
        Object a = C81908b.m141854a(IAdSceneService.class, false);
        if (a != null) {
            IAdSceneService iAdSceneService = (IAdSceneService) a;
            MethodCollector.m26664o(6385);
            return iAdSceneService;
        }
        if (C81908b.f183197b == null) {
            synchronized (IAdSceneService.class) {
                try {
                    if (C81908b.f183197b == null) {
                        C81908b.f183197b = new AdSceneServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6385);
                    throw th;
                }
            }
        }
        AdSceneServiceImpl adSceneServiceImpl = (AdSceneServiceImpl) C81908b.f183197b;
        MethodCollector.m26664o(6385);
        return adSceneServiceImpl;
    }
}
