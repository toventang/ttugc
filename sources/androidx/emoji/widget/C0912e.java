package androidx.emoji.widget;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji.p045a.C0877a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: androidx.emoji.widget.e */
final class C0912e implements InputFilter {

    /* renamed from: a */
    private final TextView f3270a;

    /* renamed from: b */
    private C0877a.AbstractC0882d f3271b;

    static {
        Covode.recordClassIndex(1000);
    }

    /* renamed from: androidx.emoji.widget.e$a */
    static class C0913a extends C0877a.AbstractC0882d {

        /* renamed from: a */
        private final Reference<TextView> f3272a;

        static {
            Covode.recordClassIndex(1001);
        }

        @Override // androidx.emoji.p045a.C0877a.AbstractC0882d
        /* renamed from: a */
        public final void mo3175a() {
            super.mo3175a();
            TextView textView = this.f3272a.get();
            if (textView != null && textView.isAttachedToWindow()) {
                CharSequence a = C0877a.m3052a().mo3162a(textView.getText());
                int selectionStart = Selection.getSelectionStart(a);
                int selectionEnd = Selection.getSelectionEnd(a);
                textView.setText(a);
                if (a instanceof Spannable) {
                    C0912e.m3119a((Spannable) a, selectionStart, selectionEnd);
                }
            }
        }

        C0913a(TextView textView) {
            this.f3272a = new WeakReference(textView);
        }
    }

    C0912e(TextView textView) {
        this.f3270a = textView;
    }

    /* renamed from: a */
    static void m3119a(Spannable spannable, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                Selection.setSelection(spannable, i, i2);
            } else {
                Selection.setSelection(spannable, i);
            }
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f3270a.isInEditMode()) {
            return charSequence;
        }
        int c = C0877a.m3052a().mo3168c();
        if (c != 0) {
            if (c != 1) {
                if (c != 3) {
                    return charSequence;
                }
            } else if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f3270a.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0877a.m3052a().mo3163a(charSequence, charSequence.length());
            }
        }
        C0877a a = C0877a.m3052a();
        if (this.f3271b == null) {
            this.f3271b = new C0913a(this.f3270a);
        }
        a.mo3165a(this.f3271b);
        return charSequence;
    }
}
