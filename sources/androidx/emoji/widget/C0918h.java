package androidx.emoji.widget;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji.p045a.C0877a;
import com.bytedance.covode.number.Covode;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: androidx.emoji.widget.h */
public final class C0918h implements TextWatcher {

    /* renamed from: a */
    public int f3277a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f3278b;

    /* renamed from: c */
    private final EditText f3279c;

    /* renamed from: d */
    private C0877a.AbstractC0882d f3280d;

    static {
        Covode.recordClassIndex(1006);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: androidx.emoji.widget.h$a */
    static class C0919a extends C0877a.AbstractC0882d {

        /* renamed from: a */
        private final Reference<EditText> f3281a;

        static {
            Covode.recordClassIndex(1007);
        }

        @Override // androidx.emoji.p045a.C0877a.AbstractC0882d
        /* renamed from: a */
        public final void mo3175a() {
            super.mo3175a();
            EditText editText = this.f3281a.get();
            if (editText != null && editText.isAttachedToWindow()) {
                Editable editableText = editText.getEditableText();
                int selectionStart = Selection.getSelectionStart(editableText);
                int selectionEnd = Selection.getSelectionEnd(editableText);
                C0877a.m3052a().mo3162a(editableText);
                C0912e.m3119a(editableText, selectionStart, selectionEnd);
            }
        }

        C0919a(EditText editText) {
            this.f3281a = new WeakReference(editText);
        }
    }

    C0918h(EditText editText) {
        this.f3279c = editText;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f3279c.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int c = C0877a.m3052a().mo3168c();
            if (c != 0) {
                if (c == 1) {
                    C0877a.m3052a().mo3164a(charSequence, i, i + i3, this.f3277a, this.f3278b);
                    return;
                } else if (c != 3) {
                    return;
                }
            }
            C0877a a = C0877a.m3052a();
            if (this.f3280d == null) {
                this.f3280d = new C0919a(this.f3279c);
            }
            a.mo3165a(this.f3280d);
        }
    }
}
