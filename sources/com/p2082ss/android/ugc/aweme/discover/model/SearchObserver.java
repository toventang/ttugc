package com.p2082ss.android.ugc.aweme.discover.model;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchObserver */
public class SearchObserver implements AbstractC1214u<Integer> {
    private boolean isFirstVisible = true;
    private SearchStateListener listener;

    static {
        Covode.recordClassIndex(50508);
    }

    public SearchObserver setListener(SearchStateListener searchStateListener) {
        this.listener = searchStateListener;
        return this;
    }

    public void onChanged(Integer num) {
        if (num != null) {
            if (num.intValue() == 5) {
                this.listener.onPageHidden();
            } else if (num.intValue() == 6) {
                this.listener.onPageResume();
            } else if (num.intValue() == 3) {
                this.listener.onContentVisible(false);
            } else if (this.isFirstVisible) {
                this.isFirstVisible = false;
            } else {
                this.listener.onContentVisible(true);
            }
        }
    }
}
