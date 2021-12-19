package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.ies.powerpreload.e */
public final class C17813e {

    /* renamed from: a */
    public static final ArrayList<C17807d> f42505a;

    /* renamed from: b */
    public static final C17813e f42506b = new C17813e();

    private C17813e() {
    }

    static {
        Covode.recordClassIndex(20377);
        ArrayList<C17807d> arrayList = new ArrayList<>();
        f42505a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("com.ss.android.ugc.aweme.challenge.api.ChallengeNetPreload");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("//challenge/detail");
        arrayList3.add("//aweme/challenge/detail");
        arrayList.add(new C17807d(arrayList2, arrayList3, "com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("com.ss.android.ugc.aweme.mix.api.MixDetailNetPreload");
        arrayList4.add("com.ss.android.ugc.aweme.mix.api.MixListNetPreload");
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("aweme://mix/detail");
        arrayList.add(new C17807d(arrayList4, arrayList5, "com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", null));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add("com.ss.android.ugc.aweme.music.ui.api.MusicDetailNetPreload");
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add("//music/detail");
        arrayList7.add("aweme://music/detail/");
        arrayList.add(new C17807d(arrayList6, arrayList7, "com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", null));
    }
}
