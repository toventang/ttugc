package com.p2082ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* renamed from: com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent */
public abstract class BaseLoginActivityComponent implements AbstractC33974au, AbstractC34542e {
    static {
        Covode.recordClassIndex(41497);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34542e
    /* renamed from: a */
    public void mo61010a(Activity activity, String str, String str2, Bundle bundle, AbstractC34543f fVar) {
        if (activity instanceof AbstractC1204m) {
            ((AbstractC1204m) activity).getLifecycle().mo4012a(this);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34542e
    /* renamed from: a */
    public void mo61011a(Fragment fragment, String str, String str2, Bundle bundle, AbstractC34543f fVar) {
        fragment.getLifecycle().mo4012a(this);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }
}
