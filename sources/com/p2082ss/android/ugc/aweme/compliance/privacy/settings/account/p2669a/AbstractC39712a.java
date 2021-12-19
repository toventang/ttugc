package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.AbstractC17736b;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a */
public abstract class AbstractC39712a extends Fragment implements AbstractC17736b {

    /* renamed from: a */
    private SparseArray f93562a;

    static {
        Covode.recordClassIndex(47439);
    }

    /* renamed from: a */
    public View mo69087a(int i) {
        if (this.f93562a == null) {
            this.f93562a = new SparseArray();
        }
        View view = (View) this.f93562a.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93562a.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo69089b() {
        SparseArray sparseArray = this.f93562a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onBeforeActivityCreated(Activity activity) {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69089b();
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onNewIntent(Intent intent) {
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onBackPressed_Activity() {
        mo69088a();
    }

    /* renamed from: a */
    public void mo69088a() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        C23073a.C23074a.m43506a(this).mo37495a(true).mo37494a(R.color.nc).f54627a.mo33415d();
        ActivityC0945e activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            intent.putExtra("activity_translation_type", 0);
        }
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onActivityResult_Activity(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ut, viewGroup, false);
    }
}
