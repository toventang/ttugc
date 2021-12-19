package com.p2082ss.android.ugc.gamora.recorder.p4294b;

import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.b */
public interface AbstractC83406b extends AbstractC2547b {

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.b$a */
    public static final class C83407a {
        static {
            Covode.recordClassIndex(97293);
        }
    }

    static {
        Covode.recordClassIndex(97292);
    }

    void addBottomTab(int i, AbstractC83405a aVar, int i2);

    int bottomTabSize();

    void configSwitchDuration(C78610l lVar);

    C2559g<C83408c> getBottomTabIndexChangeEvent();

    C2564l<Integer> getComplexTabVisibility();

    String getCurrentBottomTag();

    void hidePopupForLiveTab();

    boolean isCurrentTabNeedCamera();

    boolean isZTLiveSwitch();

    void notifyBottomTabIndexChange(C83408c cVar);

    void onCombinePhotoTabChanged(C83408c cVar);

    C82004a provideRecordEnv();

    void resetToCurTab(String str);

    void setCurrentTab(String str, boolean z);

    void showBottomTab(boolean z);

    void showComplexTab(int i, C83408c cVar);

    void tryShowPopupForLiveTab();

    void updateBottomTab();
}
