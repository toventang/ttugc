package com.bytedance.android.livesdk.p433ac;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.p254k.AbstractC4372a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ac.j */
public class C6607j implements AbstractC4372a {
    static {
        Covode.recordClassIndex(7343);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p254k.AbstractC4372a
    public Fragment getAddModeratorFragment() {
        return new C6591g();
    }

    @Override // com.bytedance.android.live.p254k.AbstractC4372a
    public Fragment getModeratorListFragment() {
        return new C6598i();
    }
}
