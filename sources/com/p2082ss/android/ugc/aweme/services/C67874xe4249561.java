package com.p2082ss.android.ugc.aweme.services;

import android.view.TextureView;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$newLivePlayHelper$1$livePlayHelper$1 */
public final class C67874xe4249561 implements AbstractC58607b {
    final /* synthetic */ ProfileDependentComponentImpl$newLivePlayHelper$1 this$0;

    static {
        Covode.recordClassIndex(79717);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
    public final void firstFrame() {
        this.this$0.$callback.firstFrame();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
    public final void playing() {
        this.this$0.$callback.playing();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    C67874xe4249561(ProfileDependentComponentImpl$newLivePlayHelper$1 profileDependentComponentImpl$newLivePlayHelper$1) {
        this.this$0 = profileDependentComponentImpl$newLivePlayHelper$1;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
    public final void playComplete(String str) {
        C89219l.m154721d(str, "");
        this.this$0.$callback.playComplete(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
    public final void playPrepared(String str) {
        C89219l.m154721d(str, "");
        this.this$0.$callback.playPrepared(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
    public final void playerMediaError(String str) {
        C89219l.m154721d(str, "");
        this.this$0.$callback.playerMediaError(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
    public final void seiUpdate(String str) {
        C89219l.m154721d(str, "");
        this.this$0.$callback.seiUpdate(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
    public final void onPlayerMessage(AbstractC11643g.EnumC11645b bVar, Object obj) {
        C89219l.m154721d(bVar, "");
        this.this$0.$callback.onPlayerMessage(bVar, obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
    public final void onVideoSizeChange(TextureView textureView, int i, int i2) {
        this.this$0.$callback.onVideoSizeChange(textureView, i, i2);
    }
}
