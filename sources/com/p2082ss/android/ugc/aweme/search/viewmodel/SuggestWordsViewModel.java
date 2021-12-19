package com.p2082ss.android.ugc.aweme.search.viewmodel;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingData;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41502aj;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41504al;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67562n;
import java.util.ArrayList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel */
public final class SuggestWordsViewModel extends AbstractC1174ac {

    /* renamed from: e */
    public static final String f151959e = "key_raw_guess_words";

    /* renamed from: f */
    public static final String f151960f = "SuggestWordsViewModel";

    /* renamed from: g */
    public static final String f151961g = "key_middle_guess_list";

    /* renamed from: h */
    public static final C67805a f151962h = new C67805a((byte) 0);

    /* renamed from: a */
    public final C33943c<C41855a<List<TypeWords>>> f151963a = new C33943c<>();

    /* renamed from: b */
    public final C33943c<Word> f151964b = new C33943c<>();

    /* renamed from: c */
    public final C33943c<C41855a<String>> f151965c = new C33943c<>();

    /* renamed from: d */
    public final C33943c<C41855a<TrendingData>> f151966d = new C33943c<>();

    /* renamed from: com.ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel$a */
    public static final class C67805a {
        static {
            Covode.recordClassIndex(79462);
        }

        private C67805a() {
        }

        public /* synthetic */ C67805a(byte b) {
            this();
        }

        /* renamed from: a */
        public static SuggestWordsViewModel m119992a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SuggestWordsViewModel.class);
            C89219l.m154716b(a, "");
            return (SuggestWordsViewModel) a;
        }
    }

    /* renamed from: a */
    public final void mo106904a() {
        SuggestWordsApi.m83833b().mo5534a(new C67808d(this), C1731i.f5564c, null);
    }

    static {
        Covode.recordClassIndex(79461);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel$d */
    public static final class C67808d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SuggestWordsViewModel f151969a;

        static {
            Covode.recordClassIndex(79465);
        }

        C67808d(SuggestWordsViewModel suggestWordsViewModel) {
            this.f151969a = suggestWordsViewModel;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5535a()) {
                ArrayList<C67590l> arrayList = ((TrendingData) iVar.mo5545d()).billboardInfo;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f151969a.f151966d.setValue(new C41855a<>((TrendingData) iVar.mo5545d()));
                }
            } else if (iVar.mo5544c()) {
                this.f151969a.f151966d.setValue(new C41855a<>(iVar.mo5546e()));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel$b */
    public static final class C67806b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SuggestWordsViewModel f151967a;

        static {
            Covode.recordClassIndex(79463);
        }

        public C67806b(SuggestWordsViewModel suggestWordsViewModel) {
            this.f151967a = suggestWordsViewModel;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            List<TypeWords> list;
            Object obj;
            Word word;
            C89219l.m154716b(iVar, "");
            if (iVar.mo5535a()) {
                SuggestWordResponse suggestWordResponse = (SuggestWordResponse) iVar.mo5545d();
                ArrayList arrayList = new ArrayList();
                if (!(suggestWordResponse == null || (list = suggestWordResponse.data) == null)) {
                    for (T t : list) {
                        String str = suggestWordResponse.logId;
                        if (str == null) {
                            str = "";
                        }
                        t.setImprId(str);
                        List<Word> list2 = t.words;
                        if (list2 != null && (!list2.isEmpty()) && C41504al.f96824a) {
                            List<Word> list3 = t.words;
                            if (!(list3 == null || (word = (Word) C89070n.m154583g((List) list3)) == null)) {
                                String str2 = suggestWordResponse.logId;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                word.setImplId(str2);
                            }
                            C1213t tVar = this.f151967a.f151964b;
                            List<Word> list4 = t.words;
                            if (list4 == null || (obj = C89070n.m154583g((List) list4)) == null) {
                                obj = new Word();
                            }
                            tVar.setValue(obj);
                        }
                        List<Word> list5 = t.words;
                        if (list5 == null || !(!list5.isEmpty()) || !C41504al.f96824a) {
                            List<VisitedAccount> list6 = t.visitedAccount;
                            if (list6 != null && (!list6.isEmpty()) && C41502aj.f96820a) {
                                arrayList.add(t);
                            }
                        } else {
                            arrayList.add(t);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f151967a.f151963a.setValue(new C41855a<>(arrayList));
                    C67562n.C67563a.m119642a(1);
                    C67562n.C67563a.m119643a("native");
                } else {
                    this.f151967a.f151963a.setValue(new C41855a<>(iVar.mo5546e()));
                }
            } else if (iVar.mo5544c()) {
                this.f151967a.f151963a.setValue(new C41855a<>(iVar.mo5546e()));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.viewmodel.SuggestWordsViewModel$c */
    public static final class C67807c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SuggestWordsViewModel f151968a;

        static {
            Covode.recordClassIndex(79464);
        }

        public C67807c(SuggestWordsViewModel suggestWordsViewModel) {
            this.f151968a = suggestWordsViewModel;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            TypeWords typeWords;
            Word word;
            Word word2;
            List<TypeWords> list;
            String str = "";
            C89219l.m154716b(iVar, str);
            if (iVar.mo5535a()) {
                String str2 = (String) iVar.mo5545d();
                if (!TextUtils.isEmpty(str2)) {
                    this.f151968a.f151965c.setValue(new C41855a<>(str2));
                    try {
                        SuggestWordResponse suggestWordResponse = (SuggestWordResponse) new C27910f().mo46670a(str2, SuggestWordResponse.class);
                        List<Word> list2 = null;
                        if (suggestWordResponse == null || (list = suggestWordResponse.data) == null) {
                            typeWords = null;
                        } else {
                            typeWords = (TypeWords) C89070n.m154583g((List) list);
                        }
                        if (typeWords != null) {
                            list2 = typeWords.words;
                        }
                        if (list2 != null) {
                            List<Word> list3 = typeWords.words;
                            if (list3 == null) {
                                C89219l.m154715b();
                            }
                            if (!list3.isEmpty()) {
                                List<Word> list4 = typeWords.words;
                                if (!(list4 == null || (word2 = (Word) C89070n.m154583g((List) list4)) == null)) {
                                    String str3 = suggestWordResponse.logId;
                                    if (str3 != null) {
                                        str = str3;
                                    }
                                    word2.setImplId(str);
                                }
                                C33943c<Word> cVar = this.f151968a.f151964b;
                                List<Word> list5 = typeWords.words;
                                if (list5 == null || (word = (Word) C89070n.m154583g((List) list5)) == null) {
                                    word = new Word();
                                }
                                cVar.setValue(word);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    this.f151968a.f151965c.setValue(new C41855a<>(iVar.mo5546e()));
                }
            } else if (iVar.mo5544c()) {
                this.f151968a.f151965c.setValue(new C41855a<>(iVar.mo5546e()));
            }
            return C89391z.f203057a;
        }
    }
}
