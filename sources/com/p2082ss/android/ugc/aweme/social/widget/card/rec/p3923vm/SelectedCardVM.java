package com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm;

import android.app.Activity;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21732b;
import com.bytedance.provider.impl.C21752c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74722b;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74777c;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.C74826b;
import com.p2082ss.android.ugc.aweme.social.widget.p3918a.C74744a;
import com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89597cs;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.internal.C89652o;
import kotlinx.coroutines.p4637b.C89540b;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SelectedCardVM */
public final class SelectedCardVM extends AbstractC1174ac {

    /* renamed from: a */
    public String f168231a = "";

    /* renamed from: b */
    public String f168232b = "";

    /* renamed from: c */
    public C59256u.EnumC59259c f168233c;

    /* renamed from: d */
    public boolean f168234d;

    /* renamed from: e */
    public final AbstractC89516am f168235e;

    /* renamed from: f */
    final IUserService f168236f;

    /* renamed from: g */
    public final C33943c<List<C74826b>> f168237g;

    /* renamed from: h */
    public final LiveData<List<C74826b>> f168238h;

    /* renamed from: i */
    public final C33943c<Integer> f168239i;

    /* renamed from: j */
    public final LiveData<Integer> f168240j;

    /* renamed from: k */
    public final C33943c<List<IMUser>> f168241k;

    /* renamed from: l */
    public final LiveData<List<IMUser>> f168242l;

    /* renamed from: m */
    public final C33943c<Boolean> f168243m;

    /* renamed from: n */
    public final LiveData<Boolean> f168244n;

    /* renamed from: o */
    public final Set<String> f168245o;

    /* renamed from: p */
    private final AbstractC89703z f168246p;

    static {
        Covode.recordClassIndex(87714);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f168246p.mo143985a((CancellationException) null);
    }

    public SelectedCardVM() {
        AbstractC89703z a = C89599cu.m155531a();
        this.f168246p = a;
        this.f168235e = C89517an.m155448a(C89652o.f203399a.plus(a));
        this.f168236f = UserService.m138861d();
        C33943c<List<C74826b>> cVar = new C33943c<>();
        this.f168237g = cVar;
        this.f168238h = cVar;
        C33943c<Integer> cVar2 = new C33943c<>();
        this.f168239i = cVar2;
        this.f168240j = cVar2;
        C33943c<List<IMUser>> cVar3 = new C33943c<>();
        this.f168241k = cVar3;
        this.f168242l = cVar3;
        C33943c<Boolean> cVar4 = new C33943c<>();
        this.f168243m = cVar4;
        this.f168244n = cVar4;
        this.f168245o = new LinkedHashSet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SelectedCardVM$c */
    public static final class C74858c extends AbstractC89220m implements AbstractC89172b<AbstractC74745a, AbstractC74745a> {

        /* renamed from: a */
        final /* synthetic */ List f168254a;

        static {
            Covode.recordClassIndex(87717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74858c(List list) {
            super(1);
            this.f168254a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC74745a invoke(AbstractC74745a aVar) {
            AbstractC74745a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo117796a(this.f168254a);
            return aVar2;
        }
    }

    /* renamed from: b */
    public static void m131422b(List<? extends User> list) {
        AbstractC21732b a = C21752c.f51535b.mo35380a().mo35381a("source_default_key", AbstractC74745a.class);
        if (a != null) {
            a.mo35379a(new C74858c(list));
        }
    }

    /* renamed from: a */
    public final void mo117906a(List<? extends User> list) {
        for (T t : list) {
            String str = this.f168231a;
            String str2 = this.f168232b;
            C89219l.m154721d(t, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C1731i.m5640b(new C74777c.CallableC74781d(t, str, str2), C1731i.f5562a);
            C74777c.m131288a(t, this.f168231a, this.f168232b, C59256u.EnumC59257a.FOLLOW, this.f168233c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SelectedCardVM$b */
    public static final class C74857b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f168251a;

        /* renamed from: b */
        final /* synthetic */ SelectedCardVM f168252b;

        /* renamed from: c */
        final /* synthetic */ List f168253c;

        static {
            Covode.recordClassIndex(87716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74857b(SelectedCardVM selectedCardVM, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f168252b = selectedCardVM;
            this.f168253c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74857b(this.f168252b, this.f168253c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C74857b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f168251a;
            if (i == 0) {
                C89382r.m154942a(obj);
                SelectedCardVM selectedCardVM = this.f168252b;
                List list = this.f168253c;
                this.f168251a = 1;
                C74856a aVar = new C74856a(selectedCardVM, list, null);
                C89597cs csVar = new C89597cs(getContext(), this);
                Object a = C89540b.m155470a(csVar, csVar, aVar);
                if (a == EnumC89098a.COROUTINE_SUSPENDED) {
                    C89219l.m154721d(this, "");
                }
                if (a != EnumC89098a.COROUTINE_SUSPENDED) {
                    a = C89391z.f203057a;
                }
                if (a == obj2) {
                    return obj2;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo117905a(String str) {
        int i;
        String str2 = this.f168231a;
        List<C74826b> value = this.f168238h.getValue();
        if (value != null) {
            i = value.size();
        } else {
            i = 0;
        }
        Integer value2 = this.f168240j.getValue();
        if (value2 == null) {
            value2 = 0;
        }
        C89219l.m154716b(value2, "");
        int intValue = value2.intValue();
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("send_message_pop_up", C89041ag.m154421a(C89387v.m154943a("enter_from", str2), C89387v.m154943a("action_type", str), C89387v.m154943a("user_show_num", String.valueOf(i)), C89387v.m154943a("user_select_num", String.valueOf(intValue))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SelectedCardVM$a */
    public static final class C74856a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f168247a;

        /* renamed from: b */
        final /* synthetic */ SelectedCardVM f168248b;

        /* renamed from: c */
        final /* synthetic */ List f168249c;

        /* renamed from: d */
        private /* synthetic */ Object f168250d;

        static {
            Covode.recordClassIndex(87715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74856a(SelectedCardVM selectedCardVM, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f168248b = selectedCardVM;
            this.f168249c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C74856a aVar = new C74856a(this.f168248b, this.f168249c, dVar);
            aVar.f168250d = obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C74856a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            if (this.f168247a == 0) {
                C89382r.m154942a(obj);
                if (C89219l.m154714a((Object) this.f168248b.f168243m.getValue(), (Object) true)) {
                    return C89391z.f203057a;
                }
                this.f168248b.f168243m.postValue(true);
                try {
                    List<User> list = this.f168249c;
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (User user : list) {
                        IUserService iUserService = this.f168248b.f168236f;
                        String uid = user.getUid();
                        C89219l.m154716b(uid, "");
                        int a = C74744a.m131225a(user);
                        String secUid = user.getSecUid();
                        C89219l.m154716b(secUid, "");
                        FollowStatus a2 = iUserService.mo123561a(uid, a, secUid);
                        if (a2 == null || ((FollowStatus) a2.checkValid()) == null) {
                            throw new IllegalStateException("follow result is illegal");
                        }
                        user.setFollowStatus(C74744a.m131225a(user));
                        arrayList.add(C74722b.m131181a(user));
                    }
                    this.f168248b.f168241k.postValue(arrayList);
                    SelectedCardVM.m131422b(this.f168249c);
                    obj2 = C89379q.m157068constructorimpl(C89108b.m154610a(0));
                } catch (Throwable th) {
                    obj2 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                Throwable r2 = C89379q.m157071exceptionOrNullimpl(obj2);
                if (r2 != null) {
                    C39109f.m79401a("SelectCard", "follow net work error!", r2);
                    Activity topActivity = ActivityStack.getTopActivity();
                    C89219l.m154716b(topActivity, "");
                    C39143l.m79438a(topActivity, r2);
                    this.f168248b.f168234d = false;
                }
                this.f168248b.f168243m.postValue(false);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
