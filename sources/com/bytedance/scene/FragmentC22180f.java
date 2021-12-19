package com.bytedance.scene;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.p1622d.C22171k;

/* renamed from: com.bytedance.scene.f */
public final class FragmentC22180f extends Fragment {

    /* renamed from: a */
    public AbstractC22181a f52428a;

    /* renamed from: b */
    public AbstractC22232m f52429b;

    /* renamed from: com.bytedance.scene.f$a */
    public interface AbstractC22181a {
        static {
            Covode.recordClassIndex(25985);
        }

        /* renamed from: a */
        void mo36371a();
    }

    static {
        Covode.recordClassIndex(25984);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC22232m mVar = this.f52429b;
        if (mVar != null) {
            mVar.mo36509e();
        }
    }

    public final void onDetach() {
        super.onDetach();
        AbstractC22181a aVar = this.f52428a;
        if (aVar != null) {
            aVar.mo36371a();
        }
    }

    public final void onPause() {
        super.onPause();
        AbstractC22232m mVar = this.f52429b;
        if (mVar != null) {
            mVar.mo36507c();
        }
    }

    public final void onResume() {
        super.onResume();
        AbstractC22232m mVar = this.f52429b;
        if (mVar != null) {
            mVar.mo36506b();
        }
    }

    public final void onStart() {
        super.onStart();
        AbstractC22232m mVar = this.f52429b;
        if (mVar != null) {
            mVar.mo36503a();
        }
    }

    public final void onStop() {
        super.onStop();
        AbstractC22232m mVar = this.f52429b;
        if (mVar != null) {
            mVar.mo36508d();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AbstractC22232m mVar = this.f52429b;
        if (mVar != null) {
            mVar.mo36505a(bundle);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC22232m mVar = this.f52429b;
        if (mVar != null) {
            mVar.mo36504a(getActivity(), bundle);
            return;
        }
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        C22171k.m41659a(fragmentManager, fragmentManager.beginTransaction().remove(this), false);
    }
}
