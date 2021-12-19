package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45687a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45695f;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45697h;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45781b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45784e;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a.C45804a;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.PopupCardVO */
public final class PopupCardVO {
    public static final C45715a Companion = new C45715a((byte) 0);
    private final C45746l flashSaleInfo;
    private final String formatAvailablePrice;
    private final String formatOriginPrice;
    private final String fromMessageId;
    private final String imageUrl;
    private final String imageUrlKey;
    private final boolean isFromMessage;
    private final String openUrl;
    private final int platform;
    private final String price;
    private final long productId;
    private final int productStatus;
    private final List<C45697h> promotionLogos;
    private C45784e promotionSkin;
    private final PromotionView promotionView;
    private final String schema;
    private final String source;
    private final int sourceFrom;
    private final C45781b sourceMessage;
    private final String title;

    static {
        Covode.recordClassIndex(54232);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommercelive_business_audience_slot_popcard_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88221x63de3ef4(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommercelive_business_audience_slot_popcard_PopupCardVO_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88222x63de3ef4(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ PopupCardVO copy$default(PopupCardVO popupCardVO, String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, boolean z, C45781b bVar, String str6, String str7, long j, String str8, String str9, String str10, C45746l lVar, List list, C45784e eVar, PromotionView promotionView2, int i4, Object obj) {
        String str11 = str5;
        int i5 = i;
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        long j2 = j;
        String str16 = str7;
        String str17 = str6;
        int i6 = i2;
        int i7 = i3;
        boolean z2 = z;
        C45781b bVar2 = bVar;
        C45784e eVar2 = eVar;
        List list2 = list;
        String str18 = str8;
        PromotionView promotionView3 = promotionView2;
        C45746l lVar2 = lVar;
        String str19 = str9;
        String str20 = str10;
        if ((i4 & 1) != 0) {
            str12 = popupCardVO.title;
        }
        if ((i4 & 2) != 0) {
            str13 = popupCardVO.price;
        }
        if ((i4 & 4) != 0) {
            str14 = popupCardVO.openUrl;
        }
        if ((i4 & 8) != 0) {
            str15 = popupCardVO.source;
        }
        if ((i4 & 16) != 0) {
            i5 = popupCardVO.sourceFrom;
        }
        if ((i4 & 32) != 0) {
            str11 = popupCardVO.schema;
        }
        if ((i4 & 64) != 0) {
            i6 = popupCardVO.platform;
        }
        if ((i4 & 128) != 0) {
            i7 = popupCardVO.productStatus;
        }
        if ((i4 & 256) != 0) {
            z2 = popupCardVO.isFromMessage;
        }
        if ((i4 & 512) != 0) {
            bVar2 = popupCardVO.sourceMessage;
        }
        if ((i4 & 1024) != 0) {
            str17 = popupCardVO.imageUrl;
        }
        if ((i4 & 2048) != 0) {
            str16 = popupCardVO.imageUrlKey;
        }
        if ((i4 & 4096) != 0) {
            j2 = popupCardVO.productId;
        }
        if ((i4 & 8192) != 0) {
            str18 = popupCardVO.fromMessageId;
        }
        if ((i4 & 16384) != 0) {
            str19 = popupCardVO.formatOriginPrice;
        }
        if ((32768 & i4) != 0) {
            str20 = popupCardVO.formatAvailablePrice;
        }
        if ((65536 & i4) != 0) {
            lVar2 = popupCardVO.flashSaleInfo;
        }
        if ((131072 & i4) != 0) {
            list2 = popupCardVO.promotionLogos;
        }
        if ((262144 & i4) != 0) {
            eVar2 = popupCardVO.promotionSkin;
        }
        if ((i4 & 524288) != 0) {
            promotionView3 = popupCardVO.promotionView;
        }
        return popupCardVO.copy(str12, str13, str14, str15, i5, str11, i6, i7, z2, bVar2, str17, str16, j2, str18, str19, str20, lVar2, list2, eVar2, promotionView3);
    }

    public final String component1() {
        return this.title;
    }

    public final C45781b component10() {
        return this.sourceMessage;
    }

    public final String component11() {
        return this.imageUrl;
    }

    public final String component12() {
        return this.imageUrlKey;
    }

    public final long component13() {
        return this.productId;
    }

    public final String component14() {
        return this.fromMessageId;
    }

    public final String component15() {
        return this.formatOriginPrice;
    }

    public final String component16() {
        return this.formatAvailablePrice;
    }

    public final C45746l component17() {
        return this.flashSaleInfo;
    }

    public final List<C45697h> component18() {
        return this.promotionLogos;
    }

    public final C45784e component19() {
        return this.promotionSkin;
    }

    public final String component2() {
        return this.price;
    }

    public final PromotionView component20() {
        return this.promotionView;
    }

    public final String component3() {
        return this.openUrl;
    }

    public final String component4() {
        return this.source;
    }

    public final int component5() {
        return this.sourceFrom;
    }

    public final String component6() {
        return this.schema;
    }

    public final int component7() {
        return this.platform;
    }

    public final int component8() {
        return this.productStatus;
    }

    public final boolean component9() {
        return this.isFromMessage;
    }

    public final PopupCardVO copy(String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, boolean z, C45781b bVar, String str6, String str7, long j, String str8, String str9, String str10, C45746l lVar, List<C45697h> list, C45784e eVar, PromotionView promotionView2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        return new PopupCardVO(str, str2, str3, str4, i, str5, i2, i3, z, bVar, str6, str7, j, str8, str9, str10, lVar, list, eVar, promotionView2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupCardVO)) {
            return false;
        }
        PopupCardVO popupCardVO = (PopupCardVO) obj;
        return C89219l.m154714a(this.title, popupCardVO.title) && C89219l.m154714a(this.price, popupCardVO.price) && C89219l.m154714a(this.openUrl, popupCardVO.openUrl) && C89219l.m154714a(this.source, popupCardVO.source) && this.sourceFrom == popupCardVO.sourceFrom && C89219l.m154714a(this.schema, popupCardVO.schema) && this.platform == popupCardVO.platform && this.productStatus == popupCardVO.productStatus && this.isFromMessage == popupCardVO.isFromMessage && C89219l.m154714a(this.sourceMessage, popupCardVO.sourceMessage) && C89219l.m154714a(this.imageUrl, popupCardVO.imageUrl) && C89219l.m154714a(this.imageUrlKey, popupCardVO.imageUrlKey) && this.productId == popupCardVO.productId && C89219l.m154714a(this.fromMessageId, popupCardVO.fromMessageId) && C89219l.m154714a(this.formatOriginPrice, popupCardVO.formatOriginPrice) && C89219l.m154714a(this.formatAvailablePrice, popupCardVO.formatAvailablePrice) && C89219l.m154714a(this.flashSaleInfo, popupCardVO.flashSaleInfo) && C89219l.m154714a(this.promotionLogos, popupCardVO.promotionLogos) && C89219l.m154714a(this.promotionSkin, popupCardVO.promotionSkin) && C89219l.m154714a(this.promotionView, popupCardVO.promotionView);
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.price;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.openUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.source;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + m88221x63de3ef4(this.sourceFrom)) * 31;
        String str5 = this.schema;
        int hashCode5 = (((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + m88221x63de3ef4(this.platform)) * 31) + m88221x63de3ef4(this.productStatus)) * 31;
        boolean z = this.isFromMessage;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode5 + i2) * 31;
        C45781b bVar = this.sourceMessage;
        int hashCode6 = (i5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str6 = this.imageUrl;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.imageUrlKey;
        int hashCode8 = (((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + m88222x63de3ef4(this.productId)) * 31;
        String str8 = this.fromMessageId;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.formatOriginPrice;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.formatAvailablePrice;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        C45746l lVar = this.flashSaleInfo;
        int hashCode12 = (hashCode11 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        List<C45697h> list = this.promotionLogos;
        int hashCode13 = (hashCode12 + (list != null ? list.hashCode() : 0)) * 31;
        C45784e eVar = this.promotionSkin;
        int hashCode14 = (hashCode13 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        PromotionView promotionView2 = this.promotionView;
        if (promotionView2 != null) {
            i = promotionView2.hashCode();
        }
        return hashCode14 + i;
    }

    public final String toString() {
        return "PopupCardVO(title=" + this.title + ", price=" + this.price + ", openUrl=" + this.openUrl + ", source=" + this.source + ", sourceFrom=" + this.sourceFrom + ", schema=" + this.schema + ", platform=" + this.platform + ", productStatus=" + this.productStatus + ", isFromMessage=" + this.isFromMessage + ", sourceMessage=" + this.sourceMessage + ", imageUrl=" + this.imageUrl + ", imageUrlKey=" + this.imageUrlKey + ", productId=" + this.productId + ", fromMessageId=" + this.fromMessageId + ", formatOriginPrice=" + this.formatOriginPrice + ", formatAvailablePrice=" + this.formatAvailablePrice + ", flashSaleInfo=" + this.flashSaleInfo + ", promotionLogos=" + this.promotionLogos + ", promotionSkin=" + this.promotionSkin + ", promotionView=" + this.promotionView + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.PopupCardVO$a */
    public static final class C45715a {
        static {
            Covode.recordClassIndex(54233);
        }

        private C45715a() {
        }

        public /* synthetic */ C45715a(byte b) {
            this();
        }

        /* renamed from: a */
        public static PopupCardVO m88223a(C45687a aVar) {
            long j;
            String str;
            String str2;
            C45804a aVar2;
            C45746l lVar;
            String str3 = "";
            C89219l.m154721d(aVar, str3);
            try {
                j = Long.parseLong(aVar.f106375a);
            } catch (Throwable unused) {
                j = 0;
            }
            String str4 = aVar.f106376b;
            String str5 = aVar.f106386l;
            String str6 = aVar.f106380f;
            String str7 = aVar.f106388n;
            int i = aVar.f106390p;
            String str8 = aVar.f106389o;
            int i2 = aVar.f106385k;
            int i3 = aVar.f106381g;
            if (aVar.f106384j == null || !(!aVar.f106384j.isEmpty())) {
                C45804a aVar3 = aVar.f106377c;
                if (aVar3 == null || (str = aVar3.f106714d) == null) {
                    str = str3;
                }
            } else {
                str = aVar.f106384j.get(0).f106714d;
            }
            if (aVar.f106384j == null || !(!aVar.f106384j.isEmpty()) ? !((aVar2 = aVar.f106377c) == null || (str2 = aVar2.f106715e) == null) : (str2 = aVar.f106384j.get(0).f106715e) != null) {
                str3 = str2;
            }
            String str9 = aVar.f106391q;
            String str10 = aVar.f106392r;
            C45695f fVar = aVar.f106394t;
            if (fVar != null) {
                lVar = new C45746l(fVar.f106411a, fVar.f106412b);
            } else {
                lVar = null;
            }
            return new PopupCardVO(str4, str5, str6, str7, i, str8, i2, i3, false, null, str, str3, j, null, str9, str10, lVar, aVar.f106395u, null, aVar.f106396v);
        }
    }

    public final C45746l getFlashSaleInfo() {
        return this.flashSaleInfo;
    }

    public final String getFormatAvailablePrice() {
        return this.formatAvailablePrice;
    }

    public final String getFormatOriginPrice() {
        return this.formatOriginPrice;
    }

    public final String getFromMessageId() {
        return this.fromMessageId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageUrlKey() {
        return this.imageUrlKey;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final String getPrice() {
        return this.price;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    public final List<C45697h> getPromotionLogos() {
        return this.promotionLogos;
    }

    public final C45784e getPromotionSkin() {
        return this.promotionSkin;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getSource() {
        return this.source;
    }

    public final int getSourceFrom() {
        return this.sourceFrom;
    }

    public final C45781b getSourceMessage() {
        return this.sourceMessage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isFromMessage() {
        return this.isFromMessage;
    }

    public final boolean isInStock() {
        if (this.productStatus == 90) {
            return true;
        }
        return false;
    }

    public final boolean isSoldOut() {
        if (this.productStatus == 80) {
            return true;
        }
        return false;
    }

    public final String getPromotionLogoLog() {
        boolean z;
        List<C45697h> list = this.promotionLogos;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = this.promotionLogos.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f106415b);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    public final void setPromotionSkin(C45784e eVar) {
        this.promotionSkin = eVar;
    }

    public PopupCardVO(String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, boolean z, C45781b bVar, String str6, String str7, long j, String str8, String str9, String str10, C45746l lVar, List<C45697h> list, C45784e eVar, PromotionView promotionView2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        this.title = str;
        this.price = str2;
        this.openUrl = str3;
        this.source = str4;
        this.sourceFrom = i;
        this.schema = str5;
        this.platform = i2;
        this.productStatus = i3;
        this.isFromMessage = z;
        this.sourceMessage = bVar;
        this.imageUrl = str6;
        this.imageUrlKey = str7;
        this.productId = j;
        this.fromMessageId = str8;
        this.formatOriginPrice = str9;
        this.formatAvailablePrice = str10;
        this.flashSaleInfo = lVar;
        this.promotionLogos = list;
        this.promotionSkin = eVar;
        this.promotionView = promotionView2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupCardVO(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, int r29, int r30, boolean r31, com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45781b r32, java.lang.String r33, java.lang.String r34, long r35, java.lang.String r37, java.lang.String r38, java.lang.String r39, com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.C45746l r40, java.util.List r41, com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45784e r42, com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView r43, int r44, p4600h.p4611f.p4613b.C89214g r45) {
        /*
            r22 = this;
            r1 = r44
            r11 = r33
            r0 = r1 & 1024(0x400, float:1.435E-42)
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x000b
            r11 = r12
        L_0x000b:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0039
        L_0x000f:
            r0 = r22
            r10 = r32
            r9 = r31
            r8 = r30
            r7 = r29
            r6 = r28
            r5 = r27
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r20 = r42
            r21 = r43
            r19 = r41
            r18 = r40
            r17 = r39
            r16 = r38
            r15 = r37
            r13 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0039:
            r12 = r34
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.PopupCardVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, boolean, com.ss.android.ugc.aweme.ecommercelive.business.common.a.b, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.l, java.util.List, com.ss.android.ugc.aweme.ecommercelive.business.common.a.e, com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView, int, h.f.b.g):void");
    }
}
