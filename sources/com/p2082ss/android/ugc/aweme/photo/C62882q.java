package com.p2082ss.android.ugc.aweme.photo;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.ss.android.ugc.aweme.photo.q */
final /* synthetic */ class C62882q implements AbstractC88434g {

    /* renamed from: a */
    private final PhotoModule f142609a;

    /* renamed from: b */
    private final String f142610b;

    static {
        Covode.recordClassIndex(73714);
    }

    C62882q(PhotoModule photoModule, String str) {
        this.f142609a = photoModule;
        this.f142610b = str;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        PhotoModule photoModule = this.f142609a;
        String str = this.f142610b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        if (photoModule.f142541f != null) {
            arrayList.addAll(photoModule.f142541f);
        }
        return new Pair(str, arrayList);
    }
}
