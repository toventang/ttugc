package com.bytedance.ies.dmt.p1194ui.common.rebranding;

import android.content.res.Resources;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.c */
public final class C17182c {
    static {
        Covode.recordClassIndex(19641);
    }

    /* renamed from: a */
    public static int m31717a(TextView textView, ArrayList<Integer> arrayList, int i, int i2) {
        Resources resources = textView.getResources();
        Iterator<Integer> it = arrayList.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            Integer next = it.next();
            int measureText = ((int) textView.getPaint().measureText(resources.getString(next.intValue()))) + textView.getPaddingLeft() + textView.getPaddingRight();
            resources.getString(next.intValue());
            i3 = Math.max(i3, measureText);
        }
        if (i3 >= i) {
            i = i3;
        }
        return i > i2 ? i2 : i;
    }
}
