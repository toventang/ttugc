package com.p2082ss.android.ugc.aweme.story.interaction.cell;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77297c;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77302g;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell */
public final class ReactionBubbleEmojiCell extends BaseReactionBubbleCell<C77297c> {

    /* renamed from: a */
    public static final C77326a f173485a = new C77326a((byte) 0);

    /* renamed from: b */
    private SmartImageView f173486b;

    /* renamed from: j */
    private TuxIconView f173487j;

    /* renamed from: k */
    private TuxTextView f173488k;

    static {
        Covode.recordClassIndex(90347);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell$a */
    public static final class C77326a {
        static {
            Covode.recordClassIndex(90348);
        }

        private C77326a() {
        }

        public /* synthetic */ C77326a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell$c */
    static final class View$OnClickListenerC77328c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleEmojiCell f173490a;

        /* renamed from: b */
        final /* synthetic */ C77297c f173491b;

        static {
            Covode.recordClassIndex(90350);
        }

        View$OnClickListenerC77328c(ReactionBubbleEmojiCell reactionBubbleEmojiCell, C77297c cVar) {
            this.f173490a = reactionBubbleEmojiCell;
            this.f173491b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f173490a.mo120914a(this.f173491b.f173411a, this.f173491b.f173413c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubbleEmojiCell$b */
    static final class C77327b extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C77327b f173489a = new C77327b();

        static {
            Covode.recordClassIndex(90349);
        }

        C77327b() {
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

    /* renamed from: a */
    private final void m135218a(List<Integer> list) {
        TuxIconView tuxIconView = this.f173487j;
        if (tuxIconView == null) {
            C89219l.m154710a("iconIv");
        }
        tuxIconView.setVisibility(8);
        TuxTextView tuxTextView = this.f173488k;
        if (tuxTextView == null) {
            C89219l.m154710a("emojiTv");
        }
        tuxTextView.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(StoryEmojiReactionView.C46659a.m90064a(num.intValue()));
        }
        TuxTextView tuxTextView2 = this.f173488k;
        if (tuxTextView2 == null) {
            C89219l.m154710a("emojiTv");
        }
        tuxTextView2.setText(sb.toString());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        MethodCollector.m26663i(3443);
        C89219l.m154721d(viewGroup, "");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.b1n, null);
        View findViewById = inflate.findViewById(R.id.o3);
        C89219l.m154716b(findViewById, "");
        this.f173486b = (SmartImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bh7);
        C89219l.m154716b(findViewById2, "");
        this.f173487j = (TuxIconView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.au6);
        C89219l.m154716b(findViewById3, "");
        this.f173488k = (TuxTextView) findViewById3;
        C89219l.m154716b(inflate, "");
        inflate.setVisibility(4);
        MethodCollector.m26664o(3443);
        return inflate;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(AbstractC17641a aVar) {
        String str;
        C77297c cVar = (C77297c) aVar;
        C89219l.m154721d(cVar, "");
        super.mo23350a((AbstractC17641a) cVar);
        SmartImageView smartImageView = this.f173486b;
        if (smartImageView == null) {
            C89219l.m154710a("avatarIv");
        } else {
            C23008e a = C23009f.m43397a(C77327b.f173489a);
            Context context = smartImageView.getContext();
            C89219l.m154716b(context, "");
            smartImageView.setBackground(a.mo37389a(context));
        }
        C20766v a2 = C20761r.m39060a(C34735v.m70965a(cVar.f173411a.getAvatarThumb())).mo34179a("ReactionBubbleCommentCell");
        SmartImageView smartImageView2 = this.f173486b;
        if (smartImageView2 == null) {
            C89219l.m154710a("avatarIv");
        }
        a2.f49092E = smartImageView2;
        a2.f49126w = m135213a();
        a2.f49106c = true;
        a2.mo34186c();
        SmartImageView smartImageView3 = this.f173486b;
        if (smartImageView3 == null) {
            C89219l.m154710a("avatarIv");
        }
        smartImageView3.setOnClickListener(new View$OnClickListenerC77328c(this, cVar));
        TuxIconView tuxIconView = this.f173487j;
        if (tuxIconView == null) {
            C89219l.m154710a("iconIv");
        }
        tuxIconView.setVisibility(8);
        TuxTextView tuxTextView = this.f173488k;
        if (tuxTextView == null) {
            C89219l.m154710a("emojiTv");
        }
        tuxTextView.setVisibility(8);
        List<Integer> list = cVar.f173412b;
        String str2 = "emoji_react";
        if (list.size() == 1) {
            int intValue = list.get(0).intValue();
            if (intValue == 1001 || intValue == 1002) {
                TuxIconView tuxIconView2 = this.f173487j;
                if (tuxIconView2 == null) {
                    C89219l.m154710a("iconIv");
                }
                tuxIconView2.setVisibility(0);
                TuxTextView tuxTextView2 = this.f173488k;
                if (tuxTextView2 == null) {
                    C89219l.m154710a("emojiTv");
                }
                tuxTextView2.setVisibility(8);
                if (intValue == 1001) {
                    str2 = "like";
                } else {
                    str2 = "";
                    if (intValue == 1002) {
                        str2 = "view";
                    }
                }
                TuxIconView tuxIconView3 = this.f173487j;
                if (tuxIconView3 == null) {
                    C89219l.m154710a("iconIv");
                } else if (intValue == 1001) {
                    tuxIconView3.setIconRes(R.raw.icon_color_like_circle);
                } else if (intValue == 1002) {
                    tuxIconView3.setIconRes(R.raw.icon_color_view_circle);
                }
            } else {
                m135218a(list);
            }
        } else {
            m135218a(list);
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setVisibility(4);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view2.setTag(0);
        C89378p[] pVarArr = new C89378p[3];
        C77302g gVar = cVar.f173413c;
        if (gVar != null) {
            str = gVar.f173420b;
        } else {
            str = null;
        }
        pVarArr[0] = C89387v.m154943a(str, "enter_from");
        pVarArr[1] = C89387v.m154943a(str2, "notice_type");
        pVarArr[2] = C89387v.m154943a(cVar.f173411a.getUid(), "from_user_id");
        C39162r.m79462a("interaction_bullet_show", pVarArr);
    }
}
