package com.p2082ss.android.ugc.aweme.livewallpaper.p3419f;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34508e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3416d.C58882c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.f.d */
public final class C58895d {

    /* renamed from: e */
    public static C58895d f134069e = new C58895d();

    /* renamed from: a */
    public List<LiveWallPaperBean> f134070a = new LinkedList();

    /* renamed from: b */
    public AbstractC58900e f134071b;

    /* renamed from: c */
    public LiveWallPaperBean f134072c;

    /* renamed from: d */
    public Map<String, AbstractC58899a> f134073d;

    /* renamed from: f */
    public ContentResolver f134074f;

    /* renamed from: g */
    private C27910f f134075g = new C27910f();

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.f.d$a */
    public interface AbstractC58899a {
        static {
            Covode.recordClassIndex(69215);
        }

        /* renamed from: a */
        void mo96314a(boolean z, String str);
    }

    static {
        Covode.recordClassIndex(69211);
    }

    /* renamed from: b */
    public final void mo96319b() {
        AbstractC58900e eVar = this.f134071b;
        if (eVar != null) {
            eVar.mo60963b(this.f134075g.mo46674b(this.f134070a));
        }
    }

    /* renamed from: d */
    private void m108194d() {
        Iterator<LiveWallPaperBean> it = this.f134070a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            LiveWallPaperBean next = it.next();
            if (!next.isValid()) {
                z = true;
                mo96316a(next);
                it.remove();
            }
        }
        if (z) {
            mo96319b();
        }
    }

    /* renamed from: c */
    public final List<LiveWallPaperBean> mo96321c() {
        if (!C13603b.m24435a((Collection) this.f134070a)) {
            m108194d();
            return this.f134070a;
        }
        AbstractC58900e eVar = this.f134071b;
        String str = "";
        if (eVar != null) {
            str = eVar.mo60957a(str);
        }
        if (TextUtils.isEmpty(str)) {
            return new LinkedList();
        }
        List list = null;
        try {
            list = (List) this.f134075g.mo46671a(str, new C27895a<List<LiveWallPaperBean>>() {
                /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d.C588972 */

                static {
                    Covode.recordClassIndex(69213);
                }
            }.type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (C13603b.m24435a((Collection) list)) {
            return new LinkedList();
        }
        this.f134070a.addAll(list);
        m108194d();
        return this.f134070a;
    }

    private C58895d() {
        try {
            this.f134071b = (AbstractC58900e) C34508e.m70493a(C17867d.m33078a(), AbstractC58900e.class);
        } catch (Throwable th) {
            C51423a.m95787a("LiveWallPaperManager getSP failed " + th.getMessage());
        }
        if (this.f134071b != null) {
            LiveWallPaperBean.C58910a newBuilder = LiveWallPaperBean.newBuilder();
            newBuilder.f134106c = this.f134071b.mo60965c("");
            newBuilder.f134107d = this.f134071b.mo60956a();
            newBuilder.f134108e = this.f134071b.mo60961b();
            newBuilder.f134109f = this.f134071b.mo60968e("");
            newBuilder.f134110g = this.f134071b.mo60964c();
            newBuilder.f134114k = this.f134071b.mo60967d();
            this.f134072c = newBuilder.mo96357a();
        } else {
            this.f134072c = LiveWallPaperBean.newBuilder().mo96357a();
        }
        this.f134070a = mo96321c();
        this.f134073d = new HashMap();
    }

    /* renamed from: a */
    public final void mo96315a() {
        if (this.f134072c.isValid() && !mo96320b(this.f134072c.getId())) {
            LiveWallPaperBean.C58910a newBuilder = LiveWallPaperBean.newBuilder();
            newBuilder.f134104a = this.f134072c.getId();
            newBuilder.f134105b = this.f134072c.getThumbnailPath();
            newBuilder.f134106c = this.f134072c.getVideoPath();
            newBuilder.f134107d = this.f134072c.getWidth();
            newBuilder.f134108e = this.f134072c.getHeight();
            newBuilder.f134109f = this.f134072c.getSource();
            newBuilder.f134110g = this.f134072c.getVolume();
            newBuilder.f134114k = this.f134072c.isShouldMute();
            LiveWallPaperBean a = newBuilder.mo96357a();
            this.f134070a.add(0, a);
            mo96319b();
            C1764a.m5928a("Add wallpaper : %s", new Object[]{a});
        }
    }

    /* renamed from: a */
    public final void mo96316a(final LiveWallPaperBean liveWallPaperBean) {
        C1731i.m5640b(new Callable<Void>() {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d.CallableC588961 */

            static {
                Covode.recordClassIndex(69212);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() {
                C80720e.m139931c(liveWallPaperBean.getThumbnailPath());
                C80720e.m139931c(liveWallPaperBean.getVideoPath());
                return null;
            }
        }, C1731i.f5562a);
    }

    /* renamed from: b */
    private static ComponentName m108193b(Activity activity) {
        if (C58901f.m108237d()) {
            return new ComponentName(AbstractC58894c.f134066a, "com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper");
        }
        return new ComponentName(activity.getPackageName(), AmeLiveWallpaper.class.getName());
    }

    /* renamed from: a */
    public final void mo96317a(String str) {
        if (this.f134073d.size() != 0) {
            this.f134073d.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo96320b(String str) {
        if (!C13603b.m24435a((Collection) this.f134070a) && !TextUtils.isEmpty(str)) {
            for (LiveWallPaperBean liveWallPaperBean : this.f134070a) {
                if (str.equals(liveWallPaperBean.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m108192a(Activity activity) {
        Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
        intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", m108193b(activity));
        try {
            activity.startActivityForResult(intent, 100);
        } catch (Exception e) {
            if (e instanceof ActivityNotFoundException) {
                C39162r.m79460a("not_support_wallpaper_device", new C33744d().mo59983a("brand", Build.BRAND).mo59983a("model", Build.MODEL).f79943a);
            }
            new C79459a(C17867d.m33078a()).mo123050a(R.string.hax).mo123053a();
            C58901f.m108220a(1, "start livewallpaper activity fail");
        }
        C58882c.m108183a();
    }

    /* renamed from: a */
    public final void mo96318a(String str, AbstractC58899a aVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f134073d.put(str, aVar);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m108191a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58895d.m108191a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
