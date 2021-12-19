package com.twitter.sdk.android.core.internal.oauth;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.C87808q;
import com.twitter.sdk.android.core.internal.C87750q;
import com.twitter.sdk.android.core.internal.p4498a.C87716e;
import java.text.Normalizer;
import okhttp3.C90208y;
import p4640l.C89782m;
import p4640l.p4641a.p4642a.C89710a;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.d */
public abstract class AbstractC87747d {

    /* renamed from: b */
    public final C87808q f199297b;

    /* renamed from: c */
    public final C87750q f199298c;

    /* renamed from: d */
    public final String f199299d = C87750q.m152718a(Normalizer.normalize("TwitterAndroidSDK" + '/' + "3.2.0.11" + ' ' + Build.MODEL + '/' + Build.VERSION.RELEASE + " (" + Build.MANUFACTURER + ';' + Build.MODEL + ';' + Build.BRAND + ';' + Build.PRODUCT + ')', Normalizer.Form.NFD));

    /* renamed from: e */
    public final C89782m f199300e;

    static {
        Covode.recordClassIndex(103743);
    }

    AbstractC87747d(C87808q qVar, C87750q qVar2) {
        this.f199297b = qVar;
        this.f199298c = qVar2;
        this.f199300e = new C89782m.C89784a().mo144323a(qVar2.f199302a).mo144325a(new C90208y.C90210a().mo145096a(new C87748e(this)).mo145092a(C87716e.m152644a()).mo145103d()).mo144324a(C89710a.m155746a()).mo144326a();
    }
}
