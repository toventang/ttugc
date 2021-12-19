package com.bytedance.scene;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.FragmentC22224k;
import com.bytedance.scene.p1621c.AbstractC22148a;
import com.bytedance.scene.p1622d.C22170j;
import com.bytedance.scene.p1622d.C22171k;

/* renamed from: com.bytedance.scene.a */
public final class C22114a {
    static {
        Covode.recordClassIndex(25918);
    }

    /* renamed from: a */
    public static boolean m41593a(Activity activity, AbstractC1204m mVar) {
        if (C22171k.m41661a(activity) && mVar.getLifecycle().mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m41592a(Activity activity, AbstractC1204m mVar, Intent intent, AbstractC22148a aVar) {
        C22170j.m41654a();
        if (!m41593a(activity, mVar)) {
            FragmentC22224k kVar = (FragmentC22224k) activity.getFragmentManager().findFragmentByTag(FragmentC22224k.class.getName());
            if (kVar == null) {
                kVar = new FragmentC22224k();
                C22171k.m41659a(activity.getFragmentManager(), activity.getFragmentManager().beginTransaction().add(kVar, FragmentC22224k.class.getName()), false);
            }
            if (kVar.isAdded()) {
                kVar.mo36495a(mVar, intent, 1001, aVar);
                return;
            }
            kVar.f52564d.add(new FragmentC22224k.AbstractC22225a(kVar, activity, mVar, intent, 1001, aVar) {
                /* class com.bytedance.scene.C22114a.C221151 */

                /* renamed from: a */
                final /* synthetic */ FragmentC22224k f52289a;

                /* renamed from: b */
                final /* synthetic */ Activity f52290b;

                /* renamed from: c */
                final /* synthetic */ AbstractC1204m f52291c;

                /* renamed from: d */
                final /* synthetic */ Intent f52292d;

                /* renamed from: e */
                final /* synthetic */ int f52293e = 1001;

                /* renamed from: f */
                final /* synthetic */ AbstractC22148a f52294f;

                static {
                    Covode.recordClassIndex(25919);
                }

                @Override // com.bytedance.scene.FragmentC22224k.AbstractC22225a
                /* renamed from: a */
                public final void mo36305a() {
                    this.f52289a.f52564d.remove(this);
                    if (!C22114a.m41593a(this.f52290b, this.f52291c)) {
                        this.f52289a.mo36495a(this.f52291c, this.f52292d, this.f52293e, this.f52294f);
                    }
                }

                {
                    this.f52289a = r2;
                    this.f52290b = r3;
                    this.f52291c = r4;
                    this.f52292d = r5;
                    this.f52294f = r7;
                }
            });
        }
    }
}
