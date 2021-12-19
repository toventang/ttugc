package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63263u;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.au */
public final class C73968au {

    /* renamed from: a */
    public static final C73968au f166059a = new C73968au();

    private C73968au() {
    }

    static {
        Covode.recordClassIndex(86718);
    }

    /* renamed from: a */
    public static final void m130095a(ShortVideoContext shortVideoContext) {
        String str;
        String awemeUserId;
        AbstractC63269z A;
        Object obj;
        String str2 = "";
        C89219l.m154721d(shortVideoContext, str2);
        C73967at.m130093a();
        C73967at.f166055a = System.currentTimeMillis();
        if (C89219l.m154714a((Object) "push", (Object) shortVideoContext.f155831p)) {
            C39162r.m79460a("shoot", new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("enter_from", shortVideoContext.f155831p).mo129406a("enter_method", str2).mo129406a("prop_id", shortVideoContext.f155757R).f188764a);
        } else if (C89219l.m154714a((Object) "comment_reply", (Object) shortVideoContext.f155831p) || C89219l.m154714a((Object) "question_and_answer", (Object) shortVideoContext.f155831p) || C89219l.m154714a((Object) "sticker_comment_reply", (Object) shortVideoContext.f155831p)) {
            if (CommentUtils.isDataValid(shortVideoContext.f155825j)) {
                C84425b a = new C84425b().mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("enter_method", shortVideoContext.f155825j.getEnterMethod()).mo129406a("enter_from", shortVideoContext.f155825j.getEnterFrom()).mo129406a("reply_comment_id", shortVideoContext.f155825j.getCommentId()).mo129406a("reply_user_id", shortVideoContext.f155825j.getUserId());
                if (C89219l.m154714a((Object) "comment_reply", (Object) shortVideoContext.f155831p)) {
                    CommentVideoModel commentVideoModel = shortVideoContext.f155825j;
                    String str3 = null;
                    if (commentVideoModel != null) {
                        str = commentVideoModel.getAwemeUserId();
                    } else {
                        str = null;
                    }
                    AbstractC63263u a2 = C63244g.m114602a();
                    if (!(a2 == null || (A = a2.mo73255A()) == null)) {
                        str3 = A.mo93904c();
                    }
                    if (C89219l.m154714a((Object) str, (Object) str3)) {
                        a.mo129403a("is_others_video", 0);
                    } else {
                        CommentVideoModel commentVideoModel2 = shortVideoContext.f155825j;
                        if (!(commentVideoModel2 == null || (awemeUserId = commentVideoModel2.getAwemeUserId()) == null || awemeUserId.length() == 0)) {
                            a.mo129403a("is_others_video", 1);
                        }
                    }
                }
                C39162r.m79460a("shoot", a.f188764a);
            }
        } else if (C89219l.m154714a((Object) "answer", (Object) shortVideoContext.f155831p) || C89219l.m154714a((Object) "question", (Object) shortVideoContext.f155831p)) {
            C84425b a3 = new C84425b().mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("enter_from", shortVideoContext.f155837v).mo129406a("enter_method", shortVideoContext.f155838w).mo129406a("qa_type", shortVideoContext.f155831p);
            QaStruct qaStruct = shortVideoContext.f155826k;
            if (qaStruct != null) {
                obj = Long.valueOf(qaStruct.getQuestionId());
            } else {
                obj = str2;
            }
            C84425b a4 = a3.mo129405a("question_id", obj);
            String a5 = C70747dv.m124972a();
            if (a5 == null) {
                a5 = str2;
            }
            C84425b a6 = a4.mo129406a("from_group_id", a5);
            String str4 = C70747dv.f158358b;
            if (str4 == null) {
                str4 = str2;
            }
            C84425b a7 = a6.mo129406a("last_group_id", str4);
            String str5 = C70747dv.f158359c;
            if (str5 != null) {
                str2 = str5;
            }
            C39162r.m79460a("shoot", a7.mo129406a("last_gid_from", str2).f188764a);
        } else if (C89219l.m154714a((Object) "story", (Object) shortVideoContext.f155831p)) {
            C39162r.m79460a("shoot", new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("shoot_entrance", "story").mo129406a("shoot_page", "video_shoot_page").mo129406a("enter_method", shortVideoContext.f155838w).mo129406a("enter_from", shortVideoContext.f155837v).mo129406a("is_westwindow_exist", shortVideoContext.f155782aP).f188764a);
        }
    }

    /* renamed from: a */
    public static final void m130096a(String str, ShortVideoContext shortVideoContext) {
        Object obj;
        C89219l.m154721d(shortVideoContext, "");
        C84425b a = new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("shoot_page", "video_shoot_page").mo129406a("is_westwindow_exist", shortVideoContext.f155782aP).mo129406a("shoot_enter_method", shortVideoContext.f155838w).mo129406a("exit_method", str);
        if (C73967at.f166055a >= 0) {
            obj = Long.valueOf(System.currentTimeMillis() - C73967at.f166055a);
        } else {
            obj = "-1";
        }
        C39162r.m79460a("shoot_exit", a.mo129405a("shoot_exit_duration", obj).mo129406a("furthest_page", C73967at.f166056b).f188764a);
    }
}
