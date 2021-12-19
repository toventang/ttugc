package com.p2082ss.android.deviceregister.p2138c;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;

/* renamed from: com.ss.android.deviceregister.c.b */
public final class C29891b {

    /* renamed from: a */
    public static Account f71329a;

    static {
        Covode.recordClassIndex(36301);
    }

    /* renamed from: b */
    static String m60258b(Context context) {
        try {
            return AccountManager.get(context).getUserData(m60257a(context), "new_user_mode_account");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static Account m60257a(Context context) {
        String str;
        Account[] accountsByType;
        Account account = f71329a;
        if (account != null) {
            return account;
        }
        AccountManager accountManager = AccountManager.get(context);
        String packageName = context.getPackageName();
        try {
            str = context.getString(context.getApplicationInfo().labelRes);
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(packageName)) {
            return null;
        }
        int i = 0;
        Pair<Boolean, Object> a = C15346a.m28238a(accountManager, new Object[]{packageName}, 102501, "android.accounts.Account[]", false, null);
        if (((Boolean) a.first).booleanValue()) {
            accountsByType = (Account[]) a.second;
        } else {
            accountsByType = accountManager.getAccountsByType(packageName);
            C15346a.m28240a(accountsByType, accountManager, new Object[]{packageName}, 102501, "com_ss_android_deviceregister_newusermode_NewUserModeUtil_android_accounts_AccountManager_getAccountsByType(Landroid/accounts/AccountManager;Ljava/lang/String;)[Landroid/accounts/Account;");
        }
        int length = accountsByType.length;
        while (true) {
            if (i < length) {
                Account account2 = accountsByType[i];
                if (account2 != null && str.equals(account2.name)) {
                    f71329a = account2;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return f71329a;
    }
}
