package com.p2082ss.android.ugc.aweme.filter;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.StrArray */
public class StrArray implements Parcelable, Serializable {
    public static final Parcelable.Creator<StrArray> CREATOR = new Parcelable.Creator<StrArray>() {
        /* class com.p2082ss.android.ugc.aweme.filter.StrArray.C506331 */

        static {
            Covode.recordClassIndex(59795);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StrArray[] newArray(int i) {
            return new StrArray[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StrArray createFromParcel(Parcel parcel) {
            return new StrArray(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    private List<String> f116954a;

    /* renamed from: b */
    private List<Integer> f116955b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(59794);
    }

    public void reset() {
        this.f116954a.clear();
        this.f116955b.clear();
    }

    public StrArray() {
        this.f116954a = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f116955b = arrayList;
        arrayList.add(-1);
    }

    public void addIndex() {
        int size = this.f116954a.size();
        if (size > 0) {
            this.f116955b.add(Integer.valueOf(size - 1));
        }
    }

    public void removeLast() {
        if (!this.f116954a.isEmpty()) {
            List<String> list = this.f116954a;
            list.remove(list.size() - 1);
        }
    }

    public void removeLastArray() {
        int size = this.f116954a.size();
        int size2 = this.f116955b.size();
        if (size > 0 && size2 > 1) {
            int intValue = this.f116955b.get(size2 - 2).intValue();
            for (int i = size - 1; i > intValue; i--) {
                this.f116954a.remove(i);
            }
            this.f116955b.remove(size2 - 1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.f116954a.size();
        for (int i = 0; i < size; i++) {
            sb.append(this.f116954a.get(i));
            if (i != size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void add(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f116954a.add(str);
        }
    }

    public static StrArray from(String str) {
        StrArray strArray = new StrArray();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                strArray.add(str2);
            }
        }
        return strArray;
    }

    private StrArray(Parcel parcel) {
        this.f116955b = new ArrayList();
        this.f116954a = parcel.createStringArrayList();
        parcel.readList(this.f116955b, Integer.class.getClassLoader());
    }

    /* synthetic */ StrArray(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f116954a);
        parcel.writeList(this.f116955b);
    }
}
