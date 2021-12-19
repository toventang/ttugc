package com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51770a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.C51795h;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.InviteContactVM */
public final class InviteContactVM extends ContactVM implements AbstractC51499g {

    /* renamed from: k */
    public static final C51798a f119372k = new C51798a((byte) 0);

    /* renamed from: c */
    public final C1213t<List<AbstractC51770a>> f119373c;

    /* renamed from: d */
    public final LiveData<List<AbstractC51770a>> f119374d;

    /* renamed from: e */
    public final C1213t<InboxAdapterWidget.EnumC56518b> f119375e;

    /* renamed from: f */
    public final LiveData<InboxAdapterWidget.EnumC56518b> f119376f;

    /* renamed from: g */
    public final C33943c<Boolean> f119377g;

    /* renamed from: h */
    public final LiveData<Boolean> f119378h;

    /* renamed from: i */
    public AtomicBoolean f119379i = new AtomicBoolean(false);

    /* renamed from: j */
    final AbstractC89244h f119380j = C89250i.m154773a((AbstractC89171a) C51800c.f119384a);

    /* renamed from: l */
    private final String f119381l;

    static {
        Covode.recordClassIndex(61164);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.InviteContactVM$a */
    public static final class C51798a {
        static {
            Covode.recordClassIndex(61165);
        }

        private C51798a() {
        }

        public /* synthetic */ C51798a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.ContactVM
    /* renamed from: a */
    public final String mo87522a() {
        return this.f119381l;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.InviteContactVM$c */
    static final class C51800c extends AbstractC89220m implements AbstractC89171a<C51795h> {

        /* renamed from: a */
        public static final C51800c f119384a = new C51800c();

        static {
            Covode.recordClassIndex(61167);
        }

        C51800c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51795h invoke() {
            return new C51795h(R.string.cla);
        }
    }

    /* renamed from: c */
    private static boolean m96483c() {
        return C51648a.f118980a.mo87322d().mo86984c();
    }

    /* renamed from: b */
    public final AbstractC89568bz mo87525b() {
        return C89624i.m155555a(this.f119363b, null, null, new C51799b(this, null), 3);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.ContactVM
    public final void onCleared() {
        super.onCleared();
        C51648a.f118980a.mo87315b(this);
    }

    public InviteContactVM() {
        C1213t<List<AbstractC51770a>> tVar = new C1213t<>();
        this.f119373c = tVar;
        this.f119374d = tVar;
        C1213t<InboxAdapterWidget.EnumC56518b> tVar2 = new C1213t<>();
        this.f119375e = tVar2;
        this.f119376f = tVar2;
        C33943c<Boolean> cVar = new C33943c<>();
        this.f119377g = cVar;
        this.f119378h = cVar;
        C51648a.f118980a.mo87307a(this);
        this.f119381l = "direct";
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.ContactVM
    /* renamed from: a */
    public final int mo87521a(AbstractC51770a aVar) {
        C89219l.m154721d(aVar, "");
        List<AbstractC51770a> value = this.f119373c.getValue();
        if (value != null) {
            return value.indexOf(aVar);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.InviteContactVM$b */
    public static final class C51799b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f119382a;

        /* renamed from: b */
        final /* synthetic */ InviteContactVM f119383b;

        static {
            Covode.recordClassIndex(61166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51799b(InviteContactVM inviteContactVM, AbstractC89124d dVar) {
            super(2, dVar);
            this.f119383b = inviteContactVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C51799b(this.f119383b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C51799b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i = this.f119382a;
            if (i == 0) {
                C89382r.m154942a(obj);
                List<AbstractC51770a> value = this.f119383b.f119373c.getValue();
                if (value == null || value.isEmpty()) {
                    this.f119383b.f119375e.postValue(InboxAdapterWidget.EnumC56518b.EMPTY);
                }
                return C89391z.f203057a;
            } else if (i == 1) {
                C89382r.m154942a(obj);
                return C89391z.f203057a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51499g
    /* renamed from: a */
    public final void mo86981a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar != EnumC66622f.CONTACT) {
            return;
        }
        if (!this.f119379i.get() && m96483c()) {
            mo87525b();
        } else if (this.f119379i.get() && !m96483c()) {
            this.f119373c.postValue(C89086z.INSTANCE);
            this.f119375e.postValue(InboxAdapterWidget.EnumC56518b.EMPTY);
        }
    }
}
