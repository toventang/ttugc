package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40203j;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.C40186a;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49699z;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.p2728dc.C40950b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3742e.C68802a;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl */
public class ContentLanguageServiceImpl implements IContentLanguageService {
    static {
        Covode.recordClassIndex(47970);
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: b */
    public final Activity mo69376b() {
        return C17879g.m33105b();
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final int mo69367a() {
        return AbstractC56869p.C56870a.m103133a().mo63254e();
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: d */
    public final String mo69378d() {
        return C40950b.m82455a().mo96577a();
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: c */
    public final List<String> mo69377c() {
        return C89361p.m154915b(C40950b.m82455a().mo96577a(), new String[]{","});
    }

    /* renamed from: f */
    public static IContentLanguageService m81266f() {
        MethodCollector.m26663i(9319);
        Object a = C81908b.m141854a(IContentLanguageService.class, false);
        if (a != null) {
            IContentLanguageService iContentLanguageService = (IContentLanguageService) a;
            MethodCollector.m26664o(9319);
            return iContentLanguageService;
        }
        if (C81908b.f183163aS == null) {
            synchronized (IContentLanguageService.class) {
                try {
                    if (C81908b.f183163aS == null) {
                        C81908b.f183163aS = new ContentLanguageServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9319);
                    throw th;
                }
            }
        }
        ContentLanguageServiceImpl contentLanguageServiceImpl = (ContentLanguageServiceImpl) C81908b.f183163aS;
        MethodCollector.m26664o(9319);
        return contentLanguageServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: e */
    public final String mo69379e() {
        C40203j a = C40203j.C40204a.m81323a();
        if (!C80064f.m138815a(C80061e.f179403k.mo123508a())) {
            return a.f94395a.mo69426b();
        }
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<String> userAddLanguages = inst.getUserAddLanguages();
        C89219l.m154716b(userAddLanguages, "");
        String c = userAddLanguages.mo59941c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final void mo69370a(Activity activity) {
        C40203j.C40204a.m81323a().mo69406a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final void mo69372a(AbstractC68342a aVar) {
        C68802a.m121273a(aVar, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final void mo69373a(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        List g = C89070n.m154585g((Collection) C89361p.m154915b(C40950b.m82455a().mo96577a(), new String[]{","}));
        if (C40950b.m82456a(g, str, true)) {
            C40950b.m82455a().mo96578a(C89070n.m154551a(g, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final Pair<Boolean, String> mo69368a(Context context) {
        if ((context instanceof Activity) && (context instanceof MainActivity)) {
            Fragment curFragment = ((MainActivity) context).getCurFragment();
            if (curFragment instanceof C59014ae) {
                AbstractC50477z s = ((C59014ae) curFragment).mo96547l();
                if ((s instanceof C50041af) && s.isResumed() && s.getUserVisibleHint()) {
                    Aweme aweme = null;
                    if (C49907s.m93685a().booleanValue() && ((C50041af) s).f115519n.mo81110aE() == 0) {
                        return new Pair<>(false, null);
                    }
                    C50041af afVar = (C50041af) s;
                    if (afVar.f115519n != null) {
                        aweme = afVar.f115519n.mo81109aD();
                    }
                    if (mo69375a(aweme)) {
                        return new Pair<>(true, afVar.f116585t);
                    }
                }
            }
        }
        return new Pair<>(false, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final void mo69371a(C68343a aVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        ArrayList arrayList = new ArrayList();
        for (T t : C89361p.m154915b(C40950b.m82455a().mo96577a(), new String[]{","})) {
            if (!TextUtils.isEmpty(t)) {
                arrayList.add(t);
            }
        }
        List g = C89070n.m154585g((Collection) arrayList);
        String languageCode = aVar.getLanguageCode();
        C89219l.m154716b(languageCode, "");
        if (!C40950b.m82456a(g, languageCode, false)) {
            String languageCode2 = aVar.getLanguageCode();
            C89219l.m154716b(languageCode2, "");
            g.add(languageCode2);
            C40950b.m82455a().mo96578a(C89070n.m154551a(g, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final void mo69374a(boolean z) {
        AbstractC81915c.m141874a(new C49699z(false));
        if (z) {
            C49301e.m92382m();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final boolean mo69375a(Aweme aweme) {
        if (C17964b.f42785d || C17975i.m33468e() || C37699a.m76314s(aweme) || C37699a.m76199B(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService
    /* renamed from: a */
    public final C40186a mo69369a(List<String> list, List<C68343a> list2) {
        if (C13603b.m24435a((Collection) list) || C13603b.m24435a((Collection) list2)) {
            return new C40186a(null, list2);
        }
        ArrayList arrayList = new ArrayList();
        if (list2 == null) {
            C89219l.m154715b();
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : list2) {
            T t2 = t;
            if (list == null) {
                C89219l.m154715b();
            }
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList2.add(t);
                    break;
                }
                if (C89361p.m154872a(t2.getLanguageCode(), it.next(), true)) {
                    C68343a aVar = new C68343a();
                    aVar.setLanguageCode(t2.getLanguageCode());
                    aVar.setLocalName(t2.getLocalName());
                    aVar.setEnglishName(t2.getEnglishName());
                    arrayList.add(aVar);
                    break;
                }
            }
        }
        return new C40186a(arrayList, arrayList2);
    }
}
