package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.widget.AbstractC0825i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.widget.n */
public class C0439n extends RadioButton implements AbstractC0825i {

    /* renamed from: a */
    private final C0427g f1700a;

    /* renamed from: b */
    private final C0450s f1701b;

    static {
        Covode.recordClassIndex(504);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0427g gVar = this.f1700a;
        if (gVar != null) {
            return gVar.mo1921a(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0427g gVar = this.f1700a;
        if (gVar != null) {
            return gVar.f1667a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0427g gVar = this.f1700a;
        if (gVar != null) {
            return gVar.f1668b;
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0825i
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0427g gVar = this.f1700a;
        if (gVar != null) {
            gVar.mo1923a(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0825i
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0427g gVar = this.f1700a;
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
        C0427g gVar = this.f1700a;
        if (gVar != null) {
            gVar.mo1922a();
        }
    }

    public C0439n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a8m);
    }

    public C0439n(Context context, AttributeSet attributeSet, int i) {
        super(C0402ai.m1462a(context), attributeSet, i);
        C0427g gVar = new C0427g(this);
        this.f1700a = gVar;
        gVar.mo1925a(attributeSet, i);
        C0450s sVar = new C0450s(this);
        this.f1701b = sVar;
        sVar.mo2002a(attributeSet, i);
    }
}
