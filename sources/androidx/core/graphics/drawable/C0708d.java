package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.p037h.C0774e;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.graphics.drawable.d */
public final class C0708d {
    static {
        Covode.recordClassIndex(789);
    }

    /* renamed from: androidx.core.graphics.drawable.d$a */
    static class C0709a extends AbstractC0706b {
        static {
            Covode.recordClassIndex(790);
        }

        C0709a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.graphics.drawable.AbstractC0706b
        /* renamed from: a */
        public final void mo2739a(int i, int i2, int i3, Rect rect, Rect rect2) {
            C0774e.m2694a(i, i2, i3, rect, rect2, 0);
        }
    }

    /* renamed from: a */
    public static AbstractC0706b m2514a(Resources resources, Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0707c(resources, bitmap);
        }
        return new C0709a(resources, bitmap);
    }
}
