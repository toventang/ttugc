package dagger.hilt.android.internal.p4540c;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: dagger.hilt.android.internal.c.a */
public abstract class AbstractC88101a {
    static {
        Covode.recordClassIndex(104127);
    }

    /* renamed from: a */
    static ActivityC0945e m153173a(Activity activity) {
        try {
            return (ActivityC0945e) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(activity)), e);
        }
    }
}
