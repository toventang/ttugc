package com.p2082ss.android.ugc.aweme.mediachoose.helper;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e;
import com.p2082ss.android.ugc.aweme.mediachoose.p3436a.C59148c;
import com.p2082ss.android.ugc.aweme.mediachoose.p3436a.C59155e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.c */
public final class C59187c {

    /* renamed from: a */
    public static C59187c f134693a;

    /* renamed from: b */
    Context f134694b;

    /* renamed from: c */
    public final HashMap<String, MediaModel> f134695c = new HashMap<>();

    /* renamed from: d */
    final HashMap<Integer, List<MediaModel>> f134696d = new HashMap<>();

    /* renamed from: e */
    final List<MediaModel> f134697e = new ArrayList();

    /* renamed from: f */
    public final Set<AbstractC59188a> f134698f = new HashSet();

    /* renamed from: g */
    private boolean f134699g = true;

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.c$a */
    public interface AbstractC59188a {
        static {
            Covode.recordClassIndex(69547);
        }

        /* renamed from: a */
        void mo90097a(boolean z);
    }

    static {
        Covode.recordClassIndex(69546);
    }

    /* renamed from: b */
    public final void mo96693b() {
        this.f134697e.clear();
    }

    /* renamed from: c */
    public final List<MediaModel> mo96694c() {
        return new ArrayList(this.f134697e);
    }

    /* renamed from: a */
    public final List<MediaModel> mo96690a() {
        List<MediaModel> list = this.f134696d.get(4);
        if (list != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final void mo96692a(MediaModel mediaModel) {
        if (mediaModel != null && !this.f134697e.contains(mediaModel)) {
            this.f134697e.add(mediaModel);
        }
    }

    private C59187c(Context context, boolean z) {
        this.f134699g = z;
        this.f134694b = context;
    }

    /* renamed from: a */
    public static synchronized void m108691a(Context context, boolean z) {
        synchronized (C59187c.class) {
            MethodCollector.m26663i(724);
            if (f134693a == null) {
                f134693a = new C59187c(context, z);
            }
            MethodCollector.m26664o(724);
        }
    }

    /* renamed from: a */
    public final void mo96691a(int i, int i2, int i3, AbstractC59178e eVar) {
        C1731i.m5640b(new CallableC59191f(this, i, i2, i3), C1731i.f5562a).mo5534a(new C59192g(this, i2, eVar, i), C1731i.f5564c, null);
    }

    /* renamed from: a */
    public static void m108690a(int i, int i2, int i3, AbstractC59178e eVar, AbstractC59174d dVar) {
        C59148c.C59151a.m108660a().mo96653a(new C59155e(i, i2, i3), dVar).mo143254a(new C59189d(eVar, dVar), new C59190e(eVar, i, dVar));
    }
}
