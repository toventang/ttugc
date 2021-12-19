package com.p2082ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.C67680f;
import com.p2082ss.android.ugc.aweme.utils.C80372ec;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel */
public final class SearchIntermediateViewModel extends AbstractC1174ac {
    public static final Companion Companion = new Companion(null);
    public boolean backFromSearchResult;
    private final AbstractC89244h dismissKeyboard$delegate = C80372ec.m139350a(SearchIntermediateViewModel$dismissKeyboard$2.INSTANCE);
    private final AbstractC89244h dismissKeyboardOnActionDown$delegate = C80372ec.m139350a(SearchIntermediateViewModel$dismissKeyboardOnActionDown$2.INSTANCE);
    private final AbstractC89244h enableSearchFilter$delegate = C80372ec.m139350a(SearchIntermediateViewModel$enableSearchFilter$2.INSTANCE);
    public boolean enterSearchMiddlePageByBack;
    private final AbstractC89244h firstGuessWord$delegate = C80372ec.m139350a(SearchIntermediateViewModel$firstGuessWord$2.INSTANCE);
    public AbstractC89171a<String> getIntermediateContainer = SearchIntermediateViewModel$getIntermediateContainer$1.INSTANCE;
    private final AbstractC89244h intermediateState$delegate = C80372ec.m139350a(SearchIntermediateViewModel$intermediateState$2.INSTANCE);
    public AbstractC57066a.AbstractC57067a keywordPresenter;
    private final AbstractC89244h openSearchParam$delegate = C80372ec.m139350a(SearchIntermediateViewModel$openSearchParam$2.INSTANCE);
    private final AbstractC89244h searchTabIndex$delegate = C80372ec.m139350a(SearchIntermediateViewModel$searchTabIndex$2.INSTANCE);
    private final AbstractC89244h showSearchFilterDot$delegate = C80372ec.m139350a(SearchIntermediateViewModel$showSearchFilterDot$2.INSTANCE);
    public AbstractC57066a.AbstractC57069c sugKeywordPresenter;
    private final AbstractC89244h sugRequestKeyword$delegate = C80372ec.m139350a(SearchIntermediateViewModel$sugRequestKeyword$2.INSTANCE);
    public C67680f timeParam;

    static {
        Covode.recordClassIndex(50487);
    }

    public final C33943c<Boolean> getDismissKeyboard() {
        return (C33943c) this.dismissKeyboard$delegate.getValue();
    }

    public final C33943c<Boolean> getDismissKeyboardOnActionDown() {
        return (C33943c) this.dismissKeyboardOnActionDown$delegate.getValue();
    }

    public final C33943c<Boolean> getEnableSearchFilter() {
        return (C33943c) this.enableSearchFilter$delegate.getValue();
    }

    public final C33943c<Word> getFirstGuessWord() {
        return (C33943c) this.firstGuessWord$delegate.getValue();
    }

    public final C33943c<Integer> getIntermediateState() {
        return (C33943c) this.intermediateState$delegate.getValue();
    }

    public final C33943c<C67678d> getOpenSearchParam() {
        return (C33943c) this.openSearchParam$delegate.getValue();
    }

    public final C33943c<Integer> getSearchTabIndex() {
        return (C33943c) this.searchTabIndex$delegate.getValue();
    }

    public final C33943c<Boolean> getShowSearchFilterDot() {
        return (C33943c) this.showSearchFilterDot$delegate.getValue();
    }

    public final C33943c<String> getSugRequestKeyword() {
        return (C33943c) this.sugRequestKeyword$delegate.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(50488);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    private final String getSugKeyword() {
        String a;
        AbstractC57066a.AbstractC57069c cVar = this.sugKeywordPresenter;
        if (cVar == null || (a = cVar.mo94223a()) == null) {
            return "";
        }
        return a;
    }

    public final void hideIntermediate() {
        getIntermediateState().setValue(0);
    }

    private final String getKeyword() {
        C57071b a;
        String str;
        AbstractC57066a.AbstractC57067a aVar = this.keywordPresenter;
        if (aVar == null || (a = aVar.mo94218a()) == null || (str = a.f129938a) == null) {
            return "";
        }
        return str;
    }

    public final boolean canDismissKeyboardOnActionDown() {
        Boolean value = getDismissKeyboardOnActionDown().getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return true;
    }

    private final void setSugKeyword(String str) {
        AbstractC57066a.AbstractC57069c cVar = this.sugKeywordPresenter;
        if (cVar != null) {
            cVar.mo94224a(str);
        }
    }

    public final void setGetIntermediateContainer(AbstractC89171a<String> aVar) {
        C89219l.m154721d(aVar, "");
        this.getIntermediateContainer = aVar;
    }

    private final void setKeyword(String str) {
        AbstractC57066a.AbstractC57067a aVar = this.keywordPresenter;
        if (aVar != null) {
            aVar.mo94219a(new C57071b(str, null, 2));
        }
    }

    public final void openSearchSquare(boolean z) {
        this.backFromSearchResult = z;
        getIntermediateState().setValue(1);
    }

    public final void reFetchTheSearchData(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        C67446h.f151111a.mo106210b(dVar);
    }

    public final void openSearch(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        if (!TextUtils.isEmpty(dVar.getKeyword())) {
            reFetchTheSearchData(dVar);
            getOpenSearchParam().setValue(dVar);
            hideIntermediate();
        }
    }

    public final void openSearchSug(String str) {
        C89219l.m154721d(str, "");
        Integer value = getIntermediateState().getValue();
        if (value == null || value.intValue() != 2 || !TextUtils.equals(str, getSugKeyword())) {
            setSugKeyword(str);
            getIntermediateState().setValue(2);
        }
    }

    public final void handleSuggestWordItemClick(Word word, int i) {
        if (word != null) {
            C67678d wordType = new C67678d().setSearchFrom("recom_search").setKeyword(word.getWord()).setWordType(word.getWordType());
            C89219l.m154716b(wordType, "");
            openSearch(wordType);
        }
    }
}
