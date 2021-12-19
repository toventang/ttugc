package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.SearchEffect;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67509az;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c */
public final class C41759c extends RecyclerView.ViewHolder {

    /* renamed from: f */
    public static final C41760a f97420f = new C41760a((byte) 0);

    /* renamed from: a */
    public final TextView f97421a;

    /* renamed from: b */
    public final TextView f97422b;

    /* renamed from: c */
    public final TextView f97423c;

    /* renamed from: d */
    public final SmartRoundImageView f97424d;

    /* renamed from: e */
    public final FrameLayout f97425e;

    static {
        Covode.recordClassIndex(49674);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$a */
    public static final class C41760a {
        static {
            Covode.recordClassIndex(49675);
        }

        private C41760a() {
        }

        public /* synthetic */ C41760a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$b */
    public static final class View$OnClickListenerC41761b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41759c f97426a;

        /* renamed from: b */
        final /* synthetic */ SearchEffect f97427b;

        static {
            Covode.recordClassIndex(49676);
        }

        public View$OnClickListenerC41761b(C41759c cVar, SearchEffect searchEffect) {
            this.f97426a = cVar;
            this.f97427b = searchEffect;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("enter_prop_detail", new C33744d().mo59983a("enter_method", "general_search_aladdin_multiple").mo59983a("enter_from", "search_result").mo59983a("prop_id", this.f97427b.mo72276id()).f79943a);
            View view2 = this.f97426a.itemView;
            C89219l.m154716b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "//stickers/detail/" + this.f97427b.mo72276id()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$c */
    public static final class View$OnClickListenerC41762c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41759c f97428a;

        /* renamed from: b */
        final /* synthetic */ SearchEffect f97429b;

        static {
            Covode.recordClassIndex(49677);
        }

        public View$OnClickListenerC41762c(C41759c cVar, SearchEffect searchEffect) {
            this.f97428a = cVar;
            this.f97429b = searchEffect;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            final RecordConfig.Builder enterFrom = new RecordConfig.Builder().sticker(this.f97429b.mo72276id()).creationId(uuid).enterFrom("search_result");
            IExternalService a = AVExternalServiceImpl.m113114a();
            View view2 = this.f97428a.itemView;
            C89219l.m154716b(view2, "");
            Context context = view2.getContext();
            C89219l.m154716b(context, "");
            a.asyncService(context, "prop_page", new IExternalService.ServiceLoadCallback(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41759c.View$OnClickListenerC41762c.C417631 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC41762c f97430a;

                static {
                    Covode.recordClassIndex(49678);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                {
                    this.f97430a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    C89219l.m154721d(asyncAVService, "");
                    IRecordService recordService = asyncAVService.uiService().recordService();
                    View view = this.f97430a.f97428a.itemView;
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    recordService.startRecord(context, enterFrom.build());
                }
            });
            ((C67509az) new C67509az().mo106460p("click_prop_publish").mo106459o("search_result")).mo106447t("prop_page").mo106448u("prop_page").mo106446s(this.f97429b.mo72276id()).mo106445r(uuid).mo96792f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41759c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.title);
        C89219l.m154716b(findViewById, "");
        this.f97421a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.f_3);
        C89219l.m154716b(findViewById2, "");
        this.f97422b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ajd);
        C89219l.m154716b(findViewById3, "");
        this.f97423c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.afn);
        C89219l.m154716b(findViewById4, "");
        this.f97424d = (SmartRoundImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.a0q);
        C89219l.m154716b(findViewById5, "");
        this.f97425e = (FrameLayout) findViewById5;
    }
}
