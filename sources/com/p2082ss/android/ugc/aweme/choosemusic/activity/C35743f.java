package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.AbstractC22233n;
import com.p2082ss.android.ugc.aweme.choosemusic.model.AbstractC35864a;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35917s;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f */
public final class C35743f {

    /* renamed from: a */
    private static final AbstractC89244h f84325a = C89250i.m154773a((AbstractC89171a) C35744a.f84326a);

    /* renamed from: a */
    public static final int m72934a() {
        return ((Number) f84325a.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f$a */
    static final class C35744a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C35744a f84326a = new C35744a();

        static {
            Covode.recordClassIndex(42979);
        }

        C35744a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0792v.m2735a());
        }
    }

    static {
        Covode.recordClassIndex(42978);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f$f */
    public static final class C35749f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveData f84333a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f84334b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22233n f84335c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f84336d;

        /* renamed from: e */
        final /* synthetic */ FrameLayout f84337e;

        /* renamed from: f */
        final /* synthetic */ LiveData f84338f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89183m f84339g;

        static {
            Covode.recordClassIndex(42984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35749f(LiveData liveData, ActivityC0945e eVar, AbstractC22233n nVar, ViewGroup viewGroup, FrameLayout frameLayout, LiveData liveData2, AbstractC89183m mVar) {
            super(0);
            this.f84333a = liveData;
            this.f84334b = eVar;
            this.f84335c = nVar;
            this.f84336d = viewGroup;
            this.f84337e = frameLayout;
            this.f84338f = liveData2;
            this.f84339g = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MethodCollector.m26663i(3182);
            this.f84333a.removeObservers(this.f84334b);
            this.f84335c.mo36341b();
            this.f84336d.removeView(this.f84337e);
            this.f84338f.removeObservers(this.f84334b);
            this.f84339g.invoke(0, null);
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(3182);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f$b */
    public static final class C35745b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f84327a;

        static {
            Covode.recordClassIndex(42980);
        }

        public C35745b(AbstractC89171a aVar) {
            this.f84327a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, AbstractC35864a.C35865a.f84655a)) {
                this.f84327a.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f$c */
    public static final class C35746c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f84328a;

        static {
            Covode.recordClassIndex(42981);
        }

        public C35746c(AbstractC89171a aVar) {
            this.f84328a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, AbstractC35864a.C35865a.f84655a)) {
                this.f84328a.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f$d */
    public static final class C35747d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f84329a;

        static {
            Covode.recordClassIndex(42982);
        }

        public C35747d(AbstractC89172b bVar) {
            this.f84329a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC89172b bVar = this.f84329a;
            C89219l.m154716b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f$e */
    public static final class C35748e extends AbstractC89220m implements AbstractC89172b<C35917s, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveData f84330a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f84331b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f84332c;

        static {
            Covode.recordClassIndex(42983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35748e(LiveData liveData, ActivityC0945e eVar, AbstractC89183m mVar) {
            super(1);
            this.f84330a = liveData;
            this.f84331b = eVar;
            this.f84332c = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C35917s sVar) {
            C35917s sVar2 = sVar;
            C89219l.m154721d(sVar2, "");
            if (sVar2.f84770a != Integer.MAX_VALUE) {
                this.f84330a.removeObservers(this.f84331b);
                this.f84332c.invoke(Integer.valueOf(sVar2.f84770a), sVar2.f84771b);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f$g */
    public static final class C35750g implements AbstractC22231l {

        /* renamed from: a */
        final /* synthetic */ C35727e f84340a;

        static {
            Covode.recordClassIndex(42985);
        }

        public C35750g(C35727e eVar) {
            this.f84340a = eVar;
        }

        @Override // com.bytedance.scene.AbstractC22231l
        public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            C89219l.m154721d(classLoader, "");
            C89219l.m154721d(str, "");
            if (TextUtils.equals("com.ss.android.ugc.aweme.choosemusic.activity.e", str)) {
                return this.f84340a;
            }
            return null;
        }
    }
}
