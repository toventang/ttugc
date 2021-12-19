package com.p2082ss.android.ugc.aweme.shortvideo.sticker.comment;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.CommentStickerRecordServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.ICommentFavoriteService;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36401a;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36540c;
import com.p2082ss.android.ugc.aweme.comment.services.ICommentStickerRecordService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.p2082ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.p3470e.C60768e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.comment.p3862a.C72861a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72971d;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a */
public final class C72854a extends AbstractC72946a {

    /* renamed from: a */
    private View f163471a;

    /* renamed from: l */
    private final C72862b f163472l;

    /* renamed from: m */
    private final AbstractC72926g f163473m;

    static {
        Covode.recordClassIndex(85546);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 4;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    /* renamed from: o */
    private static boolean m128659o() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo115238g() {
        VideoReplyStruct videoReplyStruct;
        C75391j jVar = this.f163697k;
        if (jVar == null || (videoReplyStruct = jVar.f169464s) == null || videoReplyStruct.getAwemeId() == 0) {
            return "";
        }
        return String.valueOf(videoReplyStruct.getAwemeId());
    }

    /* renamed from: c */
    public final boolean mo115237c() {
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m128659o();
        }
        if (C58029j.f132256h) {
            return false;
        }
        mo115235a(R.string.dcq, 0);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: a */
    public final View mo115223a() {
        MethodCollector.m26663i(6807);
        if (C72890c.m128720a(this.f163695i)) {
            if (this.f163471a == null) {
                this.f163471a = new C72971d(this.f163695i);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f163471a;
                if (view == null) {
                    C89219l.m154715b();
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.f163471a;
                if (view2 != null) {
                    ((C72971d) view2).setPoints(this.f163472l.f163486a);
                    View view3 = this.f163471a;
                    if (view3 == null) {
                        C89219l.m154715b();
                    }
                    view3.postInvalidate();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CommonStickerFeedView");
                    MethodCollector.m26664o(6807);
                    throw nullPointerException;
                }
            }
            View view4 = this.f163471a;
            MethodCollector.m26664o(6807);
            return view4;
        }
        if (this.f163471a == null) {
            this.f163471a = new FrameLayout(this.f163695i);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view5 = this.f163471a;
            if (view5 != null) {
                view5.setLayoutParams(layoutParams2);
            }
        }
        View view6 = this.f163471a;
        MethodCollector.m26664o(6807);
        return view6;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(6964);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f163695i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.f163695i, null, 0, 6);
        tuxTextView.setTextColor(C0643b.m2378c(this.f163695i, R.color.l));
        tuxTextView.setTuxFont(62);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f163695i.getString(R.string.am3));
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f163695i);
        autoRTLImageView.setImageResource(R.drawable.b6n);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.m26664o(6964);
        return linearLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Long l;
        VideoReplyStruct videoReplyStruct;
        VideoReplyStruct videoReplyStruct2;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163697k;
        VideoReplyStruct videoReplyStruct3 = null;
        if (jVar == null || (iVar4 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar4.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        C75391j jVar3 = this.f163697k;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f169430d;
        }
        C33744d a3 = a2.mo59983a("log_pb", str3);
        C75391j jVar4 = this.f163697k;
        if (jVar4 == null || (iVar = jVar4.f169463r) == null) {
            str4 = null;
        } else {
            str4 = iVar.f169427a;
        }
        C33744d a4 = a3.mo59983a("enter_from", str4);
        C75391j jVar5 = this.f163697k;
        String str8 = "";
        if (jVar5 == null || (videoReplyStruct2 = jVar5.f169464s) == null || videoReplyStruct2.getCommentId() != 0) {
            C75391j jVar6 = this.f163697k;
            if (jVar6 == null || (videoReplyStruct = jVar6.f169464s) == null) {
                l = null;
            } else {
                l = Long.valueOf(videoReplyStruct.getCommentId());
            }
            str5 = String.valueOf(l);
        } else {
            str5 = str8;
        }
        C33744d a5 = a4.mo59983a("reply_comment_id", str5);
        C75391j jVar7 = this.f163697k;
        if (!(jVar7 == null || (str7 = jVar7.f169465t) == null)) {
            str8 = str7;
        }
        C33744d a6 = a5.mo59983a("reply_user_id", str8).mo59983a("sticker_type", "comment_reply");
        if (C72861a.f163483b) {
            C75391j jVar8 = this.f163697k;
            if (jVar8 != null) {
                videoReplyStruct3 = jVar8.f169464s;
            }
            if (m128658a(videoReplyStruct3)) {
                str6 = "both";
                C39162r.m79460a("sticker_click", a6.mo59983a("options_show", str6).f79943a);
            }
        }
        str6 = "see_comment";
        C39162r.m79460a("sticker_click", a6.mo59983a("options_show", str6).f79943a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        if (r8 == null) goto L_0x00ca;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115229f() {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.sticker.comment.C72854a.mo115229f():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$a */
    static final class View$OnClickListenerC72855a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72854a f163474a;

        static {
            Covode.recordClassIndex(85547);
        }

        View$OnClickListenerC72855a(C72854a aVar) {
            this.f163474a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f163474a.mo115357n();
            this.f163474a.mo115229f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f163472l.mo115236a(jVar);
    }

    /* renamed from: a */
    static void m128657a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            C12290b.m22060a("stcker_awemeid_issue_error_rate", i, (JSONObject) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    static boolean m128658a(VideoReplyStruct videoReplyStruct) {
        if (videoReplyStruct == null || videoReplyStruct.getUserAvatar() == null || !C60768e.m110302b(videoReplyStruct.getUserAvatar()) || !C80538hl.m139614a(videoReplyStruct.getUserName()) || videoReplyStruct.getCommentUserId() == 0 || videoReplyStruct.getCommentId() == 0 || videoReplyStruct.getAwemeId() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$b */
    static final class View$OnClickListenerC72856b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72854a f163475a;

        static {
            Covode.recordClassIndex(85548);
        }

        View$OnClickListenerC72856b(C72854a aVar) {
            this.f163475a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$b$a */
        static final class C72857a<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ VideoReplyStruct f163476a;

            /* renamed from: b */
            final /* synthetic */ View$OnClickListenerC72856b f163477b;

            static {
                Covode.recordClassIndex(85549);
            }

            C72857a(VideoReplyStruct videoReplyStruct, View$OnClickListenerC72856b bVar) {
                this.f163476a = videoReplyStruct;
                this.f163477b = bVar;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                int i;
                C89219l.m154721d(iVar, "");
                if (!iVar.mo5544c() && !iVar.mo5539b()) {
                    this.f163476a.setCollectStat(0);
                    ICommentFavoriteService a = CommentFavoriteServiceImpl.m128654a();
                    String valueOf = String.valueOf(this.f163476a.getCommentId());
                    Integer collectStat = this.f163476a.getCollectStat();
                    if (collectStat != null) {
                        i = collectStat.intValue();
                    } else {
                        i = -1;
                    }
                    a.mo63317a(valueOf, i);
                    this.f163477b.f163475a.mo115235a(R.string.brw, 0);
                }
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            VideoReplyStruct videoReplyStruct;
            C1731i<BaseResponse> collectComment;
            VideoReplyStruct videoReplyStruct2;
            String valueOf;
            VideoReplyStruct videoReplyStruct3;
            VideoReplyStruct videoReplyStruct4;
            C75384i iVar;
            ClickAgent.onClick(view);
            this.f163475a.mo115357n();
            if (!this.f163475a.mo115237c()) {
                this.f163475a.mo115234a(0);
                C75391j jVar = this.f163475a.f163697k;
                String str4 = "";
                if (jVar == null || (iVar = jVar.f169463r) == null || (str = iVar.f169427a) == null) {
                    str = str4;
                }
                C75391j jVar2 = this.f163475a.f163697k;
                if (jVar2 == null || (videoReplyStruct4 = jVar2.f169464s) == null || (str2 = String.valueOf(videoReplyStruct4.getCommentId())) == null) {
                    str2 = str4;
                }
                C75391j jVar3 = this.f163475a.f163697k;
                if (jVar3 == null || (videoReplyStruct3 = jVar3.f169464s) == null || (str3 = String.valueOf(videoReplyStruct3.getCommentUserId())) == null) {
                    str3 = str4;
                }
                C75391j jVar4 = this.f163475a.f163697k;
                if (!(jVar4 == null || (videoReplyStruct2 = jVar4.f169464s) == null || (valueOf = String.valueOf(videoReplyStruct2.getAwemeId())) == null)) {
                    str4 = valueOf;
                }
                C36540c.m74384a(str, "sticker", 0, str2, str3, str4);
                C75391j jVar5 = this.f163475a.f163697k;
                if (jVar5 != null && (videoReplyStruct = jVar5.f169464s) != null && (collectComment = UserFavoritesApi.f109832a.collectComment(String.valueOf(videoReplyStruct.getCommentId()), 0)) != null) {
                    collectComment.mo5534a(new C72857a(videoReplyStruct, this), C1731i.f5564c, null);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$c */
    static final class View$OnClickListenerC72858c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72854a f163478a;

        static {
            Covode.recordClassIndex(85550);
        }

        View$OnClickListenerC72858c(C72854a aVar) {
            this.f163478a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$c$a */
        static final class C72859a<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ VideoReplyStruct f163479a;

            /* renamed from: b */
            final /* synthetic */ View$OnClickListenerC72858c f163480b;

            static {
                Covode.recordClassIndex(85551);
            }

            C72859a(VideoReplyStruct videoReplyStruct, View$OnClickListenerC72858c cVar) {
                this.f163479a = videoReplyStruct;
                this.f163480b = cVar;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                int i;
                C89219l.m154721d(iVar, "");
                if (!iVar.mo5544c() && !iVar.mo5539b()) {
                    this.f163479a.setCollectStat(1);
                    ICommentFavoriteService a = CommentFavoriteServiceImpl.m128654a();
                    String valueOf = String.valueOf(this.f163479a.getCommentId());
                    Integer collectStat = this.f163479a.getCollectStat();
                    if (collectStat != null) {
                        i = collectStat.intValue();
                    } else {
                        i = -1;
                    }
                    a.mo63317a(valueOf, i);
                    this.f163480b.f163478a.mo115235a(R.string.bru, 2131231217);
                }
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            VideoReplyStruct videoReplyStruct;
            C1731i<BaseResponse> collectComment;
            VideoReplyStruct videoReplyStruct2;
            String valueOf;
            VideoReplyStruct videoReplyStruct3;
            VideoReplyStruct videoReplyStruct4;
            C75384i iVar;
            ClickAgent.onClick(view);
            this.f163478a.mo115357n();
            if (!this.f163478a.mo115237c()) {
                this.f163478a.mo115234a(1);
                C75391j jVar = this.f163478a.f163697k;
                String str4 = "";
                if (jVar == null || (iVar = jVar.f169463r) == null || (str = iVar.f169427a) == null) {
                    str = str4;
                }
                C75391j jVar2 = this.f163478a.f163697k;
                if (jVar2 == null || (videoReplyStruct4 = jVar2.f169464s) == null || (str2 = String.valueOf(videoReplyStruct4.getCommentId())) == null) {
                    str2 = str4;
                }
                C75391j jVar3 = this.f163478a.f163697k;
                if (jVar3 == null || (videoReplyStruct3 = jVar3.f169464s) == null || (str3 = String.valueOf(videoReplyStruct3.getCommentUserId())) == null) {
                    str3 = str4;
                }
                C75391j jVar4 = this.f163478a.f163697k;
                if (!(jVar4 == null || (videoReplyStruct2 = jVar4.f169464s) == null || (valueOf = String.valueOf(videoReplyStruct2.getAwemeId())) == null)) {
                    str4 = valueOf;
                }
                C36540c.m74384a(str, "sticker", 1, str2, str3, str4);
                C75391j jVar5 = this.f163478a.f163697k;
                if (jVar5 != null && (videoReplyStruct = jVar5.f169464s) != null && (collectComment = UserFavoritesApi.f109832a.collectComment(String.valueOf(videoReplyStruct.getCommentId()), 1)) != null) {
                    collectComment.mo5534a(new C72859a(videoReplyStruct, this), C1731i.f5564c, null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo115234a(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        VideoReplyStruct videoReplyStruct;
        VideoReplyStruct videoReplyStruct2;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C75384i iVar4;
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163697k;
        Long l = null;
        if (jVar == null || (iVar4 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar4.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar3 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        C75391j jVar3 = this.f163697k;
        if (jVar3 == null || (iVar2 = jVar3.f169463r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f169430d;
        }
        C33744d a3 = a2.mo59983a("log_pb", str3);
        C75391j jVar4 = this.f163697k;
        if (jVar4 == null || (iVar = jVar4.f169463r) == null) {
            str4 = null;
        } else {
            str4 = iVar.f169427a;
        }
        C33744d a4 = a3.mo59983a("enter_from", str4).mo59983a("to_group_id", mo115238g());
        C75391j jVar5 = this.f163697k;
        String str8 = "";
        if (jVar5 == null || (videoReplyStruct2 = jVar5.f169464s) == null || videoReplyStruct2.getCommentId() != 0) {
            C75391j jVar6 = this.f163697k;
            if (!(jVar6 == null || (videoReplyStruct = jVar6.f169464s) == null)) {
                l = Long.valueOf(videoReplyStruct.getCommentId());
            }
            str5 = String.valueOf(l);
        } else {
            str5 = str8;
        }
        C33744d a5 = a4.mo59983a("reply_comment_id", str5);
        C75391j jVar7 = this.f163697k;
        if (!(jVar7 == null || (str7 = jVar7.f169465t) == null)) {
            str8 = str7;
        }
        C33744d a6 = a5.mo59983a("reply_user_id", str8);
        if (i == 1) {
            str6 = "add_to_favorites";
        } else {
            str6 = "remove_from_favorites";
        }
        C39162r.m79460a("sticker_toast_click", a6.mo59983a("target", str6).mo59983a("sticker_type", "comment_reply").f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.a$d */
    static final class View$OnClickListenerC72860d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C72854a f163481a;

        static {
            Covode.recordClassIndex(85552);
        }

        View$OnClickListenerC72860d(C72854a aVar) {
            this.f163481a = aVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean z;
            VideoReplyStruct videoReplyStruct;
            String str6;
            C75384i iVar;
            User user;
            String str7;
            Long l;
            VideoReplyStruct videoReplyStruct2;
            VideoReplyStruct videoReplyStruct3;
            C75384i iVar2;
            C75384i iVar3;
            C75384i iVar4;
            C75384i iVar5;
            ClickAgent.onClick(view);
            this.f163481a.mo115357n();
            C72854a aVar = this.f163481a;
            C33744d dVar = new C33744d();
            C75391j jVar = aVar.f163697k;
            String str8 = null;
            if (jVar == null || (iVar5 = jVar.f169463r) == null) {
                str = null;
            } else {
                str = iVar5.f169429c;
            }
            C33744d a = dVar.mo59983a("group_id", str);
            C75391j jVar2 = aVar.f163697k;
            if (jVar2 == null || (iVar4 = jVar2.f169463r) == null) {
                str2 = null;
            } else {
                str2 = iVar4.f169428b;
            }
            C33744d a2 = a.mo59983a("author_id", str2);
            C75391j jVar3 = aVar.f163697k;
            if (jVar3 == null || (iVar3 = jVar3.f169463r) == null) {
                str3 = null;
            } else {
                str3 = iVar3.f169430d;
            }
            C33744d a3 = a2.mo59983a("log_pb", str3);
            C75391j jVar4 = aVar.f163697k;
            if (jVar4 == null || (iVar2 = jVar4.f169463r) == null) {
                str4 = null;
            } else {
                str4 = iVar2.f169427a;
            }
            C33744d a4 = a3.mo59983a("enter_from", str4).mo59983a("to_group_id", aVar.mo115238g());
            C75391j jVar5 = aVar.f163697k;
            String str9 = "";
            if (jVar5 == null || (videoReplyStruct3 = jVar5.f169464s) == null || videoReplyStruct3.getCommentId() != 0) {
                C75391j jVar6 = aVar.f163697k;
                if (jVar6 == null || (videoReplyStruct2 = jVar6.f169464s) == null) {
                    l = null;
                } else {
                    l = Long.valueOf(videoReplyStruct2.getCommentId());
                }
                str5 = String.valueOf(l);
            } else {
                str5 = str9;
            }
            C33744d a5 = a4.mo59983a("reply_comment_id", str5);
            C75391j jVar7 = aVar.f163697k;
            if (!(jVar7 == null || (str7 = jVar7.f169465t) == null)) {
                str9 = str7;
            }
            C39162r.m79460a("sticker_toast_click", a5.mo59983a("reply_user_id", str9).mo59983a("target", "reply_with_video").mo59983a("sticker_type", "comment_reply").f79943a);
            C75391j jVar8 = aVar.f163697k;
            if (!(jVar8 == null || (videoReplyStruct = jVar8.f169464s) == null)) {
                if (C72854a.m128658a(videoReplyStruct)) {
                    ICommentStickerRecordService a6 = CommentStickerRecordServiceImpl.m73702a();
                    Context context = aVar.f163695i;
                    String valueOf = String.valueOf(videoReplyStruct.getCommentUserId());
                    String userName = videoReplyStruct.getUserName();
                    UrlModel userAvatar = videoReplyStruct.getUserAvatar();
                    String commentMsg = videoReplyStruct.getCommentMsg();
                    String valueOf2 = String.valueOf(videoReplyStruct.getCommentId());
                    String valueOf3 = String.valueOf(videoReplyStruct.getAwemeId());
                    C75391j jVar9 = aVar.f163697k;
                    if (jVar9 == null || (user = jVar9.f169448c) == null) {
                        str6 = null;
                    } else {
                        str6 = user.getUid();
                    }
                    String valueOf4 = String.valueOf(videoReplyStruct.getCommentId());
                    int i = aVar.f163694h;
                    CommentVideoModel.Type type = CommentVideoModel.Type.COMMENT;
                    C75391j jVar10 = aVar.f163697k;
                    if (!(jVar10 == null || (iVar = jVar10.f169463r) == null)) {
                        str8 = iVar.f169427a;
                    }
                    a6.mo63314a(context, new CommentVideoModel(valueOf, userName, userAvatar, commentMsg, valueOf2, valueOf3, str6, valueOf4, "", i, "comment_press", 0, 0, type, "comment_reply", str8));
                }
                if (!TextUtils.isEmpty(String.valueOf(videoReplyStruct.getAwemeId())) && !TextUtils.isEmpty(String.valueOf(videoReplyStruct.getCommentId()))) {
                    z = true;
                    C72854a.m128657a(z);
                }
            }
            z = false;
            C72854a.m128657a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final int mo115233a(C23322d dVar) {
        Integer num;
        Long l;
        int i;
        VideoReplyStruct videoReplyStruct;
        VideoReplyStruct videoReplyStruct2;
        C89219l.m154721d(dVar, "");
        C75391j jVar = this.f163697k;
        VideoReplyStruct videoReplyStruct3 = null;
        if (jVar == null || jVar.f169464s == null) {
            return 0;
        }
        C23322d.C23324b bVar = new C23322d.C23324b();
        String string = dVar.f55273b.getString(R.string.am1);
        C89219l.m154716b(string, "");
        bVar.mo38017a(string);
        bVar.f55280a = 2131232501;
        bVar.f55285f = new View$OnClickListenerC72855a(this);
        dVar.mo38015a(bVar);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (videoReplyStruct2 = jVar2.f169464s) == null) {
            num = null;
        } else {
            num = videoReplyStruct2.getCollectStat();
        }
        int i2 = 1;
        if (C36401a.m74098a() && num != null) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                C23322d.C23324b bVar2 = new C23322d.C23324b();
                C75391j jVar3 = this.f163697k;
                if (jVar3 == null || (videoReplyStruct = jVar3.f169464s) == null) {
                    l = null;
                } else {
                    l = Long.valueOf(videoReplyStruct.getCommentId());
                }
                if (l != null) {
                    i = CommentFavoriteServiceImpl.m128654a().mo63316a(String.valueOf(l.longValue()));
                } else {
                    i = -1;
                }
                if ((num.intValue() == 1 && i == -1) || i == 1) {
                    String string2 = dVar.f55273b.getString(R.string.brv);
                    C89219l.m154716b(string2, "");
                    bVar2.mo38017a(string2);
                    bVar2.f55280a = 2131231215;
                    bVar2.f55285f = new View$OnClickListenerC72856b(this);
                } else if ((num.intValue() == 0 && i == -1) || i == 0) {
                    if (C36401a.m74099b()) {
                        String string3 = dVar.f55273b.getString(R.string.brs);
                        C89219l.m154716b(string3, "");
                        bVar2.mo38017a(string3);
                    } else {
                        String string4 = dVar.f55273b.getString(R.string.brt);
                        C89219l.m154716b(string4, "");
                        bVar2.mo38017a(string4);
                    }
                    bVar2.f55280a = 2131231214;
                    bVar2.f55285f = new View$OnClickListenerC72858c(this);
                }
                dVar.mo38015a(bVar2);
                i2 = 2;
            }
        }
        C75391j jVar4 = this.f163697k;
        if (jVar4 != null) {
            videoReplyStruct3 = jVar4.f169464s;
        }
        if (!m128658a(videoReplyStruct3)) {
            return i2;
        }
        C23322d.C23324b bVar3 = new C23322d.C23324b();
        String string5 = dVar.f55273b.getString(R.string.am2);
        C89219l.m154716b(string5, "");
        bVar3.mo38017a(string5);
        bVar3.f55280a = 2131232497;
        bVar3.f55285f = new View$OnClickListenerC72860d(this);
        dVar.mo38015a(bVar3);
        return i2 + 1;
    }

    /* renamed from: a */
    public final void mo115235a(int i, int i2) {
        if (i2 != 0) {
            new C23144b(this.f163696j).mo37635a(this.f163695i.getString(i)).mo37636b(i2).mo37637b();
        } else {
            new C23144b(this.f163696j).mo37635a(this.f163695i.getString(i)).mo37637b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return this.f163472l.mo115224a(j, i, f, f2);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f163472l.mo115225a(j, i, f, f2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72854a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar, AbstractC72926g gVar) {
        super(i, context, view, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163473m = gVar;
        this.f163472l = new C72862b(context, this, interactStickerStruct, jVar, gVar);
    }
}
