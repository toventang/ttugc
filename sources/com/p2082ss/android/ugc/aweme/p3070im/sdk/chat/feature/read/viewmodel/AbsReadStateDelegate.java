package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel;

import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate */
public abstract class AbsReadStateDelegate extends Handler implements AbstractC54406a {

    /* renamed from: c */
    public final C54278a f124326c;

    static {
        Covode.recordClassIndex(63966);
    }

    /* renamed from: a */
    public void mo91349a() {
    }

    public void bG_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        AbstractC54406a.C54407a.onCreate(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        AbstractC54406a.C54407a.onDestroy(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        AbstractC54406a.C54407a.onPause(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        AbstractC54406a.C54407a.onResume(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
        AbstractC54406a.C54407a.onStart(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3134b.AbstractC54406a
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        AbstractC54406a.C54407a.onStop(this);
    }

    public AbsReadStateDelegate(C54278a aVar) {
        C89219l.m154721d(aVar, "");
        this.f124326c = aVar;
    }
}
