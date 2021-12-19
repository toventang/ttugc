package com.p2082ss.android.ugc.aweme.app.launch;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.application.AbstractC33902g;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.p2082ss.android.ugc.aweme.net.p3495h.p3498b.RunnableC61373c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.app.launch.AppInitProvider */
public final class AppInitProvider extends AbstractC33902g {

    /* renamed from: a */
    public static final C33803a f80049a = new C33803a((byte) 0);

    static {
        Covode.recordClassIndex(40700);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.AppInitProvider$a */
    public static final class C33803a {
        static {
            Covode.recordClassIndex(40701);
        }

        private C33803a() {
        }

        public /* synthetic */ C33803a(byte b) {
            this();
        }
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            if (C46807cw.m90146c()) {
                C58221f.m105153e().mo95704a(new InitTTNetTask()).mo95706a();
            }
            Context context2 = getContext();
            C40780g.m82241a().execute(new RunnableC61373c(C29736b.f70924e + "/aweme/v2/feed/", context2));
            return true;
        }
        throw new NullPointerException("context == null");
    }
}
