package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.core.app.b */
public class C0576b {
    static {
        Covode.recordClassIndex(654);
    }

    /* renamed from: a */
    public Bundle mo2564a() {
        return null;
    }

    protected C0576b() {
    }

    /* renamed from: androidx.core.app.b$a */
    static class C0577a extends C0576b {

        /* renamed from: a */
        private final ActivityOptions f2454a;

        static {
            Covode.recordClassIndex(655);
        }

        @Override // androidx.core.app.C0576b
        /* renamed from: a */
        public final Bundle mo2564a() {
            return this.f2454a.toBundle();
        }

        C0577a(ActivityOptions activityOptions) {
            this.f2454a = activityOptions;
        }
    }

    /* renamed from: a */
    public static C0576b m2191a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new C0577a(ActivityOptions.makeCustomAnimation(context, R.anim.ch, R.anim.ch));
    }

    /* renamed from: a */
    public static C0576b m2190a(Activity activity, C0692e<View, String>... eVarArr) {
        if (Build.VERSION.SDK_INT < 21) {
            return new C0576b();
        }
        Pair[] pairArr = null;
        if (eVarArr != null) {
            pairArr = new Pair[eVarArr.length];
            for (int i = 0; i < eVarArr.length; i++) {
                pairArr[i] = Pair.create(eVarArr[i].f2750a, eVarArr[i].f2751b);
            }
        }
        return new C0577a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    /* renamed from: a */
    public static C0576b m2192a(View view, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return new C0577a(ActivityOptions.makeScaleUpAnimation(view, i, i2, 0, 0));
    }

    /* renamed from: a */
    public static C0576b m2189a(Activity activity, View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0577a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new C0576b();
    }

    /* renamed from: b */
    public static C0576b m2193b(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C0577a(ActivityOptions.makeClipRevealAnimation(view, 0, 0, i, i2));
        }
        return new C0576b();
    }
}
