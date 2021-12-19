package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48150aj;
import com.p2082ss.android.ugc.aweme.follow.presenter.RoomStruct;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.video.k */
public class C80749k {

    /* renamed from: c */
    public static long f180544c;

    /* renamed from: d */
    private static C80749k f180545d;

    /* renamed from: a */
    public AbstractC48150aj f180546a;

    /* renamed from: b */
    public HashMap<String, RoomStruct> f180547b = new HashMap<>();

    static {
        Covode.recordClassIndex(94039);
    }

    /* renamed from: b */
    public final void mo123953b() {
        AbstractC48150aj ajVar = this.f180546a;
        if (ajVar != null) {
            ajVar.mo80290a();
        }
    }

    /* renamed from: c */
    public final void mo123954c() {
        AbstractC48150aj ajVar = this.f180546a;
        if (ajVar != null) {
            ajVar.mo80290a();
        }
    }

    private C80749k() {
    }

    /* renamed from: a */
    public static C80749k m140049a() {
        MethodCollector.m26663i(514);
        if (f180545d == null) {
            synchronized (C80749k.class) {
                try {
                    if (f180545d == null) {
                        f180545d = new C80749k();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(514);
                    throw th;
                }
            }
        }
        C80749k kVar = f180545d;
        MethodCollector.m26664o(514);
        return kVar;
    }
}
