package com.bytedance.apm.agent.p757v2.instrumentation;

import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.helper.PageShowCallback;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.agent.v2.instrumentation.FragmentShowAgent */
public class FragmentShowAgent {
    static {
        Covode.recordClassIndex(14086);
    }

    public static void onPause(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            PageShowCallback.onPageShowHideAction(fragment, false);
        }
    }

    public static void onResume(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            PageShowCallback.onPageShowHideAction(fragment, true);
        }
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        PageShowCallback.onPageShowHideAction(fragment, !z);
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (fragment.isResumed() && !fragment.isHidden()) {
            PageShowCallback.onPageShowHideAction(fragment, z);
        }
    }
}
