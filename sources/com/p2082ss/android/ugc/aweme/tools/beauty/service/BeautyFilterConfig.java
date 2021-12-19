package com.p2082ss.android.ugc.aweme.tools.beauty.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.data.NoneComposer;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77856b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig */
public final class BeautyFilterConfig {
    public static final C78043a Companion = new C78043a((byte) 0);
    private final int abGroup;
    private boolean autoApplyBeauty;
    private C77856b dataConfig;
    private EnumC77817a defaultGender;
    private String extraJson;
    private final boolean hasTitle;
    private boolean isConvertKey;
    private int itemShape;
    private NoneComposer noneItem;
    private boolean primaryBeautyPanelEnable;
    private final String sequenceKey;
    private boolean uLike2ComposerTagValueConvert;
    private boolean useResetAll;

    static {
        Covode.recordClassIndex(91133);
    }

    public static /* synthetic */ BeautyFilterConfig copy$default(BeautyFilterConfig beautyFilterConfig, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = beautyFilterConfig.abGroup;
        }
        if ((i2 & 2) != 0) {
            str = beautyFilterConfig.sequenceKey;
        }
        if ((i2 & 4) != 0) {
            z = beautyFilterConfig.hasTitle;
        }
        return beautyFilterConfig.copy(i, str, z);
    }

    public static /* synthetic */ void getItemShape$annotations() {
    }

    public static /* synthetic */ void getUseResetAll$annotations() {
    }

    public final int component1() {
        return this.abGroup;
    }

    public final String component2() {
        return this.sequenceKey;
    }

    public final boolean component3() {
        return this.hasTitle;
    }

    public final BeautyFilterConfig copy(int i, String str, boolean z) {
        C89219l.m154721d(str, "");
        return new BeautyFilterConfig(i, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautyFilterConfig)) {
            return false;
        }
        BeautyFilterConfig beautyFilterConfig = (BeautyFilterConfig) obj;
        return this.abGroup == beautyFilterConfig.abGroup && C89219l.m154714a(this.sequenceKey, beautyFilterConfig.sequenceKey) && this.hasTitle == beautyFilterConfig.hasTitle;
    }

    public final int hashCode() {
        int i = this.abGroup * 31;
        String str = this.sequenceKey;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.hasTitle;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "BeautyFilterConfig(abGroup=" + this.abGroup + ", sequenceKey=" + this.sequenceKey + ", hasTitle=" + this.hasTitle + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig$a */
    public static final class C78043a {
        static {
            Covode.recordClassIndex(91134);
        }

        private C78043a() {
        }

        public /* synthetic */ C78043a(byte b) {
            this();
        }
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final boolean getAutoApplyBeauty() {
        return this.autoApplyBeauty;
    }

    public final C77856b getDataConfig() {
        return this.dataConfig;
    }

    public final EnumC77817a getDefaultGender() {
        return this.defaultGender;
    }

    public final String getExtraJson() {
        return this.extraJson;
    }

    public final boolean getHasTitle() {
        return this.hasTitle;
    }

    public final int getItemShape() {
        return this.itemShape;
    }

    public final NoneComposer getNoneItem() {
        return this.noneItem;
    }

    public final boolean getPrimaryBeautyPanelEnable() {
        return this.primaryBeautyPanelEnable;
    }

    public final String getSequenceKey() {
        return this.sequenceKey;
    }

    public final boolean getULike2ComposerTagValueConvert() {
        return this.uLike2ComposerTagValueConvert;
    }

    public final boolean getUseResetAll() {
        return this.useResetAll;
    }

    public final boolean isConvertKey() {
        return this.isConvertKey;
    }

    public final void setAutoApplyBeauty(boolean z) {
        this.autoApplyBeauty = z;
    }

    public final void setConvertKey(boolean z) {
        this.isConvertKey = z;
    }

    public final void setItemShape(int i) {
        this.itemShape = i;
    }

    public final void setNoneItem(NoneComposer noneComposer) {
        this.noneItem = noneComposer;
    }

    public final void setPrimaryBeautyPanelEnable(boolean z) {
        this.primaryBeautyPanelEnable = z;
    }

    public final void setULike2ComposerTagValueConvert(boolean z) {
        this.uLike2ComposerTagValueConvert = z;
    }

    public final void setUseResetAll(boolean z) {
        this.useResetAll = z;
    }

    public final void setDataConfig(C77856b bVar) {
        C89219l.m154721d(bVar, "");
        this.dataConfig = bVar;
    }

    public final void setDefaultGender(EnumC77817a aVar) {
        C89219l.m154721d(aVar, "");
        this.defaultGender = aVar;
    }

    public final void setExtraJson(String str) {
        C89219l.m154721d(str, "");
        this.extraJson = str;
    }

    public BeautyFilterConfig(int i, String str, boolean z) {
        C89219l.m154721d(str, "");
        this.abGroup = i;
        this.sequenceKey = str;
        this.hasTitle = z;
        this.useResetAll = true;
        this.extraJson = "beautify";
        this.defaultGender = EnumC77817a.FEMALE;
        this.dataConfig = new C77856b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautyFilterConfig(int i, String str, boolean z, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? true : z);
    }
}
