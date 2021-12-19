package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35937c;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.music.p3469d.AbstractC60751a;
import java.util.concurrent.TimeUnit;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.e */
public final /* synthetic */ class C35903e implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84744a;

    /* renamed from: b */
    private final C27252o f84745b;

    static {
        Covode.recordClassIndex(43143);
    }

    C35903e(C35899b bVar, C27252o oVar) {
        this.f84744a = bVar;
        this.f84745b = oVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84744a;
        C27252o oVar = this.f84745b;
        bVar.f84734g = false;
        long a = oVar.mo45339a(TimeUnit.MILLISECONDS);
        if (iVar.mo5544c()) {
            bVar.f84729b.mo60191a("refresh_status_user_collected_music", (Object) 1);
            bVar.f84732e.onEventV3("tool_performance_api", new C33744d().mo59983a("api_type", "music_list").mo59981a("duration", a).mo59983a("scene", "favorite").mo59980a("status", 1).mo59983a("error_domain", AbstractC60751a.f138050a).mo59980a("error_code", -1).f79943a);
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.mo5545d();
            C33935b bVar2 = new C33935b();
            bVar2.mo60173a("refresh_status_user_collected_music", 0).mo60173a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).mo60173a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).mo60173a("action_type", 1).mo60173a("list_data", C35937c.m73326a(collectedMusicList.items));
            bVar.f84729b.mo60191a("user_collected_music_list", bVar2);
            bVar.f84732e.onEventV3("tool_performance_api", new C33744d().mo59983a("api_type", "music_list").mo59981a("duration", a).mo59983a("scene", "favorite").mo59980a("status", 0).f79943a);
            return null;
        }
    }
}
