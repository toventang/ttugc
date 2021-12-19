package com.p2082ss.android.ugc.aweme.ecommerce.address;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter */
public final class AddressPageStarter {

    /* renamed from: a */
    public static final AddressPageStarter f101130a = new AddressPageStarter();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$AddressListEnterParams */
    public static final class AddressListEnterParams implements Parcelable {
        public static final Parcelable.Creator<AddressListEnterParams> CREATOR = new C43337b();

        /* renamed from: c */
        public static final C43336a f101142c = new C43336a((byte) 0);
        @AbstractC27891c(mo46611a = "is_select_mode")

        /* renamed from: a */
        public final boolean f101143a;
        @AbstractC27891c(mo46611a = "trackParams")

        /* renamed from: b */
        public final String f101144b;

        static {
            Covode.recordClassIndex(51552);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeInt(this.f101143a ? 1 : 0);
            parcel.writeString(this.f101144b);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$AddressListEnterParams$a */
        public static final class C43336a {
            static {
                Covode.recordClassIndex(51553);
            }

            private C43336a() {
            }

            public /* synthetic */ C43336a(byte b) {
                this();
            }

            /* renamed from: a */
            public static AddressListEnterParams m86453a(Intent intent) {
                boolean z;
                if (intent == null) {
                    return null;
                }
                String a = m86454a(intent, "trackParams");
                try {
                    String a2 = m86454a(intent, "is_select_mode");
                    if (a2 != null) {
                        z = Boolean.parseBoolean(a2);
                    } else {
                        z = false;
                    }
                    return new AddressListEnterParams(z, a);
                } catch (Exception unused) {
                    return new AddressListEnterParams(false, a);
                }
            }

            /* renamed from: a */
            private static String m86454a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$AddressListEnterParams$b */
        public static class C43337b implements Parcelable.Creator<AddressListEnterParams> {
            static {
                Covode.recordClassIndex(51554);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AddressListEnterParams[] newArray(int i) {
                return new AddressListEnterParams[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AddressListEnterParams createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new AddressListEnterParams(parcel.readInt() != 0, parcel.readString());
            }
        }

        private /* synthetic */ AddressListEnterParams() {
            this(false, null);
        }

        public AddressListEnterParams(boolean z, String str) {
            this.f101143a = z;
            this.f101144b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$a */
    public static final class C43338a {

        /* renamed from: c */
        public static final C43339a f101145c = new C43339a((byte) 0);
        @AbstractC27891c(mo46611a = "address_id")

        /* renamed from: a */
        public final String f101146a;
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: b */
        public final int f101147b;

        static {
            Covode.recordClassIndex(51555);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$a$a */
        public static final class C43339a {
            static {
                Covode.recordClassIndex(51556);
            }

            private C43339a() {
            }

            public /* synthetic */ C43339a(byte b) {
                this();
            }

            /* renamed from: a */
            public static C43338a m86456a(String str) {
                Object obj;
                C89219l.m154721d(str, "");
                try {
                    obj = C80342dg.m139301a(str, C43338a.class);
                } catch (Exception unused) {
                    obj = null;
                }
                C43338a aVar = (C43338a) obj;
                if (aVar == null) {
                    return new C43338a("", -1);
                }
                return aVar;
            }
        }

        /* renamed from: a */
        public final String mo73855a() {
            String b = C33039i.m67673a().mo46674b(this);
            if (b == null) {
                return "{}";
            }
            return b;
        }

        public C43338a(String str, int i) {
            C89219l.m154721d(str, "");
            this.f101146a = str;
            this.f101147b = i;
        }
    }

    private AddressPageStarter() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$AddressEditEnterParams */
    public static final class AddressEditEnterParams implements Parcelable {
        public static final Parcelable.Creator<AddressEditEnterParams> CREATOR = new C43335b();

        /* renamed from: k */
        public static final C43333a f101131k = new C43333a((byte) 0);
        @AbstractC27891c(mo46611a = "districts")

        /* renamed from: a */
        public final List<Region> f101132a;
        @AbstractC27891c(mo46611a = "address")

        /* renamed from: b */
        public final Address f101133b;
        @AbstractC27891c(mo46611a = "from")

        /* renamed from: c */
        public final String f101134c;
        @AbstractC27891c(mo46611a = "trackParams")

        /* renamed from: d */
        public final String f101135d;
        @AbstractC27891c(mo46611a = "current_progress")

        /* renamed from: e */
        public final Integer f101136e;
        @AbstractC27891c(mo46611a = "total_progress")

        /* renamed from: f */
        public final Integer f101137f;
        @AbstractC27891c(mo46611a = "template_data")

        /* renamed from: g */
        public final InputItemData f101138g;
        @AbstractC27891c(mo46611a = "keep_alive")

        /* renamed from: h */
        public final boolean f101139h;
        @AbstractC27891c(mo46611a = "button_type")

        /* renamed from: i */
        public final int f101140i;
        @AbstractC27891c(mo46611a = "override_quit_message")

        /* renamed from: j */
        public final String f101141j;

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$AddressEditEnterParams$a */
        public static final class C43333a {
            static {
                Covode.recordClassIndex(51549);
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$AddressEditEnterParams$a$a */
            public static final class C43334a extends C27895a<List<? extends Region>> {
                static {
                    Covode.recordClassIndex(51550);
                }

                C43334a() {
                }
            }

            private C43333a() {
            }

            public /* synthetic */ C43333a(byte b) {
                this();
            }

            /* renamed from: a */
            public static AddressEditEnterParams m86451a(Intent intent) {
                Address address;
                Integer num;
                Integer num2;
                boolean z;
                int i;
                List list;
                Integer e;
                Object obj;
                InputItemData inputItemData = null;
                if (intent == null) {
                    return null;
                }
                String a = m86452a(intent, "address");
                if (a != null) {
                    try {
                        obj = C80342dg.m139301a(a, Address.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    address = (Address) obj;
                } else {
                    address = null;
                }
                String a2 = m86452a(intent, "current_progress");
                if (a2 != null) {
                    num = C89361p.m154863e(a2);
                } else {
                    num = null;
                }
                String a3 = m86452a(intent, "total_progress");
                if (a3 != null) {
                    num2 = C89361p.m154863e(a3);
                } else {
                    num2 = null;
                }
                String a4 = m86452a(intent, "keep_alive");
                if (a4 != null) {
                    z = Boolean.parseBoolean(a4);
                } else {
                    z = false;
                }
                String a5 = m86452a(intent, "button_type");
                if (a5 == null || (e = C89361p.m154863e(a5)) == null) {
                    i = 0;
                } else {
                    i = e.intValue();
                }
                try {
                    Type type = new C43334a().type;
                    C27910f a6 = C80342dg.m139300a();
                    String a7 = m86452a(intent, "districts");
                    if (a7 == null) {
                        a7 = "{}";
                    }
                    list = (List) a6.mo46671a(a7, type);
                } catch (Exception unused2) {
                    list = null;
                }
                try {
                    String a8 = m86452a(intent, "template_data");
                    if (a8 != null) {
                        inputItemData = (InputItemData) C80342dg.m139300a().mo46670a(a8, InputItemData.class);
                    }
                } catch (Exception unused3) {
                }
                String a9 = m86452a(intent, "from");
                if (a9 == null) {
                    a9 = "";
                }
                C89219l.m154716b(a9, "");
                return new AddressEditEnterParams(list, address, a9, m86452a(intent, "trackParams"), num, num2, inputItemData, z, i, m86452a(intent, "override_quit_message"));
            }

            /* renamed from: a */
            private static String m86452a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        static {
            Covode.recordClassIndex(51548);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            List<Region> list = this.f101132a;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Region region : list) {
                    region.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            Address address = this.f101133b;
            if (address != null) {
                parcel.writeInt(1);
                address.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f101134c);
            parcel.writeString(this.f101135d);
            Integer num = this.f101136e;
            if (num != null) {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            } else {
                parcel.writeInt(0);
            }
            Integer num2 = this.f101137f;
            if (num2 != null) {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            } else {
                parcel.writeInt(0);
            }
            InputItemData inputItemData = this.f101138g;
            if (inputItemData != null) {
                parcel.writeInt(1);
                inputItemData.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.f101139h ? 1 : 0);
            parcel.writeInt(this.f101140i);
            parcel.writeString(this.f101141j);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$AddressEditEnterParams$b */
        public static class C43335b implements Parcelable.Creator<AddressEditEnterParams> {
            static {
                Covode.recordClassIndex(51551);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AddressEditEnterParams[] newArray(int i) {
                return new AddressEditEnterParams[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AddressEditEnterParams createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                C89219l.m154721d(parcel, "");
                InputItemData inputItemData = null;
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add(Region.CREATOR.createFromParcel(parcel));
                        readInt--;
                    }
                } else {
                    arrayList = null;
                }
                Address createFromParcel = parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                if (parcel.readInt() != 0) {
                    inputItemData = InputItemData.CREATOR.createFromParcel(parcel);
                }
                return new AddressEditEnterParams(arrayList, createFromParcel, readString, readString2, valueOf, valueOf2, inputItemData, parcel.readInt() != 0, parcel.readInt(), parcel.readString());
            }
        }

        public /* synthetic */ AddressEditEnterParams(String str) {
            this(null, null, str, null, null, null, null, false, 0, null);
        }

        public AddressEditEnterParams(List<Region> list, Address address, String str, String str2, Integer num, Integer num2, InputItemData inputItemData, boolean z, int i, String str3) {
            C89219l.m154721d(str, "");
            this.f101132a = list;
            this.f101133b = address;
            this.f101134c = str;
            this.f101135d = str2;
            this.f101136e = num;
            this.f101137f = num2;
            this.f101138g = inputItemData;
            this.f101139h = z;
            this.f101140i = i;
            this.f101141j = str3;
        }
    }

    static {
        Covode.recordClassIndex(51547);
    }

    /* renamed from: a */
    public static /* synthetic */ void m86450a(Context context, Address address, List list, String str, boolean z, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            address = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 2048) != 0) {
            str3 = null;
        }
        C89219l.m154721d(str, "");
        if (context != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (address != null) {
                linkedHashMap.put("address", address);
            }
            if (list != null) {
                linkedHashMap.put("districts", list);
            }
            if (str2 != null) {
                linkedHashMap.put("trackParams", str2);
            }
            linkedHashMap.put("from", str);
            linkedHashMap.put("keep_alive", false);
            linkedHashMap.put("button_type", 0);
            if (str3 == null || str3.length() == 0) {
                str3 = "aweme://ec/address/edit";
            }
            C45264j.m87843a(context, str3, linkedHashMap, z).open();
        }
    }
}
