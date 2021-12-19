package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3797c.C69906a;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cl */
final /* synthetic */ class RunnableC73579cl implements Runnable {

    /* renamed from: a */
    private final C73560cj f165383a;

    static {
        Covode.recordClassIndex(86316);
    }

    RunnableC73579cl(C73560cj cjVar) {
        this.f165383a = cjVar;
    }

    public final void run() {
        C73560cj cjVar = this.f165383a;
        VideoPublishEditModel videoPublishEditModel = cjVar.f165268K;
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.autoAttachedAnchor != null) {
            AbstractC81915c.m141874a(new C37609a(videoPublishEditModel.autoAttachedAnchor));
            C39162r.m79460a("choose_anchor", new C33744d().mo59983a("shoot_way", "share_video").mo59983a("enter_from", "video_post_page").mo59983a("anchor_type", "game").mo59983a("anchor_entry", videoPublishEditModel.autoAttachedAnchor.getTitle()).f79943a);
        }
        List<CreateAnchorInfo> a = C69906a.m123469a(cjVar.f165268K);
        for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : cjVar.f165276S) {
            eVar.f2751b.callbackAnchors(a);
        }
    }
}
