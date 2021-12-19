package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p028a.p029a.AbstractMenuItemC0566b;
import androidx.core.p037h.AbstractC0763b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.view.menu.a */
public final class C0289a implements AbstractMenuItemC0566b {

    /* renamed from: a */
    private final int f996a;

    /* renamed from: b */
    private final int f997b;

    /* renamed from: c */
    private final int f998c;

    /* renamed from: d */
    private final int f999d;

    /* renamed from: e */
    private CharSequence f1000e;

    /* renamed from: f */
    private CharSequence f1001f;

    /* renamed from: g */
    private Intent f1002g;

    /* renamed from: h */
    private char f1003h;

    /* renamed from: i */
    private int f1004i = 4096;

    /* renamed from: j */
    private char f1005j;

    /* renamed from: k */
    private int f1006k = 4096;

    /* renamed from: l */
    private Drawable f1007l;

    /* renamed from: m */
    private int f1008m;

    /* renamed from: n */
    private Context f1009n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f1010o;

    /* renamed from: p */
    private CharSequence f1011p;

    /* renamed from: q */
    private CharSequence f1012q;

    /* renamed from: r */
    private ColorStateList f1013r;

    /* renamed from: s */
    private PorterDuff.Mode f1014s;

    /* renamed from: t */
    private boolean f1015t;

    /* renamed from: u */
    private boolean f1016u;

    /* renamed from: v */
    private int f1017v = 16;

    static {
        Covode.recordClassIndex(326);
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    /* renamed from: a */
    public final AbstractC0763b mo833a() {
        return null;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final boolean expandActionView() {
        return false;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final View getActionView() {
        return null;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final void setShowAsAction(int i) {
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final int getAlphabeticModifiers() {
        return this.f1006k;
    }

    public final char getAlphabeticShortcut() {
        return this.f1005j;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final CharSequence getContentDescription() {
        return this.f1011p;
    }

    public final int getGroupId() {
        return this.f997b;
    }

    public final Drawable getIcon() {
        return this.f1007l;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final ColorStateList getIconTintList() {
        return this.f1013r;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1014s;
    }

    public final Intent getIntent() {
        return this.f1002g;
    }

    public final int getItemId() {
        return this.f996a;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final int getNumericModifiers() {
        return this.f1004i;
    }

    public final char getNumericShortcut() {
        return this.f1003h;
    }

    public final int getOrder() {
        return this.f999d;
    }

    public final CharSequence getTitle() {
        return this.f1000e;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final CharSequence getTooltipText() {
        return this.f1012q;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1001f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f1000e;
    }

    public final boolean isCheckable() {
        if ((this.f1017v & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f1017v & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f1017v & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.f1017v & 8) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m1022b() {
        Drawable drawable = this.f1007l;
        if (drawable == null) {
            return;
        }
        if (this.f1015t || this.f1016u) {
            Drawable e = C0705a.m2506e(drawable);
            this.f1007l = e;
            Drawable mutate = e.mutate();
            this.f1007l = mutate;
            if (this.f1015t) {
                C0705a.m2496a(mutate, this.f1013r);
            }
            if (this.f1016u) {
                C0705a.m2499a(this.f1007l, this.f1014s);
            }
        }
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    /* renamed from: a */
    public final AbstractMenuItemC0566b mo832a(CharSequence charSequence) {
        this.f1011p = charSequence;
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    /* renamed from: b */
    public final AbstractMenuItemC0566b mo834b(CharSequence charSequence) {
        this.f1012q = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f1011p = charSequence;
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f1002g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f1003h = c;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1010o = onMenuItemClickListener;
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1000e = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1001f = charSequence;
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f1012q = charSequence;
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    /* renamed from: a */
    public final AbstractMenuItemC0566b mo831a(AbstractC0763b bVar) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f1005j = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f1017v = (z ? 1 : 0) | (this.f1017v & -2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.f1017v & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f1017v = i | i2;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.f1017v & -17;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f1017v = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f1008m = i;
        this.f1007l = C0643b.m2369a(this.f1009n, i);
        m1022b();
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1013r = colorStateList;
        this.f1015t = true;
        m1022b();
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1014s = mode;
        this.f1016u = true;
        m1022b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f1000e = this.f1009n.getResources().getString(i);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1017v & 8;
        if (z) {
            i = 0;
        }
        this.f1017v = i2 | i;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1007l = drawable;
        this.f1008m = 0;
        m1022b();
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1005j = Character.toLowerCase(c);
        this.f1006k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f1003h = c;
        this.f1004i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f1003h = c;
        this.f1005j = Character.toLowerCase(c2);
        return this;
    }

    public C0289a(Context context, CharSequence charSequence) {
        this.f1009n = context;
        this.f996a = 16908332;
        this.f997b = 0;
        this.f998c = 0;
        this.f999d = 0;
        this.f1000e = charSequence;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1003h = c;
        this.f1004i = KeyEvent.normalizeMetaState(i);
        this.f1005j = Character.toLowerCase(c2);
        this.f1006k = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
