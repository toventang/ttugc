package com.p2082ss.android.ugc.aweme.authorize;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.p1625a.p1631b.p1633b.AbstractC22335a;
import com.bytedance.sdk.p1625a.p1631b.p1634c.p1635a.C22337a;
import com.bytedance.sdk.p1625a.p1631b.p1634c.p1635a.C22338b;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22340b;
import com.bytedance.sdk.p1625a.p1631b.p1636d.C22342d;
import com.bytedance.sdk.p1625a.p1638c.p1639a.C22349c;
import com.bytedance.sdk.p1625a.p1638c.p1640b.C22353b;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.C40798cx;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.authorize.C33977a;
import com.p2082ss.android.ugc.aweme.authorize.C34003c;
import com.p2082ss.android.ugc.aweme.authorize.network.C34029a;
import com.p2082ss.android.ugc.aweme.authorize.p2342a.C33979a;
import com.p2082ss.android.ugc.aweme.authorize.p2343b.C34001a;
import com.p2082ss.android.ugc.aweme.authorize.p2343b.C34002b;
import com.p2082ss.android.ugc.aweme.authorize.p2344c.DialogC34009a;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.p2082ss.android.ugc.aweme.authorize.viewmodel.C34038a;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34574e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.openauthorize.AbstractC62716h;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62697a;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62698b;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62700d;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62701e;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62703g;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62704h;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62705i;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62706j;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62707k;
import com.p2082ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.authorize.b */
public class C33985b extends Fragment implements AbstractC62716h, AbstractC90252i, AbstractC90253j {

    /* renamed from: q */
    public static Fragment f80377q;

    /* renamed from: r */
    public static final C33986a f80378r = new C33986a((byte) 0);

    /* renamed from: a */
    public AuthCommonViewModel f80379a;

    /* renamed from: b */
    public C22349c.C22350a f80380b;

    /* renamed from: c */
    public DialogC34009a f80381c;

    /* renamed from: d */
    int f80382d;

    /* renamed from: e */
    public String f80383e;

    /* renamed from: f */
    String f80384f;

    /* renamed from: g */
    String f80385g;

    /* renamed from: h */
    String f80386h;

    /* renamed from: i */
    String f80387i;

    /* renamed from: j */
    String f80388j;

    /* renamed from: k */
    public C22342d f80389k;

    /* renamed from: l */
    boolean f80390l;

    /* renamed from: m */
    String f80391m = "";

    /* renamed from: n */
    public String f80392n;

    /* renamed from: o */
    String f80393o;

    /* renamed from: p */
    String f80394p;

    /* renamed from: s */
    private AwemeAuthorizePlatformDepend f80395s;

    /* renamed from: t */
    private AbstractC22335a.AbstractC22336a f80396t;

    /* renamed from: u */
    private Handler f80397u = new Handler(Looper.getMainLooper());

    /* renamed from: v */
    private boolean f80398v;

    /* renamed from: w */
    private SparseArray f80399w;

    static {
        Covode.recordClassIndex(40917);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(345, new RunnableC90250g(C33985b.class, "onUserBannedEvent", C34574e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$a */
    public static final class C33986a {
        static {
            Covode.recordClassIndex(40918);
        }

        private C33986a() {
        }

        public /* synthetic */ C33986a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f80399w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: c */
    static boolean m69580c() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            C89219l.m154716b(awemeActivitySetting, "");
            Boolean isNewUser = awemeActivitySetting.getIsNewUser();
            C89219l.m154716b(isNewUser, "");
            return isNewUser.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$f */
    static final class RunnableC33992f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33985b f80406a;

        static {
            Covode.recordClassIndex(40924);
        }

        RunnableC33992f(C33985b bVar) {
            this.f80406a = bVar;
        }

        public final void run() {
            EventBus.m156966a(EventBus.m156962a(), this.f80406a);
            C39162r.m79460a("login_notify", new C33744d().mo59983a("enter_from", this.f80406a.mo60275a()).f79943a);
            OpenPlatformServiceImpl.m113101b().mo100638a(this.f80406a, new ArrayList<>());
        }
    }

    /* renamed from: a */
    public final String mo60275a() {
        C22349c.C22350a aVar = this.f80380b;
        if (aVar == null) {
            C89219l.m154710a("request");
        }
        return aVar.f52809c;
    }

    /* renamed from: b */
    public final void mo60279b() {
        Fragment fragment = f80377q;
        if (fragment == null || !(fragment instanceof C34014e)) {
            mo60282c(C34002b.m69592a(-2, C40798cx.f95519a, "", "", ""));
            return;
        }
        AuthCommonViewModel authCommonViewModel = this.f80379a;
        if (authCommonViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel.f80482c.observe(this, new C34000n(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DialogC34009a aVar = this.f80381c;
        if (aVar == null) {
            C89219l.m154710a("authLoading");
        }
        if (aVar.isShowing()) {
            DialogC34009a aVar2 = this.f80381c;
            if (aVar2 == null) {
                C89219l.m154710a("authLoading");
            }
            aVar2.dismiss();
        }
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ C22349c.C22350a m69578a(C33985b bVar) {
        C22349c.C22350a aVar = bVar.f80380b;
        if (aVar == null) {
            C89219l.m154710a("request");
        }
        return aVar;
    }

    @AbstractC90264r
    public final void onUserBannedEvent(C34574e eVar) {
        C89219l.m154721d(eVar, "");
        this.f80398v = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$b */
    static final class C33987b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33985b f80400a;

        static {
            Covode.recordClassIndex(40919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33987b(C33985b bVar) {
            super(1);
            this.f80400a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37418b(R.string.dkh, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.authorize.C33985b.C33987b.C339881 */

                /* renamed from: a */
                final /* synthetic */ C33987b f80401a;

                static {
                    Covode.recordClassIndex(40920);
                }

                {
                    this.f80401a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f80401a.f80400a.mo60280b(C34002b.m69592a(-5, C40798cx.f95520b, "", "", ""));
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.authorize.b$d */
    public static final class DialogInterface$OnDismissListenerC33990d implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C62698b f80403a;

        /* renamed from: b */
        final /* synthetic */ C33985b f80404b;

        static {
            Covode.recordClassIndex(40922);
        }

        DialogInterface$OnDismissListenerC33990d(C62698b bVar, C33985b bVar2) {
            this.f80403a = bVar;
            this.f80404b = bVar2;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            int i;
            Integer resultCode = this.f80403a.getResultCode();
            if (resultCode != null) {
                i = resultCode.intValue();
            } else {
                i = -1;
            }
            this.f80404b.mo60280b(C34002b.m69592a(i, this.f80403a.getResultMsg(), "", "", ""));
        }
    }

    /* renamed from: a */
    private final void m69579a(int i) {
        if (i != 0) {
            mo60282c(C34002b.m69592a(-30, "login fail", "", "", ""));
            return;
        }
        AuthCommonViewModel authCommonViewModel = this.f80379a;
        if (authCommonViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel.mo60313a();
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$k */
    static final class C33997k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C33985b f80411a;

        static {
            Covode.recordClassIndex(40929);
        }

        C33997k(C33985b bVar) {
            this.f80411a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C62706j jVar = (C62706j) obj;
            if (jVar == null) {
                return;
            }
            if (jVar.f142163b) {
                ActivityC0945e activity = this.f80411a.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            String str = "";
            if (this.f80411a.getActivity() != null) {
                ActivityC0945e activity2 = this.f80411a.getActivity();
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                String string = activity2.getString(R.string.dcl);
                C89219l.m154716b(string, str);
                str = string;
            }
            this.f80411a.mo60278a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$m */
    static final class C33999m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C33985b f80413a;

        static {
            Covode.recordClassIndex(40931);
        }

        C33999m(C33985b bVar) {
            this.f80413a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C62697a aVar = (C62697a) obj;
            if (aVar != null) {
                if (aVar.f142133a) {
                    DialogC34009a aVar2 = this.f80413a.f80381c;
                    if (aVar2 == null) {
                        C89219l.m154710a("authLoading");
                    }
                    aVar2.show();
                }
                if (aVar.f142134b) {
                    this.f80413a.mo60282c(C34002b.m69592a(-2, C40798cx.f95519a, "", "", ""));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$i */
    static final class C33995i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C33985b f80409a;

        static {
            Covode.recordClassIndex(40927);
        }

        C33995i(C33985b bVar) {
            this.f80409a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            C62706j jVar = (C62706j) obj;
            if (jVar == null) {
                return;
            }
            if (jVar.f142163b) {
                C33985b bVar = this.f80409a;
                AuthCommonViewModel authCommonViewModel = bVar.f80379a;
                if (authCommonViewModel == null) {
                    C89219l.m154710a("viewModel");
                }
                String a = bVar.mo60275a();
                if (a == null) {
                    a = "";
                }
                int i = bVar.f80382d;
                C22349c.C22350a aVar = bVar.f80380b;
                if (aVar == null) {
                    C89219l.m154710a("request");
                }
                String a2 = C22337a.m42050a(aVar);
                C89219l.m154716b(a2, "");
                authCommonViewModel.mo60315a(a, i, a2, null, null, false);
                return;
            }
            C33985b bVar2 = this.f80409a;
            C62707k kVar = jVar.f142164c;
            if (kVar != null) {
                str = kVar.f142167c;
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            DialogC34009a aVar2 = bVar2.f80381c;
            if (aVar2 == null) {
                C89219l.m154710a("authLoading");
            }
            aVar2.hide();
            C17197a.C17200a a3 = new C17197a.C17200a(bVar2.getContext()).mo27189a(R.string.cyq);
            a3.f41071b = valueOf;
            a3.f41067M = false;
            a3.mo27190a(R.string.dki, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC33989c(bVar2), false).mo27193a().mo27185c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$l */
    static final class C33998l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C33985b f80412a;

        static {
            Covode.recordClassIndex(40930);
        }

        C33998l(C33985b bVar) {
            this.f80412a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            C62704h hVar = (C62704h) obj;
            if (hVar == null) {
                return;
            }
            if (hVar.f142157b) {
                ActivityC0945e activity = this.f80412a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f80412a.getContext(), "aweme://webview");
                C62705i iVar = hVar.f142158c;
                if (iVar != null) {
                    str2 = iVar.f142159a;
                } else {
                    str2 = null;
                }
                buildRoute.withParam(Uri.parse(str2)).withParam("hide_nav_bar", true).open();
                return;
            }
            C33985b bVar = this.f80412a;
            C62705i iVar2 = hVar.f142158c;
            if (iVar2 == null || (str = iVar2.f142161c) == null) {
                str = "error";
            }
            bVar.mo60278a(str);
        }
    }

    /* renamed from: a */
    public final void mo60278a(String str) {
        DialogC34009a aVar = this.f80381c;
        if (aVar == null) {
            C89219l.m154710a("authLoading");
        }
        aVar.hide();
        if (!TextUtils.isEmpty(str) && getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            new C79459a(activity).mo123052a(str).mo123053a();
        }
    }

    /* renamed from: b */
    public final void mo60280b(C22349c.C22351b bVar) {
        int i = C33977a.f80369d;
        int i2 = bVar.errorCode;
        String str = bVar.errorMsg;
        if (str == null) {
            str = "";
        }
        String a = mo60275a();
        String str2 = this.f80384f;
        if (str2 == null) {
            C89219l.m154710a("mTikTokSdkName");
        }
        String str3 = this.f80385g;
        if (str3 == null) {
            C89219l.m154710a("mTikTokSdkVersion");
        }
        String str4 = this.f80386h;
        if (str4 == null) {
            C89219l.m154710a("mCommonSdkName");
        }
        String str5 = this.f80387i;
        if (str5 == null) {
            C89219l.m154710a("mCommonSdkVersion");
        }
        C33977a.C33978a.m69576a(i, i2, str, a, str2, str3, str4, str5);
        mo60276a(bVar);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: c */
    public final void mo60282c(C22349c.C22351b bVar) {
        C89219l.m154721d(bVar, "");
        int i = C33977a.f80370e;
        String a = mo60275a();
        String str = this.f80384f;
        if (str == null) {
            C89219l.m154710a("mTikTokSdkName");
        }
        String str2 = this.f80385g;
        if (str2 == null) {
            C89219l.m154710a("mTikTokSdkVersion");
        }
        String str3 = this.f80386h;
        if (str3 == null) {
            C89219l.m154710a("mCommonSdkName");
        }
        String str4 = this.f80387i;
        if (str4 == null) {
            C89219l.m154710a("mCommonSdkVersion");
        }
        C33977a.C33978a.m69576a(i, 0, "", a, str, str2, str3, str4);
        mo60276a(bVar);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$g */
    static final class C33993g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C33985b f80407a;

        static {
            Covode.recordClassIndex(40925);
        }

        C33993g(C33985b bVar) {
            this.f80407a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C22342d dVar = (C22342d) obj;
            if (dVar == null) {
                return;
            }
            if (dVar.f52803t) {
                this.f80407a.f80389k = dVar;
                C33985b bVar = this.f80407a;
                if (bVar.f80390l && bVar.f80393o == null && bVar.f80394p == null) {
                    AuthCommonViewModel authCommonViewModel = bVar.f80379a;
                    if (authCommonViewModel == null) {
                        C89219l.m154710a("viewModel");
                    }
                    String str = bVar.f80391m;
                    C89219l.m154721d("", "");
                    C89219l.m154721d(str, "");
                    AuthCommonViewModel.C34036f fVar = new AuthCommonViewModel.C34036f(authCommonViewModel);
                    C89219l.m154721d("", "");
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(fVar, "");
                    C89219l.m154721d("", "");
                    C89219l.m154721d(str, "");
                    C34029a.f80478a.scanQrcode("", str).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo116431a_(new C33979a.C33984e(fVar));
                } else if (!dVar.f52797q || bVar.f80393o != null) {
                    AuthCommonViewModel authCommonViewModel2 = bVar.f80379a;
                    if (authCommonViewModel2 == null) {
                        C89219l.m154710a("viewModel");
                    }
                    String a = bVar.mo60275a();
                    if (a == null) {
                        a = "";
                    }
                    int i = bVar.f80382d;
                    C22349c.C22350a aVar = bVar.f80380b;
                    if (aVar == null) {
                        C89219l.m154710a("request");
                    }
                    String a2 = C22337a.m42050a(aVar);
                    C89219l.m154716b(a2, "");
                    authCommonViewModel2.mo60315a(a, i, a2, bVar.f80394p, bVar.f80393o, false);
                } else {
                    AuthCommonViewModel authCommonViewModel3 = bVar.f80379a;
                    if (authCommonViewModel3 == null) {
                        C89219l.m154710a("viewModel");
                    }
                    String a3 = bVar.mo60275a();
                    if (a3 == null) {
                        a3 = "";
                    }
                    int i2 = bVar.f80382d;
                    C22349c.C22350a aVar2 = bVar.f80380b;
                    if (aVar2 == null) {
                        C89219l.m154710a("request");
                    }
                    String a4 = C22337a.m42050a(aVar2);
                    C89219l.m154716b(a4, "");
                    authCommonViewModel3.mo60315a(a3, i2, a4, bVar.f80394p, bVar.f80393o, true);
                }
            } else {
                this.f80407a.mo60280b(C34002b.m69592a(dVar.f52804u, dVar.f52805v, "", "", ""));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$h */
    static final class C33994h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C33985b f80408a;

        static {
            Covode.recordClassIndex(40926);
        }

        C33994h(C33985b bVar) {
            this.f80408a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<C62703g> scopeList;
            C62700d dVar = (C62700d) obj;
            if (dVar != null) {
                Integer statusCode = dVar.getStatusCode();
                int i = -1;
                if (statusCode != null && statusCode.intValue() == 0) {
                    Boolean isLite = dVar.isLite();
                    if (isLite == null || !isLite.booleanValue()) {
                        C62701e pageDetail = dVar.getPageDetail();
                        String str = null;
                        if (pageDetail == null || (scopeList = pageDetail.getScopeList()) == null) {
                            Integer statusCode2 = dVar.getStatusCode();
                            if (statusCode2 != null) {
                                i = statusCode2.intValue();
                            }
                            this.f80408a.mo60280b(C34002b.m69592a(i, dVar.getStatusMsg(), "", "", ""));
                            return;
                        }
                        int size = scopeList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            str = C34001a.m69589a(str, i2, scopeList);
                        }
                        AuthCommonViewModel authCommonViewModel = this.f80408a.f80379a;
                        if (authCommonViewModel == null) {
                            C89219l.m154710a("viewModel");
                        }
                        C89219l.m154721d(scopeList, "");
                        authCommonViewModel.f80482c.postValue(C89070n.m154553a((Iterable) scopeList, (Comparator) new AuthCommonViewModel.C34037g()));
                        C33985b.m69578a(this.f80408a).f52812f = str;
                        Bundle arguments = this.f80408a.getArguments();
                        if (arguments == null) {
                            C89219l.m154715b();
                        }
                        arguments.putString("_bytedance_params_scope", str);
                        this.f80408a.mo60277a(dVar);
                        this.f80408a.mo60281b(dVar);
                        return;
                    }
                    this.f80408a.mo60277a(dVar);
                    this.f80408a.mo60281b(dVar);
                    return;
                }
                Integer statusCode3 = dVar.getStatusCode();
                if (statusCode3 != null) {
                    i = statusCode3.intValue();
                }
                this.f80408a.mo60280b(C34002b.m69592a(i, dVar.getStatusMsg(), "", "", ""));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$j */
    static final class C33996j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C33985b f80410a;

        static {
            Covode.recordClassIndex(40928);
        }

        C33996j(C33985b bVar) {
            this.f80410a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C22340b bVar = (C22340b) obj;
            if (bVar == null) {
                return;
            }
            if (bVar.f52803t) {
                C22349c.C22351b a = C34002b.m69592a(0, bVar.f52805v, C33985b.m69578a(this.f80410a).f52812f, bVar.f52780a, C33985b.m69578a(this.f80410a).f52807a);
                C33985b bVar2 = this.f80410a;
                int i = C33977a.f80368c;
                String a2 = bVar2.mo60275a();
                String str = bVar2.f80384f;
                if (str == null) {
                    C89219l.m154710a("mTikTokSdkName");
                }
                String str2 = bVar2.f80385g;
                if (str2 == null) {
                    C89219l.m154710a("mTikTokSdkVersion");
                }
                String str3 = bVar2.f80386h;
                if (str3 == null) {
                    C89219l.m154710a("mCommonSdkName");
                }
                String str4 = bVar2.f80387i;
                if (str4 == null) {
                    C89219l.m154710a("mCommonSdkVersion");
                }
                C33977a.C33978a.m69576a(i, 0, "", a2, str, str2, str3, str4);
                C33744d a3 = new C33744d().mo59983a("auth_app", bVar2.f80388j).mo59983a("channel", bVar2.mo60275a()).mo59982a("is_login", (Object) true);
                C22349c.C22350a aVar = bVar2.f80380b;
                if (aVar == null) {
                    C89219l.m154710a("request");
                }
                C39162r.m79460a("auth_success", a3.mo59983a("auth_scope", aVar.f52812f).mo59983a("disabled_scope", bVar2.f80392n).mo59980a("is_mobile_show", 0).mo59980a("is_mobile", 0).mo59983a("platform", "native_click").mo59983a("enter_method", "android").mo59980a("is_register", C33985b.m69580c() ? 1 : 0).f79943a);
                bVar2.mo60276a(a);
                ActivityC0945e activity = bVar2.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.f80410a.mo60280b(C34002b.m69592a(bVar.f52804u, bVar.f52805v, "", "", ""));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.authorize.b$n */
    public static final class C34000n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C33985b f80414a;

        static {
            Covode.recordClassIndex(40932);
        }

        C34000n(C33985b bVar) {
            this.f80414a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
            if (r0.booleanValue() != false) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
            if (r0.booleanValue() == false) goto L_0x0030;
         */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r6) {
            /*
            // Method dump skipped, instructions count: 170
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.authorize.C33985b.C34000n.onChanged(java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60276a(C22349c.C22351b bVar) {
        C22349c.C22350a aVar = this.f80380b;
        if (aVar == null) {
            C89219l.m154710a("request");
        }
        String callerPackage = aVar.getCallerPackage();
        C22349c.C22350a aVar2 = this.f80380b;
        if (aVar2 == null) {
            C89219l.m154710a("request");
        }
        String str = aVar2.callerLocalEntry;
        if (!TextUtils.isEmpty(callerPackage) && !TextUtils.isEmpty(str) && bVar.checkArgs()) {
            C89219l.m154716b(callerPackage, "");
            if (this.f80383e != null) {
                Context context = getContext();
                String str2 = this.f80383e;
                if (!TextUtils.isEmpty(callerPackage) && !TextUtils.isEmpty(str2) && context != null) {
                    List<String> a = C22353b.m42071a(context, callerPackage);
                    if (a != null && a.size() > 0) {
                        Iterator<String> it = a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (str2.equalsIgnoreCase(it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (context.getApplicationInfo().targetSdkVersion < 30) {
                        return;
                    }
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bVar.toBundle(bundle);
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(callerPackage, str));
            intent.putExtras(bundle);
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            try {
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo60281b(C62700d dVar) {
        C62698b checkResult = dVar.getCheckResult();
        if (checkResult != null) {
            C17197a.C17200a aVar = new C17197a.C17200a(getContext());
            aVar.f41071b = checkResult.getResultMsg();
            C17197a.C17200a a = aVar.mo27190a(R.string.as_, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC33991e.f80405a, false);
            a.f41083n = new DialogInterface$OnDismissListenerC33990d(checkResult, this);
            a.mo27193a().mo27185c();
        }
    }

    /* renamed from: a */
    public final void mo60277a(C62700d dVar) {
        boolean z;
        if (getArguments() == null) {
            mo60280b(C34002b.m69592a(-1, "", "", "", ""));
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        arguments.putSerializable("auth_page_info", dVar);
        DialogC34009a aVar = this.f80381c;
        if (aVar == null) {
            C89219l.m154710a("authLoading");
        }
        aVar.dismiss();
        Boolean isLite = dVar.isLite();
        if (isLite != null) {
            z = isLite.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            Bundle arguments2 = getArguments();
            String str = this.f80383e;
            C34010d dVar2 = new C34010d();
            if (arguments2 != null) {
                arguments2.putString("caller_signature_key", str);
            }
            dVar2.setArguments(arguments2);
            f80377q = dVar2;
            AbstractC0976n a = getChildFragmentManager().mo3552a();
            Fragment fragment = f80377q;
            if (fragment == null) {
                C89219l.m154715b();
            }
            a.mo3453a(R.id.b8g, fragment).mo3473c();
        } else if (this.f80393o != null) {
            Bundle arguments3 = getArguments();
            String str2 = this.f80383e;
            C34019f fVar = new C34019f();
            if (arguments3 != null) {
                arguments3.putString("caller_signature_key", str2);
            }
            fVar.setArguments(arguments3);
            f80377q = fVar;
            AbstractC0976n a2 = getChildFragmentManager().mo3552a();
            Fragment fragment2 = f80377q;
            if (fragment2 == null) {
                C89219l.m154715b();
            }
            a2.mo3453a(R.id.b8g, fragment2).mo3473c();
        } else {
            f80377q = C34003c.C34004a.m69596a(getArguments(), this.f80383e);
            AbstractC0976n a3 = getChildFragmentManager().mo3552a();
            Fragment fragment3 = f80377q;
            if (fragment3 == null) {
                C89219l.m154715b();
            }
            a3.mo3453a(R.id.b8g, fragment3).mo3473c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        super.onCreate(bundle);
        this.f80395s = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f80395s;
        if (awemeAuthorizePlatformDepend == null) {
            C89219l.m154710a("depend");
        }
        this.f80396t = new C22338b(context, awemeAuthorizePlatformDepend);
        this.f80380b = new C22349c.C22350a(getArguments());
        Bundle arguments = getArguments();
        String str8 = null;
        if (arguments != null) {
            bundle2 = arguments.getBundle("_bytedance_params_extra");
        } else {
            bundle2 = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("_aweme_params_caller_open_sdk_common_name")) == null) {
            str = "";
        }
        this.f80386h = str;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("_aweme_params_caller_open_sdk_common_version")) == null) {
            str2 = "";
        }
        this.f80387i = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str3 = arguments4.getString("_aweme_params_caller_open_sdk_name")) == null) {
            str3 = "";
        }
        this.f80384f = str3;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str4 = arguments5.getString("_aweme_params_caller_open_sdk_version")) == null) {
            str4 = "";
        }
        this.f80385g = str4;
        boolean z = false;
        if (bundle2 != null) {
            i = bundle2.getInt("authType");
        } else {
            i = 0;
        }
        this.f80382d = i;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z = arguments6.getBoolean("key_qrcode_auth", false);
        }
        this.f80390l = z;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (str5 = arguments7.getString("key_qrcode_token")) == null) {
            str5 = "";
        }
        this.f80391m = str5;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            str6 = arguments8.getString("key_qrcode_bc_params");
        } else {
            str6 = null;
        }
        this.f80393o = str6;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            str7 = arguments9.getString("key_qrcode_redirect_uri");
        } else {
            str7 = null;
        }
        this.f80394p = str7;
        Bundle arguments10 = getArguments();
        if (arguments10 != null) {
            str8 = arguments10.getString("caller_signature_key");
        }
        this.f80383e = str8;
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f80395s;
        if (awemeAuthorizePlatformDepend2 == null) {
            C89219l.m154710a("depend");
        }
        AbstractC22335a.AbstractC22336a aVar = this.f80396t;
        if (aVar == null) {
            C89219l.m154710a("model");
        }
        C22349c.C22350a aVar2 = this.f80380b;
        if (aVar2 == null) {
            C89219l.m154710a("request");
        }
        C34038a aVar3 = new C34038a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        AbstractC1174ac a = C1181ae.m3881a(activity, aVar3).mo3983a(AuthCommonViewModel.class);
        C89219l.m154716b(a, "");
        this.f80379a = (AuthCommonViewModel) a;
        Context context2 = getContext();
        if (context2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context2, "");
        String string = getString(R.string.g1j);
        C89219l.m154716b(string, "");
        this.f80381c = new DialogC34009a(context2, string);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.authorize.b$e */
    public static final class DialogInterface$OnClickListenerC33991e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC33991e f80405a = new DialogInterface$OnClickListenerC33991e();

        static {
            Covode.recordClassIndex(40923);
        }

        DialogInterface$OnClickListenerC33991e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$c */
    static final class DialogInterface$OnClickListenerC33989c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33985b f80402a;

        static {
            Covode.recordClassIndex(40921);
        }

        DialogInterface$OnClickListenerC33989c(C33985b bVar) {
            this.f80402a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ActivityC0945e activity = this.f80402a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DialogC34009a aVar = this.f80381c;
        if (aVar == null) {
            C89219l.m154710a("authLoading");
        }
        aVar.show();
        if (C31575b.m65865g() != null) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                if (g2.isChildrenMode()) {
                    Context context = getContext();
                    if (context != null) {
                        C89219l.m154716b(context, "");
                        C23013a a = C23028c.m43435a(new C23023b(context).mo37413d("This feature is not available for your account due to the age restriction. Try using another account."), new C33987b(this)).mo37405a();
                        if (a != null) {
                            a.mo37396b().show();
                        }
                    }
                } else {
                    m69579a(0);
                }
            } else {
                C33048q.m67695d(true);
                IAccountUserService g3 = C31575b.m65865g();
                IAccountUserService g4 = C31575b.m65865g();
                C89219l.m154716b(g4, "");
                g3.delete(g4.getCurUserId(), "authorize");
                this.f80397u.postDelayed(new RunnableC33992f(this), 1500);
            }
        } else {
            m69579a(-1);
        }
        AuthCommonViewModel authCommonViewModel = this.f80379a;
        if (authCommonViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel.f80480a.observe(this, new C33993g(this));
        AuthCommonViewModel authCommonViewModel2 = this.f80379a;
        if (authCommonViewModel2 == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel2.f80481b.observe(this, new C33994h(this));
        AuthCommonViewModel authCommonViewModel3 = this.f80379a;
        if (authCommonViewModel3 == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel3.f80485f.observe(this, new C33995i(this));
        AuthCommonViewModel authCommonViewModel4 = this.f80379a;
        if (authCommonViewModel4 == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel4.f80483d.observe(this, new C33996j(this));
        AuthCommonViewModel authCommonViewModel5 = this.f80379a;
        if (authCommonViewModel5 == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel5.f80484e.observe(this, new C33997k(this));
        AuthCommonViewModel authCommonViewModel6 = this.f80379a;
        if (authCommonViewModel6 == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel6.f80487h.observe(this, new C33998l(this));
        AuthCommonViewModel authCommonViewModel7 = this.f80379a;
        if (authCommonViewModel7 == null) {
            C89219l.m154710a("viewModel");
        }
        authCommonViewModel7.f80486g.observe(this, new C33999m(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2001) {
            int i3 = -1;
            if (i2 == -1 && !this.f80398v && !C80580in.m139687c()) {
                i3 = 0;
            }
            m69579a(i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(9943);
        C89219l.m154721d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.b0, (ViewGroup) null);
        MethodCollector.m26664o(9943);
        return inflate;
    }
}
