package com.bytedance.tiktok.homepage.services;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopLeftIconInflate;
import com.bytedance.tiktok.homepage.mainfragment.inflate.MainFragmentTopRightIconInflate;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.TopTabViewInflate;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53392e;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService;

public final class MainFragmentCacheExpServiceImpl implements IMainFragmentCacheExpService {
    static {
        Covode.recordClassIndex(26773);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    /* renamed from: a */
    public final AbstractC58258q mo37197a() {
        return new TopTabViewInflate();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    /* renamed from: b */
    public final AbstractC58258q mo37198b() {
        return new MainFragmentTopLeftIconInflate();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    /* renamed from: c */
    public final AbstractC58258q mo37199c() {
        return new MainFragmentTopRightIconInflate();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    /* renamed from: d */
    public final View mo37200d() {
        Object b = C58221f.m105149b(TopTabViewInflate.class);
        if (!(b instanceof TopTabViewInflate)) {
            b = null;
        }
        TopTabViewInflate topTabViewInflate = (TopTabViewInflate) b;
        if (topTabViewInflate == null) {
            return null;
        }
        C53392e eVar = topTabViewInflate.f122359a;
        topTabViewInflate.f122359a = null;
        return eVar;
    }
}
