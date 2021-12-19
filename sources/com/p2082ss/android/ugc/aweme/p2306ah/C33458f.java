package com.p2082ss.android.ugc.aweme.p2306ah;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.bpea.store.p878a.C13400a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.property.C65365be;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68108o;
import com.p2082ss.android.ugc.aweme.shortvideo.C71811eo;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75520e;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75572h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76182g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ah.f */
public final class C33458f {

    /* renamed from: a */
    public static final String f79509a = "ProximaNova-Semibold";

    /* renamed from: b */
    public static final Bundle f79510b = null;

    static {
        Covode.recordClassIndex(40315);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ah.f$c */
    public static final class C33461c extends AbstractC89220m implements AbstractC89172b<C76182g.C76183a, C89391z> {

        /* renamed from: a */
        public static final C33461c f79513a = new C33461c();

        static {
            Covode.recordClassIndex(40318);
        }

        C33461c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C76182g.C76183a aVar) {
            C76182g.C76183a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f171149a = C334621.f79514a;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ah.f$a */
    public static final class C33459a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14177d f79511a;

        static {
            Covode.recordClassIndex(40316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33459a(AbstractC14177d dVar) {
            super(1);
            this.f79511a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f79511a.mo22778a(C13400a.m24099l(), "shoot_icon");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ah.f$b */
    public static final class C33460b extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f79512a;

        static {
            Covode.recordClassIndex(40317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33460b(ActivityC0945e eVar) {
            super(1);
            this.f79512a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            AbstractC1174ac a = C1181ae.m3881a(this.f79512a, (C1175ad.AbstractC1177b) null).mo3983a(GameResultViewModel.class);
            C89219l.m154716b(a, "");
            return Boolean.valueOf(((GameResultViewModel) a).f170888a);
        }
    }

    /* renamed from: a */
    public static final C75574j m68565a(ActivityC0945e eVar, AbstractC14177d dVar, boolean z, boolean z2) {
        C75520e eVar2;
        long j;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        if (z2) {
            eVar2 = new C75520e(C71811eo.m126782a(eVar), new C33459a(dVar), new C33460b(eVar), 0, C33461c.f79513a, 17);
        } else {
            eVar2 = null;
        }
        C75572h hVar = new C75572h(0, 0, null, C16048b.m29633a().mo25421a(true, "creative_tools_sticker_panel_optimize", false), C68108o.m120399a(), C68108o.m120399a(), 3199);
        if (C16048b.m29633a().mo25421a(true, "creative_tools_sticker_anim_optimize", false)) {
            j = 300;
        } else {
            j = 490;
        }
        boolean a = C65365be.m117061a();
        return new C75574j(0, 0, eVar2, 0, a ? 1 : 0, C16048b.m29633a().mo25412a(true, "studio_effects_panel_support_search", 0), true, j, false, null, hVar, false, z, false, 101435);
    }

    /* renamed from: a */
    public static /* synthetic */ C75574j m68566a(ActivityC0945e eVar, AbstractC14177d dVar, boolean z, boolean z2, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        return m68565a(eVar, dVar, z, z2);
    }
}
