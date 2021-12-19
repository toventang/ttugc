package com.p2082ss.android.ugc.musicprovider;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84163d;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import com.p2082ss.android.ugc.musicprovider.p4320c.C84140b;

/* renamed from: com.ss.android.ugc.musicprovider.d */
public final class C84157d {

    /* renamed from: a */
    public C84140b f187822a = new C84140b();

    static {
        Covode.recordClassIndex(98056);
    }

    /* renamed from: a */
    public final void mo128977a() {
        C84140b bVar = this.f187822a;
        if (bVar != null) {
            bVar.mo128956a();
        }
    }

    /* renamed from: b */
    public final void mo128984b() {
        C84140b bVar = this.f187822a;
        if (bVar != null) {
            bVar.mo128962b();
        }
    }

    public C84157d() {
        C84158e a = C84158e.m144733a();
        if (a.f187828c == null) {
            a.mo128987b();
        }
        Context context = a.f187828c;
        C84140b bVar = this.f187822a;
        if (bVar != null) {
            bVar.f187766b = context;
            bVar.f187768d = MusicService.m81198m().mo69294a(context);
        }
        String d = C84158e.m144733a().mo128989d();
        String c = C84158e.m144733a().mo128988c();
        if (!C84127b.m144668b(d)) {
            C84127b.m144667a(d);
        }
        if (!C84127b.m144668b(c)) {
            C84127b.m144667a(c);
        }
        C84140b bVar2 = this.f187822a;
        if (bVar2 != null) {
            bVar2.f187767c = c;
        }
    }

    /* renamed from: a */
    public final void mo128979a(AbstractC84160a aVar) {
        C84140b bVar = this.f187822a;
        if (bVar != null) {
            bVar.mo128958a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo128980a(AbstractC84161b bVar) {
        C84140b bVar2 = this.f187822a;
        if (bVar2 != null) {
            bVar2.mo128959a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo128981a(AbstractC84162c cVar) {
        C84140b bVar = this.f187822a;
        if (bVar != null) {
            bVar.mo128960a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo128982a(AbstractC84163d dVar) {
        C84140b bVar = this.f187822a;
        if (bVar != null) {
            bVar.f187765a = dVar;
        }
    }

    /* renamed from: a */
    public final void mo128978a(C84126a aVar, boolean z) {
        C84140b bVar;
        if (aVar.f187738c == 4 && (bVar = this.f187822a) != null) {
            bVar.mo128957a(aVar, z);
        }
    }

    /* renamed from: a */
    public final void mo128983a(String str, boolean z) {
        C84140b bVar = this.f187822a;
        if (bVar != null) {
            bVar.mo128961a(str, z);
        }
    }
}
