package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.p028a.p029a.AbstractMenuItemC0566b;
import androidx.core.p028a.p029a.AbstractSubMenuC0567c;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.appcompat.view.menu.c */
public abstract class AbstractC0291c<T> extends C0292d<T> {

    /* renamed from: a */
    final Context f1028a;

    /* renamed from: c */
    private Map<AbstractMenuItemC0566b, MenuItem> f1029c;

    /* renamed from: d */
    private Map<AbstractSubMenuC0567c, SubMenu> f1030d;

    static {
        Covode.recordClassIndex(328);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo905a() {
        Map<AbstractMenuItemC0566b, MenuItem> map = this.f1029c;
        if (map != null) {
            map.clear();
        }
        Map<AbstractSubMenuC0567c, SubMenu> map2 = this.f1030d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo903a(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC0566b)) {
            return menuItem;
        }
        AbstractMenuItemC0566b bVar = (AbstractMenuItemC0566b) menuItem;
        if (this.f1029c == null) {
            this.f1029c = new C0484a();
        }
        MenuItem menuItem2 = this.f1029c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0322q.m1212a(this.f1028a, bVar);
        this.f1029c.put(bVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo907b(int i) {
        Map<AbstractMenuItemC0566b, MenuItem> map = this.f1029c;
        if (map != null) {
            Iterator<AbstractMenuItemC0566b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo904a(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuC0567c)) {
            return subMenu;
        }
        AbstractSubMenuC0567c cVar = (AbstractSubMenuC0567c) subMenu;
        if (this.f1030d == null) {
            this.f1030d = new C0484a();
        }
        SubMenu subMenu2 = this.f1030d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0329v vVar = new SubMenuC0329v(this.f1028a, cVar);
        this.f1030d.put(cVar, vVar);
        return vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo906a(int i) {
        Map<AbstractMenuItemC0566b, MenuItem> map = this.f1029c;
        if (map != null) {
            Iterator<AbstractMenuItemC0566b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    AbstractC0291c(Context context, T t) {
        super(t);
        this.f1028a = context;
    }
}
