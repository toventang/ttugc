package com.p2082ss.android.ugc.aweme.services.connection;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.connection.IConnectionEntranceService */
public interface IConnectionEntranceService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79753);
    }

    int bubbleTime();

    void checkShowConnectionEntrance(AbstractC1204m mVar, int i);

    String getSchema();

    void hideConnectionEntrance();

    boolean isShowConnectionEntrance();

    void setConnectionEntranceHasClickedToday();

    void setConnectionEntranceHasShowBubbleToday();

    void showConnectionEntrance();

    boolean withAnimation();

    /* renamed from: com.ss.android.ugc.aweme.services.connection.IConnectionEntranceService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79754);
        }
    }
}
