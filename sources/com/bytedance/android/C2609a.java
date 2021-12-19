package com.bytedance.android;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11660n;
import com.bytedance.android.livesdkapi.p691g.AbstractC11761b;
import com.bytedance.android.p145b.p146a.AbstractC2702b;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.a */
public class C2609a implements AbstractC2702b {
    static {
        Covode.recordClassIndex(2997);
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public Fragment createDrawerFeedFragment(AbstractC11761b bVar) {
        return null;
    }

    public Fragment createLiveFeedFragment() {
        return null;
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public void delayInit() {
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public AbstractC11660n getStartLiveRoomInterceptor() {
        return null;
    }

    public String getTopLiveTitle(Context context) {
        return "";
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public void init() {
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public void preloadInboxTopLivesFeedAction(int i) {
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public void requestTabListForyouPage() {
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public Map<String, Object> getFeedTab(long j) {
        return new LinkedHashMap();
    }

    @Override // com.bytedance.android.p145b.p146a.AbstractC2702b
    public Map<String, Object> getFeedTabForyouPage(long j) {
        return new LinkedHashMap();
    }
}
