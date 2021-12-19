package com.p2082ss.android.ugc.aweme.comment.barrage.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36314h;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleFoldCell */
public final class TaggedPeopleFoldCell extends PowerCell<C36314h> {

    /* renamed from: a */
    public static final C36345a f85919a = new C36345a((byte) 0);

    /* renamed from: b */
    private SmartImageView f85920b;

    static {
        Covode.recordClassIndex(43628);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleFoldCell$a */
    public static final class C36345a {
        static {
            Covode.recordClassIndex(43629);
        }

        private C36345a() {
        }

        public /* synthetic */ C36345a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleFoldCell$b */
    static final class View$OnClickListenerC36346b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36314h f85921a;

        static {
            Covode.recordClassIndex(43630);
        }

        View$OnClickListenerC36346b(C36314h hVar) {
            this.f85921a = hVar;
        }

        public final void onClick(View view) {
            DataCenter dataCenter;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200) && (dataCenter = this.f85921a.f85843a) != null) {
                dataCenter.mo60191a("TAGGED_PEOPLE_ACTION", (Object) 3);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.jo, viewGroup, false);
        this.f85920b = (SmartImageView) a.findViewById(R.id.o3);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36314h hVar) {
        C36314h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        super.mo23350a((AbstractC17641a) hVar2);
        C20766v a = C20761r.m39056a(2131231230).mo34179a("TaggedPeopleActionCell");
        a.f49092E = this.f85920b;
        a.mo34186c();
        this.itemView.setOnClickListener(new View$OnClickListenerC36346b(hVar2));
    }
}
