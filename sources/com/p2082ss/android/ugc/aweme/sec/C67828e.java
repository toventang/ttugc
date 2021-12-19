package com.p2082ss.android.ugc.aweme.sec;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p2082ss.android.common.util.NetworkUtils;
import java.io.InputStream;
import java.nio.charset.Charset;
import okhttp3.AbstractC90031ad;
import okhttp3.C90029ac;
import okhttp3.C90204w;
import p4632k.AbstractC89426h;

/* renamed from: com.ss.android.ugc.aweme.sec.e */
public final class C67828e {
    static {
        Covode.recordClassIndex(79489);
    }

    /* renamed from: a */
    public static String m120017a(C22028c cVar) {
        String str;
        TypedInput typedInput = cVar.f52043e;
        if (typedInput != null) {
            InputStream in = cVar.f52043e.mo11577in();
            C22027b a = cVar.mo35844a("Content-Type");
            try {
                C90204w b = C90204w.m156843b(typedInput.mimeType());
                String str2 = null;
                if (b != null) {
                    str = b.toString();
                } else if (a == null) {
                    str = null;
                } else {
                    str = a.f52038b;
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                if (typedInput.length() > 2147483647L) {
                    return null;
                }
                if (!(b == null || b.mo145074a((Charset) null) == null)) {
                    str2 = b.mo145074a((Charset) null).name();
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(false, testIsSSBinary, 0, in, str2);
                in.reset();
                return response2String;
            } finally {
                in.reset();
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }

    /* renamed from: a */
    public static String m120018a(C90029ac acVar) {
        boolean z;
        String str;
        AbstractC90031ad adVar = acVar.f204111g;
        if (adVar != null) {
            AbstractC89426h source = acVar.f204111g.source();
            source.mo143816e(Long.MAX_VALUE);
            InputStream f = source.mo68846a().clone().mo143819f();
            String str2 = null;
            String a = acVar.mo144718a("Content-Encoding", null);
            if (a == null || !"gzip".equalsIgnoreCase(a)) {
                Logger.debug();
                z = false;
            } else {
                z = true;
            }
            try {
                C90204w contentType = adVar.contentType();
                if (contentType != null) {
                    str = contentType.toString();
                } else {
                    str = acVar.mo144718a("Content-Type", null);
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                if (adVar.contentLength() > 2147483647L) {
                    return null;
                }
                if (!(contentType == null || contentType.mo145074a((Charset) null) == null)) {
                    str2 = contentType.mo145074a((Charset) null).name();
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(z, testIsSSBinary, 0, f, str2);
                NetworkUtils.safeClose(f);
                return response2String;
            } finally {
                NetworkUtils.safeClose(f);
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }
}
