package com.p2082ss.android.ugc.aweme.core;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.core.AppWidgetSchedulerService */
public final class AppWidgetSchedulerService extends JobService {

    /* renamed from: a */
    private HandlerC40234a f94438a;

    static {
        Covode.recordClassIndex(48031);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.core.AppWidgetSchedulerService$a */
    public static final class HandlerC40234a extends Handler {

        /* renamed from: a */
        public final AppWidgetSchedulerService f94439a;

        /* renamed from: b */
        private final Context f94440b;

        static {
            Covode.recordClassIndex(48032);
        }

        /* renamed from: com.ss.android.ugc.aweme.core.AppWidgetSchedulerService$a$a */
        static final class C40235a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ HandlerC40234a f94441a;

            /* renamed from: b */
            final /* synthetic */ JobParameters f94442b;

            static {
                Covode.recordClassIndex(48033);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C40235a(HandlerC40234a aVar, JobParameters jobParameters) {
                super(0);
                this.f94441a = aVar;
                this.f94442b = jobParameters;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f94441a.f94439a.jobFinished(this.f94442b, false);
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
            if (r2 == null) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
            if (r2 != null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
            if (r2 != null) goto L_0x0060;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r20) {
            /*
            // Method dump skipped, instructions count: 216
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.core.AppWidgetSchedulerService.HandlerC40234a.handleMessage(android.os.Message):void");
        }

        public HandlerC40234a(Context context, AppWidgetSchedulerService appWidgetSchedulerService) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(appWidgetSchedulerService, "");
            this.f94440b = context;
            this.f94439a = appWidgetSchedulerService;
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        int i;
        PersistableBundle extras;
        if (this.f94438a == null) {
            Context applicationContext = getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            this.f94438a = new HandlerC40234a(applicationContext, this);
        }
        Message message = new Message();
        if (jobParameters == null || (extras = jobParameters.getExtras()) == null) {
            i = -1;
        } else {
            i = extras.getInt("app_widget_action_type");
        }
        message.what = i;
        message.obj = jobParameters;
        HandlerC40234a aVar = this.f94438a;
        if (aVar == null) {
            return true;
        }
        aVar.sendMessage(message);
        return true;
    }
}
