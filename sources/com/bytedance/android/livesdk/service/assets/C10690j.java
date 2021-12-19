package com.bytedance.android.livesdk.service.assets;

import android.os.SystemClock;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.service.network.PropApi;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.service.assets.j */
public final class C10690j {

    /* renamed from: d */
    private static C10690j f25744d;

    /* renamed from: a */
    public final List<Prop> f25745a = new ArrayList();

    /* renamed from: b */
    public final List<AbstractC10691a> f25746b = new ArrayList();

    /* renamed from: c */
    boolean f25747c = false;

    /* renamed from: com.bytedance.android.livesdk.service.assets.j$a */
    public interface AbstractC10691a {
        static {
            Covode.recordClassIndex(12288);
        }

        /* renamed from: b */
        void mo16813b(List<Prop> list);
    }

    static {
        Covode.recordClassIndex(12287);
    }

    private C10690j() {
    }

    /* renamed from: a */
    public static synchronized C10690j m19257a() {
        C10690j jVar;
        synchronized (C10690j.class) {
            MethodCollector.m26663i(5378);
            if (f25744d == null) {
                f25744d = new C10690j();
            }
            jVar = f25744d;
            MethodCollector.m26664o(5378);
        }
        return jVar;
    }

    /* renamed from: a */
    public final Prop mo17628a(long j) {
        for (Prop prop : this.f25745a) {
            if (prop.f21689id == j) {
                return prop;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo17629b(long j) {
        if (!this.f25747c) {
            this.f25747c = true;
            ((PropApi) C5805e.m12718a().mo11572a(PropApi.class)).getPropList(j).mo143271a(new C11191f()).mo143255a(new C10692k(this, SystemClock.uptimeMillis()), new C10693l(this), new C10694m(this));
        }
    }
}
