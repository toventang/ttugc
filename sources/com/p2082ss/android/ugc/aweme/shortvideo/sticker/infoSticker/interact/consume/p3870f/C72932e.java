package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollDetailApi;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72904d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C72905e;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollDetailResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72925f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.e */
public final class C72932e {

    /* renamed from: a */
    public final PollDetailApi f163652a;

    /* renamed from: b */
    public final C88411a f163653b = new C88411a();

    /* renamed from: c */
    public C72904d f163654c = new C72904d(0, false);

    /* renamed from: d */
    public final AbstractC39102c<User> f163655d;

    /* renamed from: e */
    public AbstractC72925f f163656e;

    /* renamed from: f */
    public int f163657f;

    static {
        Covode.recordClassIndex(85632);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.e$a */
    public static final class C72933a implements AbstractC88986z<PollDetailResponse> {

        /* renamed from: a */
        final /* synthetic */ C72932e f163658a;

        static {
            Covode.recordClassIndex(85633);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C72933a(C72932e eVar) {
            this.f163658a = eVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f163658a.f163655d.mo59522c(new Exception(th));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f163658a.f163653b.mo142945a(bVar);
            this.f163658a.f163655d.aW_();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(PollDetailResponse pollDetailResponse) {
            List<User> list;
            C72905e a;
            ArrayList arrayList;
            ArrayList arrayList2;
            C72905e a2;
            PollDetailResponse pollDetailResponse2 = pollDetailResponse;
            C89219l.m154721d(pollDetailResponse2, "");
            this.f163658a.mo115324a(new C72904d(pollDetailResponse2.getOffset(), pollDetailResponse2.getHasMore()));
            C72932e eVar = this.f163658a;
            List<User> users = pollDetailResponse2.getUsers();
            int i = eVar.f163657f;
            ArrayList arrayList3 = null;
            AbstractC72925f fVar = eVar.f163656e;
            if (i == 0) {
                if (!(fVar == null || (a2 = fVar.mo115318a()) == null)) {
                    list = a2.f163597a;
                }
                list = null;
            } else {
                if (!(fVar == null || (a = fVar.mo115318a()) == null)) {
                    list = a.f163599c;
                }
                list = null;
            }
            if (!C13603b.m24435a((Collection) list) && !C13603b.m24435a((Collection) users)) {
                if (users != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (T t : users) {
                        T t2 = t;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                if (TextUtils.equals(t2.getUid(), next.getUid())) {
                                    if (next != null) {
                                        arrayList4.add(t);
                                    }
                                }
                            }
                        }
                    }
                    arrayList2 = arrayList4;
                    arrayList3 = new ArrayList(users);
                } else {
                    arrayList2 = C89086z.INSTANCE;
                }
                if (!C13603b.m24435a((Collection) arrayList2) && arrayList3 != null) {
                    arrayList3.removeAll(arrayList2);
                }
                users = arrayList3;
            }
            this.f163658a.f163655d.mo59517b(users, pollDetailResponse2.getHasMore());
            C72932e eVar2 = this.f163658a;
            if (users != null) {
                arrayList = new ArrayList(users);
            }
            eVar2.mo115325a(arrayList, this.f163658a.f163654c, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.e$b */
    public static final class C72934b implements AbstractC88986z<PollDetailResponse> {

        /* renamed from: a */
        final /* synthetic */ C72932e f163659a;

        static {
            Covode.recordClassIndex(85634);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72934b(C72932e eVar) {
            this.f163659a = eVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f163659a.f163655d.mo59516b(new Exception(th));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f163659a.f163653b.mo142945a(bVar);
            this.f163659a.f163655d.mo59515b();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(PollDetailResponse pollDetailResponse) {
            ArrayList arrayList;
            PollDetailResponse pollDetailResponse2 = pollDetailResponse;
            C89219l.m154721d(pollDetailResponse2, "");
            this.f163659a.mo115324a(new C72904d(pollDetailResponse2.getOffset(), pollDetailResponse2.getHasMore()));
            if (C13603b.m24435a((Collection) pollDetailResponse2.getUsers())) {
                this.f163659a.f163655d.mo59525f();
                return;
            }
            this.f163659a.f163655d.mo59512a(pollDetailResponse2.getUsers(), pollDetailResponse2.getHasMore());
            C72932e eVar = this.f163659a;
            if (pollDetailResponse2.getUsers() == null) {
                arrayList = new ArrayList();
            } else {
                List<User> users = pollDetailResponse2.getUsers();
                if (users == null) {
                    C89219l.m154715b();
                }
                arrayList = new ArrayList(users);
            }
            eVar.mo115325a(arrayList, this.f163659a.f163654c, false);
        }
    }

    /* renamed from: a */
    public final void mo115324a(C72904d dVar) {
        C89219l.m154721d(dVar, "");
        this.f163654c = dVar;
    }

    /* renamed from: a */
    public final void mo115323a(long j, long j2) {
        this.f163652a.getPollDetail(j, j2, 0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C72934b(this));
    }

    public C72932e(AbstractC39102c<User> cVar, AbstractC72925f fVar, int i) {
        C89219l.m154721d(cVar, "");
        this.f163655d = cVar;
        this.f163656e = fVar;
        this.f163657f = i;
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(PollDetailApi.class);
        C89219l.m154716b(create, "");
        this.f163652a = (PollDetailApi) create;
    }

    /* renamed from: a */
    public final void mo115325a(List<User> list, C72904d dVar, boolean z) {
        C72905e eVar;
        C72905e eVar2;
        if (z) {
            if (!C13603b.m24435a((Collection) list)) {
                AbstractC72925f fVar = this.f163656e;
                if (fVar == null || (eVar2 = fVar.mo115318a()) == null) {
                    eVar2 = new C72905e();
                }
                if (this.f163657f == 0) {
                    if (eVar2.f163597a == null) {
                        eVar2.f163597a = new ArrayList();
                    }
                    List<User> list2 = eVar2.f163597a;
                    if (list2 != null) {
                        list2.addAll(list);
                    }
                    eVar2.mo115287a(dVar);
                } else {
                    if (eVar2.f163599c == null) {
                        eVar2.f163599c = new ArrayList();
                    }
                    List<User> list3 = eVar2.f163599c;
                    if (list3 != null) {
                        list3.addAll(list);
                    }
                    eVar2.mo115288b(dVar);
                }
                AbstractC72925f fVar2 = this.f163656e;
                if (fVar2 != null) {
                    fVar2.mo115319a(eVar2);
                }
            }
        } else if (!C13603b.m24435a((Collection) list)) {
            AbstractC72925f fVar3 = this.f163656e;
            if (fVar3 == null || (eVar = fVar3.mo115318a()) == null) {
                eVar = new C72905e();
            }
            if (this.f163657f == 0) {
                eVar.f163597a = list;
                eVar.mo115287a(dVar);
            } else {
                eVar.f163599c = list;
                eVar.mo115288b(dVar);
            }
            AbstractC72925f fVar4 = this.f163656e;
            if (fVar4 != null) {
                fVar4.mo115319a(eVar);
            }
        }
    }
}
