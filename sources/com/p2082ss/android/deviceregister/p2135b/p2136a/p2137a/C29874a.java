package com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.deviceregister.b.a.a.a */
public final class C29874a extends AbstractC29876b {

    /* renamed from: a */
    public final AccountManager f71275a;

    /* renamed from: b */
    public Account f71276b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, String> f71277c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(36284);
    }

    public C29874a(Context context) {
        this.f71275a = AccountManager.get(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b
    /* renamed from: a */
    public final String mo52160a(String str) {
        Account account = this.f71276b;
        if (account == null) {
            return null;
        }
        try {
            String userData = this.f71275a.getUserData(account, str);
            Logger.debug();
            return userData;
        } catch (Throwable unused) {
            Logger.debug();
            return null;
        }
    }

    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b
    /* renamed from: b */
    public final void mo52162b(String str) {
        AccountManager accountManager;
        ConcurrentHashMap<String, String> concurrentHashMap = this.f71277c;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            this.f71277c.remove(str);
        }
        try {
            Account account = this.f71276b;
            if (!(account == null || (accountManager = this.f71275a) == null)) {
                accountManager.setUserData(account, str, null);
            }
        } catch (Exception unused) {
        }
        mo52160a(str);
        super.mo52162b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.AbstractC29876b
    /* renamed from: a */
    public final void mo52161a(String str, String str2) {
        if (this.f71276b == null) {
            this.f71277c.put(str, str2);
        } else if (str2 != null) {
            try {
                Logger.debug();
                this.f71275a.setUserData(this.f71276b, str, str2);
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
    }
}
