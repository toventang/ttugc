package com.p2082ss.android.ugc.aweme.activity.processor;

import android.content.Intent;
import android.view.KeyEvent;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.LifecycleOnKeyDownListener */
final class LifecycleOnKeyDownListener implements AbstractC1202k, AbstractC33100u {

    /* renamed from: a */
    private boolean f78627a;

    /* renamed from: b */
    private final AbstractC33100u f78628b;

    /* renamed from: c */
    private final AbstractC1204m f78629c;

    static {
        Covode.recordClassIndex(39881);
    }

    @Override // com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33100u
    /* renamed from: a */
    public final void mo58848a(int i, Intent intent) {
    }

    @Override // com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33100u
    /* renamed from: a */
    public final boolean mo58849a() {
        if (this.f78627a) {
            return this.f78628b.mo58849a();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33100u
    /* renamed from: a */
    public final boolean mo58850a(int i, KeyEvent keyEvent) {
        return this.f78628b.mo58850a(i, keyEvent);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        int i = C33105z.f78678a[aVar.ordinal()];
        if (i == 1) {
            this.f78627a = true;
        } else if (i == 2) {
            this.f78627a = false;
        } else if (i == 3) {
            this.f78629c.getLifecycle().mo4013b(this);
        }
    }
}
