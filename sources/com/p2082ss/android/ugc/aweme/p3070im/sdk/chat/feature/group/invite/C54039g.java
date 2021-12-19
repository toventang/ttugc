package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.data.ImUnder16Manger;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56224g;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g */
public final class C54039g {

    /* renamed from: a */
    public final Activity f123877a;

    /* renamed from: b */
    public final String f123878b;

    static {
        Covode.recordClassIndex(63712);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g$b */
    public static final class C54041b implements AbstractC17207b.AbstractC17211c {

        /* renamed from: a */
        final /* synthetic */ C54039g f123881a;

        static {
            Covode.recordClassIndex(63714);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            new Handler(Looper.getMainLooper()).post(new RunnableC54042a(this));
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g$b$a */
        static final class RunnableC54042a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C54041b f123882a;

            static {
                Covode.recordClassIndex(63715);
            }

            RunnableC54042a(C54041b bVar) {
                this.f123882a = bVar;
            }

            public final void run() {
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    ((C23023b) C23028c.m43435a((C23023b) new C23023b(topActivity).mo37483b(R.string.cni), new AbstractC89172b<C23025b, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.C54039g.C54041b.RunnableC54042a.C540431 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC54042a f123883a;

                        static {
                            Covode.recordClassIndex(63716);
                        }

                        {
                            this.f123883a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C23025b bVar) {
                            C23025b bVar2 = bVar;
                            C89219l.m154721d(bVar2, "");
                            String string = this.f123883a.f123882a.f123881a.f123877a.getString(R.string.cfq);
                            C89219l.m154716b(string, "");
                            bVar2.mo37417a(string, C540441.f123884a);
                            return C89391z.f203057a;
                        }
                    }).mo37482a(false)).mo37405a().mo37396b().show();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54041b(C54039g gVar) {
            this.f123881a = gVar;
        }
    }

    /* renamed from: a */
    public final void mo91149a() {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC54045c(this), 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g$c */
    public static final class RunnableC54045c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C54039g f123885a;

        static {
            Covode.recordClassIndex(63718);
        }

        RunnableC54045c(C54039g gVar) {
            this.f123885a = gVar;
        }

        public final void run() {
            C54039g gVar = this.f123885a;
            Activity topActivity = ActivityStack.getTopActivity();
            if (((topActivity != null && (!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isDeepLinkHandlerActivity(topActivity))) || (topActivity = ActivityStack.getPreviousActivity()) != null) && (topActivity instanceof ActivityC0945e)) {
                C17205a aVar = C17205a.C17206a.f41116a;
                DialogContext.C17204a aVar2 = new DialogContext.C17204a((AbstractC1204m) topActivity);
                aVar2.f41106a = AbstractC17207b.EnumC17208a.GROUP_CHAT_INVITE;
                aVar.mo27209a(aVar2.mo27207a(new C54041b(gVar)));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.g$a */
    public static final class C54040a implements AbstractC56224g {

        /* renamed from: a */
        final /* synthetic */ C54039g f123879a;

        /* renamed from: b */
        final /* synthetic */ String f123880b;

        static {
            Covode.recordClassIndex(63713);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56224g
        /* renamed from: a */
        public final void mo91150a() {
            String str = this.f123880b;
            C89219l.m154721d(str, "");
            C89219l.m154721d(this, "");
            CopyOnWriteArrayList<AbstractC56224g> copyOnWriteArrayList = ImUnder16Manger.f128134h.get(str);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(this);
            }
            if (!ImUnder16Manger.m102067b()) {
                Intent sessionListActivityIntent = IMService.createIIMServicebyMonsterPlugin(false).getSessionListActivityIntent(this.f123879a.f123877a);
                if (sessionListActivityIntent != null) {
                    sessionListActivityIntent.putExtra("im_group_invite_id", this.f123879a.f123878b);
                    Activity activity = this.f123879a.f123877a;
                    C84349a.m145093a(sessionListActivityIntent, activity);
                    activity.startActivity(sessionListActivityIntent);
                    return;
                }
                return;
            }
            this.f123879a.mo91149a();
        }

        public C54040a(C54039g gVar, String str) {
            this.f123879a = gVar;
            this.f123880b = str;
        }
    }

    public C54039g(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        this.f123877a = activity;
        this.f123878b = str;
    }
}
