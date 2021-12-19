package com.bytedance.sdk.p1625a.p1664o;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.sdk.a.o.g */
public final class C22515g {
    static {
        Covode.recordClassIndex(26331);
    }

    /* renamed from: a */
    public static void m42471a(Context context) {
        if (context != null) {
            Toast makeText = Toast.makeText(context, (int) R.string.bed, 0);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
        }
    }
}
