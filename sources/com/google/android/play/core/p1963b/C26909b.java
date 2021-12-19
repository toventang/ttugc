package com.google.android.play.core.p1963b;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.play.core.b.b */
public final class C26909b {

    /* renamed from: a */
    private final String f63795a;

    static {
        Covode.recordClassIndex(32384);
    }

    public C26909b(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f63795a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private final int m53455a(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            m53456a(this.f63795a, str, objArr);
        }
        return 0;
    }

    /* renamed from: a */
    private static String m53456a(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = C1764a.m5929a(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    "Unable to format ".concat(valueOf);
                } else {
                    new String("Unable to format ");
                }
                String join = TextUtils.join(", ", objArr);
                int length = String.valueOf(str2).length();
                StringBuilder sb = new StringBuilder(length + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        int length2 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length2 + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo44595a(String str, Object... objArr) {
        m53455a(3, str, objArr);
    }

    /* renamed from: b */
    public final void mo44596b(String str, Object... objArr) {
        m53455a(6, str, objArr);
    }

    /* renamed from: c */
    public final void mo44597c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            m53456a(this.f63795a, str, objArr);
        }
    }

    /* renamed from: d */
    public final void mo44598d(String str, Object... objArr) {
        m53455a(4, str, objArr);
    }

    /* renamed from: e */
    public final void mo44599e(String str, Object... objArr) {
        m53455a(5, str, objArr);
    }
}
