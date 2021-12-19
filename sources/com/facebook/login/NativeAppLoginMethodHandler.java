package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.EnumC24020c;
import com.facebook.internal.C24691ab;
import com.facebook.internal.C24693ad;
import com.facebook.login.LoginClient;

public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    static {
        Covode.recordClassIndex(29029);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public abstract int mo40628a(LoginClient.Request request);

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: a */
    private static Bundle m47626a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m47630b(Bundle bundle) {
        String string = bundle.getString("error_message");
        if (string == null) {
            return bundle.getString("error_description");
        }
        return string;
    }

    /* renamed from: a */
    private static String m47629a(Bundle bundle) {
        String string = bundle.getString("error");
        if (string == null) {
            return bundle.getString("error_type");
        }
        return string;
    }

    /* renamed from: a */
    private static Object m47628a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40710a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f58965c.f58921c.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private LoginClient.Result m47627a(LoginClient.Request request, Intent intent) {
        String str;
        Bundle a = m47626a(intent);
        String a2 = m47629a(a);
        if (m47628a(a, "error_code") != null) {
            str = m47628a(a, "error_code").toString();
        } else {
            str = null;
        }
        String b = m47630b(a);
        String string = a.getString("e2e");
        if (!C24693ad.m47261a(string)) {
            mo40708b(string);
        }
        if (a2 == null && str == null && b == null) {
            try {
                return LoginClient.Result.m47587a(request, m47613a(request.f58932b, a, EnumC24020c.FACEBOOK_APPLICATION_WEB, request.f58934d));
            } catch (C24798j e) {
                return LoginClient.Result.m47589a(request, null, e.getMessage(), null);
            }
        } else if (a2.equals("logged_out")) {
            CustomTabLoginMethodHandler.f58876a = true;
            return null;
        } else if (C24691ab.f58619a.contains(a2)) {
            return null;
        } else {
            if (C24691ab.f58620b.contains(a2)) {
                return LoginClient.Result.m47588a(request, (String) null);
            }
            return LoginClient.Result.m47589a(request, a2, b, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final boolean mo40631a(int i, int i2, Intent intent) {
        LoginClient.Result a;
        LoginClient.Request request = this.f58965c.f58925g;
        if (intent == null) {
            a = LoginClient.Result.m47588a(request, "Operation canceled");
        } else {
            String str = null;
            if (i2 == 0) {
                Bundle a2 = m47626a(intent);
                String a3 = m47629a(a2);
                if (m47628a(a2, "error_code") != null) {
                    str = m47628a(a2, "error_code").toString();
                }
                if ("CONNECTION_FAILURE".equals(str)) {
                    a = LoginClient.Result.m47589a(request, a3, m47630b(a2), str);
                } else {
                    a = LoginClient.Result.m47588a(request, a3);
                }
            } else if (i2 != -1) {
                a = LoginClient.Result.m47589a(request, "Unexpected resultCode from authorization.", null, null);
            } else {
                a = m47627a(request, intent);
            }
        }
        if (a != null) {
            this.f58965c.mo40676a(a);
            return true;
        }
        this.f58965c.mo40679c();
        return true;
    }
}
