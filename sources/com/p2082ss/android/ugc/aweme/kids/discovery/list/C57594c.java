package com.p2082ss.android.ugc.aweme.kids.discovery.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57539b;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57561c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.c */
public final class C57594c extends RecyclerView.ViewHolder {

    /* renamed from: d */
    static final IReportAwemeManager f131477d = ReportAwemeManager.m104144a();

    /* renamed from: e */
    public static final C57595a f131478e = new C57595a((byte) 0);

    /* renamed from: a */
    public C57590a f131479a;

    /* renamed from: b */
    final Context f131480b;

    /* renamed from: c */
    public boolean f131481c = true;

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.c$a */
    public static final class C57595a {
        static {
            Covode.recordClassIndex(67553);
        }

        private C57595a() {
        }

        public /* synthetic */ C57595a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(67552);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.c$b */
    static final class View$OnClickListenerC57596b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57594c f131482a;

        /* renamed from: b */
        final /* synthetic */ C57561c f131483b;

        static {
            Covode.recordClassIndex(67554);
        }

        View$OnClickListenerC57596b(C57594c cVar, C57561c cVar2) {
            this.f131482a = cVar;
            this.f131483b = cVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f131483b.f131401a != null) {
                C57594c cVar = this.f131482a;
                C57561c cVar2 = this.f131483b;
                C57355f.m103962a("click_view_more_category", new C33743c().mo59976a("enter_from", "discovery").mo59976a("exit_method", "click_see_more").mo59976a("category_id", cVar2.f131401a).mo59977a());
                View view2 = cVar.itemView;
                C89219l.m154716b(view2, "");
                SmartRouter.buildRoute(view2.getContext(), "//kids/discovery/gallery").withParam("title", cVar2.f131402b).withParam("challenge_id", cVar2.f131401a).withParam("feed_type", cVar2.f131403c).withParam("mob_enter_from", "click_see_more").open();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57594c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Context context = view2.getContext();
        C89219l.m154716b(context, "");
        this.f131480b = context;
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        Context context2 = view3.getContext();
        C89219l.m154716b(context2, "");
        int color = context2.getResources().getColor(R.color.l);
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        RecyclerView recyclerView = (RecyclerView) view4.findViewById(R.id.dof);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        View view6 = this.itemView;
        C89219l.m154716b(view6, "");
        ((RecyclerView) view5.findViewById(R.id.dof)).mo4402a(new C57539b(color, (int) C13628n.m24520b(view6.getContext(), 1.0f)));
    }
}
