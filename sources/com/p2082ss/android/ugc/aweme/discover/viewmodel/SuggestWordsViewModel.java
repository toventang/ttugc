package com.p2082ss.android.ugc.aweme.discover.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.utils.C80305cn;
import com.p2082ss.android.ugc.aweme.utils.C80439fn;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestWordsViewModel */
public final class SuggestWordsViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final AbstractC89244h f100265a = C89250i.m154773a((AbstractC89171a) C43012c.f100269a);

    /* renamed from: b */
    private AbstractC88412b f100266b;

    static {
        Covode.recordClassIndex(51149);
    }

    /* renamed from: a */
    public final C1213t<C41855a<TypeWords>> mo73195a() {
        return (C1213t) this.f100265a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestWordsViewModel$c */
    static final class C43012c extends AbstractC89220m implements AbstractC89171a<C1213t<C41855a<TypeWords>>> {

        /* renamed from: a */
        public static final C43012c f100269a = new C43012c();

        static {
            Covode.recordClassIndex(51152);
        }

        C43012c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C41855a<TypeWords>> invoke() {
            return new C1213t();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        m85838b();
    }

    /* renamed from: b */
    private final void m85838b() {
        AbstractC88412b bVar = this.f100266b;
        if (bVar != null) {
            if (!bVar.isDisposed()) {
                bVar.dispose();
            }
            this.f100266b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestWordsViewModel$b */
    public static final class C43011b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SuggestWordsViewModel f100268a;

        static {
            Covode.recordClassIndex(51151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43011b(SuggestWordsViewModel suggestWordsViewModel) {
            super(1);
            this.f100268a = suggestWordsViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f100268a.mo73195a().setValue(new C41855a<>(th2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo73196a(SuggestWordsApi.C41852a aVar) {
        C89219l.m154721d(aVar, "");
        m85838b();
        AbstractC88979t a = C80439fn.m139449a(SuggestWordsApi.m83835c(aVar));
        C80305cn cnVar = new C80305cn(new C43010a(this), null, new C43011b(this), 2);
        this.f100266b = cnVar;
        a.mo143062b((AbstractC88986z) cnVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestWordsViewModel$a */
    public static final class C43010a extends AbstractC89220m implements AbstractC89172b<SuggestWordResponse, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SuggestWordsViewModel f100267a;

        static {
            Covode.recordClassIndex(51150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43010a(SuggestWordsViewModel suggestWordsViewModel) {
            super(1);
            this.f100267a = suggestWordsViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(SuggestWordResponse suggestWordResponse) {
            ArrayList arrayList;
            SuggestWordResponse suggestWordResponse2 = suggestWordResponse;
            C89219l.m154721d(suggestWordResponse2, "");
            List<TypeWords> list = suggestWordResponse2.data;
            if (list != null) {
                for (T t : list) {
                    if (C89219l.m154714a((Object) t.type, (Object) "inbox")) {
                        List<Word> list2 = t.words;
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t2 : list2) {
                                T t3 = t2;
                                if (!TextUtils.isEmpty(t3.getWord()) && !TextUtils.isEmpty(t3.getShowWord())) {
                                    arrayList2.add(t2);
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        C1213t<C41855a<TypeWords>> a = this.f100267a.mo73195a();
                        t.logId = suggestWordResponse2.logId;
                        t.words = arrayList;
                        a.setValue(new C41855a<>((TypeWords) t));
                    } else {
                        this.f100267a.mo73195a().setValue(new C41855a<>(new TypeWords()));
                    }
                }
            }
            return C89391z.f203057a;
        }
    }
}
