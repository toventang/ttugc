package com.bytedance.scene;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.C22268t;
import com.bytedance.scene.p1622d.C22171k;

/* renamed from: com.bytedance.scene.u */
public final class FragmentC22272u extends Fragment implements C22268t.AbstractC22270a {

    /* renamed from: a */
    private final C22268t f52681a = C22268t.f52675a.mo36467a();

    static {
        Covode.recordClassIndex(26084);
    }

    @Override // com.bytedance.scene.C22268t.AbstractC22270a
    /* renamed from: a */
    public final C22268t mo36467a() {
        return this.f52681a;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    /* renamed from: a */
    public static FragmentC22272u m41942a(Activity activity, String str, boolean z, boolean z2) {
        String str2 = str + "_ScopeHolderFragment";
        FragmentManager fragmentManager = activity.getFragmentManager();
        FragmentC22272u uVar = (FragmentC22272u) fragmentManager.findFragmentByTag(str2);
        if (uVar != null) {
            if (!z) {
                return uVar;
            }
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.remove(uVar);
            C22171k.m41659a(fragmentManager, beginTransaction, z2);
        }
        FragmentC22272u uVar2 = new FragmentC22272u();
        FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
        beginTransaction2.add(uVar2, str2);
        C22171k.m41659a(fragmentManager, beginTransaction2, z2);
        return uVar2;
    }
}
