package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.widget.f */
public class C0426f extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f1665a = {16843016};

    /* renamed from: b */
    private final C0450s f1666b;

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0450s sVar = this.f1666b;
        if (sVar != null) {
            sVar.mo1997a();
        }
    }

    static {
        Covode.recordClassIndex(491);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0823h.m2905a(this, callback));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0434i.m1600a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0196a.m619b(getContext(), i));
    }

    public C0426f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0450s sVar = this.f1666b;
        if (sVar != null) {
            sVar.mo2001a(context, i);
        }
    }

    private C0426f(Context context, AttributeSet attributeSet, byte b) {
        super(C0402ai.m1462a(context), attributeSet, 16843720);
        C0450s sVar = new C0450s(this);
        this.f1666b = sVar;
        sVar.mo2002a(attributeSet, 16843720);
        sVar.mo1997a();
        C0405al a = C0405al.m1466a(getContext(), attributeSet, f1665a, 16843720, 0);
        setCheckMarkDrawable(a.mo1826a(0));
        a.f1585a.recycle();
    }
}
