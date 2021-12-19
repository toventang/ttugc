package com.p2082ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34598e;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41933l;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchHistoryManager */
public class SearchHistoryManager implements IAccountService.AbstractC31272b, ISearchHistoryManager {
    private static int MAX_VISIBLE_HISTORY_COUNT = 20;
    private static String UN_LOGIN_USER_ID = "FAKE_USER";
    private static SearchHistoryManager sManager;
    private IAccountService accountService;
    private List<Pair<String, List<SearchHistory>>> allLocalHistory;
    private List<SearchHistory> currentUserLocalHistory;
    private C27910f gson = new C27910f();
    private int mMaxCacheNumber = 20;
    private int mMaxUserCacheNumber = 10;

    /* renamed from: com_ss_android_ugc_aweme_discover_model_SearchHistoryManager_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m84891x687f9cb(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void clearForAccountChange() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void clearSearchHistory(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public String getKey() {
        return "recent_history_v2";
    }

    /* access modifiers changed from: protected */
    public String getOldKey() {
        return "recent_history";
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void saveSearchHistory() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public List<SearchHistory> getSearchHistory() {
        return this.currentUserLocalHistory;
    }

    static {
        Covode.recordClassIndex(50484);
    }

    private String getNewSearchHistory() {
        return C34597d.m70637d().mo61051a(getKey(), "");
    }

    private List<SearchHistory> getOldSearchHistory() {
        return C34597d.m70637d().mo61052a(getOldKey(), SearchHistory.class);
    }

    private void onSearchHistoryChanged() {
        AbstractC81915c.m141875b(new C41933l());
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void clearSearchHistory() {
        this.currentUserLocalHistory.clear();
        updateSearchHistoryInSp();
        onSearchHistoryChanged();
    }

    private void deleteOldSearchHistory() {
        C34598e d = C34597d.m70637d();
        d.mo61050a().remove(getOldKey()).apply();
    }

    private String getCurrentUserId() {
        IAccountUserService e = this.accountService.mo57069e();
        if (e.isLogin()) {
            return e.getCurUserId();
        }
        return UN_LOGIN_USER_ID;
    }

    private void removeFakeUserHistory() {
        Iterator<Pair<String, List<SearchHistory>>> it = this.allLocalHistory.iterator();
        while (it.hasNext()) {
            Pair<String, List<SearchHistory>> next = it.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, UN_LOGIN_USER_ID)) {
                it.remove();
            }
        }
    }

    private void updateSearchHistoryInSp() {
        try {
            String b = this.gson.mo46675b(this.allLocalHistory, new C27895a<List<Pair<String, List<MusicSearchHistory>>>>() {
                /* class com.p2082ss.android.ugc.aweme.discover.model.SearchHistoryManager.C424711 */

                static {
                    Covode.recordClassIndex(50485);
                }
            }.type);
            m84891x687f9cb("yvette", "updateSearchHistoryInSp store ".concat(String.valueOf(b)));
            updateSearchHistory(b);
        } catch (Exception unused) {
        }
    }

    private void ensureCurrentUserLocalHistory() {
        String currentUserId = getCurrentUserId();
        Iterator<Pair<String, List<SearchHistory>>> it = this.allLocalHistory.iterator();
        this.currentUserLocalHistory = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<SearchHistory>> next = it.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, currentUserId)) {
                this.currentUserLocalHistory.addAll((Collection) next.second);
                it.remove();
            }
        }
        this.allLocalHistory.add(0, new Pair<>(currentUserId, this.currentUserLocalHistory));
        if (this.mMaxUserCacheNumber > 0 && this.allLocalHistory.size() > this.mMaxUserCacheNumber) {
            List<Pair<String, List<SearchHistory>>> list = this.allLocalHistory;
            list.remove(list.size() - 1);
        }
        updateSearchHistoryInSp();
    }

    private List<Pair<String, List<SearchHistory>>> getSearchHistoryInSp() {
        try {
            String newSearchHistory = getNewSearchHistory();
            if (TextUtils.isEmpty(newSearchHistory)) {
                m84891x687f9cb("yvette", "getSearchHistory return  empty ");
                List<SearchHistory> oldSearchHistory = getOldSearchHistory();
                if (oldSearchHistory == null) {
                    m84891x687f9cb("yvette", "getOldSearchHistory return  empty ");
                    oldSearchHistory = new ArrayList<>();
                } else {
                    deleteOldSearchHistory();
                }
                ArrayList arrayList = new ArrayList();
                this.allLocalHistory = arrayList;
                arrayList.add(new Pair(UN_LOGIN_USER_ID, oldSearchHistory));
            } else {
                this.allLocalHistory = (List) this.gson.mo46671a(newSearchHistory, new C27895a<List<Pair<String, List<SearchHistory>>>>() {
                    /* class com.p2082ss.android.ugc.aweme.discover.model.SearchHistoryManager.C424722 */

                    static {
                        Covode.recordClassIndex(50486);
                    }
                }.type);
            }
        } catch (Exception unused) {
        }
        if (this.allLocalHistory == null) {
            this.allLocalHistory = new ArrayList();
        }
        m84891x687f9cb("yvette", "getSearchHistoryInSp finally get " + this.allLocalHistory);
        return this.allLocalHistory;
    }

    private void updateSearchHistory(String str) {
        C34597d.m70637d().mo61057b(getKey(), str);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void deleteSearchHistory(SearchHistory searchHistory) {
        this.currentUserLocalHistory.remove(searchHistory);
        updateSearchHistoryInSp();
        onSearchHistoryChanged();
    }

    SearchHistoryManager(String str) {
        IAccountService a = AccountService.m65215a();
        this.accountService = a;
        a.mo57064a(this);
        this.allLocalHistory = getSearchHistoryInSp();
        ensureCurrentUserLocalHistory();
    }

    public static ISearchHistoryManager inst(String str) {
        MethodCollector.m26663i(7285);
        if (sManager == null) {
            synchronized (SearchHistoryManager.class) {
                try {
                    if (sManager == null) {
                        sManager = new SearchHistoryManager(str);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7285);
                    throw th;
                }
            }
        }
        SearchHistoryManager searchHistoryManager = sManager;
        MethodCollector.m26664o(7285);
        return searchHistoryManager;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public void recordSearchHistory(SearchHistory searchHistory) {
        this.currentUserLocalHistory.remove(searchHistory);
        this.currentUserLocalHistory.add(0, searchHistory);
        if (this.mMaxCacheNumber > 0 && this.currentUserLocalHistory.size() > this.mMaxCacheNumber) {
            List<SearchHistory> list = this.currentUserLocalHistory;
            list.remove(list.size() - 1);
        }
        updateSearchHistoryInSp();
        onSearchHistoryChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.ISearchHistoryManager
    public List<SearchHistory> getSearchHistoryByType(int i) {
        ArrayList<SearchHistory> arrayList;
        ArrayList arrayList2 = new ArrayList();
        List<SearchHistory> list = this.currentUserLocalHistory;
        if (list != null && list.size() > 0) {
            try {
                arrayList = new ArrayList(this.currentUserLocalHistory);
            } catch (Exception unused) {
                arrayList = new ArrayList();
            }
            for (SearchHistory searchHistory : arrayList) {
                if (searchHistory != null && searchHistory.type == i) {
                    arrayList2.add(searchHistory);
                }
                if (i == 0 && arrayList2.size() == MAX_VISIBLE_HISTORY_COUNT) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2) {
            if (i == 1 || i == 3) {
                removeFakeUserHistory();
                updateSearchHistoryInSp();
            } else {
                return;
            }
        }
        this.allLocalHistory.clear();
        this.allLocalHistory = getSearchHistoryInSp();
        ensureCurrentUserLocalHistory();
    }
}
