package com.p2082ss.android.ugc.musicprovider.p4320c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84163d;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import com.p2082ss.android.ugc.musicprovider.p4319b.C84128a;

/* renamed from: com.ss.android.ugc.musicprovider.c.b */
public class C84140b {

    /* renamed from: f */
    private static final String f187764f = C84140b.class.getName();

    /* renamed from: a */
    public AbstractC84163d f187765a;

    /* renamed from: b */
    public Context f187766b;

    /* renamed from: c */
    public String f187767c;

    /* renamed from: d */
    public AbstractC61066c f187768d;

    /* renamed from: e */
    private C84128a f187769e;

    /* renamed from: a */
    public final void mo128956a() {
        AbstractC61066c cVar = this.f187768d;
        if (cVar != null) {
            cVar.mo98591c();
        }
    }

    /* renamed from: b */
    public final void mo128962b() {
        AbstractC61066c cVar = this.f187768d;
        if (cVar != null) {
            cVar.mo98585a();
        }
    }

    static {
        Covode.recordClassIndex(98039);
    }

    /* renamed from: a */
    public final void mo128958a(AbstractC84160a aVar) {
        AbstractC61066c cVar = this.f187768d;
        if (cVar != null) {
            cVar.mo98587a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo128959a(AbstractC84161b bVar) {
        AbstractC61066c cVar = this.f187768d;
        if (cVar != null) {
            cVar.mo98588a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo128960a(AbstractC84162c cVar) {
        AbstractC61066c cVar2 = this.f187768d;
        if (cVar2 != null) {
            cVar2.mo98589a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo128957a(C84126a aVar, boolean z) {
        AbstractC61066c cVar;
        if (aVar != null && (cVar = this.f187768d) != null) {
            cVar.mo98586a(aVar, z);
        }
    }

    /* renamed from: a */
    public final void mo128961a(String str, boolean z) {
        if (this.f187769e == null) {
            this.f187769e = new C84128a(this.f187765a);
        }
        this.f187769e.mo128945a(str, z);
    }
}
