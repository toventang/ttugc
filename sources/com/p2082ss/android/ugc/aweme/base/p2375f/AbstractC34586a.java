package com.p2082ss.android.ugc.aweme.base.p2375f;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a;
import com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.ss.android.ugc.aweme.base.f.a */
public abstract class AbstractC34586a extends AbstractC81909a implements AbstractC33501c {

    /* renamed from: x */
    public boolean f81623x;

    static {
        Covode.recordClassIndex(41548);
    }

    @Override // com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public Analysis mo59595F() {
        return null;
    }

    /* renamed from: H */
    public boolean mo61043H() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    /* renamed from: G */
    public SparseArray<AbstractC81911c> mo61042G() {
        return new SparseArray<>();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus a = EventBus.m156962a();
        if (mo61043H() && a.mo145393a(this)) {
            a.mo145395b(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C51423a.m95791b(3, null, "current page：" + getClass().getSimpleName());
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus a = EventBus.m156962a();
        if (!a.mo145393a(this) && mo61043H()) {
            EventBus.m156966a(a, this);
        }
    }
}
