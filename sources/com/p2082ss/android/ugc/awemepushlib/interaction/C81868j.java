package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.wschannel.C13642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.common.push.account.C17069a;
import com.bytedance.ies.ugc.statisticlogger.config.C18220b;
import com.bytedance.ies.ugc.statisticlogger.config.EnumC18224c;
import com.bytedance.push.frontier.C21810b;
import com.bytedance.push.frontier.p1595b.C21811a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.awemepushlib.manager.C81900a;
import com.p2082ss.android.ugc.awemepushlib.p4245a.C81806a;
import com.p2082ss.android.ugc.awemepushlib.p4245a.C81818b;
import com.p2082ss.android.ugc.awemepushlib.p4246b.C81819a;
import com.p2082ss.android.ugc.awemepushlib.p4249di.C81826a;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.j */
public class C81868j {

    /* renamed from: a */
    static int f183030a;

    /* renamed from: b */
    static C81826a f183031b;

    /* renamed from: c */
    static Handler f183032c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static int f183033d;

    static {
        Covode.recordClassIndex(95282);
    }

    /* renamed from: a */
    public static void m141782a(Context context) {
        C18220b.f43409a.mo143268a(new AbstractC88438k<EnumC18224c>() {
            /* class com.p2082ss.android.ugc.awemepushlib.interaction.C81868j.C818735 */

            static {
                Covode.recordClassIndex(95287);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88438k
            /* renamed from: a */
            public final /* synthetic */ boolean mo7718a(EnumC18224c cVar) {
                return EnumC18224c.Local.equals(cVar);
            }
        }).mo143289d(new C81879n(context));
    }

    /* renamed from: b */
    static void m141783b(final Context context) {
        StringBuilder sb = new StringBuilder("method_push_start_frontier_push");
        int i = f183033d;
        f183033d = i + 1;
        C81859c.m141752a(sb.append(i).toString());
        C21810b a = C21810b.m40841a(context);
        a.f51683c.compareAndSet(null, C81819a.f182953a);
        C21810b a2 = C21810b.m40841a(context);
        String curSecUserId = C31575b.m65865g().getCurSecUserId();
        if (!TextUtils.isEmpty(curSecUserId)) {
            a2.f51686f = curSecUserId;
        }
        C31575b.m65865g().addUserChangeListener(new IAccountUserService.AbstractC31278a() {
            /* class com.p2082ss.android.ugc.awemepushlib.interaction.C81868j.C818746 */

            static {
                Covode.recordClassIndex(95288);
            }

            @Override // com.p2082ss.android.ugc.aweme.IAccountUserService.AbstractC31278a
            /* renamed from: a */
            public final void mo57195a(int i, User user, User user2) {
                String str;
                C13642a a;
                if (user2 != null) {
                    str = user2.getSecUid();
                } else {
                    str = "";
                }
                if (user == null || !TextUtils.equals(str, user.getSecUid())) {
                    C21810b a2 = C21810b.m40841a(context);
                    if (!TextUtils.equals(a2.f51686f, str)) {
                        a2.f51686f = str;
                        if (a2.f51683c.get() != null && (a2.f51683c.get() instanceof C21811a)) {
                            C21811a aVar = (C21811a) a2.f51683c.get();
                            if (!TextUtils.equals(aVar.f51692c, str)) {
                                aVar.f51692c = str;
                                if (aVar.f51691b != null && (a = aVar.mo35493a(aVar.f51690a)) != null) {
                                    aVar.f51691b.mo22105a(a);
                                }
                            }
                        }
                    }
                }
            }
        });
        if (!((Boolean) C81806a.f182932d.getValue()).booleanValue() && !C81818b.f182952a) {
            C81900a.m141823a().mo125561f(context);
            System.out.println();
        }
        C81859c.m141753b("method_push_start_frontier_push");
    }

    /* renamed from: c */
    static final /* synthetic */ Object m141784c(Context context) {
        C17069a aVar = new C17069a(new C17069a.C17070a(context), (byte) 0);
        if (aVar.f40624a != null) {
            try {
                String packageName = aVar.f40624a.getPackageName();
                String string = aVar.f40624a.getString(aVar.f40624a.getApplicationInfo().labelRes);
                if (!TextUtils.isEmpty(string)) {
                    if (!TextUtils.isEmpty(packageName)) {
                        Account account = new Account(string, packageName);
                        if (AccountManager.get(aVar.f40624a).addAccountExplicitly(account, null, null)) {
                            ContentResolver.setIsSyncable(account, aVar.mo26966a(), 1);
                            ContentResolver.setSyncAutomatically(account, aVar.mo26966a(), true);
                            ContentResolver.addPeriodicSync(account, aVar.mo26966a(), new Bundle(), 900);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
