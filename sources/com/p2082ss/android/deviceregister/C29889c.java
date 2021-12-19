package com.p2082ss.android.deviceregister;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a;
import com.p2082ss.android.deviceregister.p2138c.C29890a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.deviceregister.c */
public class C29889c {

    /* renamed from: a */
    static AbstractC29873a f71320a;

    /* renamed from: b */
    static Account f71321b;

    /* renamed from: c */
    private static String f71322c;

    static {
        Covode.recordClassIndex(36299);
    }

    /* renamed from: a */
    static boolean m60252a() {
        if (TextUtils.isEmpty(f71322c)) {
            f71322c = C29869d.f71247a;
        }
        return "local_test".equals(f71322c);
    }

    /* renamed from: b */
    public static boolean m60253b(Context context) {
        if (context == null || !m60252a()) {
            return false;
        }
        return C29890a.m60254a(context).f71324a;
    }

    /* renamed from: a */
    public static AbstractC29873a m60251a(Context context) {
        MethodCollector.m26663i(836);
        if (DeviceRegisterManager.hasInit()) {
            if (f71320a == null) {
                synchronized (C29889c.class) {
                    try {
                        if (f71320a == null) {
                            if (context != null) {
                                if (m60253b(context)) {
                                    if (C29890a.m60254a(context).f71325b) {
                                        C29890a a = C29890a.m60254a(context);
                                        if (a.mo52184a()) {
                                            SharedPreferences.Editor edit = C34822d.m71158a(a.f71327d.get(), "device_param_fake", 0).edit();
                                            edit.clear();
                                            edit.apply();
                                            if (Build.VERSION.SDK_INT >= 21) {
                                                CookieManager.getInstance().removeAllCookies(null);
                                            }
                                            SharedPreferences.Editor edit2 = C34822d.m71158a(a.f71327d.get(), "cookieStore", 0).edit();
                                            edit2.clear();
                                            edit2.apply();
                                            SharedPreferences.Editor edit3 = C34822d.m71158a(a.f71327d.get(), "tt_new_token_save_sp", 0).edit();
                                            edit3.putString("X-Tt-Token", "");
                                            edit3.apply();
                                            SharedPreferences.Editor edit4 = C34822d.m71158a(a.f71327d.get(), "com.ss.android.deviceregister.utils.Cdid", 0).edit();
                                            edit4.putString("cdid", "");
                                            edit4.apply();
                                        }
                                    }
                                    try {
                                        f71320a = (AbstractC29873a) Class.forName("com.ss.android.deviceregister.newuser.DeviceParamsProvider").getConstructor(Context.class).newInstance(context);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                if (f71320a == null) {
                                    C29870b bVar = new C29870b(context, DeviceRegisterManager.isLocalTest());
                                    f71320a = bVar;
                                    Account account = f71321b;
                                    if (account != null) {
                                        bVar.mo52154a(account);
                                    }
                                }
                            } else {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("context == null");
                                MethodCollector.m26664o(836);
                                throw illegalArgumentException;
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(836);
                        throw th;
                    }
                }
            }
            AbstractC29873a aVar = f71320a;
            MethodCollector.m26664o(836);
            return aVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException("please init TeaAgent first");
        MethodCollector.m26664o(836);
        throw illegalStateException;
    }
}
