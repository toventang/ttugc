package com.p2082ss.android.ugc.aweme.global.config.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy */
public final class SettingsManagerProxy {
    private final C52911b settingManager;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy$1 */
    static /* synthetic */ class C529071 {
        static {
            Covode.recordClassIndex(62315);
        }
    }

    static {
        Covode.recordClassIndex(62314);
    }

    public static SettingsManagerProxy inst() {
        return C52908a.f121682a;
    }

    public final C27910f getGson() {
        return this.settingManager.f121687d;
    }

    public final void notifySettingsChange() {
        this.settingManager.mo88579a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy$a */
    public static final class C52908a {

        /* renamed from: a */
        public static final SettingsManagerProxy f121682a = new SettingsManagerProxy(null);

        static {
            Covode.recordClassIndex(62316);
        }
    }

    private SettingsManagerProxy() {
        this.settingManager = new C52911b();
    }

    /* synthetic */ SettingsManagerProxy(C529071 r1) {
        this();
    }

    public final void removeSettingsWatcher(AbstractC52909a aVar) {
        MethodCollector.m26663i(9619);
        C52911b bVar = this.settingManager;
        synchronized (bVar.f121684a) {
            try {
                bVar.f121685b.remove(aVar);
            } finally {
                MethodCollector.m26664o(9619);
            }
        }
    }

    public final void registerSettingsWatcher(AbstractC52909a aVar, boolean z) {
        MethodCollector.m26663i(9460);
        C52911b bVar = this.settingManager;
        synchronized (bVar.f121684a) {
            try {
                CopyOnWriteArrayList<AbstractC52909a> copyOnWriteArrayList = bVar.f121685b;
                if (z) {
                    aVar = new AbstractC52909a.C52910a(aVar);
                }
                copyOnWriteArrayList.add(aVar);
            } finally {
                MethodCollector.m26664o(9460);
            }
        }
    }
}
