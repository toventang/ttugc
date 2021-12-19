package com.bytedance.android.p145b.p146a;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11660n;
import com.bytedance.android.livesdkapi.p691g.AbstractC11761b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.b.a.b */
public interface AbstractC2702b extends AbstractC2953a {
    static {
        Covode.recordClassIndex(3091);
    }

    Fragment createDrawerFeedFragment(AbstractC11761b bVar);

    void delayInit();

    Map<String, Object> getFeedTab(long j);

    Map<String, Object> getFeedTabForyouPage(long j);

    AbstractC11660n getStartLiveRoomInterceptor();

    void init();

    void preloadInboxTopLivesFeedAction(int i);

    void requestTabListForyouPage();
}
