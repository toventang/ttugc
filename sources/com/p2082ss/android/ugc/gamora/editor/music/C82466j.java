package com.p2082ss.android.ugc.gamora.editor.music;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.music.j */
public final class C82466j implements AbstractC63149c {

    /* renamed from: a */
    public final VideoPublishEditModel f184435a;

    /* renamed from: b */
    public final ActivityC0945e f184436b;

    static {
        Covode.recordClassIndex(96306);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c
    /* renamed from: a */
    public final void mo101517a() {
        C70968bl.m125251a(this.f184435a, m142540c());
    }

    /* renamed from: c */
    private static int m142540c() {
        Integer b = C63253l.f143623a.mo73306b().mo101552k().mo101555a().mo70079b();
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c
    /* renamed from: b */
    public final void mo101523b() {
        C84425b a = new C84425b().mo129406a("creation_id", this.f184435a.creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", this.f184435a.mShootWay).mo129406a("content_type", C71817eu.m126792c(this.f184435a)).mo129406a("content_source", C71817eu.m126790a(this.f184435a)).mo129405a("volume", Float.valueOf(this.f184435a.voiceVolume));
        if (this.f184435a.draftId != 0) {
            a.mo129403a("draft_id", this.f184435a.draftId);
        }
        C39162r.m79460a("edit_volume", a.f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c
    /* renamed from: b */
    public final void mo101524b(boolean z) {
        String str;
        VideoPublishEditModel videoPublishEditModel = this.f184435a;
        if (z) {
            str = "recommend";
        } else {
            str = "favorite";
        }
        C70968bl.m125273f(videoPublishEditModel, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c
    /* renamed from: a */
    public final void mo101521a(boolean z) {
        String str;
        C84425b a = new C84425b().mo129406a("enter_from", this.f184435a.enterFrom).mo129406a("creation_id", this.f184435a.creationId).mo129406a("shoot_way", this.f184435a.mShootWay).mo129406a("content_type", C71817eu.m126792c(this.f184435a)).mo129406a("content_source", C71817eu.m126790a(this.f184435a));
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C39162r.m79460a("click_original_sound", a.mo129406a("status", str).f188764a);
    }

    public C82466j(VideoPublishEditModel videoPublishEditModel, ActivityC0945e eVar) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(eVar, "");
        this.f184435a = videoPublishEditModel;
        this.f184436b = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c
    /* renamed from: a */
    public final void mo101519a(MusicModel musicModel, String str) {
        String str2 = "";
        C89219l.m154721d(musicModel, str2);
        C89219l.m154721d(str, str2);
        VideoPublishEditModel videoPublishEditModel = this.f184435a;
        String musicId = musicModel.getMusicId();
        if (musicId != null) {
            str2 = musicId;
        }
        C70968bl.m125258a(videoPublishEditModel, str2, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c
    /* renamed from: a */
    public final void mo101522a(boolean z, MusicModel musicModel) {
        C89219l.m154721d(musicModel, "");
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        C70968bl.m125261a(musicId, z, m142540c(), this.f184435a, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c
    /* renamed from: a */
    public final void mo101520a(MusicModel musicModel, boolean z, int i) {
        String str;
        String str2 = "";
        C89219l.m154721d(musicModel, str2);
        VideoPublishEditModel videoPublishEditModel = this.f184435a;
        String musicId = musicModel.getMusicId();
        if (musicId != null) {
            str2 = musicId;
        }
        int c = m142540c();
        if (z) {
            str = "recommend";
        } else {
            str = "favorite";
        }
        C70968bl.m125257a(videoPublishEditModel, str2, c, str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63149c
    /* renamed from: a */
    public final void mo101518a(MusicModel musicModel, int i, String str, boolean z) {
        String str2 = "";
        C89219l.m154721d(musicModel, str2);
        C89219l.m154721d(str, str2);
        VideoPublishEditModel videoPublishEditModel = this.f184435a;
        String musicId = musicModel.getMusicId();
        if (musicId != null) {
            str2 = musicId;
        }
        C70968bl.m125256a(videoPublishEditModel, str2, i + 1, m142540c(), str, z);
    }
}
