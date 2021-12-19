package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.internal.e */
public final class C26664e extends C0302h {
    static {
        Covode.recordClassIndex(32120);
    }

    public C26664e(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0302h, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0306j jVar = (C0306j) mo946a(i, i2, i3, charSequence);
        C26677g gVar = new C26677g(this.f1089a, this, jVar);
        jVar.mo1008a(gVar);
        return gVar;
    }
}
