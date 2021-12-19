package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57174b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57234b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.m */
public final class C57289m extends AbstractC57279e<MusicModel> {

    /* renamed from: j */
    boolean f130514j;

    static {
        Covode.recordClassIndex(67194);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57279e
    /* renamed from: d */
    public final AbstractC39060f mo94481d() {
        C57174b bVar = new C57174b(this.f130490g, (byte) 0);
        bVar.f130186f = this.f130514j;
        bVar.f130188h = this.f130491h;
        return bVar;
    }

    /* renamed from: a */
    public final void mo94489a(C57171a aVar) {
        if (this.f130488e instanceof C57174b) {
            ((C57174b) this.f130488e).f130185e = aVar;
        }
    }

    /* renamed from: a */
    public final void mo94490a(AbstractC57234b bVar) {
        if (this.f130488e instanceof C57174b) {
            ((C57174b) this.f130488e).f130181a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo94491a(boolean z) {
        this.f130514j = z;
        if (this.f130488e instanceof C57174b) {
            ((C57174b) this.f130488e).f130186f = this.f130514j;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57279e, com.p2082ss.android.ugc.aweme.arch.AbstractC33936c
    /* renamed from: a */
    public final void mo60176a(List<MusicModel> list, boolean z) {
        super.mo60176a(list, z);
    }

    public C57289m(Context context, View view, AbstractC57233a aVar, AbstractC39063h.AbstractC39067a aVar2, AbstractC57080c<C57192b> cVar, int i) {
        super(context, view, aVar, aVar2, cVar, i);
    }

    public C57289m(Context context, View view, AbstractC57233a aVar, int i, AbstractC39063h.AbstractC39067a aVar2, AbstractC57080c<C57192b> cVar, int i2) {
        super(context, view, aVar, i, aVar2, cVar, i2);
    }
}
