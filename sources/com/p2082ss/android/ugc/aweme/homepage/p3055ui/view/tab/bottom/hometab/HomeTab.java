package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.hometab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.AbstractC15501d;
import com.bytedance.hox.Hox;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.TabFragmentGroup;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.FlippableViewPagerExt;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab.HomeTab */
public final class HomeTab extends TabFragmentGroup {

    /* renamed from: j */
    public FlippableViewPagerExt f122455j;

    /* renamed from: k */
    public final Context f122456k;

    /* renamed from: l */
    private View.OnClickListener f122457l;

    /* renamed from: m */
    private final AbstractC89244h f122458m;

    static {
        Covode.recordClassIndex(62903);
    }

    /* renamed from: j */
    private final C33931ar m98402j() {
        return (C33931ar) this.f122458m.getValue();
    }

    @Override // com.bytedance.hox.AbstractC15498b
    /* renamed from: b */
    public final boolean mo25228b() {
        return true;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: e */
    public final String mo25233e() {
        return "homepage_hot";
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: Y_ */
    public final String mo62207Y_() {
        return m98402j().f100355i;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return m98402j().f100354h;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab.HomeTab$a */
    static final class C53342a extends AbstractC89220m implements AbstractC89171a<C33931ar> {

        /* renamed from: a */
        final /* synthetic */ HomeTab f122459a;

        static {
            Covode.recordClassIndex(62904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53342a(HomeTab homeTab) {
            super(0);
            this.f122459a = homeTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33931ar invoke() {
            return C53343a.m98412a(this.f122459a.f122456k);
        }
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return HomePageUIFrameServiceImpl.m108627e().mo89386b(m98402j().f100354h);
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        Context context = this.f122456k;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        Intent intent = ((Activity) context).getIntent();
        C89219l.m154716b(intent, "");
        return m98400a(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.TabFragmentGroup, com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: h */
    public final void mo57292h() {
        if (this.f122457l == null) {
            this.f122457l = HomePageUIFrameServiceImpl.m108627e().mo89378a(this.f122456k, m98402j().f100354h);
        }
        View.OnClickListener onClickListener = this.f122457l;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    public HomeTab(Context context) {
        C89219l.m154721d(context, "");
        this.f122456k = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        for (T t : HomeTabViewModel.C53309a.m98315a((ActivityC0945e) context).mo89740b()) {
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.bytedance.hox.HoxNode");
            mo25225a((AbstractC15501d) t);
        }
        this.f122458m = C89250i.m154773a((AbstractC89171a) new C53342a(this));
    }

    /* renamed from: a */
    private static Bundle m98400a(Intent intent) {
        int i;
        if (intent == null) {
            return null;
        }
        String a = m98401a(intent, "tab");
        if (C13627m.m24498a(a)) {
            i = intent.getIntExtra("tab", -1);
        } else {
            try {
                i = Integer.parseInt(a);
            } catch (Throwable unused) {
                i = -1;
            }
        }
        int intExtra = intent.getIntExtra("page_type", -1);
        if (i < 0 && intExtra < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("tab", i);
        bundle.putInt("page_type", intExtra);
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r0 == null) goto L_0x001c;
     */
    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo62208a(com.p2082ss.android.ugc.aweme.AbstractC35331bz r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            boolean r0 = com.p2082ss.android.ugc.aweme.experiment.C46722ay.m90105a()
            r3 = 1
            if (r0 == 0) goto L_0x0035
            com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon r0 = new com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon
            r0.<init>()
            java.lang.Object r2 = com.p2082ss.android.ugc.aweme.lego.C58221f.m105142a(r0)
            com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon r2 = (com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMainPageIcon) r2
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r0 = r2.f122360a
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x001c:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r0 = new com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c
            com.ss.android.ugc.aweme.ar r1 = r4.m98402j()
            r0.<init>(r1)
        L_0x0025:
            r0.setSelected(r3)
            return r0
        L_0x0029:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r0 = r2.f122360a
            com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.X2CFragmentMainPageIcon.m98293a(r0)
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r0 = r2.f122360a
            r2.f122360a = r1
            if (r0 != 0) goto L_0x0025
            goto L_0x001c
        L_0x0035:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r1 = new com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c
            com.ss.android.ugc.aweme.ar r0 = r4.m98402j()
            r1.<init>(r0)
            r1.setSelected(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.hometab.HomeTab.mo62208a(com.ss.android.ugc.aweme.bz):android.view.View");
    }

    /* renamed from: a */
    private static String m98401a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.hox.AbstractC15498b
    /* renamed from: a */
    public final void mo25226a(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        Context context = this.f122456k;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        int e = Hox.C15490a.m28529a((ActivityC0945e) context).mo25218e(str);
        boolean z = bundle.getBoolean(C34792be.f82127f, false);
        FlippableViewPagerExt flippableViewPagerExt = this.f122455j;
        if (flippableViewPagerExt != null) {
            flippableViewPagerExt.mo61355a(e, z);
        }
    }
}
