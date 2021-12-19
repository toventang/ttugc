package com.p2082ss.android.ugc.aweme.share.p3754i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.share.data.C85184a;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.i.b */
public final /* synthetic */ class C68961b implements Comparator {

    /* renamed from: a */
    private final Map f154280a;

    /* renamed from: b */
    private final List f154281b;

    static {
        Covode.recordClassIndex(81275);
    }

    C68961b(Map map, List list) {
        this.f154280a = map;
        this.f154281b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map map = this.f154280a;
        List<C85184a> list = this.f154281b;
        String str = (String) obj;
        String str2 = (String) obj2;
        int intValue = ((Integer) map.get(str2)).intValue() - ((Integer) map.get(str)).intValue();
        if (intValue != 0) {
            return intValue;
        }
        long j = 0;
        long j2 = 0;
        for (C85184a aVar : list) {
            if (TextUtils.equals(aVar.f190608c, str) && j2 <= 0) {
                j2 = aVar.f190607b.longValue();
            } else if (TextUtils.equals(aVar.f190608c, str2) && j <= 0) {
                j = aVar.f190607b.longValue();
            }
        }
        return (int) (j - j2);
    }
}
