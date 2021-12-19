package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC0274b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.app.a */
public abstract class AbstractC0211a {

    /* renamed from: androidx.appcompat.app.a$b */
    public static abstract class AbstractC0213b {
        static {
            Covode.recordClassIndex(247);
        }

        /* renamed from: a */
        public abstract Drawable mo431a();

        /* renamed from: b */
        public abstract CharSequence mo432b();

        /* renamed from: c */
        public abstract View mo433c();

        /* renamed from: d */
        public abstract CharSequence mo434d();
    }

    static {
        Covode.recordClassIndex(245);
    }

    /* renamed from: a */
    public AbstractC0274b mo410a(AbstractC0274b.AbstractC0275a aVar) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo411a();

    /* renamed from: a */
    public void mo413a(int i) {
    }

    /* renamed from: a */
    public void mo414a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo415a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public abstract void mo416a(boolean z);

    /* renamed from: a */
    public boolean mo417a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo418a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract int mo419b();

    /* renamed from: b */
    public void mo420b(boolean z) {
    }

    /* renamed from: c */
    public abstract void mo421c();

    /* renamed from: c */
    public void mo422c(boolean z) {
    }

    /* renamed from: d */
    public Context mo423d() {
        return null;
    }

    /* renamed from: d */
    public void mo424d(boolean z) {
    }

    /* renamed from: f */
    public boolean mo426f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo427g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo428h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo429i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo430j() {
    }

    /* renamed from: e */
    public void mo425e() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0212a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f637a;

        static {
            Covode.recordClassIndex(246);
        }

        public C0212a() {
            super(-2, -2);
            this.f637a = 8388627;
        }

        public C0212a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0212a(C0212a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f637a = aVar.f637a;
        }

        public C0212a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931});
            this.f637a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo412a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}
