package com.p2082ss.android.ugc.aweme.services.story;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.services.story.IStoryView */
public interface IStoryView {
    static {
        Covode.recordClassIndex(79989);
    }

    Fragment asFragment();

    LiveData<C89391z> getCloseEvent();

    LiveData<Boolean> getForbidDrawerScrollEvent();

    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onOpenCompletely();

    void onSlideExitStoryShoot();

    void updateEnterStoryParam(EnterStoryParam enterStoryParam);
}
