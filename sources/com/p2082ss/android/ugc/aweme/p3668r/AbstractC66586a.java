package com.p2082ss.android.ugc.aweme.p3668r;

import android.content.Context;
import com.bytedance.android.livesdkapi.p691g.AbstractC11769i;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.r.a */
public interface AbstractC66586a {
    static {
        Covode.recordClassIndex(78136);
    }

    /* renamed from: a */
    AbstractC11769i mo105585a(String str);

    /* renamed from: a */
    void mo105586a(Context context, long j, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, String str2);

    /* renamed from: a */
    void mo105587a(Context context, EnterRoomConfig enterRoomConfig);

    /* renamed from: a */
    void mo105588a(Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List<Aweme> list, AbstractC66587b bVar);

    /* renamed from: a */
    void mo105589a(Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<LiveRoomStruct> list, AbstractC66587b bVar);

    /* renamed from: a */
    void mo105590a(Context context, EnterRoomConfig enterRoomConfig, User user, long[] jArr, long j, int i);

    /* renamed from: a */
    void mo105591a(Context context, EnterRoomConfig enterRoomConfig, String str);

    /* renamed from: a */
    void mo105592a(Context context, NewLiveRoomStruct newLiveRoomStruct, EnterRoomConfig enterRoomConfig);

    /* renamed from: a */
    void mo105593a(Context context, User user, EnterRoomConfig enterRoomConfig);

    /* renamed from: a */
    void mo105594a(Context context, User user, boolean z);

    /* renamed from: b */
    void mo105595b(Context context, EnterRoomConfig enterRoomConfig, String str);
}
