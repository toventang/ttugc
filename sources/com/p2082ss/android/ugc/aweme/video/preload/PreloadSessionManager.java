package com.p2082ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.video.preload.PreloadSessionManager */
public final class PreloadSessionManager {

    /* renamed from: a */
    public static final PreloadSessionManager f180657a = new PreloadSessionManager();

    /* renamed from: b */
    private LruCache<String, PreloadSession> f180658b = new LruCache<>(100);

    /* renamed from: com.ss.android.ugc.aweme.video.preload.PreloadSessionManager$PreloadSession */
    public static class PreloadSession {
        public String key;
        public String sourceId;
        public int speed = -3;

        static {
            Covode.recordClassIndex(94076);
        }

        private PreloadSession() {
        }

        static PreloadSession instance() {
            return new PreloadSession();
        }
    }

    static {
        Covode.recordClassIndex(94075);
    }

    private PreloadSessionManager() {
    }

    /* renamed from: a */
    public final synchronized PreloadSession mo124003a(String str) {
        MethodCollector.m26663i(6094);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(6094);
            return null;
        }
        PreloadSession preloadSession = this.f180658b.get(str);
        if (preloadSession == null) {
            preloadSession = PreloadSession.instance();
            preloadSession.key = str;
            preloadSession.speed = -3;
        }
        this.f180658b.put(str, preloadSession);
        MethodCollector.m26664o(6094);
        return preloadSession;
    }

    /* renamed from: b */
    public final synchronized PreloadSession mo124004b(String str) {
        MethodCollector.m26663i(6096);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(6096);
            return null;
        }
        PreloadSession preloadSession = this.f180658b.get(str);
        MethodCollector.m26664o(6096);
        return preloadSession;
    }
}
