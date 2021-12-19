package com.p2082ss.android.ugc.effectmanager.common.cache;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.p2082ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.p2082ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.InputStream;
import java.util.regex.Pattern;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.cache.EffectDiskLruCache */
public final class EffectDiskLruCache implements ICache {
    private OldEffectDiskLruCache realEffectDiskLruCache;

    static {
        Covode.recordClassIndex(95444);
    }

    public EffectDiskLruCache(EffectConfiguration effectConfiguration) {
        this(effectConfiguration, 0, 2, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final void clear() {
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final void removePattern(Pattern pattern) {
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removePattern(pattern);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final boolean has(String str) {
        C89219l.m154719c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.has(str);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final InputStream queryToStream(String str) {
        C89219l.m154719c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.queryToStream(str);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final String queryToValue(String str) {
        C89219l.m154719c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.queryToValue(str);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final boolean remove(String str) {
        C89219l.m154719c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.remove(str);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final void removePattern(String str) {
        C89219l.m154719c(str, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removePattern(str);
        }
    }

    public final void removeEffect(Effect effect) {
        C89219l.m154719c(effect, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removeEffect(effect);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void readEffectInMemory(Effect effect) {
        String unzipPath;
        String name;
        C89219l.m154719c(effect, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null && (unzipPath = effect.getUnzipPath()) != null && (name = new File(unzipPath).getName()) != null) {
            oldEffectDiskLruCache.readKeyInMemory(name);
        }
    }

    public EffectDiskLruCache(EffectConfiguration effectConfiguration, long j) {
        C89219l.m154719c(effectConfiguration, "");
        this.realEffectDiskLruCache = OldEffectDiskLruCache.getInstance(effectConfiguration);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final long save(String str, InputStream inputStream) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(inputStream, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.save(str, inputStream);
        }
        return 0;
    }

    public final void unzipEffectToDisk(Effect effect, MonitorTrace monitorTrace) {
        C89219l.m154719c(effect, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.unzipEffectToDisk(effect, monitorTrace);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache
    public final long save(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.save(str, str2);
        }
        return 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectDiskLruCache(EffectConfiguration effectConfiguration, long j, int i, C89214g gVar) {
        this(effectConfiguration, (i & 2) != 0 ? -1 : j);
    }

    public final void writeEffectZipToDisk(Effect effect, InputStream inputStream, String str, long j, DownloadListener downloadListener) {
        C89219l.m154719c(effect, "");
        C89219l.m154719c(inputStream, "");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.writeEffectZipToDisk(effect, inputStream, j, downloadListener);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
