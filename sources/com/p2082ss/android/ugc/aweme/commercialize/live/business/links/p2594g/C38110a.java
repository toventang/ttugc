package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2594g;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.C17031d;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.g.a */
public final class C38110a extends DialogInterface$OnCancelListenerC0944d implements AbstractC17046h.AbstractC17048b {

    /* renamed from: a */
    public static final C38111a f90047a = new C38111a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f90048b = C89250i.m154773a((AbstractC89171a) new C38112b(this));

    /* renamed from: c */
    private C17031d f90049c;

    /* renamed from: d */
    private HashMap f90050d;

    static {
        Covode.recordClassIndex(45577);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final int getTheme() {
        return R.style.v_;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.g.a$a */
    public static final class C38111a {
        static {
            Covode.recordClassIndex(45578);
        }

        private C38111a() {
        }

        public /* synthetic */ C38111a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m77220a(AbstractC0952i iVar) {
            Fragment a;
            if (iVar != null && (a = iVar.mo3551a("BulletContainerWrapperFragment")) != null && (a instanceof DialogInterface$OnCancelListenerC0944d)) {
                ((DialogInterface$OnCancelListenerC0944d) a).dismissAllowingStateLoss();
            }
        }

        /* renamed from: a */
        public static void m77221a(AbstractC0952i iVar, String str) {
            C89219l.m154721d(str, "");
            C38110a aVar = new C38110a();
            Bundle bundle = new Bundle();
            bundle.putString("SCHEMA", str);
            aVar.setArguments(bundle);
            if (iVar != null) {
                aVar.show(iVar, "BulletContainerWrapperFragment");
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f90050d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.g.a$b */
    static final class C38112b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C38110a f90051a;

        static {
            Covode.recordClassIndex(45579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38112b(C38110a aVar) {
            super(0);
            this.f90051a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f90051a.getArguments();
            if (arguments != null) {
                return arguments.getString("SCHEMA");
            }
            return null;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        String str = (String) this.f90048b.getValue();
        if (str != null) {
            C89219l.m154716b(str, "");
            Uri a = C35301c.m72246a(str);
            C17031d dVar = this.f90049c;
            if (dVar == null) {
                C89219l.m154710a("bulletContainerFragment");
            }
            dVar.mo26838a(a, (Bundle) null, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C17031d dVar = new C17031d();
        C17031d.C17032a a = new C17031d.C17032a(dVar).mo26910a(BulletService.m71938f().mo61850a());
        ActivityC0945e requireActivity = requireActivity();
        Objects.requireNonNull(requireActivity, "null cannot be cast to non-null type android.app.Activity");
        a.mo26911a(new BulletActivityWrapper(requireActivity)).mo26913a();
        this.f90049c = dVar;
        AbstractC0976n a2 = getChildFragmentManager().mo3552a();
        C17031d dVar2 = this.f90049c;
        if (dVar2 == null) {
            C89219l.m154710a("bulletContainerFragment");
        }
        a2.mo3469b(R.id.zn, dVar2).mo3473c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0p, viewGroup, false);
    }
}
