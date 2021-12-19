package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a */
public abstract class AbstractC39751a extends AbstractC39771b {
    static {
        Covode.recordClassIndex(47480);
    }

    /* renamed from: a */
    public abstract void mo69114a(Context context);

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a$a */
    static final class C39752a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39751a f93601a;

        /* renamed from: b */
        final /* synthetic */ C39723h f93602b;

        static {
            Covode.recordClassIndex(47481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39752a(AbstractC39751a aVar, C39723h hVar) {
            super(0);
            this.f93601a = aVar;
            this.f93602b = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39256o e = this.f93601a.mo69120e();
            View view = this.f93602b.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C39699a.m80584a(e, context);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a$b */
    static final class View$OnClickListenerC39753b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC39751a f93603a;

        /* renamed from: b */
        final /* synthetic */ C39723h f93604b;

        static {
            Covode.recordClassIndex(47482);
        }

        View$OnClickListenerC39753b(AbstractC39751a aVar, C39723h hVar) {
            this.f93603a = aVar;
            this.f93604b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39256o e = this.f93603a.mo69120e();
            View view2 = this.f93604b.itemView;
            C89219l.m154716b(view2, "");
            Context context = view2.getContext();
            C89219l.m154716b(context, "");
            if (C39699a.m80584a(e, context)) {
                AbstractC39751a aVar = this.f93603a;
                C89219l.m154716b(view, "");
                Context context2 = view.getContext();
                C89219l.m154716b(context2, "");
                aVar.mo69114a(context2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public void mo69095a(C39723h hVar, int i) {
        C89219l.m154721d(hVar, "");
        super.mo69095a(hVar, i);
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bqp);
        if (!(tuxTextCell.getAccessory() instanceof AbstractC23293c.C23302f)) {
            C89219l.m154716b(tuxTextCell, "");
            Context context = tuxTextCell.getContext();
            C89219l.m154716b(context, "");
            tuxTextCell.setAccessory(new AbstractC23293c.C23302f(context));
        }
        AbstractC23293c.AbstractC23296b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
        AbstractC23293c.C23302f fVar = (AbstractC23293c.C23302f) accessory;
        fVar.f55218a = new C39752a(this, hVar);
        fVar.mo37962a(new View$OnClickListenerC39753b(this, hVar));
    }
}
