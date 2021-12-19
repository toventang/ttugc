package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.IAwemeList;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.IAwemeList */
public interface IAwemeList<T extends IAwemeList<T>> {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(50457);
    }

    List<Aweme> getIAwemeList();

    int getICursor();

    int getIHasMore();

    int getIStatusCode();

    void setIAwemeList(List<Aweme> list);

    void setICursor(int i);

    void setIHasMore(int i);

    void setIStatusCode(int i);

    void updateData(T t);

    /* renamed from: com.ss.android.ugc.aweme.discover.model.IAwemeList$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(50458);
        }
    }
}
