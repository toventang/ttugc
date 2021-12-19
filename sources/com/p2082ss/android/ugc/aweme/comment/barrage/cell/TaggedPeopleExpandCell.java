package com.p2082ss.android.ugc.aweme.comment.barrage.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36313g;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleExpandCell */
public final class TaggedPeopleExpandCell extends PowerCell<C36313g> {

    /* renamed from: a */
    public static final C36343a f85916a = new C36343a((byte) 0);

    /* renamed from: b */
    private TuxTextView f85917b;

    static {
        Covode.recordClassIndex(43625);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleExpandCell$a */
    public static final class C36343a {
        static {
            Covode.recordClassIndex(43626);
        }

        private C36343a() {
        }

        public /* synthetic */ C36343a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleExpandCell$b */
    static final class View$OnClickListenerC36344b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36313g f85918a;

        static {
            Covode.recordClassIndex(43627);
        }

        View$OnClickListenerC36344b(C36313g gVar) {
            this.f85918a = gVar;
        }

        public final void onClick(View view) {
            DataCenter dataCenter;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200) && (dataCenter = this.f85918a.f85842c) != null) {
                dataCenter.mo60191a("TAGGED_PEOPLE_ACTION", (Object) 4);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.jq, viewGroup, false);
        this.f85917b = (TuxTextView) a.findViewById(R.id.axt);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36313g gVar) {
        C36313g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        super.mo23350a((AbstractC17641a) gVar2);
        TuxTextView tuxTextView = this.f85917b;
        if (tuxTextView != null) {
            C89393b.m154951c(tuxTextView);
        }
        String str = "+" + ((gVar2.f85840a - gVar2.f85841b) + 2);
        TuxTextView tuxTextView2 = this.f85917b;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(str);
        }
        this.itemView.setOnClickListener(new View$OnClickListenerC36344b(gVar2));
    }
}
