package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bj */
public final class C69886bj extends AbstractC72639k {

    /* renamed from: a */
    private final Bundle f156158a;

    static {
        Covode.recordClassIndex(82295);
    }

    public C69886bj(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        this.f156158a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onFinish(AbstractC72623d dVar, Object obj) {
        C89219l.m154721d(dVar, "");
        if (dVar instanceof AbstractC72623d.C72626c) {
            C69831ai aiVar = ((AbstractC72623d.C72626c) dVar).f162806a;
            Serializable serializable = this.f156158a.getSerializable("extra_video_publish_args");
            if (!(serializable instanceof VideoPublishEditModel)) {
                serializable = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
            if (videoPublishEditModel != null) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getVideoCacheService().mo93914a(videoPublishEditModel.getOutputFile().toString(), aiVar);
            }
        } else if ((dVar instanceof AbstractC72623d.C72625b) && !C82306a.m142359b()) {
            AbstractC81915c.m141874a(new C71900f(9));
        }
    }
}
