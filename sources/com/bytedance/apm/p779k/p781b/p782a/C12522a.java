package com.bytedance.apm.p779k.p781b.p782a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.k.b.a.a */
public final class C12522a {
    static {
        Covode.recordClassIndex(14338);
    }

    /* renamed from: a */
    private static void m22511a(View view) {
        if (view.getBackground() != null) {
            try {
                view.getBackground().setCallback(null);
                view.setBackgroundDrawable(null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m22514a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setCallback(null);
            }
            imageView.setImageDrawable(null);
        }
    }

    /* renamed from: a */
    private static void m22515a(TextView textView) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setCallback(null);
            }
        }
        textView.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: a */
    public static void m22512a(View view, Activity activity) {
        if (view != null && view.getContext() != null) {
            if (view.getContext() == activity) {
                m22511a(view);
                if (view instanceof ImageView) {
                    m22514a((ImageView) view);
                }
                if (view instanceof TextView) {
                    m22515a((TextView) view);
                }
            }
            if (view instanceof ViewGroup) {
                m22513a((ViewGroup) view, activity);
            }
        }
    }

    /* renamed from: a */
    private static void m22513a(ViewGroup viewGroup, Activity activity) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            m22512a(viewGroup.getChildAt(i), activity);
        }
    }
}
