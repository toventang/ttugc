package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.widget.e */
public final class C0820e {
    static {
        Covode.recordClassIndex(903);
    }

    /* renamed from: a */
    public static ColorStateList m2894a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof AbstractC0826j) {
            return ((AbstractC0826j) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m2897b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof AbstractC0826j) {
            return ((AbstractC0826j) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: a */
    public static void m2895a(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof AbstractC0826j) {
            ((AbstractC0826j) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2896a(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof AbstractC0826j) {
            ((AbstractC0826j) imageView).setSupportImageTintMode(mode);
        }
    }
}
