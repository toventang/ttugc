package com.bytedance.android.live.liveinteract.multilive.p360c;

import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.c.n */
public final class C5601n {
    @AbstractC27891c(mo46611a = "layout_type")

    /* renamed from: a */
    public String f14241a;
    @AbstractC27891c(mo46611a = "users")

    /* renamed from: b */
    public final ArrayList<C5602o> f14242b;

    static {
        Covode.recordClassIndex(6198);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5601n)) {
            return false;
        }
        C5601n nVar = (C5601n) obj;
        return C89219l.m154714a(this.f14241a, nVar.f14241a) && C89219l.m154714a(this.f14242b, nVar.f14242b);
    }

    public final int hashCode() {
        String str = this.f14241a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<C5602o> arrayList = this.f14242b;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MultiLiveRTCMessageParam(layoutType=" + this.f14241a + ", users=" + this.f14242b + ")";
    }

    public /* synthetic */ C5601n() {
        this("", new ArrayList());
    }

    /* renamed from: a */
    public final EnumC4422k mo11375a() {
        String str = this.f14241a;
        switch (str.hashCode()) {
            case -2111025230:
                if (str.equals("float_fix")) {
                    return EnumC4422k.FLOATING_FIX;
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return EnumC4422k.GRID;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    return EnumC4422k.FLOATING;
                }
                break;
            case 318387100:
                if (str.equals("grid_fix")) {
                    return EnumC4422k.GRID_FIX;
                }
                break;
        }
        return EnumC4422k.NORMAL;
    }

    private C5601n(String str, ArrayList<C5602o> arrayList) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(arrayList, "");
        this.f14241a = str;
        this.f14242b = arrayList;
    }
}
