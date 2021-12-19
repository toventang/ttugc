package com.bytedance.tiktok.homepage;

import android.content.DialogInterface;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feedback.C50566a;
import com.p2082ss.android.ugc.aweme.feedback.C50567b;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.bytedance.tiktok.homepage.a */
public class C22724a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public MainActivity f53682a;

    /* renamed from: b */
    public C69488a f53683b;

    /* renamed from: c */
    public Handler f53684c = new Handler();

    static {
        Covode.recordClassIndex(26613);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(136, new RunnableC90250g(C22724a.class, "onFeedbackEvent", C50566a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public C22724a(MainActivity mainActivity) {
        this.f53682a = mainActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r5 = (com.p2082ss.android.ugc.aweme.common.C39078ad) r7.getSerializableExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r4 = r6.f53682a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37041a(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG"
            boolean r0 = r7.hasExtra(r1)     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003f
            java.io.Serializable r5 = r7.getSerializableExtra(r1)     // Catch:{ Exception -> 0x003f }
            com.ss.android.ugc.aweme.common.ad r5 = (com.p2082ss.android.ugc.aweme.common.C39078ad) r5     // Catch:{ Exception -> 0x003f }
            if (r5 == 0) goto L_0x003f
            r0 = 1
            r5.mNeedShowDialog = r0     // Catch:{ Exception -> 0x003f }
            boolean r0 = com.p2082ss.android.ugc.aweme.utils.C80522ha.m139587a(r5)     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.main.MainActivity r4 = r6.f53682a     // Catch:{ Exception -> 0x003f }
            if (r4 == 0) goto L_0x003f
            java.lang.String r0 = r5.mAppName     // Catch:{ Exception -> 0x003f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003c
            r0 = 2131830310(0x7f112626, float:1.9293614E38)
            java.lang.String r3 = r4.getString(r0)     // Catch:{ Exception -> 0x003f }
        L_0x002c:
            com.ss.android.ugc.aweme.opensdk.a.a.a r2 = new com.ss.android.ugc.aweme.opensdk.a.a.a     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = "share saved"
            com.bytedance.tiktok.homepage.a$1 r0 = new com.bytedance.tiktok.homepage.a$1     // Catch:{ Exception -> 0x003f }
            r0.<init>(r4, r5)     // Catch:{ Exception -> 0x003f }
            r2.<init>(r4, r3, r1, r0)     // Catch:{ Exception -> 0x003f }
            r2.show()     // Catch:{ Exception -> 0x003f }
            goto L_0x003f
        L_0x003c:
            java.lang.String r3 = r5.mAppName     // Catch:{ Exception -> 0x003f }
            goto L_0x002c
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.C22724a.mo37041a(android.content.Intent):void");
    }

    /* renamed from: a */
    public final void mo37042a(MainActivity mainActivity) {
        AVExternalServiceImpl.m113114a().abnormalExitLogService().logRestoreDialogShow();
        IExternalService a = AVExternalServiceImpl.m113114a();
        if (a == null || a.publishService().restoreWorkExperimentDisableCover()) {
            C17197a.C17200a b = new C17197a.C17200a(mainActivity).mo27194b(R.string.h7k).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC22730d(this, mainActivity), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC22731e(this, mainActivity), false);
            b.f41067M = false;
            b.mo27193a().mo27184b();
            return;
        }
        a.publishService().showRestoreWorkDialog(mainActivity, mainActivity.getEnterFrom());
    }

    @AbstractC90264r
    public void onFeedbackEvent(C50566a aVar) {
        final MainActivity mainActivity = this.f53682a;
        C39162r.m79460a("feedback_reply_alert", new C33744d().mo59983a("uid", C31575b.m65865g().getCurUserId()).f79943a);
        new C17197a.C17200a(mainActivity).mo27189a(R.string.cm5).mo27190a(R.string.ctm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.bytedance.tiktok.homepage.C22724a.DialogInterface$OnClickListenerC227262 */

            static {
                Covode.recordClassIndex(26615);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C39162r.m79460a("feedback_reply_view", new C33744d().mo59983a("uid", C31575b.m65865g().getCurUserId()).f79943a);
                C50567b.m94799a(mainActivity, "feedback_alert");
            }
        }, false).mo27195b(R.string.ct_, (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b();
    }
}
