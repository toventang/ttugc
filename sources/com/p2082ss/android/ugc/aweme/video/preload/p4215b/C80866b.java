package com.p2082ss.android.ugc.aweme.video.preload.p4215b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.AbstractC59992g;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a;
import com.p2082ss.android.ugc.aweme.video.C80750l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.b.b */
public final class C80866b implements AbstractC75215a {

    /* renamed from: a */
    private MLModel f180804a = AbstractC59992g.C59993a.m109510a();

    static {
        Covode.recordClassIndex(94164);
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a
    /* renamed from: c */
    public final boolean mo118404c() {
        if (this.f180804a != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a
    /* renamed from: e */
    public final String mo118406e() {
        return C58071d.m104914h();
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a
    /* renamed from: a */
    public final String mo118402a() {
        MLModel mLModel = this.f180804a;
        if (mLModel == null) {
            return "";
        }
        return mLModel.packageUrl;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a
    /* renamed from: b */
    public final String mo118403b() {
        if (TextUtils.isEmpty(this.f180804a.scene)) {
            return "default";
        }
        return this.f180804a.scene;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a
    /* renamed from: d */
    public final String mo118405d() {
        MLModel mLModel = this.f180804a;
        if (mLModel == null) {
            return "";
        }
        if (mLModel.type != 2 && this.f180804a.type == 3) {
            return "bytenn";
        }
        return "tflite";
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a
    /* renamed from: g */
    public final int mo118408g() {
        return C80750l.m140052a(C17867d.m33078a()).mo123955b(C17867d.m33078a());
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a
    /* renamed from: f */
    public final String mo118407f() {
        Context a = C17867d.m33078a();
        if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132254f = NetworkUtils.getNetworkAccessType(a);
        }
        return C58029j.f132254f;
    }
}
