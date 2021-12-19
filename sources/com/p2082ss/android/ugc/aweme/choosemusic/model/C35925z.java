package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.C33935b;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.z */
public final /* synthetic */ class C35925z implements AbstractC1729g {

    /* renamed from: a */
    private final C35920u f84791a;

    /* renamed from: b */
    private final WeakReference f84792b;

    /* renamed from: c */
    private final long f84793c;

    static {
        Covode.recordClassIndex(43165);
    }

    public C35925z(C35920u uVar, WeakReference weakReference, long j) {
        this.f84791a = uVar;
        this.f84792b = weakReference;
        this.f84793c = j;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35920u uVar = this.f84791a;
        WeakReference weakReference = this.f84792b;
        long j = this.f84793c;
        uVar.f84777c = false;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        C35936b.m73311a(System.currentTimeMillis() - j);
        if (iVar.mo5544c()) {
            uVar.f84775a.mo60191a("local_music_list_load_more_status", (Object) 1);
            C51423a.m95784a(2, "Local Sound", "Load Local Sound Task Failed");
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            C51423a.m95784a(2, "Local Sound", "Load Local Sound Task Succeed");
            uVar.f84775a.mo60191a("local_music_list_load_more_status", (Object) 0);
            List list = (List) ((C33935b) uVar.f84775a.mo60192a("local_music_list_data")).mo60174a("list_data");
            list.addAll((Collection) iVar.mo5545d());
            C33935b bVar = new C33935b();
            bVar.mo60173a("list_data", list).mo60173a("list_hasmore", Boolean.valueOf(true ^ uVar.f84776b)).mo60173a("action_type", 2);
            uVar.f84775a.mo60191a("local_music_list_data", bVar);
            return null;
        }
    }
}
