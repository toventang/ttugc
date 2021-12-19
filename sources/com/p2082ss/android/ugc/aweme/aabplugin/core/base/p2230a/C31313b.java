package com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1266b.C18123a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a.b */
public final class C31313b {

    /* renamed from: a */
    public final AbstractC31314a f75036a;

    /* renamed from: b */
    public Timer f75037b;

    /* renamed from: c */
    public long f75038c;

    /* renamed from: d */
    public long f75039d = -1;

    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a.b$a */
    public interface AbstractC31314a {
        static {
            Covode.recordClassIndex(38014);
        }

        /* renamed from: a */
        void mo57325a();
    }

    static {
        Covode.recordClassIndex(38013);
    }

    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a.b$b */
    public class C31315b extends TimerTask {
        static {
            Covode.recordClassIndex(38015);
        }

        public final void run() {
            if (System.currentTimeMillis() - C31313b.this.f75038c > C18123a.f43178c && C31313b.this.f75036a != null) {
                C31313b.this.f75036a.mo57325a();
            }
        }

        public C31315b() {
        }
    }

    /* renamed from: a */
    public final void mo57324a() {
        Timer timer = this.f75037b;
        if (timer != null) {
            timer.cancel();
            this.f75037b = null;
        }
        this.f75039d = -1;
        this.f75038c = 0;
    }

    public C31313b(AbstractC31314a aVar) {
        this.f75036a = aVar;
    }
}
