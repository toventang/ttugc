package com.p2082ss.android.ugc.aweme.feed.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NearbyCities */
public class NearbyCities implements Parcelable {
    public static final Parcelable.Creator<NearbyCities> CREATOR = new Parcelable.Creator<NearbyCities>() {
        /* class com.p2082ss.android.ugc.aweme.feed.model.NearbyCities.C497411 */

        static {
            Covode.recordClassIndex(58732);
        }

        @Override // android.os.Parcelable.Creator
        public final NearbyCities[] newArray(int i) {
            return new NearbyCities[i];
        }

        @Override // android.os.Parcelable.Creator
        public final NearbyCities createFromParcel(Parcel parcel) {
            return new NearbyCities(parcel);
        }
    };
    public List<CityBean> all;
    public CityBean current;
    public List<CityBean> hot;
    public List<CityBean> old;

    public int describeContents() {
        return 0;
    }

    public NearbyCities() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.NearbyCities$CityBean */
    public static class CityBean implements Parcelable, Comparable<CityBean> {
        public static final Parcelable.Creator<CityBean> CREATOR = new Parcelable.Creator<CityBean>() {
            /* class com.p2082ss.android.ugc.aweme.feed.model.NearbyCities.CityBean.C497421 */

            static {
                Covode.recordClassIndex(58734);
            }

            @Override // android.os.Parcelable.Creator
            public final CityBean[] newArray(int i) {
                return new CityBean[i];
            }

            @Override // android.os.Parcelable.Creator
            public final CityBean createFromParcel(Parcel parcel) {
                return new CityBean(parcel);
            }
        };
        @AbstractC27891c(mo46611a = "ad_code")
        public String adCode;
        @AbstractC27891c(mo46611a = "cn_pinyin")
        public String cnPinyin;
        public String code;
        @AbstractC27891c(mo46611a = "code_local")
        public String codeLocal;
        @AbstractC27891c(mo46611a = "country")
        public String country;
        @AbstractC27891c(mo46611a = "country_code")
        public String countryCode;
        @AbstractC27891c(mo46611a = "current_position_name")
        public String currentPositionName;
        @AbstractC27891c(mo46611a = "districts")
        public List<CityBean> districts;

        /* renamed from: en */
        public String f114479en;
        public boolean isL3;
        public String l2Name = "";
        public String name;
        @AbstractC27891c(mo46611a = "name_en")
        public String nameEn;
        @AbstractC27891c(mo46611a = "nearby_label_name")
        public String nearbyLabelName;
        @AbstractC27891c(mo46611a = "nearby_tab_name")
        public String nearbyTabName;
        @AbstractC27891c(mo46611a = "show_name")
        public String showName;
        @AbstractC27891c(mo46611a = "show_type")
        public int showType;

        public int describeContents() {
            return 0;
        }

        public CityBean() {
        }

        static {
            Covode.recordClassIndex(58733);
        }

        protected CityBean(Parcel parcel) {
            this.name = parcel.readString();
            this.code = parcel.readString();
            this.f114479en = parcel.readString();
        }

        public int compareTo(CityBean cityBean) {
            boolean z = this.isL3;
            if (z && !cityBean.isL3) {
                return 1;
            }
            if ((!z && cityBean.isL3) || TextUtils.isEmpty(this.cnPinyin)) {
                return -1;
            }
            if (TextUtils.isEmpty(cityBean.cnPinyin)) {
                return 1;
            }
            return this.cnPinyin.compareTo(cityBean.cnPinyin);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.code);
            parcel.writeString(this.f114479en);
        }
    }

    static {
        Covode.recordClassIndex(58731);
    }

    protected NearbyCities(Parcel parcel) {
        this.current = (CityBean) parcel.readParcelable(CityBean.class.getClassLoader());
        this.all = parcel.createTypedArrayList(CityBean.CREATOR);
        this.hot = parcel.createTypedArrayList(CityBean.CREATOR);
        this.old = parcel.createTypedArrayList(CityBean.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.current, i);
        parcel.writeTypedList(this.all);
        parcel.writeTypedList(this.hot);
        parcel.writeTypedList(this.old);
    }
}
