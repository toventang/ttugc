package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34912e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b */
public final class C71351b {

    /* renamed from: e */
    public static final C71352a f159911e = new C71352a((byte) 0);

    /* renamed from: a */
    public boolean f159912a;

    /* renamed from: b */
    public List<User> f159913b = new ArrayList();

    /* renamed from: c */
    public List<User> f159914c = new ArrayList();

    /* renamed from: d */
    public String f159915d = "";

    static {
        Covode.recordClassIndex(83874);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b$a */
    public static final class C71352a {
        static {
            Covode.recordClassIndex(83875);
        }

        private C71352a() {
        }

        public /* synthetic */ C71352a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b$a$a */
        public static final class C71353a {

            /* renamed from: a */
            public final List<User> f159916a;

            /* renamed from: b */
            public final List<User> f159917b;

            /* renamed from: c */
            public final List<User> f159918c;

            /* renamed from: d */
            public final List<String> f159919d;

            /* renamed from: e */
            public final List<Integer> f159920e;

            /* renamed from: f */
            public final List<User> f159921f;

            /* renamed from: g */
            public final List<String> f159922g;

            /* renamed from: h */
            public final List<String> f159923h;

            static {
                Covode.recordClassIndex(83876);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C71353a)) {
                    return false;
                }
                C71353a aVar = (C71353a) obj;
                return C89219l.m154714a(this.f159916a, aVar.f159916a) && C89219l.m154714a(this.f159917b, aVar.f159917b) && C89219l.m154714a(this.f159918c, aVar.f159918c) && C89219l.m154714a(this.f159919d, aVar.f159919d) && C89219l.m154714a(this.f159920e, aVar.f159920e) && C89219l.m154714a(this.f159921f, aVar.f159921f) && C89219l.m154714a(this.f159922g, aVar.f159922g) && C89219l.m154714a(this.f159923h, aVar.f159923h);
            }

            public final int hashCode() {
                List<User> list = this.f159916a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<User> list2 = this.f159917b;
                int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                List<User> list3 = this.f159918c;
                int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
                List<String> list4 = this.f159919d;
                int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
                List<Integer> list5 = this.f159920e;
                int hashCode5 = (hashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31;
                List<User> list6 = this.f159921f;
                int hashCode6 = (hashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31;
                List<String> list7 = this.f159922g;
                int hashCode7 = (hashCode6 + (list7 != null ? list7.hashCode() : 0)) * 31;
                List<String> list8 = this.f159923h;
                if (list8 != null) {
                    i = list8.hashCode();
                }
                return hashCode7 + i;
            }

            public final String toString() {
                return "AllFriends(recentFriends=" + this.f159916a + ", mutualFriends=" + this.f159917b + ", allFollowingFriends=" + this.f159918c + ", indexLabels=" + this.f159919d + ", indexLabelCount=" + this.f159920e + ", filterFriends=" + this.f159921f + ", mentionBlockedUids=" + this.f159922g + ", mobRecentUsers=" + this.f159923h + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
            /* JADX WARN: Multi-variable type inference failed */
            public C71353a(List<? extends User> list, List<? extends User> list2, List<? extends User> list3, List<String> list4, List<Integer> list5, List<? extends User> list6, List<String> list7, List<String> list8) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(list2, "");
                C89219l.m154721d(list3, "");
                C89219l.m154721d(list4, "");
                C89219l.m154721d(list5, "");
                C89219l.m154721d(list6, "");
                C89219l.m154721d(list7, "");
                C89219l.m154721d(list8, "");
                this.f159916a = list;
                this.f159917b = list2;
                this.f159918c = list3;
                this.f159919d = list4;
                this.f159920e = list5;
                this.f159921f = list6;
                this.f159922g = list7;
                this.f159923h = list8;
            }
        }
    }

    /* renamed from: a */
    public final C1731i<C71352a.C71353a> mo112836a() {
        C1731i<C71352a.C71353a> b = C1731i.m5640b(new CallableC71354b(this), C1731i.f5562a);
        C89219l.m154716b(b, "");
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b$c */
    public static final class CallableC71355c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C71351b f159926a;

        /* renamed from: b */
        final /* synthetic */ List f159927b;

        /* renamed from: c */
        final /* synthetic */ String f159928c;

        static {
            Covode.recordClassIndex(83878);
        }

        CallableC71355c(C71351b bVar, List list, String str) {
            this.f159926a = bVar;
            this.f159927b = list;
            this.f159928c = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C71351b bVar = this.f159926a;
            List<User> list = this.f159927b;
            String str = this.f159928c;
            List<User> a = C63253l.f143623a.mo73325u().mo93876a(list, str);
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            for (T t : list) {
                String uniqueId = t.getUniqueId();
                if (uniqueId == null || uniqueId.length() == 0) {
                    String shortId = t.getShortId();
                    C89219l.m154716b(shortId, "");
                    if (C71351b.m126055a(shortId, lowerCase)) {
                        a.add(t);
                    }
                } else {
                    String uniqueId2 = t.getUniqueId();
                    C89219l.m154716b(uniqueId2, "");
                    if (C71351b.m126055a(uniqueId2, lowerCase)) {
                        a.add(t);
                    }
                }
            }
            if (bVar.f159912a) {
                C89219l.m154716b(a, "");
                List<User> b = C71351b.m126056b(a);
                a.clear();
                a.addAll(b);
            }
            C89219l.m154716b(a, "");
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t2 : a) {
                T t3 = t2;
                C89219l.m154716b(t3, "");
                if (hashSet.add(t3.getUid())) {
                    arrayList.add(t2);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b$b */
    public static final class CallableC71354b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C71351b f159924a;

        /* renamed from: b */
        final /* synthetic */ long f159925b = 6;

        static {
            Covode.recordClassIndex(83877);
        }

        CallableC71354b(C71351b bVar) {
            this.f159924a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C71352a.C71353a call() {
            Object obj;
            User user;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            List<C34912e> a = C63253l.f143623a.mo73325u().mo93874a();
            if (a == null) {
                a = C89086z.INSTANCE;
            }
            ArrayList arrayList5 = new ArrayList();
            for (T t : a) {
                if (true ^ C89219l.m154714a((Object) t.f82368a.getUid(), (Object) C63244g.m114602a().mo73255A().mo93904c())) {
                    arrayList5.add(t);
                }
            }
            List<C34912e> g = C89070n.m154585g((Collection) arrayList5);
            try {
                List<C34912e> a2 = C63253l.f143623a.mo73325u().mo93875a(this.f159925b);
                C89219l.m154716b(a2, "");
                for (T t2 : a2) {
                    if (arrayList4.size() < 10) {
                        Iterator it = g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (C89219l.m154714a((Object) ((C34912e) obj).f82368a.getUid(), (Object) t2.f82368a.getUid())) {
                                break;
                            }
                        }
                        C34912e eVar = (C34912e) obj;
                        if (eVar == null || (user = eVar.f82368a) == null) {
                            user = t2.f82368a;
                        }
                        arrayList4.add(user);
                        String uid = t2.f82368a.getUid();
                        C89219l.m154716b(uid, "");
                        arrayList3.add(uid);
                        if (t2.f82369b) {
                            String uid2 = t2.f82368a.getUid();
                            C89219l.m154716b(uid2, "");
                            arrayList.add(uid2);
                        } else {
                            String uid3 = t2.f82368a.getUid();
                            C89219l.m154716b(uid3, "");
                            arrayList2.add(uid3);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (C34912e eVar2 : g) {
                if (!eVar2.f82369b && !arrayList.contains(eVar2.f82368a.getUid())) {
                    String uid4 = eVar2.f82368a.getUid();
                    C89219l.m154716b(uid4, "");
                    arrayList2.add(uid4);
                }
            }
            if (arrayList4.size() < 10) {
                List<C34912e> b = C63253l.f143623a.mo73325u().mo93880b();
                C89219l.m154716b(b, "");
                ArrayList<C34912e> arrayList6 = new ArrayList();
                for (T t3 : b) {
                    T t4 = t3;
                    if (t4.f82368a.getFollowStatus() == 2 || t4.f82368a.getFollowStatus() == 1) {
                        arrayList6.add(t3);
                    }
                }
                for (C34912e eVar3 : arrayList6) {
                    if (arrayList4.size() < 10) {
                        if (!arrayList4.contains(eVar3.f82368a) && (!C89219l.m154714a((Object) eVar3.f82368a.getUid(), (Object) C63244g.m114602a().mo73255A().mo93904c()))) {
                            arrayList4.add(eVar3.f82368a);
                            String uid5 = eVar3.f82368a.getUid();
                            C89219l.m154716b(uid5, "");
                            arrayList3.add(uid5);
                        }
                        if (!eVar3.f82369b && !arrayList.contains(eVar3.f82368a.getUid())) {
                            String uid6 = eVar3.f82368a.getUid();
                            C89219l.m154716b(uid6, "");
                            arrayList2.add(uid6);
                        }
                    }
                }
            }
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            for (C34912e eVar4 : g) {
                if (C63253l.f143623a.mo73325u().mo93879a(eVar4.f82368a.getFollowStatus()) && g.size() >= 10) {
                    arrayList7.add(eVar4.f82368a);
                }
            }
            List arrayList10 = new ArrayList();
            arrayList10.addAll(arrayList4);
            arrayList10.addAll(arrayList7);
            arrayList10.addAll(C71351b.m126054a(g));
            if (this.f159924a.f159912a) {
                arrayList10 = C71351b.m126056b(arrayList10);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            return new C71352a.C71353a(arrayList4, arrayList7, C71351b.m126054a(g), arrayList8, arrayList9, arrayList10, arrayList2, arrayList3);
        }
    }

    /* renamed from: a */
    public static List<User> m126054a(List<C34912e> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f82368a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b$d */
    public static final class C71356d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71351b f159929a;

        static {
            Covode.recordClassIndex(83879);
        }

        C71356d(C71351b bVar) {
            this.f159929a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            List list;
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5544c() && !iVar.mo5539b() && (list = (List) iVar.mo5545d()) != null) {
                this.f159929a.f159914c.clear();
                this.f159929a.f159914c.addAll(list);
            }
            return iVar;
        }
    }

    /* renamed from: b */
    public static List<User> m126056b(List<? extends User> list) {
        if (C13603b.m24435a((Collection) list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            if (!arrayList.contains(user) && !C89219l.m154714a((Object) user.getUid(), (Object) C63244g.m114602a().mo73255A().mo93904c())) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo112838a(String str) {
        C89219l.m154721d(str, "");
        Iterator<T> it = this.f159914c.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) it.next().getUid(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m126055a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Locale locale = Locale.getDefault();
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C1731i<List<User>> mo112837a(String str, List<? extends User> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f159915d = str;
        C1731i<List<User>> b = C1731i.m5640b(new CallableC71355c(this, list, str), C1731i.f5562a).mo5538b(new C71356d(this), C1731i.f5564c);
        C89219l.m154716b(b, "");
        return b;
    }
}
