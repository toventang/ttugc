package com.p2082ss.android.ugc.aweme.profile.widgets;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC35326bx;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3571e.C63511a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.k */
public final class View$OnClickListenerC64894k implements View.OnClickListener {

    /* renamed from: f */
    public static final C64895a f146703f = new C64895a((byte) 0);

    /* renamed from: a */
    public final WeakReference<AbstractC64896b> f146704a;

    /* renamed from: b */
    public final C80053c f146705b;

    /* renamed from: c */
    public final Context f146706c;

    /* renamed from: d */
    public final ActivityC0945e f146707d;

    /* renamed from: e */
    public final C63511a f146708e;

    /* renamed from: g */
    private boolean f146709g;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k$b */
    public interface AbstractC64896b {
        static {
            Covode.recordClassIndex(76363);
        }

        /* renamed from: c */
        void mo103713c();
    }

    static {
        Covode.recordClassIndex(76361);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k$a */
    public static final class C64895a {
        static {
            Covode.recordClassIndex(76362);
        }

        private C64895a() {
        }

        public /* synthetic */ C64895a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k$d */
    static final class RunnableC64898d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC64894k f146712a;

        static {
            Covode.recordClassIndex(76365);
        }

        RunnableC64898d(View$OnClickListenerC64894k kVar) {
            this.f146712a = kVar;
        }

        public final void run() {
            final String str = this.f146712a.f146705b.f179384a;
            IAccountUserService e = AccountService.m65215a().mo57069e();
            C89219l.m154716b(e, "");
            User curUser = e.getCurUser();
            C89219l.m154716b(curUser, "");
            final String uid = curUser.getUid();
            C39162r.m79460a("switch_account_submit", new C33744d().mo59983a("from_uid", uid).mo59983a("target_uid", str).mo59983a("enter_method", this.f146712a.f146708e.f144138b).mo59983a("enter_from", this.f146712a.f146708e.f144137a).f79943a);
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", this.f146712a.f146708e.f144137a);
            bundle.putString("enter_method", this.f146712a.f146708e.f144138b);
            C31575b.m65860b().switchAccount(this.f146712a.f146705b, bundle, new AbstractC35326bx(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.View$OnClickListenerC64894k.RunnableC64898d.C648991 */

                /* renamed from: a */
                final /* synthetic */ RunnableC64898d f146713a;

                static {
                    Covode.recordClassIndex(76366);
                }

                @Override // com.p2082ss.android.ugc.aweme.AbstractC35326bx
                /* renamed from: a */
                public final void mo57675a() {
                    this.f146713a.f146712a.mo104254a();
                    C39162r.m79460a("switch_account_result", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("enter_method", "unfold_triangle").mo59983a("from_uid", uid).mo59983a("target_uid", str).mo59980a("status", 1).f79943a);
                }

                @Override // com.p2082ss.android.ugc.aweme.AbstractC35326bx
                /* renamed from: a */
                public final void mo57676a(Integer num, String str) {
                    Activity j;
                    this.f146713a.f146712a.mo104254a();
                    int i = -1;
                    if ((num == null || num.intValue() != 1349) && (j = C17873f.m33102j()) != null) {
                        if (num == null || num.intValue() <= 0 || str == null || TextUtils.isEmpty(str)) {
                            new C79459a(j).mo123050a(R.string.bos).mo123053a();
                        } else {
                            new C79459a(j).mo123052a(str).mo123053a();
                        }
                    }
                    C33744d a = new C33744d().mo59980a("status", 0);
                    if (num != null) {
                        i = num.intValue();
                    }
                    C39162r.m79460a("switch_account_result", a.mo59980a("fail_info", i).f79943a);
                }

                {
                    this.f146713a = r1;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k$c */
    static final class RunnableC64897c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC64894k f146710a;

        /* renamed from: b */
        final /* synthetic */ int f146711b = 8;

        static {
            Covode.recordClassIndex(76364);
        }

        RunnableC64897c(View$OnClickListenerC64894k kVar) {
            this.f146710a = kVar;
        }

        public final void run() {
            if (C31575b.m65865g().allUidList().size() < this.f146711b) {
                ActivityC0945e eVar = this.f146710a.f146707d;
                String str = this.f146710a.f146708e.f144137a;
                String str2 = this.f146710a.f146708e.f144138b;
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C80222ap apVar = new C80222ap();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                C58957c.m108319a(eVar, str, str2, apVar.mo123649a("previous_uid", g.getCurUserId()).mo123650a("force_use_default_login_method", true).mo123650a("is_multi_account", true).mo123650a("is_fullscreen_dialog", true).mo123650a("is_skippable_dialog", true).mo123650a("need_auto_fill_latest_login_info", false).f179700a);
                return;
            }
            String string = this.f146710a.f146706c.getString(R.string.or, Integer.valueOf(this.f146711b));
            C89219l.m154716b(string, "");
            new C79459a(this.f146710a.f146706c).mo123052a(string).mo123053a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070 A[Catch:{ all -> 0x0078 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104254a() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.View$OnClickListenerC64894k.mo104254a():void");
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (!this.f146709g) {
            this.f146709g = true;
            if (C80580in.m139687c()) {
                C33830n.m69192a("child_mode_click_switch_account", "", (JSONObject) null);
            }
            MultiAccountService.m65945c();
            if (C89219l.m154714a((Object) this.f146705b.f179384a, (Object) "-1")) {
                mo104254a();
                if (C31575b.m65865g().allUidList().size() == 8) {
                    String string = this.f146706c.getString(R.string.or, 8);
                    C89219l.m154716b(string, "");
                    new C79459a(this.f146706c).mo123052a(string).mo123053a();
                    return;
                }
                C39223a.m79601o().mo68701a(this.f146706c, "add_account", new RunnableC64897c(this));
            } else if (AVExternalServiceImpl.m113114a().publishService().isPublishable()) {
                C39223a.m79601o().mo68701a(this.f146706c, "switch_account", new RunnableC64898d(this));
            } else {
                mo104254a();
                new C79459a(this.f146706c).mo123050a(R.string.eye).mo123053a();
            }
        }
    }

    public View$OnClickListenerC64894k(WeakReference<AbstractC64896b> weakReference, C80053c cVar, Context context, ActivityC0945e eVar, C63511a aVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        this.f146704a = weakReference;
        this.f146705b = cVar;
        this.f146706c = context;
        this.f146707d = eVar;
        this.f146708e = aVar;
    }
}
