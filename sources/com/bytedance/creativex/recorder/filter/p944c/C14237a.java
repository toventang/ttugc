package com.bytedance.creativex.recorder.filter.p944c;

import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.filter.view.widget.C14094b;
import com.bytedance.creativex.filter.view.widget.CompositeFilterIndicator;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14213c;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.bytedance.creativex.recorder.filter.p942a.C14218h;
import com.bytedance.creativex.recorder.filter.p942a.EnumC14222l;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.c.a */
public class C14237a extends AbstractC2562j<AbstractC14213c> implements AbstractC14213c, AbstractC21566a {

    /* renamed from: a */
    private final AbstractC14210a f34525a = ((AbstractC14210a) getDiContainer().mo35248a(AbstractC14210a.class, (String) null));

    /* renamed from: b */
    private final AbstractC89244h f34526b = C89250i.m154774a(EnumC89331m.NONE, new C14239b(this));

    /* renamed from: c */
    private final AbstractC22186b f34527c;

    /* renamed from: d */
    private final C21582f f34528d;

    /* renamed from: e */
    private final int f34529e = R.id.dg9;

    static {
        Covode.recordClassIndex(16306);
    }

    /* renamed from: a */
    public final C14241c mo22996a() {
        return (C14241c) this.f34526b.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public /* bridge */ /* synthetic */ AbstractC14213c getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f34528d;
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.c.a$b */
    static final class C14239b extends AbstractC89220m implements AbstractC89171a<C14241c> {

        /* renamed from: a */
        final /* synthetic */ C14237a f34531a;

        static {
            Covode.recordClassIndex(16308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14239b(C14237a aVar) {
            super(0);
            this.f34531a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14241c invoke() {
            return new C14241c();
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        this.f34527c.mo36387a(this.f34529e, mo22996a(), "FilterSwipeIndicatorScene");
        this.f34525a.getFilterSwitchEvent().mo6997a(this, new C14238a(this));
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.c.a$a */
    static final class C14238a<T> implements AbstractC2565m<C14218h> {

        /* renamed from: a */
        final /* synthetic */ C14237a f34530a;

        static {
            Covode.recordClassIndex(16307);
        }

        C14238a(C14237a aVar) {
            this.f34530a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14218h hVar) {
            FilterBean filterBean;
            boolean z;
            String str;
            String name;
            C14218h hVar2 = hVar;
            C14241c a = this.f34530a.mo22996a();
            C89378p<FilterBean, C14215e> pVar = hVar2.f34501a;
            FilterBean filterBean2 = null;
            if (pVar != null) {
                filterBean = pVar.getFirst();
            } else {
                filterBean = null;
            }
            String a2 = C14240b.m25980a(hVar2.f34501a);
            C89378p<FilterBean, C14215e> pVar2 = hVar2.f34502b;
            if (pVar2 != null) {
                filterBean2 = pVar2.getFirst();
            }
            String a3 = C14240b.m25980a(hVar2.f34502b);
            if (hVar2.f34503c == EnumC14222l.RIGHT_TO_LEFT) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "";
            if (a.f34533a == null) {
                View findViewById = a.mo36482p().findViewById(R.id.b1u);
                C89219l.m154716b(findViewById, str2);
                View a4 = ((ViewStubCompat) findViewById).mo1691a();
                Objects.requireNonNull(a4, "null cannot be cast to non-null type com.bytedance.creativex.filter.view.widget.CompositeFilterIndicator");
                a.f34533a = (CompositeFilterIndicator) a4;
            }
            CompositeFilterIndicator compositeFilterIndicator = a.f34533a;
            if (compositeFilterIndicator != null) {
                if (filterBean == null || (str = filterBean.getName()) == null) {
                    str = str2;
                }
                C14094b bVar = new C14094b(str, a2);
                if (!(filterBean2 == null || (name = filterBean2.getName()) == null)) {
                    str2 = name;
                }
                compositeFilterIndicator.mo22631a(bVar, new C14094b(str2, a3), z);
            }
        }
    }

    public C14237a(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f34527c = bVar;
        this.f34528d = fVar;
    }
}
