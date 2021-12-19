package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.AbstractC54184a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54186b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54187c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54190f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54191g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import okhttp3.C90200t;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88826p;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88939d;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel */
public final class GiphyViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<Boolean> f124073a;

    /* renamed from: b */
    public final C1213t<Integer> f124074b;

    /* renamed from: c */
    public final C1213t<Boolean> f124075c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<Throwable> f124076d = new C1213t<>();

    /* renamed from: e */
    public final C1213t<List<C54186b>> f124077e;

    /* renamed from: f */
    public final C1213t<C89391z> f124078f;

    /* renamed from: g */
    public AbstractC88412b f124079g;

    /* renamed from: h */
    Long f124080h;

    /* renamed from: i */
    final GiphyAnalytics f124081i;

    /* renamed from: j */
    public final AbstractC54147a f124082j;

    /* renamed from: k */
    final AbstractC88398aa f124083k;

    /* renamed from: l */
    private AbstractC88403ab<C54187c> f124084l;

    /* renamed from: m */
    private final AbstractC54184a f124085m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$a */
    public interface AbstractC54147a {
        static {
            Covode.recordClassIndex(63829);
        }

        /* renamed from: a */
        long mo91264a();

        /* renamed from: a */
        void mo91265a(long j);

        /* renamed from: a */
        void mo91266a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$f */
    final /* synthetic */ class C54152f implements AbstractC88434g {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f124089a;

        static {
            Covode.recordClassIndex(63834);
        }

        C54152f(AbstractC89172b bVar) {
            this.f124089a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            return this.f124089a.invoke(obj);
        }
    }

    static {
        Covode.recordClassIndex(63828);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        AbstractC88412b bVar = this.f124079g;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$i */
    static final class C54155i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ GiphyViewModel f124092a;

        static {
            Covode.recordClassIndex(63837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54155i(GiphyViewModel giphyViewModel) {
            super(0);
            this.f124092a = giphyViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f124092a.f124082j.mo91266a(true);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$c */
    public static final class C54149c implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ GiphyViewModel f124087a;

        static {
            Covode.recordClassIndex(63831);
        }

        C54149c(GiphyViewModel giphyViewModel) {
            this.f124087a = giphyViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            if (C89219l.m154714a((Object) this.f124087a.f124073a.getValue(), (Object) true)) {
                this.f124087a.f124073a.postValue(false);
            }
        }
    }

    /* renamed from: a */
    private final void m99406a() {
        AbstractC88412b bVar = this.f124079g;
        if (bVar == null || bVar.isDisposed()) {
            AbstractC88403ab<C54187c> a = this.f124084l.mo142918b(this.f124083k).mo142913a(new C54148b(this)).mo142911a(new C54149c(this));
            C89219l.m154716b(a, "");
            this.f124079g = C88939d.m154198a(a, new C54151e(this.f124076d), new C54150d(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$e */
    public static final /* synthetic */ class C54151e extends C89217j implements AbstractC89172b<Throwable, C89391z> {
        static {
            Covode.recordClassIndex(63833);
        }

        C54151e(C1213t tVar) {
            super(1, tVar, C1213t.class, "postValue", "postValue(Ljava/lang/Object;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            ((LiveData) this.receiver).postValue(th);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$h */
    static final /* synthetic */ class C54154h extends C89217j implements AbstractC89172b<String, AbstractC88410b> {
        static {
            Covode.recordClassIndex(63836);
        }

        C54154h(GiphyAnalytics giphyAnalytics) {
            super(1, giphyAnalytics, GiphyAnalytics.class, "track", "track(Ljava/lang/String;)Lio/reactivex/Completable;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88410b invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return ((GiphyAnalytics) this.receiver).track(str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$j */
    static final class C54156j extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GiphyViewModel f124093a;

        static {
            Covode.recordClassIndex(63838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54156j(GiphyViewModel giphyViewModel) {
            super(1);
            this.f124093a = giphyViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f124093a.f124082j.mo91266a(false);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$b */
    public static final class C54148b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ GiphyViewModel f124086a;

        static {
            Covode.recordClassIndex(63830);
        }

        C54148b(GiphyViewModel giphyViewModel) {
            this.f124086a = giphyViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<C54186b> value = this.f124086a.f124077e.getValue();
            if (value == null || value.isEmpty()) {
                this.f124086a.f124073a.postValue(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$g */
    static final class C54153g<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ GiphyViewModel f124090a;

        /* renamed from: b */
        final /* synthetic */ String f124091b;

        static {
            Covode.recordClassIndex(63835);
        }

        C54153g(GiphyViewModel giphyViewModel, String str) {
            this.f124090a = giphyViewModel;
            this.f124091b = str;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<String> oVar) {
            C89219l.m154721d(oVar, "");
            C90200t f = C90200t.m156802f(this.f124091b);
            if (f == null) {
                oVar.mo143050a(new IllegalArgumentException("Expecting valid url"));
                return;
            }
            C89219l.m154716b(f, "");
            String tVar = f.mo145060j().mo145064a("ts", String.valueOf(this.f124090a.f124082j.mo91264a())).mo145068b().toString();
            C89219l.m154716b(tVar, "");
            oVar.mo143049a(tVar);
        }
    }

    /* renamed from: b */
    private final void m99407b(boolean z) {
        if (z) {
            AbstractC88412b bVar = this.f124079g;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f124074b.postValue(0);
            this.f124075c.postValue(true);
            this.f124077e.postValue(C89086z.INSTANCE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel$d */
    public static final class C54150d extends AbstractC89220m implements AbstractC89172b<C54187c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ GiphyViewModel f124088a;

        static {
            Covode.recordClassIndex(63832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54150d(GiphyViewModel giphyViewModel) {
            super(1);
            this.f124088a = giphyViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C54187c cVar) {
            int i;
            C54191g gVar = cVar.f124154c;
            if (gVar != null) {
                List<C54186b> value = this.f124088a.f124077e.getValue();
                if (value == null) {
                    value = C89086z.INSTANCE;
                }
                Iterable iterable = gVar.f124159a;
                if (iterable == null) {
                    iterable = C89086z.INSTANCE;
                }
                List d = C89070n.m154572d((Collection) value, iterable);
                C1213t<List<C54186b>> tVar = this.f124088a.f124077e;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : d) {
                    if (hashSet.add(((C54186b) obj).f124148b)) {
                        arrayList.add(obj);
                    }
                }
                tVar.postValue(arrayList);
                C1213t<Integer> tVar2 = this.f124088a.f124074b;
                C54190f fVar = gVar.f124160b;
                boolean z = false;
                if (fVar != null) {
                    i = fVar.f124158b;
                } else {
                    i = 0;
                }
                tVar2.postValue(Integer.valueOf(i));
                C1213t<Boolean> tVar3 = this.f124088a.f124075c;
                C54190f fVar2 = gVar.f124160b;
                if (fVar2 != null) {
                    z = fVar2.f124157a;
                }
                tVar3.postValue(Boolean.valueOf(z));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo91263a(boolean z) {
        m99407b(z);
        Integer value = this.f124074b.getValue();
        if (value != null && !C89219l.m154714a((Object) this.f124075c.getValue(), (Object) false)) {
            C89219l.m154716b(value, "");
            this.f124084l = this.f124085m.mo91276a(value.intValue());
            m99406a();
        }
    }

    public GiphyViewModel(AbstractC54184a aVar, GiphyAnalytics giphyAnalytics, AbstractC54147a aVar2, AbstractC88398aa aaVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(giphyAnalytics, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aaVar, "");
        this.f124085m = aVar;
        this.f124081i = giphyAnalytics;
        this.f124082j = aVar2;
        this.f124083k = aaVar;
        C1213t<Boolean> tVar = new C1213t<>();
        this.f124073a = tVar;
        C1213t<Integer> tVar2 = new C1213t<>();
        this.f124074b = tVar2;
        C1213t<List<C54186b>> tVar3 = new C1213t<>();
        this.f124077e = tVar3;
        this.f124078f = new C1213t<>();
        AbstractC88403ab<C54187c> a = C88925a.m154163a(C88826p.f201701a);
        C89219l.m154716b(a, "");
        this.f124084l = a;
        tVar.setValue(false);
        tVar2.setValue(0);
        tVar3.setValue(C89086z.INSTANCE);
    }
}
