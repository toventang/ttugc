package com.bytedance.ies.uikit.p1279a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* renamed from: com.bytedance.ies.uikit.a.b */
public abstract class AbstractC18234b extends Fragment {

    /* renamed from: a */
    private C13605d<AbstractC18241e> f43436a = new C13605d<>();

    /* renamed from: f */
    public boolean f43437f;

    /* renamed from: g */
    protected boolean f43438g;

    /* renamed from: h */
    public boolean f43439h;

    /* renamed from: i */
    protected boolean f43440i = true;

    static {
        Covode.recordClassIndex(20893);
    }

    public boolean af_() {
        return this.f43438g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f43438g = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.f43436a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f43436a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f43438g = false;
        this.f43439h = true;
        if (!this.f43436a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f43436a.iterator();
            while (it.hasNext()) {
                AbstractC18241e next = it.next();
                if (next != null) {
                    next.mo29100a();
                }
            }
            this.f43436a.f33081a.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f43437f = true;
        if (!this.f43436a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f43436a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f43437f = false;
        if (!this.f43436a.f33081a.isEmpty()) {
            Iterator<AbstractC18241e> it = this.f43436a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43437f = false;
        this.f43438g = false;
        this.f43439h = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f43438g = true;
    }
}
