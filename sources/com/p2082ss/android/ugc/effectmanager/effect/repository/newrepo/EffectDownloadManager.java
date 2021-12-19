package com.p2082ss.android.ugc.effectmanager.effect.repository.newrepo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectExtKt;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager */
public final class EffectDownloadManager {
    public static final EffectDownloadManager INSTANCE = new EffectDownloadManager();
    private static final ConcurrentHashMap<String, Effect> downloadingEffects = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, ConcurrentHashSet<IFetchEffectListener>> downloadingEffectsListener = new ConcurrentHashMap<>();

    private EffectDownloadManager() {
    }

    public final void destroy() {
        downloadingEffectsListener.clear();
    }

    static {
        Covode.recordClassIndex(95645);
    }

    public final List<Effect> currentDownloadingEffects() {
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, Effect>> entrySet = downloadingEffects.entrySet();
        C89219l.m154709a((Object) entrySet, "");
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public final void addDownloadEffect(Effect effect) {
        String expectedMd5;
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null) {
            downloadingEffects.put(expectedMd5, effect);
        }
    }

    public final boolean isDownloading(String str) {
        if (str == null) {
            return false;
        }
        return downloadingEffects.containsKey(str);
    }

    public final boolean isDownloaded(Effect effect) {
        if (effect != null && !isDownloading(EffectExtKt.expectedMd5(effect))) {
            return FileUtils.INSTANCE.checkFileExists(effect.getUnzipPath());
        }
        return false;
    }

    public final void finishDownloadEffect(Effect effect) {
        String expectedMd5;
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null) {
            ConcurrentHashSet<IFetchEffectListener> concurrentHashSet = downloadingEffectsListener.get(expectedMd5);
            if (concurrentHashSet != null) {
                Iterator<T> it = concurrentHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess(effect);
                }
            }
            downloadingEffectsListener.remove(expectedMd5);
            downloadingEffects.remove(expectedMd5);
        }
    }

    public final void startDownloadEffect(Effect effect) {
        String expectedMd5;
        ConcurrentHashSet<IFetchEffectListener> concurrentHashSet;
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null && (concurrentHashSet = downloadingEffectsListener.get(expectedMd5)) != null) {
            Iterator<T> it = concurrentHashSet.iterator();
            while (it.hasNext()) {
                it.next().onStart(effect);
            }
        }
    }

    public final void failedDownloadEffect(Effect effect, ExceptionResult exceptionResult) {
        String expectedMd5;
        C89219l.m154719c(exceptionResult, "");
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null) {
            ConcurrentHashSet<IFetchEffectListener> concurrentHashSet = downloadingEffectsListener.get(expectedMd5);
            if (concurrentHashSet != null) {
                Iterator<T> it = concurrentHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onFail(effect, exceptionResult);
                }
            }
            downloadingEffectsListener.remove(expectedMd5);
            downloadingEffects.remove(expectedMd5);
        }
    }

    public final void addDownloadListener(Effect effect, IFetchEffectListener iFetchEffectListener) {
        ConcurrentHashSet<IFetchEffectListener> putIfAbsent;
        C89219l.m154719c(iFetchEffectListener, "");
        if (effect != null) {
            if (isDownloading(EffectExtKt.expectedMd5(effect))) {
                String expectedMd5 = EffectExtKt.expectedMd5(effect);
                if (expectedMd5 != null) {
                    ConcurrentHashMap<String, ConcurrentHashSet<IFetchEffectListener>> concurrentHashMap = downloadingEffectsListener;
                    ConcurrentHashSet<IFetchEffectListener> concurrentHashSet = concurrentHashMap.get(expectedMd5);
                    if (concurrentHashSet == null && (putIfAbsent = concurrentHashMap.putIfAbsent(expectedMd5, (concurrentHashSet = new ConcurrentHashSet<>()))) != null) {
                        concurrentHashSet = putIfAbsent;
                    }
                    concurrentHashSet.add(iFetchEffectListener);
                }
            } else if (isDownloaded(effect)) {
                iFetchEffectListener.onSuccess(effect);
            } else {
                iFetchEffectListener.onFail(effect, new ExceptionResult(10005));
            }
        }
    }

    public final void onEffectDownloadProgressChange(Effect effect, int i, long j) {
        String expectedMd5;
        ConcurrentHashSet<IFetchEffectListener> concurrentHashSet;
        if (!(effect == null || (expectedMd5 = EffectExtKt.expectedMd5(effect)) == null || (concurrentHashSet = downloadingEffectsListener.get(expectedMd5)) == null)) {
            for (T t : concurrentHashSet) {
                if (t instanceof IEffectDownloadProgressListener) {
                    t.onProgress(effect, i, j);
                }
            }
        }
    }
}
