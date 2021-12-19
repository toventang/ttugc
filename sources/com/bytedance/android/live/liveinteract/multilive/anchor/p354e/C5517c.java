package com.bytedance.android.live.liveinteract.multilive.anchor.p354e;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveAnchorSwitchFrequency;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.e.c */
public final class C5517c {

    /* renamed from: a */
    public static final int f14098a = MultiLiveAnchorSwitchFrequency.INSTANCE.getValue();

    /* renamed from: b */
    public static final ArrayList<Long> f14099b = new ArrayList<>();

    /* renamed from: c */
    public static final C5517c f14100c = new C5517c();

    /* renamed from: d */
    private static final ArrayList<Long> f14101d = new ArrayList<>();

    private C5517c() {
    }

    static {
        Covode.recordClassIndex(6112);
    }

    /* renamed from: a */
    public static boolean m12023a() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = f14101d;
        if (arrayList.size() < f14098a) {
            arrayList.add(Long.valueOf(currentTimeMillis));
            return true;
        }
        Long l = arrayList.get(0);
        C89219l.m154716b(l, "");
        if (currentTimeMillis - l.longValue() < 60000) {
            return false;
        }
        arrayList.remove(0);
        arrayList.add(Long.valueOf(currentTimeMillis));
        return true;
    }

    /* renamed from: a */
    public static boolean m12024a(View view) {
        C89219l.m154721d(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] < C3966y.m9662b() / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final EnumC4422k m12022a(int i, int i2) {
        if (i == 1) {
            if (i2 == 0) {
                return EnumC4422k.FLOATING_FIX;
            }
        } else if (i != 1) {
            if (i == 0) {
                if (i2 == 0) {
                    return EnumC4422k.GRID_FIX;
                }
                if (i2 == 1) {
                    return EnumC4422k.GRID;
                }
            }
            return EnumC4422k.NORMAL;
        }
        if (i2 == 1) {
            return EnumC4422k.FLOATING;
        }
        return EnumC4422k.NORMAL;
    }
}
