package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.tiktok.homepage.C22724a;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49666aa;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67187a;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.publish.Publish;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.o */
public class C22759o {

    /* renamed from: a */
    public ActivityC0945e f53750a;

    /* renamed from: b */
    C22724a f53751b;

    /* renamed from: c */
    public boolean f53752c;

    /* renamed from: d */
    private DataCenter f53753d;

    /* renamed from: e */
    private C22753i f53754e;

    static {
        Covode.recordClassIndex(26652);
    }

    /* renamed from: a */
    static void m42924a() {
        AbstractC81915c.m141874a(new C49666aa());
    }

    /* renamed from: a */
    private static Bundle m42923a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m42925a(int i) {
        DataCenter dataCenter = this.f53753d;
        if (dataCenter != null) {
            dataCenter.mo60191a("changeTabAfterPublish", Integer.valueOf(i));
        }
    }

    public C22759o(ActivityC0945e eVar, C22724a aVar) {
        this.f53750a = eVar;
        this.f53751b = aVar;
    }

    /* renamed from: b */
    public final void mo37077b(Intent intent, boolean z) {
        if (z) {
            this.f53752c = true;
            Context applicationContext = this.f53750a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C29823c.m60080a(applicationContext, "protect", "record_on");
            boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
            final RecordConfig recordConfig = (RecordConfig) intent.getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
            if (booleanExtra) {
                C17964b.f42784c = true;
            }
            AVExternalServiceImpl.m113114a().asyncService(this.f53750a, "from_3rd_platform", new SimpleServiceLoadCallback() {
                /* class com.bytedance.tiktok.homepage.mainactivity.C22759o.C227601 */

                static {
                    Covode.recordClassIndex(26653);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startRecord(C22759o.this.f53750a, recordConfig);
                }
            });
        }
    }

    /* renamed from: a */
    public final boolean mo37076a(Intent intent, boolean z) {
        boolean z2;
        C51423a.m95784a(3, null, "ProcessPublish tryProcessPublish isOnCreate:".concat(String.valueOf(z)));
        if (z) {
            Activity[] activityStack = ActivityStack.getActivityStack();
            for (Activity activity : activityStack) {
                if (!(activity instanceof MainActivity)) {
                    activity.finish();
                    z2 = true;
                } else {
                    z2 = false;
                }
                C51423a.m95791b(3, null, "ProcessPublish finishActivity isFinish:" + z2 + " activity:" + activity.getClass().getName());
            }
        }
        C51423a.m95791b(3, null, "MainActivity.onNewIntent()" + m42923a(intent) + " isOnCreate:" + z);
        C39162r.m79460a("av_video_memory", new C33744d().mo59983a("log", "MainActivity.onNewIntent()" + m42923a(intent)).mo59982a("isOnCreate", Boolean.valueOf(z)).f79943a);
        boolean processPublish = AVExternalServiceImpl.m113114a().publishService().processPublish(this.f53750a, intent);
        Publish.isInPublish = processPublish;
        if (!processPublish) {
            return false;
        }
        Bundle bundleExtra = intent.getBundleExtra("publish_bundle");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        int i = -1;
        if (bundleExtra != null) {
            i = bundleExtra.getInt("publish_permission", -1);
        }
        if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH")) {
            if (intent.hasExtra("multi_publish_id")) {
                m42925a(i);
            }
            return true;
        }
        if (!intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
            m42925a(i);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo37075a(Bundle bundle, DataCenter dataCenter, C22753i iVar) {
        new C58221f.C58224c().mo95703b((AbstractC58264w) new CleanEffectsTask()).mo95706a();
        this.f53753d = dataCenter;
        this.f53754e = iVar;
        C67187a.m119053a();
        Intent intent = this.f53750a.getIntent();
        boolean hasExtra = intent.hasExtra("enable_optimize_main_not_in_stack");
        C51423a.m95784a(3, null, "ProcessPublish MainActivityCreate isMainNotInStackPublish:".concat(String.valueOf(hasExtra)));
        if (!this.f53754e.f53741b && ((bundle == null && hasExtra) || Publish.isNeedProcessPublish || Publish.isInPublish)) {
            Publish.isNeedProcessPublish = false;
            mo37076a(intent, true);
        }
        new C58221f.C58224c().mo95703b(AVExternalServiceImpl.m113114a().initService().initTask(5)).mo95706a();
    }
}
