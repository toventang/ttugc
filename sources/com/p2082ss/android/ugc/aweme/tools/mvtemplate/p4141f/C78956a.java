package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f;

import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78931c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78934f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.f.a */
public final class C78956a implements AbstractC78933e {

    /* renamed from: a */
    private final AbstractC78933e f177451a;

    static {
        Covode.recordClassIndex(92105);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void pause() {
        AbstractC78933e eVar = this.f177451a;
        if (eVar != null) {
            eVar.pause();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void stop() {
        AbstractC78933e eVar = this.f177451a;
        if (eVar != null) {
            eVar.stop();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final boolean isPlaying() {
        AbstractC78933e eVar = this.f177451a;
        if (eVar != null) {
            return eVar.isPlaying();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void addPlayerListener(AbstractC78931c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC78933e eVar = this.f177451a;
        if (eVar != null) {
            eVar.addPlayerListener(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void tryResume(Video video) {
        C89219l.m154721d(video, "");
        AbstractC78933e eVar = this.f177451a;
        if (eVar != null) {
            eVar.tryResume(video);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e
    public final void wrap(TextureView textureView) {
        C89219l.m154721d(textureView, "");
        AbstractC78933e eVar = this.f177451a;
        if (eVar != null) {
            eVar.wrap(textureView);
        }
    }

    public C78956a(C21582f fVar) {
        AbstractC78933e eVar;
        AbstractC78928a aVar;
        AbstractC78934f aVVideoViewComponentFactory;
        if (fVar == null || (aVar = (AbstractC78928a) fVar.mo35247a(AbstractC78928a.class)) == null || (aVVideoViewComponentFactory = aVar.getAVVideoViewComponentFactory()) == null) {
            eVar = null;
        } else {
            eVar = aVVideoViewComponentFactory.create();
        }
        this.f177451a = eVar;
    }
}
