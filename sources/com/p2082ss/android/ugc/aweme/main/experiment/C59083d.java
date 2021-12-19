package com.p2082ss.android.ugc.aweme.main.experiment;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.services.MainFragmentCacheExpServiceImpl;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.d */
public final class C59083d implements IMainFragmentCacheExpService {

    /* renamed from: a */
    public static final C59083d f134486a = new C59083d();

    /* renamed from: b */
    private final /* synthetic */ IMainFragmentCacheExpService f134487b;

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    /* renamed from: a */
    public final AbstractC58258q mo37197a() {
        return this.f134487b.mo37197a();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    /* renamed from: b */
    public final AbstractC58258q mo37198b() {
        return this.f134487b.mo37198b();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    /* renamed from: c */
    public final AbstractC58258q mo37199c() {
        return this.f134487b.mo37199c();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    /* renamed from: d */
    public final View mo37200d() {
        return this.f134487b.mo37200d();
    }

    static {
        Covode.recordClassIndex(69431);
    }

    private C59083d() {
        IMainFragmentCacheExpService mainFragmentCacheExpServiceImpl;
        Object a = C81908b.m141854a(IMainFragmentCacheExpService.class, false);
        if (a != null) {
            mainFragmentCacheExpServiceImpl = (IMainFragmentCacheExpService) a;
        } else {
            mainFragmentCacheExpServiceImpl = new MainFragmentCacheExpServiceImpl();
        }
        C89219l.m154716b(mainFragmentCacheExpServiceImpl, "");
        this.f134487b = mainFragmentCacheExpServiceImpl;
    }
}
