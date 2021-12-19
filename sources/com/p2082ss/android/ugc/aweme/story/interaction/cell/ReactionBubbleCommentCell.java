package com.p2082ss.android.ugc.aweme.story.interaction.cell;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77295a;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77302g;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76594d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell */
public final class ReactionBubbleCommentCell extends BaseReactionBubbleCell<C77295a> {

    /* renamed from: a */
    public static final C77322a f173473a = new C77322a((byte) 0);

    /* renamed from: b */
    private SmartImageView f173474b;

    /* renamed from: j */
    private TuxTextView f173475j;

    /* renamed from: k */
    private TuxTextView f173476k;

    /* renamed from: l */
    private TuxIconView f173477l;

    /* renamed from: m */
    private TuxTextView f173478m;

    static {
        Covode.recordClassIndex(90342);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell$a */
    public static final class C77322a {
        static {
            Covode.recordClassIndex(90343);
        }

        private C77322a() {
        }

        public /* synthetic */ C77322a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell$c */
    static final class View$OnClickListenerC77324c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleCommentCell f173481a;

        /* renamed from: b */
        final /* synthetic */ Comment f173482b;

        /* renamed from: c */
        final /* synthetic */ C77295a f173483c;

        static {
            Covode.recordClassIndex(90345);
        }

        View$OnClickListenerC77324c(ReactionBubbleCommentCell reactionBubbleCommentCell, Comment comment, C77295a aVar) {
            this.f173481a = reactionBubbleCommentCell;
            this.f173482b = comment;
            this.f173483c = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ReactionBubbleCommentCell reactionBubbleCommentCell = this.f173481a;
            User user = this.f173482b.getUser();
            C89219l.m154716b(user, "");
            reactionBubbleCommentCell.mo120914a(user, this.f173483c.f173410c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell$b */
    static final class View$OnClickListenerC77323b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleCommentCell f173479a;

        /* renamed from: b */
        final /* synthetic */ Comment f173480b;

        static {
            Covode.recordClassIndex(90344);
        }

        View$OnClickListenerC77323b(ReactionBubbleCommentCell reactionBubbleCommentCell, Comment comment) {
            this.f173479a = reactionBubbleCommentCell;
            this.f173480b = comment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f173480b.getCid() != null) {
                String cid = this.f173480b.getCid();
                C89219l.m154716b(cid, "");
                if (AbstractC81915c.m141874a(new C76594d(cid)) != null) {
                    return;
                }
            }
            String fakeId = this.f173480b.getFakeId();
            C89219l.m154716b(fakeId, "");
            AbstractC81915c.m141874a(new C76594d(fakeId));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleCommentCell$d */
    static final class C77325d extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C77325d f173484a = new C77325d();

        static {
            Covode.recordClassIndex(90346);
        }

        C77325d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = Integer.valueOf(Color.parseColor("#80545454"));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf((float) C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b1m, viewGroup, false);
        C89219l.m154716b(a, "");
        C23008e a2 = C23009f.m43397a(C77325d.f173484a);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        a.setBackground(a2.mo37389a(context));
        this.f173474b = (SmartImageView) a.findViewById(R.id.o3);
        this.f173475j = (TuxTextView) a.findViewById(R.id.cpk);
        this.f173476k = (TuxTextView) a.findViewById(R.id.ajg);
        this.f173477l = (TuxIconView) a.findViewById(R.id.dhu);
        this.f173478m = (TuxTextView) a.findViewById(R.id.dhv);
        a.setVisibility(4);
        return a;
    }

    /* renamed from: a */
    private final void m135215a(boolean z) {
        float f;
        TextPaint paint;
        TextPaint paint2;
        CharSequence charSequence;
        if (z) {
            TuxTextView tuxTextView = this.f173475j;
            CharSequence charSequence2 = null;
            float f2 = 0.0f;
            if (tuxTextView == null || (paint2 = tuxTextView.getPaint()) == null) {
                f = 0.0f;
            } else {
                TuxTextView tuxTextView2 = this.f173475j;
                if (tuxTextView2 != null) {
                    charSequence = tuxTextView2.getText();
                } else {
                    charSequence = null;
                }
                f = paint2.measureText(String.valueOf(charSequence));
            }
            TuxTextView tuxTextView3 = this.f173478m;
            if (!(tuxTextView3 == null || (paint = tuxTextView3.getPaint()) == null)) {
                TuxTextView tuxTextView4 = this.f173478m;
                if (tuxTextView4 != null) {
                    charSequence2 = tuxTextView4.getText();
                }
                f2 = paint.measureText(String.valueOf(charSequence2));
            }
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            if (f + f2 > ((float) C89241a.m154730a(TypedValue.applyDimension(1, 220.0f, system.getDisplayMetrics())))) {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                if (f2 < ((float) C89241a.m154730a(TypedValue.applyDimension(1, 60.0f, system2.getDisplayMetrics())))) {
                    TuxTextView tuxTextView5 = this.f173475j;
                    if (tuxTextView5 != null) {
                        Resources system3 = Resources.getSystem();
                        C89219l.m154709a((Object) system3, "");
                        tuxTextView5.setMaxWidth((int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, 220.0f, system3.getDisplayMetrics()))) - f2));
                        return;
                    }
                    return;
                }
                TuxTextView tuxTextView6 = this.f173475j;
                if (tuxTextView6 != null) {
                    Resources system4 = Resources.getSystem();
                    C89219l.m154709a((Object) system4, "");
                    tuxTextView6.setMaxWidth(C89241a.m154730a(TypedValue.applyDimension(1, 160.0f, system4.getDisplayMetrics())));
                }
                TuxTextView tuxTextView7 = this.f173478m;
                if (tuxTextView7 != null) {
                    Resources system5 = Resources.getSystem();
                    C89219l.m154709a((Object) system5, "");
                    tuxTextView7.setMaxWidth(C89241a.m154730a(TypedValue.applyDimension(1, 60.0f, system5.getDisplayMetrics())));
                    return;
                }
                return;
            }
            return;
        }
        TuxTextView tuxTextView8 = this.f173475j;
        if (tuxTextView8 != null) {
            Resources system6 = Resources.getSystem();
            C89219l.m154709a((Object) system6, "");
            tuxTextView8.setMaxWidth(C89241a.m154730a(TypedValue.applyDimension(1, 236.0f, system6.getDisplayMetrics())));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(AbstractC17641a aVar) {
        String str;
        C77295a aVar2 = (C77295a) aVar;
        C89219l.m154721d(aVar2, "");
        super.mo23350a((AbstractC17641a) aVar2);
        Comment comment = aVar2.f173408a;
        User user = comment.getUser();
        C89219l.m154716b(user, "");
        C20766v a = C20761r.m39060a(C34735v.m70965a(user.getAvatarThumb())).mo34179a("ReactionBubbleCommentCell");
        a.f49092E = this.f173474b;
        a.f49126w = m135213a();
        a.f49106c = true;
        a.mo34186c();
        this.itemView.setOnClickListener(new View$OnClickListenerC77323b(this, comment));
        SmartImageView smartImageView = this.f173474b;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new View$OnClickListenerC77324c(this, comment, aVar2));
        }
        TuxTextView tuxTextView = this.f173475j;
        if (tuxTextView != null) {
            User user2 = comment.getUser();
            C89219l.m154716b(user2, "");
            tuxTextView.setText(user2.getUniqueId());
        }
        TuxTextView tuxTextView2 = this.f173476k;
        if (tuxTextView2 != null) {
            C17191a.C17192a aVar3 = new C17191a.C17192a();
            String text = comment.getText();
            C89219l.m154716b(text, "");
            tuxTextView2.setText(aVar3.mo27177a(text).f40973a);
        }
        if (TextUtils.isEmpty(comment.getReplyToUserName())) {
            TuxIconView tuxIconView = this.f173477l;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(4);
            }
            TuxTextView tuxTextView3 = this.f173478m;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(4);
            }
            m135215a(false);
        } else {
            TuxIconView tuxIconView2 = this.f173477l;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
            TuxTextView tuxTextView4 = this.f173478m;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
            TuxTextView tuxTextView5 = this.f173478m;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(comment.getReplyToUserName());
            }
            m135215a(true);
        }
        if (aVar2.f173409b) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(0);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view2.setTag(1);
        } else {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            view3.setVisibility(4);
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            view4.setTag(0);
        }
        C89378p[] pVarArr = new C89378p[3];
        C77302g gVar = aVar2.f173410c;
        if (gVar != null) {
            str = gVar.f173420b;
        } else {
            str = null;
        }
        pVarArr[0] = C89387v.m154943a(str, "enter_from");
        pVarArr[1] = C89387v.m154943a(UGCMonitor.EVENT_COMMENT, "notice_type");
        User user3 = comment.getUser();
        C89219l.m154716b(user3, "");
        pVarArr[2] = C89387v.m154943a(user3.getUid(), "from_user_id");
        C39162r.m79462a("interaction_bullet_show", pVarArr);
    }
}
