package com.p2082ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.helper.C41967a;
import com.p2082ss.android.ugc.aweme.discover.mob.helpers.C42458a;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41539m;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SuggestWordsViewModel;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.l */
public final class C42027l implements C41967a.AbstractC41969b {

    /* renamed from: a */
    public boolean f97982a;

    /* renamed from: b */
    final AbstractC89244h f97983b = C89250i.m154773a((AbstractC89171a) new C42037i(this));

    /* renamed from: c */
    public final C42033e f97984c;

    /* renamed from: d */
    public final LiveData<SuggestWordResponse> f97985d;

    /* renamed from: e */
    private final AbstractC89244h f97986e = C89250i.m154773a((AbstractC89171a) new C42035g(this));

    /* renamed from: f */
    private final AbstractC89244h f97987f = C89250i.m154773a((AbstractC89171a) new C42039k(this));

    /* renamed from: g */
    private final AbstractC89244h f97988g = C89250i.m154773a((AbstractC89171a) C42038j.f98005a);

    /* renamed from: h */
    private final AbstractC89244h f97989h = C89250i.m154773a((AbstractC89171a) new C42036h(this));

    /* renamed from: i */
    private final AbstractC89244h f97990i = C89250i.m154773a((AbstractC89171a) C42034f.f98001a);

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$a */
    public interface AbstractC42028a {
        static {
            Covode.recordClassIndex(49958);
        }

        /* renamed from: a */
        void mo71210a(int i);

        /* renamed from: a */
        void mo71211a(View view);

        /* renamed from: a */
        void mo71212a(Word word);

        /* renamed from: a */
        void mo71213a(String str, String str2);
    }

    static {
        Covode.recordClassIndex(49957);
    }

    /* renamed from: n */
    private final C41967a m84110n() {
        return (C41967a) this.f97990i.getValue();
    }

    /* renamed from: i */
    public final ActivityC0945e mo71205i() {
        return (ActivityC0945e) this.f97986e.getValue();
    }

    /* renamed from: j */
    public final SuggestWordsViewModel mo71206j() {
        return (SuggestWordsViewModel) this.f97987f.getValue();
    }

    /* renamed from: k */
    public final SuggestWordsApi.C41852a mo71207k() {
        return (SuggestWordsApi.C41852a) this.f97988g.getValue();
    }

    /* renamed from: l */
    public final AbstractC42029b mo71208l() {
        return (AbstractC42029b) this.f97989h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$b */
    public static abstract class AbstractC42029b {

        /* renamed from: a */
        private final AbstractC89244h f97991a = C89250i.m154773a((AbstractC89171a) C42030a.f97996a);

        /* renamed from: f */
        public boolean f97992f;

        /* renamed from: g */
        public boolean f97993g;

        /* renamed from: h */
        public boolean f97994h;

        /* renamed from: i */
        public final C42033e f97995i;

        static {
            Covode.recordClassIndex(49959);
        }

        /* renamed from: a */
        public abstract void mo71185a(C41855a<TypeWords> aVar);

        /* renamed from: a */
        public boolean mo71187a(String str) {
            C89219l.m154721d(str, "");
            return false;
        }

        /* renamed from: b */
        public void mo71188b() {
            this.f97992f = false;
        }

        /* renamed from: c */
        public void mo71190c() {
            this.f97992f = true;
        }

        /* renamed from: d */
        public void mo71192d() {
            this.f97992f = false;
        }

        /* renamed from: e */
        public void mo71193e() {
            this.f97992f = true;
        }

        /* renamed from: f */
        public void mo71194f() {
            this.f97992f = false;
        }

        /* renamed from: g */
        public Word mo71195g() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final C42458a mo71214h() {
            return (C42458a) this.f97991a.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$b$a */
        static final class C42030a extends AbstractC89220m implements AbstractC89171a<C42458a> {

            /* renamed from: a */
            public static final C42030a f97996a = new C42030a();

            static {
                Covode.recordClassIndex(49960);
            }

            C42030a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C42458a invoke() {
                return new C42458a();
            }
        }

        /* renamed from: a */
        public void mo71186a(boolean z) {
            this.f97992f = z;
        }

        /* renamed from: b */
        public void mo71189b(boolean z) {
            this.f97992f = z;
        }

        /* renamed from: c */
        public void mo71191c(boolean z) {
            this.f97992f = z;
        }

        public AbstractC42029b(C42033e eVar) {
            C89219l.m154721d(eVar, "");
            this.f97995i = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$f */
    static final class C42034f extends AbstractC89220m implements AbstractC89171a<C41967a> {

        /* renamed from: a */
        public static final C42034f f98001a = new C42034f();

        static {
            Covode.recordClassIndex(49964);
        }

        C42034f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41967a invoke() {
            return new C41967a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$g */
    static final class C42035g extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ C42027l f98002a;

        static {
            Covode.recordClassIndex(49965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42035g(C42027l lVar) {
            super(0);
            this.f98002a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            Context context = this.f98002a.f97984c.f97999a.getContext();
            if (!(context instanceof ActivityC0945e)) {
                return null;
            }
            return context;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: b */
    public final void mo71142b() {
        AbstractC42029b l = mo71208l();
        if (l != null) {
            l.f97992f = true;
            l.f97993g = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: c */
    public final void mo71143c() {
        AbstractC42029b l = mo71208l();
        if (l != null) {
            l.f97992f = false;
            l.f97993g = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: d */
    public final void mo71144d() {
        AbstractC42029b l = mo71208l();
        if (l != null) {
            l.mo71188b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: e */
    public final void mo71145e() {
        AbstractC42029b l = mo71208l();
        if (l != null) {
            l.mo71192d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: f */
    public final void mo71146f() {
        AbstractC42029b l = mo71208l();
        if (l != null) {
            l.mo71190c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: g */
    public final void mo71147g() {
        AbstractC42029b l = mo71208l();
        if (l != null) {
            l.mo71193e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: h */
    public final void mo71148h() {
        AbstractC42029b l = mo71208l();
        if (l != null) {
            l.mo71194f();
        }
    }

    /* renamed from: m */
    public final Word mo71209m() {
        AbstractC42029b l = mo71208l();
        if (l != null) {
            return l.mo71195g();
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$h */
    static final class C42036h extends AbstractC89220m implements AbstractC89171a<C42006e> {

        /* renamed from: a */
        final /* synthetic */ C42027l f98003a;

        static {
            Covode.recordClassIndex(49966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42036h(C42027l lVar) {
            super(0);
            this.f98003a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42006e invoke() {
            if (C41539m.m83476b() != 5) {
                return null;
            }
            return new C42006e(this.f98003a.f97984c, (SearchIntermediateViewModel) this.f98003a.f97983b.getValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$i */
    static final class C42037i extends AbstractC89220m implements AbstractC89171a<SearchIntermediateViewModel> {

        /* renamed from: a */
        final /* synthetic */ C42027l f98004a;

        static {
            Covode.recordClassIndex(49967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42037i(C42027l lVar) {
            super(0);
            this.f98004a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchIntermediateViewModel invoke() {
            if (this.f98004a.mo71205i() == null) {
                return null;
            }
            ActivityC0945e i = this.f98004a.mo71205i();
            if (i == null) {
                C89219l.m154715b();
            }
            return C1181ae.m3881a(i, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$j */
    static final class C42038j extends AbstractC89220m implements AbstractC89171a<SuggestWordsApi.C41852a> {

        /* renamed from: a */
        public static final C42038j f98005a = new C42038j();

        static {
            Covode.recordClassIndex(49968);
        }

        C42038j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SuggestWordsApi.C41852a invoke() {
            String str;
            SuggestWordsApi.C41852a aVar = new SuggestWordsApi.C41852a();
            aVar.f97638a = "100010";
            aVar.f97639b = "general";
            if (C13627m.m24499a(C17867d.f42595s, "local_test")) {
                str = "1";
            } else {
                str = "0";
            }
            aVar.f97640c = str;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$k */
    static final class C42039k extends AbstractC89220m implements AbstractC89171a<SuggestWordsViewModel> {

        /* renamed from: a */
        final /* synthetic */ C42027l f98006a;

        static {
            Covode.recordClassIndex(49969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42039k(C42027l lVar) {
            super(0);
            this.f98006a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SuggestWordsViewModel invoke() {
            ActivityC0945e i = this.f98006a.mo71205i();
            if (i != null) {
                return C1181ae.m3881a(i, (C1175ad.AbstractC1177b) null).mo3983a(SuggestWordsViewModel.class);
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C41967a.AbstractC41969b
    /* renamed from: a */
    public final void mo71141a() {
        SuggestWordsViewModel j;
        if (this.f97982a && !C67446h.f151111a.mo106228q() && (j = mo71206j()) != null) {
            j.mo73196a(mo71207k());
        }
        AbstractC42029b l = mo71208l();
        if (l != null) {
            l.f97992f = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$c */
    final class C42031c implements AbstractC1214u<C41855a<TypeWords>> {
        static {
            Covode.recordClassIndex(49961);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C42031c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C41855a<TypeWords> aVar) {
            C41855a<TypeWords> aVar2 = aVar;
            AbstractC42029b l = C42027l.this.mo71208l();
            if (l != null) {
                l.mo71185a(aVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$d */
    final class C42032d implements AbstractC1214u<SuggestWordResponse> {
        static {
            Covode.recordClassIndex(49962);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C42032d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(SuggestWordResponse suggestWordResponse) {
            List<Word> list;
            Integer valueOf;
            SuggestWordResponse suggestWordResponse2 = suggestWordResponse;
            C89219l.m154721d(suggestWordResponse2, "");
            List<TypeWords> list2 = suggestWordResponse2.data;
            C41855a<TypeWords> aVar = null;
            if (list2 != null) {
                C41855a<TypeWords> aVar2 = null;
                for (T t : list2) {
                    if (C89219l.m154714a((Object) t.type, (Object) "inbox")) {
                        List<Word> list3 = t.words;
                        if (list3 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (T t2 : list3) {
                                T t3 = t2;
                                if (!TextUtils.isEmpty(t3.getWord()) && !TextUtils.isEmpty(t3.getShowWord())) {
                                    arrayList.add(t2);
                                }
                            }
                            list = C89070n.m154585g((Collection) arrayList);
                            if (!(list == null || (valueOf = Integer.valueOf(list.size())) == null || valueOf.intValue() <= 5)) {
                                int i = 4;
                                do {
                                    list.remove(i);
                                    i--;
                                } while (i > 0);
                            }
                        } else {
                            list = null;
                        }
                        TypeWords typeWords = new TypeWords();
                        typeWords.logId = suggestWordResponse2.logId;
                        typeWords.words = list;
                        aVar2 = new C41855a<>(typeWords);
                    } else {
                        aVar2 = new C41855a<>(new TypeWords());
                    }
                }
                aVar = aVar2;
            }
            AbstractC42029b l = C42027l.this.mo71208l();
            if (l != null) {
                l.mo71185a(aVar);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo71204a(String str) {
        C89219l.m154721d(str, "");
        AbstractC42029b l = mo71208l();
        if (l != null) {
            return l.mo71187a(str);
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.l$e */
    public static final class C42033e {

        /* renamed from: a */
        public final View f97999a;

        /* renamed from: b */
        public final AbstractC42028a f98000b;

        static {
            Covode.recordClassIndex(49963);
        }

        public C42033e(View view, AbstractC42028a aVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(aVar, "");
            this.f97999a = view;
            this.f98000b = aVar;
        }
    }

    public C42027l(C42033e eVar, LiveData<SuggestWordResponse> liveData) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(liveData, "");
        this.f97984c = eVar;
        this.f97985d = liveData;
        ActivityC0945e i = mo71205i();
        if (i != null) {
            m84110n().mo71140a(new WeakReference<>(i));
            m84110n().mo71139a(this);
            AbstractC42029b l = mo71208l();
            if (l != null) {
                l.f97992f = true;
            }
            if (C67446h.f151111a.mo106228q()) {
                liveData.observe(i, new C42032d());
                return;
            }
            SuggestWordsViewModel j = mo71206j();
            if (j != null) {
                j.mo73195a().observe(i, new C42031c());
                j.mo73196a(mo71207k());
            }
        }
    }
}
