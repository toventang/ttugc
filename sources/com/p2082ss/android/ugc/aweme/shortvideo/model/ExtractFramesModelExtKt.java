package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27917g;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.tools.C84401c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt */
public final class ExtractFramesModelExtKt {
    static {
        Covode.recordClassIndex(84577);
    }

    public static final ExtractFramesModel string2Model(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ExtractFramesModel extractFramesModel = null;
        if (z) {
            return null;
        }
        try {
            extractFramesModel = (ExtractFramesModel) new C27917g().mo46682b().mo46670a(str, ExtractFramesModel.class);
            return extractFramesModel;
        } catch (C28027t unused) {
            C84401c.f188722f.mo123660b("parser frames data error:\n".concat(String.valueOf(str)));
            return extractFramesModel;
        }
    }
}
