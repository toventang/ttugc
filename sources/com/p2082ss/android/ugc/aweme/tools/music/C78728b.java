package com.p2082ss.android.ugc.aweme.tools.music;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.AbstractC60326a;
import com.p2082ss.android.ugc.aweme.music.p3475j.AbstractC60820a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.b */
public final class C78728b implements AbstractC63192ar {

    /* renamed from: a */
    private AbstractC60326a f176920a;

    static {
        Covode.recordClassIndex(91871);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.b$a */
    public static final class C78729a implements AbstractC61180m {

        /* renamed from: a */
        final /* synthetic */ AbstractC60820a f176921a;

        static {
            Covode.recordClassIndex(91872);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        public final boolean bT_() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: c */
        public final void mo62883c(MusicModel musicModel) {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: h */
        public final MusicModel mo62885h() {
            return this.f176921a.mo98228a();
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: i */
        public final Activity mo62886i() {
            return this.f176921a.mo98232b();
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: r */
        public final void mo62890r() {
            this.f176921a.mo98233c();
        }

        C78729a(AbstractC60820a aVar) {
            this.f176921a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: a */
        public final void mo62876a(MusicModel musicModel, long j) {
            this.f176921a.mo98229a(musicModel, j);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: a */
        public final void mo62878a(MusicModel musicModel, Exception exc) {
            this.f176921a.mo98230a(musicModel, exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m
        /* renamed from: a */
        public final void mo62880a(String str, MusicModel musicModel, String str2) {
            this.f176921a.mo98231a(str, musicModel, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar
    /* renamed from: a */
    public final void mo101644a() {
        AbstractC60326a aVar = this.f176920a;
        if (aVar != null) {
            aVar.aw_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar
    /* renamed from: b */
    public final void mo101648b() {
        AbstractC60326a aVar = this.f176920a;
        if (aVar != null) {
            aVar.mo97995e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar
    /* renamed from: c */
    public final void mo101649c() {
        AbstractC60326a aVar = this.f176920a;
        if (aVar != null) {
            aVar.mo97996f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar
    /* renamed from: d */
    public final void mo101650d() {
        AbstractC60326a aVar = this.f176920a;
        if (aVar != null) {
            aVar.mo63045d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar
    /* renamed from: a */
    public final void mo101646a(MusicModel musicModel) {
        AbstractC60326a aVar = this.f176920a;
        if (aVar != null) {
            aVar.mo63041a(musicModel, 11, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar
    /* renamed from: a */
    public final void mo101645a(AbstractC60820a aVar) {
        C89219l.m154721d(aVar, "");
        this.f176920a = MusicService.m81198m().mo69310b(new C78729a(aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63192ar
    /* renamed from: a */
    public final void mo101647a(MusicModel musicModel, boolean z) {
        AbstractC60326a aVar = this.f176920a;
        if (aVar != null) {
            aVar.mo97993a(musicModel, 11, z, false);
        }
    }
}
