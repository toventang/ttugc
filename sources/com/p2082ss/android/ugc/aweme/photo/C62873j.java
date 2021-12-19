package com.p2082ss.android.ugc.aweme.photo;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.photo.j */
final /* synthetic */ class C62873j implements AbstractC88433f {

    /* renamed from: a */
    private final PhotoModule f142586a;

    /* renamed from: b */
    private final long f142587b;

    static {
        Covode.recordClassIndex(73704);
    }

    C62873j(PhotoModule photoModule, long j) {
        this.f142586a = photoModule;
        this.f142587b = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        PhotoModule photoModule = this.f142586a;
        long j = this.f142587b;
        Pair pair = (Pair) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (long) ((int) (System.currentTimeMillis() - j)));
        C40982q.m82523a("aweme_recorder_take_photo_duration", jSONObject, (JSONObject) null);
        photoModule.f142537b.mo105765a((String) pair.first, (List) pair.second);
        photoModule.f142539d = false;
    }
}
