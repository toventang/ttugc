package com.p2082ss.android.ugc.aweme.services.storage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40972g;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.storage.StorageServiceImpl$checkStorageClean$1 */
final class StorageServiceImpl$checkStorageClean$1<V> implements Callable {
    public static final StorageServiceImpl$checkStorageClean$1 INSTANCE = new StorageServiceImpl$checkStorageClean$1();

    static {
        Covode.recordClassIndex(79981);
    }

    StorageServiceImpl$checkStorageClean$1() {
    }

    @Override // java.util.concurrent.Callable
    public final void call() {
        EffectService instance = EffectService.getInstance();
        C89219l.m154716b(instance, "");
        C40972g.m82491a(instance.getCacheDir());
    }
}
