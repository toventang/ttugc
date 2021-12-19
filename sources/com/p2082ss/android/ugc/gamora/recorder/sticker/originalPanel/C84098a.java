package com.p2082ss.android.ugc.gamora.recorder.sticker.originalPanel;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75513d;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84084i;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.originalPanel.a */
public final class C84098a implements AbstractC75514e {

    /* renamed from: a */
    public final ShortVideoContext f187677a;

    /* renamed from: b */
    public final AbstractC84919c f187678b;

    /* renamed from: c */
    public final ActivityC0218d f187679c;

    /* renamed from: d */
    public final AbstractC84917a f187680d;

    /* renamed from: e */
    public final AbstractC14330a f187681e;

    static {
        Covode.recordClassIndex(97993);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.originalPanel.a$a */
    static final class C84099a implements AbstractC75513d {

        /* renamed from: a */
        public final int f187682a;

        /* renamed from: b */
        public final List<C75445g> f187683b;

        static {
            Covode.recordClassIndex(97994);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75513d
        /* renamed from: b */
        public final int mo119196b() {
            return this.f187682a;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75513d
        /* renamed from: a */
        public final List<String> mo119195a() {
            ArrayList arrayList = new ArrayList();
            for (C75445g gVar : this.f187683b) {
                String str = gVar.effectId;
                C89219l.m154716b(str, "");
                arrayList.add(str);
            }
            return arrayList;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.sticker.model.g> */
        /* JADX WARN: Multi-variable type inference failed */
        public C84099a(int i, List<? extends C75445g> list) {
            C89219l.m154721d(list, "");
            this.f187682a = i;
            this.f187683b = list;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: a */
    public final boolean mo119202a() {
        if (C16048b.m29633a().mo25412a(true, "studio_creators_names_clickable", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: b */
    public final void mo119203b() {
        AbstractC84919c cVar = this.f187678b;
        if (cVar != null) {
            cVar.mo87531a(this.f187680d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: c */
    public final void mo119204c() {
        AbstractC84919c cVar = this.f187678b;
        if (cVar != null) {
            cVar.mo87535c(this.f187680d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: d */
    public final void mo119205d() {
        C85041d.m146220a(this.f187679c, (int) R.string.gzr).mo129984b();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: e */
    public final void mo119206e() {
        AbstractC14330a aVar = this.f187681e;
        if (aVar instanceof AbstractC84089j) {
            ((AbstractC84089j) aVar).mo128900H();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.originalPanel.a$c */
    static final class C84101c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f187686a;

        static {
            Covode.recordClassIndex(97996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84101c(AbstractC89172b bVar) {
            super(1);
            this.f187686a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f187686a.invoke(Integer.valueOf(num.intValue()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.originalPanel.a$b */
    public static final class C84100b implements AbstractC88986z<StickerItemList> {

        /* renamed from: a */
        final /* synthetic */ C84098a f187684a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f187685b;

        static {
            Covode.recordClassIndex(97995);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(StickerItemList stickerItemList) {
            StickerItemList stickerItemList2 = stickerItemList;
            C89219l.m154721d(stickerItemList2, "");
            C84084i.f187668a = stickerItemList2.getCursor();
            AbstractC89172b bVar = this.f187685b;
            int cursor = stickerItemList2.getCursor();
            List<C75445g> stickers = stickerItemList2.getStickers();
            C89219l.m154721d(stickers, "");
            bVar.invoke(new C84099a(cursor, stickers));
        }

        C84100b(C84098a aVar, AbstractC89172b bVar) {
            this.f187684a = aVar;
            this.f187685b = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: a */
    public final void mo119201a(boolean z) {
        Map<String, String> map = new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("enter_method", "click_personal_board").f188764a;
        if (z) {
            C39162r.m79460a("follow", map);
        } else {
            C39162r.m79460a("follow_cancel", map);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: a */
    public final int mo119197a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return C63244g.m114602a().mo73255A().mo93896a(str, str2).mo58670m();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: a */
    public final void mo119198a(String str, int i, AbstractC89172b<? super AbstractC75513d, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        AbstractC63196au C = C63244g.m114602a().mo73257C();
        AVApi b = AVApiImpl.m123134b();
        C89219l.m154716b(b, "");
        String a = b.mo109850a();
        C89219l.m154716b(a, "");
        ((DesignerEffectInfo) C.retrofitCreate(a, DesignerEffectInfo.class)).fetch(str, i, 10).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C84100b(this, bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: a */
    public final void mo119199a(String str, String str2, int i, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        C63244g.m114602a().mo73255A().mo93900a(str, str2, i, new C84101c(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75514e
    /* renamed from: a */
    public final void mo119200a(String str, String str2, String str3, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C84425b a = new C84425b().mo129406a("creation_id", this.f187677a.f155830o).mo129406a("enter_method", "click_main_panel").mo129406a("enter_from", "video_shoot_page").mo129406a("prop_id", str).mo129406a("shoot_way", this.f187677a.f155831p);
        if (str2 == null) {
            str2 = "";
        }
        C39162r.m79460a("click_prop_username", a.mo129406a("tab_name", str2).mo129403a("is_original_prop", 1).mo129406a("prop_author_id", str3).mo129403a("order", i).f188764a);
    }

    public C84098a(ShortVideoContext shortVideoContext, AbstractC84919c cVar, ActivityC0218d dVar, AbstractC84917a aVar, AbstractC14330a aVar2) {
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f187677a = shortVideoContext;
        this.f187678b = cVar;
        this.f187679c = dVar;
        this.f187680d = aVar;
        this.f187681e = aVar2;
    }
}
