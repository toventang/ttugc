package androidx.appcompat.p021c;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: androidx.appcompat.c.a */
public final class C0272a implements TransformationMethod {

    /* renamed from: a */
    private Locale f890a;

    static {
        Covode.recordClassIndex(306);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C0272a(Context context) {
        this.f890a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f890a);
        }
        return null;
    }
}
