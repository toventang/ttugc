package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.bottomnavigation.b */
public final class C26601b extends C0302h {
    static {
        Covode.recordClassIndex(32047);
    }

    public C26601b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0302h, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    @Override // androidx.appcompat.view.menu.C0302h
    /* renamed from: a */
    public final MenuItem mo946a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo982e();
            MenuItem a = super.mo946a(i, i2, i3, charSequence);
            if (a instanceof C0306j) {
                ((C0306j) a).mo1009a(true);
            }
            mo983f();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }
}
