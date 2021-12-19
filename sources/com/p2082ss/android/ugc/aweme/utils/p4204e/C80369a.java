package com.p2082ss.android.ugc.aweme.utils.p4204e;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.e.a */
public final class C80369a {

    /* renamed from: a */
    public static float f179895a;

    /* renamed from: b */
    public static final C80369a f179896b = new C80369a();

    private C80369a() {
    }

    static {
        Covode.recordClassIndex(93637);
    }

    /* renamed from: a */
    public static int m139345a(Context context) {
        float f = f179895a;
        if (f > 0.0f) {
            return (int) f;
        }
        float b = m139346b(context);
        f179895a = b;
        return (int) b;
    }

    /* renamed from: b */
    private static float m139346b(Context context) {
        float f = 0.0f;
        if (context == null) {
            return 0.0f;
        }
        int[] iArr = {R.string.d6v, R.string.baw, R.string.d9f, R.string.d6z, R.string.dj5, R.string.dk6, R.string.bay, R.string.bxw};
        Paint paint = new Paint();
        paint.setTextSize(C13628n.m24520b(context, 14.0f));
        float b = C13628n.m24520b(context, 88.0f);
        float b2 = C13628n.m24520b(context, 120.0f);
        for (int i = 0; i < 8; i++) {
            float measureText = paint.measureText(context.getString(iArr[i])) - 0.5f;
            if (measureText > f) {
                f = measureText;
            }
        }
        float b3 = f + (C13628n.m24520b(context, 16.0f) - 0.5f);
        if (b3 > b2) {
            return b2;
        }
        if (b3 < b) {
            return b;
        }
        return b3;
    }
}
