package com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct */
public final class ReviewItemStruct implements Parcelable {
    public static final Parcelable.Creator<ReviewItemStruct> CREATOR = new C45194a();
    @AbstractC27891c(mo46611a = "review")

    /* renamed from: a */
    public final MainReview f105340a;
    @AbstractC27891c(mo46611a = "sku_specification")

    /* renamed from: b */
    public final String f105341b;
    @AbstractC27891c(mo46611a = "sku_id")

    /* renamed from: c */
    public final String f105342c;
    @AbstractC27891c(mo46611a = "digg_count")

    /* renamed from: d */
    public final Integer f105343d;
    @AbstractC27891c(mo46611a = "is_digged")

    /* renamed from: e */
    public final Boolean f105344e;
    @AbstractC27891c(mo46611a = "is_owner")

    /* renamed from: f */
    public final Boolean f105345f;
    @AbstractC27891c(mo46611a = "review_user")

    /* renamed from: g */
    public final User f105346g;
    @AbstractC27891c(mo46611a = "review_tags")

    /* renamed from: h */
    public final List<ReviewTags> f105347h;
    @AbstractC27891c(mo46611a = "is_anonymous")

    /* renamed from: i */
    public final Boolean f105348i;

    static {
        Covode.recordClassIndex(53628);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static ReviewItemStruct m87799a(MainReview mainReview, String str, String str2, Integer num, Boolean bool, Boolean bool2, User user, List<ReviewTags> list, Boolean bool3) {
        C89219l.m154721d(mainReview, "");
        C89219l.m154721d(str2, "");
        return new ReviewItemStruct(mainReview, str, str2, num, bool, bool2, user, list, bool3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewItemStruct)) {
            return false;
        }
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) obj;
        return C89219l.m154714a(this.f105340a, reviewItemStruct.f105340a) && C89219l.m154714a(this.f105341b, reviewItemStruct.f105341b) && C89219l.m154714a(this.f105342c, reviewItemStruct.f105342c) && C89219l.m154714a(this.f105343d, reviewItemStruct.f105343d) && C89219l.m154714a(this.f105344e, reviewItemStruct.f105344e) && C89219l.m154714a(this.f105345f, reviewItemStruct.f105345f) && C89219l.m154714a(this.f105346g, reviewItemStruct.f105346g) && C89219l.m154714a(this.f105347h, reviewItemStruct.f105347h) && C89219l.m154714a(this.f105348i, reviewItemStruct.f105348i);
    }

    public final int hashCode() {
        MainReview mainReview = this.f105340a;
        int i = 0;
        int hashCode = (mainReview != null ? mainReview.hashCode() : 0) * 31;
        String str = this.f105341b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f105342c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f105343d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f105344e;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f105345f;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        User user = this.f105346g;
        int hashCode7 = (hashCode6 + (user != null ? user.hashCode() : 0)) * 31;
        List<ReviewTags> list = this.f105347h;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool3 = this.f105348i;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "ReviewItemStruct(review=" + this.f105340a + ", specification=" + this.f105341b + ", skuId=" + this.f105342c + ", diggCount=" + this.f105343d + ", isDigged=" + this.f105344e + ", isOwner=" + this.f105345f + ", user=" + this.f105346g + ", tags=" + this.f105347h + ", isAnonymous=" + this.f105348i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        this.f105340a.writeToParcel(parcel, 0);
        parcel.writeString(this.f105341b);
        parcel.writeString(this.f105342c);
        Integer num = this.f105343d;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f105344e;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.f105345f;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        User user = this.f105346g;
        if (user != null) {
            parcel.writeInt(1);
            user.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<ReviewTags> list = this.f105347h;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ReviewTags reviewTags : list) {
                reviewTags.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Boolean bool3 = this.f105348i;
        if (bool3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct$AppendReview */
    public static final class AppendReview implements Parcelable {
        public static final Parcelable.Creator<AppendReview> CREATOR = new C45191a();
        @AbstractC27891c(mo46611a = "text")

        /* renamed from: a */
        public final String f105349a;
        @AbstractC27891c(mo46611a = "images")

        /* renamed from: b */
        public final List<Image> f105350b;
        @AbstractC27891c(mo46611a = "days_from_purchase")

        /* renamed from: c */
        public final String f105351c;
        @AbstractC27891c(mo46611a = "reply_append_review")

        /* renamed from: d */
        public final String f105352d;

        static {
            Covode.recordClassIndex(53629);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppendReview)) {
                return false;
            }
            AppendReview appendReview = (AppendReview) obj;
            return C89219l.m154714a(this.f105349a, appendReview.f105349a) && C89219l.m154714a(this.f105350b, appendReview.f105350b) && C89219l.m154714a(this.f105351c, appendReview.f105351c) && C89219l.m154714a(this.f105352d, appendReview.f105352d);
        }

        public final int hashCode() {
            String str = this.f105349a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<Image> list = this.f105350b;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.f105351c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f105352d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "AppendReview(text=" + this.f105349a + ", images=" + this.f105350b + ", daysForPruchase=" + this.f105351c + ", reply=" + this.f105352d + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f105349a);
            List<Image> list = this.f105350b;
            parcel.writeInt(list.size());
            for (Image image : list) {
                image.writeToParcel(parcel, 0);
            }
            parcel.writeString(this.f105351c);
            parcel.writeString(this.f105352d);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct$AppendReview$a */
        public static class C45191a implements Parcelable.Creator<AppendReview> {
            static {
                Covode.recordClassIndex(53630);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AppendReview[] newArray(int i) {
                return new AppendReview[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AppendReview createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Image.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
                return new AppendReview(readString, arrayList, parcel.readString(), parcel.readString());
            }
        }

        private /* synthetic */ AppendReview() {
            this("", C89086z.INSTANCE, "", null);
        }

        public AppendReview(String str, List<Image> list, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(str2, "");
            this.f105349a = str;
            this.f105350b = list;
            this.f105351c = str2;
            this.f105352d = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct$MainReview */
    public static final class MainReview implements Parcelable {
        public static final Parcelable.Creator<MainReview> CREATOR = new C45192a();
        @AbstractC27891c(mo46611a = "review_id")

        /* renamed from: a */
        public final String f105353a;
        @AbstractC27891c(mo46611a = "rating")

        /* renamed from: b */
        public final String f105354b;
        @AbstractC27891c(mo46611a = "display_text")

        /* renamed from: c */
        public final String f105355c;
        @AbstractC27891c(mo46611a = "images")

        /* renamed from: d */
        public final List<Image> f105356d;
        @AbstractC27891c(mo46611a = "review_timestamp")

        /* renamed from: e */
        public final String f105357e;
        @AbstractC27891c(mo46611a = "append_review")

        /* renamed from: f */
        public final AppendReview f105358f;
        @AbstractC27891c(mo46611a = "reply_main_review")

        /* renamed from: g */
        public final String f105359g;
        @AbstractC27891c(mo46611a = "has_origin_text")

        /* renamed from: h */
        public final boolean f105360h;

        static {
            Covode.recordClassIndex(53631);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainReview)) {
                return false;
            }
            MainReview mainReview = (MainReview) obj;
            return C89219l.m154714a(this.f105353a, mainReview.f105353a) && C89219l.m154714a(this.f105354b, mainReview.f105354b) && C89219l.m154714a(this.f105355c, mainReview.f105355c) && C89219l.m154714a(this.f105356d, mainReview.f105356d) && C89219l.m154714a(this.f105357e, mainReview.f105357e) && C89219l.m154714a(this.f105358f, mainReview.f105358f) && C89219l.m154714a(this.f105359g, mainReview.f105359g) && this.f105360h == mainReview.f105360h;
        }

        public final int hashCode() {
            String str = this.f105353a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f105354b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f105355c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            List<Image> list = this.f105356d;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            String str4 = this.f105357e;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            AppendReview appendReview = this.f105358f;
            int hashCode6 = (hashCode5 + (appendReview != null ? appendReview.hashCode() : 0)) * 31;
            String str5 = this.f105359g;
            if (str5 != null) {
                i = str5.hashCode();
            }
            int i2 = (hashCode6 + i) * 31;
            boolean z = this.f105360h;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final String toString() {
            return "MainReview(reviewId=" + this.f105353a + ", rating=" + this.f105354b + ", text=" + this.f105355c + ", images=" + this.f105356d + ", reviewTimeStamp=" + this.f105357e + ", appendReview=" + this.f105358f + ", reply=" + this.f105359g + ", hasOriginText=" + this.f105360h + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f105353a);
            parcel.writeString(this.f105354b);
            parcel.writeString(this.f105355c);
            List<Image> list = this.f105356d;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Image image : list) {
                    image.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f105357e);
            AppendReview appendReview = this.f105358f;
            if (appendReview != null) {
                parcel.writeInt(1);
                appendReview.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f105359g);
            parcel.writeInt(this.f105360h ? 1 : 0);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct$MainReview$a */
        public static class C45192a implements Parcelable.Creator<MainReview> {
            static {
                Covode.recordClassIndex(53632);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MainReview[] newArray(int i) {
                return new MainReview[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MainReview createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                C89219l.m154721d(parcel, "");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                AppendReview appendReview = null;
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add(Image.CREATOR.createFromParcel(parcel));
                        readInt--;
                    }
                } else {
                    arrayList = null;
                }
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    appendReview = AppendReview.CREATOR.createFromParcel(parcel);
                }
                return new MainReview(readString, readString2, readString3, arrayList, readString4, appendReview, parcel.readString(), parcel.readInt() != 0);
            }
        }

        public /* synthetic */ MainReview() {
            this("", "0", null, null, "0", null, null, false);
        }

        /* renamed from: b */
        public final boolean mo76272b() {
            List<Image> list = this.f105356d;
            if (list == null || !(!list.isEmpty())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo76271a() {
            if (C80538hl.m139614a(this.f105355c) || mo76272b()) {
                return true;
            }
            return false;
        }

        public MainReview(String str, String str2, String str3, List<Image> list, String str4, AppendReview appendReview, String str5, boolean z) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str4, "");
            this.f105353a = str;
            this.f105354b = str2;
            this.f105355c = str3;
            this.f105356d = list;
            this.f105357e = str4;
            this.f105358f = appendReview;
            this.f105359g = str5;
            this.f105360h = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct$User */
    public static final class User implements Parcelable {
        public static final Parcelable.Creator<User> CREATOR = new C45193a();
        @AbstractC27891c(mo46611a = "user_id")

        /* renamed from: a */
        public final String f105361a;
        @AbstractC27891c(mo46611a = StringSet.name)

        /* renamed from: b */
        public final String f105362b;
        @AbstractC27891c(mo46611a = "avatar")

        /* renamed from: c */
        public final Image f105363c;
        @AbstractC27891c(mo46611a = "link")

        /* renamed from: d */
        public final String f105364d;

        static {
            Covode.recordClassIndex(53633);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return C89219l.m154714a(this.f105361a, user.f105361a) && C89219l.m154714a(this.f105362b, user.f105362b) && C89219l.m154714a(this.f105363c, user.f105363c) && C89219l.m154714a(this.f105364d, user.f105364d);
        }

        public final int hashCode() {
            String str = this.f105361a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f105362b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Image image = this.f105363c;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
            String str3 = this.f105364d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "User(id=" + this.f105361a + ", name=" + this.f105362b + ", avatar=" + this.f105363c + ", link=" + this.f105364d + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f105361a);
            parcel.writeString(this.f105362b);
            Image image = this.f105363c;
            if (image != null) {
                parcel.writeInt(1);
                image.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f105364d);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct$User$a */
        public static class C45193a implements Parcelable.Creator<User> {
            static {
                Covode.recordClassIndex(53634);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ User[] newArray(int i) {
                return new User[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ User createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new User(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }
        }

        private /* synthetic */ User() {
            this(null, null, null, null);
        }

        public User(String str, String str2, Image image, String str3) {
            this.f105361a = str;
            this.f105362b = str2;
            this.f105363c = image;
            this.f105364d = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct$a */
    public static class C45194a implements Parcelable.Creator<ReviewItemStruct> {
        static {
            Covode.recordClassIndex(53635);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReviewItemStruct[] newArray(int i) {
            return new ReviewItemStruct[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReviewItemStruct createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            MainReview createFromParcel = MainReview.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool3 = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            boolean z = true;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool2 = null;
            }
            User createFromParcel2 = parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(ReviewTags.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool3 = Boolean.valueOf(z);
            }
            return new ReviewItemStruct(createFromParcel, readString, readString2, valueOf, bool, bool2, createFromParcel2, arrayList, bool3);
        }
    }

    private /* synthetic */ ReviewItemStruct() {
        this(new MainReview(), null, "", null, null, null, null, null, null);
    }

    public ReviewItemStruct(MainReview mainReview, String str, String str2, Integer num, Boolean bool, Boolean bool2, User user, List<ReviewTags> list, Boolean bool3) {
        C89219l.m154721d(mainReview, "");
        C89219l.m154721d(str2, "");
        this.f105340a = mainReview;
        this.f105341b = str;
        this.f105342c = str2;
        this.f105343d = num;
        this.f105344e = bool;
        this.f105345f = bool2;
        this.f105346g = user;
        this.f105347h = list;
        this.f105348i = bool3;
    }
}
