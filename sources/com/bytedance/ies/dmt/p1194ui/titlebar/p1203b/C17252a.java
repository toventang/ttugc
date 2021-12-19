package com.bytedance.ies.dmt.p1194ui.titlebar.p1203b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.p032a.C0637f;
import androidx.core.graphics.drawable.C0705a;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.b.a */
public final class C17252a {
    static {
        Covode.recordClassIndex(19719);
    }

    /* renamed from: a */
    private static Drawable m31843a(Context context, int i, int i2) {
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
    public static void m31844a(Context context, ImageView imageView, int i, int i2) {
        Drawable a = m31843a(context, i, i2);
        if (a != null) {
            imageView.setImageDrawable(a);
        }
    }
}
