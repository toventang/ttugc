package com.p2082ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify */
public final class ComposerBeautyExtraBeautify {
    private List<ItemsBean> items;
    private String resource;

    static {
        Covode.recordClassIndex(41804);
    }

    public ComposerBeautyExtraBeautify() {
        this(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify$ItemsBean */
    public static final class ItemsBean {
        private boolean doubleDirection;
        private int max;
        private int min;
        private String name;
        private String tag;
        private int value;

        static {
            Covode.recordClassIndex(41805);
        }

        public ItemsBean() {
            this(false, 0, 0, 0, null, null, 63, null);
        }

        public static /* synthetic */ ItemsBean copy$default(ItemsBean itemsBean, boolean z, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z = itemsBean.doubleDirection;
            }
            if ((i4 & 2) != 0) {
                i = itemsBean.min;
            }
            if ((i4 & 4) != 0) {
                i2 = itemsBean.max;
            }
            if ((i4 & 8) != 0) {
                i3 = itemsBean.value;
            }
            if ((i4 & 16) != 0) {
                str = itemsBean.tag;
            }
            if ((i4 & 32) != 0) {
                str2 = itemsBean.name;
            }
            return itemsBean.copy(z, i, i2, i3, str, str2);
        }

        public final boolean component1() {
            return this.doubleDirection;
        }

        public final int component2() {
            return this.min;
        }

        public final int component3() {
            return this.max;
        }

        public final int component4() {
            return this.value;
        }

        public final String component5() {
            return this.tag;
        }

        public final String component6() {
            return this.name;
        }

        public final ItemsBean copy(boolean z, int i, int i2, int i3, String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return new ItemsBean(z, i, i2, i3, str, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemsBean)) {
                return false;
            }
            ItemsBean itemsBean = (ItemsBean) obj;
            return this.doubleDirection == itemsBean.doubleDirection && this.min == itemsBean.min && this.max == itemsBean.max && this.value == itemsBean.value && C89219l.m154714a(this.tag, itemsBean.tag) && C89219l.m154714a(this.name, itemsBean.name);
        }

        public final int hashCode() {
            boolean z = this.doubleDirection;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = ((((((i * 31) + this.min) * 31) + this.max) * 31) + this.value) * 31;
            String str = this.tag;
            int i5 = 0;
            int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i5 = str2.hashCode();
            }
            return hashCode + i5;
        }

        public final String toString() {
            return "ItemsBean(doubleDirection=" + this.doubleDirection + ", min=" + this.min + ", max=" + this.max + ", value=" + this.value + ", tag=" + this.tag + ", name=" + this.name + ")";
        }

        public final boolean getDoubleDirection() {
            return this.doubleDirection;
        }

        public final int getMax() {
            return this.max;
        }

        public final int getMin() {
            return this.min;
        }

        public final String getName() {
            return this.name;
        }

        public final String getTag() {
            return this.tag;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setDoubleDirection(boolean z) {
            this.doubleDirection = z;
        }

        public final void setMax(int i) {
            this.max = i;
        }

        public final void setMin(int i) {
            this.min = i;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        public final void setName(String str) {
            C89219l.m154721d(str, "");
            this.name = str;
        }

        public final void setTag(String str) {
            C89219l.m154721d(str, "");
            this.tag = str;
        }

        public ItemsBean(boolean z, int i, int i2, int i3, String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.doubleDirection = z;
            this.min = i;
            this.max = i2;
            this.value = i3;
            this.tag = str;
            this.name = str2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ItemsBean(boolean r8, int r9, int r10, int r11, java.lang.String r12, java.lang.String r13, int r14, p4600h.p4611f.p4613b.C89214g r15) {
            /*
                r7 = this;
                r5 = r12
                r3 = r10
                r2 = r9
                r1 = r8
                r0 = r14 & 1
                r4 = 0
                if (r0 == 0) goto L_0x000a
                r1 = 0
            L_0x000a:
                r0 = r14 & 2
                if (r0 == 0) goto L_0x000f
                r2 = 0
            L_0x000f:
                r0 = r14 & 4
                if (r0 == 0) goto L_0x0014
                r3 = 0
            L_0x0014:
                r0 = r14 & 8
                if (r0 == 0) goto L_0x002a
            L_0x0018:
                r0 = r14 & 16
                java.lang.String r6 = ""
                if (r0 == 0) goto L_0x001f
                r5 = r6
            L_0x001f:
                r0 = r14 & 32
                if (r0 == 0) goto L_0x0028
            L_0x0023:
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            L_0x0028:
                r6 = r13
                goto L_0x0023
            L_0x002a:
                r4 = r11
                goto L_0x0018
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean.<init>(boolean, int, int, int, java.lang.String, java.lang.String, int, h.f.b.g):void");
        }
    }

    public final List<ItemsBean> getItems() {
        return this.items;
    }

    public final String getResource() {
        return this.resource;
    }

    public final void setItems(List<ItemsBean> list) {
        this.items = list;
    }

    public final void setResource(String str) {
        this.resource = str;
    }

    public ComposerBeautyExtraBeautify(String str, List<ItemsBean> list) {
        this.resource = str;
        this.items = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposerBeautyExtraBeautify(String str, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
