package com.p2082ss.android.ugc.aweme.p3452ml.p3455b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30093n;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;

/* renamed from: com.ss.android.ugc.aweme.ml.b.a */
public final class C60014a implements AbstractC30093n {

    /* renamed from: a */
    private MLModel f136674a;

    static {
        Covode.recordClassIndex(70477);
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: c */
    public final boolean mo53469c() {
        if (this.f136674a != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: a */
    public final String mo53467a() {
        MLModel mLModel = this.f136674a;
        if (mLModel == null) {
            return "";
        }
        return mLModel.packageUrl;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: b */
    public final String mo53468b() {
        MLModel mLModel = this.f136674a;
        if (mLModel == null || TextUtils.isEmpty(mLModel.scene)) {
            return "default";
        }
        return this.f136674a.scene;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: d */
    public final String mo53470d() {
        MLModel mLModel = this.f136674a;
        if (mLModel == null) {
            return "";
        }
        if (mLModel.type != 2 && this.f136674a.type == 3) {
            return "bytenn";
        }
        return "tflite";
    }

    public final String toString() {
        return "AppMLModelConfig{model=" + this.f136674a + '}';
    }

    public C60014a(MLModel mLModel) {
        this.f136674a = mLModel;
    }
}
