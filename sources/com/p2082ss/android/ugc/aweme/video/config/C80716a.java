package com.p2082ss.android.ugc.aweme.video.config;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* renamed from: com.ss.android.ugc.aweme.video.config.a */
public final class C80716a {

    /* renamed from: a */
    public IPlayerExperiment f180460a;

    /* renamed from: b */
    public ISimPlayerConfig f180461b;

    static {
        Covode.recordClassIndex(94003);
    }

    private C80716a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.config.a$a */
    public static class C80717a {

        /* renamed from: a */
        public static final C80716a f180462a = new C80716a((byte) 0);

        static {
            Covode.recordClassIndex(94004);
        }
    }

    /* renamed from: b */
    public final IPlayerExperiment mo123865b() {
        IPlayerExperiment iPlayerExperiment = this.f180460a;
        if (iPlayerExperiment == null) {
            return (IPlayerExperiment) InjectedConfigManager.getConfig(IPlayerExperiment.class);
        }
        return iPlayerExperiment;
    }

    /* renamed from: a */
    public final ISimPlayerConfig mo123864a() {
        ISimPlayerConfig iSimPlayerConfig = this.f180461b;
        if (iSimPlayerConfig != null) {
            return iSimPlayerConfig;
        }
        return ((ISimPlayerConfigInjectWrapper) InjectedConfigManager.getConfig(ISimPlayerConfigInjectWrapper.class)).wrap((ISimPlayerConfig) InjectedConfigManager.getConfig(ISimPlayerConfig.class));
    }

    /* synthetic */ C80716a(byte b) {
        this();
    }
}
