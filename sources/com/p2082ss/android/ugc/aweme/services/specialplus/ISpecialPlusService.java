package com.p2082ss.android.ugc.aweme.services.specialplus;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService */
public interface ISpecialPlusService {
    static {
        Covode.recordClassIndex(79966);
    }

    String getEffectId();

    long getQuickPromoPlusDebutTime();

    List<String> getSpecialPlusEffectList();

    String getSpecialPlusTips();

    void initCallBack();

    boolean isNeedShowSpecialPlusDirect();

    boolean isQuickPromoPlusEnabled();

    void preDownloadSuperEntranceRes(Context context);

    void setQuickPromoPlusDebutTime(long j);

    void setSpecialPlusClicked();

    void setSpecialPlusShowed();

    void setSpecialPlusState(boolean z);

    boolean shouldShowSpecialPlus();
}
