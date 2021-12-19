package androidx.emoji.widget;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji.p045a.C0877a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.widget.d */
final class C0911d extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f3269a;

    static {
        Covode.recordClassIndex(999);
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        if (C0877a.m3054a((InputConnection) this, this.f3269a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (C0877a.m3054a((InputConnection) this, this.f3269a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }

    C0911d(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.f3269a = textView;
        C0877a a = C0877a.m3052a();
        if (a.mo3169d() && editorInfo != null && editorInfo.extras != null) {
            a.f3182a.mo3172a(editorInfo);
        }
    }
}
