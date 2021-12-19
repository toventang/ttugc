package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import com.p2082ss.android.ugc.aweme.scheduler.PublishService;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bm */
public final class C73514bm {

    /* renamed from: a */
    public static final C73514bm f165158a = new C73514bm();

    private C73514bm() {
    }

    static {
        Covode.recordClassIndex(86251);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bm$b */
    public static final class DialogInterface$OnClickListenerC73517b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f165161a;

        /* renamed from: b */
        final /* synthetic */ C43223c f165162b;

        static {
            Covode.recordClassIndex(86254);
        }

        DialogInterface$OnClickListenerC73517b(ActivityC0945e eVar, C43223c cVar) {
            this.f165161a = eVar;
            this.f165162b = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C65682o.m117574a(this.f165161a, this.f165162b);
            C84425b bVar = new C84425b();
            bVar.mo129406a("enter_from", "homepage_hot");
            bVar.mo129406a("action_type", "1");
            if (this.f165162b.f100900W.f100788aU != null && C89219l.m154714a((Object) this.f165162b.f100900W.f100788aU.getShoutOutsMode(), (Object) C74418d.MODE_SEND) && !TextUtils.isEmpty(this.f165162b.f100900W.f100788aU.getOrderId())) {
                bVar.mo129406a("order_id", this.f165162b.f100900W.f100788aU.getOrderId());
            }
            C39162r.m79460a("upload_failed_pop_up_response", bVar.f188764a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bm$a */
    public static final class DialogInterface$OnClickListenerC73515a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43223c f165159a;

        static {
            Covode.recordClassIndex(86252);
        }

        DialogInterface$OnClickListenerC73515a(C43223c cVar) {
            this.f165159a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C1731i.m5640b(new Callable(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73514bm.DialogInterface$OnClickListenerC73515a.CallableC735161 */

                /* renamed from: a */
                final /* synthetic */ DialogInterface$OnClickListenerC73515a f165160a;

                static {
                    Covode.recordClassIndex(86253);
                }

                {
                    this.f165160a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    AVServiceImpl.m113116a().draftService().delete(this.f165160a.f165159a);
                    return C89391z.f203057a;
                }
            }, C1731i.f5562a);
            if (C68747m.m121180a()) {
                C63244g.m114602a().mo73287o().mo104793m().mo104828c(this.f165159a.mo73726r());
            } else {
                C63244g.m114602a().mo73287o().mo104793m().mo104825a(null);
            }
            PublishService.C67284a.m119208a();
            C84911q.m145928d("Publish | remove recover path by dismiss panel so");
            C84425b bVar = new C84425b();
            bVar.mo129406a("enter_from", "homepage_hot");
            bVar.mo129406a("action_type", "0");
            if (this.f165159a.f100900W.f100788aU != null && C89219l.m154714a((Object) this.f165159a.f100900W.f100788aU.getShoutOutsMode(), (Object) C74418d.MODE_SEND) && !TextUtils.isEmpty(this.f165159a.f100900W.f100788aU.getOrderId())) {
                bVar.mo129406a("order_id", this.f165159a.f100900W.f100788aU.getOrderId());
            }
            C39162r.m79460a("upload_failed_pop_up_response", bVar.f188764a);
        }
    }

    /* renamed from: a */
    public static final Dialog m129648a(ActivityC0945e eVar, C43223c cVar) {
        int i;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C17197a.C17200a aVar = new C17197a.C17200a(eVar);
        if (C89219l.m154714a((Object) C74418d.MODE_SEND, (Object) cVar.f100900W.f100788aU.getShoutOutsMode())) {
            i = R.string.fvu;
        } else {
            i = R.string.h3g;
        }
        C84425b bVar = new C84425b();
        bVar.mo129406a("enter_from", "homepage_hot");
        if (cVar.f100900W.f100788aU != null && C89219l.m154714a((Object) cVar.f100900W.f100788aU.getShoutOutsMode(), (Object) C74418d.MODE_SEND) && !TextUtils.isEmpty(cVar.f100900W.f100788aU.getOrderId())) {
            bVar.mo129406a("order_id", cVar.f100900W.f100788aU.getOrderId());
        }
        C39162r.m79460a("show_upload_failed_pop_up", bVar.f188764a);
        C17197a.C17200a a = aVar.mo27189a(i);
        a.f41067M = false;
        Dialog c = a.mo27194b(R.string.h3f).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73515a(cVar), false).mo27190a(R.string.fc6, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC73517b(eVar, cVar), false).mo27193a().mo27185c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: a */
    public static final AbstractC73762p m129649a(ActivityC0945e eVar, C43223c cVar, boolean z, boolean z2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        return new C73531bp(eVar, cVar, z, z2);
    }
}
