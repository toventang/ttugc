package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import com.p2082ss.android.ugc.aweme.feed.model.RelationLabelExtra;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;

/* renamed from: com.ss.android.ugc.aweme.feed.api.g */
public final class C48333g {
    static {
        Covode.recordClassIndex(57105);
    }

    /* renamed from: a */
    public static C38214ac m91793a(String str, C38214ac acVar) {
        if (str == null) {
            return acVar;
        }
        return (C38214ac) GsonHolder.m138943c().mo123620b().mo46670a(str, C38214ac.class);
    }

    /* renamed from: a */
    public static AwemeRawAd m91794a(String str, AwemeRawAd awemeRawAd) {
        if (str == null) {
            return awemeRawAd;
        }
        return (AwemeRawAd) GsonHolder.m138943c().mo123620b().mo46670a(str, AwemeRawAd.class);
    }

    /* renamed from: a */
    public static ItemCommentEggGroup m91795a(String str, ItemCommentEggGroup itemCommentEggGroup) {
        if (str == null) {
            return itemCommentEggGroup;
        }
        return (ItemCommentEggGroup) GsonHolder.m138943c().mo123620b().mo46670a(str, ItemCommentEggGroup.class);
    }

    /* renamed from: a */
    public static RelationLabelExtra m91796a(String str, RelationLabelExtra relationLabelExtra) {
        if (str == null) {
            return relationLabelExtra;
        }
        return (RelationLabelExtra) GsonHolder.m138943c().mo123620b().mo46670a(str, RelationLabelExtra.class);
    }

    /* renamed from: a */
    public static NewLiveRoomStruct m91797a(String str, NewLiveRoomStruct newLiveRoomStruct) {
        if (str == null) {
            return newLiveRoomStruct;
        }
        return (NewLiveRoomStruct) GsonHolder.m138943c().mo123620b().mo46670a(str, NewLiveRoomStruct.class);
    }
}
