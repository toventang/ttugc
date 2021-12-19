package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c.C17938a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17983g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17993j;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.C18009d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18018b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18021e;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18027h;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadJsonTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.C18076a;
import com.bytedance.keva.Keva;
import com.p2082ss.android.p2092ad.splash.AbstractC29683u;
import com.p2082ss.android.p2092ad.splash.C29673n;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.utils.C80271br;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

public final class SplashAdServiceImpl implements ISplashAdService {
    static {
        Covode.recordClassIndex(20573);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final boolean mo28712a(Context context) {
        C89219l.m154721d(context, "");
        if (!C17993j.m33508b() || C17938a.m33349a()) {
            return C18009d.f42878b.mo28740a(context, 1);
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final void mo28711a(boolean z) {
        C18027h.m33593a();
        if (C18027h.f42906a != null) {
            C18021e eVar = C18027h.f42906a;
            if (eVar.f42897b != null) {
                eVar.f42897b.edit().putBoolean("awesome_splash_filter_enable", z).apply();
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: b */
    public final void mo28715b() {
        C17938a.m33344a(C17867d.m33078a()).mo51703j();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final int mo28702a() {
        AbstractC29683u a = C17938a.m33344a(C17867d.m33078a());
        C89219l.m154716b(a, "");
        return a.mo51704k();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: c */
    public final void mo28717c() {
        C18027h.m33593a();
        if (C18027h.f42906a != null) {
            C18021e.m33580b(C17975i.m33466c());
            C18021e.m33580b(C17975i.m33467d());
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: g */
    public final void mo28721g() {
        if (!C17938a.f42757a) {
            C17938a.f42757a = true;
            C17938a.m33344a(C17867d.m33078a()).mo51700g();
        }
    }

    /* renamed from: i */
    public static ISplashAdService m33397i() {
        MethodCollector.m26663i(1743);
        Object a = C81908b.m141854a(ISplashAdService.class, false);
        if (a != null) {
            ISplashAdService iSplashAdService = (ISplashAdService) a;
            MethodCollector.m26664o(1743);
            return iSplashAdService;
        }
        if (C81908b.f183303d == null) {
            synchronized (ISplashAdService.class) {
                try {
                    if (C81908b.f183303d == null) {
                        C81908b.f183303d = new SplashAdServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1743);
                    throw th;
                }
            }
        }
        SplashAdServiceImpl splashAdServiceImpl = (SplashAdServiceImpl) C81908b.f183303d;
        MethodCollector.m26664o(1743);
        return splashAdServiceImpl;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: d */
    public final AbstractC58264w mo28718d() {
        if (C17983g.m33503b() && C80271br.m139139a()) {
            return null;
        }
        if (!C17993j.m33508b() || C17938a.m33349a()) {
            return new TopViewPreloadJsonTask();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: e */
    public final AbstractC58264w mo28719e() {
        if (C17983g.m33503b() && C80271br.m139139a()) {
            return null;
        }
        if (!C17993j.m33508b() || C17938a.m33349a()) {
            return new SplashAdManagerPreloadTask();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: f */
    public final AbstractC58258q mo28720f() {
        if (C17983g.m33503b() && C80271br.m139139a()) {
            return null;
        }
        if (!C17993j.m33508b() || C17938a.m33349a()) {
            return new SplashBgInflate();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: h */
    public final void mo28722h() {
        Keva repo = Keva.getRepo("ab_repo_cold_boot");
        boolean z = true;
        if (!SettingsManager.m29616a().mo25400a("enable_normal_splash_ad", true) || !C16048b.m29633a().mo25421a(true, "enable_normal_splash_ad_ab", true)) {
            z = false;
        }
        repo.storeBoolean("splash_ad_enable", z);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final AbstractC58264w mo28708a(List<? extends Aweme> list) {
        return new TopViewPreloadTask(list);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final View mo28704a(View view) {
        if (view != null) {
            return view.findViewById(R.id.pe);
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: b */
    public final Drawable mo28713b(Context context) {
        C89219l.m154721d(context, "");
        Object b = C58221f.m105149b(SplashBgInflate.class);
        Objects.requireNonNull(b, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate");
        Drawable b2 = ((SplashBgInflate) b).mo28742b(context);
        C89219l.m154716b(b2, "");
        return b2;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: b */
    public final void mo28716b(AbstractC17934b bVar) {
        C89219l.m154721d(bVar, "");
        if (!C17957a.m33428b()) {
            C17957a.m33427a(bVar);
            C12290b.m22060a("splash_depend_init_question", 1, (JSONObject) null);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final AbstractC18018b mo28706a(Activity activity) {
        C89219l.m154721d(activity, "");
        return new C18076a(activity);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final Aweme mo28707a(String str) {
        C18027h.m33593a();
        return C18027h.f42906a.mo28753a(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final void mo28710a(AbstractC17934b bVar) {
        C89219l.m154721d(bVar, "");
        if (!C17957a.m33428b()) {
            C17957a.m33427a(bVar);
        } else {
            C12290b.m22060a("splash_depend_init_question", 2, (JSONObject) null);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final View mo28703a(Activity activity, ViewGroup viewGroup) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(viewGroup, "");
        C1764a.m5927a(activity.getLayoutInflater(), R.layout.li, viewGroup, true);
        return viewGroup.findViewById(R.id.pc);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: b */
    public final View mo28714b(Fragment fragment, ViewGroup viewGroup) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(viewGroup, "");
        C1764a.m5927a(fragment.getLayoutInflater(), R.layout.b2m, viewGroup, true);
        return viewGroup.findViewById(R.id.edc);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final View mo28705a(Fragment fragment, ViewGroup viewGroup) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(viewGroup, "");
        C1764a.m5927a(fragment.getLayoutInflater(), R.layout.lj, viewGroup, true);
        return viewGroup.findViewById(R.id.pc);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    /* renamed from: a */
    public final void mo28709a(Context context, String str) {
        String deviceId;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (SettingsManager.m29616a().mo25400a("splash_crash_protect", true) && C29673n.m59808c(context).mo51684a(str)) {
            C33744d a = new C33744d().mo59981a("event_time", System.currentTimeMillis());
            IHostContextDepend iHostContextDepend = C16091a.f38743c;
            if (!(iHostContextDepend == null || (deviceId = iHostContextDepend.getDeviceId()) == null)) {
                a.mo59983a("id", deviceId);
            }
            C39162r.m79460a("splash_ad_handle_exception_event", a.f79943a);
        }
    }
}
