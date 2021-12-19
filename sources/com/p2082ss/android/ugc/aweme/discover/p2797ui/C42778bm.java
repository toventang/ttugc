package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67614d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bm */
public final class C42778bm extends AbstractC42708ay<Object> {

    /* renamed from: o */
    private SparseArray f99785o;

    static {
        Covode.recordClassIndex(50882);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42708ay, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72802x();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42708ay, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a
    /* renamed from: x */
    public final void mo72802x() {
        SparseArray sparseArray = this.f99785o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42584a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        C67614d.m119764a();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
