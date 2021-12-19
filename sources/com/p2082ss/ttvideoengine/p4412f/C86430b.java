package com.p2082ss.ttvideoengine.p4412f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.mediakit.fetcher.AVMDLFetcherMakerInterface;
import com.p2082ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.Hashtable;

/* renamed from: com.ss.ttvideoengine.f.b */
public final class C86430b implements AVMDLFetcherMakerInterface {

    /* renamed from: a */
    private static Hashtable<String, C86425a> f193779a = new Hashtable<>();

    /* renamed from: b */
    private final Context f193780b;

    public C86430b() {
    }

    static {
        Covode.recordClassIndex(101658);
    }

    public C86430b(Context context) {
        this.f193780b = context;
    }

    /* renamed from: a */
    public static void m149143a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f193779a.remove(str);
        }
    }

    @Override // com.p2082ss.mediakit.fetcher.AVMDLFetcherMakerInterface
    public final AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3) {
        C86641i.m150110a("FetcherMaker", "getFetcher rawKey " + str + ", fileKey " + str2 + ", oldURL " + str3);
        C86425a aVar = f193779a.get(str);
        if (aVar == null) {
            C86641i.m150110a("FetcherMaker", "getFetcher FetcherBase is null");
            return null;
        }
        String str4 = aVar.f193766a;
        String str5 = aVar.f193767b;
        int i = aVar.f193768c;
        if (TextUtils.isEmpty(str5) || (i != 3 && TextUtils.isEmpty(str4))) {
            C86641i.m150110a("FetcherMaker", "getFetcher FetcherBase is error ".concat(String.valueOf(aVar)));
            return null;
        }
        C86431c cVar = new C86431c(this.f193780b, str5, str4);
        C86641i.m150110a("FetcherMaker", "return fetcher to mdl ".concat(String.valueOf(cVar)));
        return cVar;
    }

    /* renamed from: a */
    public static void m149144a(String str, String str2, String str3, int i) {
        C86641i.m150110a("FetcherMaker", "store videoId " + str + ", keyseed " + str2 + ", fallbackAPI " + str3 + ", version " + i);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || (i != 3 && TextUtils.isEmpty(str2))) {
            C86641i.m150110a("FetcherMaker", "mdlFetch store fail");
        } else {
            f193779a.put(str, new C86425a(str2, str3, i));
        }
    }
}
