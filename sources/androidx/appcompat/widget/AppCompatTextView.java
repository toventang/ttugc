package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.p035f.C0676d;
import androidx.core.p037h.AbstractC0791u;
import androidx.core.widget.AbstractC0817b;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements AbstractC0791u, AbstractC0817b {

    /* renamed from: a */
    private final C0425e f1335a;

    /* renamed from: b */
    private final C0450s f1336b;

    /* renamed from: c */
    private Future<C0676d> f1337c;

    static {
        Covode.recordClassIndex(402);
    }

    public CharSequence getText() {
        mo796a();
        return super.getText();
    }

    public C0676d.C0677a getTextMetricsParamsCompat() {
        return C0823h.m2913c(this);
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C0425e eVar = this.f1335a;
        if (eVar != null) {
            return eVar.mo1913b();
        }
        return null;
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0425e eVar = this.f1335a;
        if (eVar != null) {
            return eVar.mo1914c();
        }
        return null;
    }

    /* renamed from: a */
    private void mo796a() {
        Future<C0676d> future = this.f1337c;
        if (future != null) {
            try {
                this.f1337c = null;
                C0823h.m2910a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0425e eVar = this.f1335a;
        if (eVar != null) {
            eVar.mo1915d();
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            sVar.mo1997a();
        }
    }

    @Override // androidx.core.widget.AbstractC0817b
    public int getAutoSizeMaxTextSize() {
        if (f3045d) {
            return super.getAutoSizeMaxTextSize();
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            return Math.round(sVar.f1732a.f1750d);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f3045d) {
            return super.getAutoSizeMinTextSize();
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            return Math.round(sVar.f1732a.f1749c);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f3045d) {
            return super.getAutoSizeStepGranularity();
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            return Math.round(sVar.f1732a.f1748b);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f3045d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            return sVar.f1732a.f1751e;
        }
        return new int[0];
    }

    @Override // androidx.core.widget.AbstractC0817b
    public int getAutoSizeTextType() {
        if (!f3045d) {
            C0450s sVar = this.f1336b;
            if (sVar != null) {
                return sVar.f1732a.f1747a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setLineHeight(int i) {
        C0823h.m2917e(this, i);
    }

    public void setPrecomputedText(C0676d dVar) {
        C0823h.m2910a(this, dVar);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0823h.m2905a(this, callback));
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0425e eVar = this.f1335a;
        if (eVar != null) {
            eVar.mo1910a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0425e eVar = this.f1335a;
        if (eVar != null) {
            eVar.mo1911a(mode);
        }
    }

    public void setTextFuture(Future<C0676d> future) {
        this.f1337c = future;
        requestLayout();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0434i.m1600a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // androidx.core.widget.AbstractC0817b
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3045d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            sVar.mo1998a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0425e eVar = this.f1335a;
        if (eVar != null) {
            eVar.mo1908a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0425e eVar = this.f1335a;
        if (eVar != null) {
            eVar.mo1909a(i);
        }
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0823h.m2914c(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0823h.m2916d(this, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMetricsParamsCompat(androidx.core.p035f.C0676d.C0677a r4) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.setTextMetricsParamsCompat(androidx.core.f.d$a):void");
    }

    public void onMeasure(int i, int i2) {
        mo796a();
        super.onMeasure(i, i2);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // androidx.core.widget.AbstractC0817b
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f3045d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            sVar.mo2004a(iArr, i);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            sVar.mo2001a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f3045d) {
            super.setTextSize(i, f);
            return;
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            sVar.mo1999a(i, f);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0402ai.m1462a(context), attributeSet, i);
        C0425e eVar = new C0425e(this);
        this.f1335a = eVar;
        eVar.mo1912a(attributeSet, i);
        C0450s sVar = new C0450s(this);
        this.f1336b = sVar;
        sVar.mo2002a(attributeSet, i);
        sVar.mo1997a();
    }

    @Override // androidx.core.widget.AbstractC0817b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f3045d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            sVar.mo2000a(i, i2, i3, i4);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f1336b != null && !f3045d && this.f1336b.f1732a.mo2013b()) {
            this.f1336b.f1732a.mo2007a();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0450s sVar = this.f1336b;
        if (sVar != null) {
            sVar.mo2005b();
        }
    }
}
