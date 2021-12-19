package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70410e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70528i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71796s;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71558b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.utils.C80332db;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d */
public final class C71594d extends AbstractC71586a implements AbstractC70442h {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f160430a = {new C89232y(C71594d.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new C89232y(C71594d.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new C89232y(C71594d.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0), new C89232y(C71594d.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new C89232y(C71594d.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new C89232y(C71594d.class, "thumbnailCache", "getThumbnailCache()Lcom/ss/android/ugc/aweme/utils/FrameCache;", 0)};

    /* renamed from: d */
    public static final C71595a f160431d = new C71595a((byte) 0);

    /* renamed from: b */
    public C71588c f160432b;

    /* renamed from: c */
    public C70582z f160433c;

    /* renamed from: e */
    private final String f160434e = "MultiEditModeBottomScene";

    /* renamed from: f */
    private final AbstractC89248d f160435f = C21572a.m40504a(getDiContainer(), VideoEditViewModel.class);

    /* renamed from: g */
    private final AbstractC89248d f160436g = C21572a.m40504a(getDiContainer(), C71557a.class);

    /* renamed from: h */
    private final AbstractC89248d f160437h = C21572a.m40504a(getDiContainer(), CutMultiVideoViewModel.class);

    /* renamed from: i */
    private final AbstractC89248d f160438i = C21572a.m40504a(getDiContainer(), AbstractC71775m.class);

    /* renamed from: j */
    private final AbstractC89248d f160439j = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: k */
    private final AbstractC89248d f160440k = C21572a.m40504a(getDiContainer(), C80332db.class);

    /* renamed from: l */
    private TextView f160441l;

    /* renamed from: t */
    private RecyclerView f160442t;

    /* renamed from: u */
    private View f160443u;

    static {
        Covode.recordClassIndex(84139);
    }

    /* renamed from: G */
    private final C71557a m126497G() {
        return (C71557a) this.f160436g.mo23374a(this, f160430a[1]);
    }

    /* renamed from: H */
    private final EditAdjustClipsBottomViewModel m126498H() {
        return (EditAdjustClipsBottomViewModel) this.f160439j.mo23374a(this, f160430a[4]);
    }

    /* renamed from: C */
    public final VideoEditViewModel mo113341C() {
        return (VideoEditViewModel) this.f160435f.mo23374a(this, f160430a[0]);
    }

    /* renamed from: D */
    public final CutMultiVideoViewModel mo113342D() {
        return (CutMultiVideoViewModel) this.f160437h.mo23374a(this, f160430a[2]);
    }

    /* renamed from: E */
    public final AbstractC71775m mo113343E() {
        return (AbstractC71775m) this.f160438i.mo23374a(this, f160430a[3]);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
    /* renamed from: a */
    public final void mo110934a(View view) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
    /* renamed from: a */
    public final void mo110935a(List<? extends MediaModel> list) {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$a */
    public static final class C71595a {
        static {
            Covode.recordClassIndex(84140);
        }

        private C71595a() {
        }

        public /* synthetic */ C71595a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d
    /* renamed from: a */
    public final String mo113345a() {
        return this.f160434e;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        if (this.f160432b != null) {
            C71588c cVar = this.f160432b;
            if (cVar == null) {
                C89219l.m154710a("cutVideoListViewHolder");
            }
            cVar.mo113336a();
        }
    }

    /* renamed from: F */
    public final void mo113344F() {
        Bundle b;
        Activity activity;
        RecyclerView recyclerView = this.f160442t;
        if (recyclerView == null) {
            C89219l.m154710a("videoListView");
        }
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (!(adapter instanceof C70582z)) {
            adapter = null;
        }
        C70582z zVar = (C70582z) adapter;
        if (zVar != null && (b = C70455f.f157421e.mo111021b(this.f52549m, zVar.mo111340a(), zVar.mo111344b())) != null && (activity = this.f52549m) != null) {
            C22228c.m41829a(this, C72724a.m128203a().mo62189a(activity, b), new C71603i(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
    /* renamed from: c */
    public final void mo110937c(View view) {
        mo113344F();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h
    /* renamed from: b */
    public final void mo110936b(View view) {
        mo113343E().mo113406u();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$c */
    static final class C71597c extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71594d f160445a;

        static {
            Covode.recordClassIndex(84142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71597c(C71594d dVar) {
            super(1);
            this.f160445a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            C70582z zVar = this.f160445a.f160433c;
            if (zVar != null) {
                zVar.notifyDataSetChanged();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$d */
    static final class C71598d extends AbstractC89220m implements AbstractC89172b<C20524n<Integer, VideoSegment>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71594d f160446a;

        static {
            Covode.recordClassIndex(84143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71598d(C71594d dVar) {
            super(1);
            this.f160446a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20524n<Integer, VideoSegment> nVar) {
            C20524n<Integer, VideoSegment> nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C70582z zVar = this.f160446a.f160433c;
            if (zVar != null) {
                zVar.mo111346b((VideoSegment) nVar2.f48283b.getSecond());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$e */
    static final class C71599e extends AbstractC89220m implements AbstractC89172b<C20524n<Integer, VideoSegment>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71594d f160447a;

        static {
            Covode.recordClassIndex(84144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71599e(C71594d dVar) {
            super(1);
            this.f160447a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20524n<Integer, VideoSegment> nVar) {
            C20524n<Integer, VideoSegment> nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C70582z zVar = this.f160447a.f160433c;
            if (zVar != null) {
                zVar.mo111342a((VideoSegment) nVar2.f48283b.getSecond());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$f */
    static final class C71600f extends AbstractC89220m implements AbstractC89172b<C20391d<? extends List<? extends VideoSegment>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71594d f160448a;

        static {
            Covode.recordClassIndex(84145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71600f(C71594d dVar) {
            super(1);
            this.f160448a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20391d<? extends List<? extends VideoSegment>> dVar) {
            C20391d<? extends List<? extends VideoSegment>> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C70582z zVar = this.f160448a.f160433c;
            if (zVar != null) {
                zVar.mo111347b((List<VideoSegment>) dVar2.f48283b);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$g */
    static final class C71601g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71594d f160449a;

        static {
            Covode.recordClassIndex(84146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71601g(C71594d dVar) {
            super(1);
            this.f160449a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C70582z zVar = this.f160449a.f160433c;
            if (!(zVar instanceof C70410e)) {
                zVar = null;
            }
            C70410e eVar = (C70410e) zVar;
            if (eVar != null) {
                eVar.mo110982a(booleanValue);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$b */
    static final class C71596b extends AbstractC89220m implements AbstractC89172b<C20391d<? extends C71796s>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71594d f160444a;

        static {
            Covode.recordClassIndex(84141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71596b(C71594d dVar) {
            super(1);
            this.f160444a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20391d<? extends C71796s> dVar) {
            C89219l.m154721d(dVar, "");
            C70582z zVar = this.f160444a.f160433c;
            if (zVar != null) {
                List<VideoSegment> k = this.f160444a.mo113341C().mo111232k();
                C89219l.m154716b(k, "");
                ArrayList arrayList = new ArrayList();
                for (T t : k) {
                    if (!t.f156717i) {
                        arrayList.add(t);
                    }
                }
                zVar.mo111343a(arrayList);
                zVar.notifyDataSetChanged();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.ev0);
        C89219l.m154716b(c, "");
        this.f160441l = (TextView) c;
        View c2 = mo36475c(R.id.fbs);
        C89219l.m154716b(c2, "");
        this.f160442t = (RecyclerView) c2;
        View c3 = mo36475c(R.id.ju);
        C89219l.m154716b(c3, "");
        this.f160443u = c3;
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        C71588c cVar = new C71588c(t, this, mo113341C(), mo113342D());
        this.f160432b = cVar;
        RecyclerView recyclerView = this.f160442t;
        if (recyclerView == null) {
            C89219l.m154710a("videoListView");
        }
        View view = this.f160443u;
        if (view == null) {
            C89219l.m154710a("animateDot");
        }
        cVar.mo113337a(recyclerView, view, new C71587b(C71558b.m126459b(m126497G()), C71558b.m126458a(m126497G()), false), new C71602h(this));
        RecyclerView recyclerView2 = this.f160442t;
        if (recyclerView2 == null) {
            C89219l.m154710a("videoListView");
        }
        C70582z zVar = (C70582z) recyclerView2.getAdapter();
        this.f160433c = zVar;
        if (zVar != null) {
            zVar.f157930g = (C80332db) this.f160440k.mo23374a(this, f160430a[5]);
        }
        C70582z zVar2 = this.f160433c;
        if (!(zVar2 instanceof C70410e)) {
            zVar2 = null;
        }
        C70410e eVar = (C70410e) zVar2;
        if (eVar != null) {
            eVar.f157351i = this;
        }
        AbstractC88412b unused = m126498H().mo33677a(this, C71604e.f160452a, new C20370ah(), new C71598d(this));
        AbstractC88412b unused2 = m126498H().mo33677a(this, C71606g.f160454a, new C20370ah(), new C71599e(this));
        AbstractC88412b unused3 = m126498H().mo33677a(this, C71607h.f160455a, new C20370ah(), new C71600f(this));
        AbstractC88412b unused4 = m126498H().mo33677a(this, C71608i.f160456a, new C20370ah(), new C71601g(this));
        AbstractC88412b unused5 = m126498H().mo33677a(this, C71609j.f160457a, new C20370ah(), new C71596b(this));
        AbstractC88412b unused6 = m126498H().mo33677a(this, C71605f.f160453a, new C20370ah(), new C71597c(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.d2, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$h */
    static final class C71602h implements C70582z.AbstractC70584b {

        /* renamed from: a */
        final /* synthetic */ C71594d f160450a;

        static {
            Covode.recordClassIndex(84147);
        }

        C71602h(C71594d dVar) {
            this.f160450a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z.AbstractC70584b
        /* renamed from: a */
        public final void mo110976a(int i, String str) {
            if (i == 10003) {
                this.f160450a.mo113344F();
                return;
            }
            int a = this.f160450a.mo113341C().mo111205a(str);
            if (a >= 0) {
                this.f160450a.mo113342D().mo110473a(i, a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d$i */
    public static final class C71603i extends AbstractC89220m implements AbstractC89183m<Integer, Intent, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71594d f160451a;

        static {
            Covode.recordClassIndex(84148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71603i(C71594d dVar) {
            super(2);
            this.f160451a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Integer num, Intent intent) {
            ArrayList parcelableArrayListExtra;
            num.intValue();
            Intent intent2 = intent;
            if (!(intent2 == null || (parcelableArrayListExtra = intent2.getParcelableArrayListExtra("key_choose_media_data")) == null || parcelableArrayListExtra.isEmpty())) {
                this.f160451a.mo113343E().mo113383b(C70528i.m124563a(parcelableArrayListExtra, true, null, 4));
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71594d(C21582f fVar, AbstractC22186b bVar) {
        super(fVar, bVar, R.id.b3l);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
    }
}
