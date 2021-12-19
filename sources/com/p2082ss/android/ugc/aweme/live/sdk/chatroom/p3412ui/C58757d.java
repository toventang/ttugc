package com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.Live;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.d */
public final class C58757d extends Fragment {

    /* renamed from: a */
    Fragment f133723a;

    /* renamed from: b */
    private SparseArray f133724b;

    static {
        Covode.recordClassIndex(69063);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f133724b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Live.getService();
        super.onCreate(bundle);
        if (this.f133723a != null) {
            AbstractC0976n a = getChildFragmentManager().mo3552a();
            Fragment fragment = this.f133723a;
            if (fragment == null) {
                C89219l.m154715b();
            }
            a.mo3469b(R.id.d61, fragment);
            a.mo3473c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.am8, viewGroup, false);
    }
}
