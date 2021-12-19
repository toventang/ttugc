package com.p2082ss.android.ugc.aweme.commercialize.egg.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import com.p2082ss.android.ugc.aweme.feed.model.EditHint;
import com.p2082ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a */
public final class C37795a {

    /* renamed from: a */
    public static C37787a f89247a;

    /* renamed from: b */
    public static C37787a f89248b;

    /* renamed from: c */
    public static List<C37787a> f89249c;

    /* renamed from: d */
    public static List<? extends EditHint> f89250d;

    /* renamed from: e */
    public static final C37795a f89251e = new C37795a();

    private C37795a() {
    }

    static {
        Covode.recordClassIndex(45242);
    }

    /* renamed from: a */
    public static boolean m76435a(ItemCommentEggData itemCommentEggData) {
        if (itemCommentEggData == null) {
            return false;
        }
        String[] strArr = {itemCommentEggData.getEggId(), itemCommentEggData.getFileType(), itemCommentEggData.getMaterialUrl(), itemCommentEggData.getRegex()};
        int i = 0;
        while (!TextUtils.isEmpty(strArr[i])) {
            i++;
            if (i >= 4) {
                return true;
            }
        }
        return false;
    }
}
