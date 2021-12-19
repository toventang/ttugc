package com.p2082ss.android.ugc.aweme.components.video.playbox;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.components.video.playbox.LynxDeclarativeVideoPlayBox */
public final class LynxDeclarativeVideoPlayBox extends DeclarativeVideoPlayBox implements AbstractC33974au {

    /* renamed from: k */
    private C40176a f94334k;

    static {
        Covode.recordClassIndex(47963);
    }

    @Override // com.p2082ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d, com.p2082ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox
    /* renamed from: d */
    public final void mo30346d() {
        this.f94334k.mo69352a();
    }

    @Override // com.bytedance.ies.xelement.AbstractC19055d, com.p2082ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox
    /* renamed from: c */
    public final void mo30345c() {
        this.f94334k.mo69353a(getMTextureView());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LynxDeclarativeVideoPlayBox(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f94334k = new C40176a(context, this);
    }

    public /* synthetic */ LynxDeclarativeVideoPlayBox(Context context, byte b) {
        this(context);
    }
}
