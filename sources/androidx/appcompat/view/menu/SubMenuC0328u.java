package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0302h;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.view.menu.u */
public class SubMenuC0328u extends C0302h implements SubMenu {

    /* renamed from: n */
    public C0302h f1195n;

    /* renamed from: o */
    private C0306j f1196o;

    static {
        Covode.recordClassIndex(365);
    }

    public MenuItem getItem() {
        return this.f1196o;
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: b */
    public final boolean mo973b() {
        return this.f1195n.mo973b();
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: c */
    public final boolean mo976c() {
        return this.f1195n.mo976c();
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: d */
    public final boolean mo981d() {
        return this.f1195n.mo981d();
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: l */
    public final C0302h mo993l() {
        return this.f1195n.mo993l();
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: a */
    public final String mo951a() {
        int itemId;
        C0306j jVar = this.f1196o;
        if (jVar == null || (itemId = jVar.getItemId()) == 0) {
            return null;
        }
        return super.mo951a() + ":" + itemId;
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: a */
    public final void mo953a(C0302h.AbstractC0303a aVar) {
        this.f1195n.mo953a(aVar);
    }

    @Override // androidx.appcompat.view.menu.C0302h
    public void setGroupDividerEnabled(boolean z) {
        this.f1195n.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo969b(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo947a(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo949a(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1196o.setIcon(i);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0302h
    public void setQwertyMode(boolean z) {
        this.f1195n.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: a */
    public final boolean mo959a(C0306j jVar) {
        return this.f1195n.mo959a(jVar);
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: b */
    public final boolean mo974b(C0306j jVar) {
        return this.f1195n.mo974b(jVar);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo948a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo950a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1196o.setIcon(drawable);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: a */
    public final boolean mo958a(C0302h hVar, MenuItem menuItem) {
        if (super.mo958a(hVar, menuItem) || this.f1195n.mo958a(hVar, menuItem)) {
            return true;
        }
        return false;
    }

    public SubMenuC0328u(Context context, C0302h hVar, C0306j jVar) {
        super(context);
        this.f1195n = hVar;
        this.f1196o = jVar;
    }
}
