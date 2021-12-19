package com.facebook.p1907m;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.m.b */
public final class C24885b extends Fragment {

    /* renamed from: a */
    private C24884a f59069a;

    static {
        Covode.recordClassIndex(29074);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f59069a.mo40775a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59069a = new C24884a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f59069a.mo40776a(i, i2, intent);
    }
}
