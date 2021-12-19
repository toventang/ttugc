package com.p2082ss.android.ugc.aweme.shortvideo.sticker.question;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72971d;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.c */
public final class C73091c extends AbstractC72946a {

    /* renamed from: a */
    private View f164026a;

    /* renamed from: l */
    private final C73093d f164027l;

    /* renamed from: m */
    private String f164028m;

    /* renamed from: n */
    private String f164029n;

    /* renamed from: o */
    private String f164030o;

    /* renamed from: p */
    private User f164031p;

    /* renamed from: q */
    private final AbstractC72926g f164032q;

    static {
        Covode.recordClassIndex(85798);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72924e
    /* renamed from: b */
    public final int mo115226b() {
        return 7;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: h */
    public final void mo115230h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: d */
    public final void mo115227d() {
        String str;
        String str2;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163697k;
        String str3 = null;
        if (jVar == null || (iVar3 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar3.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar2 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar2.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        C75391j jVar3 = this.f163697k;
        if (!(jVar3 == null || (iVar = jVar3.f169463r) == null)) {
            str3 = iVar.f169427a;
        }
        C33744d a3 = a2.mo59983a("enter_from", str3).mo59983a("question_id", this.f164028m).mo59983a("sticker_type", "question");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C39162r.m79460a("sticker_click", a3.mo59983a("user_id", g.getCurUserId()).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: e */
    public final View mo115228e() {
        MethodCollector.m26663i(7803);
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
        tuxTextView.setText(this.f163695i.getString(R.string.dc));
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f163695i);
        autoRTLImageView.setImageResource(R.drawable.b6n);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.m26664o(7803);
        return linearLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: f */
    public final void mo115229f() {
        String str;
        String str2;
        C75384i iVar;
        C75384i iVar2;
        C75384i iVar3;
        C33744d dVar = new C33744d();
        C75391j jVar = this.f163697k;
        String str3 = null;
        if (jVar == null || (iVar3 = jVar.f169463r) == null) {
            str = null;
        } else {
            str = iVar3.f169429c;
        }
        C33744d a = dVar.mo59983a("group_id", str);
        C75391j jVar2 = this.f163697k;
        if (jVar2 == null || (iVar2 = jVar2.f169463r) == null) {
            str2 = null;
        } else {
            str2 = iVar2.f169428b;
        }
        C33744d a2 = a.mo59983a("author_id", str2);
        C75391j jVar3 = this.f163697k;
        if (!(jVar3 == null || (iVar = jVar3.f169463r) == null)) {
            str3 = iVar.f169427a;
        }
        C33744d a3 = a2.mo59983a("enter_from", str3);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        C39162r.m79460a("click_question_bubble", a3.mo59983a("user_id", g.getCurUserId()).mo59983a("question_id", this.f164028m).mo59983a("question_user_id", this.f164030o).f79943a);
        C75391j jVar4 = this.f163697k;
        if (jVar4 != null) {
            VideoReplyStruct videoReplyStruct = jVar4.f169464s;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72923d
    /* renamed from: a */
    public final View mo115223a() {
        MethodCollector.m26663i(7654);
        if (C72890c.m128720a(this.f163695i)) {
            if (this.f164026a == null) {
                this.f164026a = new C72971d(this.f163695i);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f164026a;
                if (view == null) {
                    C89219l.m154715b();
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.f164026a;
                if (view2 != null) {
                    ((C72971d) view2).setPoints(this.f164027l.f164034a);
                    View view3 = this.f164026a;
                    if (view3 == null) {
                        C89219l.m154715b();
                    }
                    view3.postInvalidate();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CommonStickerFeedView");
                    MethodCollector.m26664o(7654);
                    throw nullPointerException;
                }
            }
            View view4 = this.f164026a;
            MethodCollector.m26664o(7654);
            return view4;
        }
        if (this.f164026a == null) {
            this.f164026a = new FrameLayout(this.f163695i);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view5 = this.f164026a;
            if (view5 != null) {
                view5.setLayoutParams(layoutParams2);
            }
        }
        View view6 = this.f164026a;
        MethodCollector.m26664o(7654);
        return view6;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.question.c$a */
    static final class View$OnClickListenerC73092a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73091c f164033a;

        static {
            Covode.recordClassIndex(85799);
        }

        View$OnClickListenerC73092a(C73091c cVar) {
            this.f164033a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164033a.mo115357n();
            this.f164033a.mo115229f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        super.mo115236a(jVar);
        this.f164027l.mo115236a(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a
    /* renamed from: a */
    public final int mo115233a(C23322d dVar) {
        int i;
        C89219l.m154721d(dVar, "");
        C75391j jVar = this.f163697k;
        if (jVar == null || jVar.f169464s == null) {
            return 0;
        }
        C23322d.C23324b bVar = new C23322d.C23324b();
        if (TextUtils.equals(C53438a.m98623b(), C15401f.f37600a)) {
            i = 2131232503;
        } else {
            i = 2131232502;
        }
        bVar.f55280a = i;
        String string = dVar.f55273b.getString(R.string.dc);
        C89219l.m154716b(string, "");
        bVar.mo38017a(string);
        bVar.f55285f = new View$OnClickListenerC73092a(this);
        dVar.mo38015a(bVar);
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f164027l.mo115225a(j, i, f, f2, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73091c(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C75391j jVar, AbstractC72926g gVar) {
        super(i, context, view, interactStickerStruct, jVar);
        VideoReplyStruct videoReplyStruct;
        User user;
        String str;
        String str2;
        long j;
        Long l;
        Long l2;
        String str3 = "";
        C89219l.m154721d(context, str3);
        C89219l.m154721d(view, str3);
        C89219l.m154721d(interactStickerStruct, str3);
        this.f164032q = gVar;
        this.f164027l = new C73093d(context, this, interactStickerStruct, jVar, gVar);
        String str4 = null;
        if (jVar != null) {
            videoReplyStruct = jVar.f169464s;
            user = jVar.f169448c;
        } else {
            videoReplyStruct = null;
            user = null;
        }
        this.f164031p = user;
        if (videoReplyStruct == null || videoReplyStruct.getAwemeId() == 0) {
            str = str3;
        } else {
            if (videoReplyStruct != null) {
                l2 = Long.valueOf(videoReplyStruct.getAwemeId());
            } else {
                l2 = null;
            }
            str = String.valueOf(l2);
        }
        this.f164029n = str;
        if (videoReplyStruct == null || videoReplyStruct.getCommentId() == 0) {
            str2 = str3;
        } else {
            if (videoReplyStruct != null) {
                l = Long.valueOf(videoReplyStruct.getCommentId());
            } else {
                l = null;
            }
            str2 = String.valueOf(l);
        }
        this.f164028m = str2;
        if (!C89219l.m154714a((jVar == null || (j = jVar.f169465t) == null) ? 0L : j, (Object) 0L)) {
            str3 = String.valueOf(jVar != null ? jVar.f169465t : str4);
        }
        this.f164030o = str3;
    }
}
