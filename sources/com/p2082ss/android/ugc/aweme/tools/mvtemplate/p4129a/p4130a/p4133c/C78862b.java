package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.C78839a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.b */
public final class C78862b extends AbstractC78851a {
    static {
        Covode.recordClassIndex(92011);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78862b(C78859b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e
    /* renamed from: a */
    public final void mo122701a(Object obj) {
        Activity activity;
        AbstractC78856e eVar;
        this.f177239b.f177276a = System.currentTimeMillis();
        C78899d dVar = this.f177240c.f177249f;
        if (dVar != null) {
            dVar.f177318a = 5;
        }
        WeakReference<Activity> weakReference = this.f177240c.f177250g;
        Activity activity2 = null;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity instanceof AbstractC72264w) {
            WeakReference<Activity> weakReference2 = this.f177240c.f177250g;
            if (weakReference2 != null) {
                activity2 = weakReference2.get();
            }
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPreDownloadMusic");
            AbstractC72264w.C72265a a = ((AbstractC72264w) activity2).mo114263a();
            if (a.mo114486a()) {
                long a2 = this.f177239b.mo122711a("use music cache", "success");
                C78899d dVar2 = this.f177240c.f177249f;
                if (dVar2 != null) {
                    dVar2.f177324g = (int) a2;
                }
                AbstractC78852b bVar = this.f177240c.f177252i;
                if (bVar != null) {
                    MusicModel musicModel = a.f162000a;
                    if (musicModel == null) {
                        C89219l.m154715b();
                    }
                    String str = a.f162001b;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    bVar.mo122695a(musicModel, str, false);
                    return;
                }
                return;
            }
        }
        if (this.f177240c.f177248e) {
            AbstractC78852b bVar2 = this.f177240c.f177252i;
            if (bVar2 != null) {
                bVar2.mo122695a(C78839a.C78840a.m137633a(), "", false);
                return;
            }
            return;
        }
        MusicModel musicModel2 = this.f177240c.f177245b;
        if (musicModel2 != null && (eVar = this.f177238a) != null) {
            eVar.mo122701a(musicModel2);
        }
    }
}
