package com.p2082ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.FreeDataPage */
public final class FreeDataPage extends AbstractC68195a {

    /* renamed from: e */
    private SparseArray f152823e;

    static {
        Covode.recordClassIndex(80477);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f152823e == null) {
            this.f152823e = new SparseArray();
        }
        View view = (View) this.f152823e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f152823e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f152823e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ax9;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: a */
    private static Bundle m120537a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final void mo108724a(android.app.Activity r13) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.page.datasave.zerorating.FreeDataPage.mo108724a(android.app.Activity):void");
    }
}
