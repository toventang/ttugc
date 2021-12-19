package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.ShareStateResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55728f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a */
public final class C55807a {

    /* renamed from: a */
    public static final C55807a f127238a = new C55807a();

    /* renamed from: b */
    private static long f127239b = -1;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$a */
    public final /* synthetic */ class C55808a implements AbstractC88434g {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f127240a;

        static {
            Covode.recordClassIndex(65594);
        }

        C55808a(AbstractC89172b bVar) {
            this.f127240a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            return this.f127240a.invoke(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$b */
    public final /* synthetic */ class CallableC55809b implements Callable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f127241a;

        static {
            Covode.recordClassIndex(65595);
        }

        CallableC55809b(AbstractC89171a aVar) {
            this.f127241a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f127241a.invoke();
        }
    }

    private C55807a() {
    }

    static {
        Covode.recordClassIndex(65593);
    }

    /* renamed from: b */
    private static boolean m101591b() {
        if (C80580in.m139689d()) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f127239b < 30000) {
            return false;
        }
        f127239b = elapsedRealtime;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$c */
    public static final /* synthetic */ class C55810c extends C89217j implements AbstractC89171a<List<? extends String>> {
        static {
            Covode.recordClassIndex(65596);
        }

        C55810c(C55807a aVar) {
            super(0, aVar, C55807a.class, "getSecUidListForUpdate", "getSecUidListForUpdate()Ljava/util/List;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<C19638h> a = AbstractC17420a.C17421a.m32276a().mo27721a();
            if (a.size() > 30) {
                a = a.subList(0, 30);
            }
            for (T t : a) {
                String b = C55080c.m100731b(t);
                if (b != null) {
                    arrayList2.add(String.valueOf(C55080c.m100729a((C19638h) t)));
                    arrayList.add(b);
                }
            }
            if (arrayList.size() < 30) {
                C55807a.m101590a(arrayList, arrayList2);
            }
            if (arrayList.size() > 30) {
                return arrayList.subList(0, 30);
            }
            return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m101589a() {
        /*
            boolean r0 = m101591b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$c r1 = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$c
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c.C55807a.f127238a
            r1.<init>(r0)
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$b r0 = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$b
            r0.<init>(r1)
            f.a.ab r2 = p4560f.p4561a.AbstractC88403ab.m153604a(r0)
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$d r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c.C55807a.C55811d.f127242a
            if (r1 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$a r0 = new com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$a
            r0.<init>(r1)
            r1 = r0
        L_0x0021:
            f.a.d.g r1 = (p4560f.p4561a.p4567d.AbstractC88434g) r1
            f.a.ab r1 = r2.mo142925c(r1)
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$e r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c.C55807a.C55812e.f127243a
            f.a.ab r1 = r1.mo142914a(r0)
            f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c
            f.a.aa r0 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)
            f.a.ab r1 = r1.mo142918b(r0)
            f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c
            f.a.aa r0 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)
            f.a.ab r2 = r1.mo142909a(r0)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r0)
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$f r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c.C55807a.C55813f.f127244a
            com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$g r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c.C55807a.C55814g.f127245a
            p4560f.p4561a.p4589j.C88939d.m154198a(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c.C55807a.m101589a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$f */
    public static final class C55813f extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        public static final C55813f f127244a = new C55813f();

        static {
            Covode.recordClassIndex(65599);
        }

        C55813f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            C56244a.m102187a("RelationModelFilterHelper", th2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$e */
    public static final class C55812e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C55812e f127243a = new C55812e();

        static {
            Covode.recordClassIndex(65598);
        }

        C55812e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            if (str.length() == 0) {
                AbstractC88403ab a = AbstractC88403ab.m153603a((Throwable) new IllegalStateException("RelationModelFilterHelper: request string is empty"));
                C89219l.m154716b(a, "");
                return a;
            }
            AbstractC88403ab<ShareStateResponse> shareUserCanSendMsg = C55257a.f126351a.getShareUserCanSendMsg(str);
            C89219l.m154716b(shareUserCanSendMsg, "");
            return shareUserCanSendMsg;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$d */
    public static final /* synthetic */ class C55811d extends C89217j implements AbstractC89172b<List<String>, String> {

        /* renamed from: a */
        public static final C55811d f127242a = new C55811d();

        static {
            Covode.recordClassIndex(65597);
        }

        C55811d() {
            super(1, C55728f.class, "builderSecUidString", "builderSecUidString(Ljava/util/List;)Ljava/lang/String;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(List<String> list) {
            List<String> list2 = list;
            if (C13603b.m24435a((Collection) list2)) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (String str : list2) {
                sb.append("\"").append(str).append("\",");
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return "";
            }
            return "[" + sb2.substring(0, sb2.lastIndexOf(",")) + "]";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c.a$g */
    public static final class C55814g extends AbstractC89220m implements AbstractC89172b<ShareStateResponse, C89391z> {

        /* renamed from: a */
        public static final C55814g f127245a = new C55814g();

        static {
            Covode.recordClassIndex(65600);
        }

        C55814g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ShareStateResponse shareStateResponse) {
            ShareStateResponse.C55275a[] aVarArr;
            ShareStateResponse shareStateResponse2 = shareStateResponse;
            if (!(shareStateResponse2 == null || (aVarArr = shareStateResponse2.mShareUserStructs) == null)) {
                ArrayList arrayList = new ArrayList(aVarArr.length);
                for (ShareStateResponse.C55275a aVar : aVarArr) {
                    arrayList.add(aVar.getSecUserId());
                }
                C55273c.m101041a();
                List<IMUser> a = C55273c.m101046a(arrayList, 30, 0);
                if (!a.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (ShareStateResponse.C55275a aVar2 : aVarArr) {
                        C89219l.m154716b(a, "");
                        C89219l.m154716b(aVar2, "");
                        C55807a.m101587a(a, aVar2, sb);
                    }
                    String sb2 = sb.toString();
                    C89219l.m154716b(sb2, "");
                    C56244a.m102185a("RelationModelFilterHelper", sb2);
                    C55273c.m101041a();
                    C55273c.m101055c(a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static List<IMContact> m101588a(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : list) {
            if (t instanceof C74721a) {
                T t2 = t;
                if (!linkedHashSet.contains(t2.getUid())) {
                    String uid = t2.getUid();
                    C89219l.m154716b(uid, "");
                    linkedHashSet.add(uid);
                    arrayList.add(t);
                }
            } else if (t instanceof IMUser) {
                String uid2 = t.getUid();
                C89219l.m154716b(uid2, "");
                linkedHashSet.add(uid2);
                arrayList.add(t);
            } else {
                arrayList.add(t);
            }
        }
        C56244a.m102191c("RelationModelFilterHelper", "filter MaFIMUser, after list size: " + arrayList.size());
        return arrayList;
    }

    /* renamed from: a */
    static void m101590a(List<String> list, List<String> list2) {
        String f = C55273c.m101059f();
        C55273c.m101041a();
        List<IMUser> a = C55273c.m101047a(list2, 30, 0, f);
        C89219l.m154716b(a, "");
        for (T t : a) {
            C89219l.m154716b(t, "");
            if (!list.contains(t.getSecUid())) {
                String secUid = t.getSecUid();
                C89219l.m154716b(secUid, "");
                list.add(secUid);
            }
        }
    }

    /* renamed from: a */
    static AbstractC88412b m101587a(List<? extends IMUser> list, ShareStateResponse.C55275a aVar, StringBuilder sb) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (aVar.getSecUserId().equals(t.getSecUid())) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            return null;
        }
        t2.setShareStatus(aVar.getShareStatus());
        sb.append(t2.getUid() + " shareStatus:" + t2.getShareStatus() + "  ");
        return C55085g.m100752a((IMUser) t2);
    }
}
