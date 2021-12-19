package com.p2082ss.android.ugc.aweme.comment.barrage.cell;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.C36301c;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36307b;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.BubbleDescView;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.BubbleMultiTagLayout;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentBubbleMultiAnchorView;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.CommentBubbleTaggedPeopleView;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.HollowTextView;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36386b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.feed.widget.C50506a;
import com.p2082ss.android.ugc.aweme.feed.widget.C50516i;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell */
public final class ReactionBubbleDescriptionCell extends PowerCell<C36307b> {

    /* renamed from: a */
    public static final C36330a f85883a = new C36330a((byte) 0);

    /* renamed from: b */
    private SmartImageView f85884b;

    /* renamed from: j */
    private TuxTextView f85885j;

    /* renamed from: k */
    private TuxTextView f85886k;

    /* renamed from: l */
    private BubbleDescView f85887l;

    /* renamed from: m */
    private HollowTextView f85888m;

    /* renamed from: n */
    private CommentBubbleTaggedPeopleView f85889n;

    /* renamed from: o */
    private CommentBubbleMultiAnchorView f85890o;

    /* renamed from: p */
    private C36307b f85891p;

    static {
        Covode.recordClassIndex(43608);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell$a */
    public static final class C36330a {
        static {
            Covode.recordClassIndex(43609);
        }

        private C36330a() {
        }

        public /* synthetic */ C36330a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: m */
    public final void mo28074m() {
        super.mo28074m();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell$b */
    static final class C36331b extends AbstractC89220m implements AbstractC89171a {

        /* renamed from: a */
        public static final C36331b f85892a = new C36331b();

        static {
            Covode.recordClassIndex(43610);
        }

        C36331b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            AbstractC81915c.m141874a(new C36386b("bubble_desc_click_faker_cid", false));
            return null;
        }
    }

    /* renamed from: a */
    private final String m74042a() {
        C36307b bVar = this.f85891p;
        if (bVar != null) {
            return bVar.f85834e + '_' + bVar.f85826a.getUid();
        }
        return "";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        C36296a aVar;
        Set<String> set;
        String str;
        String authorUid;
        String str2;
        String str3;
        super.mo28073l();
        C36307b bVar = this.f85891p;
        if (bVar != null && (aVar = bVar.f85829d) != null && (set = aVar.f85814g) != null && !set.contains(m74042a())) {
            set.add(m74042a());
            C36307b bVar2 = this.f85891p;
            String str4 = null;
            if (bVar2 != null) {
                C89378p[] pVarArr = new C89378p[4];
                C36296a aVar2 = bVar2.f85829d;
                if (aVar2 != null) {
                    str2 = aVar2.f85809b;
                } else {
                    str2 = null;
                }
                pVarArr[0] = C89387v.m154943a(str2, "enter_from");
                C36296a aVar3 = bVar2.f85829d;
                if (aVar3 != null) {
                    str3 = aVar3.f85812e;
                } else {
                    str3 = null;
                }
                pVarArr[1] = C89387v.m154943a(str3, "story_type");
                pVarArr[2] = C89387v.m154943a("creator", "notice_type");
                pVarArr[3] = C89387v.m154943a(bVar2.f85826a.getUid(), "from_user_id");
                C39162r.m79462a("interaction_bullet_show", pVarArr);
            }
            CommentBubbleTaggedPeopleView commentBubbleTaggedPeopleView = this.f85889n;
            if (commentBubbleTaggedPeopleView != null) {
                C33744d dVar = new C33744d();
                C36296a aVar4 = commentBubbleTaggedPeopleView.f86003c;
                if (aVar4 != null) {
                    str4 = aVar4.f85809b;
                }
                C33744d a = dVar.mo59983a("enter_from", str4);
                Aweme aweme = commentBubbleTaggedPeopleView.f86002b;
                String str5 = "";
                if (aweme == null || (str = aweme.getAid()) == null) {
                    str = str5;
                }
                C33744d a2 = a.mo59983a("group_id", str);
                Aweme aweme2 = commentBubbleTaggedPeopleView.f86002b;
                if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
                    str5 = authorUid;
                }
                C39162r.m79460a("tag_anchor_show", a2.mo59983a("author_id", str5).mo59983a("anchor_type", "low_interest").f79943a);
            }
            CommentBubbleMultiAnchorView commentBubbleMultiAnchorView = this.f85890o;
            if (commentBubbleMultiAnchorView != null) {
                BubbleMultiTagLayout bubbleMultiTagLayout = commentBubbleMultiAnchorView.f85998a;
                bubbleMultiTagLayout.f85991a.mo61335a(bubbleMultiTagLayout);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell$c */
    static final class View$OnClickListenerC36332c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleDescriptionCell f85893a;

        /* renamed from: b */
        final /* synthetic */ C36307b f85894b;

        static {
            Covode.recordClassIndex(43611);
        }

        View$OnClickListenerC36332c(ReactionBubbleDescriptionCell reactionBubbleDescriptionCell, C36307b bVar) {
            this.f85893a = reactionBubbleDescriptionCell;
            this.f85894b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC81915c.m141874a(new C36386b("bubble_desc_click_faker_cid", false));
            ReactionBubbleDescriptionCell.m74043a(this.f85894b.f85826a, this.f85894b.f85829d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell$d */
    static final class View$OnClickListenerC36333d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleDescriptionCell f85895a;

        /* renamed from: b */
        final /* synthetic */ C36307b f85896b;

        static {
            Covode.recordClassIndex(43612);
        }

        View$OnClickListenerC36333d(ReactionBubbleDescriptionCell reactionBubbleDescriptionCell, C36307b bVar) {
            this.f85895a = reactionBubbleDescriptionCell;
            this.f85896b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85895a.mo63571b(this.f85896b.f85826a, this.f85896b.f85829d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell$e */
    static final class View$OnClickListenerC36334e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleDescriptionCell f85897a;

        /* renamed from: b */
        final /* synthetic */ C36307b f85898b;

        static {
            Covode.recordClassIndex(43613);
        }

        View$OnClickListenerC36334e(ReactionBubbleDescriptionCell reactionBubbleDescriptionCell, C36307b bVar) {
            this.f85897a = reactionBubbleDescriptionCell;
            this.f85898b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85897a.mo63571b(this.f85898b.f85826a, this.f85898b.f85829d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell$f */
    static final class C36335f extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f85899a;

        static {
            Covode.recordClassIndex(43614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36335f(View view) {
            super(1);
            this.f85899a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            View view = this.f85899a;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            eVar2.f54462a = Integer.valueOf(context.getResources().getColor(R.color.ap));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf((float) C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics())));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        MethodCollector.m26663i(10217);
        C89219l.m154721d(viewGroup, "");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.jh, null);
        C89219l.m154716b(inflate, "");
        C23008e a = C23009f.m43397a(new C36335f(inflate));
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        inflate.setBackground(a.mo37389a(context));
        this.f85884b = (SmartImageView) inflate.findViewById(R.id.o3);
        this.f85885j = (TuxTextView) inflate.findViewById(R.id.cpk);
        this.f85886k = (TuxTextView) inflate.findViewById(R.id.ehq);
        this.f85887l = (BubbleDescView) inflate.findViewById(R.id.ajh);
        this.f85888m = (HollowTextView) inflate.findViewById(R.id.dv);
        this.f85889n = (CommentBubbleTaggedPeopleView) inflate.findViewById(R.id.zj);
        this.f85890o = (CommentBubbleMultiAnchorView) inflate.findViewById(R.id.cmx);
        MethodCollector.m26664o(10217);
        return inflate;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36307b bVar) {
        String d;
        int i;
        List<InteractionTagUserInfo> taggedUsers;
        List<InteractionTagUserInfo> taggedUsers2;
        String str;
        AwemeTextLabelModel label;
        boolean z;
        String a;
        C36307b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        super.mo23350a((AbstractC17641a) bVar2);
        C20766v a2 = C20761r.m39060a(C34735v.m70965a(bVar2.f85826a.getAvatarThumb())).mo34179a("ReactionBubblePublishCell");
        a2.f49092E = this.f85884b;
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48957a = true;
        C20745e a3 = aVar.mo34169a();
        C89219l.m154716b(a3, "");
        a2.f49126w = a3;
        a2.f49106c = true;
        a2.mo34186c();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C89393b.m154951c(view);
        TuxTextView tuxTextView = this.f85885j;
        if (tuxTextView != null) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            tuxTextView.setTextColor(C0643b.m2378c(view2.getContext(), R.color.ac));
        }
        TuxTextView tuxTextView2 = this.f85885j;
        if (tuxTextView2 != null) {
            C17191a.C17192a aVar2 = new C17191a.C17192a();
            String uniqueId = bVar2.f85826a.getUniqueId();
            C89219l.m154716b(uniqueId, "");
            tuxTextView2.setText(aVar2.mo27177a(uniqueId).f40973a);
        }
        long j = bVar2.f85828c;
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        if (instance.getTimeInMillis() - j <= 0) {
            Calendar instance2 = Calendar.getInstance();
            C89219l.m154716b(instance2, "");
            j = instance2.getTimeInMillis() - 1;
        }
        if (C16048b.m29633a().mo25421a(true, "standardize_timestamp", false)) {
            C80187aa.C80188a aVar3 = C80187aa.f179656s;
            d = C80187aa.C80188a.m139006a(j);
        } else {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            d = C80566ib.m139654d(view3.getContext(), j);
        }
        TuxTextView tuxTextView3 = this.f85886k;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(new C17191a.C17192a().mo27177a(" · ".concat(String.valueOf(d))).f40973a);
        }
        BubbleDescView bubbleDescView = this.f85887l;
        if (bubbleDescView != null) {
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            bubbleDescView.setTextColor(Integer.valueOf(C0643b.m2378c(view4.getContext(), R.color.a9)));
        }
        BubbleDescView bubbleDescView2 = this.f85887l;
        if (bubbleDescView2 != null) {
            bubbleDescView2.setMMaxLinesWhenFold(2);
        }
        this.f85891p = bVar2;
        BubbleDescView bubbleDescView3 = this.f85887l;
        if (bubbleDescView3 != null) {
            bubbleDescView3.setSpanClickInterceptor(C36331b.f85892a);
        }
        BubbleDescView bubbleDescView4 = this.f85887l;
        if (bubbleDescView4 != null) {
            Aweme aweme = bVar2.f85827b;
            C36296a aVar4 = bVar2.f85829d;
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            String string = view5.getContext().getString(R.string.bnr);
            C89219l.m154716b(string, "");
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(string, "");
            bubbleDescView4.f85978a = aweme;
            bubbleDescView4.f85979b = aVar4;
            String desc = aweme.getDesc();
            if (desc == null || desc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a = C89361p.m154869a(string, " ", " ", false);
            } else {
                String desc2 = aweme.getDesc();
                C89219l.m154716b(desc2, "");
                a = C89361p.m154869a(desc2, " ", " ", false);
            }
            SpannableStringBuilder append = new SpannableStringBuilder(a).append((CharSequence) bubbleDescView4.mo63612a(aweme));
            if (!TextUtils.isEmpty(append)) {
                bubbleDescView4.setText(append);
                bubbleDescView4.setVisibility(0);
                C46579b.m89899a(bubbleDescView4);
            } else {
                bubbleDescView4.setVisibility(8);
            }
            Integer num = bubbleDescView4.f85980c;
            if (num != null) {
                bubbleDescView4.setTextColor(num.intValue());
            }
            bubbleDescView4.setSpanColor(bubbleDescView4.getCurrentTextColor());
            bubbleDescView4.setOnSpanClickListener(new BubbleDescView.C36361c(bubbleDescView4));
            bubbleDescView4.setSpanColor(bubbleDescView4.getCurrentTextColor());
            if (!(bubbleDescView4.getContext() == null || bubbleDescView4.f85978a == null)) {
                bubbleDescView4.setTextExtraList(bubbleDescView4.f85978a);
                try {
                    if (C80471gb.m139483a(bubbleDescView4.getContext())) {
                        bubbleDescView4.setMovementMethod(C50516i.m94696a());
                    } else {
                        bubbleDescView4.setMovementMethod(C50506a.m94687a());
                    }
                } catch (IndexOutOfBoundsException e) {
                    C51423a.m95788a("", e);
                }
                Aweme aweme2 = bubbleDescView4.f85978a;
                if (aweme2 == null) {
                    C89219l.m154715b();
                }
                bubbleDescView4.getViewTreeObserver().addOnGlobalLayoutListener(new BubbleDescView.ViewTreeObserver$OnGlobalLayoutListenerC36360b(bubbleDescView4, bubbleDescView4, aweme2));
            }
        }
        this.itemView.setOnClickListener(new View$OnClickListenerC36332c(this, bVar2));
        SmartImageView smartImageView = this.f85884b;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new View$OnClickListenerC36333d(this, bVar2));
        }
        TuxTextView tuxTextView4 = this.f85885j;
        if (tuxTextView4 != null) {
            tuxTextView4.setOnClickListener(new View$OnClickListenerC36334e(this, bVar2));
        }
        View view6 = this.itemView;
        C89219l.m154716b(view6, "");
        view6.setTag(2);
        Aweme aweme3 = bVar2.f85827b;
        HollowTextView hollowTextView = this.f85888m;
        C89219l.m154721d(aweme3, "");
        InteractionTagUserInfo interactionTagUserInfo = null;
        if (hollowTextView != null) {
            if (C36301c.m73998a(aweme3)) {
                AwemeRawAd awemeRawAd = aweme3.getAwemeRawAd();
                if (awemeRawAd == null || (label = awemeRawAd.getLabel()) == null || (str = label.getLabelName()) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    C89393b.m154951c(hollowTextView);
                    hollowTextView.setText(str);
                } else {
                    C89393b.m154949a(hollowTextView);
                }
            } else {
                C89393b.m154949a(hollowTextView);
            }
        }
        CommentBubbleTaggedPeopleView commentBubbleTaggedPeopleView = this.f85889n;
        if (commentBubbleTaggedPeopleView != null) {
            Aweme aweme4 = bVar2.f85827b;
            C36296a aVar5 = bVar2.f85829d;
            commentBubbleTaggedPeopleView.f86002b = aweme4;
            commentBubbleTaggedPeopleView.f86003c = aVar5;
            if (aweme4 != null) {
                InteractionTagInfo interactionTagInfo = aweme4.getInteractionTagInfo();
                if (!(interactionTagInfo == null || (taggedUsers2 = interactionTagInfo.getTaggedUsers()) == null)) {
                    interactionTagUserInfo = (InteractionTagUserInfo) C89070n.m154583g((List) taggedUsers2);
                }
                InteractionTagInfo interactionTagInfo2 = aweme4.getInteractionTagInfo();
                if (interactionTagInfo2 == null || (taggedUsers = interactionTagInfo2.getTaggedUsers()) == null) {
                    i = 0;
                } else {
                    i = taggedUsers.size();
                }
                if (interactionTagUserInfo != null) {
                    C89393b.m154951c(commentBubbleTaggedPeopleView);
                    if (i > 1) {
                        TuxTextView tuxTextView5 = commentBubbleTaggedPeopleView.f86001a;
                        Context context = commentBubbleTaggedPeopleView.getContext();
                        C89219l.m154716b(context, "");
                        String string2 = context.getResources().getString(R.string.g9y);
                        C89219l.m154716b(string2, "");
                        String a4 = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{"", Integer.valueOf(i)}, 2));
                        C89219l.m154716b(a4, "");
                        tuxTextView5.setText(a4);
                    } else {
                        commentBubbleTaggedPeopleView.f86001a.setText(interactionTagUserInfo.getUniqueId());
                    }
                    commentBubbleTaggedPeopleView.setOnClickListener(new CommentBubbleTaggedPeopleView.View$OnClickListenerC36367a(commentBubbleTaggedPeopleView, aVar5, aweme4));
                }
            }
            C89393b.m154949a(commentBubbleTaggedPeopleView);
        }
        CommentBubbleMultiAnchorView commentBubbleMultiAnchorView = this.f85890o;
        if (commentBubbleMultiAnchorView != null) {
            commentBubbleMultiAnchorView.mo63631a(bVar2.f85827b);
        }
    }

    /* renamed from: a */
    public static void m74043a(User user, C36296a aVar) {
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
        if (aVar != null) {
            aweme = aVar.f85808a;
        }
        if (C76706a.m134278d(aweme)) {
            str2 = "story";
        } else {
            str2 = UGCMonitor.TYPE_POST;
        }
        pVarArr[1] = C89387v.m154943a(str2, "story_type");
        pVarArr[2] = C89387v.m154943a("creator", "notice_type");
        pVarArr[3] = C89387v.m154943a(user.getUid(), "from_user_id");
        C39162r.m79462a("interaction_bullet_click", pVarArr);
    }

    /* renamed from: b */
    public final void mo63571b(User user, C36296a aVar) {
        if (aVar != null) {
            C59252q f = new C59252q().mo96749g(aVar.f85808a);
            String str = aVar.f85809b;
            if (str == null) {
                str = "";
            }
            C59252q qVar = (C59252q) f.mo96825o(str).mo96741a("click_head");
            qVar.f135223W = aVar.f85812e;
            qVar.f135285Y = "bullet";
            qVar.f135286Z = "bullet";
            qVar.f135222V = aVar.f85811d;
            qVar.mo96792f();
        }
        m74043a(user, aVar);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
    }
}
