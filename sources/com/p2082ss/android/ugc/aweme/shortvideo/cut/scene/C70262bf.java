package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70444d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70438d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70441g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82006b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf */
public final class C70262bf extends AbstractC82006b implements AbstractC20382b {

    /* renamed from: l */
    public static final C70263a f157101l = new C70263a((byte) 0);

    /* renamed from: a */
    public C70242ba f157102a;

    /* renamed from: b */
    public AbstractC70498b f157103b;

    /* renamed from: c */
    public AbstractC70301bw f157104c;

    /* renamed from: d */
    public final C70444d f157105d = new C70444d();

    /* renamed from: e */
    public C69905c f157106e;

    /* renamed from: f */
    public CutVideoStickerPointMusicViewModel f157107f;

    /* renamed from: g */
    public CutVideoListViewModel f157108g;

    /* renamed from: h */
    public CutVideoMultiModeViewModel f157109h;

    /* renamed from: i */
    public AbstractC70261be f157110i;

    /* renamed from: j */
    public CutVideoTitleBarViewModel f157111j;

    /* renamed from: k */
    public CutVideoViewModel f157112k;

    /* renamed from: t */
    private CutVideoMultiBottomViewModel f157113t;

    static {
        Covode.recordClassIndex(82705);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$a */
    public static final class C70263a {
        static {
            Covode.recordClassIndex(82706);
        }

        private C70263a() {
        }

        public /* synthetic */ C70263a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$b */
    public static final class C70264b implements AbstractC70261be {

        /* renamed from: a */
        final /* synthetic */ C70262bf f157114a;

        static {
            Covode.recordClassIndex(82707);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: b */
        public final void mo110914b(View view) {
            C89219l.m154721d(view, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: h */
        public final void mo110920h() {
            this.f157114a.f157105d.mo111003a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: b */
        public final void mo110913b() {
            C70262bf.m124026a(this.f157114a).mo111061a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: c */
        public final void mo110915c() {
            C70262bf.m124026a(this.f157114a).mo111064c();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: d */
        public final void mo110916d() {
            C70262bf.m124026a(this.f157114a).mo111063b();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: e */
        public final List<VideoSegment> mo110917e() {
            return this.f157114a.mo110921a().mo110877c();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: f */
        public final void mo110918f() {
            this.f157114a.mo110921a().f157048c.mo111034b();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: a */
        public final void mo110909a() {
            new C79459a(this.f157114a.mo36483q()).mo123050a(R.string.dbs).mo123053a();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: g */
        public final void mo110919g() {
            this.f157114a.mo110921a().f157070y = true;
            if (this.f157114a.mo110921a().f157048c.mo111032a()) {
                this.f157114a.mo110921a().f157069x = true;
            }
            this.f157114a.mo110921a().f157048c.mo111034b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70264b(C70262bf bfVar) {
            this.f157114a = bfVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: a */
        public final void mo110910a(int i) {
            C70262bf.m124026a(this.f157114a).mo111062a(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: a */
        public final void mo110911a(View view) {
            C89219l.m154721d(view, "");
            C39162r.m79460a("click_clip_entrance", C70463h.m124284a().f188764a);
            C70262bf.m124027b(this.f157114a).mo110699c(true);
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f157114a.f157111j;
            if (cutVideoTitleBarViewModel == null) {
                C89219l.m154710a("titleBarViewModel");
            }
            cutVideoTitleBarViewModel.mo110799e(false);
            CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f157114a.f157109h;
            if (cutVideoMultiModeViewModel == null) {
                C89219l.m154710a("videoMultiModeViewModel");
            }
            cutVideoMultiModeViewModel.mo110722g();
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f157114a.f157107f;
            if (cutVideoStickerPointMusicViewModel == null) {
                C89219l.m154710a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.mo33689c(new CutVideoStickerPointMusicViewModel.C70139a());
            C70262bf.m124027b(this.f157114a).mo110695a();
            AbstractC22219j jVar = this.f157114a.f52551o;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            C22226a.m41823a((AbstractC22186b) jVar, "CutVideoListScene");
            AbstractC22219j jVar2 = this.f157114a.f52551o;
            Objects.requireNonNull(jVar2, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            C22226a.m41823a((AbstractC22186b) jVar2, "CutVideoBottomBarScene");
            AbstractC22219j jVar3 = this.f157114a.f52551o;
            Objects.requireNonNull(jVar3, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            C22226a.m41823a((AbstractC22186b) jVar3, "CutVideoEditScene");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70261be
        /* renamed from: a */
        public final void mo110912a(C69905c cVar, String str) {
            C89219l.m154721d(str, "");
            if (cVar == null) {
                if (this.f157114a.mo110921a().f157069x) {
                    this.f157114a.mo110921a().f157048c.mo111036c();
                    this.f157114a.mo110921a().f157069x = false;
                }
                this.f157114a.f157105d.mo111005b();
                return;
            }
            if (this.f157114a.f157106e != null) {
                C69905c cVar2 = this.f157114a.f157106e;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                if (!TextUtils.isEmpty(cVar2.getMusicId())) {
                    C69905c cVar3 = this.f157114a.f157106e;
                    if (cVar3 == null) {
                        C89219l.m154715b();
                    }
                    if (C89219l.m154714a((Object) cVar3.getMusicId(), (Object) cVar.getMusicId())) {
                        if (this.f157114a.mo110921a().f157069x) {
                            this.f157114a.mo110921a().f157048c.mo111036c();
                            this.f157114a.mo110921a().f157069x = false;
                        }
                        this.f157114a.f157105d.mo111005b();
                        return;
                    }
                }
            }
            CutVideoViewModel cutVideoViewModel = this.f157114a.f157112k;
            if (cutVideoViewModel == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            cutVideoViewModel.mo110802b().f156858p = str;
            C70242ba a = this.f157114a.mo110921a();
            C89219l.m154721d(str, "");
            a.f157054i = str;
            this.f157114a.f157106e = cVar;
            this.f157114a.mo110921a().f157049d = cVar;
            this.f157114a.mo110922a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$j */
    public static final class C70274j implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ C70262bf f157124a;

        /* renamed from: b */
        final /* synthetic */ boolean f157125b;

        static {
            Covode.recordClassIndex(82717);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
            this.f157124a.f157105d.mo111005b();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            this.f157124a.f157105d.mo111005b();
            if (this.f157125b) {
                this.f157124a.mo110921a().f157048c.mo111036c();
                AbstractC70441g gVar = this.f157124a.mo110921a().f157050e;
                if (gVar != null) {
                    gVar.mo110822a();
                }
            }
        }

        C70274j(C70262bf bfVar, boolean z) {
            this.f157124a = bfVar;
            this.f157125b = z;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f157105d.mo111006c();
    }

    /* renamed from: a */
    public final C70242ba mo110921a() {
        C70242ba baVar = this.f157102a;
        if (baVar == null) {
            C89219l.m154710a("stickPointController");
        }
        return baVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$c */
    public static final class C70265c implements AbstractC70438d {

        /* renamed from: a */
        final /* synthetic */ C70262bf f157115a;

        static {
            Covode.recordClassIndex(82708);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70265c(C70262bf bfVar) {
            this.f157115a = bfVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70438d
        /* renamed from: a */
        public final void mo110923a(View view) {
            C89219l.m154721d(view, "");
            C70262bf.m124028c(this.f157115a).mo110911a(view);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70438d
        /* renamed from: b */
        public final void mo110924b(View view) {
            C89219l.m154721d(view, "");
            AbstractC70301bw bwVar = this.f157115a.f157104c;
            if (bwVar == null) {
                C89219l.m154710a("musicViewController");
            }
            bwVar.mo110904e();
            C70262bf.m124028c(this.f157115a).mo110914b(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$i */
    public static final class C70273i implements AbstractC40896k {

        /* renamed from: a */
        final /* synthetic */ AbstractC63154aa.AbstractC63163h f157123a;

        static {
            Covode.recordClassIndex(82716);
        }

        C70273i(AbstractC63154aa.AbstractC63163h hVar) {
            this.f157123a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k
        /* renamed from: a */
        public final void mo70093a(int i) {
            String str;
            MusicModel c = this.f157123a.mo101604c(i);
            if (c != null) {
                str = c.getMusicId();
            } else {
                str = null;
            }
            C39162r.m79460a("music_show", C70463h.m124284a().mo129406a("content_source", "upload").mo129406a("content_type", "sound_sync").mo129406a("music_id", str).mo129406a("tab_name", "recommend").mo129403a("order", i).f188764a);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC70498b m124026a(C70262bf bfVar) {
        AbstractC70498b bVar = bfVar.f157103b;
        if (bVar == null) {
            C89219l.m154710a("musicView");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoListViewModel m124027b(C70262bf bfVar) {
        CutVideoListViewModel cutVideoListViewModel = bfVar.f157108g;
        if (cutVideoListViewModel == null) {
            C89219l.m154710a("videoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ AbstractC70261be m124028c(C70262bf bfVar) {
        AbstractC70261be beVar = bfVar.f157110i;
        if (beVar == null) {
            C89219l.m154710a("listener");
        }
        return beVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: a */
    public final void mo110922a(boolean z) {
        this.f157105d.mo111003a();
        C70242ba baVar = this.f157102a;
        if (baVar == null) {
            C89219l.m154710a("stickPointController");
        }
        baVar.f157048c.mo111035b(this.f157106e, 0, 2, new C70274j(this, z));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoStickerPointMusicViewModel.class);
        C89219l.m154716b(a, "");
        this.f157107f = (CutVideoStickerPointMusicViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(CutVideoListViewModel.class);
        C89219l.m154716b(a2, "");
        this.f157108g = (CutVideoListViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(CutVideoMultiModeViewModel.class);
        C89219l.m154716b(a3, "");
        this.f157109h = (CutVideoMultiModeViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(CutVideoMultiBottomViewModel.class);
        C89219l.m154716b(a4, "");
        this.f157113t = (CutVideoMultiBottomViewModel) a4;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity5).mo33800a(CutVideoTitleBarViewModel.class);
        C89219l.m154716b(a5, "");
        this.f157111j = (CutVideoTitleBarViewModel) a5;
        Activity activity6 = this.f52549m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a6 = C20531t.m38716a((ActivityC0945e) activity6).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a6, "");
        this.f157112k = (CutVideoViewModel) a6;
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f157107f;
        if (cutVideoStickerPointMusicViewModel == null) {
            C89219l.m154710a("musicViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoStickerPointMusicViewModel, C70275bg.f157126a, new C70267e(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.f157107f;
        if (cutVideoStickerPointMusicViewModel2 == null) {
            C89219l.m154710a("musicViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoStickerPointMusicViewModel2, C70276bh.f157127a, new C70268f(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel3 = this.f157107f;
        if (cutVideoStickerPointMusicViewModel3 == null) {
            C89219l.m154710a("musicViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoStickerPointMusicViewModel3, C70277bi.f157128a, new C70270g(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel4 = this.f157107f;
        if (cutVideoStickerPointMusicViewModel4 == null) {
            C89219l.m154710a("musicViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoStickerPointMusicViewModel4, C70278bj.f157129a, new C70272h(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel5 = this.f157107f;
        if (cutVideoStickerPointMusicViewModel5 == null) {
            C89219l.m154710a("musicViewModel");
        }
        selectNonNullSubscribe(cutVideoStickerPointMusicViewModel5, C70279bk.f157130a, new C20370ah(), new C70266d(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$e */
    static final class C70267e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70262bf f157117a;

        static {
            Covode.recordClassIndex(82710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70267e(C70262bf bfVar) {
            super(2);
            this.f157117a = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f157117a.mo110922a(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$h */
    static final class C70272h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70262bf f157122a;

        static {
            Covode.recordClassIndex(82715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70272h(C70262bf bfVar) {
            super(2);
            this.f157122a = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                this.f157122a.f157105d.mo111003a();
            } else {
                this.f157122a.f157105d.mo111005b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.arv, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$d */
    static final class C70266d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70262bf f157116a;

        static {
            Covode.recordClassIndex(82709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70266d(C70262bf bfVar) {
            super(2);
            this.f157116a = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            View d = C70262bf.m124026a(this.f157116a).mo111065d();
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            d.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$f */
    static final class C70268f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70262bf f157118a;

        static {
            Covode.recordClassIndex(82711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70268f(C70262bf bfVar) {
            super(2);
            this.f157118a = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C70262bf.m124026a(this.f157118a).setButtonClickable(false);
            }
            C70303d.m124100a(C70262bf.m124026a(this.f157118a).mo111065d(), booleanValue, new AbstractC89172b<Boolean, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70262bf.C70268f.C702691 */

                /* renamed from: a */
                final /* synthetic */ C70268f f157119a;

                static {
                    Covode.recordClassIndex(82712);
                }

                {
                    this.f157119a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    C70262bf.m124026a(this.f157119a.f157118a).setButtonClickable(bool.booleanValue());
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$g */
    static final class C70270g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70262bf f157120a;

        static {
            Covode.recordClassIndex(82713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70270g(C70262bf bfVar) {
            super(2);
            this.f157120a = bfVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C70262bf.m124026a(this.f157120a).setButtonClickable(false);
            }
            C70303d.m124101b(C70262bf.m124026a(this.f157120a).mo111065d(), booleanValue, new AbstractC89172b<Boolean, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70262bf.C70270g.C702711 */

                /* renamed from: a */
                final /* synthetic */ C70270g f157121a;

                static {
                    Covode.recordClassIndex(82714);
                }

                {
                    this.f157121a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    C70262bf.m124026a(this.f157121a.f157120a).setButtonClickable(bool.booleanValue());
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.cot);
        Objects.requireNonNull(c, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.IStickPointMusicView");
        this.f157103b = (AbstractC70498b) c;
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        C70254bd bdVar = new C70254bd(t);
        this.f157104c = bdVar;
        AbstractC63154aa.AbstractC63163h c2 = bdVar.mo110902c();
        if (c2 == null) {
            C89219l.m154715b();
        }
        c2.mo101599a(new C70273i(c2));
        AbstractC70498b bVar = this.f157103b;
        if (bVar == null) {
            C89219l.m154710a("musicView");
        }
        bVar.setRecyclerViewAdapter(c2);
        AbstractC70498b bVar2 = this.f157103b;
        if (bVar2 == null) {
            C89219l.m154710a("musicView");
        }
        AbstractC70301bw bwVar = this.f157104c;
        if (bwVar == null) {
            C89219l.m154710a("musicViewController");
        }
        bVar2.setCollectMusicCallback(bwVar.mo110900b());
        this.f157110i = new C70264b(this);
        AbstractC70301bw bwVar2 = this.f157104c;
        if (bwVar2 == null) {
            C89219l.m154710a("musicViewController");
        }
        AbstractC70261be beVar = this.f157110i;
        if (beVar == null) {
            C89219l.m154710a("listener");
        }
        bwVar2.mo110898a(beVar);
        AbstractC70498b bVar3 = this.f157103b;
        if (bVar3 == null) {
            C89219l.m154710a("musicView");
        }
        bVar3.setStickPointMusicListener(new C70265c(this));
        C70242ba baVar = this.f157102a;
        if (baVar == null) {
            C89219l.m154710a("stickPointController");
        }
        AbstractC70301bw bwVar3 = this.f157104c;
        if (bwVar3 == null) {
            C89219l.m154710a("musicViewController");
        }
        C89219l.m154721d(bwVar3, "");
        baVar.f157046a = bwVar3;
        this.f157105d.mo111004a(this.f52549m);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
