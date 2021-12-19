package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.p2167e.p2168a.C30140d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.n */
public class C40708n extends C30140d {
    static {
        Covode.recordClassIndex(48554);
    }

    public void onPause() {
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    public C40708n(Context context) {
        super(context);
    }

    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
    }

    public C40708n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C40708n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
