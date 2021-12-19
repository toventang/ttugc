package com.p2082ss.videoarch.p4474a.p4478d;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.videoarch.p4474a.AbstractC87127c;
import com.p2082ss.videoarch.p4474a.p4475a.C87118a;
import com.p2082ss.videoarch.p4474a.p4478d.C87141b;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.Normalizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

/* renamed from: com.ss.videoarch.a.d.a */
public final class C87135a {

    /* renamed from: e */
    public static volatile long f196918e;

    /* renamed from: a */
    public final AbstractC87127c f196919a;

    /* renamed from: b */
    public volatile boolean f196920b;

    /* renamed from: c */
    public String f196921c;

    /* renamed from: d */
    public volatile String f196922d;

    /* renamed from: f */
    private final ExecutorService f196923f;

    /* renamed from: g */
    private Context f196924g;

    /* renamed from: h */
    private Future f196925h;

    /* renamed from: i */
    private volatile AbstractC87139a f196926i;

    /* renamed from: j */
    private int f196927j = 600000;

    /* renamed from: com.ss.videoarch.a.d.a$a */
    public interface AbstractC87139a {
        static {
            Covode.recordClassIndex(102940);
        }

        /* renamed from: a */
        void mo140948a(String str, String str2, C87118a aVar, boolean z);
    }

    static {
        Covode.recordClassIndex(102936);
    }

    /* renamed from: c */
    public final String mo140943c() {
        mo140942b();
        return this.f196922d;
    }

    /* renamed from: a */
    public final void mo140939a() {
        this.f196926i = null;
        Future future = this.f196925h;
        if (future != null && !future.isDone()) {
            this.f196925h.cancel(true);
            this.f196925h = null;
        }
    }

    /* renamed from: b */
    public final void mo140942b() {
        if (SystemClock.elapsedRealtime() - f196918e >= 300000) {
            this.f196923f.submit(new Runnable() {
                /* class com.p2082ss.videoarch.p4474a.p4478d.C87135a.RunnableC871383 */

                static {
                    Covode.recordClassIndex(102939);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            C87135a.this.f196922d = byName.getHostAddress();
                            C87135a.f196918e = SystemClock.elapsedRealtime();
                            String str = C87135a.this.f196922d;
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m151008a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(^((([0-9A-Fa-f]{1,4}:){7}(([0-9A-Fa-f]{1,4}){1}|:))|(([0-9A-Fa-f]{1,4}:){6}((:[0-9A-Fa-f]{1,4}){1}|((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){5}((:[0-9A-Fa-f]{1,4}){1,2}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){4}((:[0-9A-Fa-f]{1,4}){1,3}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){3}((:[0-9A-Fa-f]{1,4}){1,4}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){2}((:[0-9A-Fa-f]{1,4}){1,5}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(([0-9A-Fa-f]{1,4}:){1}((:[0-9A-Fa-f]{1,4}){1,6}|:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:))|(:((:[0-9A-Fa-f]{1,4}){1,7}|(:[fF]{4}){0,1}:((22[0-3]|2[0-1][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})([.](25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|([0-9]){1,2})){3})|:)))$)").matcher(Normalizer.normalize(str, Normalizer.Form.NFKC)).matches();
    }

    /* renamed from: b */
    public static String m151009b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C87140b d = m151011d(str);
        return str.substring(d.f196934a, d.f196935b);
    }

    /* renamed from: c */
    public static boolean m151010c(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || "".equals(str)) {
            return false;
        }
        return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    /* renamed from: d */
    private static C87140b m151011d(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf = str.indexOf("://") + 3;
        int length = str.length();
        int i = indexOf;
        int i2 = -1;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (charAt == '#' || charAt == '/') {
                break;
            }
            if (charAt != ':') {
                if (charAt == '?') {
                    break;
                } else if (charAt == '@') {
                    i = indexOf + 1;
                }
            } else {
                i2 = indexOf;
            }
            indexOf++;
        }
        if (i2 == -1) {
            i2 = indexOf;
        }
        return new C87140b(i, i2, indexOf);
    }

    /* renamed from: a */
    public static C87140b m151006a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf = str.indexOf("://") + 3;
        int length = str.length();
        int i = indexOf;
        int i2 = -1;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (charAt == '#' || charAt == '/') {
                break;
            }
            if (charAt != ':') {
                if (charAt != ']') {
                    if (charAt == '?') {
                        break;
                    } else if (charAt == '@') {
                        i = indexOf + 1;
                    }
                } else if (!z) {
                }
                indexOf++;
            }
            i2 = indexOf;
            indexOf++;
        }
        if (i2 == -1) {
            i2 = indexOf;
        }
        return new C87140b(i, i2, indexOf);
    }

    /* renamed from: a */
    public static String m151007a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        C87140b d = m151011d(str);
        boolean startsWith = str.startsWith("http");
        if (m151008a(str2)) {
            str2 = C1764a.m5928a("[%s]", new Object[]{str2});
        }
        String str3 = str.substring(0, d.f196934a) + str2;
        int i = d.f196935b;
        if (d.f196936c != -1) {
            str3 = str3 + str.substring(d.f196935b, d.f196936c);
            i = d.f196936c;
        }
        if (!startsWith) {
            str3 = str3 + "/" + m151009b(str);
        }
        return str3 + str.substring(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140940a(final java.lang.String r13, com.p2082ss.videoarch.p4474a.p4478d.C87135a.AbstractC87139a r14) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.p4474a.p4478d.C87135a.mo140940a(java.lang.String, com.ss.videoarch.a.d.a$a):void");
    }

    /* renamed from: com.ss.videoarch.a.d.a$b */
    public static final class C87140b {

        /* renamed from: a */
        public int f196934a;

        /* renamed from: b */
        public int f196935b;

        /* renamed from: c */
        public int f196936c;

        static {
            Covode.recordClassIndex(102941);
        }

        C87140b(int i, int i2, int i3) {
            this.f196934a = i;
            this.f196935b = i2;
            this.f196936c = i3;
        }
    }

    public C87135a(Context context, ExecutorService executorService, AbstractC87127c cVar) {
        this.f196924g = context;
        this.f196923f = executorService;
        this.f196919a = cVar;
    }

    /* renamed from: a */
    public final void mo140941a(boolean z, String str, String str2, C87118a aVar, boolean z2) {
        AbstractC87139a aVar2;
        if (this.f196920b == z && (aVar2 = this.f196926i) != null) {
            if (z2 && str2 != null) {
                C87141b.C87142a aVar3 = new C87141b.C87142a();
                aVar3.f196942b = System.currentTimeMillis();
                aVar3.f196941a = str2;
                aVar3.f196943c = false;
                C87141b.m151020a().mo140950a(str, aVar3);
            }
            aVar2.mo140948a(str, str2, aVar, z2);
        }
    }
}
