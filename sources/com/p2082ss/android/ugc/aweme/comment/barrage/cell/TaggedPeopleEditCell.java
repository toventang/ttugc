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
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36305b;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36312f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleEditCell */
public final class TaggedPeopleEditCell extends PowerCell<C36312f> {

    /* renamed from: a */
    public static final C36341a f85913a = new C36341a((byte) 0);

    /* renamed from: b */
    private SmartImageView f85914b;

    static {
        Covode.recordClassIndex(43622);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleEditCell$a */
    public static final class C36341a {
        static {
            Covode.recordClassIndex(43623);
        }

        private C36341a() {
        }

        public /* synthetic */ C36341a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.jo, viewGroup, false);
        this.f85914b = (SmartImageView) a.findViewById(R.id.o3);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.cell.TaggedPeopleEditCell$b */
    static final class View$OnClickListenerC36342b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36312f f85915a;

        static {
            Covode.recordClassIndex(43624);
        }

        View$OnClickListenerC36342b(C36312f fVar) {
            this.f85915a = fVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            C33744d dVar = new C33744d();
            C36305b bVar = this.f85915a.f85839b;
            String str4 = "";
            if (bVar == null || (str = bVar.enterFrom) == null) {
                str = str4;
            }
            C33744d a = dVar.mo59983a("enter_from", str);
            C36305b bVar2 = this.f85915a.f85839b;
            if (bVar2 == null || (str2 = bVar2.awemeId) == null) {
                str2 = str4;
            }
            C33744d a2 = a.mo59983a("group_id", str2);
            C36305b bVar3 = this.f85915a.f85839b;
            if (!(bVar3 == null || (str3 = bVar3.authorUid) == null)) {
                str4 = str3;
            }
            C39162r.m79460a("click_tagged_user", a2.mo59983a("author_id", str4).mo59983a("click_type", "click_edit").mo59983a("anchor_type", "low_interest").f79943a);
            DataCenter dataCenter = this.f85915a.f85838a;
            if (dataCenter != null) {
                dataCenter.mo60191a("TAGGED_PEOPLE_ACTION", (Object) 2);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C36312f fVar) {
        C36312f fVar2 = fVar;
        C89219l.m154721d(fVar2, "");
        super.mo23350a((AbstractC17641a) fVar2);
        C20766v a = C20761r.m39056a(2131231229).mo34179a("TaggedPeopleActionCell");
        a.f49092E = this.f85914b;
        a.mo34186c();
        this.itemView.setOnClickListener(new View$OnClickListenerC36342b(fVar2));
    }
}
