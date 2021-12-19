package com.p2082ss.android.ugc.aweme.video.local;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.local.b */
public final class C80758b {

    /* renamed from: e */
    public static final C80759a f180571e = new C80759a((byte) 0);

    /* renamed from: a */
    public final HashMap<String, C80770e> f180572a = new HashMap<>();

    /* renamed from: b */
    public final List<String> f180573b = new ArrayList();

    /* renamed from: c */
    public long f180574c;

    /* renamed from: d */
    public final List<C80770e> f180575d = new ArrayList();

    static {
        Covode.recordClassIndex(94049);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$a */
    public static final class C80759a {
        static {
            Covode.recordClassIndex(94050);
        }

        private C80759a() {
        }

        public /* synthetic */ C80759a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$b */
    static final class C80760b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C80760b f180576a = new C80760b();

        static {
            Covode.recordClassIndex(94051);
        }

        C80760b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.local.b$h */
    public static final class CallableC80766h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f180588a;

        static {
            Covode.recordClassIndex(94057);
        }

        CallableC80766h(AbstractC89171a aVar) {
            this.f180588a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f180588a.invoke();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.local.b$c */
    public static final class CallableC80761c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f180577a;

        static {
            Covode.recordClassIndex(94052);
        }

        CallableC80761c(String str) {
            this.f180577a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(C80720e.m139931c(this.f180577a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$g */
    static final class C80765g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C80770e f180585a;

        /* renamed from: b */
        final /* synthetic */ C80758b f180586b;

        /* renamed from: c */
        final /* synthetic */ String f180587c;

        static {
            Covode.recordClassIndex(94056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80765g(C80770e eVar, C80758b bVar, String str) {
            super(0);
            this.f180585a = eVar;
            this.f180586b = bVar;
            this.f180587c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f180586b.f180572a.remove(this.f180587c);
            this.f180586b.f180575d.remove(this.f180585a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.local.b$i */
    public static final class C80767i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C80770e f180589a;

        /* renamed from: b */
        final /* synthetic */ C80758b f180590b;

        static {
            Covode.recordClassIndex(94058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80767i(C80770e eVar, C80758b bVar) {
            super(0);
            this.f180589a = eVar;
            this.f180590b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f180590b.f180575d.remove(this.f180589a);
            this.f180590b.f180572a.remove(this.f180589a.getSourceId());
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static int m140077b() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            return iESSettingsProxy.getLocalVideoCacheMaxAge().intValue() * 60 * 1000;
        } catch (C16041a unused) {
            return 259200000;
        }
    }

    /* renamed from: c */
    private static int m140079c() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            return iESSettingsProxy.getLocalVideoCacheMaxLength().intValue() * 1024 * 1024;
        } catch (C16041a unused) {
            return 157286400;
        }
    }

    /* renamed from: a */
    public final void mo123970a() {
        if (m140079c() != 0 && this.f180574c > ((long) m140079c())) {
            mo123973a(this.f180574c - ((long) m140079c()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.local.b$e */
    public static final class C80763e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C80758b f180582a;

        /* renamed from: b */
        final /* synthetic */ C80770e f180583b;

        static {
            Covode.recordClassIndex(94054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80763e(C80758b bVar, C80770e eVar) {
            super(0);
            this.f180582a = bVar;
            this.f180583b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C80758b.m140078b(this.f180583b)) {
                C80758b bVar = this.f180582a;
                String sourceId = this.f180583b.getSourceId();
                C89219l.m154716b(sourceId, "");
                bVar.mo123968a(sourceId, this.f180583b.f180595a, C80760b.f180576a);
            } else {
                if (!TextUtils.isEmpty(this.f180583b.f180595a) && !TextUtils.isEmpty(this.f180583b.getSourceId())) {
                    File file = new File(this.f180583b.f180595a);
                    if (file.exists()) {
                        HashMap<String, C80770e> hashMap = this.f180582a.f180572a;
                        String sourceId2 = this.f180583b.getSourceId();
                        C89219l.m154716b(sourceId2, "");
                        hashMap.put(sourceId2, this.f180583b);
                        this.f180582a.f180575d.add(this.f180583b);
                        this.f180582a.f180574c += file.length();
                        C73991bj.m130128a("LocalVideoCache=>add cache,fileSize:" + file.length() + ",totalSize:" + this.f180582a.f180574c + ",filePath:" + file.getPath());
                    }
                }
                this.f180582a.mo123970a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final C80770e mo123969a(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f180572a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.local.b$d */
    public static final class C80762d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C80758b f180578a;

        /* renamed from: b */
        final /* synthetic */ String f180579b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f180580c;

        /* renamed from: d */
        final /* synthetic */ String f180581d;

        static {
            Covode.recordClassIndex(94053);
        }

        C80762d(C80758b bVar, String str, AbstractC89171a aVar, String str2) {
            this.f180578a = bVar;
            this.f180579b = str;
            this.f180580c = aVar;
            this.f180581d = str2;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f180578a.f180573b.remove(this.f180579b);
            this.f180580c.invoke();
            C73991bj.m130128a("LocalVideoCache=>delete video cache,filePath:" + this.f180581d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static boolean m140078b(C80770e eVar) {
        if (eVar == null || SystemClock.elapsedRealtime() - eVar.getCreateTime() > ((long) m140077b()) || TextUtils.isEmpty(eVar.f180595a) || !new File(eVar.f180595a).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C80770e mo123974b(String str) {
        C80770e eVar;
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str) || (eVar = this.f180572a.get(str)) == null) {
            return null;
        }
        C89219l.m154716b(eVar, "");
        String sourceId = eVar.getSourceId();
        C89219l.m154716b(sourceId, "");
        this.f180574c -= mo123968a(sourceId, eVar.f180595a, new C80765g(eVar, this, str));
        return eVar;
    }

    /* renamed from: a */
    public final void mo123971a(C80770e eVar) {
        C89219l.m154721d(eVar, "");
        if (eVar.getSourceId() != null) {
            C80763e eVar2 = new C80763e(this, eVar);
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                eVar2.invoke();
            } else {
                C1731i.m5640b(new CallableC80766h(eVar2), C1731i.f5564c);
            }
        }
    }

    /* renamed from: a */
    public final void mo123972a(Collection<? extends C80770e> collection) {
        C89219l.m154721d(collection, "");
        for (C80770e eVar : C89070n.m154553a((Iterable) collection, (Comparator) C80764f.f180584a)) {
            mo123971a(eVar);
        }
    }

    /* renamed from: a */
    public final boolean mo123973a(long j) {
        long j2;
        ArrayList<C80770e> arrayList = new ArrayList();
        long j3 = 0;
        int i = 0;
        while (j3 < j && i < this.f180575d.size()) {
            int i2 = i + 1;
            C80770e eVar = this.f180575d.get(i);
            File file = new File(eVar.f180595a);
            if (file.exists()) {
                j2 = file.length();
            } else {
                j2 = 0;
            }
            arrayList.add(eVar);
            j3 += j2;
            this.f180574c -= j2;
            i = i2;
        }
        for (C80770e eVar2 : arrayList) {
            String sourceId = eVar2.getSourceId();
            C89219l.m154716b(sourceId, "");
            mo123968a(sourceId, eVar2.f180595a, new C80767i(eVar2, this));
        }
        if (this.f180574c > j) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$f */
    static final class C80764f<T> implements Comparator {

        /* renamed from: a */
        public static final C80764f f180584a = new C80764f();

        static {
            Covode.recordClassIndex(94055);
        }

        C80764f() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            VideoUrlModel videoUrlModel = (VideoUrlModel) obj;
            VideoUrlModel videoUrlModel2 = (VideoUrlModel) obj2;
            C89219l.m154716b(videoUrlModel, "");
            long createTime = videoUrlModel.getCreateTime();
            C89219l.m154716b(videoUrlModel2, "");
            if (createTime == videoUrlModel2.getCreateTime()) {
                return 0;
            }
            if (videoUrlModel.getCreateTime() > videoUrlModel2.getCreateTime()) {
                return 1;
            }
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo123968a(String str, String str2, AbstractC89171a<C89391z> aVar) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !this.f180573b.contains(str)) {
            File file = new File(str2);
            if (file.exists()) {
                long length = file.length();
                this.f180573b.add(str);
                C1731i.m5640b(new CallableC80761c(str2), C40780g.m82241a()).mo5534a(new C80762d(this, str, aVar, str2), C1731i.f5564c, null);
                return length;
            }
        }
        return 0;
    }
}
