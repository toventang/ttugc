package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l;
import com.p2082ss.android.ugc.aweme.tools.extract.C78526d;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.i */
final /* synthetic */ class C78574i implements AbstractC78550l.AbstractC78551a {

    /* renamed from: a */
    private final Object f176579a;

    /* renamed from: b */
    private final AbstractC78487a f176580b;

    /* renamed from: c */
    private final C1743j f176581c;

    static {
        Covode.recordClassIndex(91708);
    }

    C78574i(Object obj, AbstractC78487a aVar, C1743j jVar) {
        this.f176579a = obj;
        this.f176580b = aVar;
        this.f176581c = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l.AbstractC78551a
    /* renamed from: a */
    public final void mo122481a(boolean z) {
        Object obj = this.f176579a;
        AbstractC78487a aVar = this.f176580b;
        C1743j jVar = this.f176581c;
        if (z) {
            if ((obj instanceof VideoPublishEditModel) && !(aVar instanceof C78526d)) {
                ((VideoPublishEditModel) obj).extractFramesModel = aVar.mo122411c();
            }
            jVar.mo5557b((Object) null);
            return;
        }
        jVar.mo5556b((Exception) new IllegalStateException("frame extractor fail"));
    }
}
