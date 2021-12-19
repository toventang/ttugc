package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.d */
public final class C78864d extends AbstractC78851a {
    static {
        Covode.recordClassIndex(92013);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78864d(C78859b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.d$a */
    public static final class C78865a implements AbstractC63257p.AbstractC63258a {

        /* renamed from: a */
        final /* synthetic */ C78864d f177259a;

        /* renamed from: b */
        final /* synthetic */ Object f177260b;

        static {
            Covode.recordClassIndex(92014);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101753a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101754a(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101756a(String str) {
            C89219l.m154721d(str, "");
            long a = this.f177259a.f177239b.mo122711a("download music", "success");
            C78899d dVar = this.f177259a.f177240c.f177249f;
            if (dVar != null) {
                dVar.f177324g = (int) a;
            }
            AbstractC78852b bVar = this.f177259a.f177240c.f177252i;
            if (bVar != null) {
                bVar.mo122695a((MusicModel) this.f177260b, str, false);
            }
        }

        C78865a(C78864d dVar, Object obj) {
            this.f177259a = dVar;
            this.f177260b = obj;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101755a(Integer num, String str) {
            int i;
            long a = this.f177259a.f177239b.mo122711a("download music", "failed.");
            C78899d dVar = this.f177259a.f177240c.f177249f;
            if (dVar != null) {
                dVar.f177324g = (int) a;
            }
            C78899d dVar2 = this.f177259a.f177240c.f177249f;
            if (dVar2 != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                dVar2.f177326i = i;
            }
            C78899d dVar3 = this.f177259a.f177240c.f177249f;
            if (dVar3 != null) {
                dVar3.f177329l = str;
            }
            C78899d dVar4 = this.f177259a.f177240c.f177249f;
            if (dVar4 != null) {
                dVar4.f177328k = 7;
            }
            AbstractC78852b bVar = this.f177259a.f177240c.f177252i;
            if (bVar != null) {
                bVar.mo122694a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e
    /* renamed from: a */
    public final void mo122701a(Object obj) {
        this.f177239b.f177276a = System.currentTimeMillis();
        C78899d dVar = this.f177240c.f177249f;
        if (dVar != null) {
            dVar.f177318a = 4;
        }
        if (obj instanceof MusicModel) {
            C69905c b = C63253l.f143623a.mo73306b().mo101543b((MusicModel) obj);
            if (b == null) {
                long a = this.f177239b.mo122711a("download music", "failed.");
                C78899d dVar2 = this.f177240c.f177249f;
                if (dVar2 != null) {
                    dVar2.f177324g = (int) a;
                }
                C78899d dVar3 = this.f177240c.f177249f;
                if (dVar3 != null) {
                    dVar3.f177329l = "avmusic model null";
                }
                C78899d dVar4 = this.f177240c.f177249f;
                if (dVar4 != null) {
                    dVar4.f177328k = 7;
                }
                AbstractC78852b bVar = this.f177240c.f177252i;
                if (bVar != null) {
                    bVar.mo122694a();
                    return;
                }
                return;
            }
            C78899d dVar5 = this.f177240c.f177249f;
            if (dVar5 != null) {
                String musicId = b.getMusicId();
                C89219l.m154716b(musicId, "");
                C89219l.m154721d(musicId, "");
                dVar5.f177325h = musicId;
            }
            WeakReference<Activity> weakReference = this.f177240c.f177250g;
            Activity activity = null;
            if (weakReference == null || weakReference.get() == null) {
                long a2 = this.f177239b.mo122711a("download music", "failed.");
                C78899d dVar6 = this.f177240c.f177249f;
                if (dVar6 != null) {
                    dVar6.f177324g = (int) a2;
                }
                C78899d dVar7 = this.f177240c.f177249f;
                if (dVar7 != null) {
                    dVar7.f177329l = "activity is null";
                }
                C78899d dVar8 = this.f177240c.f177249f;
                if (dVar8 != null) {
                    dVar8.f177328k = 7;
                }
                AbstractC78852b bVar2 = this.f177240c.f177252i;
                if (bVar2 != null) {
                    bVar2.mo122694a();
                    return;
                }
                return;
            }
            AbstractC63154aa aaVar = C63238c.f143581h;
            WeakReference<Activity> weakReference2 = this.f177240c.f177250g;
            if (weakReference2 == null || (activity = weakReference2.get()) == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            aaVar.mo101744a(activity, b, 6, new C78865a(this, obj));
            return;
        }
        long a3 = this.f177239b.mo122711a("download music", "failed.");
        C78899d dVar9 = this.f177240c.f177249f;
        if (dVar9 != null) {
            dVar9.f177324g = (int) a3;
        }
        C78899d dVar10 = this.f177240c.f177249f;
        if (dVar10 != null) {
            dVar10.f177329l = "avmusic model type error";
        }
        C78899d dVar11 = this.f177240c.f177249f;
        if (dVar11 != null) {
            dVar11.f177328k = 7;
        }
        AbstractC78852b bVar3 = this.f177240c.f177252i;
        if (bVar3 != null) {
            bVar3.mo122694a();
        }
    }
}
