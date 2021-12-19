package com.bytedance.creativex.recorder.filter.p945d;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14217g;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.creativex.recorder.filter.d.a */
public final class C14243a extends AbstractC2562j<AbstractC14217g> implements AbstractC14217g, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f34534a = {new C89232y(C14243a.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0)};

    /* renamed from: b */
    public final C14243a f34535b = this;

    /* renamed from: c */
    private final ActivityC0945e f34536c = ((ActivityC0945e) getDiContainer().mo35248a(ActivityC0945e.class, (String) null));

    /* renamed from: d */
    private final AbstractC89248d f34537d = C21572a.m40504a(getDiContainer(), AbstractC14210a.class);

    /* renamed from: e */
    private final AbstractC89244h f34538e = C89250i.m154774a(EnumC89331m.NONE, C14244a.f34541a);

    /* renamed from: f */
    private final AbstractC89244h f34539f = C89250i.m154773a((AbstractC89171a) new C14245b(this));

    /* renamed from: g */
    private final C21582f f34540g;

    static {
        Covode.recordClassIndex(16312);
    }

    /* renamed from: b */
    private final AbstractC14254d m25982b() {
        return (AbstractC14254d) this.f34538e.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC14210a mo22997a() {
        return (AbstractC14210a) this.f34537d.mo23374a(this, f34534a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC14217g getApiComponent() {
        return this.f34535b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f34540g;
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.a$a */
    static final class C14244a extends AbstractC89220m implements AbstractC89171a<C14248c> {

        /* renamed from: a */
        public static final C14244a f34541a = new C14244a();

        static {
            Covode.recordClassIndex(16313);
        }

        C14244a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14248c invoke() {
            return new C14248c();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.a$b */
    static final class C14245b extends AbstractC89220m implements AbstractC89171a<C142461> {

        /* renamed from: a */
        final /* synthetic */ C14243a f34542a;

        static {
            Covode.recordClassIndex(16314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14245b(C14243a aVar) {
            super(0);
            this.f34542a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C142461 invoke() {
            return new AbstractC14255e(this) {
                /* class com.bytedance.creativex.recorder.filter.p945d.C14243a.C14245b.C142461 */

                /* renamed from: a */
                final /* synthetic */ C14245b f34543a;

                static {
                    Covode.recordClassIndex(16315);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f34543a = r1;
                }

                @Override // com.bytedance.creativex.recorder.filter.p945d.AbstractC14255e
                /* renamed from: a */
                public final void mo22999a(EnumC14257g gVar) {
                    List<FilterBean> list;
                    int indexOf;
                    FilterBean filterBean;
                    AbstractC50707o oVar;
                    AbstractC50709q f;
                    LiveData<List<FilterBean>> b;
                    C89219l.m154721d(gVar, "");
                    C14243a aVar = this.f34543a.f34542a;
                    C14215e value = aVar.mo22997a().getCurrentFilterSource().getValue();
                    if (value == null || (oVar = value.f34498b) == null || (f = oVar.mo86071f()) == null || (b = f.mo86075b()) == null || (list = b.getValue()) == null) {
                        list = C89086z.INSTANCE;
                    }
                    FilterBean a = aVar.mo22997a().getCurSelectedFilter().mo7034a();
                    int i = 0;
                    if (a != null && (indexOf = list.indexOf(a)) >= 0) {
                        i = indexOf;
                    }
                    int i2 = C14247b.f34544a[gVar.ordinal()];
                    if (i2 == 1) {
                        filterBean = (FilterBean) C89070n.m154561b((List) list, i - 1);
                    } else if (i2 == 2) {
                        filterBean = (FilterBean) C89070n.m154561b((List) list, i + 1);
                    } else if (i2 == 3) {
                        filterBean = a;
                    } else {
                        throw new C89376n();
                    }
                    if (filterBean != null) {
                        aVar.mo22997a().setFilterChosen(filterBean, "slide", !C89219l.m154714a(filterBean, a), true, C89219l.m154714a(filterBean, a));
                    }
                }

                @Override // com.bytedance.creativex.recorder.filter.p945d.AbstractC14255e
                /* renamed from: a */
                public final void mo22998a(float f, EnumC14256f fVar) {
                    int indexOf;
                    FilterBean filterBean;
                    C89219l.m154721d(fVar, "");
                    C14243a aVar = this.f34543a.f34542a;
                    C14215e value = aVar.mo22997a().getCurrentFilterSource().getValue();
                    if (value != null) {
                        C89219l.m154716b(value, "");
                        List<FilterBean> value2 = value.f34498b.mo86071f().mo86075b().getValue();
                        if (value2 == null) {
                            value2 = C89086z.INSTANCE;
                        }
                        if (!value2.isEmpty()) {
                            FilterBean a = aVar.mo22997a().getCurSelectedFilter().mo7034a();
                            int i = 0;
                            if (a != null && (indexOf = value2.indexOf(a)) >= 0) {
                                i = indexOf;
                            }
                            if (fVar == EnumC14256f.LEFT) {
                                filterBean = (FilterBean) C89070n.m154561b((List) value2, i - 1);
                            } else {
                                filterBean = a;
                            }
                            if (fVar != EnumC14256f.LEFT) {
                                a = (FilterBean) C89070n.m154561b((List) value2, i + 1);
                            }
                            if (filterBean != null && a != null) {
                                aVar.mo22997a().setFilterScroll(filterBean, a, f);
                            }
                        }
                    }
                }
            };
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        m25982b().mo23000a();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        m25982b().mo23003a((AbstractC14255e) this.f34539f.getValue());
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14217g
    /* renamed from: a */
    public final void mo22969a(float f) {
        m25982b().mo23001a(f);
    }

    public C14243a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f34540g = fVar;
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14217g
    /* renamed from: a */
    public final void mo22970a(float f, float f2) {
        AbstractC14254d b = m25982b();
        Window window = this.f34536c.getWindow();
        C89219l.m154716b(window, "");
        View decorView = window.getDecorView();
        C89219l.m154716b(decorView, "");
        b.mo23002a(f, f2, decorView.getWidth());
    }
}
