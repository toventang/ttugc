package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cl */
final /* synthetic */ class RunnableC37112cl implements Runnable {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87472a;

    static {
        Covode.recordClassIndex(44466);
    }

    RunnableC37112cl(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87472a = bzVar;
    }

    public final void run() {
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87472a;
        if (!Keva.getRepo("reply_with_video_bubble").getBoolean(C31575b.m65865g().getCurUserId(), false) && bzVar.getActivity() != null) {
            if (bzVar.f87393Y == null) {
                bzVar.f87393Y = new C17257b(bzVar.getActivity()).mo27354a(bzVar.f87419b).mo27358b(48).mo27352a(5000L).mo27351a(R.string.alp).mo27350a();
            }
            bzVar.f87393Y.mo27341a();
            Keva.getRepo("reply_with_video_bubble").storeBoolean(C31575b.m65865g().getCurUserId(), true);
            if (bzVar.f87391W != null) {
                C36274b bVar = bzVar.f87391W;
                if (bVar.f85731b.getActivity() != null && bVar.f85732c != null && bVar.f85732c.mo64435n() != null) {
                    Comment n = bVar.f85732c.mo64435n();
                    String awemeId = n.getAwemeId();
                    C39162r.m79460a("comment_reply_toast_show", new C33744d().mo59983a("group_id", awemeId).mo59983a("reply_comment_id", n.getCid()).mo59983a("author_id", C31575b.m65865g().getCurUserId()).f79943a);
                }
            }
        }
    }
}
