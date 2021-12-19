package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.widget.AbstractC0825i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class AppCompatCheckBox extends CheckBox implements AbstractC0825i {

    /* renamed from: a */
    private final C0427g f1328a;

    static {
        Covode.recordClassIndex(398);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0427g gVar = this.f1328a;
        if (gVar != null) {
            return gVar.mo1921a(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0427g gVar = this.f1328a;
        if (gVar != null) {
            return gVar.f1667a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0427g gVar = this.f1328a;
        if (gVar != null) {
            return gVar.f1668b;
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0825i
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0427g gVar = this.f1328a;
        if (gVar != null) {
            gVar.mo1923a(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0825i
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0427g gVar = this.f1328a;
        if (gVar != null) {
            gVar.mo1924a(mode);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0196a.m619b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0427g gVar = this.f1328a;
        if (gVar != null) {
            gVar.mo1922a();
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mn);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0402ai.m1462a(context), attributeSet, i);
        C0427g gVar = new C0427g(this);
        this.f1328a = gVar;
        gVar.mo1925a(attributeSet, i);
    }
}
