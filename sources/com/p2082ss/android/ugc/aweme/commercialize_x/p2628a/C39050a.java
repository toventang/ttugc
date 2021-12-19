package com.p2082ss.android.ugc.aweme.commercialize_x.p2628a;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.profile.impl.C38433b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.impl.C38444e;
import com.p2082ss.android.ugc.aweme.commercialize.profile.impl.p2614a.C38431a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.AbstractC39049b;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.C33135a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.C33143b;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.C33145c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.button.C33210a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.C33296a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.C33304a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.C33261c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2298f.C33264a;

/* renamed from: com.ss.android.ugc.aweme.commercialize_x.a.a */
public final class C39050a {

    /* renamed from: a */
    public static final C39050a f92204a = new C39050a();

    /* renamed from: b */
    private static final SparseArray<Class<? extends AbstractC39049b>> f92205b = new SparseArray<>();

    /* renamed from: c */
    private static final SparseArray<AbstractC39049b> f92206c = new SparseArray<>();

    private C39050a() {
    }

    static {
        Covode.recordClassIndex(46661);
    }

    /* renamed from: a */
    public static void m79242a() {
        SparseArray<Class<? extends AbstractC39049b>> sparseArray = C39051b.f92207a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            f92205b.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        SparseArray<Class<? extends AbstractC39049b>> sparseArray2 = f92205b;
        sparseArray2.put(1, C33264a.class);
        sparseArray2.put(4, C33261c.class);
        sparseArray2.put(2, C33210a.class);
        sparseArray2.put(3, C33304a.class);
        sparseArray2.put(5, C33135a.class);
        sparseArray2.put(6, C33143b.class);
        sparseArray2.put(8, C33145c.class);
        sparseArray2.put(15, C38444e.class);
        sparseArray2.put(16, C38433b.class);
        sparseArray2.put(21, C38431a.class);
        sparseArray2.put(18, C33296a.class);
    }

    /* renamed from: a */
    public static final AbstractC39049b m79241a(int i) {
        Class<? extends AbstractC39049b> cls;
        try {
            SparseArray<AbstractC39049b> sparseArray = f92206c;
            AbstractC39049b bVar = sparseArray.get(i);
            if (bVar != null || (cls = f92205b.get(i)) == null) {
                return bVar;
            }
            AbstractC39049b bVar2 = (AbstractC39049b) cls.newInstance();
            sparseArray.put(i, bVar2);
            return bVar2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
