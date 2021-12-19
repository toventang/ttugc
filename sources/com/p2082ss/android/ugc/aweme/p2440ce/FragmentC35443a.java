package com.p2082ss.android.ugc.aweme.p2440ce;

import android.app.Fragment;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;

/* renamed from: com.ss.android.ugc.aweme.ce.a */
public final class FragmentC35443a extends Fragment {

    /* renamed from: a */
    C35444b.AbstractC35447b f83612a;

    static {
        Covode.recordClassIndex(42619);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("permissions"), 1);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C35444b.AbstractC35447b bVar = this.f83612a;
        if (bVar != null) {
            bVar.mo53515a(strArr, iArr);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
