package com.bytedance.ugc.glue;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;

public final class UGCViewUtils {
    static {
        Covode.recordClassIndex(27515);
    }

    /* renamed from: com.bytedance.ugc.glue.UGCViewUtils$a */
    public static class C23509a {

        /* renamed from: a */
        private static C23509a f55714a;

        static {
            Covode.recordClassIndex(27516);
        }

        protected C23509a() {
        }

        /* renamed from: a */
        public static C23509a m44220a() {
            if (f55714a == null) {
                f55714a = new C23509a();
            }
            return f55714a;
        }

        /* renamed from: a */
        protected static Activity m44218a(Context context) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            return null;
        }

        /* renamed from: a */
        protected static Activity m44219a(View view) {
            Activity activity = null;
            while (view != null) {
                activity = m44218a(view.getContext());
                if (activity != null) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            }
            return activity;
        }
    }

    public static Activity getActivity(Context context) {
        C23509a.m44220a();
        return C23509a.m44218a(context);
    }

    public static String getDisplayNum(String str) {
        C23509a.m44220a();
        return String.valueOf(str);
    }

    public static Activity getActivity(View view) {
        C23509a.m44220a();
        return C23509a.m44219a(view);
    }

    public static String getDiggText(int i) {
        C23509a.m44220a();
        return String.valueOf(String.valueOf(i));
    }

    public static String getDisplayNum(int i) {
        C23509a.m44220a();
        return String.valueOf(String.valueOf(i));
    }

    public static ActivityC0945e getFragmentActivity(View view) {
        Activity activity = getActivity(view);
        if (activity instanceof ActivityC0945e) {
            return (ActivityC0945e) activity;
        }
        return null;
    }
}
