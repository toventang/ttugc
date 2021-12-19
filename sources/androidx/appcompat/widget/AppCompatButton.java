package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.p037h.AbstractC0791u;
import androidx.core.widget.AbstractC0817b;
import androidx.core.widget.C0823h;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;

public class AppCompatButton extends Button implements AbstractC0791u, AbstractC0817b {

    /* renamed from: a */
    private final C0425e f1326a;

    /* renamed from: b */
    private final C0450s f1327b;

    static {
        Covode.recordClassIndex(397);
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C0425e eVar = this.f1326a;
        if (eVar != null) {
            return eVar.mo1913b();
        }
        return null;
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0425e eVar = this.f1326a;
        if (eVar != null) {
            return eVar.mo1914c();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0817b
    public int getAutoSizeMaxTextSize() {
        if (f3045d) {
            return super.getAutoSizeMaxTextSize();
        }
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            return Math.round(sVar.f1732a.f1750d);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f3045d) {
            return super.getAutoSizeMinTextSize();
        }
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            return Math.round(sVar.f1732a.f1749c);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f3045d) {
            return super.getAutoSizeStepGranularity();
        }
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            return Math.round(sVar.f1732a.f1748b);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f3045d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            return sVar.f1732a.f1751e;
        }
        return new int[0];
    }

    @Override // androidx.core.widget.AbstractC0817b
    public int getAutoSizeTextType() {
        if (!f3045d) {
            C0450s sVar = this.f1327b;
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

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        String str;
        try {
            super.drawableStateChanged();
            C0425e eVar = this.f1326a;
            if (eVar != null) {
                eVar.mo1915d();
            }
            C0450s sVar = this.f1327b;
            if (sVar != null) {
                sVar.mo1997a();
            }
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("targetViewId", getId());
            jSONObject.put("targetViewClassName", getClass().getName());
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                jSONObject.put("targetParentViewId", ((ViewGroup) parent).getId());
                jSONObject.put("targetParentViewClassName", ((ViewGroup) parent).getClass().getName());
            }
            Activity j = C17873f.m33102j();
            if (j != null) {
                str = j.getClass().getName();
            } else {
                str = "";
            }
            jSONObject.put("currentActivity", str);
            jSONObject.put("errorMsg", Log.getStackTraceString(e));
            C12290b.m22066a("detail_view_animation_crash", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Throwable unused) {
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0823h.m2905a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            sVar.mo2003a(z);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0425e eVar = this.f1326a;
        if (eVar != null) {
            eVar.mo1910a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0425e eVar = this.f1326a;
        if (eVar != null) {
            eVar.mo1911a(mode);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // androidx.core.widget.AbstractC0817b
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3045d) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            sVar.mo1998a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0425e eVar = this.f1326a;
        if (eVar != null) {
            eVar.mo1908a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0425e eVar = this.f1326a;
        if (eVar != null) {
            eVar.mo1909a(i);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.lx);
    }

    @Override // androidx.core.widget.AbstractC0817b
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f3045d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            sVar.mo2004a(iArr, i);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            sVar.mo2001a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f3045d) {
            super.setTextSize(i, f);
            return;
        }
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            sVar.mo1999a(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0402ai.m1462a(context), attributeSet, i);
        C0425e eVar = new C0425e(this);
        this.f1326a = eVar;
        eVar.mo1912a(attributeSet, i);
        C0450s sVar = new C0450s(this);
        this.f1327b = sVar;
        sVar.mo2002a(attributeSet, i);
        sVar.mo1997a();
    }

    @Override // androidx.core.widget.AbstractC0817b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (f3045d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            sVar.mo2000a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f1327b != null && !f3045d && this.f1327b.f1732a.mo2013b()) {
            this.f1327b.f1732a.mo2007a();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0450s sVar = this.f1327b;
        if (sVar != null) {
            sVar.mo2005b();
        }
    }
}
