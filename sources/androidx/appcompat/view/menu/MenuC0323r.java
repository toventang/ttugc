package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.p028a.p029a.AbstractMenuC0565a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.r */
public class MenuC0323r extends AbstractC0291c<AbstractMenuC0565a> implements Menu {
    static {
        Covode.recordClassIndex(360);
    }

    public void close() {
        ((AbstractMenuC0565a) this.f1031b).close();
    }

    public void clear() {
        mo905a();
        ((AbstractMenuC0565a) this.f1031b).clear();
    }

    public boolean hasVisibleItems() {
        return ((AbstractMenuC0565a) this.f1031b).hasVisibleItems();
    }

    public int size() {
        return ((AbstractMenuC0565a) this.f1031b).size();
    }

    public void setQwertyMode(boolean z) {
        ((AbstractMenuC0565a) this.f1031b).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo903a(((AbstractMenuC0565a) this.f1031b).add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return mo904a(((AbstractMenuC0565a) this.f1031b).addSubMenu(i));
    }

    public MenuItem findItem(int i) {
        return mo903a(((AbstractMenuC0565a) this.f1031b).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo903a(((AbstractMenuC0565a) this.f1031b).getItem(i));
    }

    public void removeGroup(int i) {
        mo906a(i);
        ((AbstractMenuC0565a) this.f1031b).removeGroup(i);
    }

    public void removeItem(int i) {
        mo907b(i);
        ((AbstractMenuC0565a) this.f1031b).removeItem(i);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo903a(((AbstractMenuC0565a) this.f1031b).add(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo904a(((AbstractMenuC0565a) this.f1031b).addSubMenu(charSequence));
    }

    MenuC0323r(Context context, AbstractMenuC0565a aVar) {
        super(context, aVar);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((AbstractMenuC0565a) this.f1031b).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((AbstractMenuC0565a) this.f1031b).setGroupVisible(i, z);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((AbstractMenuC0565a) this.f1031b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((AbstractMenuC0565a) this.f1031b).performIdentifierAction(i, i2);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((AbstractMenuC0565a) this.f1031b).setGroupCheckable(i, z, z2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((AbstractMenuC0565a) this.f1031b).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo903a(((AbstractMenuC0565a) this.f1031b).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo904a(((AbstractMenuC0565a) this.f1031b).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo903a(((AbstractMenuC0565a) this.f1031b).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo904a(((AbstractMenuC0565a) this.f1031b).addSubMenu(i, i2, i3, charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((AbstractMenuC0565a) this.f1031b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = mo903a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }
}
