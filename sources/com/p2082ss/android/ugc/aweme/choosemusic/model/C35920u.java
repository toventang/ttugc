package com.p2082ss.android.ugc.aweme.choosemusic.model;

import android.app.Activity;
import android.database.Cursor;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p077b.C1731i;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.u */
public class C35920u {

    /* renamed from: f */
    private static final String f84774f = C35920u.class.getSimpleName();

    /* renamed from: a */
    DataCenter f84775a;

    /* renamed from: b */
    public boolean f84776b;

    /* renamed from: c */
    public boolean f84777c;

    /* renamed from: d */
    int f84778d;

    /* renamed from: e */
    Cursor f84779e;

    static {
        Covode.recordClassIndex(43160);
    }

    public C35920u(DataCenter dataCenter) {
        this.f84775a = dataCenter;
    }

    /* renamed from: a */
    public final void mo63036a(WeakReference<Activity> weakReference) {
        m73285d(weakReference).mo5534a(new C35922w(this, weakReference, System.currentTimeMillis()), C1731i.f5564c, null);
    }

    /* renamed from: c */
    public final void mo63038c(WeakReference<Activity> weakReference) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f84777c) {
            this.f84777c = true;
            mo63037b(weakReference).mo5534a(new C35924y(this, weakReference, currentTimeMillis), C1731i.f5564c, null);
        }
    }

    /* renamed from: d */
    private static C1731i<List<MusicModel>> m73285d(WeakReference<Activity> weakReference) {
        C1743j jVar = new C1743j();
        C51423a.m95784a(2, "Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                C60826d.m110426a(weakReference.get(), arrayList, new C35921v(jVar));
            } catch (Exception e) {
                C51423a.m95792b("Local Sound", "Scan Music throw a Exception");
                C51423a.m95790a((Throwable) e);
            }
        }
        return jVar.f5610a;
    }

    /* renamed from: b */
    public final C1731i<List<MusicModel>> mo63037b(WeakReference<Activity> weakReference) {
        C1743j jVar = new C1743j();
        C51423a.m95784a(2, "Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                C40780g.m82241a().execute(new RunnableC35923x(this, weakReference, arrayList, jVar));
            } catch (Exception e) {
                C51423a.m95792b("Local Sound", "Scan Music throw a Exception");
                C51423a.m95790a((Throwable) e);
            }
        }
        return jVar.f5610a;
    }

    /* renamed from: a */
    public static String m73284a(List<MusicModel> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(C1764a.m5928a("count: %s  \n", new Object[]{Integer.valueOf(list.size())}));
        for (int i = 0; i < list.size(); i++) {
            sb.append(C1764a.m5928a("name %d: title: %s.\n", new Object[]{Integer.valueOf(i), list.get(i).getName()}));
        }
        return sb.toString();
    }
}
