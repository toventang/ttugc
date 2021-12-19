package com.p2082ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;

/* renamed from: com.ss.android.ugc.aweme.services.external.IInitTaskService */
public interface IInitTaskService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79801);
    }

    AbstractC58264w initTask(int i);

    Runnable initTask(int i, Object obj);

    /* renamed from: com.ss.android.ugc.aweme.services.external.IInitTaskService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79802);
        }
    }
}
