package com.p2082ss.android.ugc.gamora.editor;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1213t;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40885b;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40891f;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40886c;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70994e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71025g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.videolength.C71528a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.p4274a.AbstractC82032d;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83135aa;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEMVAudioInfo;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.VEPreviewMusicParams;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.r */
public class C82546r implements AbstractC21566a, AbstractC82036ac {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f184618b = {new C89232y(C82546r.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82546r.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C89232y(C82546r.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0), new C89232y(C82546r.class, "replaceMusicToolbarApi", "getReplaceMusicToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0), new C89232y(C82546r.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};

    /* renamed from: a */
    private final AbstractC89248d f184619a = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: c */
    public final C71025g f184620c = new C71025g();

    /* renamed from: d */
    public String f184621d;

    /* renamed from: e */
    public boolean f184622e;

    /* renamed from: f */
    public final C2564l<C20391d<C69905c>> f184623f;

    /* renamed from: g */
    public final ActivityC0945e f184624g;

    /* renamed from: h */
    public final AbstractC82563s f184625h;

    /* renamed from: i */
    private final EditToolbarViewModel f184626i;

    /* renamed from: j */
    private final AbstractC89248d f184627j;

    /* renamed from: k */
    private final AbstractC89248d f184628k;

    /* renamed from: l */
    private final AbstractC89244h f184629l;

    /* renamed from: m */
    private final AbstractC89244h f184630m;

    /* renamed from: n */
    private final AbstractC89244h f184631n;

    /* renamed from: o */
    private final AbstractC89244h f184632o;

    /* renamed from: p */
    private final AbstractC89248d f184633p;

    /* renamed from: q */
    private final AbstractC89248d f184634q;

    /* renamed from: r */
    private final C2560h<C20391d<C69905c>> f184635r;

    /* renamed from: s */
    private boolean f184636s;

    /* renamed from: t */
    private final C21582f f184637t;

    static {
        Covode.recordClassIndex(96390);
    }

    /* renamed from: l */
    private final AbstractC83233s m142682l() {
        return (AbstractC83233s) this.f184627j.mo23374a(this, f184618b[1]);
    }

    /* renamed from: m */
    private final AbstractC82032d m142683m() {
        return (AbstractC82032d) this.f184628k.mo23374a(this, f184618b[2]);
    }

    /* renamed from: n */
    private final AbstractC52071a m142684n() {
        return (AbstractC52071a) this.f184631n.getValue();
    }

    /* renamed from: o */
    private final AbstractC82427a m142685o() {
        return (AbstractC82427a) this.f184634q.mo23374a(this, f184618b[4]);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: a */
    public void mo127276a(String str, C69905c cVar, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: b */
    public int mo127278b() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final VideoPublishEditModel mo127610c() {
        return (VideoPublishEditModel) this.f184619a.mo23374a(this, f184618b[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AbstractC82104a mo127612d() {
        return (AbstractC82104a) this.f184629l.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final AbstractC83369a mo127614e() {
        return (AbstractC83369a) this.f184630m.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final AbstractC72510a mo127615f() {
        return (AbstractC72510a) this.f184632o.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: g */
    public final C2560h<C20391d<C69905c>> mo127280g() {
        return this.f184635r;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f184637t;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: j */
    public final String mo127282j() {
        return this.f184621d;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$a */
    public static final class C82547a extends AbstractC89220m implements AbstractC89171a<AbstractC82104a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184638a;

        static {
            Covode.recordClassIndex(96391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82547a(AbstractC21566a aVar) {
            super(0);
            this.f184638a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184638a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82546r.C82547a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$b */
    public static final class C82548b extends AbstractC89220m implements AbstractC89171a<AbstractC52071a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184639a;

        static {
            Covode.recordClassIndex(96392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82548b(AbstractC21566a aVar) {
            super(0);
            this.f184639a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184639a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.cutmusic.a> r1 = com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82546r.C82548b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$c */
    public static final class C82549c extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184640a;

        static {
            Covode.recordClassIndex(96393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82549c(AbstractC21566a aVar) {
            super(0);
            this.f184640a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184640a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82546r.C82549c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$d */
    public static final class C82550d extends AbstractC89220m implements AbstractC89171a<AbstractC83369a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184641a;

        static {
            Covode.recordClassIndex(96394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82550d(AbstractC21566a aVar) {
            super(0);
            this.f184641a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.volume.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184641a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.volume.a> r1 = com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82546r.C82550d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: i */
    public final void mo127616i() {
        mo127615f().mo114833v().setValue(C88296t.m153435a());
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$h */
    static final class C82554h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82546r f184646a;

        static {
            Covode.recordClassIndex(96398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82554h(C82546r rVar) {
            super(0);
            this.f184646a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f184646a.mo127616i();
            if (C70976bp.m125316l(this.f184646a.mo127610c())) {
                this.f184646a.f184625h.mo87635X();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: k */
    public final void mo127283k() {
        if (!C80285bz.m139187a(mo127610c()) && mo127610c().isMvThemeVideoType() && !C84904k.m145909a(mo127610c().mvCreateVideoData.musicIds)) {
            C63253l.f143623a.mo73306b().mo101531a((AbstractC40891f) C70005cr.m123611a()).mo101594a(new C82552f(this)).mo101595a(mo127610c().mvCreateVideoData.musicIds);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: a */
    public void mo127274a() {
        AbstractC82032d m;
        mo127615f().mo114806a(new VEPreviewMusicParams());
        this.f184621d = mo127610c().mMusicPath;
        mo127610c().mMusicPath = null;
        mo127610c().musicId = "";
        mo127610c().previewStartTime = 0.0f;
        mo127610c().isOriginalSound = false;
        mo127610c().isCommerceMusic = false;
        mo127610c().mMusicStart = 0;
        mo127610c().mMusicOrigin = "";
        mo127610c().isSoundLoop = false;
        C84911q.m145921a("SoundLoop, NormalMusic clearMusic isSoundLoop = " + mo127610c().isSoundLoop);
        mo127277a(false);
        mo127611c(true);
        mo127613d(false);
        if (mo127610c().isAudioEnhance && (m = m142683m()) != null) {
            m.mo127254c();
        }
        this.f184623f.mo7019b(new C20391d<>(null));
        AbstractC82427a o = m142685o();
        if (o != null) {
            o.mo127538a((C69905c) null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: h */
    public final void mo127281h() {
        String str;
        String str2;
        boolean z;
        String missionId;
        String musicId;
        AVChallenge aVChallenge;
        List<String> b;
        String str3 = mo127610c().mStickerID;
        if (str3 == null || (b = C89361p.m154915b(str3, new String[]{","})) == null) {
            str = null;
        } else {
            str = (String) C89070n.m154561b((List) b, 0);
        }
        ArrayList<TimeSpeedModelExtension> a = CameraComponentModel.m123137a(mo127610c().mVideoSegmentsDesc);
        List list = mo127610c().challenges;
        if (list == null || (aVChallenge = (AVChallenge) C89070n.m154561b(list, 0)) == null) {
            str2 = null;
        } else {
            str2 = aVChallenge.cid;
        }
        String str4 = mo127610c().mFirstStickerMusicIdsJson;
        boolean isAllowClearMusic = mo127610c().isAllowClearMusic();
        boolean z2 = mo127610c().isPhotoMvMode;
        boolean z3 = this.f184622e;
        String str5 = mo127610c().mShootWay;
        String str6 = mo127610c().creationId;
        boolean a2 = C71528a.m126416a(mo127610c());
        C89219l.m154716b(a, "");
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) C89070n.m154583g((List) a);
        if (timeSpeedModelExtension != null) {
            z = timeSpeedModelExtension.isBusiSticker();
        } else {
            z = false;
        }
        boolean useMusicBeatSticker = mo127610c().useMusicBeatSticker();
        long j = mo127610c().maxDuration;
        long videoLength = (long) mo127610c().getVideoLength();
        Mission mission = PublishExtensionModel.fromString(mo127610c().commerceData).mission;
        if (mission == null) {
            missionId = null;
        } else {
            missionId = mission.getMissionId();
        }
        Mission mission2 = PublishExtensionModel.fromString(mo127610c().commerceData).mission;
        if (mission2 != null && !mission2.isMusicToasted()) {
            musicId = mission2.getMusicId();
        } else {
            musicId = null;
        }
        C70994e eVar = new C70994e(str4, str, str2, isAllowClearMusic, z2, z3, str5, str6, a2, z, useMusicBeatSticker, j, videoLength, missionId, musicId);
        ActivityC0945e eVar2 = this.f184624g;
        C82553g gVar = new C82553g(this);
        C82554h hVar = new C82554h(this);
        Bundle bundle = new Bundle();
        if (C70005cr.m123611a().f156485d.size() > 0) {
            bundle.putString("challenge", C70005cr.m123611a().f156485d.get(0).cid);
        } else if (eVar.f158908c != null) {
            bundle.putString("challenge", eVar.f158908c);
        }
        if (!TextUtils.isEmpty(eVar.f158906a)) {
            bundle.putString("first_sticker_music_ids", eVar.f158906a);
        }
        if (!TextUtils.isEmpty(eVar.f158907b)) {
            bundle.putString("first_sticker_id", eVar.f158907b);
        }
        bundle.putBoolean("is_busi_sticker", eVar.f158915j);
        if (eVar.f158916k) {
            bundle.putBoolean("hide_cancel_music_ui", true);
        }
        if (eVar.f158917l != 0) {
            bundle.putLong("max_video_duration", eVar.f158917l);
        }
        if (eVar.f158917l != 0) {
            bundle.putLong("shoot_video_length", eVar.f158918m);
        }
        if (!TextUtils.isEmpty(eVar.f158920o)) {
            bundle.putString("mission_music_id", eVar.f158920o);
        }
        if (!TextUtils.isEmpty(eVar.f158919n)) {
            bundle.putString("mission_id", eVar.f158919n);
        }
        C63253l.f143623a.mo73306b().mo101538a(eVar2, 110, new C40886c(eVar2.getString(R.string.aar), 0, eVar.f158909d, eVar.f158910e, bundle, eVar.f158912g, eVar.f158913h, false, false, eVar.f158911f, eVar.f158914i), gVar, hVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: b */
    public final void mo127279b(boolean z) {
        this.f184636s = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo127611c(boolean z) {
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (z) {
            cVar = null;
        }
        m142681a(cVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$g */
    static final class C82553g extends AbstractC89220m implements AbstractC89172b<C40888d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82546r f184645a;

        static {
            Covode.recordClassIndex(96397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82553g(C82546r rVar) {
            super(1);
            this.f184645a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C40888d dVar) {
            C40888d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            this.f184645a.mo127275a(dVar2);
            if (C70976bp.m125316l(this.f184645a.mo127610c())) {
                this.f184645a.f184625h.mo87635X();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: a */
    public void mo127277a(boolean z) {
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            ((FTCEditToolbarViewModel) C20531t.m38716a(this.f184624g).mo33800a(FTCEditToolbarViewModel.class)).mo88155b(8, z);
        } else {
            this.f184626i.mo128246b(8, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo127613d(boolean z) {
        if (this.f184636s) {
            if (z) {
                AbstractC1196i lifecycle = this.f184624g.getLifecycle();
                C89219l.m154716b(lifecycle, "");
                if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.RESUMED) {
                    return;
                }
            }
            C1213t<C88296t> v = mo127615f().mo114833v();
            v.setValue(C88296t.m153437b());
            v.setValue(C88296t.m153438b(0));
            v.setValue(C88296t.m153435a());
        }
    }

    /* renamed from: a */
    private final void m142681a(C69905c cVar) {
        if (C65350at.m117036a()) {
            EditToolbarViewModel editToolbarViewModel = this.f184626i;
            Drawable a = C0643b.m2369a(this.f184624g, 2131232532);
            if (a == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a, "");
            editToolbarViewModel.mo128239a(a);
        } else if (cVar == null) {
            EditToolbarViewModel editToolbarViewModel2 = this.f184626i;
            Drawable a2 = C0643b.m2369a(this.f184624g, 2131232345);
            if (a2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a2, "");
            editToolbarViewModel2.mo128239a(a2);
        } else {
            EditToolbarViewModel editToolbarViewModel3 = this.f184626i;
            Drawable a3 = C0643b.m2369a(this.f184624g, 2131232531);
            if (a3 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a3, "");
            editToolbarViewModel3.mo128239a(a3);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac
    /* renamed from: a */
    public final void mo127275a(C40888d dVar) {
        C89219l.m154721d(dVar, "");
        if (dVar.f95707a) {
            mo127274a();
            AbstractC83233s l = m142682l();
            if (l != null) {
                l.mo128245b(0);
            }
        } else if (C71528a.m126416a(mo127610c()) && C71528a.m126415a(dVar.f95709c)) {
            mo127615f().mo114833v().setValue(C88296t.m153435a());
            new C79459a(this.f184624g).mo123050a(R.string.czq).mo123053a();
        } else if (!TextUtils.isEmpty(dVar.f95710d)) {
            mo127370a(dVar.f95710d, dVar.f95708b);
            AbstractC83233s l2 = m142682l();
            if (l2 != null) {
                l2.mo128245b(1);
            }
            if (dVar.f95709c != null) {
                C70625d a = C70612k.m124744a(dVar.f95709c);
                if (C63244g.m114602a().mo73255A().mo93901a()) {
                    AbstractC52071a n = m142684n();
                    C69905c cVar = dVar.f95709c;
                    if (cVar == null) {
                        C89219l.m154715b();
                    }
                    n.mo87805a(a, cVar.getDuration());
                } else {
                    AbstractC82104a d = mo127612d();
                    C69905c cVar2 = dVar.f95709c;
                    if (cVar2 == null) {
                        C89219l.m154715b();
                    }
                    d.mo127332a(a, cVar2.getDuration(), 0);
                }
            }
        }
        AbstractC83135aa aaVar = (AbstractC83135aa) this.f184633p.mo23374a(this, f184618b[3]);
        if (aaVar != null) {
            aaVar.mo128277a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$e */
    public static final class C82551e implements AbstractC89248d<Object, AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184642a;

        /* renamed from: b */
        final /* synthetic */ C82546r f184643b;

        static {
            Covode.recordClassIndex(96395);
        }

        public C82551e(AbstractC21566a aVar, C82546r rVar) {
            this.f184642a = aVar;
            this.f184643b = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* synthetic */ AbstractC82427a mo23374a(Object obj, AbstractC89286i iVar) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(iVar, "");
            Object b = this.f184642a.getDiContainer().mo35252b(AbstractC82427a.class, null);
            if (C70976bp.m125316l(this.f184643b.mo127610c())) {
                return b;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.r$f */
    static final class C82552f implements AbstractC40885b {

        /* renamed from: a */
        final /* synthetic */ C82546r f184644a;

        static {
            Covode.recordClassIndex(96396);
        }

        C82552f(C82546r rVar) {
            this.f184644a = rVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40885b
        /* renamed from: a */
        public final void mo70071a(C69905c cVar, boolean z) {
            C82546r rVar = this.f184644a;
            C89219l.m154716b(cVar, "");
            rVar.f184622e = cVar.isMvThemeMusic();
            this.f184644a.mo127369a(cVar, z, "mv_default");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x026c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo127370a(java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C82546r.mo127370a(java.lang.String, java.lang.String):void");
    }

    public C82546r(ActivityC0945e eVar, AbstractC82563s sVar, C21582f fVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(fVar, "");
        this.f184624g = eVar;
        this.f184625h = sVar;
        this.f184637t = fVar;
        JediViewModel a = C20531t.m38716a(eVar).mo33800a(EditToolbarViewModel.class);
        C89219l.m154716b(a, "");
        this.f184626i = (EditToolbarViewModel) a;
        this.f184627j = C21572a.m40505b(getDiContainer(), AbstractC83233s.class);
        this.f184628k = C21572a.m40505b(getDiContainer(), AbstractC82032d.class);
        this.f184629l = C89250i.m154774a(EnumC89331m.NONE, new C82547a(this));
        this.f184630m = C89250i.m154774a(EnumC89331m.NONE, new C82550d(this));
        this.f184631n = C89250i.m154774a(EnumC89331m.NONE, new C82548b(this));
        this.f184632o = C89250i.m154774a(EnumC89331m.NONE, new C82549c(this));
        this.f184633p = C21572a.m40505b(getDiContainer(), AbstractC83135aa.class);
        this.f184634q = new C82551e(this, this);
        C2564l<C20391d<C69905c>> lVar = new C2564l<>(null);
        this.f184623f = lVar;
        this.f184635r = lVar;
        this.f184636s = true;
    }

    /* renamed from: a */
    public void mo127369a(C69905c cVar, boolean z, String str) {
        VEMVAudioInfo e;
        if (cVar != null && z) {
            this.f184623f.mo7019b(new C20391d<>(cVar));
            AbstractC82427a o = m142685o();
            if (o != null) {
                o.mo127538a(cVar);
            }
            mo127610c().musicId = cVar.getMusicId();
            mo127610c().previewStartTime = cVar.getPreviewStartTime();
            mo127610c().isCommerceMusic = cVar.isCommerceMusic();
            mo127610c().isOriginalSound = cVar.isOriginalSound();
            AbstractC31071f value = mo127615f().mo114778C().getValue();
            if (value == null || (e = value.mo56353e()) == null) {
                mo127610c().mMusicStart = 0;
                mo127610c().mMusicEnd = Math.min(cVar.getPresenterDuration(), 60000);
            } else {
                mo127610c().mMusicStart = e.trimIn;
                mo127610c().mMusicEnd = e.trimOut;
            }
            mo127610c().mMusicOrigin = str;
        }
    }
}
