package com.p2082ss.android.ugc.aweme.p2690cr.p2702e;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2695b.EnumC40332b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.C40347a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.AbstractC40350b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40348a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.p2082ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.cr.e.m */
public final class C40375m extends AbstractC40358a {

    /* renamed from: b */
    public static final Set<String> f94557b = new LinkedHashSet();

    /* renamed from: c */
    public static final C40375m f94558c = new C40375m();

    /* renamed from: d */
    private static final int f94559d = 86400000;

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: f */
    public final String mo69499f() {
        return "story";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: g */
    public final String mo69500g() {
        return "story";
    }

    private C40375m() {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: h */
    public final EnumC40332b mo69501h() {
        return EnumC40332b.CACHE;
    }

    static {
        Covode.recordClassIndex(48176);
        C63244g.m114602a();
    }

    /* renamed from: l */
    public final void mo69506l() {
        if (SystemClock.uptimeMillis() - ((long) C63253l.f143623a.mo73323s().mo93850a("key_last_clean_story_cache_time", -1)) > ((long) f94559d)) {
            mo69503j();
        }
    }

    @Override // com.bytedance.p1733u.AbstractC23430a
    /* renamed from: c */
    public final File mo38200c() {
        return C63244g.m114602a().mo73279g().mo69470c().mo69481g(C63244g.m114602a().mo73279g().mo69470c().mo69480f(""));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: j */
    public final boolean mo69503j() {
        IStoryDraftService a = StoryDraftServiceImpl.m134289a();
        List<C43223c> queryDraftList = a.queryDraftList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryDraftList.iterator();
        while (it.hasNext()) {
            String draftDirPath = a.getDraftDirPath(it.next());
            if (draftDirPath != null) {
                arrayList.add(draftDirPath);
            }
        }
        Set l = C89070n.m154592l(arrayList);
        C63253l.f143623a.mo73323s().mo93854b("key_last_clean_story_cache_time", (int) SystemClock.uptimeMillis());
        C40376a aVar = new C40376a(l);
        C40347a aVar2 = new C40347a();
        aVar2.mo69491a(aVar);
        aVar2.mo69492a(mo38200c());
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2702e.AbstractC40358a
    /* renamed from: k */
    public final long mo69504k() {
        C40348a aVar = new C40348a(null, null, 3);
        if (mo38200c().exists()) {
            C40347a aVar2 = new C40347a();
            aVar2.mo69491a(aVar);
            aVar2.mo69492a(mo38200c());
        }
        long j = aVar.f94521a;
        List<C43223c> queryDraftList = StoryDraftServiceImpl.m134289a().queryDraftList();
        long j2 = 0;
        C40340a aVar3 = new C40340a();
        Iterator<T> it = queryDraftList.iterator();
        while (it.hasNext()) {
            aVar3.mo69486a(it.next());
            j2 += aVar3.mo69485a();
        }
        return j - j2;
    }

    /* renamed from: com.ss.android.ugc.aweme.cr.e.m$a */
    public static final class C40376a implements AbstractC40350b {

        /* renamed from: a */
        final /* synthetic */ Set f94560a;

        static {
            Covode.recordClassIndex(48177);
        }

        C40376a(Set set) {
            this.f94560a = set;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.AbstractC40350b
        /* renamed from: a */
        public final void mo69494a(File file, boolean z) {
            C89219l.m154721d(file, "");
            if (!z && file.isDirectory() && !C40375m.m81630a(file, this.f94560a) && !C40375m.m81630a(file, C40375m.f94557b)) {
                C84902i.m145886a(file);
            }
        }
    }

    /* renamed from: a */
    public static boolean m81630a(File file, Set<String> set) {
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                String absolutePath = file.getAbsolutePath();
                C89219l.m154716b(absolutePath, "");
                if (C89361p.m154874b(absolutePath, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
