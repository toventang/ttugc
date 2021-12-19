package com.bytedance.widget;

import androidx.lifecycle.AbstractC1191e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1212s;
import com.bytedance.covode.number.Covode;

public class Widget_LifecycleAdapter implements AbstractC1191e {

    /* renamed from: a */
    final Widget f56011a;

    static {
        Covode.recordClassIndex(27766);
    }

    Widget_LifecycleAdapter(Widget widget) {
        this.f56011a = widget;
    }

    @Override // androidx.lifecycle.AbstractC1191e
    /* renamed from: a */
    public final void mo4008a(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar, boolean z, C1212s sVar) {
        boolean z2;
        if (sVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
                if (!z2 || sVar.mo4028a("create$widget_release", 1)) {
                    this.f56011a.create$widget_release();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
                if (!z2 || sVar.mo4028a("start$widget_release", 1)) {
                    this.f56011a.start$widget_release();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                if (!z2 || sVar.mo4028a("resume$widget_release", 1)) {
                    this.f56011a.resume$widget_release();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
                if (!z2 || sVar.mo4028a("pause$widget_release", 1)) {
                    this.f56011a.pause$widget_release();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                if (!z2 || sVar.mo4028a("stop$widget_release", 1)) {
                    this.f56011a.stop$widget_release();
                }
            } else if (aVar != AbstractC1196i.EnumC1198a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.mo4028a("destroy$widget_release", 1)) {
                    this.f56011a.destroy$widget_release();
                }
            }
        }
    }
}
