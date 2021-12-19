package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.p037h.AbstractC0791u;
import androidx.core.widget.AbstractC0826j;
import com.bytedance.covode.number.Covode;

public class AppCompatImageView extends ImageView implements AbstractC0791u, AbstractC0826j {

    /* renamed from: a */
    private final C0425e f1333a;

    /* renamed from: b */
    private final C0435j f1334b;

    static {
        Covode.recordClassIndex(401);
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C0425e eVar = this.f1333a;
        if (eVar != null) {
            return eVar.mo1913b();
        }
        return null;
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0425e eVar = this.f1333a;
        if (eVar != null) {
            return eVar.mo1914c();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0826j
    public ColorStateList getSupportImageTintList() {
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            return jVar.mo1937b();
        }
        return null;
    }

    @Override // androidx.core.widget.AbstractC0826j
    public PorterDuff.Mode getSupportImageTintMode() {
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            return jVar.mo1938c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0425e eVar = this.f1333a;
        if (eVar != null) {
            eVar.mo1915d();
        }
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            jVar.mo1939d();
        }
    }

    public boolean hasOverlappingRendering() {
        if (!this.f1334b.mo1936a() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public void setImageResource(int i) {
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            jVar.mo1932a(i);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0425e eVar = this.f1333a;
        if (eVar != null) {
            eVar.mo1910a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0425e eVar = this.f1333a;
        if (eVar != null) {
            eVar.mo1911a(mode);
        }
    }

    @Override // androidx.core.widget.AbstractC0826j
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            jVar.mo1933a(colorStateList);
        }
    }

    @Override // androidx.core.widget.AbstractC0826j
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            jVar.mo1934a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0425e eVar = this.f1333a;
        if (eVar != null) {
            eVar.mo1908a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0425e eVar = this.f1333a;
        if (eVar != null) {
            eVar.mo1909a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            jVar.mo1939d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            jVar.mo1939d();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0435j jVar = this.f1334b;
        if (jVar != null) {
            jVar.mo1939d();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0402ai.m1462a(context), attributeSet, i);
        C0425e eVar = new C0425e(this);
        this.f1333a = eVar;
        eVar.mo1912a(attributeSet, i);
        C0435j jVar = new C0435j(this);
        this.f1334b = jVar;
        jVar.mo1935a(attributeSet, i);
    }
}
