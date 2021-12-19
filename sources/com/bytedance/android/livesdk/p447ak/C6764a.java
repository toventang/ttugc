package com.bytedance.android.livesdk.p447ak;

import android.content.Context;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11642f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ak.a */
public class C6764a implements AbstractC11642f {

    /* renamed from: a */
    private static volatile AbstractC11642f f16804a;

    static {
        Covode.recordClassIndex(7502);
    }

    private C6764a() {
    }

    /* renamed from: a */
    public static AbstractC11642f m14478a() {
        MethodCollector.m26663i(9244);
        if (f16804a == null) {
            synchronized (C6764a.class) {
                try {
                    if (f16804a == null) {
                        f16804a = new C6764a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9244);
                    throw th;
                }
            }
        }
        AbstractC11642f fVar = f16804a;
        MethodCollector.m26664o(9244);
        return fVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11642f
    /* renamed from: a */
    public final String mo12968a(Context context) {
        return m14479b(context);
    }

    /* renamed from: b */
    private static String m14479b(Context context) {
        try {
            return context.getResources().getString(R.string.e6s);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11642f
    /* renamed from: a */
    public final void mo12969a(String str, Map<String, String> map) {
        C6501b.C6502a.m13948a(str).mo12652a(map).mo12639a().mo12655b();
    }
}
