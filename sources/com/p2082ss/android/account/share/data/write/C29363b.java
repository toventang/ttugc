package com.p2082ss.android.account.share.data.write;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.google.gson.C27910f;
import com.p2082ss.android.account.share.data.C29356a;
import com.p2082ss.android.account.share.data.write.C29361a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.account.share.data.write.b */
public final class C29363b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f69708a = {new C89232y(C89204ab.m154669a(C29363b.class), "gson", "getGson()Lcom/google/gson/Gson;")};

    /* renamed from: b */
    public static C29367d f69709b = new C29367d();

    /* renamed from: c */
    public static boolean f69710c;

    /* renamed from: d */
    public static Context f69711d;

    /* renamed from: e */
    public static final AbstractC89244h f69712e = C89250i.m154773a((AbstractC89171a) C29364a.f69714a);

    /* renamed from: f */
    public static final C29363b f69713f = new C29363b();

    private C29363b() {
    }

    /* renamed from: com.ss.android.account.share.data.write.b$a */
    static final class C29364a extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C29364a f69714a = new C29364a();

        static {
            Covode.recordClassIndex(35754);
        }

        C29364a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    static {
        Covode.recordClassIndex(35753);
    }

    /* renamed from: com.ss.android.account.share.data.write.b$b */
    static final class RunnableC29365b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f69715a;

        /* renamed from: b */
        final /* synthetic */ String f69716b = null;

        /* renamed from: c */
        final /* synthetic */ String f69717c;

        /* renamed from: d */
        final /* synthetic */ String f69718d;

        static {
            Covode.recordClassIndex(35755);
        }

        RunnableC29365b(Context context, String str, String str2, String str3) {
            this.f69715a = context;
            this.f69717c = str2;
            this.f69718d = str3;
        }

        public final void run() {
            Account[] accountArr;
            try {
                AccountManager accountManager = AccountManager.get(this.f69715a);
                String str = this.f69716b;
                if (str == null) {
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    str = this.f69715a.getPackageName();
                    C89219l.m154709a((Object) str, "");
                }
                Pair<Boolean, Object> a = C15346a.m28238a(accountManager, new Object[]{str}, 102501, "android.accounts.Account[]", false, null);
                if (((Boolean) a.first).booleanValue()) {
                    accountArr = (Account[]) a.second;
                } else {
                    accountArr = accountManager.getAccountsByType(str);
                    C15346a.m28240a(accountArr, accountManager, new Object[]{str}, 102501, "com_ss_android_account_share_data_write_SecShareDataWriteManager$save2AccountManager$1_android_accounts_AccountManager_getAccountsByType(Landroid/accounts/AccountManager;Ljava/lang/String;)[Landroid/accounts/Account;");
                }
                if (accountArr != null) {
                    for (Account account : accountArr) {
                        AccountManager.get(this.f69715a).setUserData(account, this.f69717c, this.f69718d);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                C29356a.m58786a().mo51314a("share_sdk_save_account_info_failed").mo51315a("err_msg", e.getMessage()).mo51315a("err_msg_stack", Log.getStackTraceString(e)).mo51316b();
            }
        }
    }

    /* renamed from: a */
    public static boolean m58797a(String str) {
        String str2;
        if (!f69710c) {
            C29356a.m58786a().mo51314a("share_sdk_no_init").mo51316b();
            return false;
        }
        String str3 = "";
        if (!TextUtils.isEmpty(str) && f69710c && C89070n.m154556a((Iterable) f69709b.f69720a.keySet(), (Object) str)) {
            Context context = f69711d;
            if (context == null) {
                C89219l.m154710a("mContext");
            }
            if (str == null) {
                C89219l.m154707a();
            }
            String a = C29366c.m58798a(context, str);
            if (a == null) {
                a = str3;
            }
            if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(f69709b.f69720a.get(str))) {
                String lowerCase = a.toLowerCase();
                C89219l.m154709a((Object) lowerCase, str3);
                String str4 = f69709b.f69720a.get(str);
                if (str4 != null) {
                    str2 = str4.toLowerCase();
                    C89219l.m154709a((Object) str2, str3);
                } else {
                    str2 = null;
                }
                if (C89219l.m154714a((Object) lowerCase, (Object) str2)) {
                    return true;
                }
            }
            str3 = a;
        }
        C29356a.m58786a().mo51314a("share_sdk_check_pkg_sign_failed").mo51315a("pkg_name", str).mo51315a("pkg_sign", str3).mo51316b();
        return false;
    }

    /* renamed from: a */
    public static void m58796a(Context context, String str, String str2) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        RunnableC13596e.m24423a(new RunnableC29365b(context, null, str, str2));
        C29361a a = C29361a.C29362a.m58794a(context);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        SharedPreferences.Editor edit = C34822d.m71158a(a.f69707b, a.f69706a, 0).edit();
        C89219l.m154709a((Object) edit, "");
        edit.putString(str, str2).apply();
    }
}
