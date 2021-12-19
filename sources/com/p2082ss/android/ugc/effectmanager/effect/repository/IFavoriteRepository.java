package com.p2082ss.android.ugc.effectmanager.effect.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.repository.IFavoriteRepository */
public interface IFavoriteRepository {
    static {
        Covode.recordClassIndex(95643);
    }

    String fetchFavoriteList(String str, IFetchFavoriteList iFetchFavoriteList);

    String modFavoriteList(String str, String str2, boolean z, IModFavoriteList iModFavoriteList);

    String modFavoriteList(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList);
}
