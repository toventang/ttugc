package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p028a.p029a.AbstractSubMenuC0567c;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.view.menu.v */
final class SubMenuC0329v extends MenuC0323r implements SubMenu {
    static {
        Covode.recordClassIndex(366);
    }

    public final void clearHeader() {
        ((AbstractSubMenuC0567c) this.f1031b).clearHeader();
    }

    public final MenuItem getItem() {
        return mo903a(((AbstractSubMenuC0567c) this.f1031b).getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        ((AbstractSubMenuC0567c) this.f1031b).setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        ((AbstractSubMenuC0567c) this.f1031b).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((AbstractSubMenuC0567c) this.f1031b).setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        ((AbstractSubMenuC0567c) this.f1031b).setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((AbstractSubMenuC0567c) this.f1031b).setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((AbstractSubMenuC0567c) this.f1031b).setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        ((AbstractSubMenuC0567c) this.f1031b).setIcon(drawable);
        return this;
    }

    SubMenuC0329v(Context context, AbstractSubMenuC0567c cVar) {
        super(context, cVar);
    }
}
