package androidx.emoji.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.emoji.widget.a */
public final class C0906a {

    /* renamed from: a */
    public int f3260a;

    static {
        Covode.recordClassIndex(994);
    }

    public C0906a(View view, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a52}, 16842862, 0);
            this.f3260a = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }
}
