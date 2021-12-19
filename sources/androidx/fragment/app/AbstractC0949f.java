package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.fragment.app.f */
public abstract class AbstractC0949f {
    static {
        Covode.recordClassIndex(1042);
    }

    /* renamed from: a */
    public abstract View mo3430a(int i);

    /* renamed from: a */
    public abstract boolean mo3432a();

    /* renamed from: a */
    public Fragment mo3431a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
