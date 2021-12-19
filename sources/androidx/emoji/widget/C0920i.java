package androidx.emoji.widget;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji.p045a.C0877a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.widget.i */
final class C0920i implements TransformationMethod {

    /* renamed from: a */
    private final TransformationMethod f3282a;

    static {
        Covode.recordClassIndex(1008);
    }

    C0920i(TransformationMethod transformationMethod) {
        this.f3282a = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f3282a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0877a.m3052a().mo3168c() != 1) {
            return charSequence;
        }
        return C0877a.m3052a().mo3162a(charSequence);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f3282a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
