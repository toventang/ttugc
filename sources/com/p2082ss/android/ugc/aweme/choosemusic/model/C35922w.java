package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.lang.ref.WeakReference;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.w */
public final /* synthetic */ class C35922w implements AbstractC1729g {

    /* renamed from: a */
    private final C35920u f84781a;

    /* renamed from: b */
    private final WeakReference f84782b;

    /* renamed from: c */
    private final long f84783c;

    static {
        Covode.recordClassIndex(43162);
    }

    C35922w(C35920u uVar, WeakReference weakReference, long j) {
        this.f84781a = uVar;
        this.f84782b = weakReference;
        this.f84783c = j;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35920u uVar = this.f84781a;
        WeakReference weakReference = this.f84782b;
        long j = this.f84783c;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        C35936b.m73311a(System.currentTimeMillis() - j);
        if (iVar.mo5544c()) {
            uVar.f84775a.mo60191a("local_music_list_status", (Object) 1);
            C51423a.m95784a(2, "Local Sound", "Load Local Sound Task Failed");
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            C51423a.m95784a(2, "Local Sound", "Load Local Sound Task Succeed");
            uVar.f84775a.mo60191a("local_music_list_status", (Object) 0);
            C33935b bVar = new C33935b();
            bVar.mo60173a("list_data", iVar.mo5545d()).mo60173a("list_hasmore", false).mo60173a("action_type", 1);
            uVar.f84775a.mo60191a("local_music_list_data", bVar);
            return null;
        }
    }
}
