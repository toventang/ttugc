package com.p1795d.p1796a.p1797a.p1798a.p1803d;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1803d.AbstractC23792a;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23798b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.d.d */
public final class C23796d implements AbstractC23792a {

    /* renamed from: a */
    private final int[] f56298a = new int[2];

    static {
        Covode.recordClassIndex(27904);
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1803d.AbstractC23792a
    /* renamed from: a */
    public final JSONObject mo39261a(View view) {
        if (view == null) {
            return C23798b.m44982a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f56298a);
        int[] iArr = this.f56298a;
        return C23798b.m44982a(iArr[0], iArr[1], width, height);
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1803d.AbstractC23792a
    /* renamed from: a */
    public final void mo39262a(View view, JSONObject jSONObject, AbstractC23792a.AbstractC23793a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z || Build.VERSION.SDK_INT < 21) {
                while (i < viewGroup.getChildCount()) {
                    aVar.mo39263a(viewGroup.getChildAt(i), this, jSONObject);
                    i++;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get(it.next())).iterator();
                while (it2.hasNext()) {
                    aVar.mo39263a((View) it2.next(), this, jSONObject);
                }
            }
        }
    }
}
