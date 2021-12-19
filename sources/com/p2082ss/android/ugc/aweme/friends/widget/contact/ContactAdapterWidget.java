package com.p2082ss.android.ugc.aweme.friends.widget.contact;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.C51782f;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3024a.AbstractC51771a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.InviteContactVM;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56364g;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget */
public final class ContactAdapterWidget extends InboxAdapterWidget implements AbstractC33974au {

    /* renamed from: a */
    private final AbstractC89244h f119307a;

    /* renamed from: b */
    private final AbstractC89244h f119308b;

    /* renamed from: c */
    private final AbstractC89244h f119309c = C89250i.m154773a((AbstractC89171a) C51765e.f119318a);

    /* renamed from: i */
    private final AbstractC89244h f119310i;

    /* renamed from: j */
    private final AbstractC89244h f119311j;

    static {
        Covode.recordClassIndex(61124);
    }

    /* renamed from: i */
    private final FrameLayout m96436i() {
        return (FrameLayout) this.f119310i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final int mo87485a(int i) {
        return -1;
    }

    /* renamed from: a */
    public final InviteContactVM mo87486a() {
        return (InviteContactVM) this.f119307a.getValue();
    }

    /* renamed from: b */
    public final C51780d mo87488b() {
        return (C51780d) this.f119308b.getValue();
    }

    /* renamed from: c */
    public final C51782f mo87489c() {
        return (C51782f) this.f119309c.getValue();
    }

    /* renamed from: d */
    public final C51760a.C517611 mo87490d() {
        return (C51760a.C517611) this.f119311j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$a */
    static final class C51760a extends AbstractC89220m implements AbstractC89171a<C517611> {

        /* renamed from: a */
        final /* synthetic */ ContactAdapterWidget f119312a;

        static {
            Covode.recordClassIndex(61125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51760a(ContactAdapterWidget contactAdapterWidget) {
            super(0);
            this.f119312a = contactAdapterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C517611 invoke() {
            return new RecyclerView.AbstractC1371n(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget.C51760a.C517611 */

                /* renamed from: a */
                final /* synthetic */ C51760a f119313a;

                static {
                    Covode.recordClassIndex(61126);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f119313a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                    List<AbstractC51770a> subList;
                    C89219l.m154721d(recyclerView, "");
                    RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        layoutManager = null;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager == null) {
                        return;
                    }
                    if (recyclerView.mo4451f(linearLayoutManager.mo4371k()) instanceof AbstractC51771a) {
                        List<AbstractC51770a> value = this.f119313a.f119312a.mo87486a().f119374d.getValue();
                        if (value != null && (subList = value.subList(1, value.size() - 1)) != null) {
                            this.f119313a.f119312a.mo87489c().mo87504a(subList);
                            return;
                        }
                        return;
                    }
                    this.f119313a.f119312a.mo87489c().mo87503a();
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$e */
    static final class C51765e extends AbstractC89220m implements AbstractC89171a<C51782f> {

        /* renamed from: a */
        public static final C51765e f119318a = new C51765e();

        static {
            Covode.recordClassIndex(61130);
        }

        C51765e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51782f invoke() {
            return C51782f.C51783a.m96476a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: e */
    public final LiveData<Boolean> mo87491e() {
        return mo87486a().f119378h;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: f */
    public final LiveData<InboxAdapterWidget.EnumC56518b> mo87492f() {
        return mo87486a().f119376f;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: g */
    public final RecyclerView.AbstractC1350a<?> mo87493g() {
        return mo87488b();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$b */
    static final class C51762b extends AbstractC89220m implements AbstractC89171a<C51780d> {

        /* renamed from: a */
        final /* synthetic */ ContactAdapterWidget f119314a;

        /* renamed from: b */
        final /* synthetic */ Fragment f119315b;

        static {
            Covode.recordClassIndex(61127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51762b(ContactAdapterWidget contactAdapterWidget, Fragment fragment) {
            super(0);
            this.f119314a = contactAdapterWidget;
            this.f119315b = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51780d invoke() {
            return new C51780d(this.f119315b, this.f119314a.mo87486a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: h */
    public final void mo87494h() {
        C56364g.m102351c();
        mo87486a().mo87525b();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$c */
    static final class C51763c extends AbstractC89220m implements AbstractC89171a<InviteContactVM> {

        /* renamed from: a */
        final /* synthetic */ Fragment f119316a;

        static {
            Covode.recordClassIndex(61128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51763c(Fragment fragment) {
            super(0);
            this.f119316a = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InviteContactVM invoke() {
            Fragment fragment = this.f119316a;
            C89219l.m154721d(fragment, "");
            AbstractC1174ac a = C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(InviteContactVM.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$f */
    static final class C51766f extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ Fragment f119319a;

        static {
            Covode.recordClassIndex(61131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51766f(Fragment fragment) {
            super(0);
            this.f119319a = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            View view = this.f119319a.getView();
            if (view != null) {
                return view.findViewWithTag("INBOX_FRAGMENT_CONTAINER");
            }
            return null;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        C51780d b = mo87488b();
        C51767g gVar = new C51767g(this);
        C89219l.m154721d(gVar, "");
        b.f119335b = gVar;
        C51780d b2 = mo87488b();
        C51768h hVar = new C51768h(this);
        C89219l.m154721d(hVar, "");
        b2.f119336c = hVar;
        mo87488b().f119337d = new C51769i(this);
        mo87486a().f119374d.observe(this, new C51764d(this));
        mo87494h();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        Object obj;
        try {
            if (!mo87489c().isAdded() && this.f128856e.getChildFragmentManager().mo3551a("SearchContact_FM") == null && m96436i() != null) {
                AbstractC0976n a = this.f128856e.getChildFragmentManager().mo3552a();
                FrameLayout i = m96436i();
                if (i == null) {
                    C89219l.m154715b();
                }
                a.mo3454a(i.getId(), mo87489c(), "SearchContact_FM").mo3474c(mo87489c()).mo3479f().mo3473c();
            }
            obj = C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        Throwable r2 = C89379q.m157071exceptionOrNullimpl(obj);
        if (r2 != null) {
            C39109f.m79401a("InviteContact", "add search fragment error!", r2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$d */
    public static final class C51764d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ ContactAdapterWidget f119317a;

        static {
            Covode.recordClassIndex(61129);
        }

        C51764d(ContactAdapterWidget contactAdapterWidget) {
            this.f119317a = contactAdapterWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f119317a.mo87488b().mo5018a((List) obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$g */
    public static final class C51767g extends AbstractC89220m implements AbstractC89172b<RecyclerView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ContactAdapterWidget f119320a;

        static {
            Covode.recordClassIndex(61132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51767g(ContactAdapterWidget contactAdapterWidget) {
            super(1);
            this.f119320a = contactAdapterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RecyclerView recyclerView) {
            RecyclerView recyclerView2 = recyclerView;
            C89219l.m154721d(recyclerView2, "");
            recyclerView2.mo4405a(this.f119320a.mo87490d());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$h */
    public static final class C51768h extends AbstractC89220m implements AbstractC89172b<RecyclerView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ContactAdapterWidget f119321a;

        static {
            Covode.recordClassIndex(61133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51768h(ContactAdapterWidget contactAdapterWidget) {
            super(1);
            this.f119321a = contactAdapterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RecyclerView recyclerView) {
            RecyclerView recyclerView2 = recyclerView;
            C89219l.m154721d(recyclerView2, "");
            recyclerView2.mo4418b(this.f119321a.mo87490d());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget$i */
    public static final class C51769i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ ContactAdapterWidget f119322a;

        static {
            Covode.recordClassIndex(61134);
        }

        C51769i(ContactAdapterWidget contactAdapterWidget) {
            this.f119322a = contactAdapterWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            InviteContactVM a = this.f119322a.mo87486a();
            C89219l.m154716b(bool, "");
            a.f119377g.postValue(Boolean.valueOf(bool.booleanValue()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final void mo87487a(int i, C56520b bVar) {
        C89219l.m154721d(bVar, "");
        super.mo87487a(i, bVar);
        C51780d b = mo87488b();
        C89219l.m154721d(bVar, "");
        b.f119338e.put(i, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactAdapterWidget(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData) {
        super(fragment, liveData);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        this.f119307a = C89250i.m154773a((AbstractC89171a) new C51763c(fragment));
        this.f119308b = C89250i.m154773a((AbstractC89171a) new C51762b(this, fragment));
        this.f119310i = C89250i.m154773a((AbstractC89171a) new C51766f(fragment));
        this.f119311j = C89250i.m154773a((AbstractC89171a) new C51760a(this));
    }
}
