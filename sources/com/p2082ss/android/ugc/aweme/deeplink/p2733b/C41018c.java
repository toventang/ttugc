package com.p2082ss.android.ugc.aweme.deeplink.p2733b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.C0576b;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34266aw;
import com.p2082ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.deeplink.C41035d;
import com.p2082ss.android.ugc.aweme.deeplink.C41051n;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.b.c */
public final class C41018c extends AbstractC41017b {
    static {
        Covode.recordClassIndex(48888);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2733b.AbstractC41017b
    /* renamed from: a */
    public final C89378p<Boolean, String> mo70236a(C41035d dVar, HashMap<String, Object> hashMap) {
        C0576b a;
        Class<?> cls;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(hashMap, "");
        Uri uri = dVar.f95922e;
        Activity activity = dVar.f95921d;
        Bundle bundle = null;
        AbstractC34266aw awVar = null;
        for (AbstractC34266aw awVar2 : C41051n.C41052a.m82700b()) {
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            C89219l.m154716b(scheme, "");
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            C89219l.m154716b(host, "");
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            C89219l.m154716b(path, "");
            if (awVar2.mo59964a(uri, scheme, host, path)) {
                awVar = awVar2;
            }
        }
        if (!(awVar == null || (cls = awVar.getClass()) == null)) {
            cls.getSimpleName();
        }
        m82633a(uri, dVar, hashMap);
        Object obj = dVar.f95919b.get("from_token");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = dVar.f95919b.get("is_from_notification");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (awVar != null) {
            String host2 = uri.getHost();
            if (host2 == null) {
                host2 = "";
            }
            C89219l.m154716b(host2, "");
            String path2 = uri.getPath();
            if (path2 == null) {
                path2 = "";
            }
            C89219l.m154716b(path2, "");
            Intent a2 = awVar.mo59958a(activity, uri, host2, path2, str, booleanValue, false);
            if (a2 != null) {
                ComponentName component = a2.getComponent();
                if (component == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(component, "");
                if (TextUtils.equals(component.getClassName(), DetailFeedServiceImpl.m65254b().mo57058a().getName()) && (a = C0576b.m2191a(activity)) != null) {
                    bundle = a.mo2564a();
                }
                C84349a.m145093a(a2, activity);
                activity.startActivity(a2, bundle);
            } else {
                awVar.mo59959a(activity, uri, booleanValue);
            }
            mo70237a(awVar.mo59956a(uri));
            this.f95902b = true;
            C41039c.m82677d(this.f95901a);
        }
        C41039c.m82668a("independent_transfer", LiveNetAdaptiveHurryTimeSetting.DEFAULT, dVar.f95922e, "compatible command");
        activity.finish();
        return new C89378p<>(Boolean.valueOf(this.f95902b), this.f95901a);
    }
}
