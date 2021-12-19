package com.bytedance.immersionbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.immersionbar.a */
public final class C20053a {

    /* renamed from: a */
    public final int f47652a;

    static {
        Covode.recordClassIndex(23558);
    }

    C20053a(Activity activity) {
        this.f47652a = m37940a(activity, "status_bar_height");
    }

    /* renamed from: a */
    private static int m37940a(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                return Math.round((((float) dimensionPixelSize) * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }
}
