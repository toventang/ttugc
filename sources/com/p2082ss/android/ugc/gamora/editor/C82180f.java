package com.p2082ss.android.ugc.gamora.editor;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2363ba.C34411c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.AbstractC82351d;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.p4274a.AbstractC82032d;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.VEPreviewMusicParams;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.editor.f */
public final class C82180f extends C82546r {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f183851a = {new C89232y(C82180f.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C89232y(C82180f.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0), new C89232y(C82180f.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0)};

    /* renamed from: i */
    private C69905c f183852i;

    /* renamed from: j */
    private boolean f183853j;

    /* renamed from: k */
    private String f183854k = mo127610c().musicId;

    /* renamed from: l */
    private String f183855l = mo127610c().mMusicOrigin;

    /* renamed from: m */
    private final AbstractC89248d f183856m = new C82182b(this, this);

    /* renamed from: n */
    private final AbstractC89248d f183857n = C21572a.m40505b(getDiContainer(), AbstractC82032d.class);

    /* renamed from: o */
    private final AbstractC89248d f183858o = C21572a.m40505b(getDiContainer(), AbstractC83233s.class);

    /* renamed from: p */
    private final AbstractC89244h f183859p = C89250i.m154774a(EnumC89331m.NONE, new C82181a(this));

    /* renamed from: q */
    private final AbstractC89244h f183860q = C89250i.m154773a((AbstractC89171a) C82183c.f183864a);

    static {
        Covode.recordClassIndex(96008);
    }

    /* renamed from: l */
    private final AbstractC82427a m142198l() {
        return (AbstractC82427a) this.f183856m.mo23374a(this, f183851a[0]);
    }

    /* renamed from: m */
    private final AbstractC83233s m142199m() {
        return (AbstractC83233s) this.f183858o.mo23374a(this, f183851a[2]);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.f$a */
    public static final class C82181a extends AbstractC89220m implements AbstractC89171a<AbstractC82351d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f183861a;

        static {
            Covode.recordClassIndex(96009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82181a(AbstractC21566a aVar) {
            super(0);
            this.f183861a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.lightening.b.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.AbstractC82351d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f183861a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.lightening.b.d> r1 = com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.AbstractC82351d.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82180f.C82181a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac, com.p2082ss.android.ugc.gamora.editor.C82546r
    /* renamed from: a */
    public final void mo127274a() {
        super.mo127274a();
        m142200n();
        this.f183854k = "";
        this.f183855l = "";
        this.f183853j = false;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.f$c */
    static final class C82183c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C82183c f183864a = new C82183c();

        static {
            Covode.recordClassIndex(96011);
        }

        C82183c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac, com.p2082ss.android.ugc.gamora.editor.C82546r
    /* renamed from: b */
    public final int mo127278b() {
        Integer b;
        if (!this.f183853j || (b = C63253l.f143623a.mo73306b().mo101552k().mo101555a().mo70079b()) == null) {
            return -1;
        }
        return b.intValue();
    }

    /* renamed from: n */
    private final void m142200n() {
        String a = C34411c.m70401a(C70005cr.m123611a().f156482a);
        C89219l.m154716b(a, "");
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f200081a = null;
        vEPreviewMusicParams.f200082b = 0;
        vEPreviewMusicParams.f200086f = a;
        vEPreviewMusicParams.f200083c = 0;
        vEPreviewMusicParams.f200084d = 0;
        if (C70005cr.m123611a().f156482a != null) {
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(cVar, "");
            vEPreviewMusicParams.f200087g = cVar.getPreviewStartTime();
        }
        vEPreviewMusicParams.f200094n = 0;
        vEPreviewMusicParams.f200095o = 0.0d;
        vEPreviewMusicParams.f200096p = 0.0d;
        vEPreviewMusicParams.f200097q = 0.0d;
        mo127615f().mo114806a(vEPreviewMusicParams);
        this.f184621d = mo127610c().mMusicPath;
        mo127610c().mMusicPath = null;
        mo127610c().musicId = a;
        mo127610c().mMusicStart = 0;
        mo127610c().isSoundLoop = false;
        C84911q.m145921a("SoundLoop, AiMusic PreviewMusicRemove isSoundLoop = " + mo127610c().isSoundLoop + ' ');
        mo127277a(C70976bp.m125302a(mo127610c(), mo127610c().mMusicPath));
        mo127611c(false);
        this.f183852i = null;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.f$d */
    public static final class C82184d implements C70612k.AbstractC70613a {

        /* renamed from: a */
        final /* synthetic */ C82180f f183865a;

        /* renamed from: b */
        final /* synthetic */ C69905c f183866b;

        static {
            Covode.recordClassIndex(96012);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70613a
        /* renamed from: a */
        public final void mo87581a(C70625d dVar) {
            if (dVar != null) {
                this.f183866b.setMusicWaveData(dVar.getMusicWavePointArray());
            }
            this.f183865a.mo127612d().mo127332a(dVar, this.f183866b.duration, 0);
        }

        C82184d(C82180f fVar, C69905c cVar) {
            this.f183865a = fVar;
            this.f183866b = cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac, com.p2082ss.android.ugc.gamora.editor.C82546r
    /* renamed from: a */
    public final void mo127277a(boolean z) {
        AbstractC82427a l = m142198l();
        if (l != null) {
            l.mo127539a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.f$b */
    public static final class C82182b implements AbstractC89248d<Object, AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f183862a;

        /* renamed from: b */
        final /* synthetic */ C82180f f183863b;

        static {
            Covode.recordClassIndex(96010);
        }

        public C82182b(AbstractC21566a aVar, C82180f fVar) {
            this.f183862a = aVar;
            this.f183863b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* synthetic */ AbstractC82427a mo23374a(Object obj, AbstractC89286i iVar) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(iVar, "");
            Object b = this.f183862a.getDiContainer().mo35252b(AbstractC82427a.class, null);
            if (C70976bp.m125316l(this.f183863b.mo127610c())) {
                return b;
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.C82546r
    /* renamed from: a */
    public final void mo127370a(String str, String str2) {
        super.mo127370a(str, str2);
        this.f183854k = C34411c.m70401a(C70005cr.m123611a().f156482a);
        this.f183855l = str2;
        this.f183853j = false;
        this.f183852i = C70005cr.m123611a().f156482a;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.C82546r
    /* renamed from: a */
    public final void mo127369a(C69905c cVar, boolean z, String str) {
        AbstractC82427a l;
        super.mo127369a(cVar, z, str);
        if (z && (l = m142198l()) != null) {
            if (cVar == null) {
                C89219l.m154715b();
            }
            l.mo127541b(cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82180f(ActivityC0945e eVar, AbstractC82563s sVar, C21582f fVar) {
        super(eVar, sVar, fVar);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(fVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02dc  */
    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac, com.p2082ss.android.ugc.gamora.editor.C82546r
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127276a(java.lang.String r14, com.p2082ss.android.ugc.aweme.shortvideo.C69905c r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 803
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82180f.mo127276a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.c, boolean):void");
    }
}
