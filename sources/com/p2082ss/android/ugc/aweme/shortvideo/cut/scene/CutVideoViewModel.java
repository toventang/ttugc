package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20526p;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel */
public final class CutVideoViewModel extends BaseJediViewModel<CutVideoState> {

    /* renamed from: a */
    public C70155ad f156834a;

    static {
        Covode.recordClassIndex(82591);
    }

    /* renamed from: a */
    public final void mo110800a() {
        mo33689c(C70150b.f156836a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new CutVideoState(null, null, 3, null);
    }

    /* renamed from: b */
    public final C70155ad mo110802b() {
        C70155ad adVar = this.f156834a;
        if (adVar == null) {
            C89219l.m154710a("cutVideoModel");
        }
        return adVar;
    }

    /* renamed from: g */
    public final boolean mo110803g() {
        C70155ad adVar = this.f156834a;
        if (adVar == null) {
            C89219l.m154710a("cutVideoModel");
        }
        if (adVar.f156843a.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo110804h() {
        C70155ad adVar = this.f156834a;
        if (adVar == null) {
            C89219l.m154710a("cutVideoModel");
        }
        if (!adVar.f156855m) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo110806j() {
        if (this.f156834a == null) {
            return false;
        }
        C70155ad adVar = this.f156834a;
        if (adVar == null) {
            C89219l.m154710a("cutVideoModel");
        }
        if (adVar.f156851i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo110805i() {
        C70155ad adVar = this.f156834a;
        if (adVar == null) {
            C89219l.m154710a("cutVideoModel");
        }
        if (C89219l.m154714a((Object) "system_upload", (Object) adVar.f156854l)) {
            return false;
        }
        C70155ad adVar2 = this.f156834a;
        if (adVar2 == null) {
            C89219l.m154710a("cutVideoModel");
        }
        if (C89219l.m154714a((Object) "lv_sync", (Object) adVar2.f156854l)) {
            return false;
        }
        return C70455f.m124272c();
    }

    /* renamed from: k */
    public final String mo110807k() {
        if (this.f156834a == null) {
            return null;
        }
        C70155ad adVar = this.f156834a;
        if (adVar == null) {
            C89219l.m154710a("cutVideoModel");
        }
        if (adVar.f156849g == null) {
            return null;
        }
        C70155ad adVar2 = this.f156834a;
        if (adVar2 == null) {
            C89219l.m154710a("cutVideoModel");
        }
        C71518t tVar = adVar2.f156849g;
        if (tVar == null) {
            C89219l.m154715b();
        }
        return tVar.getAppId();
    }

    /* renamed from: a */
    public final void mo110801a(C70155ad adVar) {
        C89219l.m154721d(adVar, "");
        this.f156834a = adVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel$a */
    static final class C70149a extends AbstractC89220m implements AbstractC89172b<CutVideoState, CutVideoState> {

        /* renamed from: a */
        public static final C70149a f156835a = new C70149a();

        static {
            Covode.recordClassIndex(82592);
        }

        C70149a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoState invoke(CutVideoState cutVideoState) {
            CutVideoState cutVideoState2 = cutVideoState;
            C89219l.m154721d(cutVideoState2, "");
            return CutVideoState.copy$default(cutVideoState2, null, new C20526p(), 1, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel$b */
    public static final class C70150b extends AbstractC89220m implements AbstractC89172b<CutVideoState, CutVideoState> {

        /* renamed from: a */
        public static final C70150b f156836a = new C70150b();

        static {
            Covode.recordClassIndex(82593);
        }

        C70150b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoState invoke(CutVideoState cutVideoState) {
            CutVideoState cutVideoState2 = cutVideoState;
            C89219l.m154721d(cutVideoState2, "");
            return CutVideoState.copy$default(cutVideoState2, new C20526p(), null, 2, null);
        }
    }
}
