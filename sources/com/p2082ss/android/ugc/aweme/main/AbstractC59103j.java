package com.p2082ss.android.ugc.aweme.main;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;

/* renamed from: com.ss.android.ugc.aweme.main.j */
public interface AbstractC59103j extends AbstractC34472g {
    static {
        Covode.recordClassIndex(69454);
    }

    Fragment getCurFragment();

    String getEnterFrom();

    AbstractC59106m getMainHelper();

    boolean hasRegistedResumeAction();

    boolean isDuoDualMode();

    boolean isMainTabVisible();

    boolean isUnderMainTab();

    boolean isUnderThirdTab();

    void onFeedRecommendFragmentReady();

    void onKeyBack();

    void setTabBackground(boolean z);
}
