package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.e */
public final class C78866e extends AbstractC78851a {

    /* renamed from: d */
    public static final C78867a f177261d = new C78867a((byte) 0);

    static {
        Covode.recordClassIndex(92015);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.e$a */
    public static final class C78867a {
        static {
            Covode.recordClassIndex(92016);
        }

        private C78867a() {
        }

        public /* synthetic */ C78867a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78866e(C78859b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.e$b */
    static final class C78868b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78866e f177262a;

        static {
            Covode.recordClassIndex(92017);
        }

        C78868b(C78866e eVar) {
            this.f177262a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            if (C13603b.m24435a((Collection) list)) {
                long a = this.f177262a.f177239b.mo122711a("fetch hot music", "failed.");
                C78899d dVar = this.f177262a.f177240c.f177249f;
                if (dVar != null) {
                    dVar.f177322e = (int) a;
                }
                C78899d dVar2 = this.f177262a.f177240c.f177249f;
                if (dVar2 != null) {
                    dVar2.f177329l = "hotmusic list null";
                }
                C78899d dVar3 = this.f177262a.f177240c.f177249f;
                if (dVar3 != null) {
                    dVar3.f177328k = 5;
                }
                AbstractC78852b bVar = this.f177262a.f177240c.f177252i;
                if (bVar != null) {
                    bVar.mo122694a();
                    return;
                }
                return;
            }
            long a2 = this.f177262a.f177239b.mo122711a("fetch hot music", "success");
            C78899d dVar4 = this.f177262a.f177240c.f177249f;
            if (dVar4 != null) {
                dVar4.f177322e = (int) a2;
            }
            C78899d dVar5 = this.f177262a.f177240c.f177249f;
            if (dVar5 != null) {
                dVar5.f177323f = list.size();
            }
            AbstractC78856e eVar = this.f177262a.f177238a;
            if (eVar != null) {
                C89219l.m154716b(list, "");
                eVar.mo122701a(list.get(0));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.e$c */
    static final class C78869c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78866e f177263a;

        static {
            Covode.recordClassIndex(92018);
        }

        C78869c(C78866e eVar) {
            this.f177263a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            long a = this.f177263a.f177239b.mo122711a("fetch hot music", "failed.");
            C78899d dVar = this.f177263a.f177240c.f177249f;
            if (dVar != null) {
                dVar.f177322e = (int) a;
            }
            C78899d dVar2 = this.f177263a.f177240c.f177249f;
            if (dVar2 != null) {
                dVar2.f177329l = th.getMessage();
            }
            C78899d dVar3 = this.f177263a.f177240c.f177249f;
            if (dVar3 != null) {
                dVar3.f177328k = 5;
            }
            AbstractC78852b bVar = this.f177263a.f177240c.f177252i;
            if (bVar != null) {
                bVar.mo122694a();
            }
            C40970e.m82485a("Get Hot Music Failed. Reason:" + th.getMessage());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e
    /* renamed from: a */
    public final void mo122701a(Object obj) {
        if (this.f177240c.f177245b != null) {
            AbstractC78856e eVar = this.f177238a;
            if (eVar != null) {
                eVar.mo122701a(this.f177240c.f177245b);
                return;
            }
            return;
        }
        this.f177239b.f177276a = System.currentTimeMillis();
        C78899d dVar = this.f177240c.f177249f;
        if (dVar != null) {
            dVar.f177318a = 3;
        }
        AbstractC63154aa aaVar = (AbstractC63154aa) C63244g.m114602a().mo73291s();
        if (aaVar == null) {
            long a = this.f177239b.mo122711a("fetch hot music", "failed.");
            C78899d dVar2 = this.f177240c.f177249f;
            if (dVar2 != null) {
                dVar2.f177322e = (int) a;
            }
            C78899d dVar3 = this.f177240c.f177249f;
            if (dVar3 != null) {
                dVar3.f177329l = "musicService null";
            }
            C78899d dVar4 = this.f177240c.f177249f;
            if (dVar4 != null) {
                dVar4.f177328k = 5;
            }
            AbstractC78852b bVar = this.f177240c.f177252i;
            if (bVar != null) {
                bVar.mo122694a();
                return;
            }
            return;
        }
        aaVar.mo101552k().mo101556a(5).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C78868b(this), new C78869c(this));
    }
}
