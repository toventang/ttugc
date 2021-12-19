package com.p2082ss.android.ugc.aweme.discover.helper;

import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$play$6 */
public final class MusicPlayHelper$play$6 implements AbstractC1192f {

    /* renamed from: a */
    final /* synthetic */ MusicPlayHelper f97869a;

    static {
        Covode.recordClassIndex(49892);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MusicPlayHelper$play$6(MusicPlayHelper musicPlayHelper) {
        this.f97869a = musicPlayHelper;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            this.f97869a.mo71126a();
        }
    }
}
