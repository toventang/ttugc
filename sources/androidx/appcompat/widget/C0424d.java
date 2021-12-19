package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.p037h.AbstractC0791u;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.widget.d */
public class C0424d extends AutoCompleteTextView implements AbstractC0791u {

    /* renamed from: a */
    private static final int[] f1656a = {16843126};

    /* renamed from: b */
    private final C0425e f1657b;

    /* renamed from: c */
    private final C0450s f1658c;

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C0425e eVar = this.f1657b;
        if (eVar != null) {
            return eVar.mo1913b();
        }
        return null;
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0425e eVar = this.f1657b;
        if (eVar != null) {
            return eVar.mo1914c();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(489);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0425e eVar = this.f1657b;
        if (eVar != null) {
            eVar.mo1915d();
        }
        C0450s sVar = this.f1658c;
        if (sVar != null) {
            sVar.mo1997a();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0823h.m2905a(this, callback));
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0425e eVar = this.f1657b;
        if (eVar != null) {
            eVar.mo1910a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0425e eVar = this.f1657b;
        if (eVar != null) {
            eVar.mo1911a(mode);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0434i.m1600a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0425e eVar = this.f1657b;
        if (eVar != null) {
            eVar.mo1908a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0425e eVar = this.f1657b;
        if (eVar != null) {
            eVar.mo1909a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0196a.m619b(getContext(), i));
    }

    public C0424d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0450s sVar = this.f1658c;
        if (sVar != null) {
            sVar.mo2001a(context, i);
        }
    }

    public C0424d(Context context, AttributeSet attributeSet, byte b) {
        super(C0402ai.m1462a(context), attributeSet, R.attr.ip);
        C0405al a = C0405al.m1466a(getContext(), attributeSet, f1656a, R.attr.ip, 0);
        if (a.mo1837f(0)) {
            setDropDownBackgroundDrawable(a.mo1826a(0));
        }
        a.f1585a.recycle();
        C0425e eVar = new C0425e(this);
        this.f1657b = eVar;
        eVar.mo1912a(attributeSet, R.attr.ip);
        C0450s sVar = new C0450s(this);
        this.f1658c = sVar;
        sVar.mo2002a(attributeSet, R.attr.ip);
        sVar.mo1997a();
    }
}
