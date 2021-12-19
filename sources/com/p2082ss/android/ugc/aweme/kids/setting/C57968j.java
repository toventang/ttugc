package com.p2082ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o;
import com.p2082ss.android.ugc.aweme.kids.setting.base.DialogC57804a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.C57887b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import com.p2082ss.android.ugc.aweme.kids.setting.p3367a.C57802a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.j */
public final class C57968j implements AbstractC57982o {

    /* renamed from: c */
    public static final C57970a f132146c = new C57970a((byte) 0);

    /* renamed from: a */
    public DialogC57804a f132147a;

    /* renamed from: b */
    final Activity f132148b;

    /* renamed from: d */
    private C17197a f132149d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.j$e */
    public static final class DialogInterface$OnClickListenerC57974e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC57974e f132154a = new DialogInterface$OnClickListenerC57974e();

        static {
            Covode.recordClassIndex(68000);
        }

        DialogInterface$OnClickListenerC57974e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        Covode.recordClassIndex(67994);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final String mo95127a() {
        return "logout";
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.j$a */
    public static final class C57970a {
        static {
            Covode.recordClassIndex(67996);
        }

        private C57970a() {
        }

        public /* synthetic */ C57970a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: b */
    public final Activity mo95130b() {
        return this.f132148b;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.j$g */
    public static final class C57976g implements AbstractC34709b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C57968j f132156a;

        static {
            Covode.recordClassIndex(68002);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
        /* renamed from: a */
        public final /* synthetic */ void mo61385a() {
            this.f132156a.mo95301c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57976g(C57968j jVar) {
            this.f132156a = jVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.j$f */
    public static final class DialogInterface$OnClickListenerC57975f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57968j f132155a;

        static {
            Covode.recordClassIndex(68001);
        }

        DialogInterface$OnClickListenerC57975f(C57968j jVar) {
            this.f132155a = jVar;
        }

        /* renamed from: a */
        private static boolean m104762a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m104762a();
            }
            if (!C58029j.f132256h) {
                new C79459a(this.f132155a.f132148b).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("user_id", C57802a.m104517a());
            C57355f.m103961a("log_out", bundle);
            KidsAccountServiceImpl.m104406h().mo94323g();
            C57968j jVar = this.f132155a;
            jVar.f132148b.runOnUiThread(new RunnableC57971b(jVar));
            KidsAccountServiceImpl.m104406h().mo94315a("user_logout", "user_logout");
        }
    }

    /* renamed from: e */
    private static boolean m104754e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.j$b */
    static final class RunnableC57971b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C57968j f132150a;

        static {
            Covode.recordClassIndex(67997);
        }

        RunnableC57971b(C57968j jVar) {
            this.f132150a = jVar;
        }

        public final void run() {
            if (this.f132150a.f132147a == null) {
                this.f132150a.f132147a = new DialogC57804a(this.f132150a.f132148b);
            }
            DialogC57804a aVar = this.f132150a.f132147a;
            if (aVar != null) {
                aVar.show();
            }
        }
    }

    /* renamed from: d */
    public final void mo95302d() {
        if (this.f132149d == null) {
            C17197a.C17200a aVar = new C17197a.C17200a(this.f132148b);
            aVar.mo27189a(R.string.as7).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC57974e.f132154a, false).mo27190a(R.string.cy1, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57975f(this), false);
            this.f132149d = aVar.mo27193a();
        }
        C17197a aVar2 = this.f132149d;
        if (aVar2 != null) {
            aVar2.mo27184b();
        }
    }

    /* renamed from: c */
    public final void mo95301c() {
        UrlModel urlModel;
        IKidsAccountService h = KidsAccountServiceImpl.m104406h();
        if (!h.mo94320d() || h.mo94319c() || !h.mo94321e()) {
            mo95302d();
            return;
        }
        C17197a.C17200a aVar = new C17197a.C17200a(this.f132148b);
        SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(this.f132148b);
        AbstractC57153a b = KidsAccountServiceImpl.m104406h().mo94318b();
        if (b != null) {
            urlModel = b.getUserThumb();
        } else {
            urlModel = null;
        }
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        a.f49092E = smartAvatarImageView;
        a.mo34186c();
        aVar.mo27191a(smartAvatarImageView, 48, 48);
        aVar.f41067M = false;
        aVar.mo27189a(R.string.bt).mo27194b(R.string.bq).mo27195b(R.string.br, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57972c(this), false).mo27190a(R.string.bs, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57973d(this, h), false);
        aVar.mo27193a().mo27185c();
    }

    public C57968j(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f132148b = activity;
        activity.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.C57968j.C579691 */

            static {
                Covode.recordClassIndex(67995);
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                C89219l.m154721d(activity, "");
            }

            public final void onActivityPaused(Activity activity) {
                C89219l.m154721d(activity, "");
            }

            public final void onActivityResumed(Activity activity) {
                C89219l.m154721d(activity, "");
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                C89219l.m154721d(activity, "");
                C89219l.m154721d(bundle, "");
            }

            public final void onActivityStarted(Activity activity) {
                C89219l.m154721d(activity, "");
            }

            public final void onActivityStopped(Activity activity) {
                C89219l.m154721d(activity, "");
            }

            public final void onActivityDestroyed(Activity activity) {
                C89219l.m154721d(activity, "");
                KidsAccountServiceImpl.m104406h().mo94322f();
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final CommonItemView mo95126a(View view) {
        C89219l.m154721d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.ch0);
        C89219l.m154716b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final void mo95128a(CommonItemView commonItemView) {
        C89219l.m154721d(commonItemView, "");
        if (AVExternalServiceImpl.m113114a().publishService().isPublishable()) {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m104754e();
            }
            if (!C58029j.f132256h) {
                new C79459a(this.f132148b).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            Activity activity = this.f132148b;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity");
            if (!((ActivityC17312a) activity).isActive()) {
                return;
            }
            if (TimeLockRuler.isRuleValid()) {
                C57887b.m104657a(new C57976g(this), "logout");
            } else {
                mo95301c();
            }
        } else {
            new C79459a(this.f132148b).mo123050a(R.string.eye).mo123053a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.j$c */
    public static final class DialogInterface$OnClickListenerC57972c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57968j f132151a;

        static {
            Covode.recordClassIndex(67998);
        }

        DialogInterface$OnClickListenerC57972c(C57968j jVar) {
            this.f132151a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f132151a.mo95302d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.j$d */
    public static final class DialogInterface$OnClickListenerC57973d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57968j f132152a;

        /* renamed from: b */
        final /* synthetic */ IKidsAccountService f132153b;

        static {
            Covode.recordClassIndex(67999);
        }

        DialogInterface$OnClickListenerC57973d(C57968j jVar, IKidsAccountService iKidsAccountService) {
            this.f132152a = jVar;
            this.f132153b = iKidsAccountService;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f132153b.mo94316a("allow_one_key_login", true);
            this.f132152a.mo95302d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final void mo95129a(String str, String str2, Boolean bool) {
        C89219l.m154721d(str, "");
        AbstractC57982o.C57983a.m104792a(this, str, str2, bool, (Boolean) null);
    }
}
