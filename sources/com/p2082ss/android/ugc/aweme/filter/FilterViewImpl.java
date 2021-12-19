package com.p2082ss.android.ugc.aweme.filter;

import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterViewImpl */
public class FilterViewImpl implements AbstractC33974au {

    /* renamed from: a */
    ActivityC0218d f116951a;

    /* renamed from: b */
    public List<Object> f116952b;

    /* renamed from: c */
    private View f116953c;

    static {
        Covode.recordClassIndex(59792);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f116953c = null;
        this.f116952b.clear();
        this.f116951a = null;
    }
}
