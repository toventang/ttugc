package com.p2082ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.p1199e.C17226a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.AbstractC34266aw;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.buildconfigdiff.C34948a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.deeplink.C41061r;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.sertting.C67840a;
import com.p2082ss.android.ugc.aweme.sertting.C67841b;
import com.p2082ss.android.ugc.aweme.sertting.PersonalizationModel;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.deeplink.n */
public final class C41051n {

    /* renamed from: a */
    public static final C41052a f95961a = new C41052a((byte) 0);

    static {
        Covode.recordClassIndex(48921);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.n$a */
    public static final class C41052a {
        static {
            Covode.recordClassIndex(48922);
        }

        private C41052a() {
        }

        /* renamed from: a */
        public static boolean m82696a() {
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
            return createIMainServicebyMonsterPlugin.isAppHot();
        }

        /* renamed from: b */
        public static List<AbstractC34266aw> m82700b() {
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
            List<AbstractC34266aw> deeplinkCommands = createIMainServicebyMonsterPlugin.getDeeplinkCommands();
            C89219l.m154716b(deeplinkCommands, "");
            return deeplinkCommands;
        }

        public /* synthetic */ C41052a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m82697a(Activity activity) {
            String[] strArr;
            C89219l.m154721d(activity, "");
            String a = C58071d.m104907a();
            try {
                strArr = (String[]) SettingsManager.m29616a().mo25396a("app_action_allowlist", String[].class);
                if (strArr == null) {
                    strArr = new String[]{"US"};
                }
            } catch (Throwable unused) {
                strArr = new String[]{"US"};
            }
            for (String str : strArr) {
                if (TextUtils.equals(a, str)) {
                    return false;
                }
            }
            if (!m82696a()) {
                Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(activity);
                mainActivityIntent.putExtra("app_action_restricted", true);
                m82695a(activity, mainActivityIntent);
            } else {
                Context a2 = C17867d.m33078a();
                new C17226a(a2, a2.getString(R.string.bu1), 3, C17226a.m31792b()).mo27250a();
            }
            return true;
        }

        /* renamed from: a */
        public static boolean m82698a(Uri uri) {
            if (uri == null) {
                return false;
            }
            String a = C89219l.m154704a(uri.getHost(), (Object) uri.getPath());
            if (!TextUtils.isEmpty(a) && C67841b.m120036a() != null) {
                String str = null;
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.contains("sharer_biz")) {
                    str = uri.getQueryParameter("sharer_biz");
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                C67840a[] a2 = C67841b.m120036a();
                if (a2 == null) {
                    C89219l.m154715b();
                }
                for (C67840a aVar : a2) {
                    if (Pattern.compile(aVar.f152037a).matcher(a).matches()) {
                        for (PersonalizationModel personalizationModel : aVar.f152038b) {
                            if (TextUtils.equals(str, personalizationModel.getBizName())) {
                                personalizationModel.getNeedPersonalization();
                                if (personalizationModel.getNeedPersonalization()) {
                                    C41039c.f95936i = true;
                                }
                                return personalizationModel.getNeedPersonalization();
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public static String m82694a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static void m82695a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.deeplink.n$a$b */
        public static final class DialogInterface$OnClickListenerC41054b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f95968a;

            /* renamed from: b */
            final /* synthetic */ String f95969b;

            /* renamed from: c */
            final /* synthetic */ String f95970c;

            /* renamed from: d */
            final /* synthetic */ String f95971d;

            static {
                Covode.recordClassIndex(48924);
            }

            DialogInterface$OnClickListenerC41054b(String str, String str2, String str3, String str4) {
                this.f95968a = str;
                this.f95969b = str2;
                this.f95970c = str3;
                this.f95971d = str4;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    C39162r.m79460a("2131828423", new C33744d().mo59983a("rule_id", this.f95968a).mo59983a("push_label", this.f95969b).mo59983a("anchor_id", this.f95970c).mo59983a("room_id", this.f95971d).f79943a);
                    dialogInterface.dismiss();
                }
            }
        }

        /* renamed from: a */
        public static boolean m82699a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str3 : C34948a.f82434a) {
                if (TextUtils.equals(str, str3)) {
                    return true;
                }
            }
            if (str == null || str2 == null || !C89361p.m154876c(str, ".tiktok.com", false) || !C89361p.m154874b(str2, "/t/", false)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m82701b(String str, String str2) {
            if (str2 != null && C89361p.m154874b(str2, "/t/", false)) {
                return false;
            }
            String[] a = C41061r.C41062a.m82720a();
            int i = 0;
            while (!C89219l.m154714a((Object) a[i], (Object) str)) {
                i++;
                if (i >= 34) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.deeplink.n$a$a */
        public static final class DialogInterface$OnClickListenerC41053a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f95962a;

            /* renamed from: b */
            final /* synthetic */ String f95963b;

            /* renamed from: c */
            final /* synthetic */ String f95964c;

            /* renamed from: d */
            final /* synthetic */ String f95965d;

            /* renamed from: e */
            final /* synthetic */ Context f95966e;

            /* renamed from: f */
            final /* synthetic */ Intent f95967f;

            static {
                Covode.recordClassIndex(48923);
            }

            DialogInterface$OnClickListenerC41053a(String str, String str2, String str3, String str4, Context context, Intent intent) {
                this.f95962a = str;
                this.f95963b = str2;
                this.f95964c = str3;
                this.f95965d = str4;
                this.f95966e = context;
                this.f95967f = intent;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Class<? extends Activity> deepLinkHandlerActivityClass;
                String str;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    C39162r.m79460a("2131828424", new C33744d().mo59983a("rule_id", this.f95962a).mo59983a("push_label", this.f95963b).mo59983a("anchor_id", this.f95964c).mo59983a("room_id", this.f95965d).f79943a);
                }
                Context context = this.f95966e;
                if (context instanceof Activity) {
                    Intent intent = this.f95967f;
                    Activity activity = (Activity) context;
                    C89219l.m154721d(activity, "");
                    if (!(intent == null || intent.getData() == null)) {
                        if (C89219l.m154714a((Object) "from_deep_link", (Object) "from_app_link")) {
                            deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppLinkHandlerActivityClass(true);
                        } else {
                            deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeepLinkHandlerActivityClass(true);
                        }
                        Intent intent2 = new Intent(activity, deepLinkHandlerActivityClass);
                        Uri data = intent.getData();
                        if (data != null) {
                            str = data.toString();
                        } else {
                            str = null;
                        }
                        C29844g gVar = new C29844g(str);
                        gVar.mo52130a("random", new Random(1000).toString());
                        intent2.setData(Uri.parse(gVar.mo52126a()));
                        intent2.putExtras(intent);
                        intent2.putExtra("inner_from", "require_login");
                        C41052a.m82695a(activity, intent2);
                    }
                    ((Activity) this.f95966e).finish();
                }
            }
        }
    }
}
