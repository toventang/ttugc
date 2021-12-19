package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0461z;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0409an;
import com.bytedance.covode.number.Covode;

public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, AbstractC0320p.AbstractC0321a, ActionMenuView.AbstractC0344a {

    /* renamed from: a */
    C0306j f963a;

    /* renamed from: b */
    C0302h.AbstractC0304b f964b;

    /* renamed from: c */
    AbstractC0288b f965c;

    /* renamed from: e */
    private CharSequence f966e;

    /* renamed from: f */
    private Drawable f967f;

    /* renamed from: g */
    private AbstractView$OnAttachStateChangeListenerC0461z f968g;

    /* renamed from: h */
    private boolean f969h;

    /* renamed from: i */
    private boolean f970i;

    /* renamed from: j */
    private int f971j;

    /* renamed from: k */
    private int f972k;

    /* renamed from: l */
    private int f973l;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0288b {
        static {
            Covode.recordClassIndex(323);
        }

        /* renamed from: a */
        public abstract AbstractC0324s mo816a();
    }

    static {
        Covode.recordClassIndex(321);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    /* renamed from: a */
    public final boolean mo796a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    public C0306j getItemData() {
        return this.f963a;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0344a
    /* renamed from: d */
    public final boolean mo799d() {
        return mo797b();
    }

    /* renamed from: b */
    public final boolean mo797b() {
        if (!TextUtils.isEmpty(getText())) {
            return true;
        }
        return false;
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    class C0287a extends AbstractView$OnAttachStateChangeListenerC0461z {
        static {
            Covode.recordClassIndex(322);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0461z
        /* renamed from: a */
        public final AbstractC0324s mo814a() {
            if (ActionMenuItemView.this.f965c != null) {
                return ActionMenuItemView.this.f965c.mo816a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0461z
        /* renamed from: b */
        public final boolean mo815b() {
            AbstractC0324s a;
            if (ActionMenuItemView.this.f964b == null || !ActionMenuItemView.this.f964b.mo818a(ActionMenuItemView.this.f963a) || (a = mo814a()) == null || !a.mo919e()) {
                return false;
            }
            return true;
        }

        public C0287a() {
            super(ActionMenuItemView.this);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0344a
    /* renamed from: c */
    public final boolean mo798c() {
        if (!mo797b() || this.f963a.getIcon() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m1005e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480) {
            return true;
        }
        if ((i < 640 || i2 < 480) && configuration.orientation != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m1006f() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f966e);
        if (this.f967f != null && (!this.f963a.mo1033i() || (!this.f969h && !this.f970i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.f966e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f963a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.f963a.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f963a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f963a.getTitle();
            }
            C0409an.m1520a(this, charSequence2);
            return;
        }
        C0409an.m1520a(this, tooltipText);
    }

    public void setItemInvoker(C0302h.AbstractC0304b bVar) {
        this.f964b = bVar;
    }

    public void setPopupCallback(AbstractC0288b bVar) {
        this.f965c = bVar;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f966e = charSequence;
        m1006f();
    }

    public void onClick(View view) {
        C0302h.AbstractC0304b bVar = this.f964b;
        if (bVar != null) {
            bVar.mo818a(this.f963a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f969h = m1005e();
        m1006f();
    }

    public void setExpandedFormat(boolean z) {
        if (this.f970i != z) {
            this.f970i = z;
            C0306j jVar = this.f963a;
            if (jVar != null) {
                jVar.f1126d.mo987h();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnAttachStateChangeListenerC0461z zVar;
        if (!this.f963a.hasSubMenu() || (zVar = this.f968g) == null || !zVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    /* renamed from: a */
    public final void mo795a(C0306j jVar) {
        int i;
        this.f963a = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo1007a((AbstractC0320p.AbstractC0321a) this));
        setId(jVar.getItemId());
        if (jVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f968g == null) {
            this.f968g = new C0287a();
        }
    }

    public void setIcon(Drawable drawable) {
        this.f967f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f973l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1006f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean b = mo797b();
        if (b && (i4 = this.f972k) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f971j);
        } else {
            i3 = this.f971j;
        }
        if (mode != 1073741824 && this.f971j > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!b && this.f967f != null) {
            super.setPadding((getMeasuredWidth() - this.f967f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    private ActionMenuItemView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f969h = m1005e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071}, 0, 0);
        this.f971j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f973l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f972k = -1;
        setSaveEnabled(false);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f972k = i;
        super.setPadding(i, i2, i3, i4);
    }
}
