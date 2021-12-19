package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a */
public abstract class AbstractC35557a extends AbstractC34586a {

    /* renamed from: a */
    private SparseArray f83840a;

    static {
        Covode.recordClassIndex(42781);
    }

    /* renamed from: b */
    public String mo62536b() {
        return "";
    }

    /* renamed from: c */
    public void mo62537c() {
        SparseArray sparseArray = this.f83840a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo62537c();
    }

    /* renamed from: a */
    public JSONObject mo62535a() {
        return new JSONObject();
    }
}
