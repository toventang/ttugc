package com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78825d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b */
public final class C78748b {

    /* renamed from: h */
    public static final C78748b f176963h = C78750b.f176972a;

    /* renamed from: i */
    public static final C78749a f176964i = new C78749a((byte) 0);

    /* renamed from: a */
    public AbstractC63154aa.AbstractC63166k f176965a;

    /* renamed from: b */
    public AbstractC63154aa.AbstractC63165j f176966b;

    /* renamed from: c */
    public List<MusicModel> f176967c;

    /* renamed from: d */
    public boolean f176968d;

    /* renamed from: e */
    public boolean f176969e;

    /* renamed from: f */
    public int f176970f;

    /* renamed from: g */
    public boolean f176971g;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$a */
    public static final class C78749a {
        static {
            Covode.recordClassIndex(91892);
        }

        private C78749a() {
        }

        public /* synthetic */ C78749a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$b */
    static final class C78750b {

        /* renamed from: a */
        static final C78748b f176972a = new C78748b((byte) 0);

        /* renamed from: b */
        public static final C78750b f176973b = new C78750b();

        private C78750b() {
        }

        static {
            Covode.recordClassIndex(91893);
        }
    }

    private C78748b() {
        this.f176967c = new ArrayList();
    }

    static {
        Covode.recordClassIndex(91891);
    }

    /* renamed from: a */
    public static CollectedMusicList m137478a() {
        String string = C78756c.f176988b.f176990a.getString("collect_music_list", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        try {
            return (CollectedMusicList) C78825d.f177140a.mo46670a(string, CollectedMusicList.class);
        } catch (Exception unused) {
            SharedPreferences.Editor edit = C78756c.f176988b.f176990a.edit();
            edit.remove("collect_music_list");
            edit.commit();
            return null;
        }
    }

    public /* synthetic */ C78748b(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo122592a(List<MusicModel> list) {
        C89219l.m154721d(list, "");
        this.f176967c = list;
    }

    /* renamed from: b */
    public final void mo122593b(int i) {
        if (!this.f176968d) {
            mo122591a(i);
            return;
        }
        AbstractC63154aa.AbstractC63166k kVar = this.f176965a;
        if (kVar != null) {
            kVar.mo101616b();
        }
    }

    /* renamed from: c */
    public final void mo122594c(int i) {
        this.f176969e = true;
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C78755f(this, i, null), 3);
    }

    /* renamed from: a */
    public static void m137479a(CollectedMusicList collectedMusicList) {
        C78756c cVar = C78756c.f176988b;
        String b = C78825d.f177140a.mo46674b(collectedMusicList);
        C89219l.m154716b(b, "");
        C89219l.m154721d(b, "");
        SharedPreferences.Editor edit = cVar.f176990a.edit();
        edit.putString("collect_music_list", b);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$c */
    public static final class C78751c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ boolean f176974a;

        /* renamed from: b */
        final /* synthetic */ AbstractC63154aa.AbstractC63165j f176975b;

        static {
            Covode.recordClassIndex(91894);
        }

        C78751c(boolean z, AbstractC63154aa.AbstractC63165j jVar) {
            this.f176974a = z;
            this.f176975b = jVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            boolean z;
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c() || !iVar.mo5535a()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f176974a) {
                AbstractC63154aa.AbstractC63165j jVar = C78748b.f176963h.f176966b;
                if (jVar != null) {
                    jVar.mo101612a(z);
                }
            } else {
                AbstractC63154aa.AbstractC63165j jVar2 = this.f176975b;
                if (jVar2 != null) {
                    jVar2.mo101613b(z);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$d */
    public static final class C78752d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f176976a;

        /* renamed from: b */
        final /* synthetic */ C78748b f176977b;

        /* renamed from: c */
        final /* synthetic */ int f176978c;

        static {
            Covode.recordClassIndex(91895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78752d(C78748b bVar, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176977b = bVar;
            this.f176978c = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78752d(this.f176977b, this.f176978c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78752d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f176976a == 0) {
                C89382r.m154942a(obj);
                C1731i<CollectedMusicList> a = MusicService.m81198m().mo69288a(0, this.f176978c);
                if (a != null) {
                    a.mo5532a(new AbstractC1729g(this) {
                        /* class com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a.C78748b.C78752d.C787531 */

                        /* renamed from: a */
                        final /* synthetic */ C78752d f176979a;

                        static {
                            Covode.recordClassIndex(91896);
                        }

                        {
                            this.f176979a = r1;
                        }

                        @Override // p077b.AbstractC1729g
                        public final /* synthetic */ Object then(C1731i iVar) {
                            List<Music> list;
                            C89219l.m154716b(iVar, "");
                            if (iVar.mo5544c() || !iVar.mo5535a()) {
                                CollectedMusicList a = C78748b.m137478a();
                                if (!(a == null || (list = a.items) == null)) {
                                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(it.next().convertToMusicModel());
                                    }
                                    ArrayList arrayList2 = arrayList;
                                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                                        this.f176979a.f176977b.mo122592a(C89070n.m154585g((Collection) arrayList2));
                                        AbstractC63154aa.AbstractC63166k kVar = this.f176979a.f176977b.f176965a;
                                        if (kVar == null) {
                                            return null;
                                        }
                                        kVar.mo101615a(this.f176979a.f176977b.f176967c, false);
                                        return C89391z.f203057a;
                                    }
                                }
                                AbstractC63154aa.AbstractC63166k kVar2 = this.f176979a.f176977b.f176965a;
                                if (kVar2 == null) {
                                    return null;
                                }
                                kVar2.mo101617c();
                                return C89391z.f203057a;
                            } else if (iVar.mo5545d() != null) {
                                C78748b bVar = this.f176979a.f176977b;
                                Object d = iVar.mo5545d();
                                C89219l.m154716b(d, "");
                                bVar.f176970f = ((CollectedMusicList) d).cursor;
                                C78748b bVar2 = this.f176979a.f176977b;
                                Object d2 = iVar.mo5545d();
                                C89219l.m154716b(d2, "");
                                bVar2.f176971g = ((CollectedMusicList) d2).isHasMore();
                                Object d3 = iVar.mo5545d();
                                C89219l.m154716b(d3, "");
                                if (((CollectedMusicList) d3).items != null) {
                                    Object d4 = iVar.mo5545d();
                                    C89219l.m154716b(d4, "");
                                    if (((CollectedMusicList) d4).items.size() > 0) {
                                        Object d5 = iVar.mo5545d();
                                        C89219l.m154716b(d5, "");
                                        C78748b.m137479a((CollectedMusicList) d5);
                                        C78748b bVar3 = this.f176979a.f176977b;
                                        Object d6 = iVar.mo5545d();
                                        C89219l.m154716b(d6, "");
                                        List<Music> list2 = ((CollectedMusicList) d6).items;
                                        C89219l.m154716b(list2, "");
                                        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                                        Iterator<T> it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(it2.next().convertToMusicModel());
                                        }
                                        bVar3.mo122592a(C89070n.m154585g((Collection) arrayList3));
                                        AbstractC63154aa.AbstractC63166k kVar3 = this.f176979a.f176977b.f176965a;
                                        if (kVar3 == null) {
                                            return null;
                                        }
                                        kVar3.mo101615a(this.f176979a.f176977b.f176967c, this.f176979a.f176977b.f176971g);
                                        return C89391z.f203057a;
                                    }
                                }
                                this.f176979a.f176977b.f176967c.clear();
                                AbstractC63154aa.AbstractC63166k kVar4 = this.f176979a.f176977b.f176965a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                kVar4.mo101614a();
                                return C89391z.f203057a;
                            } else {
                                this.f176979a.f176977b.f176967c.clear();
                                AbstractC63154aa.AbstractC63166k kVar5 = this.f176979a.f176977b.f176965a;
                                if (kVar5 == null) {
                                    return null;
                                }
                                kVar5.mo101614a();
                                return C89391z.f203057a;
                            }
                        }
                    });
                }
                this.f176977b.f176968d = false;
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$e */
    public static final class C78754e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f176980a;

        /* renamed from: b */
        final /* synthetic */ C78748b f176981b;

        /* renamed from: c */
        final /* synthetic */ int f176982c;

        /* renamed from: d */
        final /* synthetic */ int f176983d = 12;

        /* renamed from: e */
        final /* synthetic */ int f176984e;

        static {
            Covode.recordClassIndex(91897);
        }

        C78754e(AbstractC89124d dVar, C78748b bVar, int i, int i2) {
            this.f176980a = dVar;
            this.f176981b = bVar;
            this.f176982c = i;
            this.f176984e = i2;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c() || !iVar.mo5535a()) {
                if (this.f176981b.f176968d) {
                    CollectedMusicList a = C78748b.m137478a();
                    if (a != null) {
                        a.setHasMore(false);
                    }
                    this.f176980a.resumeWith(C89379q.m157068constructorimpl(a));
                } else {
                    this.f176980a.resumeWith(C89379q.m157068constructorimpl(null));
                }
            } else if (iVar.mo5545d() != null) {
                this.f176980a.resumeWith(C89379q.m157068constructorimpl(iVar.mo5545d()));
                if (this.f176982c == 0) {
                    Object d = iVar.mo5545d();
                    C89219l.m154716b(d, "");
                    C78748b.m137479a((CollectedMusicList) d);
                }
            } else {
                this.f176980a.resumeWith(C89379q.m157068constructorimpl(null));
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.b$f */
    public static final class C78755f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f176985a;

        /* renamed from: b */
        final /* synthetic */ C78748b f176986b;

        /* renamed from: c */
        final /* synthetic */ int f176987c;

        static {
            Covode.recordClassIndex(91898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78755f(C78748b bVar, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f176986b = bVar;
            this.f176987c = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C78755f(this.f176986b, this.f176987c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C78755f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f176985a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C78748b bVar = this.f176986b;
                int i2 = bVar.f176970f;
                int i3 = this.f176987c;
                this.f176985a = 1;
                C89134h hVar = new C89134h(C89099b.m154605a(this));
                C1731i<CollectedMusicList> a = MusicService.m81198m().mo69288a(i2, i3);
                if (a != null) {
                    a.mo5532a(new C78754e(hVar, bVar, i2, i3));
                }
                obj = hVar.mo143576a();
                if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                    C89219l.m154721d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
            if (collectedMusicList != null) {
                this.f176986b.f176970f = collectedMusicList.cursor;
                this.f176986b.f176971g = collectedMusicList.isHasMore();
                if (collectedMusicList.items != null && collectedMusicList.items.size() > 0) {
                    List<Music> list = collectedMusicList.items;
                    C89219l.m154716b(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().convertToMusicModel());
                    }
                    this.f176986b.f176967c.addAll(arrayList);
                }
                AbstractC63154aa.AbstractC63166k kVar = this.f176986b.f176965a;
                if (kVar != null) {
                    kVar.mo101615a(this.f176986b.f176967c, this.f176986b.f176971g);
                }
            } else {
                AbstractC63154aa.AbstractC63166k kVar2 = this.f176986b.f176965a;
                if (kVar2 != null) {
                    kVar2.mo101615a(this.f176986b.f176967c, false);
                }
            }
            this.f176986b.f176969e = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo122591a(int i) {
        this.f176968d = true;
        this.f176970f = 0;
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C78752d(this, i, null), 3);
    }

    /* renamed from: a */
    public static void m137480a(String str, boolean z, AbstractC63154aa.AbstractC63165j jVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jVar, "");
        f176963h.f176966b = jVar;
        MusicService.m81198m().mo69290a(str, z ? 1 : 0).mo5534a(new C78751c(z, jVar), C1731i.f5564c, null);
    }
}
