package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p028a.p029a.AbstractMenuItemC0566b;
import androidx.core.p037h.AbstractC0763b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: androidx.appcompat.view.menu.j */
public final class C0306j implements AbstractMenuItemC0566b {

    /* renamed from: A */
    private int f1118A = 16;

    /* renamed from: B */
    private int f1119B;

    /* renamed from: C */
    private View f1120C;

    /* renamed from: D */
    private MenuItem.OnActionExpandListener f1121D;

    /* renamed from: E */
    private boolean f1122E;

    /* renamed from: a */
    public final int f1123a;

    /* renamed from: b */
    int f1124b = 4096;

    /* renamed from: c */
    int f1125c = 4096;

    /* renamed from: d */
    C0302h f1126d;

    /* renamed from: e */
    public Runnable f1127e;

    /* renamed from: f */
    public AbstractC0763b f1128f;

    /* renamed from: g */
    public ContextMenu.ContextMenuInfo f1129g;

    /* renamed from: h */
    private final int f1130h;

    /* renamed from: i */
    private final int f1131i;

    /* renamed from: j */
    private final int f1132j;

    /* renamed from: k */
    private CharSequence f1133k;

    /* renamed from: l */
    private CharSequence f1134l;

    /* renamed from: m */
    private Intent f1135m;

    /* renamed from: n */
    private char f1136n;

    /* renamed from: o */
    private char f1137o;

    /* renamed from: p */
    private Drawable f1138p;

    /* renamed from: q */
    private int f1139q;

    /* renamed from: r */
    private SubMenuC0328u f1140r;

    /* renamed from: s */
    private MenuItem.OnMenuItemClickListener f1141s;

    /* renamed from: t */
    private CharSequence f1142t;

    /* renamed from: u */
    private CharSequence f1143u;

    /* renamed from: v */
    private ColorStateList f1144v;

    /* renamed from: w */
    private PorterDuff.Mode f1145w;

    /* renamed from: x */
    private boolean f1146x;

    /* renamed from: y */
    private boolean f1147y;

    /* renamed from: z */
    private boolean f1148z;

    static {
        Covode.recordClassIndex(343);
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    /* renamed from: a */
    public final AbstractC0763b mo833a() {
        return this.f1128f;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final int getAlphabeticModifiers() {
        return this.f1125c;
    }

    public final char getAlphabeticShortcut() {
        return this.f1137o;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final CharSequence getContentDescription() {
        return this.f1142t;
    }

    public final int getGroupId() {
        return this.f1131i;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final ColorStateList getIconTintList() {
        return this.f1144v;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1145w;
    }

    public final Intent getIntent() {
        return this.f1135m;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f1130h;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1129g;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final int getNumericModifiers() {
        return this.f1124b;
    }

    public final char getNumericShortcut() {
        return this.f1136n;
    }

    public final int getOrder() {
        return this.f1132j;
    }

    public final SubMenu getSubMenu() {
        return this.f1140r;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f1133k;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final CharSequence getTooltipText() {
        return this.f1143u;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final boolean isActionViewExpanded() {
        return this.f1122E;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final boolean hasSubMenu() {
        if (this.f1140r != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final char mo1012c() {
        if (this.f1126d.mo976c()) {
            return this.f1137o;
        }
        return this.f1136n;
    }

    /* renamed from: e */
    public final boolean mo1016e() {
        if ((this.f1118A & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo1017f() {
        if ((this.f1118A & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo1018g() {
        if ((this.f1119B & 1) == 1) {
            return true;
        }
        return false;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1134l;
        if (charSequence == null) {
            charSequence = this.f1133k;
        }
        int i = Build.VERSION.SDK_INT;
        return charSequence;
    }

    /* renamed from: h */
    public final boolean mo1031h() {
        if ((this.f1119B & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo1033i() {
        if ((this.f1119B & 4) == 4) {
            return true;
        }
        return false;
    }

    public final boolean isCheckable() {
        if ((this.f1118A & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f1118A & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f1118A & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        CharSequence charSequence = this.f1133k;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final boolean collapseActionView() {
        if ((this.f1119B & 8) == 0) {
            return false;
        }
        if (this.f1120C == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1121D;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1126d.mo974b(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo1015d() {
        if (!this.f1126d.mo981d() || mo1012c() == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final boolean expandActionView() {
        if (!mo1038j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1121D;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1126d.mo959a(this);
        }
        return false;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final View getActionView() {
        View view = this.f1120C;
        if (view != null) {
            return view;
        }
        AbstractC0763b bVar = this.f1128f;
        if (bVar == null) {
            return null;
        }
        View a = bVar.mo1121a(this);
        this.f1120C = a;
        return a;
    }

    /* renamed from: j */
    public final boolean mo1038j() {
        AbstractC0763b bVar;
        if ((this.f1119B & 8) != 0) {
            if (this.f1120C == null && (bVar = this.f1128f) != null) {
                this.f1120C = bVar.mo1121a(this);
            }
            if (this.f1120C != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo1010b() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1141s;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0302h hVar = this.f1126d;
        if (hVar.mo958a(hVar, this)) {
            return true;
        }
        Runnable runnable = this.f1127e;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1135m != null) {
            try {
                Context context = this.f1126d.f1089a;
                Intent intent = this.f1135m;
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        AbstractC0763b bVar = this.f1128f;
        if (bVar == null || !bVar.mo1116b()) {
            return false;
        }
        return true;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f1138p;
        if (drawable != null) {
            return m1134a(drawable);
        }
        if (this.f1139q == 0) {
            return null;
        }
        Drawable b = C0196a.m619b(this.f1126d.f1089a, this.f1139q);
        this.f1139q = 0;
        this.f1138p = b;
        return m1134a(b);
    }

    public final boolean isVisible() {
        AbstractC0763b bVar = this.f1128f;
        if (bVar == null || !bVar.mo1123d()) {
            if ((this.f1118A & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1118A & 8) != 0 || !this.f1128f.mo1124e()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setIntent(Intent intent) {
        this.f1135m = intent;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1121D = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1141s = onMenuItemClickListener;
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    /* renamed from: a */
    public final AbstractMenuItemC0566b setContentDescription(CharSequence charSequence) {
        this.f1142t = charSequence;
        this.f1126d.mo972b(false);
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    /* renamed from: b */
    public final AbstractMenuItemC0566b setTooltipText(CharSequence charSequence) {
        this.f1143u = charSequence;
        this.f1126d.mo972b(false);
        return this;
    }

    /* renamed from: d */
    public final void mo1014d(boolean z) {
        this.f1122E = z;
        this.f1126d.mo972b(false);
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f1118A;
        int i2 = (z ? 1 : 0) | (i & -2);
        this.f1118A = i2;
        if (i != i2) {
            this.f1126d.mo972b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f1138p = null;
        this.f1139q = i;
        this.f1148z = true;
        this.f1126d.mo972b(false);
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1144v = colorStateList;
        this.f1146x = true;
        this.f1148z = true;
        this.f1126d.mo972b(false);
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1145w = mode;
        this.f1147y = true;
        this.f1148z = true;
        this.f1126d.mo972b(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f1136n == c) {
            return this;
        }
        this.f1136n = c;
        this.f1126d.mo972b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        return setTitle(this.f1126d.f1089a.getString(i));
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1134l = charSequence;
        this.f1126d.mo972b(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo1011b(z)) {
            this.f1126d.mo985g();
        }
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AbstractMenuItemC0566b setActionView(View view) {
        int i;
        this.f1120C = view;
        this.f1128f = null;
        if (view != null && view.getId() == -1 && (i = this.f1130h) > 0) {
            view.setId(i);
        }
        this.f1126d.mo987h();
        return this;
    }

    /* renamed from: e */
    private void m1137e(boolean z) {
        int i;
        int i2 = this.f1118A;
        int i3 = i2 & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f1118A = i4;
        if (i2 != i4) {
            this.f1126d.mo972b(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo1011b(boolean z) {
        int i;
        int i2 = this.f1118A;
        int i3 = i2 & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f1118A = i4;
        if (i2 != i4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo1013c(boolean z) {
        if (z) {
            this.f1118A |= 32;
        } else {
            this.f1118A &= -33;
        }
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f1126d.f1089a;
        setActionView(C1764a.m5927a(LayoutInflater.from(context), i, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f1137o == c) {
            return this;
        }
        this.f1137o = Character.toLowerCase(c);
        this.f1126d.mo972b(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1118A |= 16;
        } else {
            this.f1118A &= -17;
        }
        this.f1126d.mo972b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1139q = 0;
        this.f1138p = drawable;
        this.f1148z = true;
        this.f1126d.mo972b(false);
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1119B = i;
            this.f1126d.mo987h();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1133k = charSequence;
        this.f1126d.mo972b(false);
        SubMenuC0328u uVar = this.f1140r;
        if (uVar != null) {
            uVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* renamed from: a */
    private Drawable m1134a(Drawable drawable) {
        if (drawable != null && this.f1148z && (this.f1146x || this.f1147y)) {
            drawable = C0705a.m2506e(drawable).mutate();
            if (this.f1146x) {
                C0705a.m2496a(drawable, this.f1144v);
            }
            if (this.f1147y) {
                C0705a.m2499a(drawable, this.f1145w);
            }
            this.f1148z = false;
        }
        return drawable;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    /* renamed from: a */
    public final AbstractMenuItemC0566b mo831a(AbstractC0763b bVar) {
        AbstractC0763b bVar2 = this.f1128f;
        if (bVar2 != null) {
            bVar2.f2903g = null;
            bVar2.f2902f = null;
        }
        this.f1120C = null;
        this.f1128f = bVar;
        this.f1126d.mo972b(true);
        AbstractC0763b bVar3 = this.f1128f;
        if (bVar3 != null) {
            bVar3.mo1122a(new AbstractC0763b.AbstractC0765b() {
                /* class androidx.appcompat.view.menu.C0306j.C03071 */

                static {
                    Covode.recordClassIndex(344);
                }

                @Override // androidx.core.p037h.AbstractC0763b.AbstractC0765b
                /* renamed from: a */
                public final void mo1058a() {
                    C0306j.this.f1126d.mo985g();
                }
            });
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        boolean z2;
        if ((this.f1118A & 4) != 0) {
            C0302h hVar = this.f1126d;
            int groupId = getGroupId();
            int size = hVar.f1092d.size();
            hVar.mo982e();
            for (int i = 0; i < size; i++) {
                C0306j jVar = hVar.f1092d.get(i);
                if (jVar.getGroupId() == groupId && jVar.mo1016e() && jVar.isCheckable()) {
                    if (jVar == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jVar.m1137e(z2);
                }
            }
            hVar.mo983f();
        } else {
            m1137e(z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final CharSequence mo1007a(AbstractC0320p.AbstractC0321a aVar) {
        if (aVar.mo796a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    /* renamed from: a */
    public final void mo1008a(SubMenuC0328u uVar) {
        this.f1140r = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public final void mo1009a(boolean z) {
        int i;
        int i2 = this.f1118A & -5;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f1118A = i | i2;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f1136n = c;
        this.f1137o = Character.toLowerCase(c2);
        this.f1126d.mo972b(false);
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f1136n == c && this.f1124b == i) {
            return this;
        }
        this.f1136n = c;
        this.f1124b = KeyEvent.normalizeMetaState(i);
        this.f1126d.mo972b(false);
        return this;
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1137o == c && this.f1125c == i) {
            return this;
        }
        this.f1137o = Character.toLowerCase(c);
        this.f1125c = KeyEvent.normalizeMetaState(i);
        this.f1126d.mo972b(false);
        return this;
    }

    /* renamed from: a */
    static void m1136a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // androidx.core.p028a.p029a.AbstractMenuItemC0566b
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1136n = c;
        this.f1124b = KeyEvent.normalizeMetaState(i);
        this.f1137o = Character.toLowerCase(c2);
        this.f1125c = KeyEvent.normalizeMetaState(i2);
        this.f1126d.mo972b(false);
        return this;
    }

    C0306j(C0302h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1126d = hVar;
        this.f1130h = i2;
        this.f1131i = i;
        this.f1132j = i3;
        this.f1123a = i4;
        this.f1133k = charSequence;
        this.f1119B = i5;
    }
}
