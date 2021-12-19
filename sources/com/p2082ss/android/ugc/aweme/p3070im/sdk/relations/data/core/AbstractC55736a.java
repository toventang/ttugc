package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53651a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55759c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55785i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3225b.C55800d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3225b.C55802e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3227d.C55817b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3227d.C55820c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55731b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a */
public abstract class AbstractC55736a implements AbstractC55764d<IMContact> {

    /* renamed from: a */
    public final String f127126a;

    /* renamed from: b */
    public final C55785i f127127b;

    /* renamed from: c */
    public volatile List<String> f127128c;

    /* renamed from: d */
    public final C55732c f127129d;

    /* renamed from: e */
    private final String f127130e = "BaseRelationModel";

    /* renamed from: f */
    private AbstractC55764d<IMContact> f127131f;

    /* renamed from: g */
    private final AbstractC89244h f127132g = C89250i.m154773a((AbstractC89171a) C55738b.f127138a);

    /* renamed from: h */
    private final C55731b f127133h = C55731b.f127107c;

    /* renamed from: i */
    private final String f127134i;

    /* renamed from: j */
    private final C55759c f127135j;

    /* renamed from: k */
    private final C55759c f127136k;

    static {
        Covode.recordClassIndex(65522);
    }

    /* renamed from: i */
    private final List<IMContact> mo92667i() {
        return (List) this.f127132g.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract AbstractC55765e<IMContact> mo92617c();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C55759c mo92614a() {
        return this.f127135j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C55759c mo92616b() {
        return this.f127136k;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$a */
    static final class C55737a extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC55736a f127137a;

        static {
            Covode.recordClassIndex(65523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55737a(AbstractC55736a aVar) {
            super(0);
            this.f127137a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.f127137a.f127128c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$b */
    static final class C55738b extends AbstractC89220m implements AbstractC89171a<List<IMContact>> {

        /* renamed from: a */
        public static final C55738b f127138a = new C55738b();

        static {
            Covode.recordClassIndex(65524);
        }

        C55738b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<IMContact> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$c */
    static final class C55739c extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC55736a f127139a;

        static {
            Covode.recordClassIndex(65525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55739c(AbstractC55736a aVar) {
            super(0);
            this.f127139a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.f127139a.f127128c;
        }
    }

    /* renamed from: d */
    public final AbstractC55736a mo92618d() {
        this.f127131f = null;
        return this;
    }

    /* renamed from: e */
    public final List<IMContact> mo92619e() {
        return C89070n.m154585g((Collection) mo92667i());
    }

    /* renamed from: f */
    public final boolean mo92620f() {
        return mo92617c().mo92627e();
    }

    /* renamed from: g */
    public C89391z mo92621g() {
        AbstractC55765e<IMContact> c;
        if (!(!mo92617c().bO_()) || (c = mo92617c()) == null) {
            return null;
        }
        c.bM_();
        return C89391z.f203057a;
    }

    /* renamed from: h */
    public final C89391z mo92622h() {
        boolean z;
        AbstractC55765e<IMContact> c;
        if (mo92617c().bO_() || !mo92617c().mo92627e()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (c = mo92617c()) == null) {
            return null;
        }
        c.bN_();
        return C89391z.f203057a;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$i */
    public static final class C55745i extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        public static final C55745i f127145a = new C55745i();

        static {
            Covode.recordClassIndex(65531);
        }

        C55745i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$j */
    public static final class C55746j implements AbstractC55764d<IMContact> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f127146a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f127147b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f127148c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f127149d;

        static {
            Covode.recordClassIndex(65532);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
        /* renamed from: a */
        public final void mo92510a(Throwable th) {
            C89219l.m154721d(th, "");
            this.f127147b.invoke(th);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
        /* renamed from: c */
        public final void mo92517c(Throwable th) {
            C89219l.m154721d(th, "");
            this.f127149d.invoke(th);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
        /* renamed from: b */
        public final void mo92515b(List<IMContact> list, boolean z) {
            C89219l.m154721d(list, "");
            this.f127148c.invoke(list, Boolean.valueOf(z));
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
        /* renamed from: a */
        public final void mo92512a(List<IMContact> list, boolean z) {
            C89219l.m154721d(list, "");
            this.f127146a.invoke(list, Boolean.valueOf(z));
        }

        public C55746j(AbstractC89183m mVar, AbstractC89172b bVar, AbstractC89183m mVar2, AbstractC89172b bVar2) {
            this.f127146a = mVar;
            this.f127147b = bVar;
            this.f127148c = mVar2;
            this.f127149d = bVar2;
        }
    }

    /* renamed from: a */
    public final AbstractC55736a mo92615a(AbstractC55764d<IMContact> dVar) {
        C89219l.m154721d(dVar, "");
        this.f127131f = dVar;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: c */
    public final void mo92517c(Throwable th) {
        C89219l.m154721d(th, "");
        AbstractC55764d<IMContact> dVar = this.f127131f;
        if (dVar != null) {
            dVar.mo92517c(th);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public void mo92510a(Throwable th) {
        C89219l.m154721d(th, "");
        AbstractC55764d<IMContact> dVar = this.f127131f;
        if (dVar != null) {
            dVar.mo92510a(th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$d */
    static final class C55740d extends AbstractC89220m implements AbstractC89172b<C19638h, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C55802e f127140a;

        static {
            Covode.recordClassIndex(65526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55740d(C55802e eVar) {
            super(1);
            this.f127140a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C19638h hVar) {
            C19638h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            C89219l.m154721d(hVar2, "");
            boolean z = false;
            if ((!hVar2.isGroupChat() || (!C55339a.m101148a(hVar2) && C55339a.m101153b(hVar2))) && !C53651a.m98926a(hVar2) && hVar2.getLastMessage() != null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    protected static List<String> m101487a(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IMUser a = C55083f.m100745a((IMContact) it.next());
            if (a != null) {
                String uid = a.getUid();
                C89219l.m154716b(uid, "");
                arrayList.add(uid);
            }
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$e */
    static final class C55741e extends AbstractC89220m implements AbstractC89172b<List<? extends C19638h>, List<? extends C19638h>> {

        /* renamed from: a */
        final /* synthetic */ C55817b f127141a;

        static {
            Covode.recordClassIndex(65527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55741e(C55817b bVar) {
            super(1);
            this.f127141a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<? extends C19638h> invoke(List<? extends C19638h> list) {
            long j;
            int i;
            List<? extends C19638h> list2 = list;
            C89219l.m154721d(list2, "");
            C89219l.m154721d(list2, "");
            C56244a.m102191c("RecentConversationCollator", "sort start");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T t : list2) {
                C19538ai lastMessage = t.getLastMessage();
                if (lastMessage != null) {
                    j = lastMessage.getCreatedAt();
                } else {
                    j = 0;
                }
                if (t.isStickTop()) {
                    j = Math.max(j, t.getUpdatedTime());
                }
                linkedHashMap.put(t, Long.valueOf(j));
                if (t.isStickTop()) {
                    i = 50;
                } else {
                    i = 0;
                }
                linkedHashMap2.put(t, Integer.valueOf(i));
            }
            List a = C89070n.m154553a((Iterable) list2, (Comparator) new C55817b.C55819b(linkedHashMap2, linkedHashMap));
            C56244a.m102191c("RecentConversationCollator", "sort finish");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$f */
    static final class C55742f extends AbstractC89220m implements AbstractC89172b<IMContact, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C55800d f127142a;

        static {
            Covode.recordClassIndex(65528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55742f(C55800d dVar) {
            super(1);
            this.f127142a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            if (r6.isBlock() != false) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            if (r1.contains(r6.getUid()) == true) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
            if (r4.f127222a.f127121l == 3) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
            if (r1 != 2) goto L_0x0045;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke(com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.im.service.model.IMContact r6 = (com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact) r6
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.d r4 = r5.f127142a
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.b r0 = r4.f127227b
                boolean r0 = r0.mo92658a(r6)
                r3 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0045
                boolean r0 = r6 instanceof com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser
                if (r0 == 0) goto L_0x004a
                com.ss.android.ugc.aweme.im.service.model.IMUser r6 = (com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser) r6
                int r1 = r6.getFollowStatus()
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f127222a
                boolean r0 = r0.f127122m
                if (r0 == 0) goto L_0x0029
                r0 = 2
                if (r1 != r0) goto L_0x0045
            L_0x0029:
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f127222a
                boolean r0 = r0.f127113d
                if (r0 == 0) goto L_0x0035
                boolean r0 = r6.isBlock()
                if (r0 != 0) goto L_0x0045
            L_0x0035:
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f127222a
                java.util.List<java.lang.String> r1 = r0.f127117h
                if (r1 == 0) goto L_0x005b
                java.lang.String r0 = r6.getUid()
                boolean r0 = r1.contains(r0)
                if (r0 != r2) goto L_0x005b
            L_0x0045:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L_0x004a:
                boolean r0 = r6 instanceof com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation
                if (r0 == 0) goto L_0x0045
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f127222a
                boolean r0 = r0.f127122m
                if (r0 == 0) goto L_0x005b
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r4.f127222a
                int r1 = r0.f127121l
                r0 = 3
                if (r1 != r0) goto L_0x0045
            L_0x005b:
                r3 = 1
                goto L_0x0045
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a.C55742f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public AbstractC55736a(C55732c cVar) {
        C89219l.m154721d(cVar, "");
        this.f127129d = cVar;
        String d = C55273c.m101056d();
        this.f127134i = d;
        String e = C55273c.m101058e();
        C89219l.m154716b(e, "");
        this.f127126a = e;
        C55785i.C55786a aVar = new C55785i.C55786a();
        C89219l.m154721d(cVar, "");
        C55802e eVar = new C55802e(cVar);
        C89219l.m154721d(cVar, "");
        C55817b bVar = new C55817b(cVar);
        C89219l.m154721d(cVar, "");
        C55800d dVar = new C55800d(cVar);
        C89219l.m154721d(cVar, "");
        C55820c cVar2 = new C55820c(cVar);
        C55740d dVar2 = new C55740d(eVar);
        C89219l.m154721d(dVar2, "");
        aVar.mo92638a().f127183h = dVar2;
        aVar.mo92648a(new C55741e(bVar));
        aVar.mo92649b(new C55742f(dVar));
        C55743g gVar = new C55743g(cVar2);
        C89219l.m154721d(gVar, "");
        aVar.mo92638a().f127186k = gVar;
        this.f127127b = aVar.f127209a;
        C55759c.C55760a aVar2 = new C55759c.C55760a();
        C89219l.m154716b(d, "");
        this.f127135j = (C55759c) aVar2.mo92636a(d).mo92637a(false).mo92635a(new C55737a(this)).mo92647a(100).mo92639b();
        this.f127136k = (C55759c) new C55759c.C55760a().mo92636a(e).mo92637a(false).mo92635a(new C55739c(this)).mo92647a(100).mo92639b();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$g */
    static final class C55743g extends AbstractC89220m implements AbstractC89172b<List<? extends IMContact>, List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C55820c f127143a;

        static {
            Covode.recordClassIndex(65529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55743g(C55820c cVar) {
            super(1);
            this.f127143a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<? extends IMContact> invoke(List<? extends IMContact> list) {
            String str;
            List<? extends IMContact> list2 = list;
            C89219l.m154721d(list2, "");
            C89219l.m154721d(list2, "");
            C56244a.m102191c("RecentWithRecTypeCollator", "sort start");
            C55273c.m101041a();
            User d = C55197c.m100922d();
            if (d != null) {
                str = d.getUid();
            } else {
                str = null;
            }
            List<IMUser> d2 = C55273c.m101057d(Collections.singletonList(str));
            C89219l.m154716b(d2, "");
            ArrayList arrayList = new ArrayList();
            for (T t : d2) {
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (!(t2.getFollowStatus() == 0 || t2.getShareStatus() == 2)) {
                    C55219n a = C55219n.m100965a();
                    String uid = t2.getUid();
                    if (!TextUtils.isEmpty(uid)) {
                        if (a.f126297a.getBoolean("key_friend_rec_".concat(String.valueOf(uid)), false)) {
                        }
                    }
                    arrayList.add(t);
                }
            }
            ArrayList<IMUser> arrayList2 = arrayList;
            C56244a.m102191c("RecentWithRecTypeCollator", "query db finish " + arrayList2.size());
            if (arrayList2.isEmpty()) {
                return list2;
            }
            ArrayList arrayList3 = new ArrayList();
            for (IMUser iMUser : arrayList2) {
                C89219l.m154716b(iMUser, "");
                String uid2 = iMUser.getUid();
                C89219l.m154716b(uid2, "");
                arrayList3.add(uid2);
                if (iMUser.getFriendRecTime() > 0) {
                    for (IMContact iMContact : list2) {
                        String uid3 = iMUser.getUid();
                        Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                        IMUser iMUser2 = (IMUser) iMContact;
                        if (C89219l.m154714a((Object) uid3, (Object) iMUser2.getUid()) && iMUser2.getFriendRecTime() > iMUser.getFriendRecTime()) {
                            iMUser.setFriendRecTime(iMUser2.getFriendRecTime());
                            C55273c.m101041a();
                            C55273c.m101055c(Collections.singletonList(iMUser));
                        }
                    }
                } else {
                    iMUser.setFriendRecTime(System.currentTimeMillis());
                    C55273c.m101041a();
                    C55273c.m101055c(Collections.singletonList(iMUser));
                }
            }
            C56244a.m102191c("RecentWithRecTypeCollator", "finish update DB");
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList2);
            ArrayList arrayList5 = new ArrayList();
            for (T t3 : list2) {
                T t4 = t3;
                Objects.requireNonNull(t4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                if (!arrayList3.contains(t4.getUid())) {
                    arrayList5.add(t3);
                }
            }
            arrayList4.addAll(arrayList5);
            List a2 = C89070n.m154553a((Iterable) arrayList4, (Comparator) C55820c.C55822b.f127251a);
            C56244a.m102191c("RecentWithRecTypeCollator", "finish sorting");
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a$h */
    public static final class C55744h extends AbstractC89220m implements AbstractC89183m<List<IMContact>, Boolean, C89391z> {

        /* renamed from: a */
        public static final C55744h f127144a = new C55744h();

        static {
            Covode.recordClassIndex(65530);
        }

        C55744h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(List<IMContact> list, Boolean bool) {
            bool.booleanValue();
            C89219l.m154721d(list, "");
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: b */
    public final void mo92515b(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        mo92667i().addAll(list);
        AbstractC55764d<IMContact> dVar = this.f127131f;
        if (dVar != null) {
            dVar.mo92515b(list, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public void mo92512a(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        C56244a.m102191c(this.f127130e, "onLoadSuccess start: " + list.size());
        try {
            mo92667i().clear();
            mo92667i().addAll(list);
        } catch (Exception e) {
            C56244a.m102188a(e);
        }
        C56244a.m102191c(this.f127130e, "onLoadSuccess finish: " + mo92667i().size());
        AbstractC55764d<IMContact> dVar = this.f127131f;
        if (dVar != null) {
            dVar.mo92512a(list, z);
        }
    }
}
