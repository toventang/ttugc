package com.bytedance.android.livesdk.gift.p544b;

import com.bytedance.android.livesdk.livesetting.gift.HideGiftIconForUserSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.b.a */
public final class C8789a {
    static {
        Covode.recordClassIndex(9667);
    }

    /* renamed from: com.bytedance.android.livesdk.gift.b.a$b */
    public enum EnumC8791b {
        YES,
        NO,
        WHATEVER;

        static {
            Covode.recordClassIndex(9669);
        }
    }

    /* JADX WARN: Init of enum SHOW can be incorrect */
    /* JADX WARN: Init of enum HIDE can be incorrect */
    /* renamed from: com.bytedance.android.livesdk.gift.b.a$a */
    public enum EnumC8790a {
        SHOW("Show the gift icon", r3),
        HIDE("Hide the gift icon", r3),
        GREY("Show the grey gift icon", null);
        

        /* renamed from: a */
        String f21659a;

        /* renamed from: b */
        List<C8792c> f21660b;

        static {
            Covode.recordClassIndex(9668);
            LinkedList linkedList = new LinkedList();
            EnumC8791b bVar = EnumC8791b.YES;
            EnumC8791b bVar2 = EnumC8791b.WHATEVER;
            EnumC8791b bVar3 = EnumC8791b.YES;
            linkedList.add(new C8792c(bVar, bVar2, bVar3, bVar3, EnumC8791b.NO));
            EnumC8791b bVar4 = EnumC8791b.NO;
            EnumC8791b bVar5 = EnumC8791b.WHATEVER;
            EnumC8791b bVar6 = EnumC8791b.YES;
            linkedList.add(new C8792c(bVar4, bVar5, bVar6, bVar6, EnumC8791b.WHATEVER));
            LinkedList linkedList2 = new LinkedList();
            EnumC8791b bVar7 = EnumC8791b.WHATEVER;
            EnumC8791b bVar8 = EnumC8791b.NO;
            EnumC8791b bVar9 = EnumC8791b.WHATEVER;
            linkedList2.add(new C8792c(bVar7, bVar8, bVar8, bVar9, bVar9));
        }

        private EnumC8790a(String str, List list) {
            this.f21659a = str;
            this.f21660b = list;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.b.a$c */
    public static class C8792c {

        /* renamed from: a */
        EnumC8791b f21663a;

        /* renamed from: b */
        EnumC8791b f21664b;

        /* renamed from: c */
        EnumC8791b f21665c;

        /* renamed from: d */
        EnumC8791b f21666d;

        /* renamed from: e */
        EnumC8791b f21667e;

        static {
            Covode.recordClassIndex(9670);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo15076a(C8792c cVar) {
            boolean z = !HideGiftIconForUserSetting.INSTANCE.getValue();
            boolean value = LiveAnchorGiftDisableSetting.INSTANCE.getValue();
            if ((this.f21663a == EnumC8791b.YES && cVar.f21663a == EnumC8791b.NO) || (this.f21663a == EnumC8791b.NO && cVar.f21663a == EnumC8791b.YES)) {
                return false;
            }
            if ((this.f21664b == EnumC8791b.YES && cVar.f21664b == EnumC8791b.NO) || (this.f21664b == EnumC8791b.NO && cVar.f21664b == EnumC8791b.YES)) {
                return false;
            }
            if (!z ? this.f21665c == EnumC8791b.YES : this.f21665c == EnumC8791b.NO) {
                return false;
            }
            if ((this.f21666d == EnumC8791b.YES && cVar.f21666d == EnumC8791b.NO) || (this.f21666d == EnumC8791b.NO && cVar.f21666d == EnumC8791b.YES)) {
                return false;
            }
            if (!value ? this.f21667e == EnumC8791b.YES : this.f21667e == EnumC8791b.NO) {
                return false;
            }
            return true;
        }

        C8792c(EnumC8791b bVar, EnumC8791b bVar2, EnumC8791b bVar3, EnumC8791b bVar4, EnumC8791b bVar5) {
            this.f21663a = bVar;
            this.f21664b = bVar2;
            this.f21665c = bVar3;
            this.f21666d = bVar4;
            this.f21667e = bVar5;
        }
    }

    /* renamed from: b */
    public static C8792c m17099b(boolean z, boolean z2, boolean z3) {
        EnumC8791b bVar;
        EnumC8791b bVar2;
        EnumC8791b bVar3;
        if (z) {
            bVar = EnumC8791b.YES;
        } else {
            bVar = EnumC8791b.NO;
        }
        if (z2) {
            bVar2 = EnumC8791b.YES;
        } else {
            bVar2 = EnumC8791b.NO;
        }
        if (z3) {
            bVar3 = EnumC8791b.YES;
        } else {
            bVar3 = EnumC8791b.NO;
        }
        return new C8792c(bVar, bVar2, EnumC8791b.WHATEVER, bVar3, EnumC8791b.WHATEVER);
    }

    /* renamed from: a */
    public static EnumC8790a m17098a(boolean z, boolean z2, boolean z3) {
        C8792c b = m17099b(z, z2, z3);
        EnumC8790a[] values = EnumC8790a.values();
        for (EnumC8790a aVar : values) {
            if (aVar.f21660b != null) {
                boolean z4 = false;
                for (C8792c cVar : aVar.f21660b) {
                    if (cVar.mo15076a(b)) {
                        z4 = true;
                    }
                }
                if (z4) {
                    return aVar;
                }
            }
        }
        return EnumC8790a.GREY;
    }
}
