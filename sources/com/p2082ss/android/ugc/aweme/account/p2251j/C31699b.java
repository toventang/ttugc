package com.p2082ss.android.ugc.aweme.account.p2251j;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22290c;
import com.bytedance.sdk.p1625a.p1643f.C22374d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.sdk.p2174a.C30224c;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.C81775y;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.login.DialogC31962m;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2250i.C31688b;
import com.p2082ss.android.ugc.aweme.account.p2251j.C31692a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32842e;
import com.p2082ss.android.ugc.aweme.account.util.C33043l;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.login.C58966l;
import com.p2082ss.android.ugc.aweme.p2232ac.C31366b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.j.b */
public class C31699b {

    /* renamed from: a */
    static final String f75822a = "https://api.tiktokv.com/aweme/v1/check/out/";

    /* renamed from: c */
    private static volatile C31699b f75823c;

    /* renamed from: b */
    public IAccountUserService f75824b = C36085cj.f85262b.mo57069e();

    /* renamed from: d */
    private AbstractC22329e f75825d;

    static {
        Covode.recordClassIndex(38433);
    }

    private C31699b() {
    }

    /* renamed from: a */
    public static C31699b m66032a() {
        MethodCollector.m26663i(10194);
        if (f75823c == null) {
            synchronized (C31699b.class) {
                try {
                    if (f75823c == null) {
                        f75823c = new C31699b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10194);
                    throw th;
                }
            }
        }
        C31699b bVar = f75823c;
        MethodCollector.m26664o(10194);
        return bVar;
    }

    /* renamed from: a */
    public final void mo57677a(final String str, boolean z, boolean z2) {
        String str2;
        final DialogC31962m mVar;
        final String b = C36085cj.m73548b();
        final boolean c = C80580in.m139687c();
        final Activity j = C17873f.m33102j();
        HashMap hashMap = new HashMap();
        String str3 = "1";
        if (C36085cj.f85262b.mo57069e().isLogin()) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        hashMap.put("user_was_login", str2);
        if (!z2) {
            str3 = "0";
        }
        hashMap.put("force_logout", str3);
        if (!z || j == null) {
            mVar = null;
        } else {
            mVar = new DialogC31962m(j);
        }
        C80273bt.m139145a(mVar);
        if (this.f75825d == null) {
            this.f75825d = C22374d.m42169a(C31291a.f74991a);
        }
        this.f75825d.mo36654a(str, hashMap, new AbstractC22288a<C22290c>() {
            /* class com.p2082ss.android.ugc.aweme.account.p2251j.C31699b.C317012 */

            static {
                Covode.recordClassIndex(38435);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a
            /* renamed from: a */
            public final /* synthetic */ void mo36605a(C22290c cVar) {
                final C22290c cVar2 = cVar;
                C80273bt.m139146b(mVar);
                String str = "";
                if (cVar2.f52713b) {
                    if (C33048q.m67686a(C31692a.f75805d) != -1) {
                        C33048q.m67692c().edit().remove("ftc_age_gate_response_mode".concat(String.valueOf(C31692a.f75805d))).apply();
                    }
                    if (C31566h.m65847a(C31692a.f75805d) != -1) {
                        String str2 = C31692a.f75805d;
                        C89219l.m154721d(str2, str);
                        C31566h.f75505d.remove(str2);
                    }
                    AppLog.setUserId(0);
                    AppLog.setSessionKey(C31699b.this.f75824b.getSessionKey());
                    C30223b bVar = C30223b.f72086a;
                    Application application = C31291a.f74991a;
                    for (C30224c cVar3 : bVar.f72088c) {
                        cVar3.f72104o = false;
                    }
                    bVar.mo53666a(application);
                    if (j != null) {
                        C0998a.m3454a(C31291a.f74991a).mo3694a(new Intent(j, C58966l.class));
                    }
                    C31699b.this.f75824b.clear("logout");
                    C32842e.C32843a.m67420a(0, str, 0, str);
                    C39162r.m79460a("uc_user_logout_result", new C31376a().mo57399a("status", "success").mo57399a("params_for_special", "uc_login").mo57399a("fail_info", str).mo57397a("error_code", 0).mo57399a("uid", b).mo57399a("logout_from", str).f75156a);
                    if (C31699b.this.f75824b.allUidList().size() <= 0 || !C36085cj.m73553g().isEnableMultiAccountLogin()) {
                        C36085cj.m73551e();
                        C36085cj.m73545a(true);
                        if (c) {
                            C39223a.m79603q().mo68627a(false, RunnableC31705e.f75840a);
                        } else {
                            C81775y.m141657a(new C80222ap().mo123649a("previous_uid", C31692a.f75805d).f179700a, new C31366b(false));
                        }
                        C31692a.f75805d = str;
                        Keva.getRepo("google_onetap").storeBoolean("logged_out", true);
                        Keva.getRepo("aweme_account_keva").storeLong("last_logout_time", System.currentTimeMillis());
                    } else {
                        List<String> allUidList = C31692a.m66023a().allUidList();
                        C31692a.f75804c = allUidList;
                        if (allUidList == null) {
                            C89219l.m154715b();
                        }
                        C31692a.f75803b = C89070n.m154517a((List) allUidList);
                        if (C31692a.f75802a) {
                            List<String> list = C31692a.f75804c;
                            if (list == null) {
                                C89219l.m154715b();
                            }
                            list.size();
                            String.valueOf(C31692a.f75804c);
                        }
                        List<String> list2 = C31692a.f75804c;
                        if (list2 == null) {
                            C89219l.m154715b();
                        }
                        String str3 = (String) C89070n.m154586h((List) list2);
                        IAccountUserService a = C31692a.m66023a();
                        C89219l.m154716b(a, str);
                        String curUserId = a.getCurUserId();
                        C89219l.m154716b(curUserId, str);
                        C31688b.m66015a(curUserId, str3, String.valueOf(C31692a.f75804c), "after logout");
                        if (C31692a.f75803b >= 0) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("need_restart", true);
                            C31692a.m66024a(str3, bundle, true, false, new C31692a.C31697c());
                        }
                    }
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            Keva repo = Keva.getRepo("user_logout_log");
                            if (System.currentTimeMillis() - repo.getLong("last_time", 0) > 172800000) {
                                repo.clear();
                            }
                            repo.storeInt(str, repo.getInt(str, 0) + 1);
                            repo.storeLong("last_time", System.currentTimeMillis());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    C31376a a2 = new C31376a().mo57399a("status", "fail");
                    if (!TextUtils.isEmpty(cVar2.f52717f)) {
                        str = cVar2.f52717f;
                    }
                    C39162r.m79460a("uc_user_logout_result", a2.mo57399a("fail_info", str).mo57397a("error_code", cVar2.f52715d).mo57399a("params_for_special", "uc_login").mo57399a("uid", b).mo57399a("logout_from", str).f75156a);
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(cVar2.f52717f)) {
                        sb.append(cVar2.f52717f).append("|");
                    }
                    if (!TextUtils.isEmpty(cVar2.f52718g)) {
                        sb.append(cVar2.f52718g);
                    }
                    C32842e.C32843a.m67420a(1, "passport logout", cVar2.f52715d, sb.toString());
                    C36085cj.m73545a(false);
                    if (cVar2.f52715d == 1346 || cVar2.f52715d == 1363) {
                        C31706f.m66037a(j, cVar2.f52717f, new AbstractC34543f() {
                            /* class com.p2082ss.android.ugc.aweme.account.p2251j.C31699b.C317012.C317021 */

                            static {
                                Covode.recordClassIndex(38436);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                            /* renamed from: a */
                            public final void mo57673a() {
                                C31699b.this.mo57677a(str, true, false);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                            /* renamed from: b */
                            public final void mo57674b() {
                                if (cVar2.f52715d == 1363) {
                                    C31699b.this.mo57677a(str, true, true);
                                }
                            }
                        }, "settings_page", "log_out_bind");
                    } else {
                        new C79459a(C31291a.f74991a).mo123052a(C33043l.m67677a(cVar2)).mo123053a();
                    }
                }
            }
        });
    }
}
