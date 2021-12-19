package com.p2082ss.android.ugc.aweme.scheduler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C0607l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import com.p2082ss.android.ugc.aweme.scheduler.PublishService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.PublishBroadcastReceiver */
public final class PublishBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static boolean f150769a;

    /* renamed from: b */
    public static final C67282a f150770b = new C67282a((byte) 0);

    static {
        Covode.recordClassIndex(78903);
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.PublishBroadcastReceiver$a */
    public static final class C67282a {
        static {
            Covode.recordClassIndex(78904);
        }

        private C67282a() {
        }

        public /* synthetic */ C67282a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.PublishBroadcastReceiver$b */
    public static final class C67283b implements IDraftService.OnGetRecoverDraftCallback {

        /* renamed from: a */
        final /* synthetic */ String f150771a;

        /* renamed from: b */
        final /* synthetic */ Context f150772b;

        static {
            Covode.recordClassIndex(78905);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService.OnGetRecoverDraftCallback
        public final void onFail() {
            C67296h.m119240b("PublishBroadcastReceiver retry onFail");
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService.OnGetRecoverDraftCallback
        public final void onSuccess(C43223c cVar) {
            String a;
            C89219l.m154721d(cVar, "");
            String f = cVar.mo73676f();
            C89219l.m154716b(f, "");
            C67296h.m119243c("PublishBroadcastReceiver retry onSuccess draftCreationId:".concat(String.valueOf(f)));
            if (!C89219l.m154714a((Object) this.f150771a, (Object) f)) {
                C67296h.m119240b("PublishBroadcastReceiver retry CreationIdNotEqual intent:" + this.f150771a + " draft:" + f);
            }
            C39162r.m79460a("publish_retry", new C84425b().mo129406a("action_type", "publish").mo129406a("creation_id", f).mo129406a("enter_from", "notification").mo129406a("enter_method", "click_retry").f188764a);
            C63238c.f143591r.mo93935a(true);
            Bundle a2 = C65682o.m117569a(this.f150772b, cVar);
            if (C68747m.m121180a()) {
                a = C67296h.m119230a(a2);
                C67296h.m119234a();
            } else {
                a = C67296h.m119231a(a2, (String) null);
            }
            if (a == null) {
                C84911q.m145926b("PublishFromDraft Already In publish, can not start new");
            }
            Activity c = C40964c.m82474c();
            C67296h.m119243c("PublishBroadcastReceiver bind publishId:" + a + " hostActivity:" + c);
            if (a != null) {
                C63253l.f143623a.mo73314j().mo93932a(c, a);
            }
        }

        C67283b(String str, Context context) {
            this.f150771a = str;
            this.f150772b = context;
        }
    }

    /* renamed from: a */
    private static String m119199a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(intent, "");
        if (C89219l.m154714a((Object) m119199a(intent, "DEBUG_MSG"), (Object) "MSG_SUCCESS")) {
            C67296h.m119243c("PublishBroadcastReceiver onReceive success");
            f150769a = true;
            return;
        }
        String a = m119199a(intent, "creation_id");
        if (!C68747m.m121180a()) {
            PublishService.C67284a.m119208a();
        } else if (a != null) {
            C89219l.m154721d(a, "");
            PublishService.C67284a.m119210a("clear");
            Context a2 = C40963b.m82473a();
            PublishService.C67284a.m119209a(a2);
            C0607l.m2289a(a2).mo2638a((String) null, a.hashCode());
        }
        C67296h.m119243c("PublishBroadcastReceiver onReceive intentCreationId:".concat(String.valueOf(a)));
        if (C68747m.m121180a() || !C67296h.m119245e()) {
            C65682o.m117572a(context, new C67283b(a, context));
        } else {
            C67296h.m119240b("PublishBroadcastReceiver start publish when publishing");
        }
    }
}
