package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Address */
public final class Address implements Parcelable {
    public static final Parcelable.Creator<Address> CREATOR = new C43356b();

    /* renamed from: f */
    public static final C43355a f101186f = new C43355a((byte) 0);
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public final String f101187a;
    @AbstractC27891c(mo46611a = "items")

    /* renamed from: b */
    public final List<AddressItem> f101188b;
    @AbstractC27891c(mo46611a = "region")

    /* renamed from: c */
    public final Region f101189c;
    @AbstractC27891c(mo46611a = "districts")

    /* renamed from: d */
    public final List<Region> f101190d;
    @AbstractC27891c(mo46611a = "address_id")

    /* renamed from: e */
    public final String f101191e;

    static {
        Covode.recordClassIndex(51575);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return C89219l.m154714a(this.f101187a, address.f101187a) && C89219l.m154714a(this.f101188b, address.f101188b) && C89219l.m154714a(this.f101189c, address.f101189c) && C89219l.m154714a(this.f101190d, address.f101190d) && C89219l.m154714a(this.f101191e, address.f101191e);
    }

    public final int hashCode() {
        String str = this.f101187a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<AddressItem> list = this.f101188b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Region region = this.f101189c;
        int hashCode3 = (hashCode2 + (region != null ? region.hashCode() : 0)) * 31;
        List<Region> list2 = this.f101190d;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.f101191e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "Address(id=" + this.f101187a + ", items=" + this.f101188b + ", region=" + this.f101189c + ", districts=" + this.f101190d + ", addressId=" + this.f101191e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f101187a);
        List<AddressItem> list = this.f101188b;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (AddressItem addressItem : list) {
                addressItem.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Region region = this.f101189c;
        if (region != null) {
            parcel.writeInt(1);
            region.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Region> list2 = this.f101190d;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Region region2 : list2) {
                region2.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f101191e);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Address$a */
    public static final class C43355a {
        static {
            Covode.recordClassIndex(51576);
        }

        private C43355a() {
        }

        public /* synthetic */ C43355a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Address$b */
    public static class C43356b implements Parcelable.Creator<Address> {
        static {
            Covode.recordClassIndex(51577);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Address[] newArray(int i) {
            return new Address[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Address createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(AddressItem.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            Region createFromParcel = parcel.readInt() != 0 ? Region.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(Region.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            }
            return new Address(readString, arrayList, createFromParcel, arrayList2, parcel.readString());
        }
    }

    /* renamed from: b */
    public final String mo73873b() {
        String[] strArr = {mo73871a("address"), mo73871a("address_detail")};
        C89219l.m154721d(strArr, "");
        List g = C89064i.m154506g(strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C43357c.f101192a, 30);
    }

    /* renamed from: a */
    public final boolean mo73872a() {
        T t;
        List<AddressItem> list = this.f101188b;
        String str = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.f101194a, (Object) "default")) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                str = t2.f101195b;
            }
        }
        return C89219l.m154714a((Object) str, (Object) "1");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Address$c */
    static final class C43357c extends AbstractC89220m implements AbstractC89172b<String, CharSequence> {

        /* renamed from: a */
        public static final C43357c f101192a = new C43357c();

        static {
            Covode.recordClassIndex(51578);
        }

        C43357c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Address$d */
    public static final class C43358d extends AbstractC89220m implements AbstractC89172b<Region, CharSequence> {

        /* renamed from: a */
        public static final C43358d f101193a = new C43358d();

        static {
            Covode.recordClassIndex(51579);
        }

        C43358d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(Region region) {
            Region region2 = region;
            C89219l.m154721d(region2, "");
            String str = region2.f101209a;
            if (str != null) {
                return str;
            }
            return "";
        }
    }

    /* renamed from: a */
    public final String mo73871a(String str) {
        T t;
        C89219l.m154721d(str, "");
        List<AddressItem> list = this.f101188b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.f101194a, (Object) str)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.f101195b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ String m86475a(Address address) {
        List c = C89070n.m154524c(address.f101189c);
        Collection collection = address.f101190d;
        if (collection == null) {
            collection = C89086z.INSTANCE;
        }
        c.addAll(collection);
        List f = C89070n.m154580f((Iterable) c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (C80538hl.m139614a(((Region) obj).f101209a)) {
                arrayList.add(obj);
            }
        }
        return C89070n.m154551a(C89070n.m154584g((Iterable) arrayList), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C43358d.f101193a, 30);
    }

    public /* synthetic */ Address(String str, List list, Region region, List list2) {
        this(str, list, region, list2, null);
    }

    public Address(String str, List<AddressItem> list, Region region, List<Region> list2, String str2) {
        C89219l.m154721d(str, "");
        this.f101187a = str;
        this.f101188b = list;
        this.f101189c = region;
        this.f101190d = list2;
        this.f101191e = str2;
    }
}
