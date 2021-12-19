package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import java.util.Iterator;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel */
public final class FTCEditInfoStickerViewModel extends LifecycleAwareViewModel<FTCEditInfoStickerState> implements AbstractC52231a {

    /* renamed from: a */
    public C52244c f120285a;

    static {
        Covode.recordClassIndex(61607);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: a */
    public final void mo87939a() {
        mo33690d(C52225d.f120290a);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: i */
    public final void mo87950i() {
        mo33689c(C52224c.f120289a);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: c */
    public final Object mo87945c() {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        return cVar.mo87988C().f120419J;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditInfoStickerState(null, null, null, null, null, null, 63, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: h */
    public final AbstractC45898d mo87949h() {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        return cVar.mo87988C();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: b */
    public final void mo87943b() {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        cVar.mo87988C().mo88025f();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: f */
    public final boolean mo87947f() {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C52264i C = cVar.mo87988C();
        if (C.f120433d != null) {
            return C.f120433d.f120328w;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: g */
    public final boolean mo87948g() {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C52264i C = cVar.mo87988C();
        if (C.f120433d != null) {
            return C.f120433d.f120329x;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: e */
    public final void mo87946e() {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C52264i C = cVar.mo87988C();
        if (C.f120433d != null) {
            C52263h hVar = C.f120433d.f120313g;
            if (!C13617h.m24465a(hVar.f120398a)) {
                Iterator<C52154a> it = hVar.f120398a.iterator();
                while (it.hasNext()) {
                    C52154a next = it.next();
                    hVar.f120401d.mo56359g(next.f120151b.getId());
                    it.remove();
                    if (hVar.f120402e != null) {
                        hVar.f120402e.mo87993b(next.f120151b);
                    }
                }
                hVar.f120399b = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel$b */
    static final class C52223b extends AbstractC89220m implements AbstractC89172b<FTCEditInfoStickerState, FTCEditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ StickerItemModel f120288a;

        static {
            Covode.recordClassIndex(61609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52223b(StickerItemModel stickerItemModel) {
            super(1);
            this.f120288a = stickerItemModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            C89219l.m154721d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, null, null, null, new C20391d(this.f120288a), null, null, 55, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel$c */
    static final class C52224c extends AbstractC89220m implements AbstractC89172b<FTCEditInfoStickerState, FTCEditInfoStickerState> {

        /* renamed from: a */
        public static final C52224c f120289a = new C52224c();

        static {
            Covode.recordClassIndex(61610);
        }

        C52224c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            C89219l.m154721d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, null, new C20526p(), null, null, null, null, 61, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel$d */
    static final class C52225d extends AbstractC89220m implements AbstractC89172b<FTCEditInfoStickerState, FTCEditInfoStickerState> {

        /* renamed from: a */
        public static final C52225d f120290a = new C52225d();

        static {
            Covode.recordClassIndex(61611);
        }

        C52225d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            C89219l.m154721d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, new AbstractC23517a.C23519b(), null, null, null, null, null, 62, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: a */
    public final void mo87941a(AbstractC45904h<?> hVar) {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        cVar.mo87988C().mo88017a(true, (AbstractC45904h) hVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel$a */
    public static final class C52222a extends AbstractC89220m implements AbstractC89172b<FTCEditInfoStickerState, FTCEditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f120286a;

        /* renamed from: b */
        final /* synthetic */ long f120287b = 300;

        static {
            Covode.recordClassIndex(61608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52222a(float f) {
            super(1);
            this.f120286a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            C89219l.m154721d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, null, null, null, null, new C20524n(new C89378p(Float.valueOf(this.f120286a), Long.valueOf(this.f120287b))), null, 47, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel$e */
    public static final class C52226e extends AbstractC89220m implements AbstractC89172b<FTCEditInfoStickerState, FTCEditInfoStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f120291a;

        /* renamed from: b */
        final /* synthetic */ float f120292b;

        /* renamed from: c */
        final /* synthetic */ float f120293c;

        static {
            Covode.recordClassIndex(61612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52226e(float f, float f2, float f3) {
            super(1);
            this.f120291a = f;
            this.f120292b = f2;
            this.f120293c = f3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
            FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
            C89219l.m154721d(fTCEditInfoStickerState2, "");
            return FTCEditInfoStickerState.copy$default(fTCEditInfoStickerState2, null, null, null, null, null, new C20525o(new C89386u(Float.valueOf(this.f120291a), Float.valueOf(this.f120292b), Float.valueOf(this.f120293c))), 31, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: b */
    public final void mo87944b(AbstractC45904h<?> hVar) {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        cVar.mo87988C().mo88015a(hVar, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: a */
    public final void mo87942a(boolean z) {
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C52264i C = cVar.mo87988C();
        if (C.f120433d != null) {
            FTCInfoStickerEditView fTCInfoStickerEditView = C.f120433d;
            fTCInfoStickerEditView.f120314h = z;
            if (!z && fTCInfoStickerEditView.f120313g.f120399b != null) {
                fTCInfoStickerEditView.f120313g.mo88006b();
                fTCInfoStickerEditView.f120298D.mo77176b();
                fTCInfoStickerEditView.f120313g.mo88000a();
                fTCInfoStickerEditView.invalidate();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.AbstractC52231a
    /* renamed from: a */
    public final void mo87940a(int i, int i2, int[] iArr) {
        C89219l.m154721d(iArr, "");
        C52244c cVar = this.f120285a;
        if (cVar == null) {
            C89219l.m154710a("scene");
        }
        C89219l.m154721d(iArr, "");
        C52264i C = cVar.mo87988C();
        if (C.f120447r != null) {
            C.f120455z.post(new RunnableC52287z(C, i, i2, iArr));
        }
    }
}
