package com.bytedance.android.livesdk.util.rxutils.p651b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4591l.C88958b;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.b.a */
public final class C11183a extends Fragment {

    /* renamed from: a */
    public final C88958b<EnumC11186b> f26810a = new C88958b<>();

    static {
        Covode.recordClassIndex(12810);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f26810a.onNext(EnumC11186b.DESTROY);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26810a.onNext(EnumC11186b.DESTROY_VIEW);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f26810a.onNext(EnumC11186b.DETACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f26810a.onNext(EnumC11186b.PAUSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f26810a.onNext(EnumC11186b.RESUME);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f26810a.onNext(EnumC11186b.START);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f26810a.onNext(EnumC11186b.STOP);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f26810a.onNext(EnumC11186b.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26810a.onNext(EnumC11186b.CREATE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f26810a.onNext(EnumC11186b.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f26810a.onNext(EnumC11186b.CREATE_VIEW);
        return null;
    }
}
