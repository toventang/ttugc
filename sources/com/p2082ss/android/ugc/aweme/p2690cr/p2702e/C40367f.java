package com.p2082ss.android.ugc.aweme.p2690cr.p2702e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40332b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.C40346b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.C40347a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40348a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40351c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71875b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71885j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.e.f */
public final class C40367f extends AbstractC40358a {

    /* renamed from: b */
    public static final C40368a f94556b = new C40368a((byte) 0);

    static {
        Covode.recordClassIndex(48168);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: f */
    public final String mo69499f() {
        return "av-filter";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: g */
    public final String mo69500g() {
        return "filter";
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.e.f$a */
    public static final class C40368a {
        static {
            Covode.recordClassIndex(48169);
        }

        private C40368a() {
        }

        public /* synthetic */ C40368a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: h */
    public final EnumC40332b mo69501h() {
        return EnumC40332b.RESOURCE;
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public final File mo38200c() {
        AbstractC40389c c = C63244g.m114602a().mo73279g().mo69470c();
        String str = C70638dj.f158113p;
        C89219l.m154716b(str, "");
        return c.mo69481g(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: k */
    public final long mo69504k() {
        Set<String> a = C40346b.m81526a();
        AbstractC40389c c = C63244g.m114602a().mo73279g().mo69470c();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        File a2 = c.mo69474a(filesDir, "filter");
        C40348a aVar = new C40348a(a, null, 2);
        if (a2.exists()) {
            C40347a aVar2 = new C40347a();
            aVar2.mo69491a(aVar);
            aVar2.mo69492a(a2);
        }
        long j = aVar.f94521a + 0;
        AbstractC40389c c2 = C63244g.m114602a().mo73279g().mo69470c();
        String str = C70638dj.f158113p;
        C89219l.m154716b(str, "");
        File g = c2.mo69481g(str);
        C40348a aVar3 = new C40348a(a, null, 2);
        if (g.exists()) {
            C40347a aVar4 = new C40347a();
            aVar4.mo69491a(aVar3);
            aVar4.mo69492a(g);
        }
        return j + aVar3.f94521a + 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: j */
    public final boolean mo69503j() {
        String str;
        AbstractC40389c c = C63244g.m114602a().mo73279g().mo69470c();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        File a = c.mo69474a(filesDir, "filter");
        if (a.exists()) {
            C40351c cVar = new C40351c(C40346b.m81526a(), null, 2);
            cVar.f94525a = true;
            C40347a aVar = new C40347a();
            aVar.mo69491a(cVar);
            aVar.mo69492a(a);
            cVar.mo69495a();
        }
        if (mo38200c().exists()) {
            C40351c cVar2 = new C40351c(C40346b.m81526a(), null, 2);
            cVar2.f94525a = true;
            C40347a aVar2 = new C40347a();
            aVar2.mo69491a(cVar2);
            aVar2.mo69492a(mo38200c());
            cVar2.mo69495a();
        }
        List<C43223c> c2 = C63244g.m114602a().mo73275c().mo101850c();
        ArrayList arrayList = new ArrayList();
        for (T t : c2) {
            T t2 = t;
            if (t2.f100913m >= 0 && ((str = t2.f100900W.f100796ac) == null || str.length() == 0)) {
                arrayList.add(t);
            }
        }
        ArrayList<C43223c> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        for (C43223c cVar3 : arrayList2) {
            cVar3.f100900W.f100796ac = C63244g.m114602a().mo73290r().mo86005c().mo86019a(cVar3.f100913m).getFilterFolder();
            arrayList3.add(C63244g.m114602a().mo73275c().mo101842a(cVar3));
        }
        AbstractC71875b a2 = C71885j.m126949a();
        a2.mo113526b(-1);
        a2.mo113527c(-1);
        C63244g.m114602a().mo73290r().mo86006d().mo86067b();
        C63244g.m114602a().mo73290r().mo86004b().mo86017c();
        C63244g.m114602a().mo73286n().mo120437a();
        return true;
    }
}
