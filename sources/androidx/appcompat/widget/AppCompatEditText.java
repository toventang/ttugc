package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.p037h.AbstractC0791u;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class AppCompatEditText extends EditText implements AbstractC0791u {

    /* renamed from: a */
    private final C0425e f1329a;

    /* renamed from: b */
    private final C0450s f1330b;

    static {
        Covode.recordClassIndex(399);
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C0425e eVar = this.f1329a;
        if (eVar != null) {
            return eVar.mo1913b();
        }
        return null;
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0425e eVar = this.f1329a;
        if (eVar != null) {
            return eVar.mo1914c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0425e eVar = this.f1329a;
        if (eVar != null) {
            eVar.mo1915d();
        }
        C0450s sVar = this.f1330b;
        if (sVar != null) {
            sVar.mo1997a();
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0823h.m2905a(this, callback));
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0425e eVar = this.f1329a;
        if (eVar != null) {
            eVar.mo1910a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0425e eVar = this.f1329a;
        if (eVar != null) {
            eVar.mo1911a(mode);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0434i.m1600a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0425e eVar = this.f1329a;
        if (eVar != null) {
            eVar.mo1908a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0425e eVar = this.f1329a;
        if (eVar != null) {
            eVar.mo1909a(i);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sd);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0450s sVar = this.f1330b;
        if (sVar != null) {
            sVar.mo2001a(context, i);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0402ai.m1462a(context), attributeSet, i);
        C0425e eVar = new C0425e(this);
        this.f1329a = eVar;
        eVar.mo1912a(attributeSet, i);
        C0450s sVar = new C0450s(this);
        this.f1330b = sVar;
        sVar.mo2002a(attributeSet, i);
        sVar.mo1997a();
    }
}
