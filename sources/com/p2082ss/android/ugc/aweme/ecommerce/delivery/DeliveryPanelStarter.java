package com.p2082ss.android.ugc.aweme.ecommerce.delivery;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89379q;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter */
public final class DeliveryPanelStarter {

    /* renamed from: a */
    public static final DeliveryPanelStarter f103400a = new DeliveryPanelStarter();

    /* renamed from: b */
    private static AbstractC89124d<? super PackedDeliverySelectResult> f103401b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$a */
    public static final class C44347a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f103424a;

        /* renamed from: b */
        int f103425b;

        /* renamed from: c */
        final /* synthetic */ DeliveryPanelStarter f103426c;

        /* renamed from: d */
        Object f103427d;

        /* renamed from: e */
        Object f103428e;

        /* renamed from: f */
        Object f103429f;

        /* renamed from: g */
        boolean f103430g;

        static {
            Covode.recordClassIndex(52679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44347a(DeliveryPanelStarter deliveryPanelStarter, AbstractC89124d dVar) {
            super(dVar);
            this.f103426c = deliveryPanelStarter;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f103424a = obj;
            this.f103425b |= Integer.MIN_VALUE;
            return this.f103426c.mo75367a(null, null, null, false, this);
        }
    }

    private DeliveryPanelStarter() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParam */
    public static final class EnterParam implements Parcelable {
        public static final Parcelable.Creator<EnterParam> CREATOR = new C44343b();

        /* renamed from: i */
        public static final C44340a f103402i = new C44340a((byte) 0);
        @AbstractC27891c(mo46611a = "delivery_type")

        /* renamed from: a */
        public final String f103403a;
        @AbstractC27891c(mo46611a = "address_id")

        /* renamed from: b */
        public final String f103404b;
        @AbstractC27891c(mo46611a = "area")

        /* renamed from: c */
        public final List<Region> f103405c;
        @AbstractC27891c(mo46611a = "product_id")

        /* renamed from: d */
        public final String f103406d;
        @AbstractC27891c(mo46611a = "sku_id")

        /* renamed from: e */
        public final String f103407e;
        @AbstractC27891c(mo46611a = "quantity")

        /* renamed from: f */
        public final int f103408f;
        @AbstractC27891c(mo46611a = "logistic_list")

        /* renamed from: g */
        public final List<LogisticDTO> f103409g;
        @AbstractC27891c(mo46611a = "track_params")

        /* renamed from: h */
        public final String f103410h;

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParam$a */
        public static final class C44340a {
            static {
                Covode.recordClassIndex(52669);
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParam$a$a */
            public static final class C44341a extends C27895a<List<? extends LogisticDTO>> {
                static {
                    Covode.recordClassIndex(52670);
                }

                C44341a() {
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParam$a$b */
            public static final class C44342b extends C27895a<List<? extends Region>> {
                static {
                    Covode.recordClassIndex(52671);
                }

                C44342b() {
                }
            }

            private C44340a() {
            }

            public /* synthetic */ C44340a(byte b) {
                this();
            }

            /* renamed from: a */
            public static EnterParam m87062a(Intent intent) {
                String str;
                int i;
                List list;
                String str2 = "{}";
                List list2 = null;
                if (intent == null) {
                    return null;
                }
                String a = m87063a(intent, "delivery_type");
                if (a != null) {
                    str = a.toString();
                } else {
                    str = null;
                }
                String a2 = m87063a(intent, "address_id");
                String a3 = m87063a(intent, "product_id");
                if (a3 == null) {
                    a3 = "";
                }
                C89219l.m154716b(a3, "");
                String a4 = m87063a(intent, "sku_id");
                if (a4 == null) {
                    a4 = "";
                }
                C89219l.m154716b(a4, "");
                String a5 = m87063a(intent, "quantity");
                if (a5 != null) {
                    i = Integer.parseInt(a5);
                } else {
                    i = 1;
                }
                try {
                    C27910f a6 = C80342dg.m139300a();
                    String a7 = m87063a(intent, "logistic_list");
                    if (a7 == null) {
                        a7 = str2;
                    }
                    list = (List) a6.mo46671a(a7, new C44341a().type);
                } catch (Exception unused) {
                    list = null;
                }
                try {
                    C27910f a8 = C80342dg.m139300a();
                    String a9 = m87063a(intent, "area");
                    if (a9 != null) {
                        str2 = a9;
                    }
                    list2 = (List) a8.mo46671a(str2, new C44342b().type);
                } catch (Exception unused2) {
                }
                String a10 = m87063a(intent, "from");
                if (a10 == null) {
                    a10 = "";
                }
                C89219l.m154716b(a10, "");
                return new EnterParam(str, a2, list2, a3, a4, i, list, m87063a(intent, "track_params"));
            }

            /* renamed from: a */
            private static String m87063a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        static {
            Covode.recordClassIndex(52668);
        }

        public EnterParam() {
            this(null, null, null, null, null, 0, null, null, 255);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParam)) {
                return false;
            }
            EnterParam enterParam = (EnterParam) obj;
            return C89219l.m154714a(this.f103403a, enterParam.f103403a) && C89219l.m154714a(this.f103404b, enterParam.f103404b) && C89219l.m154714a(this.f103405c, enterParam.f103405c) && C89219l.m154714a(this.f103406d, enterParam.f103406d) && C89219l.m154714a(this.f103407e, enterParam.f103407e) && this.f103408f == enterParam.f103408f && C89219l.m154714a(this.f103409g, enterParam.f103409g) && C89219l.m154714a(this.f103410h, enterParam.f103410h);
        }

        public final int hashCode() {
            String str = this.f103403a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f103404b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<Region> list = this.f103405c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            String str3 = this.f103406d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f103407e;
            int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f103408f) * 31;
            List<LogisticDTO> list2 = this.f103409g;
            int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
            String str5 = this.f103410h;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode6 + i;
        }

        public final String toString() {
            return "EnterParam(selectedDeliveryTypeId=" + this.f103403a + ", selectedBuyerAddressId=" + this.f103404b + ", selectedArea=" + this.f103405c + ", productId=" + this.f103406d + ", skuId=" + this.f103407e + ", quantity=" + this.f103408f + ", logisticList=" + this.f103409g + ", trackParams=" + this.f103410h + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f103403a);
            parcel.writeString(this.f103404b);
            List<Region> list = this.f103405c;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Region region : list) {
                    region.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f103406d);
            parcel.writeString(this.f103407e);
            parcel.writeInt(this.f103408f);
            List<LogisticDTO> list2 = this.f103409g;
            if (list2 != null) {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                for (LogisticDTO logisticDTO : list2) {
                    logisticDTO.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f103410h);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParam$b */
        public static class C44343b implements Parcelable.Creator<EnterParam> {
            static {
                Covode.recordClassIndex(52672);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ EnterParam[] newArray(int i) {
                return new EnterParam[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ EnterParam createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                C89219l.m154721d(parcel, "");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ArrayList arrayList2 = null;
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
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    int readInt3 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt3);
                    while (readInt3 != 0) {
                        arrayList2.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                        readInt3--;
                    }
                }
                return new EnterParam(readString, readString2, arrayList, readString3, readString4, readInt2, arrayList2, parcel.readString());
            }
        }

        public EnterParam(String str, String str2, List<Region> list, String str3, String str4, int i, List<LogisticDTO> list2, String str5) {
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            this.f103403a = str;
            this.f103404b = str2;
            this.f103405c = list;
            this.f103406d = str3;
            this.f103407e = str4;
            this.f103408f = i;
            this.f103409g = list2;
            this.f103410h = str5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ EnterParam(java.lang.String r11, java.lang.String r12, java.util.List r13, java.lang.String r14, java.lang.String r15, int r16, java.util.List r17, java.lang.String r18, int r19) {
            /*
                r10 = this;
                r8 = r17
                r7 = r16
                r2 = r11
                r3 = r12
                r1 = r19
                r5 = r14
                r4 = r13
                r0 = r1 & 1
                r9 = 0
                if (r0 == 0) goto L_0x0010
                r2 = r9
            L_0x0010:
                r0 = r1 & 2
                if (r0 == 0) goto L_0x0015
                r3 = r9
            L_0x0015:
                r0 = r1 & 4
                if (r0 == 0) goto L_0x001a
                r4 = r9
            L_0x001a:
                r0 = r1 & 8
                java.lang.String r6 = "0"
                if (r0 == 0) goto L_0x0021
                r5 = r6
            L_0x0021:
                r0 = r1 & 16
                if (r0 == 0) goto L_0x003b
            L_0x0025:
                r0 = r1 & 32
                if (r0 == 0) goto L_0x002a
                r7 = 1
            L_0x002a:
                r0 = r1 & 64
                if (r0 == 0) goto L_0x002f
                r8 = r9
            L_0x002f:
                r0 = r1 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0038
            L_0x0033:
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            L_0x0038:
                r9 = r18
                goto L_0x0033
            L_0x003b:
                r6 = r15
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.EnterParam.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParamForOrderSubmitPage */
    public static final class EnterParamForOrderSubmitPage implements Parcelable {
        public static final Parcelable.Creator<EnterParamForOrderSubmitPage> CREATOR = new C44344a();

        /* renamed from: a */
        public final List<LogisticDTO> f103411a;

        /* renamed from: b */
        public final String f103412b;

        /* renamed from: c */
        public final String f103413c;

        static {
            Covode.recordClassIndex(52673);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParamForOrderSubmitPage)) {
                return false;
            }
            EnterParamForOrderSubmitPage enterParamForOrderSubmitPage = (EnterParamForOrderSubmitPage) obj;
            return C89219l.m154714a(this.f103411a, enterParamForOrderSubmitPage.f103411a) && C89219l.m154714a(this.f103412b, enterParamForOrderSubmitPage.f103412b) && C89219l.m154714a(this.f103413c, enterParamForOrderSubmitPage.f103413c);
        }

        public final int hashCode() {
            List<LogisticDTO> list = this.f103411a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f103412b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f103413c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "EnterParamForOrderSubmitPage(logisticList=" + this.f103411a + ", selectedLogisticTypeId=" + this.f103412b + ", trackParams=" + this.f103413c + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            List<LogisticDTO> list = this.f103411a;
            parcel.writeInt(list.size());
            for (LogisticDTO logisticDTO : list) {
                logisticDTO.writeToParcel(parcel, 0);
            }
            parcel.writeString(this.f103412b);
            parcel.writeString(this.f103413c);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParamForOrderSubmitPage$a */
        public static class C44344a implements Parcelable.Creator<EnterParamForOrderSubmitPage> {
            static {
                Covode.recordClassIndex(52674);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ EnterParamForOrderSubmitPage[] newArray(int i) {
                return new EnterParamForOrderSubmitPage[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ EnterParamForOrderSubmitPage createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
                return new EnterParamForOrderSubmitPage(arrayList, parcel.readString(), parcel.readString());
            }
        }

        public EnterParamForOrderSubmitPage(List<LogisticDTO> list, String str, String str2) {
            C89219l.m154721d(list, "");
            this.f103411a = list;
            this.f103412b = str;
            this.f103413c = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParamForProductDetailPage */
    public static final class EnterParamForProductDetailPage implements Parcelable {
        public static final Parcelable.Creator<EnterParamForProductDetailPage> CREATOR = new C44345a();

        /* renamed from: a */
        public final String f103414a;

        /* renamed from: b */
        public final String f103415b;

        /* renamed from: c */
        public final List<Region> f103416c;

        /* renamed from: d */
        public final String f103417d;

        /* renamed from: e */
        public final String f103418e;

        /* renamed from: f */
        public final int f103419f;

        /* renamed from: g */
        public final String f103420g;

        static {
            Covode.recordClassIndex(52675);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParamForProductDetailPage)) {
                return false;
            }
            EnterParamForProductDetailPage enterParamForProductDetailPage = (EnterParamForProductDetailPage) obj;
            return C89219l.m154714a(this.f103414a, enterParamForProductDetailPage.f103414a) && C89219l.m154714a(this.f103415b, enterParamForProductDetailPage.f103415b) && C89219l.m154714a(this.f103416c, enterParamForProductDetailPage.f103416c) && C89219l.m154714a(this.f103417d, enterParamForProductDetailPage.f103417d) && C89219l.m154714a(this.f103418e, enterParamForProductDetailPage.f103418e) && this.f103419f == enterParamForProductDetailPage.f103419f && C89219l.m154714a(this.f103420g, enterParamForProductDetailPage.f103420g);
        }

        public final int hashCode() {
            String str = this.f103414a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f103415b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<Region> list = this.f103416c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            String str3 = this.f103417d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f103418e;
            int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f103419f) * 31;
            String str5 = this.f103420g;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode5 + i;
        }

        public final String toString() {
            return "EnterParamForProductDetailPage(selectedLogisticTypeId=" + this.f103414a + ", selectedBuyerAddressId=" + this.f103415b + ", selectedArea=" + this.f103416c + ", productId=" + this.f103417d + ", skuId=" + this.f103418e + ", quantity=" + this.f103419f + ", trackParams=" + this.f103420g + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f103414a);
            parcel.writeString(this.f103415b);
            List<Region> list = this.f103416c;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Region region : list) {
                    region.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f103417d);
            parcel.writeString(this.f103418e);
            parcel.writeInt(this.f103419f);
            parcel.writeString(this.f103420g);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParamForProductDetailPage$a */
        public static class C44345a implements Parcelable.Creator<EnterParamForProductDetailPage> {
            static {
                Covode.recordClassIndex(52676);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ EnterParamForProductDetailPage[] newArray(int i) {
                return new EnterParamForProductDetailPage[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ EnterParamForProductDetailPage createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                C89219l.m154721d(parcel, "");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
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
                return new EnterParamForProductDetailPage(readString, readString2, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            }
        }

        public EnterParamForProductDetailPage(String str, String str2, List<Region> list, String str3, String str4, int i, String str5) {
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            this.f103414a = str;
            this.f103415b = str2;
            this.f103416c = list;
            this.f103417d = str3;
            this.f103418e = str4;
            this.f103419f = i;
            this.f103420g = str5;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$PackedDeliverySelectResult */
    public static final class PackedDeliverySelectResult implements Parcelable {
        public static final Parcelable.Creator<PackedDeliverySelectResult> CREATOR = new C44346a();
        @AbstractC27891c(mo46611a = "logistic")

        /* renamed from: a */
        public final LogisticDTO f103421a;
        @AbstractC27891c(mo46611a = "address_id")

        /* renamed from: b */
        public final String f103422b;
        @AbstractC27891c(mo46611a = "area")

        /* renamed from: c */
        public final List<Region> f103423c;

        static {
            Covode.recordClassIndex(52677);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackedDeliverySelectResult)) {
                return false;
            }
            PackedDeliverySelectResult packedDeliverySelectResult = (PackedDeliverySelectResult) obj;
            return C89219l.m154714a(this.f103421a, packedDeliverySelectResult.f103421a) && C89219l.m154714a(this.f103422b, packedDeliverySelectResult.f103422b) && C89219l.m154714a(this.f103423c, packedDeliverySelectResult.f103423c);
        }

        public final int hashCode() {
            LogisticDTO logisticDTO = this.f103421a;
            int i = 0;
            int hashCode = (logisticDTO != null ? logisticDTO.hashCode() : 0) * 31;
            String str = this.f103422b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            List<Region> list = this.f103423c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "PackedDeliverySelectResult(selectedLogistic=" + this.f103421a + ", selectedBuyerAddressId=" + this.f103422b + ", selectedArea=" + this.f103423c + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            LogisticDTO logisticDTO = this.f103421a;
            if (logisticDTO != null) {
                parcel.writeInt(1);
                logisticDTO.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f103422b);
            List<Region> list = this.f103423c;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Region region : list) {
                    region.writeToParcel(parcel, 0);
                }
                return;
            }
            parcel.writeInt(0);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$PackedDeliverySelectResult$a */
        public static class C44346a implements Parcelable.Creator<PackedDeliverySelectResult> {
            static {
                Covode.recordClassIndex(52678);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ PackedDeliverySelectResult[] newArray(int i) {
                return new PackedDeliverySelectResult[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ PackedDeliverySelectResult createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                ArrayList arrayList = null;
                LogisticDTO createFromParcel = parcel.readInt() != 0 ? LogisticDTO.CREATOR.createFromParcel(parcel) : null;
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add(Region.CREATOR.createFromParcel(parcel));
                        readInt--;
                    }
                }
                return new PackedDeliverySelectResult(createFromParcel, readString, arrayList);
            }
        }

        public /* synthetic */ PackedDeliverySelectResult() {
            this(null, null, null);
        }

        public PackedDeliverySelectResult(LogisticDTO logisticDTO, String str, List<Region> list) {
            this.f103421a = logisticDTO;
            this.f103422b = str;
            this.f103423c = list;
        }
    }

    static {
        Covode.recordClassIndex(52667);
    }

    /* renamed from: a */
    public static void m87060a(PackedDeliverySelectResult packedDeliverySelectResult) {
        C89219l.m154721d(packedDeliverySelectResult, "");
        AbstractC89124d<? super PackedDeliverySelectResult> dVar = f103401b;
        if (dVar != null) {
            dVar.resumeWith(C89379q.m157068constructorimpl(packedDeliverySelectResult));
        }
        f103401b = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo75367a(android.content.Context r9, java.lang.Boolean r10, com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.EnterParam r11, boolean r12, p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.PackedDeliverySelectResult> r13) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.mo75367a(android.content.Context, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParam, boolean, h.c.d):java.lang.Object");
    }
}
