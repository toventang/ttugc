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
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77301f;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubblePublishCell */
public final class ReactionBubblePublishCell extends BaseReactionBubbleCell<C77301f> {

    /* renamed from: b */
    public static final C77329a f173492b = new C77329a((byte) 0);

    /* renamed from: a */
    public SmartImageView f173493a;

    /* renamed from: j */
    private TuxTextView f173494j;

    /* renamed from: k */
    private TuxTextView f173495k;

    /* renamed from: l */
    private TuxTextView f173496l;

    static {
        Covode.recordClassIndex(90351);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubblePublishCell$a */
    public static final class C77329a {
        static {
            Covode.recordClassIndex(90352);
        }

        private C77329a() {
        }

        public /* synthetic */ C77329a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubblePublishCell$b */
    static final class View$OnClickListenerC77330b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionBubblePublishCell f173497a;

        /* renamed from: b */
        final /* synthetic */ C77301f f173498b;

        static {
            Covode.recordClassIndex(90353);
        }

        View$OnClickListenerC77330b(ReactionBubblePublishCell reactionBubblePublishCell, C77301f fVar) {
            this.f173497a = reactionBubblePublishCell;
            this.f173498b = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f173497a.mo120914a(this.f173498b.f173416a, this.f173498b.f173418c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.interaction.cell.ReactionBubblePublishCell$c */
    static final class C77331c extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C77331c f173499a = new C77331c();

        static {
            Covode.recordClassIndex(90354);
        }

        C77331c() {
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
        MethodCollector.m26663i(3652);
        C89219l.m154721d(viewGroup, "");
        View inflate = View.inflate(viewGroup.getContext(), R.layout.b1q, null);
        C89219l.m154716b(inflate, "");
        C23008e a = C23009f.m43397a(C77331c.f173499a);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        inflate.setBackground(a.mo37389a(context));
        this.f173493a = (SmartImageView) inflate.findViewById(R.id.o3);
        this.f173494j = (TuxTextView) inflate.findViewById(R.id.cpk);
        this.f173495k = (TuxTextView) inflate.findViewById(R.id.ehq);
        this.f173496l = (TuxTextView) inflate.findViewById(R.id.ajg);
        MethodCollector.m26664o(3652);
        return inflate;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(AbstractC17641a aVar) {
        String d;
        C77301f fVar = (C77301f) aVar;
        C89219l.m154721d(fVar, "");
        super.mo23350a((AbstractC17641a) fVar);
        C20766v a = C20761r.m39060a(C34735v.m70965a(fVar.f173416a.getAvatarThumb())).mo34179a("ReactionBubblePublishCell");
        a.f49092E = this.f173493a;
        a.f49126w = m135213a();
        a.f49106c = true;
        a.mo34186c();
        TuxTextView tuxTextView = this.f173494j;
        if (tuxTextView != null) {
            C17191a.C17192a aVar2 = new C17191a.C17192a();
            String uniqueId = fVar.f173416a.getUniqueId();
            C89219l.m154716b(uniqueId, "");
            tuxTextView.setText(aVar2.mo27177a(uniqueId).f40973a);
        }
        long j = fVar.f173417b;
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
            View view = this.itemView;
            C89219l.m154716b(view, "");
            d = C80566ib.m139654d(view.getContext(), j);
        }
        TuxTextView tuxTextView2 = this.f173495k;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(new C17191a.C17192a().mo27177a(" · ".concat(String.valueOf(d))).f40973a);
        }
        SmartImageView smartImageView = this.f173493a;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new View$OnClickListenerC77330b(this, fVar));
        }
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view2.setTag(2);
    }
}
