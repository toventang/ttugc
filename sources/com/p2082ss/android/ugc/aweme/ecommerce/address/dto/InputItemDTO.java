package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemDTO */
public final class InputItemDTO implements Parcelable {
    public static final Parcelable.Creator<InputItemDTO> CREATOR = new C43360a();
    @AbstractC27891c(mo46611a = "default_value")

    /* renamed from: a */
    public final String f101196a;
    @AbstractC27891c(mo46611a = "empty")

    /* renamed from: b */
    public final Boolean f101197b;
    @AbstractC27891c(mo46611a = "hint")

    /* renamed from: c */
    public final String f101198c;
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: d */
    public final String f101199d;
    @AbstractC27891c(mo46611a = "max_length")

    /* renamed from: e */
    public final Integer f101200e;
    @AbstractC27891c(mo46611a = "max_line")

    /* renamed from: f */
    public final Integer f101201f;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: g */
    public final String f101202g;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: h */
    public final Integer f101203h;
    @AbstractC27891c(mo46611a = "rules")

    /* renamed from: i */
    public final List<Rule> f101204i;
    @AbstractC27891c(mo46611a = "input_hint_message")

    /* renamed from: j */
    public final String f101205j;

    static {
        Covode.recordClassIndex(51582);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItemDTO)) {
            return false;
        }
        InputItemDTO inputItemDTO = (InputItemDTO) obj;
        return C89219l.m154714a(this.f101196a, inputItemDTO.f101196a) && C89219l.m154714a(this.f101197b, inputItemDTO.f101197b) && C89219l.m154714a(this.f101198c, inputItemDTO.f101198c) && C89219l.m154714a(this.f101199d, inputItemDTO.f101199d) && C89219l.m154714a(this.f101200e, inputItemDTO.f101200e) && C89219l.m154714a(this.f101201f, inputItemDTO.f101201f) && C89219l.m154714a(this.f101202g, inputItemDTO.f101202g) && C89219l.m154714a(this.f101203h, inputItemDTO.f101203h) && C89219l.m154714a(this.f101204i, inputItemDTO.f101204i) && C89219l.m154714a(this.f101205j, inputItemDTO.f101205j);
    }

    public final int hashCode() {
        String str = this.f101196a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f101197b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.f101198c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f101199d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f101200e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f101201f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.f101202g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num3 = this.f101203h;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 31;
        List<Rule> list = this.f101204i;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f101205j;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "InputItemDTO(defaultValue=" + this.f101196a + ", needClear=" + this.f101197b + ", hint=" + this.f101198c + ", key=" + this.f101199d + ", maxLength=" + this.f101200e + ", maxLines=" + this.f101201f + ", title=" + this.f101202g + ", type=" + this.f101203h + ", rules=" + this.f101204i + ", inputHintMessage=" + this.f101205j + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f101196a);
        Boolean bool = this.f101197b;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f101198c);
        parcel.writeString(this.f101199d);
        Integer num = this.f101200e;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.f101201f;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f101202g);
        Integer num3 = this.f101203h;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<Rule> list = this.f101204i;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Rule rule : list) {
                rule.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f101205j);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemDTO$a */
    public static class C43360a implements Parcelable.Creator<InputItemDTO> {
        static {
            Covode.recordClassIndex(51583);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InputItemDTO[] newArray(int i) {
            return new InputItemDTO[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InputItemDTO createFromParcel(Parcel parcel) {
            Boolean bool;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString4 = parcel.readString();
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new InputItemDTO(readString, bool, readString2, readString3, valueOf, valueOf2, readString4, valueOf3, arrayList, parcel.readString());
        }
    }

    public InputItemDTO(String str, Boolean bool, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, List<Rule> list, String str5) {
        this.f101196a = str;
        this.f101197b = bool;
        this.f101198c = str2;
        this.f101199d = str3;
        this.f101200e = num;
        this.f101201f = num2;
        this.f101202g = str4;
        this.f101203h = num3;
        this.f101204i = list;
        this.f101205j = str5;
    }
}
