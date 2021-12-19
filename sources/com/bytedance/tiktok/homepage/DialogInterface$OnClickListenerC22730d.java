package com.bytedance.tiktok.homepage;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.AnchorListManager;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49666aa;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.UUID;

/* renamed from: com.bytedance.tiktok.homepage.d */
final /* synthetic */ class DialogInterface$OnClickListenerC22730d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C22724a f53695a;

    /* renamed from: b */
    private final MainActivity f53696b;

    static {
        Covode.recordClassIndex(26619);
    }

    DialogInterface$OnClickListenerC22730d(C22724a aVar, MainActivity mainActivity) {
        this.f53695a = aVar;
        this.f53696b = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C22724a aVar = this.f53695a;
        MainActivity mainActivity = this.f53696b;
        AVExternalServiceImpl.m113114a().abnormalExitLogService().logRestoreDialogClick(true);
        AnchorListManager.m70432a();
        C59213ah.f134852a = mainActivity.getEnterFrom();
        AVExternalServiceImpl.m113114a().asyncService(mainActivity, "restore_crash", new SimpleServiceLoadCallback(mainActivity, new RecordConfig.Builder().shootWay("restore_crash").restoreType(2).creationId(UUID.randomUUID().toString())) {
            /* class com.bytedance.tiktok.homepage.C22724a.C227273 */

            /* renamed from: a */
            final /* synthetic */ MainActivity f53690a;

            /* renamed from: b */
            final /* synthetic */ RecordConfig.Builder f53691b;

            static {
                Covode.recordClassIndex(26616);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord(this.f53690a, this.f53691b.build());
            }

            {
                this.f53690a = r2;
                this.f53691b = r3;
            }
        });
        dialogInterface.dismiss();
        AbstractC81915c.m141874a(new C49666aa());
    }
}
