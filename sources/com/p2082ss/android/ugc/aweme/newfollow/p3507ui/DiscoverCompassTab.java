package com.p2082ss.android.ugc.aweme.newfollow.p3507ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.TabFragmentNode;
import com.p2082ss.android.ugc.aweme.experiment.C46722ay;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMainPageIcon;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53348m;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.DiscoverCompassTab */
public final class DiscoverCompassTab extends TabFragmentNode {

    /* renamed from: b */
    public final Context f139617b;

    /* renamed from: c */
    private View.OnClickListener f139618c;

    /* renamed from: d */
    private final AbstractC89244h f139619d = C89250i.m154773a((AbstractC89171a) new C61508a(this));

    static {
        Covode.recordClassIndex(72166);
    }

    /* renamed from: b */
    private final C33931ar m111372b() {
        return (C33931ar) this.f139619d.getValue();
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: e */
    public final String mo25233e() {
        return "discovery";
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        return null;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return C61515c.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: Y_ */
    public final String mo62207Y_() {
        return m111372b().f100355i;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return m111372b().f100354h;
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.DiscoverCompassTab$a */
    static final class C61508a extends AbstractC89220m implements AbstractC89171a<C33931ar> {

        /* renamed from: a */
        final /* synthetic */ DiscoverCompassTab f139620a;

        static {
            Covode.recordClassIndex(72167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61508a(DiscoverCompassTab discoverCompassTab) {
            super(0);
            this.f139620a = discoverCompassTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33931ar invoke() {
            return C61514b.m111390b(this.f139620a.f139617b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: h */
    public final void mo57292h() {
        if (this.f139618c == null) {
            this.f139618c = new View$OnClickListenerC61510a(this.f139617b);
        }
        View.OnClickListener onClickListener = this.f139618c;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    public DiscoverCompassTab(Context context) {
        C89219l.m154721d(context, "");
        this.f139617b = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: a */
    public final View mo62208a(AbstractC35331bz bzVar) {
        C89219l.m154721d(bzVar, "");
        if (!C46722ay.m90105a()) {
            return bzVar.mo62210a(m111372b());
        }
        X2CFragmentMainPageIcon x2CFragmentMainPageIcon = (X2CFragmentMainPageIcon) C58221f.m105142a(new X2CFragmentMainPageIcon());
        if (x2CFragmentMainPageIcon.f122362c != null) {
            X2CFragmentMainPageIcon.m98293a(x2CFragmentMainPageIcon.f122362c);
            C53348m mVar = x2CFragmentMainPageIcon.f122362c;
            x2CFragmentMainPageIcon.f122362c = null;
            if (mVar != null) {
                return mVar;
            }
        }
        return bzVar.mo62210a(m111372b());
    }
}
