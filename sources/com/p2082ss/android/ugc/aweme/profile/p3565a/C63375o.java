package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.o */
public final class C63375o extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final TextView f143890a;

    /* renamed from: b */
    public final TextView f143891b;

    /* renamed from: c */
    public final TextView f143892c;

    /* renamed from: d */
    public final Context f143893d;

    static {
        Covode.recordClassIndex(74666);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.o$a */
    static final class View$OnClickListenerC63376a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C63375o f143894a;

        static {
            Covode.recordClassIndex(74667);
        }

        View$OnClickListenerC63376a(C63375o oVar) {
            this.f143894a = oVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            C89219l.m154721d("click_create_video", "");
            C89219l.m154721d(uuid, "");
            C33744d a = new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("enter_method", "click_create_video").mo59983a("shoot_way", "direct_shoot").mo59983a("creation_id", uuid);
            if (C63786o.m115353c()) {
                str = "set_up_profile";
            } else {
                str = "edit_profile";
            }
            C39162r.m79460a("shoot", a.mo59983a("btn_name", str).mo59980a("with_guidence", C63786o.f144583c ? 1 : 0).mo59983a("tab_name", C63786o.f144581a).f79943a);
            final RecordConfig.Builder translationType = new RecordConfig.Builder().creationId(uuid).shootWay("direct_shoot").groupId(C59213ah.f134853b).enterFrom(C59213ah.f134852a).fromMain(true).startRecordTime(System.currentTimeMillis()).musicType(1).translationType(3);
            AVExternalServiceImpl.m113114a().asyncService(this.f143894a.f143893d, "direct_shoot", new SimpleServiceLoadCallback(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63375o.View$OnClickListenerC63376a.C633771 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC63376a f143895a;

                static {
                    Covode.recordClassIndex(74668);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                }

                {
                    this.f143895a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    C89219l.m154721d(asyncAVService, "");
                    asyncAVService.uiService().recordService().startRecord(this.f143895a.f143894a.f143893d, translationType.build());
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63375o(View view, Context context) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(context, "");
        this.f143893d = context;
        View findViewById = view.findViewById(R.id.dz_);
        C89219l.m154716b(findViewById, "");
        this.f143890a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dza);
        C89219l.m154716b(findViewById2, "");
        this.f143891b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ag6);
        C89219l.m154716b(findViewById3, "");
        this.f143892c = (TextView) findViewById3;
        C63786o.f144583c = true;
    }
}
