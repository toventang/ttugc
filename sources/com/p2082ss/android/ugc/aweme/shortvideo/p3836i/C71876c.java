package com.p2082ss.android.ugc.aweme.shortvideo.p3836i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.c */
public class C71876c implements AbstractC71875b {
    static {
        Covode.recordClassIndex(84425);
    }

    /* renamed from: c */
    public int mo113529c() {
        return C63244g.m114602a().mo73277e().getBackCameraFilter(-1);
    }

    /* renamed from: d */
    public int mo113530d() {
        return C63244g.m114602a().mo73277e().getFrontCameraFilter(-1);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71875b
    /* renamed from: b */
    public void mo113526b(int i) {
        C63244g.m114602a().mo73277e().setFrontCameraFilter(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71875b
    /* renamed from: a */
    public final int mo113524a(int i) {
        int d;
        if (i == 0) {
            d = mo113529c();
        } else {
            d = mo113530d();
        }
        if (d != -1) {
            return d;
        }
        return mo113528a(i, C63244g.m114602a().mo73290r().mo86006d());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71875b
    /* renamed from: c */
    public void mo113527c(int i) {
        C63244g.m114602a().mo73277e().setBackCameraFilter(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71875b
    /* renamed from: a */
    public final void mo113525a(int i, int i2) {
        if (i == 0) {
            mo113527c(i2);
        } else {
            mo113526b(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo113528a(int i, AbstractC50707o oVar) {
        Map b = C50687a.m94982b(C63238c.m114593c().mo86076c().getValue());
        FilterBean filterBean = null;
        if (b != null) {
            FilterBean filterBean2 = null;
            int i2 = 0;
            for (Map.Entry entry : b.entrySet()) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        break;
                    } else if (!(entry == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                        filterBean2 = (FilterBean) ((List) entry.getValue()).get(0);
                    }
                } else if (!(entry == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                    filterBean = (FilterBean) ((List) entry.getValue()).get(0);
                }
                i2++;
            }
            if (!(filterBean2 == null || i != 0 || C50691c.m94990b(oVar.mo86071f(), filterBean2.getId()) == null)) {
                return filterBean2.getId();
            }
            if (!(filterBean == null || i != 1 || C50691c.m94990b(oVar.mo86071f(), filterBean.getId()) == null)) {
                return filterBean.getId();
            }
        }
        return C50691c.m94986a(oVar.mo86071f(), 0).getId();
    }
}
