package com.p2082ss.android.ugc.aweme.profile.p3576ui.profiletab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.TabFragmentNode;
import com.p2082ss.android.ugc.aweme.experiment.C46722ay;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59254s;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.profiletab.ProfileTab */
public final class ProfileTab extends TabFragmentNode {

    /* renamed from: b */
    public final Context f145531b;

    /* renamed from: c */
    private C64166a f145532c;

    /* renamed from: d */
    private final AbstractC89244h f145533d = C89250i.m154773a((AbstractC89171a) new C64165a(this));

    static {
        Covode.recordClassIndex(75609);
    }

    /* renamed from: b */
    private final C33931ar m116095b() {
        return (C33931ar) this.f145533d.getValue();
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return C64208b.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: Y_ */
    public final String mo62207Y_() {
        return m116095b().f100355i;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return m116095b().f100354h;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.profiletab.ProfileTab$a */
    static final class C64165a extends AbstractC89220m implements AbstractC89171a<C33931ar> {

        /* renamed from: a */
        final /* synthetic */ ProfileTab f145534a;

        static {
            Covode.recordClassIndex(75610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64165a(ProfileTab profileTab) {
            super(0);
            this.f145534a = profileTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33931ar invoke() {
            return C64169b.m116103a(this.f145534a.f145531b);
        }
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: e */
    public final String mo25233e() {
        Context context = this.f145531b;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Fragment g = Hox.C15490a.m28529a((ActivityC0945e) context).mo25220g(m116095b().f100354h);
        if (g instanceof C64250i) {
            return "others_homepage";
        }
        if (!(g instanceof AbstractC59254s)) {
            return "";
        }
        String f = ((AbstractC59254s) g).mo96829f();
        C89219l.m154716b(f, "");
        return f;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        Bundle bundle = new Bundle();
        bundle.putString("from", "from_main");
        Context context = this.f145531b;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        bundle.putString("profile_from_scene", m116094a(((Activity) context).getIntent(), "profile_from_scene"));
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0203, code lost:
        if (r11.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0205;
     */
    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57292h() {
        /*
        // Method dump skipped, instructions count: 661
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.profiletab.ProfileTab.mo57292h():void");
    }

    public ProfileTab(Context context) {
        C89219l.m154721d(context, "");
        this.f145531b = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: a */
    public final View mo62208a(AbstractC35331bz bzVar) {
        C89219l.m154721d(bzVar, "");
        if (!C46722ay.m90105a()) {
            return bzVar.mo62210a(m116095b());
        }
        View c = HomePageUIFrameServiceImpl.m108627e().mo89388c();
        if (c == null) {
            return bzVar.mo62210a(m116095b());
        }
        return c;
    }

    /* renamed from: a */
    private static String m116094a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
