package com.p2082ss.android.ugc.aweme.choosemusic.model;

import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.choosemusic.model.AbstractC35864a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel */
public final class ChooseMusicWithSceneViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public boolean f84642a;

    /* renamed from: b */
    public boolean f84643b;

    /* renamed from: c */
    public ViewPagerBottomSheetBehavior<View> f84644c;

    /* renamed from: d */
    public String f84645d;

    /* renamed from: e */
    public String f84646e;

    /* renamed from: f */
    private final AbstractC89244h f84647f = C89250i.m154773a((AbstractC89171a) C35861b.f84652a);

    /* renamed from: g */
    private final AbstractC89244h f84648g = C89250i.m154773a((AbstractC89171a) C35860a.f84651a);

    /* renamed from: h */
    private final AbstractC89244h f84649h = C89250i.m154773a((AbstractC89171a) C35862c.f84653a);

    /* renamed from: i */
    private final AbstractC89244h f84650i = C89250i.m154773a((AbstractC89171a) C35863d.f84654a);

    static {
        Covode.recordClassIndex(43099);
    }

    /* renamed from: a */
    public final C1213t<C35919t> mo62967a() {
        return (C1213t) this.f84647f.getValue();
    }

    /* renamed from: b */
    public final C1213t<C35917s> mo62970b() {
        return (C1213t) this.f84648g.getValue();
    }

    /* renamed from: c */
    public final C1213t<AbstractC35864a> mo62971c() {
        return (C1213t) this.f84649h.getValue();
    }

    /* renamed from: d */
    public final C1213t<AbstractC35864a> mo62972d() {
        return (C1213t) this.f84650i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel$b */
    static final class C35861b extends AbstractC89220m implements AbstractC89171a<C1213t<C35919t>> {

        /* renamed from: a */
        public static final C35861b f84652a = new C35861b();

        static {
            Covode.recordClassIndex(43101);
        }

        C35861b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C35919t> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel$a */
    static final class C35860a extends AbstractC89220m implements AbstractC89171a<C1213t<C35917s>> {

        /* renamed from: a */
        public static final C35860a f84651a = new C35860a();

        static {
            Covode.recordClassIndex(43100);
        }

        C35860a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C35917s> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(new C35917s());
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel$c */
    static final class C35862c extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC35864a>> {

        /* renamed from: a */
        public static final C35862c f84653a = new C35862c();

        static {
            Covode.recordClassIndex(43102);
        }

        C35862c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC35864a> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(AbstractC35864a.C35867c.f84657a);
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel$d */
    static final class C35863d extends AbstractC89220m implements AbstractC89171a<C1213t<AbstractC35864a>> {

        /* renamed from: a */
        public static final C35863d f84654a = new C35863d();

        static {
            Covode.recordClassIndex(43103);
        }

        C35863d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<AbstractC35864a> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(AbstractC35864a.C35867c.f84657a);
            return tVar;
        }
    }

    /* renamed from: a */
    public final void mo62968a(AbstractC35864a aVar) {
        C89219l.m154721d(aVar, "");
        mo62971c().setValue(aVar);
    }

    /* renamed from: a */
    public final void mo62969a(C35917s sVar) {
        C89219l.m154721d(sVar, "");
        mo62970b().setValue(sVar);
    }
}
