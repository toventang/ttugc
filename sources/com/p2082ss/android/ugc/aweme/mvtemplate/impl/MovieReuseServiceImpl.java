package com.p2082ss.android.ugc.aweme.mvtemplate.impl;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.mvtemplate.C61242a;
import com.p2082ss.android.ugc.aweme.mvtemplate.p3486a.C61244a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78598b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl */
public final class MovieReuseServiceImpl implements IMovieReuseService {
    static {
        Covode.recordClassIndex(71869);
    }

    /* renamed from: a */
    public static IMovieReuseService m110905a() {
        MethodCollector.m26663i(8607);
        Object a = C81908b.m141854a(IMovieReuseService.class, false);
        if (a != null) {
            IMovieReuseService iMovieReuseService = (IMovieReuseService) a;
            MethodCollector.m26664o(8607);
            return iMovieReuseService;
        }
        if (C81908b.f183266cP == null) {
            synchronized (IMovieReuseService.class) {
                try {
                    if (C81908b.f183266cP == null) {
                        C81908b.f183266cP = new MovieReuseServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8607);
                    throw th;
                }
            }
        }
        MovieReuseServiceImpl movieReuseServiceImpl = (MovieReuseServiceImpl) C81908b.f183266cP;
        MethodCollector.m26664o(8607);
        return movieReuseServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl$a */
    public static final class C61254a implements AbstractC78598b {

        /* renamed from: a */
        final /* synthetic */ IMovieReuseService.AbstractC78107b f139104a;

        static {
            Covode.recordClassIndex(71870);
        }

        C61254a(IMovieReuseService.AbstractC78107b bVar) {
            this.f139104a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78598b
        public final void onFinish(int i) {
            boolean z;
            IMovieReuseService.AbstractC78107b bVar = this.f139104a;
            if (i == 2006) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo105358a(i, Boolean.valueOf(z));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService
    /* renamed from: a */
    public final AbstractC41262aa mo98779a(AbstractC39100a<?, ?> aVar) {
        return new C61244a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService
    /* renamed from: b */
    public final void mo98783b(Fragment fragment, String str) {
        C89219l.m154721d(fragment, "");
        mo98781a(fragment, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService
    /* renamed from: a */
    public final void mo98781a(Fragment fragment, String str) {
        C89219l.m154721d(fragment, "");
        if (str != null && AVExternalServiceImpl.m113114a().publishService().checkIsAlreadyPublished(fragment.getContext())) {
            C61242a aVar = new C61242a(fragment.getContext());
            aVar.f139059c = "mv_page";
            aVar.f139060d = "mv_page";
            aVar.mo98769a(str, 1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService
    /* renamed from: a */
    public final void mo98782a(String str, Activity activity, IMovieReuseService.AbstractC78107b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        C61242a aVar = new C61242a(activity, 3);
        aVar.f139061e = false;
        aVar.f139063g = new C61254a(bVar);
        aVar.mo98770a(str, 0, "scan", "scan");
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService
    /* renamed from: a */
    public final void mo98780a(Context context, Integer num, String str, Integer num2, String str2, String str3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        new C61242a(context, num).mo98770a(str, num2, str2, str3);
    }
}
