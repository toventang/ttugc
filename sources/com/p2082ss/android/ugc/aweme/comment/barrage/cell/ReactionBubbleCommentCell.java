package com.p2082ss.android.ugc.aweme.comment.barrage.cell;

import android.content.Context;
import android.content.res.Resources;
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
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36306a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Set;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell */
public final class ReactionBubbleCommentCell extends PowerCell<C36306a> {

    /* renamed from: a */
    public static final C36326a f85869a = new C36326a((byte) 0);

    /* renamed from: b */
    private SmartImageView f85870b;

    /* renamed from: j */
    private TuxTextView f85871j;

    /* renamed from: k */
    private TuxTextView f85872k;

    /* renamed from: l */
    private TuxIconView f85873l;

    /* renamed from: m */
    private TuxTextView f85874m;

    /* renamed from: n */
    private C36306a f85875n;

    static {
        Covode.recordClassIndex(43603);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell$a */
    public static final class C36326a {
        static {
            Covode.recordClassIndex(43604);
        }

        private C36326a() {
        }

        public /* synthetic */ C36326a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final String m74036a() {
        C36306a aVar = this.f85875n;
        if (aVar != null) {
            return aVar.f85834e + '_' + aVar.f85823a.getCid();
        }
        return "";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        C36296a aVar;
        Set<String> set;
        String str;
        super.mo28073l();
        C36306a aVar2 = this.f85875n;
        if (aVar2 != null && (aVar = aVar2.f85825c) != null && (set = aVar.f85814g) != null && !set.contains(m74036a())) {
            set.add(m74036a());
            C36306a aVar3 = this.f85875n;
            if (aVar3 != null) {
                C89378p[] pVarArr = new C89378p[4];
                C36296a aVar4 = aVar3.f85825c;
                String str2 = null;
                if (aVar4 != null) {
                    str = aVar4.f85812e;
                } else {
                    str = null;
                }
                pVarArr[0] = C89387v.m154943a(str, "story_type");
                C36296a aVar5 = aVar3.f85825c;
                if (aVar5 != null) {
                    str2 = aVar5.f85809b;
                }
                pVarArr[1] = C89387v.m154943a(str2, "enter_from");
                pVarArr[2] = C89387v.m154943a(UGCMonitor.EVENT_COMMENT, "notice_type");
                User user = aVar3.f85823a.getUser();
                C89219l.m154716b(user, "");
                pVarArr[3] = C89387v.m154943a(user.getUid(), "from_user_id");
                C39162r.m79462a("interaction_bullet_show", pVarArr);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell$d */
    static final class C36329d extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C36329d f85882a = new C36329d();

        static {
            Covode.recordClassIndex(43607);
        }

        C36329d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.a5);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf((float) C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell$b */
    static final class View$OnClickListenerC36327b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleCommentCell f85876a;

        /* renamed from: b */
        final /* synthetic */ Comment f85877b;

        /* renamed from: c */
        final /* synthetic */ C36306a f85878c;

        static {
            Covode.recordClassIndex(43605);
        }

        View$OnClickListenerC36327b(ReactionBubbleCommentCell reactionBubbleCommentCell, Comment comment, C36306a aVar) {
            this.f85876a = reactionBubbleCommentCell;
            this.f85877b = comment;
            this.f85878c = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
            if (com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(new com.p2082ss.android.ugc.aweme.comment.p2489c.C36386b(r0)) == null) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r4)
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r3.f85877b
                java.lang.String r0 = r0.getCid()
                java.lang.String r2 = ""
                if (r0 == 0) goto L_0x0021
                com.ss.android.ugc.aweme.comment.c.b r1 = new com.ss.android.ugc.aweme.comment.c.b
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r3.f85877b
                java.lang.String r0 = r0.getCid()
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
                r1.<init>(r0)
                com.ss.android.ugc.d.a.b r0 = com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r1)
                if (r0 != 0) goto L_0x0032
            L_0x0021:
                com.ss.android.ugc.aweme.comment.c.b r1 = new com.ss.android.ugc.aweme.comment.c.b
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r3.f85877b
                java.lang.String r0 = r0.getFakeId()
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
                r1.<init>(r0)
                com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r1)
            L_0x0032:
                com.ss.android.ugc.aweme.comment.model.Comment r0 = r3.f85877b
                com.ss.android.ugc.aweme.profile.model.User r1 = r0.getUser()
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r2)
                com.ss.android.ugc.aweme.comment.barrage.b.a r0 = r3.f85878c
                com.ss.android.ugc.aweme.comment.barrage.a r0 = r0.f85825c
                com.p2082ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell.m74037a(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell.View$OnClickListenerC36327b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleCommentCell$c */
    static final class View$OnClickListenerC36328c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleCommentCell f85879a;

        /* renamed from: b */
        final /* synthetic */ Comment f85880b;

        /* renamed from: c */
        final /* synthetic */ C36306a f85881c;

        static {
            Covode.recordClassIndex(43606);
        }

        View$OnClickListenerC36328c(ReactionBubbleCommentCell reactionBubbleCommentCell, Comment comment, C36306a aVar) {
            this.f85879a = reactionBubbleCommentCell;
            this.f85880b = comment;
            this.f85881c = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ReactionBubbleCommentCell reactionBubbleCommentCell = this.f85879a;
            User user = this.f85880b.getUser();
            C89219l.m154716b(user, "");
            C36296a aVar = this.f85881c.f85825c;
            if (aVar != null) {
                C59252q f = new C59252q().mo96749g(aVar.f85808a);
                String str = aVar.f85809b;
                if (str == null) {
                    str = "";
                }
                C59252q qVar = (C59252q) f.mo96825o(str).mo96741a("click_head");
                qVar.f135285Y = "bullet";
                qVar.f135223W = aVar.f85812e;
                qVar.f135286Z = "bullet";
                qVar.f135222V = aVar.f85811d;
                qVar.mo96792f();
            }
            ReactionBubbleCommentCell.m74037a(user, aVar);
            View view2 = reactionBubbleCommentCell.itemView;
            C89219l.m154716b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
        }
    }

    /* renamed from: a */
    private final void m74038a(boolean z) {
        TextPaint paint;
        float f;
        TextPaint paint2;
        TextPaint paint3;
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        if (z) {
            TuxTextView tuxTextView = this.f85871j;
            float f2 = 0.0f;
            if (tuxTextView == null || (paint3 = tuxTextView.getPaint()) == null) {
                f = 0.0f;
            } else {
                TuxTextView tuxTextView2 = this.f85871j;
                if (tuxTextView2 != null) {
                    charSequence = tuxTextView2.getText();
                } else {
                    charSequence = null;
                }
                f = paint3.measureText(String.valueOf(charSequence));
            }
            TuxTextView tuxTextView3 = this.f85874m;
            if (!(tuxTextView3 == null || (paint2 = tuxTextView3.getPaint()) == null)) {
                TuxTextView tuxTextView4 = this.f85874m;
                if (tuxTextView4 != null) {
                    charSequence2 = tuxTextView4.getText();
                }
                f2 = paint2.measureText(String.valueOf(charSequence2));
            }
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            if (f + f2 > ((float) C89241a.m154730a(TypedValue.applyDimension(1, 220.0f, system.getDisplayMetrics())))) {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                if (f2 < ((float) C89241a.m154730a(TypedValue.applyDimension(1, 60.0f, system2.getDisplayMetrics())))) {
                    TuxTextView tuxTextView5 = this.f85871j;
                    if (tuxTextView5 != null) {
                        Resources system3 = Resources.getSystem();
                        C89219l.m154709a((Object) system3, "");
                        tuxTextView5.setMaxWidth((int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, 220.0f, system3.getDisplayMetrics()))) - f2));
                        return;
                    }
                    return;
                }
                TuxTextView tuxTextView6 = this.f85871j;
                if (tuxTextView6 != null) {
                    Resources system4 = Resources.getSystem();
                    C89219l.m154709a((Object) system4, "");
                    tuxTextView6.setMaxWidth(C89241a.m154730a(TypedValue.applyDimension(1, 160.0f, system4.getDisplayMetrics())));
                }
                TuxTextView tuxTextView7 = this.f85874m;
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
        TuxTextView tuxTextView8 = this.f85871j;
        if (!(tuxTextView8 == null || (paint = tuxTextView8.getPaint()) == null)) {
            TuxTextView tuxTextView9 = this.f85871j;
            if (tuxTextView9 != null) {
                charSequence2 = tuxTextView9.getText();
            }
            paint.measureText(String.valueOf(charSequence2));
        }
        TuxTextView tuxTextView10 = this.f85871j;
        if (tuxTextView10 != null) {
            Resources system6 = Resources.getSystem();
            C89219l.m154709a((Object) system6, "");
            tuxTextView10.setMaxWidth(C89241a.m154730a(TypedValue.applyDimension(1, 236.0f, system6.getDisplayMetrics())));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.jg, viewGroup, false);
        C89219l.m154716b(a, "");
        C23008e a2 = C23009f.m43397a(C36329d.f85882a);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        a.setBackground(a2.mo37389a(context));
        this.f85870b = (SmartImageView) a.findViewById(R.id.o3);
        this.f85871j = (TuxTextView) a.findViewById(R.id.cpk);
        this.f85872k = (TuxTextView) a.findViewById(R.id.ajg);
        this.f85873l = (TuxIconView) a.findViewById(R.id.dhu);
        this.f85874m = (TuxTextView) a.findViewById(R.id.dhv);
        a.setVisibility(4);
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36306a aVar) {
        String text;
        C36306a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        super.mo23350a((AbstractC17641a) aVar2);
        Comment comment = aVar2.f85823a;
        User user = comment.getUser();
        C89219l.m154716b(user, "");
        C20766v a = C20761r.m39060a(C34735v.m70965a(user.getAvatarThumb())).mo34179a("ReactionBubbleCommentCell");
        a.f49092E = this.f85870b;
        C20745e.C20746a aVar3 = new C20745e.C20746a();
        aVar3.f48957a = true;
        C20745e a2 = aVar3.mo34169a();
        C89219l.m154716b(a2, "");
        a.f49126w = a2;
        a.f49106c = true;
        a.mo34186c();
        this.f85875n = aVar2;
        this.itemView.setOnClickListener(new View$OnClickListenerC36327b(this, comment, aVar2));
        SmartImageView smartImageView = this.f85870b;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new View$OnClickListenerC36328c(this, comment, aVar2));
        }
        TuxTextView tuxTextView = this.f85871j;
        if (tuxTextView != null) {
            User user2 = comment.getUser();
            C89219l.m154716b(user2, "");
            tuxTextView.setText(user2.getUniqueId());
        }
        if (comment.getAliasAweme() != null) {
            StringBuilder sb = new StringBuilder("[");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            text = sb.append(view.getContext().getString(R.string.bnt)).append(']').toString();
        } else {
            text = comment.getText();
        }
        TuxTextView tuxTextView2 = this.f85872k;
        if (tuxTextView2 != null) {
            C17191a.C17192a aVar4 = new C17191a.C17192a();
            C89219l.m154716b(text, "");
            tuxTextView2.setText(aVar4.mo27177a(text).f40973a);
        }
        if (TextUtils.isEmpty(comment.getReplyToUserName())) {
            TuxIconView tuxIconView = this.f85873l;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TuxTextView tuxTextView3 = this.f85874m;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(8);
            }
            m74038a(false);
        } else {
            TuxIconView tuxIconView2 = this.f85873l;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
            TuxTextView tuxTextView4 = this.f85874m;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(0);
            }
            TuxTextView tuxTextView5 = this.f85874m;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(comment.getReplyToUserName());
            }
            m74038a(true);
        }
        if (aVar2.f85824b) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view2.setVisibility(0);
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            view3.setTag(1);
            return;
        }
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        view4.setVisibility(4);
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        view5.setTag(0);
    }

    /* renamed from: a */
    public static void m74037a(User user, C36296a aVar) {
        String str;
        String str2;
        C89378p[] pVarArr = new C89378p[4];
        Aweme aweme = null;
        if (aVar != null) {
            str = aVar.f85809b;
        } else {
            str = null;
        }
        pVarArr[0] = C89387v.m154943a(str, "enter_from");
        pVarArr[1] = C89387v.m154943a(UGCMonitor.EVENT_COMMENT, "notice_type");
        if (aVar != null) {
            aweme = aVar.f85808a;
        }
        if (C76706a.m134278d(aweme)) {
            str2 = "story";
        } else {
            str2 = UGCMonitor.TYPE_POST;
        }
        pVarArr[2] = C89387v.m154943a(str2, "story_type");
        pVarArr[3] = C89387v.m154943a(user.getUid(), "from_user_id");
        C39162r.m79462a("interaction_bullet_click", pVarArr);
    }
}
