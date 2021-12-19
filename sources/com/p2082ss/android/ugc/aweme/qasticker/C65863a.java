package com.p2082ss.android.ugc.aweme.qasticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qasticker.a */
public final class C65863a {

    /* renamed from: a */
    public final ShortVideoContext f148411a;

    /* renamed from: b */
    public final VideoPublishEditModel f148412b;

    static {
        Covode.recordClassIndex(77366);
    }

    public C65863a() {
        this(null, 3);
    }

    /* renamed from: a */
    public final C84425b mo105008a() {
        VideoPublishEditModel videoPublishEditModel = this.f148412b;
        if (videoPublishEditModel != null) {
            C84425b a = new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("shoot_entrance", videoPublishEditModel.mShootWay).mo129406a("user_id", C63244g.m114602a().mo73255A().mo93904c());
            C89219l.m154716b(a, "");
            return a;
        }
        C84425b bVar = new C84425b();
        C89219l.m154716b(bVar, "");
        return bVar;
    }

    private C65863a(VideoPublishEditModel videoPublishEditModel) {
        this.f148411a = null;
        this.f148412b = videoPublishEditModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C65863a(VideoPublishEditModel videoPublishEditModel, int i) {
        this((i & 2) != 0 ? null : videoPublishEditModel);
    }
}
