package com.p2082ss.android.ugc.aweme.find.viewmodel;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel */
public final class FindFriendsViewModel extends JediViewModel<FindFriendsState> {

    /* renamed from: a */
    public final C51037c f117698a = new C51037c();

    /* renamed from: b */
    public NewRecommendList f117699b = new NewRecommendList();

    /* renamed from: c */
    public String f117700c = "";

    /* renamed from: d */
    private String f117701d = "";

    static {
        Covode.recordClassIndex(60206);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ FindFriendsState mo23027d() {
        return new FindFriendsState(null, null, false, 0, null, null, false, null, 255, null);
    }

    /* renamed from: a */
    public final void mo86371a() {
        ArrayList arrayList = new ArrayList();
        List<Integer> b = m95420b();
        if (!C56318b.m102313d() || (!C89219l.m154714a((Object) this.f117700c, (Object) "notification_page"))) {
            arrayList.add(0);
        }
        arrayList.add(1);
        arrayList.add(2);
        mo33689c(new C51031e(arrayList, b));
    }

    /* renamed from: b */
    private final List<Integer> m95420b() {
        List<Integer> c = C89070n.m154524c(0);
        if (!C79519c.C79520a.f178475a.mo86984c()) {
            c.add(1);
        }
        C79519c.C79521b bVar = C79519c.C79521b.f178476a;
        User b = C80580in.m139683b();
        C89219l.m154716b(b, "");
        String a = bVar.mo86987a(b.getUid());
        if (!C79519c.C79521b.f178476a.mo86993b()) {
            c.add(2);
        } else {
            this.f117701d = a;
        }
        return c;
    }

    /* renamed from: a */
    public final void mo86372a(int i) {
        mo33687b_(new C51027d(this, i));
    }

    /* renamed from: b */
    public final void mo86374b(int i) {
        mo33689c(new C51033g(i));
    }

    /* renamed from: c */
    public final void mo86375c(int i) {
        mo33689c(new C51032f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$a */
    public static final class C51023a extends AbstractC89220m implements AbstractC89172b<FindFriendsState, FindFriendsState> {

        /* renamed from: a */
        final /* synthetic */ boolean f117702a;

        static {
            Covode.recordClassIndex(60207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51023a(boolean z) {
            super(1);
            this.f117702a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            return FindFriendsState.copy$default(findFriendsState2, null, null, false, 0, null, null, this.f117702a, null, 191, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$e */
    static final class C51031e extends AbstractC89220m implements AbstractC89172b<FindFriendsState, FindFriendsState> {

        /* renamed from: a */
        final /* synthetic */ List f117713a;

        /* renamed from: b */
        final /* synthetic */ List f117714b;

        static {
            Covode.recordClassIndex(60215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51031e(List list, List list2) {
            super(1);
            this.f117713a = list;
            this.f117714b = list2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            return FindFriendsState.copy$default(findFriendsState2, null, null, false, 0, this.f117713a, this.f117714b, false, null, 207, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$f */
    static final class C51032f extends AbstractC89220m implements AbstractC89172b<FindFriendsState, FindFriendsState> {

        /* renamed from: a */
        final /* synthetic */ int f117715a;

        static {
            Covode.recordClassIndex(60216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51032f(int i) {
            super(1);
            this.f117715a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            return FindFriendsState.copy$default(findFriendsState2, null, null, false, 0, null, null, false, new C51041f(this.f117715a), 127, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$g */
    public static final class C51033g extends AbstractC89220m implements AbstractC89172b<FindFriendsState, FindFriendsState> {

        /* renamed from: a */
        final /* synthetic */ int f117716a;

        static {
            Covode.recordClassIndex(60217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51033g(int i) {
            super(1);
            this.f117716a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            return FindFriendsState.copy$default(findFriendsState2, new C51039e(this.f117716a), null, false, 0, null, null, false, null, 254, null);
        }
    }

    /* renamed from: a */
    public final void mo86373a(boolean z) {
        mo33689c(new C51023a(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$b */
    public static final class C51024b extends AbstractC89220m implements AbstractC89172b<FindFriendsState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsViewModel f117703a;

        /* renamed from: b */
        final /* synthetic */ int f117704b;

        static {
            Covode.recordClassIndex(60208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51024b(FindFriendsViewModel findFriendsViewModel, int i) {
            super(1);
            this.f117703a = findFriendsViewModel;
            this.f117704b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            final List g = C89070n.m154585g((Collection) findFriendsState2.getList());
            int size = g.size();
            int i = this.f117704b;
            if (size > i) {
                g.remove(i);
                int i2 = 0;
                int i3 = -1;
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                loop0:
                while (true) {
                    boolean z = false;
                    for (Object obj : g) {
                        int i7 = i2 + 1;
                        if (i2 < 0) {
                            C89070n.m154520a();
                        }
                        C51034a aVar = (C51034a) obj;
                        if (aVar.f117718b == 0) {
                            i3 = i2;
                            i2 = i7;
                        } else if (aVar.f117718b == 1) {
                            i4 = i2;
                            i2 = i7;
                            z = true;
                        } else {
                            if (z) {
                                i6++;
                            } else {
                                i5++;
                            }
                            i2 = i7;
                        }
                    }
                    break loop0;
                }
                if (i5 == 0 && i3 >= 0) {
                    g.remove(i3);
                }
                if (i6 == 0 && i4 >= 0) {
                    g.remove(i4);
                }
                this.f117703a.mo33689c(new AbstractC89172b<FindFriendsState, FindFriendsState>() {
                    /* class com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel.C51024b.C510251 */

                    static {
                        Covode.recordClassIndex(60209);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
                        FindFriendsState findFriendsState2 = findFriendsState;
                        C89219l.m154721d(findFriendsState2, "");
                        return FindFriendsState.copy$default(findFriendsState2, new C51039e(100), g, false, 0, null, null, false, null, 252, null);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$c */
    public static final class C51026c extends AbstractC89220m implements AbstractC89172b<FindFriendsState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f117706a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f117707b;

        static {
            Covode.recordClassIndex(60210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51026c(String str, C89233z.C89238e eVar) {
            super(1);
            this.f117706a = str;
            this.f117707b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
            boolean z;
            String str;
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            Iterator<T> it = findFriendsState2.getList().iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    T next = it.next();
                    if (next.f117718b == 0) {
                        z = true;
                    } else if (next.f117718b != 1) {
                        User user = next.f117717a;
                        if (user != null) {
                            str = user.getUid();
                        } else {
                            str = null;
                        }
                        TextUtils.equals(str, this.f117706a);
                    }
                }
            }
            if (z) {
                this.f117707b.element = "new_suggest";
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$d */
    static final class C51027d extends AbstractC89220m implements AbstractC89172b<FindFriendsState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsViewModel f117708a;

        /* renamed from: b */
        final /* synthetic */ int f117709b;

        static {
            Covode.recordClassIndex(60211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51027d(FindFriendsViewModel findFriendsViewModel, int i) {
            super(1);
            this.f117708a = findFriendsViewModel;
            this.f117709b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
            int cursor;
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            if (this.f117709b == 0) {
                cursor = 0;
            } else {
                cursor = findFriendsState2.getCursor();
            }
            C51037c cVar = this.f117708a.f117698a;
            C61504e eVar = C61504e.C61505a.f139616a;
            C89219l.m154716b(eVar, "");
            String a = eVar.mo99159a();
            C89219l.m154716b(a, "");
            C51038d dVar = new C51038d(cursor, a);
            C89219l.m154721d(dVar, "");
            AbstractC88979t b = cVar.f117726b.mo33487c(dVar).mo143278b(C88925a.m154180b(C88946a.f201991c));
            C89219l.m154716b(b, "");
            b.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new AbstractC88986z<FindFriendsState>(this) {
                /* class com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel.C51027d.C510281 */

                /* renamed from: a */
                final /* synthetic */ C51027d f117710a;

                static {
                    Covode.recordClassIndex(60212);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onSubscribe(AbstractC88412b bVar) {
                    C89219l.m154721d(bVar, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f117710a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                    C89219l.m154721d(th, "");
                    this.f117710a.f117708a.mo33689c(new C51029a(this));
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(FindFriendsState findFriendsState) {
                    FindFriendsState findFriendsState2 = findFriendsState;
                    C89219l.m154721d(findFriendsState2, "");
                    this.f117710a.f117708a.mo33689c(new C51030b(findFriendsState2));
                }

                /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$d$1$a */
                static final class C51029a extends AbstractC89220m implements AbstractC89172b<FindFriendsState, FindFriendsState> {

                    /* renamed from: a */
                    final /* synthetic */ C510281 f117711a;

                    static {
                        Covode.recordClassIndex(60213);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C51029a(C510281 r2) {
                        super(1);
                        this.f117711a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
                        FindFriendsState findFriendsState2 = findFriendsState;
                        C89219l.m154721d(findFriendsState2, "");
                        if (this.f117711a.f117710a.f117709b == 0) {
                            return FindFriendsState.copy$default(findFriendsState2, new C51039e(3), null, false, 0, null, null, false, null, 254, null);
                        }
                        return FindFriendsState.copy$default(findFriendsState2, new C51039e(4), null, false, 0, null, null, false, null, 254, null);
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel$d$1$b */
                static final class C51030b extends AbstractC89220m implements AbstractC89172b<FindFriendsState, FindFriendsState> {

                    /* renamed from: a */
                    final /* synthetic */ FindFriendsState f117712a;

                    static {
                        Covode.recordClassIndex(60214);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C51030b(FindFriendsState findFriendsState) {
                        super(1);
                        this.f117712a = findFriendsState;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ FindFriendsState invoke(FindFriendsState findFriendsState) {
                        FindFriendsState findFriendsState2 = findFriendsState;
                        C89219l.m154721d(findFriendsState2, "");
                        return FindFriendsState.copy$default(findFriendsState2, this.f117712a.getResType(), this.f117712a.getList(), this.f117712a.getHasMore(), this.f117712a.getCursor(), null, null, false, null, 240, null);
                    }
                }
            });
            return C89391z.f203057a;
        }
    }
}
