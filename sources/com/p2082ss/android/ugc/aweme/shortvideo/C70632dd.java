package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.p032a.C0637f;
import androidx.core.graphics.drawable.C0705a;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dd */
public final class C70632dd {
    static {
        Covode.recordClassIndex(83098);
    }

    /* renamed from: a */
    private static Drawable m124824a(Context context, int i, int i2) {
        try {
            C1261i a = C1261i.m4015a(context.getResources(), i, context.getTheme());
            if (a != null) {
                a.setTint(context.getResources().getColor(i2));
            }
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            Drawable a2 = C0637f.m2348a(context.getResources(), i, context.getTheme());
            if (a2 != null) {
                C0705a.m2494a(a2, context.getResources().getColor(i2));
            }
            return a2;
        }
    }

    /* renamed from: a */
    public static void m124825a(Context context, ImageView imageView, int i, int i2) {
        Drawable a = m124824a(context, i, i2);
        if (a != null) {
            imageView.setImageDrawable(a);
        }
    }
}
