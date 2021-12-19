package com.p2082ss.android.ugc.aweme.sticker.view.p4013a;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75431i;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75572h;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75474b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.a.l */
public interface AbstractC76125l {
    static {
        Covode.recordClassIndex(89073);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.a.l$a */
    public static final class C76126a {

        /* renamed from: a */
        public final AbstractC76122i f171017a;

        /* renamed from: b */
        public final AbstractC76085a f171018b;

        /* renamed from: c */
        public final AbstractC84903j f171019c;

        /* renamed from: d */
        public final AbstractC75474b f171020d;

        /* renamed from: e */
        public LiveData<EnumC76135n> f171021e;

        /* renamed from: f */
        public Integer f171022f;

        /* renamed from: g */
        public AbstractC88979t<C89378p<Integer, Integer>> f171023g;

        static {
            Covode.recordClassIndex(89074);
        }

        public C76126a() {
            this(null, null, null, 127);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76126a)) {
                return false;
            }
            C76126a aVar = (C76126a) obj;
            return C89219l.m154714a(this.f171017a, aVar.f171017a) && C89219l.m154714a(this.f171018b, aVar.f171018b) && C89219l.m154714a(this.f171019c, aVar.f171019c) && C89219l.m154714a(this.f171020d, aVar.f171020d) && C89219l.m154714a(this.f171021e, aVar.f171021e) && C89219l.m154714a(this.f171022f, aVar.f171022f) && C89219l.m154714a(this.f171023g, aVar.f171023g);
        }

        public final int hashCode() {
            AbstractC76122i iVar = this.f171017a;
            int i = 0;
            int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
            AbstractC76085a aVar = this.f171018b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            AbstractC84903j jVar = this.f171019c;
            int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            AbstractC75474b bVar = this.f171020d;
            int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            LiveData<EnumC76135n> liveData = this.f171021e;
            int hashCode5 = (hashCode4 + (liveData != null ? liveData.hashCode() : 0)) * 31;
            Integer num = this.f171022f;
            int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
            AbstractC88979t<C89378p<Integer, Integer>> tVar = this.f171023g;
            if (tVar != null) {
                i = tVar.hashCode();
            }
            return hashCode6 + i;
        }

        public final String toString() {
            return "Optional(viewMob=" + this.f171017a + ", lockStickerProcessor=" + this.f171018b + ", logger=" + this.f171019c + ", autoUseStickerMatcherController=" + this.f171020d + ", stickerViewStateLiveData=" + this.f171021e + ", curSelectedPagerPosition=" + this.f171022f + ", stickerCategoryFragmentSelectedObserver=" + this.f171023g + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C76126a(AbstractC76122i iVar, AbstractC76085a aVar, AbstractC84903j jVar, int i) {
            this((i & 1) != 0 ? null : iVar, (i & 2) != 0 ? null : aVar, (i & 4) == 0 ? jVar : null, null, null, null, null);
        }

        public C76126a(AbstractC76122i iVar, AbstractC76085a aVar, AbstractC84903j jVar, AbstractC75474b bVar, LiveData<EnumC76135n> liveData, Integer num, AbstractC88979t<C89378p<Integer, Integer>> tVar) {
            this.f171017a = iVar;
            this.f171018b = aVar;
            this.f171019c = jVar;
            this.f171020d = bVar;
            this.f171021e = liveData;
            this.f171022f = num;
            this.f171023g = tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.a.l$b */
    public static final class C76127b {

        /* renamed from: a */
        public final AbstractC75655o f171024a;

        /* renamed from: b */
        public final AbstractC75300d f171025b;

        /* renamed from: c */
        public final AbstractC75429h f171026c;

        /* renamed from: d */
        public final AbstractC75431i f171027d;

        /* renamed from: e */
        public final AbstractC76151g f171028e;

        /* renamed from: f */
        public final C75572h f171029f;

        static {
            Covode.recordClassIndex(89075);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76127b)) {
                return false;
            }
            C76127b bVar = (C76127b) obj;
            return C89219l.m154714a(this.f171024a, bVar.f171024a) && C89219l.m154714a(this.f171025b, bVar.f171025b) && C89219l.m154714a(this.f171026c, bVar.f171026c) && C89219l.m154714a(this.f171027d, bVar.f171027d) && C89219l.m154714a(this.f171028e, bVar.f171028e) && C89219l.m154714a(this.f171029f, bVar.f171029f);
        }

        public final int hashCode() {
            AbstractC75655o oVar = this.f171024a;
            int i = 0;
            int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
            AbstractC75300d dVar = this.f171025b;
            int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
            AbstractC75429h hVar = this.f171026c;
            int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
            AbstractC75431i iVar = this.f171027d;
            int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
            AbstractC76151g gVar = this.f171028e;
            int hashCode5 = (hashCode4 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            C75572h hVar2 = this.f171029f;
            if (hVar2 != null) {
                i = hVar2.hashCode();
            }
            return hashCode5 + i;
        }

        public final String toString() {
            return "Required(stickerDataManager=" + this.f171024a + ", clickController=" + this.f171025b + ", stickerMobHelper=" + this.f171026c + ", stickerMonitor=" + this.f171027d + ", tagHandler=" + this.f171028e + ", stickerViewConfigure=" + this.f171029f + ")";
        }

        public C76127b(AbstractC75655o oVar, AbstractC75300d dVar, AbstractC75429h hVar, AbstractC75431i iVar, AbstractC76151g gVar, C75572h hVar2) {
            C89219l.m154721d(oVar, "");
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(gVar, "");
            C89219l.m154721d(hVar2, "");
            this.f171024a = oVar;
            this.f171025b = dVar;
            this.f171026c = hVar;
            this.f171027d = iVar;
            this.f171028e = gVar;
            this.f171029f = hVar2;
        }
    }
}
