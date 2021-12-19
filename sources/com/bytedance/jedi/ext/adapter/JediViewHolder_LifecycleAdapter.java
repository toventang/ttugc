package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.AbstractC1191e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1212s;
import com.bytedance.covode.number.Covode;

public class JediViewHolder_LifecycleAdapter implements AbstractC1191e {

    /* renamed from: a */
    final JediViewHolder f48650a;

    static {
        Covode.recordClassIndex(24084);
    }

    JediViewHolder_LifecycleAdapter(JediViewHolder jediViewHolder) {
        this.f48650a = jediViewHolder;
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
                if (!z2 || sVar.mo4028a("create$ext_adapter_release", 1)) {
                    this.f48650a.create$ext_adapter_release();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
                if (!z2 || sVar.mo4028a("start$ext_adapter_release", 1)) {
                    this.f48650a.start$ext_adapter_release();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                if (!z2 || sVar.mo4028a("resume$ext_adapter_release", 1)) {
                    this.f48650a.resume$ext_adapter_release();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
                if (!z2 || sVar.mo4028a("pause$ext_adapter_release", 1)) {
                    this.f48650a.pause$ext_adapter_release();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                if (!z2 || sVar.mo4028a("stop$ext_adapter_release", 1)) {
                    this.f48650a.stop$ext_adapter_release();
                }
            } else if (aVar != AbstractC1196i.EnumC1198a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.mo4028a("destroy$ext_adapter_release", 1)) {
                    this.f48650a.destroy$ext_adapter_release();
                }
            }
        }
    }
}
