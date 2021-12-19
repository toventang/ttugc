package com.p2082ss.android.ugc.aweme.ecommerce.address.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.services.apm.api.C22708a;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.api.AddressApi;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.AddressItem;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43366b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43367c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43369e;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43370f;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43373i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a.C43340a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45539b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel */
public final class AddressEditViewModel extends JediViewModel<AddressEditState> {

    /* renamed from: a */
    public Region f101247a;

    /* renamed from: b */
    public Address f101248b;

    /* renamed from: c */
    public List<Region> f101249c;

    /* renamed from: d */
    public String f101250d = "0";

    /* renamed from: e */
    public boolean f101251e;

    /* renamed from: f */
    public String f101252f = "";

    /* renamed from: g */
    public HashMap<String, Object> f101253g;

    /* renamed from: k */
    public C43476i f101254k;

    /* renamed from: l */
    public C43478j f101255l;

    /* renamed from: m */
    public C89378p<String, Address> f101256m;

    /* renamed from: n */
    public AddressPageStarter.AddressEditEnterParams f101257n;

    /* renamed from: o */
    public List<C43340a> f101258o = C89086z.INSTANCE;

    /* renamed from: p */
    public boolean f101259p;

    /* renamed from: q */
    public Address f101260q;

    static {
        Covode.recordClassIndex(51612);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$k */
    public static final class C43397k extends C27895a<HashMap<String, Object>> {
        static {
            Covode.recordClassIndex(51626);
        }

        C43397k() {
        }
    }

    /* renamed from: g */
    public final Address mo73967g() {
        return m86483a(this.f101258o, true);
    }

    /* renamed from: h */
    private static boolean m86486h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m86485b() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean h = m86486h();
        C58029j.f132253e = h;
        return h;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AddressEditState mo23027d() {
        return new AddressEditState(0, null, null, null, null, false, 0, false, 255, null);
    }

    /* renamed from: a */
    public final void mo73961a() {
        if (!m86485b()) {
            mo73962a(2);
            return;
        }
        mo73962a(0);
        AbstractC88412b a = C45539b.m88078a(AddressApi.C43341a.m86459a(this.f101247a), "shipping_address", new C89378p[0]).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C43395i(this), new C43396j(this));
        C89219l.m154716b(a, "");
        mo33680a(a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$c */
    static final class C43388c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101265a;

        static {
            Covode.recordClassIndex(51617);
        }

        C43388c(AddressEditViewModel addressEditViewModel) {
            this.f101265a = addressEditViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f101265a.mo33689c(C433891.f101266a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$e */
    public static final class C43391e implements AbstractC88986z<C22099u<C43612a<C43367c>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f101269a;

        static {
            Covode.recordClassIndex(51620);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C43391e(AbstractC89124d dVar) {
            this.f101269a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C22099u<C43612a<C43367c>> uVar) {
            C89219l.m154721d(uVar, "");
            this.f101269a.resumeWith(C89379q.m157068constructorimpl(uVar));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f101269a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$f */
    public static final class C43392f implements AbstractC88986z<C22099u<C43612a<C43369e>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f101270a;

        static {
            Covode.recordClassIndex(51621);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C43392f(AbstractC89124d dVar) {
            this.f101270a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C22099u<C43612a<C43369e>> uVar) {
            C89219l.m154721d(uVar, "");
            this.f101270a.resumeWith(C89379q.m157068constructorimpl(uVar));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f101270a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$j */
    static final class C43396j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101280a;

        static {
            Covode.recordClassIndex(51625);
        }

        C43396j(AddressEditViewModel addressEditViewModel) {
            this.f101280a = addressEditViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f101280a.mo73962a(3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$p */
    static final class C43406p<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101295a;

        static {
            Covode.recordClassIndex(51635);
        }

        C43406p(AddressEditViewModel addressEditViewModel) {
            this.f101295a = addressEditViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f101295a.mo33689c(C434071.f101296a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$y */
    public static final class C43418y<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101310a;

        static {
            Covode.recordClassIndex(51647);
        }

        public C43418y(AddressEditViewModel addressEditViewModel) {
            this.f101310a = addressEditViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f101310a.mo33689c(C434191.f101311a);
        }
    }

    /* renamed from: a */
    public final void mo73965a(List<C43340a> list) {
        C89219l.m154721d(list, "");
        this.f101258o = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$a */
    static final class C43384a extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        public static final C43384a f101261a = new C43384a();

        static {
            Covode.recordClassIndex(51613);
        }

        C43384a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, null, 0, null, null, false, 0, false, 251, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$b */
    static final class C43385b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101262a;

        static {
            Covode.recordClassIndex(51614);
        }

        C43385b(AddressEditViewModel addressEditViewModel) {
            this.f101262a = addressEditViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (!((C43612a) obj).isCodeOK()) {
                this.f101262a.mo33689c(C433861.f101263a);
            } else {
                this.f101262a.mo33689c(C433872.f101264a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$d */
    static final class C43390d extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101267a;

        /* renamed from: b */
        final /* synthetic */ List f101268b;

        static {
            Covode.recordClassIndex(51619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43390d(AddressEditViewModel addressEditViewModel, List list) {
            super(1);
            this.f101267a = addressEditViewModel;
            this.f101268b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, null, null, null, this.f101268b, false, 0, false, 239, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$n */
    static final class C43400n extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        public static final C43400n f101288a = new C43400n();

        static {
            Covode.recordClassIndex(51629);
        }

        C43400n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, null, null, 0, null, false, 0, false, 247, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$q */
    static final class C43408q extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f101297a;

        static {
            Covode.recordClassIndex(51637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43408q(boolean z) {
            super(1);
            this.f101297a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, null, null, null, null, this.f101297a, 0, false, 223, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$s */
    public static final class C43410s extends AbstractC89220m implements AbstractC89172b<AddressEditState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101300a;

        static {
            Covode.recordClassIndex(51639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43410s(AddressEditViewModel addressEditViewModel) {
            super(1);
            this.f101300a = addressEditViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            this.f101300a.mo73965a(addressEditState2.getInputItemVOList());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$u */
    public static final class C43412u extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        final /* synthetic */ int f101302a;

        static {
            Covode.recordClassIndex(51641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43412u(int i) {
            super(1);
            this.f101302a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, this.f101302a, null, null, null, null, false, 0, false, 254, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$w */
    public static final class C43414w extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        public static final C43414w f101305a = new C43414w();

        static {
            Covode.recordClassIndex(51643);
        }

        C43414w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, 0, null, null, null, false, 0, false, 253, null);
        }
    }

    /* renamed from: a */
    public final void mo73962a(int i) {
        mo33689c(new C43412u(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$g */
    public static final class C43393g extends AbstractC89220m implements AbstractC89172b<AddressEditState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101271a;

        /* renamed from: b */
        final /* synthetic */ String f101272b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f101273c;

        static {
            Covode.recordClassIndex(51622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43393g(AddressEditViewModel addressEditViewModel, String str, AbstractC89172b bVar) {
            super(1);
            this.f101271a = addressEditViewModel;
            this.f101272b = str;
            this.f101273c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            AddressEditViewModel addressEditViewModel = this.f101271a;
            String str = this.f101272b;
            Address a = addressEditViewModel.mo73960a(addressEditState2, true);
            AbstractC89172b bVar = this.f101273c;
            C89219l.m154721d(bVar, "");
            if (!(!AddressEditViewModel.m86485b() || str == null || str.length() == 0 || a == null)) {
                AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C43394h(addressEditViewModel, str, a, bVar, null), 2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$i */
    static final class C43395i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101279a;

        static {
            Covode.recordClassIndex(51624);
        }

        C43395i(AddressEditViewModel addressEditViewModel) {
            this.f101279a = addressEditViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((C22099u) obj).f52262b;
            T t2 = t.data;
            if (!t.isCodeOK() || t2 == null) {
                this.f101279a.mo73962a(3);
                return;
            }
            this.f101279a.mo73962a(-1);
            this.f101279a.mo73964a((InputItemData) t2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$x */
    public static final class C43415x<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101306a;

        /* renamed from: b */
        final /* synthetic */ Region f101307b;

        static {
            Covode.recordClassIndex(51644);
        }

        public C43415x(AddressEditViewModel addressEditViewModel, Region region) {
            this.f101306a = addressEditViewModel;
            this.f101307b = region;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((C22099u) obj).f52262b;
            T t2 = t.data;
            if (!t.isCodeOK() || t2 == null) {
                this.f101306a.mo33689c(C434161.f101308a);
                return;
            }
            this.f101306a.f101247a = this.f101307b;
            this.f101306a.f101251e = true;
            this.f101306a.mo33689c(C434172.f101309a);
            this.f101306a.mo73964a((InputItemData) t2);
        }
    }

    /* renamed from: a */
    public final void mo73963a(Address address) {
        mo33689c(new C43413v(this, address));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$h */
    static final class C43394h extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f101274a;

        /* renamed from: b */
        final /* synthetic */ AddressEditViewModel f101275b;

        /* renamed from: c */
        final /* synthetic */ String f101276c;

        /* renamed from: d */
        final /* synthetic */ Address f101277d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f101278e;

        static {
            Covode.recordClassIndex(51623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43394h(AddressEditViewModel addressEditViewModel, String str, Address address, AbstractC89172b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f101275b = addressEditViewModel;
            this.f101276c = str;
            this.f101277d = address;
            this.f101278e = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C43394h(this.f101275b, this.f101276c, this.f101277d, this.f101278e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C43394h) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            T t;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f101274a;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    C43370f fVar = new C43370f(this.f101276c, this.f101277d);
                    this.f101274a = 1;
                    C89134h hVar = new C89134h(C89099b.m154605a(this));
                    C89219l.m154721d(fVar, "");
                    ((AddressApi) AddressApi.C43341a.f101152a.mo28858a(AddressApi.class)).getCandInput(fVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143062b(new C43392f(hVar));
                    obj = hVar.mo143576a();
                    if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                        C89219l.m154721d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Throwable unused) {
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C22099u uVar = (C22099u) obj;
            if (uVar.f52262b.isCodeOK() && (t = uVar.f52262b.data) != null) {
                this.f101278e.invoke(t);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$t */
    public static final class C43411t extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f101301a;

        static {
            Covode.recordClassIndex(51640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43411t(boolean z) {
            super(1);
            this.f101301a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            int i;
            AddressEditState addressEditState2 = addressEditState;
            C89219l.m154721d(addressEditState2, "");
            if (this.f101301a) {
                Iterator<T> it = addressEditState2.getInputItemVOList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C89219l.m154714a((Object) next.f101148a.f101199d, (Object) "address")) {
                        if (next != null) {
                            i = addressEditState2.getInputItemVOList().indexOf(next);
                        }
                    }
                }
            }
            i = -1;
            return AddressEditState.copy$default(addressEditState2, 0, null, null, null, null, false, i, this.f101301a, 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$l */
    public static final class C43398l extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f101281a;

        /* renamed from: b */
        final /* synthetic */ AddressEditViewModel f101282b;

        /* renamed from: c */
        final /* synthetic */ Address f101283c;

        /* renamed from: d */
        final /* synthetic */ String f101284d;

        /* renamed from: e */
        final /* synthetic */ String f101285e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f101286f;

        static {
            Covode.recordClassIndex(51627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43398l(AddressEditViewModel addressEditViewModel, Address address, String str, String str2, AbstractC89172b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f101282b = addressEditViewModel;
            this.f101283c = address;
            this.f101284d = str;
            this.f101285e = str2;
            this.f101286f = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C43398l(this.f101282b, this.f101283c, this.f101284d, this.f101285e, this.f101286f, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C43398l) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            T t;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f101281a;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    C43366b bVar = new C43366b(this.f101283c, this.f101284d, this.f101285e);
                    this.f101281a = 1;
                    C89134h hVar = new C89134h(C89099b.m154605a(this));
                    C89219l.m154721d(bVar, "");
                    ((AddressApi) AddressApi.C43341a.f101152a.mo28858a(AddressApi.class)).getCandDetailPlace(bVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143062b(new C43391e(hVar));
                    obj = hVar.mo143576a();
                    if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                        C89219l.m154721d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Throwable unused) {
                    C22708a.m42800a("queryCandDetailPlace fail");
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C22099u uVar = (C22099u) obj;
            if (uVar.f52262b.isCodeOK() && (t = uVar.f52262b.data) != null) {
                this.f101286f.invoke(t);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$o */
    static final class C43401o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101289a;

        /* renamed from: b */
        final /* synthetic */ Address f101290b;

        static {
            Covode.recordClassIndex(51630);
        }

        C43401o(AddressEditViewModel addressEditViewModel, Address address) {
            this.f101289a = addressEditViewModel;
            this.f101290b = address;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((C22099u) obj).f52262b;
            final T t2 = t.data;
            if (!t.isCodeOK() || t2 == null) {
                this.f101289a.mo33689c(C434021.f101291a);
                return;
            }
            List<C43373i> list = t2.f101235b;
            if (list == null || list.isEmpty()) {
                EventCenter.m87158a().mo75479a("ec_address_change", new AddressPageStarter.C43338a(t2.f101234a, !C89219l.m154714a(this.f101289a.f101250d, "0") ? 1 : 0).mo73855a());
                AddressEditViewModel addressEditViewModel = this.f101289a;
                String str = t2.f101234a;
                C89219l.m154721d(str, "");
                addressEditViewModel.f101250d = str;
                this.f101289a.f101256m = C89387v.m154943a(t2.f101234a, this.f101290b);
                this.f101289a.mo33689c(C434032.f101292a);
                C43476i iVar = this.f101289a.f101254k;
                if (iVar != null) {
                    iVar.mo73994a(true, (List<String>) C89086z.INSTANCE);
                }
                C43478j jVar = this.f101289a.f101255l;
                if (jVar != null) {
                    jVar.mo73998a(true, (List<String>) C89086z.INSTANCE);
                    return;
                }
                return;
            }
            this.f101289a.mo33689c(new AbstractC89172b<AddressEditState, AddressEditState>() {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.C43401o.C434043 */

                static {
                    Covode.recordClassIndex(51633);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
                    T t;
                    AddressEditState addressEditState2 = addressEditState;
                    C89219l.m154721d(addressEditState2, "");
                    List<C43340a> inputItemVOList = addressEditState2.getInputItemVOList();
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) inputItemVOList, 10));
                    Iterator<T> it = inputItemVOList.iterator();
                    while (it.hasNext()) {
                        String str = null;
                        C43340a a = C43340a.m86457a(it.next(), null, null, null, 7);
                        Iterator<T> it2 = t2.f101235b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (C89219l.m154714a((Object) t.f101231a, (Object) a.f101148a.f101199d)) {
                                break;
                            }
                        }
                        T t2 = t;
                        if (t2 != null) {
                            str = t2.f101232b;
                        }
                        a.f101150c = str;
                        arrayList.add(a);
                    }
                    return AddressEditState.copy$default(addressEditState2, 0, null, null, 3, arrayList, false, 0, false, 231, null);
                }
            });
            this.f101289a.mo33687b_(new AbstractC89172b<AddressEditState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.C43401o.C434054 */

                /* renamed from: a */
                final /* synthetic */ C43401o f101294a;

                static {
                    Covode.recordClassIndex(51634);
                }

                {
                    this.f101294a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(AddressEditState addressEditState) {
                    AddressEditState addressEditState2 = addressEditState;
                    C89219l.m154721d(addressEditState2, "");
                    this.f101294a.f101289a.mo73965a(addressEditState2.getInputItemVOList());
                    return C89391z.f203057a;
                }
            });
            C43476i iVar2 = this.f101289a.f101254k;
            if (iVar2 != null) {
                List<C43373i> list2 = t2.f101235b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    String str2 = it.next().f101231a;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                iVar2.mo73994a(false, (List<String>) arrayList);
            }
            C43478j jVar2 = this.f101289a.f101255l;
            if (jVar2 != null) {
                List<C43373i> list3 = t2.f101235b;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    String str3 = it2.next().f101231a;
                    if (str3 != null) {
                        arrayList2.add(str3);
                    }
                }
                jVar2.mo73998a(false, (List<String>) arrayList2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$m */
    static final class C43399m extends AbstractC89220m implements AbstractC89172b<AddressEditState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101287a;

        static {
            Covode.recordClassIndex(51628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43399m(AddressEditViewModel addressEditViewModel) {
            super(1);
            this.f101287a = addressEditViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0115, code lost:
            r5 = r10.f101287a.mo73960a(r11, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x011b, code lost:
            if (r5 == null) goto L_0x017b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
            r4 = r10.f101287a;
            r4.mo33689c(com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.C43400n.f101288a);
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, "");
            r0 = com.p2082ss.android.ugc.aweme.ecommerce.track.C45539b.m88078a(((com.p2082ss.android.ugc.aweme.ecommerce.address.api.AddressApi) com.p2082ss.android.ugc.aweme.ecommerce.address.api.AddressApi.C43341a.f101152a.mo28858a(com.p2082ss.android.ugc.aweme.ecommerce.address.api.AddressApi.class)).saveAddress(new com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43376l(r5)), "shipping_address", new p4600h.C89378p[0]).mo143278b(p4560f.p4561a.p4587h.C88925a.m154180b(p4560f.p4561a.p4590k.C88946a.f201991c)).mo143261a(p4560f.p4561a.p4562a.p4563a.C88391a.m153580a(p4560f.p4561a.p4562a.p4564b.C88392a.f200660a)).mo143254a(new com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.C43401o(r4, r5), new com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.C43406p(r4));
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
            r4.mo33680a(r0);
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState r11) {
            /*
            // Method dump skipped, instructions count: 382
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.C43399m.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$r */
    public static final class C43409r extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101298a;

        /* renamed from: b */
        final /* synthetic */ InputItemData f101299b;

        static {
            Covode.recordClassIndex(51638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43409r(AddressEditViewModel addressEditViewModel, InputItemData inputItemData) {
            super(1);
            this.f101298a = addressEditViewModel;
            this.f101299b = inputItemData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x018b, code lost:
            if (r13.equals("region") != false) goto L_0x008e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x015b  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState invoke(com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState r27) {
            /*
            // Method dump skipped, instructions count: 464
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.C43409r.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel$v */
    static final class C43413v extends AbstractC89220m implements AbstractC89172b<AddressEditState, AddressEditState> {

        /* renamed from: a */
        final /* synthetic */ AddressEditViewModel f101303a;

        /* renamed from: b */
        final /* synthetic */ Address f101304b;

        static {
            Covode.recordClassIndex(51642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43413v(AddressEditViewModel addressEditViewModel, Address address) {
            super(1);
            this.f101303a = addressEditViewModel;
            this.f101304b = address;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x003a A[SYNTHETIC] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState invoke(com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState r24) {
            /*
            // Method dump skipped, instructions count: 340
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.C43413v.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo73964a(InputItemData inputItemData) {
        Region region;
        if (Region.C43362a.m86479a(this.f101247a, inputItemData.f101207b)) {
            region = inputItemData.f101207b;
        } else {
            region = null;
        }
        this.f101247a = region;
        mo33689c(new C43409r(this, inputItemData));
        mo33687b_(new C43410s(this));
    }

    /* renamed from: a */
    public final void mo73966a(boolean z) {
        mo33689c(new C43408q(z));
    }

    /* renamed from: a */
    public final Address mo73960a(AddressEditState addressEditState, boolean z) {
        return m86483a(addressEditState.getInputItemVOList(), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m86484a(java.util.List<com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Rule> r8, java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.m86484a(java.util.List, java.lang.Object):java.lang.String");
    }

    /* renamed from: a */
    private final Address m86483a(List<C43340a> list, boolean z) {
        T t;
        T t2;
        T t3;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.f101148a.f101199d, (Object) "region")) {
                break;
            }
        }
        T t4 = t;
        Object obj = t4 != null ? t4.f101149b : null;
        if (!(obj instanceof Region)) {
            obj = null;
        }
        Region region = (Region) obj;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (C89219l.m154714a((Object) t2.f101148a.f101199d, (Object) "districts")) {
                break;
            }
        }
        T t5 = t2;
        Object obj2 = t5 != null ? t5.f101149b : null;
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        ArrayList arrayList = new ArrayList();
        for (T t6 : list) {
            String str = t6.f101148a.f101199d;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -934795532) {
                    if (hashCode != 106642798) {
                        if (hashCode == 367869605 && str.equals("districts")) {
                        }
                    } else if (str.equals("phone")) {
                    }
                } else if (str.equals("region")) {
                }
                String str2 = t6.f101148a.f101199d;
                Object obj3 = t6.f101149b;
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str3 = (String) obj3;
                if (!(str2 == null || str3 == null)) {
                    arrayList.add(new AddressItem(str2, str3));
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                t3 = null;
                break;
            }
            t3 = it3.next();
            if (C89219l.m154714a((Object) t3.f101148a.f101199d, (Object) "phone")) {
                break;
            }
        }
        T t7 = t3;
        if (t7 != null) {
            Object obj4 = t7.f101149b;
            if (!(obj4 instanceof C89378p)) {
                obj4 = null;
            }
            C89378p pVar = (C89378p) obj4;
            if (pVar != null) {
                arrayList2 = C89070n.m154585g((Collection) arrayList2);
                String str4 = (String) pVar.getFirst();
                if (str4 != null) {
                    arrayList2.add(new AddressItem("phone_region_code", str4));
                }
                String str5 = (String) pVar.getSecond();
                if (str5 != null) {
                    arrayList2.add(new AddressItem("phone", str5));
                }
            }
        }
        if ((region == null || list2 == null) && !z) {
            return null;
        }
        return new Address(this.f101250d, arrayList2, region, list2);
    }
}
