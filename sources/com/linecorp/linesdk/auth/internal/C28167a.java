package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.LineApiError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.auth.internal.a */
final class C28167a {

    /* renamed from: a */
    static final C28171b f65922a = new C28171b(6, 9, 0);

    /* renamed from: b */
    final C28176d f65923b;

    /* renamed from: com.linecorp.linesdk.auth.internal.a$c */
    static class C28170c {

        /* renamed from: a */
        final String f65931a;

        /* renamed from: b */
        private final String f65932b;

        /* renamed from: c */
        private final String f65933c;

        /* renamed from: d */
        private final String f65934d;

        static {
            Covode.recordClassIndex(34116);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo48182a() {
            if (!TextUtils.isEmpty(this.f65931a)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo48183b() {
            if (!TextUtils.isEmpty(this.f65934d) || mo48182a()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final LineApiError mo48184c() {
            if (!mo48183b()) {
                return new LineApiError(this.f65934d);
            }
            try {
                return new LineApiError(new JSONObject().putOpt("error", this.f65932b).putOpt("error_description", this.f65933c).toString());
            } catch (JSONException e) {
                return new LineApiError(e);
            }
        }

        /* renamed from: a */
        static C28170c m56271a(String str) {
            return new C28170c(null, null, null, str);
        }

        C28170c(String str, String str2, String str3, String str4) {
            this.f65931a = str;
            this.f65932b = str2;
            this.f65933c = str3;
            this.f65934d = str4;
        }
    }

    static {
        Covode.recordClassIndex(34113);
    }

    C28167a(C28176d dVar) {
        this.f65923b = dVar;
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.a$a */
    static class C28168a {

        /* renamed from: a */
        final Intent f65924a;

        /* renamed from: b */
        final Bundle f65925b;

        /* renamed from: c */
        final boolean f65926c;

        static {
            Covode.recordClassIndex(34114);
        }

        C28168a(Intent intent, Bundle bundle, boolean z) {
            this.f65924a = intent;
            this.f65925b = bundle;
            this.f65926c = z;
        }
    }

    /* renamed from: a */
    static List<Intent> m56270a(Uri uri, Collection<ResolveInfo> collection, Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.a$b */
    static class C28169b {

        /* renamed from: a */
        final Intent f65927a;

        /* renamed from: b */
        final Bundle f65928b;

        /* renamed from: c */
        final String f65929c;

        /* renamed from: d */
        final boolean f65930d;

        static {
            Covode.recordClassIndex(34115);
        }

        C28169b(Intent intent, Bundle bundle, String str, boolean z) {
            this.f65927a = intent;
            this.f65928b = bundle;
            this.f65929c = str;
            this.f65930d = z;
        }
    }
}
