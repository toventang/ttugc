package com.bytedance.als.dsl;

import android.app.Fragment;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.als.dsl.a */
public final class FragmentC2550a extends Fragment implements AbstractC1204m {

    /* renamed from: a */
    private final C1205n f7718a = new C1205n(this);

    /* renamed from: b */
    private HashMap f7719b;

    static {
        Covode.recordClassIndex(2935);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f7718a;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f7718a.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f7719b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void onPause() {
        super.onPause();
        this.f7718a.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        this.f7718a.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        this.f7718a.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        this.f7718a.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f7718a.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }
}
