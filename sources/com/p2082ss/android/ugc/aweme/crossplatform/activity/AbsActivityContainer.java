package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer */
public abstract class AbsActivityContainer implements AbstractC33974au, AbstractC34467b, AbstractC40547m {
    static {
        Covode.recordClassIndex(48343);
    }

    /* renamed from: a */
    public abstract void mo69612a(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo69613a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo69614a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo69615a(AbstractC34467b bVar);

    /* renamed from: a */
    public abstract void mo69616a(Runnable runnable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo69617a();

    /* renamed from: a */
    public abstract boolean mo69618a(String str, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo69619b();

    /* renamed from: b */
    public abstract void mo69620b(AbstractC34467b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo69621i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo69622j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo69623k();

    /* renamed from: l */
    public abstract void mo69624l();

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }
}
