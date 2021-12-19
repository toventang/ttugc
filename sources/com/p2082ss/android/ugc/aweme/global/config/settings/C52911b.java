package com.p2082ss.android.ugc.aweme.global.config.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.global.config.settings.b */
public class C52911b {

    /* renamed from: a */
    final Object f121684a = new Object();

    /* renamed from: b */
    final CopyOnWriteArrayList<AbstractC52909a> f121685b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public IESSettingsProxy f121686c;

    /* renamed from: d */
    C27910f f121687d = C80361dw.m139332a().mo46682b();

    static {
        Covode.recordClassIndex(62319);
    }

    C52911b() {
        mo88579a();
    }

    /* renamed from: a */
    public final void mo88579a() {
        MethodCollector.m26663i(6565);
        synchronized (this.f121684a) {
            try {
                this.f121686c = new IESSettingsProxy();
                Iterator<AbstractC52909a> it = this.f121685b.iterator();
                while (it.hasNext()) {
                    AbstractC52909a next = it.next();
                    next.mo61665a(this.f121686c);
                    if (next instanceof AbstractC52909a.C52910a) {
                        this.f121685b.remove(next);
                    }
                }
            } finally {
                MethodCollector.m26664o(6565);
            }
        }
    }
}
