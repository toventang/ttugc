package com.p2082ss.android.ugc.aweme.ecommerce.address.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.retrofit2.C22099u;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.api.AddressApi;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45539b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4616h.C89245a;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel */
public final class AddressListViewModel extends JediViewModel<AddressListState> implements IEventCenter.AbstractC45375b {

    /* renamed from: a */
    public static final /* synthetic */ AbstractC89286i[] f101537a = {new C89225r(AddressListViewModel.class, "isSelectMode", "isSelectMode()Z", 0)};

    /* renamed from: b */
    public final AbstractC89249e f101538b = C89245a.m154732a();

    /* renamed from: c */
    public HashMap<String, Object> f101539c;

    static {
        Covode.recordClassIndex(51775);
    }

    /* renamed from: b */
    public final void mo74033b() {
        mo33689c(C43536a.f101540a);
    }

    /* renamed from: g */
    private static boolean m86587g() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AddressListState mo23027d() {
        return new AddressListState(0, null, null, null, null, null, 63, null);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        EventCenter.m87158a().mo75481b("ec_address_change", this);
    }

    /* renamed from: a */
    public final void mo74029a() {
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m86587g();
        }
        if (!C58029j.f132253e) {
            mo74030a(2);
            return;
        }
        mo74030a(0);
        AbstractC88412b a = C45539b.m88078a(((AddressApi) AddressApi.C43341a.f101152a.mo28858a(AddressApi.class)).getAddressList(), "shipping_info", new C89378p[0]).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C43539d(this), new C43541e(this));
        C89219l.m154716b(a, "");
        mo33680a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel$e */
    public static final class C43541e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressListViewModel f101545a;

        static {
            Covode.recordClassIndex(51781);
        }

        C43541e(AddressListViewModel addressListViewModel) {
            this.f101545a = addressListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f101545a.mo74030a(3);
        }
    }

    /* renamed from: a */
    public final void mo74030a(int i) {
        mo33689c(new C43543g(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel$a */
    static final class C43536a extends AbstractC89220m implements AbstractC89172b<AddressListState, AddressListState> {

        /* renamed from: a */
        public static final C43536a f101540a = new C43536a();

        static {
            Covode.recordClassIndex(51776);
        }

        C43536a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            C89219l.m154721d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, 0, null, new C43548b(), null, null, null, 59, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel$b */
    static final class C43537b extends AbstractC89220m implements AbstractC89172b<AddressListState, AddressListState> {

        /* renamed from: a */
        final /* synthetic */ Address f101541a;

        static {
            Covode.recordClassIndex(51777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43537b(Address address) {
            super(1);
            this.f101541a = address;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            C89219l.m154721d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, 0, null, null, null, new C43548b(this.f101541a), null, 47, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel$c */
    static final class C43538c extends AbstractC89220m implements AbstractC89172b<AddressListState, AddressListState> {

        /* renamed from: a */
        final /* synthetic */ Address f101542a;

        static {
            Covode.recordClassIndex(51778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43538c(Address address) {
            super(1);
            this.f101542a = address;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            C89219l.m154721d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, 0, null, null, new C43548b(this.f101542a), null, null, 55, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel$f */
    static final class C43542f extends AbstractC89220m implements AbstractC89172b<AddressListState, AddressListState> {

        /* renamed from: a */
        public static final C43542f f101546a = new C43542f();

        static {
            Covode.recordClassIndex(51782);
        }

        C43542f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            C89219l.m154721d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, 0, null, null, null, null, new C43571c(), 31, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel$g */
    public static final class C43543g extends AbstractC89220m implements AbstractC89172b<AddressListState, AddressListState> {

        /* renamed from: a */
        final /* synthetic */ int f101547a;

        static {
            Covode.recordClassIndex(51783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43543g(int i) {
            super(1);
            this.f101547a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            C89219l.m154721d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, this.f101547a, null, null, null, null, null, 62, null);
        }
    }

    /* renamed from: a */
    public final void mo74031a(Address address) {
        C89219l.m154721d(address, "");
        mo33689c(new C43538c(address));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel$d */
    public static final class C43539d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressListViewModel f101543a;

        static {
            Covode.recordClassIndex(51779);
        }

        C43539d(AddressListViewModel addressListViewModel) {
            this.f101543a = addressListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((C22099u) obj).f52262b;
            final T t2 = t.data;
            if (!t.isCodeOK() || t2 == null) {
                this.f101543a.mo74030a(3);
                return;
            }
            List<C44457d> list = t2.f101214a;
            if (list == null || list.isEmpty()) {
                this.f101543a.mo74030a(4);
            } else {
                this.f101543a.mo74030a(-1);
            }
            this.f101543a.mo33689c(new AbstractC89172b<AddressListState, AddressListState>() {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel.C43539d.C435401 */

                static {
                    Covode.recordClassIndex(51780);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
                    AddressListState addressListState2 = addressListState;
                    C89219l.m154721d(addressListState2, "");
                    List list = t2.f101214a;
                    if (list == null) {
                        list = C89086z.INSTANCE;
                    }
                    return AddressListState.copy$default(addressListState2, 0, list, null, null, null, null, 61, null);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (str.hashCode() == 1819520028 && str.equals("ec_address_change")) {
            int i = AddressPageStarter.C43338a.C43339a.m86456a(str2).f101147b;
            if (i == 0 || i == 1) {
                mo74029a();
            } else if (i == 2) {
                mo74029a();
                mo33689c(C43542f.f101546a);
            }
        }
    }
}
