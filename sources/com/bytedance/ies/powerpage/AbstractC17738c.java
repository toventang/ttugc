package com.bytedance.ies.powerpage;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.powerpage.c */
public abstract /* synthetic */ class AbstractC17738c {
    static {
        Covode.recordClassIndex(20300);
    }

    /* renamed from: a */
    public static void m32872a(AbstractC17736b bVar) {
        Fragment fragment = (Fragment) bVar;
        if (fragment.getActivity() instanceof AbstractC17736b) {
            ((AbstractC17736b) fragment.getActivity()).onBackPressed_Activity();
        }
    }

    /* renamed from: a */
    public static void m32873a(AbstractC17736b bVar, int i, int i2, Intent intent) {
        Fragment fragment = (Fragment) bVar;
        if (fragment.getActivity() instanceof AbstractC17736b) {
            ((AbstractC17736b) fragment.getActivity()).onActivityResult_Activity(i, i2, intent);
        }
    }
}
