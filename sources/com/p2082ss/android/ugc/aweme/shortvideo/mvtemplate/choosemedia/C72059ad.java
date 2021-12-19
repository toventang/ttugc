package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ad */
public final class C72059ad {

    /* renamed from: a */
    public final List<MvImageChooseAdapter.MyMediaModel> f161513a;

    /* renamed from: b */
    public final boolean f161514b;

    static {
        Covode.recordClassIndex(84724);
    }

    public final String toString() {
        return "MediaRefreshData(mediaModelList=" + this.f161513a + ", allRefresh=" + this.f161514b + ")";
    }

    public /* synthetic */ C72059ad() {
        this(new ArrayList(), true);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f161513a.hashCode() * 31;
        if (this.f161514b) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRefreshData");
        C72059ad adVar = (C72059ad) obj;
        if (this.f161514b != adVar.f161514b || this.f161513a.size() != adVar.f161513a.size()) {
            return false;
        }
        Iterator<T> it = this.f161513a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (adVar.f161513a.get(i) != it.next()) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public C72059ad(List<? extends MvImageChooseAdapter.MyMediaModel> list, boolean z) {
        C89219l.m154721d(list, "");
        this.f161513a = list;
        this.f161514b = z;
    }
}
