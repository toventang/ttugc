package com.bytedance.android.livesdk.p604qa;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.p012a.p013a.p014a.C0175a;
import androidx.p053i.AbstractC1012d;
import androidx.p053i.AbstractC1017e;
import androidx.p053i.AbstractC1036i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.ae */
public final class C10179ae extends AbstractC1017e<Long, C10188af> implements AbstractC1012d.AbstractC1014b {

    /* renamed from: b */
    public final C88411a f24659b;

    /* renamed from: c */
    public C1213t<C3884b> f24660c;

    /* renamed from: d */
    public C1213t<C3884b> f24661d;

    /* renamed from: e */
    public C1213t<Boolean> f24662e;

    /* renamed from: f */
    public C1213t<Boolean> f24663f;

    /* renamed from: g */
    public Runnable f24664g;

    /* renamed from: h */
    public boolean f24665h;

    /* renamed from: i */
    public boolean f24666i;

    /* renamed from: j */
    public long f24667j = 2;

    /* renamed from: k */
    public long f24668k = 2;

    /* renamed from: l */
    public List<C10188af> f24669l = new ArrayList();

    /* renamed from: m */
    public List<C10188af> f24670m = new ArrayList();

    /* renamed from: n */
    public List<C10188af> f24671n = new ArrayList();

    /* renamed from: o */
    public C10188af f24672o;

    /* renamed from: p */
    public boolean f24673p;

    /* renamed from: q */
    public boolean f24674q;

    /* renamed from: r */
    public boolean f24675r;

    /* renamed from: s */
    private final C88960c<Object> f24676s;

    /* renamed from: t */
    private Room f24677t;

    /* renamed from: u */
    private boolean f24678u;

    static {
        Covode.recordClassIndex(11745);
    }

    @Override // androidx.p053i.AbstractC1017e
    /* renamed from: b */
    public final void mo3729b(AbstractC1017e.C1023f<Long> fVar, AbstractC1017e.AbstractC1018a<C10188af> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.ae$e */
    public static final class RunnableC10187e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10179ae f24691a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1017e.C1022e f24692b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1017e.AbstractC1020c f24693c;

        static {
            Covode.recordClassIndex(11753);
        }

        RunnableC10187e(C10179ae aeVar, AbstractC1017e.C1022e eVar, AbstractC1017e.AbstractC1020c cVar) {
            this.f24691a = aeVar;
            this.f24692b = eVar;
            this.f24693c = cVar;
        }

        public final void run() {
            this.f24691a.mo3726a(this.f24692b, this.f24693c);
        }
    }

    @Override // androidx.p053i.AbstractC1012d.AbstractC1014b
    /* renamed from: a */
    public final void mo3721a() {
        this.f24659b.mo142944a();
        this.f24669l.clear();
    }

    /* renamed from: a */
    public final void mo17013a(Room room) {
        C89219l.m154721d(room, "");
        this.f24677t = room;
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ae$b */
    static final class C10184b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10179ae f24684a;

        static {
            Covode.recordClassIndex(11750);
        }

        C10184b(C10179ae aeVar) {
            this.f24684a = aeVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f24684a.f24660c.postValue(C3884b.f10740d);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.p053i.AbstractC1017e
    /* renamed from: b */
    public final /* synthetic */ Long mo3728b(C10188af afVar) {
        C10188af afVar2 = afVar;
        C89219l.m154721d(afVar2, "");
        return Long.valueOf(afVar2.f24694a.f23549d);
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ae$d */
    static final class C10186d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10179ae f24688a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1017e.C1022e f24689b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1017e.AbstractC1020c f24690c;

        static {
            Covode.recordClassIndex(11752);
        }

        C10186d(C10179ae aeVar, AbstractC1017e.C1022e eVar, AbstractC1017e.AbstractC1020c cVar) {
            this.f24688a = aeVar;
            this.f24689b = eVar;
            this.f24690c = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C10179ae aeVar = this.f24688a;
            C89219l.m154716b(th, "");
            aeVar.mo17014a(th, this.f24689b, this.f24690c);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ae$a */
    static final class C10183a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10179ae f24682a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1017e.AbstractC1018a f24683b;

        static {
            Covode.recordClassIndex(11749);
        }

        C10183a(C10179ae aeVar, AbstractC1017e.AbstractC1018a aVar) {
            this.f24682a = aeVar;
            this.f24683b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            if (dVar.statusCode == 0 && dVar.data != null) {
                ArrayList arrayList = new ArrayList();
                if (this.f24682a.f24674q) {
                    if (!C13603b.m24435a((Collection) ((C10191ai) dVar.data).f24699a.f24697a)) {
                        arrayList.addAll(((C10191ai) dVar.data).f24699a.f24697a);
                        this.f24682a.f24670m.addAll(((C10191ai) dVar.data).f24699a.f24697a);
                        this.f24682a.f24667j++;
                    }
                    this.f24682a.f24674q = ((C10191ai) dVar.data).f24699a.f24698b;
                } else if (this.f24682a.f24675r) {
                    if (!C13603b.m24435a((Collection) ((C10191ai) dVar.data).f24700b.f24697a)) {
                        if (!this.f24682a.f24673p) {
                            arrayList.add(new C10188af(new C9676bi("", 4, new User())));
                            this.f24682a.f24673p = true;
                        }
                        arrayList.addAll(((C10191ai) dVar.data).f24700b.f24697a);
                        this.f24682a.f24671n.addAll(((C10191ai) dVar.data).f24700b.f24697a);
                        this.f24682a.f24668k++;
                    }
                    this.f24682a.f24675r = ((C10191ai) dVar.data).f24700b.f24698b;
                }
                this.f24682a.f24669l.addAll(arrayList);
                this.f24682a.f24660c.postValue(C3884b.f10740d);
                this.f24683b.mo3730a(arrayList);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.ae$c */
    static final class C10185c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10179ae f24685a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1017e.AbstractC1020c f24686b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1017e.C1022e f24687c;

        static {
            Covode.recordClassIndex(11751);
        }

        C10185c(C10179ae aeVar, AbstractC1017e.AbstractC1020c cVar, AbstractC1017e.C1022e eVar) {
            this.f24685a = aeVar;
            this.f24686b = cVar;
            this.f24687c = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C10190ah ahVar;
            ArrayList<C10188af> arrayList;
            C10191ai aiVar;
            C10190ah ahVar2;
            ArrayList<C10188af> arrayList2;
            C5832d dVar = (C5832d) obj;
            if (dVar.statusCode != 0 || dVar.data == null) {
                this.f24685a.mo17014a(new Exception(), this.f24687c, this.f24686b);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            if (((C10191ai) dVar.data).f24701c.f24694a.f23550e != null) {
                this.f24685a.f24672o = ((C10191ai) dVar.data).f24701c;
            }
            if (this.f24685a.f24665h || this.f24685a.f24666i) {
                arrayList3.add(new C10188af(new C9676bi("", 3, new User())));
            }
            if (!(C13603b.m24435a((Collection) ((C10191ai) dVar.data).f24699a.f24697a) || (aiVar = (C10191ai) dVar.data) == null || (ahVar2 = aiVar.f24699a) == null || (arrayList2 = ahVar2.f24697a) == null)) {
                arrayList3.addAll(arrayList2);
                this.f24685a.f24670m.clear();
                this.f24685a.f24670m.addAll(arrayList2);
            }
            if (!C13603b.m24435a((Collection) ((C10191ai) dVar.data).f24700b.f24697a)) {
                arrayList3.add(new C10188af(new C9676bi("", 4, new User())));
                this.f24685a.f24673p = true;
                this.f24685a.f24668k++;
                C10191ai aiVar2 = (C10191ai) dVar.data;
                if (!(aiVar2 == null || (ahVar = aiVar2.f24700b) == null || (arrayList = ahVar.f24697a) == null)) {
                    arrayList3.addAll(arrayList);
                    this.f24685a.f24671n.clear();
                    this.f24685a.f24671n.addAll(arrayList);
                }
            }
            this.f24685a.f24675r = ((C10191ai) dVar.data).f24700b.f24698b;
            this.f24685a.f24674q = ((C10191ai) dVar.data).f24699a.f24698b;
            C1213t<Boolean> tVar = this.f24685a.f24663f;
            if (this.f24685a.f24675r || this.f24685a.f24674q) {
                z = true;
            } else {
                z = false;
            }
            tVar.postValue(Boolean.valueOf(z));
            if (((this.f24685a.f24665h || this.f24685a.f24666i) && arrayList3.size() == 1) || (!this.f24685a.f24665h && arrayList3.size() == 0)) {
                this.f24685a.f24669l.clear();
                this.f24685a.f24662e.postValue(true);
                this.f24686b.mo3730a(new ArrayList());
            } else {
                this.f24685a.f24662e.postValue(false);
                this.f24685a.f24669l.clear();
                this.f24685a.f24669l.addAll(arrayList3);
                this.f24686b.mo3731a(arrayList3, arrayList3.size());
            }
            this.f24685a.f24661d.postValue(C3884b.f10740d);
            this.f24685a.f24660c.postValue(C3884b.f10740d);
        }
    }

    /* renamed from: a */
    public final AbstractC1036i<C10188af> mo17012a(AbstractC1036i.C1042d dVar, boolean z) {
        C89219l.m154721d(dVar, "");
        this.f24678u = z;
        AbstractC1036i.C1040b bVar = new AbstractC1036i.C1040b(this, dVar);
        bVar.f3654b = C0175a.f467c;
        bVar.f3653a = C0175a.f466b;
        AbstractC1036i<C10188af> a = bVar.mo3755a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // androidx.p053i.AbstractC1017e
    /* renamed from: a */
    public final void mo3726a(AbstractC1017e.C1022e<Long> eVar, AbstractC1017e.AbstractC1020c<C10188af> cVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        if (this.f24678u) {
            if (C13603b.m24435a((Collection) this.f24669l)) {
                this.f24662e.postValue(true);
            } else {
                this.f24662e.postValue(false);
            }
            cVar.mo3730a(this.f24669l);
            this.f24678u = false;
            return;
        }
        this.f24661d.postValue(C3884b.f10739c);
        this.f24660c.postValue(C3884b.f10739c);
        this.f24663f.postValue(true);
        this.f24664g = null;
        QAApi qAApi = (QAApi) C5805e.m12718a().mo11572a(QAApi.class);
        Room room = this.f24677t;
        if (room == null) {
            C89219l.m154710a("room");
        }
        qAApi.queryQuestion(room.getId(), 1, 1, 2).mo143271a(new C11191f()).mo143254a(new C10185c(this, cVar, eVar), new C10186d(this, eVar, cVar));
    }

    @Override // androidx.p053i.AbstractC1017e
    /* renamed from: a */
    public final void mo3727a(AbstractC1017e.C1023f<Long> fVar, AbstractC1017e.AbstractC1018a<C10188af> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        if (this.f24674q || this.f24675r) {
            this.f24660c.postValue(C3884b.f10739c);
            QAApi qAApi = (QAApi) C5805e.m12718a().mo11572a(QAApi.class);
            Room room = this.f24677t;
            if (room == null) {
                C89219l.m154710a("room");
            }
            qAApi.queryQuestion(room.getId(), this.f24667j, this.f24668k, 2).mo143271a(new C11191f()).mo143254a(new C10183a(this, aVar), new C10184b(this));
        }
    }

    /* renamed from: a */
    public final void mo17014a(Throwable th, AbstractC1017e.C1022e<Long> eVar, AbstractC1017e.AbstractC1020c<C10188af> cVar) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        this.f24664g = new RunnableC10187e(this, eVar, cVar);
        this.f24661d.postValue(C3884b.m9500a(th));
        this.f24660c.postValue(C3884b.m9500a(th));
    }

    public C10179ae(LiveData<Boolean> liveData, LiveData<C3884b> liveData2, LiveData<Boolean> liveData3, LiveData<C3884b> liveData4, C88960c<Object> cVar) {
        C89219l.m154721d(liveData, "");
        C89219l.m154721d(liveData2, "");
        C89219l.m154721d(liveData3, "");
        C89219l.m154721d(liveData4, "");
        C89219l.m154721d(cVar, "");
        C88411a aVar = new C88411a();
        this.f24659b = aVar;
        C1213t<C3884b> tVar = (C1213t) liveData4;
        this.f24660c = tVar;
        C1213t<C3884b> tVar2 = (C1213t) liveData2;
        this.f24661d = tVar2;
        C1213t<Boolean> tVar3 = (C1213t) liveData3;
        this.f24662e = tVar3;
        C1213t<Boolean> tVar4 = (C1213t) liveData;
        this.f24663f = tVar4;
        this.f24663f = tVar4;
        this.f24661d = tVar2;
        this.f24662e = tVar3;
        this.f24660c = tVar;
        this.f24676s = cVar;
        AbstractC88412b a = cVar.mo143254a(new AbstractC88433f(this) {
            /* class com.bytedance.android.livesdk.p604qa.C10179ae.C101801 */

            /* renamed from: a */
            final /* synthetic */ C10179ae f24679a;

            static {
                Covode.recordClassIndex(11746);
            }

            {
                this.f24679a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final void accept(Object obj) {
                Runnable runnable = this.f24679a.f24664g;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, C101812.f24680a);
        if (a != null) {
            aVar.mo142945a(a);
        }
        mo3717a((AbstractC1012d.AbstractC1014b) new AbstractC1012d.AbstractC1014b(this) {
            /* class com.bytedance.android.livesdk.p604qa.C10179ae.C101823 */

            /* renamed from: a */
            final /* synthetic */ C10179ae f24681a;

            static {
                Covode.recordClassIndex(11748);
            }

            {
                this.f24681a = r1;
            }

            @Override // androidx.p053i.AbstractC1012d.AbstractC1014b
            /* renamed from: a */
            public final void mo3721a() {
                this.f24681a.mo3721a();
            }
        });
    }
}
