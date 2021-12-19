package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.repo.RegionApi;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4616h.C89245a;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel */
public final class DistrictPickerViewModel extends JediViewModel<DistrictPickerState> {

    /* renamed from: a */
    public static final /* synthetic */ AbstractC89286i[] f106284a = {new C89225r(DistrictPickerViewModel.class, "numberOfRemainingLevel", "getNumberOfRemainingLevel()I", 0), new C89225r(DistrictPickerViewModel.class, "parentId", "getParentId()I", 0)};

    /* renamed from: k */
    public static final C45657a f106285k = new C45657a((byte) 0);

    /* renamed from: b */
    public String[] f106286b;

    /* renamed from: c */
    public OrderSKUDTO f106287c;

    /* renamed from: d */
    public final AbstractC89249e f106288d = C89245a.m154732a();

    /* renamed from: e */
    public final AbstractC89249e f106289e = C89245a.m154732a();

    /* renamed from: f */
    public ArrayList<Region> f106290f = new ArrayList<>();

    /* renamed from: g */
    public boolean f106291g;

    static {
        Covode.recordClassIndex(54161);
    }

    /* renamed from: a */
    public final int mo76860a() {
        return ((Number) this.f106288d.mo23374a(this, f106284a[0])).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel$a */
    public static final class C45657a {
        static {
            Covode.recordClassIndex(54162);
        }

        private C45657a() {
        }

        public /* synthetic */ C45657a(byte b) {
            this();
        }
    }

    /* renamed from: h */
    private static boolean m88168h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo76863b() {
        if (!this.f106291g || mo76860a() <= 0) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ DistrictPickerState mo23027d() {
        return new DistrictPickerState(null, null, null, null, 0, 31, null);
    }

    /* renamed from: i */
    private static boolean m88169i() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean h = m88168h();
        C58029j.f132253e = h;
        return h;
    }

    /* renamed from: g */
    public final void mo76864g() {
        if (!m88169i()) {
            mo76862a(2);
            return;
        }
        mo76862a(0);
        RegionApi.C45656a.m88166a(this.f106286b, this.f106287c).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C45658b(this), new C45660c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel$c */
    static final class C45660c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DistrictPickerViewModel f106295a;

        static {
            Covode.recordClassIndex(54165);
        }

        C45660c(DistrictPickerViewModel districtPickerViewModel) {
            this.f106295a = districtPickerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f106295a.mo76862a(3);
        }
    }

    /* renamed from: a */
    public final void mo76862a(int i) {
        mo33689c(new C45662e(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel$e */
    public static final class C45662e extends AbstractC89220m implements AbstractC89172b<DistrictPickerState, DistrictPickerState> {

        /* renamed from: a */
        final /* synthetic */ int f106297a;

        static {
            Covode.recordClassIndex(54167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45662e(int i) {
            super(1);
            this.f106297a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DistrictPickerState invoke(DistrictPickerState districtPickerState) {
            DistrictPickerState districtPickerState2 = districtPickerState;
            C89219l.m154721d(districtPickerState2, "");
            return DistrictPickerState.copy$default(districtPickerState2, null, null, null, null, this.f106297a, 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel$b */
    static final class C45658b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DistrictPickerViewModel f106292a;

        static {
            Covode.recordClassIndex(54163);
        }

        C45658b(DistrictPickerViewModel districtPickerViewModel) {
            this.f106292a = districtPickerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C43612a aVar = (C43612a) obj;
            final T t = aVar.data;
            if (!aVar.isCodeOK() || t == null) {
                this.f106292a.mo76862a(3);
                return;
            }
            DistrictPickerViewModel districtPickerViewModel = this.f106292a;
            Boolean bool = t.f106276b;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            districtPickerViewModel.f106291g = z;
            this.f106292a.mo33689c(new AbstractC89172b<DistrictPickerState, DistrictPickerState>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel.C45658b.C456591 */

                /* renamed from: a */
                final /* synthetic */ C45658b f106293a;

                static {
                    Covode.recordClassIndex(54164);
                }

                {
                    this.f106293a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ DistrictPickerState invoke(DistrictPickerState districtPickerState) {
                    DistrictPickerState districtPickerState2 = districtPickerState;
                    C89219l.m154721d(districtPickerState2, "");
                    List list = t.f106275a;
                    if (list == null) {
                        list = C89086z.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.size() > 4) {
                        String str = "";
                        for (T t : list) {
                            String str2 = t.f106274c;
                            if (str2 != null) {
                                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                                String upperCase = str2.toUpperCase();
                                C89219l.m154716b(upperCase, "");
                                if (upperCase != null && (!C89219l.m154714a((Object) upperCase, (Object) str))) {
                                    arrayList.add(upperCase);
                                    str = upperCase;
                                }
                            }
                            arrayList.add(t);
                        }
                    } else {
                        arrayList.addAll(list);
                    }
                    String str3 = t.f106277c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = t.f106278d;
                    if (str4 == null) {
                        str4 = "";
                    }
                    return DistrictPickerState.copy$default(districtPickerState2, str3, str4, arrayList, null, -1, 8, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel$d */
    public static final class C45661d extends AbstractC89220m implements AbstractC89172b<DistrictPickerState, DistrictPickerState> {

        /* renamed from: a */
        final /* synthetic */ District f106296a;

        static {
            Covode.recordClassIndex(54166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45661d(District district) {
            super(1);
            this.f106296a = district;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DistrictPickerState invoke(DistrictPickerState districtPickerState) {
            DistrictPickerState districtPickerState2 = districtPickerState;
            C89219l.m154721d(districtPickerState2, "");
            District district = this.f106296a;
            return DistrictPickerState.copy$default(districtPickerState2, null, null, null, new District(district.f106272a, district.f106273b, district.f106274c), 0, 23, null);
        }
    }

    /* renamed from: a */
    public final ArrayList<Region> mo76861a(District district) {
        C89219l.m154721d(district, "");
        ArrayList<Region> arrayList = new ArrayList<>(this.f106290f);
        arrayList.add(new Region(district.f106272a, district.f106273b, null, 4));
        return arrayList;
    }
}
