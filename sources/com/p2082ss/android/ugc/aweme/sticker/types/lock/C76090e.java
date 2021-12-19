package com.p2082ss.android.ugc.aweme.sticker.types.lock;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.LockStickerTextBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.lock.e */
public final class C76090e {

    /* renamed from: a */
    public static ArrayList<String> f170957a = new ArrayList<>();

    /* renamed from: b */
    public static boolean f170958b = false;

    /* renamed from: c */
    private static List<LockStickerTextBean> f170959c = new ArrayList();

    static {
        Covode.recordClassIndex(89036);
    }

    /* renamed from: a */
    public static ArrayList<String> m133432a() {
        Iterator<String> it = f170957a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(f170957a);
        arrayList.addAll(C76087c.m133426a().mo119822b());
        return arrayList;
    }
}
