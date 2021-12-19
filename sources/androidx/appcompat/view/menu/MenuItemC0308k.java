package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.AbstractC0276c;
import androidx.core.p028a.p029a.AbstractMenuItemC0566b;
import androidx.core.p037h.AbstractC0763b;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.view.menu.k */
public class MenuItemC0308k extends AbstractC0291c<AbstractMenuItemC0566b> implements MenuItem {

    /* renamed from: c */
    public Method f1150c;

    static {
        Covode.recordClassIndex(345);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.k$a */
    public class C0309a extends AbstractC0763b {

        /* renamed from: a */
        final ActionProvider f1151a;

        static {
            Covode.recordClassIndex(346);
        }

        @Override // androidx.core.p037h.AbstractC0763b
        /* renamed from: a */
        public final View mo1114a() {
            return this.f1151a.onCreateActionView();
        }

        @Override // androidx.core.p037h.AbstractC0763b
        /* renamed from: b */
        public final boolean mo1116b() {
            return this.f1151a.onPerformDefaultAction();
        }

        @Override // androidx.core.p037h.AbstractC0763b
        /* renamed from: c */
        public final boolean mo1117c() {
            return this.f1151a.hasSubMenu();
        }

        @Override // androidx.core.p037h.AbstractC0763b
        /* renamed from: a */
        public final void mo1115a(SubMenu subMenu) {
            this.f1151a.onPrepareSubMenu(MenuItemC0308k.this.mo904a(subMenu));
        }

        public C0309a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1151a = actionProvider;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    static class C0310b extends FrameLayout implements AbstractC0276c {

        /* renamed from: a */
        final CollapsibleActionView f1153a;

        static {
            Covode.recordClassIndex(347);
        }

        @Override // androidx.appcompat.view.AbstractC0276c
        /* renamed from: a */
        public final void mo741a() {
            this.f1153a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.AbstractC0276c
        /* renamed from: b */
        public final void mo742b() {
            this.f1153a.onActionViewCollapsed();
        }

        C0310b(View view) {
            super(view.getContext());
            this.f1153a = (CollapsibleActionView) view;
            addView(view);
        }
    }

    public boolean collapseActionView() {
        return ((AbstractMenuItemC0566b) this.f1031b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((AbstractMenuItemC0566b) this.f1031b).expandActionView();
    }

    public int getAlphabeticModifiers() {
        return ((AbstractMenuItemC0566b) this.f1031b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((AbstractMenuItemC0566b) this.f1031b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((AbstractMenuItemC0566b) this.f1031b).getContentDescription();
    }

    public int getGroupId() {
        return ((AbstractMenuItemC0566b) this.f1031b).getGroupId();
    }

    public Drawable getIcon() {
        return ((AbstractMenuItemC0566b) this.f1031b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((AbstractMenuItemC0566b) this.f1031b).getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((AbstractMenuItemC0566b) this.f1031b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((AbstractMenuItemC0566b) this.f1031b).getIntent();
    }

    public int getItemId() {
        return ((AbstractMenuItemC0566b) this.f1031b).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((AbstractMenuItemC0566b) this.f1031b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((AbstractMenuItemC0566b) this.f1031b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((AbstractMenuItemC0566b) this.f1031b).getNumericShortcut();
    }

    public int getOrder() {
        return ((AbstractMenuItemC0566b) this.f1031b).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo904a(((AbstractMenuItemC0566b) this.f1031b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((AbstractMenuItemC0566b) this.f1031b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((AbstractMenuItemC0566b) this.f1031b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((AbstractMenuItemC0566b) this.f1031b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((AbstractMenuItemC0566b) this.f1031b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((AbstractMenuItemC0566b) this.f1031b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((AbstractMenuItemC0566b) this.f1031b).isCheckable();
    }

    public boolean isChecked() {
        return ((AbstractMenuItemC0566b) this.f1031b).isChecked();
    }

    public boolean isEnabled() {
        return ((AbstractMenuItemC0566b) this.f1031b).isEnabled();
    }

    public boolean isVisible() {
        return ((AbstractMenuItemC0566b) this.f1031b).isVisible();
    }

    public ActionProvider getActionProvider() {
        AbstractC0763b a = ((AbstractMenuItemC0566b) this.f1031b).mo833a();
        if (a instanceof C0309a) {
            return ((C0309a) a).f1151a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((AbstractMenuItemC0566b) this.f1031b).getActionView();
        if (actionView instanceof C0310b) {
            return (View) ((C0310b) actionView).f1153a;
        }
        return actionView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0309a mo1059a(ActionProvider actionProvider) {
        return new C0309a(this.f1028a, actionProvider);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((AbstractMenuItemC0566b) this.f1031b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((AbstractMenuItemC0566b) this.f1031b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((AbstractMenuItemC0566b) this.f1031b).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((AbstractMenuItemC0566b) this.f1031b).mo832a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((AbstractMenuItemC0566b) this.f1031b).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((AbstractMenuItemC0566b) this.f1031b).setIcon(i);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((AbstractMenuItemC0566b) this.f1031b).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((AbstractMenuItemC0566b) this.f1031b).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((AbstractMenuItemC0566b) this.f1031b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((AbstractMenuItemC0566b) this.f1031b).setNumericShortcut(c);
        return this;
    }

    public void setShowAsAction(int i) {
        ((AbstractMenuItemC0566b) this.f1031b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((AbstractMenuItemC0566b) this.f1031b).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((AbstractMenuItemC0566b) this.f1031b).setTitle(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((AbstractMenuItemC0566b) this.f1031b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((AbstractMenuItemC0566b) this.f1031b).mo834b(charSequence);
        return this;
    }

    /* renamed from: androidx.appcompat.view.menu.k$c */
    class MenuItem$OnActionExpandListenerC0311c extends C0292d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        static {
            Covode.recordClassIndex(348);
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1031b).onMenuItemActionCollapse(MenuItemC0308k.this.mo903a(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1031b).onMenuItemActionExpand(MenuItemC0308k.this.mo903a(menuItem));
        }

        MenuItem$OnActionExpandListenerC0311c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$d */
    class MenuItem$OnMenuItemClickListenerC0312d extends C0292d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        static {
            Covode.recordClassIndex(349);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1031b).onMenuItemClick(MenuItemC0308k.this.mo903a(menuItem));
        }

        MenuItem$OnMenuItemClickListenerC0312d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0309a aVar;
        AbstractMenuItemC0566b bVar = (AbstractMenuItemC0566b) this.f1031b;
        if (actionProvider != null) {
            aVar = mo1059a(actionProvider);
        } else {
            aVar = null;
        }
        bVar.mo831a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((AbstractMenuItemC0566b) this.f1031b).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((AbstractMenuItemC0566b) this.f1031b).setTitle(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((AbstractMenuItemC0566b) this.f1031b).setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((AbstractMenuItemC0566b) this.f1031b).setActionView(i);
        View actionView = ((AbstractMenuItemC0566b) this.f1031b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((AbstractMenuItemC0566b) this.f1031b).setActionView(new C0310b(actionView));
        }
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItem$OnActionExpandListenerC0311c cVar;
        AbstractMenuItemC0566b bVar = (AbstractMenuItemC0566b) this.f1031b;
        if (onActionExpandListener != null) {
            cVar = new MenuItem$OnActionExpandListenerC0311c(onActionExpandListener);
        } else {
            cVar = null;
        }
        bVar.setOnActionExpandListener(cVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem$OnMenuItemClickListenerC0312d dVar;
        AbstractMenuItemC0566b bVar = (AbstractMenuItemC0566b) this.f1031b;
        if (onMenuItemClickListener != null) {
            dVar = new MenuItem$OnMenuItemClickListenerC0312d(onMenuItemClickListener);
        } else {
            dVar = null;
        }
        bVar.setOnMenuItemClickListener(dVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0310b(view);
        }
        ((AbstractMenuItemC0566b) this.f1031b).setActionView(view);
        return this;
    }

    MenuItemC0308k(Context context, AbstractMenuItemC0566b bVar) {
        super(context, bVar);
    }

    public MenuItem setShortcut(char c, char c2) {
        ((AbstractMenuItemC0566b) this.f1031b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((AbstractMenuItemC0566b) this.f1031b).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((AbstractMenuItemC0566b) this.f1031b).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((AbstractMenuItemC0566b) this.f1031b).setShortcut(c, c2, i, i2);
        return this;
    }
}
