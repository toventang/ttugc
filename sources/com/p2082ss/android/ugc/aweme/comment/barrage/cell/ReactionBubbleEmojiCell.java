package com.p2082ss.android.ugc.aweme.comment.barrage.cell;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36308c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Set;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleEmojiCell */
public final class ReactionBubbleEmojiCell extends PowerCell<C36308c> {

    /* renamed from: a */
    public static final C36336a f85900a = new C36336a((byte) 0);

    /* renamed from: b */
    private SmartImageView f85901b;

    /* renamed from: j */
    private TuxIconView f85902j;

    /* renamed from: k */
    private TuxTextView f85903k;

    /* renamed from: l */
    private C36308c f85904l;

    static {
        Covode.recordClassIndex(43615);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleEmojiCell$a */
    public static final class C36336a {
        static {
            Covode.recordClassIndex(43616);
        }

        private C36336a() {
        }

        public /* synthetic */ C36336a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final String m74049a() {
        C36308c cVar = this.f85904l;
        if (cVar != null) {
            return cVar.f85834e + '_' + cVar.f85830a.getUid();
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
        C36308c cVar = this.f85904l;
        if (cVar != null && (aVar = cVar.f85832c) != null && (set = aVar.f85814g) != null && !set.contains(m74049a())) {
            set.add(m74049a());
            C36308c cVar2 = this.f85904l;
            if (cVar2 != null) {
                C89378p[] pVarArr = new C89378p[4];
                C36296a aVar2 = cVar2.f85832c;
                String str2 = null;
                if (aVar2 != null) {
                    str = aVar2.f85809b;
                } else {
                    str = null;
                }
                pVarArr[0] = C89387v.m154943a(str, "enter_from");
                C36296a aVar3 = cVar2.f85832c;
                if (aVar3 != null) {
                    str2 = aVar3.f85812e;
                }
                pVarArr[1] = C89387v.m154943a(str2, "story_type");
                pVarArr[2] = C89387v.m154943a("like", "notice_type");
                pVarArr[3] = C89387v.m154943a(cVar2.f85830a.getUid(), "from_user_id");
                C39162r.m79462a("interaction_bullet_show", pVarArr);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleEmojiCell$b */
    static final class C36337b extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C36337b f85905a = new C36337b();

        static {
            Covode.recordClassIndex(43617);
        }

        C36337b() {
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        MethodCollector.m26663i(9729);
        C89219l.m154721d(viewGroup, "");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.hz, null);
        View findViewById = inflate.findViewById(R.id.o3);
        C89219l.m154716b(findViewById, "");
        this.f85901b = (SmartImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bh7);
        C89219l.m154716b(findViewById2, "");
        this.f85902j = (TuxIconView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.au6);
        C89219l.m154716b(findViewById3, "");
        this.f85903k = (TuxTextView) findViewById3;
        C89219l.m154716b(inflate, "");
        inflate.setVisibility(4);
        MethodCollector.m26664o(9729);
        return inflate;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleEmojiCell$c */
    static final class View$OnClickListenerC36338c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleEmojiCell f85906a;

        /* renamed from: b */
        final /* synthetic */ C36308c f85907b;

        static {
            Covode.recordClassIndex(43618);
        }

        View$OnClickListenerC36338c(ReactionBubbleEmojiCell reactionBubbleEmojiCell, C36308c cVar) {
            this.f85906a = reactionBubbleEmojiCell;
            this.f85907b = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            ReactionBubbleEmojiCell reactionBubbleEmojiCell = this.f85906a;
            User user = this.f85907b.f85830a;
            C36296a aVar = this.f85907b.f85832c;
            if (aVar != null) {
                C59252q f = new C59252q().mo96749g(aVar.f85808a);
                String str3 = aVar.f85809b;
                if (str3 == null) {
                    str3 = "";
                }
                C59252q qVar = (C59252q) f.mo96825o(str3).mo96741a("click_head");
                qVar.f135223W = aVar.f85812e;
                qVar.f135285Y = "bullet";
                qVar.f135286Z = "bullet";
                qVar.f135222V = aVar.f85811d;
                qVar.mo96792f();
            }
            C89378p[] pVarArr = new C89378p[4];
            Aweme aweme = null;
            if (aVar != null) {
                str = aVar.f85809b;
            } else {
                str = null;
            }
            pVarArr[0] = C89387v.m154943a(str, "enter_from");
            pVarArr[1] = C89387v.m154943a("like", "notice_type");
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
            View view2 = reactionBubbleEmojiCell.itemView;
            C89219l.m154716b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36308c cVar) {
        int intValue;
        C36308c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        super.mo23350a((AbstractC17641a) cVar2);
        SmartImageView smartImageView = this.f85901b;
        if (smartImageView == null) {
            C89219l.m154710a("avatarIv");
        }
        C23008e a = C23009f.m43397a(C36337b.f85905a);
        Context context = smartImageView.getContext();
        C89219l.m154716b(context, "");
        smartImageView.setBackground(a.mo37389a(context));
        C20766v a2 = C20761r.m39060a(C34735v.m70965a(cVar2.f85830a.getAvatarThumb())).mo34179a("ReactionBubbleCommentCell");
        SmartImageView smartImageView2 = this.f85901b;
        if (smartImageView2 == null) {
            C89219l.m154710a("avatarIv");
        }
        a2.f49092E = smartImageView2;
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48957a = true;
        C20745e a3 = aVar.mo34169a();
        C89219l.m154716b(a3, "");
        a2.f49126w = a3;
        a2.f49106c = true;
        a2.mo34186c();
        SmartImageView smartImageView3 = this.f85901b;
        if (smartImageView3 == null) {
            C89219l.m154710a("avatarIv");
        }
        smartImageView3.setOnClickListener(new View$OnClickListenerC36338c(this, cVar2));
        this.f85904l = cVar2;
        TuxIconView tuxIconView = this.f85902j;
        if (tuxIconView == null) {
            C89219l.m154710a("iconIv");
        }
        tuxIconView.setVisibility(8);
        TuxTextView tuxTextView = this.f85903k;
        if (tuxTextView == null) {
            C89219l.m154710a("emojiTv");
        }
        tuxTextView.setVisibility(8);
        List<Integer> list = cVar2.f85831b;
        if (list.size() == 1 && ((intValue = list.get(0).intValue()) == 1001 || intValue == 1002)) {
            TuxIconView tuxIconView2 = this.f85902j;
            if (tuxIconView2 == null) {
                C89219l.m154710a("iconIv");
            }
            tuxIconView2.setVisibility(0);
            TuxTextView tuxTextView2 = this.f85903k;
            if (tuxTextView2 == null) {
                C89219l.m154710a("emojiTv");
            }
            tuxTextView2.setVisibility(8);
            TuxIconView tuxIconView3 = this.f85902j;
            if (tuxIconView3 == null) {
                C89219l.m154710a("iconIv");
            } else if (intValue == 1001) {
                tuxIconView3.setIconRes(R.raw.icon_color_like_circle);
            } else if (intValue == 1002) {
                tuxIconView3.setIconRes(R.raw.icon_color_view_circle);
            }
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setVisibility(4);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view2.setTag(0);
    }
}
