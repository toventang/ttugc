package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.f */
public final class C72308f {

    /* renamed from: b */
    public static final C72309a f162106b = new C72309a((byte) 0);

    /* renamed from: a */
    public final C84425b f162107a;

    /* renamed from: c */
    private final ShortVideoContext f162108c;

    static {
        Covode.recordClassIndex(84975);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.f$a */
    public static final class C72309a {
        static {
            Covode.recordClassIndex(84976);
        }

        private C72309a() {
        }

        public /* synthetic */ C72309a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo114577a() {
        C39162r.m79460a("upload_content_next", this.f162107a.f188764a);
    }

    /* renamed from: a */
    public final C72308f mo114575a(int i) {
        this.f162107a.mo129403a("duration_ms", i);
        return this;
    }

    /* renamed from: b */
    public final C72308f mo114578b(int i) {
        this.f162107a.mo129403a("is_add_more", i);
        return this;
    }

    /* renamed from: a */
    public final C72308f mo114576a(ShortVideoContext shortVideoContext) {
        String str;
        String enterMethod;
        if (shortVideoContext != null) {
            CommentVideoModel commentVideoModel = shortVideoContext.f155825j;
            C84425b bVar = this.f162107a;
            String str2 = null;
            String str3 = "";
            if (!CommentUtils.needMob(shortVideoContext)) {
                str = str3;
            } else if (commentVideoModel != null) {
                str = commentVideoModel.getCommentId();
            } else {
                str = null;
            }
            C84425b a = bVar.mo129406a("reply_comment_id", str);
            if (!CommentUtils.needMob(shortVideoContext)) {
                str2 = str3;
            } else if (commentVideoModel != null) {
                str2 = commentVideoModel.getUserId();
            }
            C84425b a2 = a.mo129406a("reply_user_id", str2);
            if (!(commentVideoModel == null || (enterMethod = commentVideoModel.getEnterMethod()) == null)) {
                str3 = enterMethod;
            }
            a2.mo129406a("enter_method", str3);
        }
        return this;
    }

    public C72308f(ShortVideoContext shortVideoContext, String str, String str2, int i, int i2, String str3, boolean z) {
        String str4;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f162108c = shortVideoContext;
        C84425b bVar = new C84425b();
        this.f162107a = bVar;
        C84425b a = bVar.mo129406a("content_type", str).mo129406a("content_source", "upload").mo129406a("upload_type", str2).mo129406a("mix_type", str3).mo129403a("is_multi_content", z ? 1 : 0).mo129403a("pic_cnt", i2).mo129403a("video_cnt", i);
        if (shortVideoContext != null) {
            a.mo129406a("shoot_way", shortVideoContext.f155831p);
            a.mo129406a("creation_id", shortVideoContext.f155830o);
            if (shortVideoContext.f155768aB) {
                str4 = "album_content_detail";
            } else {
                str4 = "album_panel";
            }
            a.mo129406a("enter_from", str4);
        }
    }
}
