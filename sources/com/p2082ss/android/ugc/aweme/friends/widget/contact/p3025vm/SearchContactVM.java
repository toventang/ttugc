package com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51770a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89546bf;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM */
public final class SearchContactVM extends ContactVM {

    /* renamed from: h */
    public static final C51801a f119385h = new C51801a((byte) 0);

    /* renamed from: c */
    public final C1213t<EnumC51807b> f119386c;

    /* renamed from: d */
    public final C1213t<C89378p<EnumC51806a, List<AbstractC51770a>>> f119387d;

    /* renamed from: e */
    public final LiveData<EnumC51807b> f119388e;

    /* renamed from: f */
    public final LiveData<C89378p<EnumC51806a, List<AbstractC51770a>>> f119389f;

    /* renamed from: g */
    public List<? extends AbstractC51770a> f119390g = C89086z.INSTANCE;

    /* renamed from: i */
    private final String f119391i = "search";

    static {
        Covode.recordClassIndex(61168);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM$a */
    public static final class C51801a {
        static {
            Covode.recordClassIndex(61169);
        }

        private C51801a() {
        }

        public /* synthetic */ C51801a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.ContactVM
    /* renamed from: a */
    public final String mo87522a() {
        return this.f119391i;
    }

    /* renamed from: b */
    public final void mo87527b() {
        this.f119386c.setValue(EnumC51807b.ON_HIDE);
    }

    /* renamed from: c */
    public final void mo87528c() {
        this.f119386c.setValue(EnumC51807b.ON_SEARCH_END);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM$c */
    public static final class RunnableC51804c implements Runnable {

        /* renamed from: a */
        public static final RunnableC51804c f119397a = new RunnableC51804c();

        static {
            Covode.recordClassIndex(61172);
        }

        RunnableC51804c() {
        }

        public final void run() {
            C39162r.m79460a("click_search_contacts", C89041ag.m154427b(C89387v.m154943a("enter_from", "notification_page")));
        }
    }

    public SearchContactVM() {
        C1213t<EnumC51807b> tVar = new C1213t<>();
        this.f119386c = tVar;
        C1213t<C89378p<EnumC51806a, List<AbstractC51770a>>> tVar2 = new C1213t<>();
        this.f119387d = tVar2;
        this.f119388e = tVar;
        this.f119389f = tVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM$d */
    public static final class RunnableC51805d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f119398a;

        static {
            Covode.recordClassIndex(61173);
        }

        RunnableC51805d(int i) {
            this.f119398a = i;
        }

        public final void run() {
            C39162r.m79460a("search_contacts_result_show", C89041ag.m154427b(C89387v.m154943a("enter_from", "notification_page"), C89387v.m154943a("result_cnt", String.valueOf(this.f119398a))));
        }
    }

    /* renamed from: a */
    public static void m96488a(int i) {
        C39162r.m79452a().execute(new RunnableC51805d(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.ContactVM
    /* renamed from: a */
    public final int mo87521a(AbstractC51770a aVar) {
        List<AbstractC51770a> second;
        C89219l.m154721d(aVar, "");
        C89378p<EnumC51806a, List<AbstractC51770a>> value = this.f119387d.getValue();
        if (value == null || (second = value.getSecond()) == null) {
            return -1;
        }
        return second.indexOf(aVar) + 1;
    }

    /* renamed from: a */
    public final void mo87526a(List<? extends AbstractC51770a> list) {
        C89219l.m154721d(list, "");
        this.f119390g = new ArrayList(list);
        this.f119386c.setValue(EnumC51807b.ON_SHOW);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM$b */
    public static final class C51802b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f119392a;

        /* renamed from: b */
        final /* synthetic */ SearchContactVM f119393b;

        /* renamed from: c */
        final /* synthetic */ String f119394c;

        static {
            Covode.recordClassIndex(61170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51802b(SearchContactVM searchContactVM, String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f119393b = searchContactVM;
            this.f119394c = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C51802b(this.f119393b, this.f119394c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C51802b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f119392a;
            if (i == 0) {
                C89382r.m154942a(obj);
                if (this.f119394c.length() == 0) {
                    this.f119393b.f119387d.postValue(C89387v.m154943a(EnumC51806a.NORMAL, C89086z.INSTANCE));
                    return C89391z.f203057a;
                }
                AbstractC89507ah ahVar = C89546bf.f203266a;
                C518031 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.SearchContactVM.C51802b.C518031 */

                    /* renamed from: a */
                    int f119395a;

                    /* renamed from: b */
                    final /* synthetic */ C51802b f119396b;

                    static {
                        Covode.recordClassIndex(61171);
                    }

                    {
                        this.f119396b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 
                    }
