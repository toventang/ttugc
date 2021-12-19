package com.p2082ss.android.ugc.aweme.discover.model;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateViewModel */
public class SearchStateViewModel extends AbstractC1174ac {
    public C1213t<Boolean> isLeavingSearchPage = new C1213t<>();
    public C1213t<Boolean> isRefreshingData = new C1213t<>();
    public C1213t<Boolean> isSearchPageVisible = new C1213t<>();
    public C1213t<Boolean> isShowingFilters = new C1213t<>();
    public C1213t<Boolean> isShowingSuicide = new C1213t<>();
    public C1213t<Integer> searchState = new C1213t<>();

    static {
        Covode.recordClassIndex(50516);
    }

    public static boolean isSearchIntermediate(int i) {
        return i == 3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setIsLeavingSearch$1$SearchStateViewModel(boolean z) {
        this.isLeavingSearchPage.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setIsRefreshingData$3$SearchStateViewModel(boolean z) {
        this.isRefreshingData.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setSearchPageVisible$2$SearchStateViewModel(boolean z) {
        this.isSearchPageVisible.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setSearchState$0$SearchStateViewModel(int i) {
        this.searchState.setValue(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setShowingFilters$5$SearchStateViewModel(boolean z) {
        this.isShowingFilters.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$setShowingSuicide$4$SearchStateViewModel(boolean z) {
        this.isShowingSuicide.setValue(Boolean.valueOf(z));
    }

    public void setIsLeavingSearch(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$1(this, z));
    }

    public void setIsRefreshingData(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$3(this, z));
    }

    public void setSearchPageVisible(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$2(this, z));
    }

    public void setSearchState(int i) {
        runOnUiThread(new SearchStateViewModel$$Lambda$0(this, i));
    }

    public void setShowingFilters(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$5(this, z));
    }

    public void setShowingSuicide(boolean z) {
        runOnUiThread(new SearchStateViewModel$$Lambda$4(this, z));
    }

    private void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
