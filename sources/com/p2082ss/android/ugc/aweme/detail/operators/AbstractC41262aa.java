package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.aa */
public interface AbstractC41262aa {

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.aa$a */
    public interface AbstractC41263a {
        static {
            Covode.recordClassIndex(49151);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.aa$b */
    public interface AbstractC41264b {
        static {
            Covode.recordClassIndex(49152);
        }

        void bindPreLoadView(AbstractC49992x xVar);

        void setPreLoad(boolean z);
    }

    static {
        Covode.recordClassIndex(49150);
    }

    void bindView(AbstractC41267ad adVar);

    boolean cannotLoadLatest();

    boolean cannotLoadMore();

    boolean deleteItem(String str);

    int getPageType(int i);

    Object getViewModel();

    boolean init(Fragment fragment);

    boolean isDataEmpty();

    boolean isLoading();

    void request(int i, C49812b bVar, int i2, boolean z);

    void unInit();
}
