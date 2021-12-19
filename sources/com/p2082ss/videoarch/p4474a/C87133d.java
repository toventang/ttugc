package com.p2082ss.videoarch.p4474a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.ss.videoarch.a.d */
public class C87133d {

    /* renamed from: a */
    private static final String f196916a = C87133d.class.getSimpleName();

    /* renamed from: b */
    private static AbstractC87134a f196917b;

    /* renamed from: com.ss.videoarch.a.d$a */
    public interface AbstractC87134a {
        static {
            Covode.recordClassIndex(102935);
        }
    }

    static {
        Covode.recordClassIndex(102934);
    }

    /* renamed from: a */
    public static void m151005a(String str) {
        AbstractC87134a aVar = f196917b;
        if (TextUtils.isEmpty(str)) {
            throw new Exception("Invalid library name.");
        } else if (aVar == null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a(str, false, (Context) null);
            C58032m.m104852a(uptimeMillis, str);
        }
    }
}
