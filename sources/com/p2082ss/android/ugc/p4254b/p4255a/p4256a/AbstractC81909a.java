package com.p2082ss.android.ugc.p4254b.p4255a.p4256a;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;

/* renamed from: com.ss.android.ugc.b.a.a.a */
public abstract class AbstractC81909a extends AbstractC18234b {

    /* renamed from: a */
    private SparseArray<AbstractC81911c> f183418a;

    static {
        Covode.recordClassIndex(95330);
    }

    /* renamed from: G */
    public abstract SparseArray<AbstractC81911c> mo61042G();

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i).mo84711aS();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i).mo70443J();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i).mo70513q();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i).mo84712aT();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i).mo84713aU();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i).mo70442I();
        }
        SparseArray<AbstractC81911c> sparseArray = this.f183418a;
        if (sparseArray != null) {
            sparseArray.clear();
            this.f183418a = null;
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i).mo70547a(bundle);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        this.f183418a = mo61042G();
        for (int i = 0; i < this.f183418a.size(); i++) {
            this.f183418a.valueAt(i).mo84686a(activity, this);
        }
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
