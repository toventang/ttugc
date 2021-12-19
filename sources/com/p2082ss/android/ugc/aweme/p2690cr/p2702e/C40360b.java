package com.p2082ss.android.ugc.aweme.p2690cr.p2702e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.AbstractC43215m;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40332b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.cr.e.b */
public final class C40360b extends AbstractC40358a {
    static {
        Covode.recordClassIndex(48161);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: f */
    public final String mo69499f() {
        return "av-draft";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: g */
    public final String mo69500g() {
        return "draft";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: j */
    public final boolean mo69503j() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: h */
    public final EnumC40332b mo69501h() {
        return EnumC40332b.DRAFT;
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public final File mo38200c() {
        AbstractC40389c c = C63244g.m114602a().mo73279g().mo69470c();
        String str = C70638dj.f158103f;
        C89219l.m154716b(str, "");
        return c.mo69481g(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: k */
    public final long mo69504k() {
        List<String> list;
        ArrayList<C43223c> arrayList = new ArrayList();
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        String e = a.mo110455e();
        C89219l.m154716b(e, "");
        boolean d = C63244g.m114602a().mo73287o().mo104784d();
        if (d) {
            list = C63244g.m114602a().mo73287o().mo104787g();
        } else {
            list = C89086z.INSTANCE;
        }
        List<C43223c> queryListWithFilter = AVServiceImpl.m113116a().draftService().queryListWithFilter(true, new C40361a(d, list, arrayList, e));
        C89219l.m154716b(queryListWithFilter, "");
        long j = 0;
        C40340a aVar = new C40340a();
        for (C43223c cVar : C89070n.m154580f((Iterable) queryListWithFilter)) {
            aVar.mo69486a(cVar);
            j += aVar.mo69485a();
        }
        for (C43223c cVar2 : arrayList) {
            AVServiceImpl.m113116a().draftService().delete(cVar2);
        }
        return j;
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.e.b$a */
    public static final class C40361a implements AbstractC43215m {

        /* renamed from: a */
        final /* synthetic */ boolean f94550a;

        /* renamed from: b */
        final /* synthetic */ List f94551b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f94552c;

        /* renamed from: d */
        final /* synthetic */ String f94553d;

        static {
            Covode.recordClassIndex(48162);
        }

        @Override // com.p2082ss.android.ugc.aweme.draft.AbstractC43215m
        /* renamed from: a */
        public final boolean mo69505a(C43223c cVar) {
            C89219l.m154721d(cVar, "");
            if (this.f94550a) {
                if (cVar.f100900W.f100788aU != null && !C89361p.m154872a(cVar.f100900W.f100788aU.getShoutOutsMode(), C74418d.MODE_POST, false)) {
                    if (!this.f94551b.contains(cVar.mo73726r())) {
                        this.f94552c.add(cVar);
                    }
                    return false;
                } else if (!this.f94551b.contains(cVar.mo73726r())) {
                    return true;
                } else {
                    return false;
                }
            } else if (cVar.f100900W.f100788aU == null || C89361p.m154872a(cVar.f100900W.f100788aU.getShoutOutsMode(), C74418d.MODE_POST, false)) {
                return !C89219l.m154714a((Object) cVar.mo73726r(), (Object) this.f94553d);
            } else {
                if (!C89219l.m154714a((Object) cVar.mo73726r(), (Object) this.f94553d)) {
                    this.f94552c.add(cVar);
                }
                return false;
            }
        }

        C40361a(boolean z, List list, ArrayList arrayList, String str) {
            this.f94550a = z;
            this.f94551b = list;
            this.f94552c = arrayList;
            this.f94553d = str;
        }
    }
}
