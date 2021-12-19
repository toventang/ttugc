package com.p2082ss.android.ugc.aweme.base.component;

import android.content.Context;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.component.b */
public final class C34539b extends AbstractC0952i.AbstractC0954b {

    /* renamed from: a */
    private WeakReference<AbstractC33501c> f81554a;

    static {
        Covode.recordClassIndex(41501);
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
    public final void onFragmentResumed(AbstractC0952i iVar, Fragment fragment) {
        super.onFragmentResumed(iVar, fragment);
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
    public final void onFragmentStopped(AbstractC0952i iVar, Fragment fragment) {
        super.onFragmentStopped(iVar, fragment);
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
    public final void onFragmentAttached(AbstractC0952i iVar, Fragment fragment, Context context) {
        super.onFragmentAttached(iVar, fragment, context);
        if (fragment instanceof AbstractC33501c) {
            this.f81554a = new WeakReference<>(fragment);
        }
    }
}
