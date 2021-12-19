package com.p2082ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2716ct.C40760a;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState */
public final class MyProfileGuideState implements AbstractC20368af {
    private final boolean avatarHasLoaded;
    private final Integer currentCommentSetting;
    private final Integer currentDownloadSetting;
    private final List<Aweme> firstRefreshPrivateAwemeList;
    private final List<Aweme> firstRefreshPublishAwemeList;
    private final Integer followerCount;
    private final boolean hasGuideShowed;
    private final boolean hasPermissionPopUp;
    private final boolean hasSurveyDetermined;
    private final boolean needCheckI18nRecommendUserDialog;
    private final Boolean needShowDiskManagerGuide;
    private final boolean postListHasLoaded;
    private final C40760a surveyData;
    private final boolean vcdGuideLoaded;

    static {
        Covode.recordClassIndex(75852);
    }

    public MyProfileGuideState() {
        this(false, false, false, false, null, null, null, false, false, false, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ MyProfileGuideState copy$default(MyProfileGuideState myProfileGuideState, boolean z, boolean z2, boolean z3, boolean z4, C40760a aVar, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, Integer num2, Integer num3, List list, List list2, int i, Object obj) {
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        C40760a aVar2 = aVar;
        Boolean bool2 = bool;
        Integer num4 = num;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        Integer num5 = num2;
        Integer num6 = num3;
        List list3 = list;
        List list4 = list2;
        if ((i & 1) != 0) {
            z8 = myProfileGuideState.hasGuideShowed;
        }
        if ((i & 2) != 0) {
            z9 = myProfileGuideState.postListHasLoaded;
        }
        if ((i & 4) != 0) {
            z10 = myProfileGuideState.avatarHasLoaded;
        }
        if ((i & 8) != 0) {
            z11 = myProfileGuideState.hasSurveyDetermined;
        }
        if ((i & 16) != 0) {
            aVar2 = myProfileGuideState.surveyData;
        }
        if ((i & 32) != 0) {
            bool2 = myProfileGuideState.needShowDiskManagerGuide;
        }
        if ((i & 64) != 0) {
            num4 = myProfileGuideState.currentDownloadSetting;
        }
        if ((i & 128) != 0) {
            z12 = myProfileGuideState.vcdGuideLoaded;
        }
        if ((i & 256) != 0) {
            z13 = myProfileGuideState.hasPermissionPopUp;
        }
        if ((i & 512) != 0) {
            z14 = myProfileGuideState.needCheckI18nRecommendUserDialog;
        }
        if ((i & 1024) != 0) {
            num5 = myProfileGuideState.followerCount;
        }
        if ((i & 2048) != 0) {
            num6 = myProfileGuideState.currentCommentSetting;
        }
        if ((i & 4096) != 0) {
            list3 = myProfileGuideState.firstRefreshPublishAwemeList;
        }
        if ((i & 8192) != 0) {
            list4 = myProfileGuideState.firstRefreshPrivateAwemeList;
        }
        return myProfileGuideState.copy(z8, z9, z10, z11, aVar2, bool2, num4, z12, z13, z14, num5, num6, list3, list4);
    }

    public final boolean component1() {
        return this.hasGuideShowed;
    }

    public final boolean component10() {
        return this.needCheckI18nRecommendUserDialog;
    }

    public final Integer component11() {
        return this.followerCount;
    }

    public final Integer component12() {
        return this.currentCommentSetting;
    }

    public final List<Aweme> component13() {
        return this.firstRefreshPublishAwemeList;
    }

    public final List<Aweme> component14() {
        return this.firstRefreshPrivateAwemeList;
    }

    public final boolean component2() {
        return this.postListHasLoaded;
    }

    public final boolean component3() {
        return this.avatarHasLoaded;
    }

    public final boolean component4() {
        return this.hasSurveyDetermined;
    }

    public final C40760a component5() {
        return this.surveyData;
    }

    public final Boolean component6() {
        return this.needShowDiskManagerGuide;
    }

    public final Integer component7() {
        return this.currentDownloadSetting;
    }

    public final boolean component8() {
        return this.vcdGuideLoaded;
    }

    public final boolean component9() {
        return this.hasPermissionPopUp;
    }

    public final MyProfileGuideState copy(boolean z, boolean z2, boolean z3, boolean z4, C40760a aVar, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, Integer num2, Integer num3, List<? extends Aweme> list, List<? extends Aweme> list2) {
        return new MyProfileGuideState(z, z2, z3, z4, aVar, bool, num, z5, z6, z7, num2, num3, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyProfileGuideState)) {
            return false;
        }
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return this.hasGuideShowed == myProfileGuideState.hasGuideShowed && this.postListHasLoaded == myProfileGuideState.postListHasLoaded && this.avatarHasLoaded == myProfileGuideState.avatarHasLoaded && this.hasSurveyDetermined == myProfileGuideState.hasSurveyDetermined && C89219l.m154714a(this.surveyData, myProfileGuideState.surveyData) && C89219l.m154714a(this.needShowDiskManagerGuide, myProfileGuideState.needShowDiskManagerGuide) && C89219l.m154714a(this.currentDownloadSetting, myProfileGuideState.currentDownloadSetting) && this.vcdGuideLoaded == myProfileGuideState.vcdGuideLoaded && this.hasPermissionPopUp == myProfileGuideState.hasPermissionPopUp && this.needCheckI18nRecommendUserDialog == myProfileGuideState.needCheckI18nRecommendUserDialog && C89219l.m154714a(this.followerCount, myProfileGuideState.followerCount) && C89219l.m154714a(this.currentCommentSetting, myProfileGuideState.currentCommentSetting) && C89219l.m154714a(this.firstRefreshPublishAwemeList, myProfileGuideState.firstRefreshPublishAwemeList) && C89219l.m154714a(this.firstRefreshPrivateAwemeList, myProfileGuideState.firstRefreshPrivateAwemeList);
    }

    public final int hashCode() {
        boolean z = this.hasGuideShowed;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.postListHasLoaded;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.avatarHasLoaded;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.hasSurveyDetermined;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        C40760a aVar = this.surveyData;
        int i18 = 0;
        int hashCode = (i17 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean bool = this.needShowDiskManagerGuide;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.currentDownloadSetting;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z5 = this.vcdGuideLoaded;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (hashCode3 + i19) * 31;
        boolean z6 = this.hasPermissionPopUp;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        if (!this.needCheckI18nRecommendUserDialog) {
            i = 0;
        }
        int i27 = (i26 + i) * 31;
        Integer num2 = this.followerCount;
        int hashCode4 = (i27 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.currentCommentSetting;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        List<Aweme> list = this.firstRefreshPublishAwemeList;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<Aweme> list2 = this.firstRefreshPrivateAwemeList;
        if (list2 != null) {
            i18 = list2.hashCode();
        }
        return hashCode6 + i18;
    }

    public final String toString() {
        return "MyProfileGuideState(hasGuideShowed=" + this.hasGuideShowed + ", postListHasLoaded=" + this.postListHasLoaded + ", avatarHasLoaded=" + this.avatarHasLoaded + ", hasSurveyDetermined=" + this.hasSurveyDetermined + ", surveyData=" + this.surveyData + ", needShowDiskManagerGuide=" + this.needShowDiskManagerGuide + ", currentDownloadSetting=" + this.currentDownloadSetting + ", vcdGuideLoaded=" + this.vcdGuideLoaded + ", hasPermissionPopUp=" + this.hasPermissionPopUp + ", needCheckI18nRecommendUserDialog=" + this.needCheckI18nRecommendUserDialog + ", followerCount=" + this.followerCount + ", currentCommentSetting=" + this.currentCommentSetting + ", firstRefreshPublishAwemeList=" + this.firstRefreshPublishAwemeList + ", firstRefreshPrivateAwemeList=" + this.firstRefreshPrivateAwemeList + ")";
    }

    public final boolean getAvatarHasLoaded() {
        return this.avatarHasLoaded;
    }

    public final Integer getCurrentCommentSetting() {
        return this.currentCommentSetting;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final List<Aweme> getFirstRefreshPrivateAwemeList() {
        return this.firstRefreshPrivateAwemeList;
    }

    public final List<Aweme> getFirstRefreshPublishAwemeList() {
        return this.firstRefreshPublishAwemeList;
    }

    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    public final boolean getHasGuideShowed() {
        return this.hasGuideShowed;
    }

    public final boolean getHasPermissionPopUp() {
        return this.hasPermissionPopUp;
    }

    public final boolean getHasSurveyDetermined() {
        return this.hasSurveyDetermined;
    }

    public final boolean getNeedCheckI18nRecommendUserDialog() {
        return this.needCheckI18nRecommendUserDialog;
    }

    public final Boolean getNeedShowDiskManagerGuide() {
        return this.needShowDiskManagerGuide;
    }

    public final boolean getPostListHasLoaded() {
        return this.postListHasLoaded;
    }

    public final C40760a getSurveyData() {
        return this.surveyData;
    }

    public final boolean getVcdGuideLoaded() {
        return this.vcdGuideLoaded;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, C40760a aVar, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, Integer num2, Integer num3, List<? extends Aweme> list, List<? extends Aweme> list2) {
        this.hasGuideShowed = z;
        this.postListHasLoaded = z2;
        this.avatarHasLoaded = z3;
        this.hasSurveyDetermined = z4;
        this.surveyData = aVar;
        this.needShowDiskManagerGuide = bool;
        this.currentDownloadSetting = num;
        this.vcdGuideLoaded = z5;
        this.hasPermissionPopUp = z6;
        this.needCheckI18nRecommendUserDialog = z7;
        this.followerCount = num2;
        this.currentCommentSetting = num3;
        this.firstRefreshPublishAwemeList = list;
        this.firstRefreshPrivateAwemeList = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, C40760a aVar, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, Integer num2, Integer num3, List list, List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : num, (i & 128) != 0 ? false : z5, (i & 256) == 0 ? z6 : false, (i & 512) != 0 ? true : z7, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : list, (i & 8192) == 0 ? list2 : null);
    }
}
