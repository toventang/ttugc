package com.bytedance.sdk.p1625a.p1652k.p1654b.p1655a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22464b;
import com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22476c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Collections;
import net.openid.appauth.C89981d;
import net.openid.appauth.C89982e;
import net.openid.appauth.C89988g;
import net.openid.appauth.C89990h;
import net.openid.appauth.C89993i;
import net.openid.appauth.C90009p;
import net.openid.appauth.p4650b.C89975b;

/* renamed from: com.bytedance.sdk.a.k.b.a.a */
public final class C22469a implements AbstractC22464b {

    /* renamed from: a */
    public C89993i f53118a;

    /* renamed from: b */
    private String f53119b;

    static {
        Covode.recordClassIndex(26285);
    }

    /* renamed from: com.bytedance.sdk.a.k.b.a.a$a */
    static class C22471a implements AbstractC22464b.AbstractC22465a {

        /* renamed from: a */
        AbstractC22475b f53121a;

        /* renamed from: b */
        Context f53122b;

        /* renamed from: c */
        C89990h f53123c;

        static {
            Covode.recordClassIndex(26287);
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22464b.AbstractC22465a
        /* renamed from: a */
        public final void mo36761a() {
            if (this.f53121a != null) {
                this.f53121a = null;
            }
            if (this.f53122b != null) {
                this.f53122b = null;
            }
            C89990h hVar = this.f53123c;
            if (hVar != null && !hVar.f203968d) {
                hVar.f203966b.mo144628a();
                hVar.f203968d = true;
            }
        }

        @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22474a
        /* renamed from: a */
        public final void mo36765a(int i, Intent intent) {
            if (i != 100) {
                return;
            }
            if (intent == null) {
                try {
                    AbstractC22475b bVar = this.f53121a;
                    if (bVar != null) {
                        bVar.mo34356a(new C22476c("activity result null"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    AbstractC22475b bVar2 = this.f53121a;
                    if (bVar2 != null) {
                        bVar2.mo34356a(new C22476c(e.getMessage()));
                    }
                }
            } else {
                C89988g a = C89988g.m156142a(intent);
                C89982e fromIntent = C89982e.fromIntent(intent);
                final C89981d dVar = new C89981d(a, fromIntent);
                if (a != null) {
                    if (this.f53122b == null) {
                        AbstractC22475b bVar3 = this.f53121a;
                        if (bVar3 != null) {
                            bVar3.mo34356a(new C22476c("context null"));
                            return;
                        }
                        return;
                    }
                    this.f53123c.mo144659a(a.mo144648a(Collections.emptyMap()), new C89990h.AbstractC89992b() {
                        /* class com.bytedance.sdk.p1625a.p1652k.p1654b.p1655a.C22469a.C22471a.C224721 */

                        static {
                            Covode.recordClassIndex(26288);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
                        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
                        @Override // net.openid.appauth.C89990h.AbstractC89992b
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void mo36766a(net.openid.appauth.C90013s r8, net.openid.appauth.C89982e r9) {
                            /*
                            // Method dump skipped, instructions count: 218
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.p1625a.p1652k.p1654b.p1655a.C22469a.C22471a.C224721.mo36766a(net.openid.appauth.s, net.openid.appauth.e):void");
                        }
                    });
                } else if (fromIntent != null) {
                    C22476c cVar = new C22476c(fromIntent.code, fromIntent.error, fromIntent.errorDescription);
                    if (fromIntent.code == C89982e.C89984b.f203902c.code) {
                        cVar.f53131b = true;
                    }
                    AbstractC22475b bVar4 = this.f53121a;
                    if (bVar4 != null) {
                        bVar4.mo34356a(cVar);
                    }
                } else {
                    AbstractC22475b bVar5 = this.f53121a;
                    if (bVar5 != null) {
                        bVar5.mo34356a(new C22476c("response null"));
                    }
                }
            }
        }

        private C22471a(Context context, C89990h hVar, AbstractC22475b bVar) {
            this.f53122b = context;
            this.f53123c = hVar;
            this.f53121a = bVar;
        }

        /* renamed from: a */
        static void m42412a(Bundle bundle, String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(str, str2);
            }
        }

        /* synthetic */ C22471a(Context context, C89990h hVar, AbstractC22475b bVar, byte b) {
            this(context, hVar, bVar);
        }
    }

    /* renamed from: a */
    private static Context m42409a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public C22469a(String str, String str2) {
        try {
            this.f53119b = str2;
            if (!TextUtils.isEmpty(str) && Patterns.WEB_URL.matcher(str2).matches()) {
                Uri parse = Uri.parse(str);
                C224701 r4 = new C89993i.AbstractC89995b() {
                    /* class com.bytedance.sdk.p1625a.p1652k.p1654b.p1655a.C22469a.C224701 */

                    static {
                        Covode.recordClassIndex(26286);
                    }

                    @Override // net.openid.appauth.C89993i.AbstractC89995b
                    /* renamed from: a */
                    public final void mo36764a(C89993i iVar, C89982e eVar) {
                        if (eVar == null) {
                            C22469a.this.f53118a = iVar;
                        } else {
                            eVar.printStackTrace();
                        }
                    }
                };
                Uri build = parse.buildUpon().appendPath(".well-known").appendPath("openid-configuration").build();
                C89975b bVar = C89975b.f203874a;
                C90009p.m156198a(build, "openIDConnectDiscoveryUri cannot be null");
                C90009p.m156198a(r4, "callback cannot be null");
                C90009p.m156198a(bVar, "connectionBuilder must not be null");
                new C89993i.AsyncTaskC89994a(build, bVar, r4).execute(new Void[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C22469a(String str, String str2, String str3) {
        try {
            this.f53119b = str3;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Patterns.WEB_URL.matcher(str).matches() && Patterns.WEB_URL.matcher(str2).matches()) {
                this.f53118a = new C89993i(Uri.parse(str), Uri.parse(str2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        if (r7.f53139c.equals(r3) != false) goto L_0x005f;
     */
    @Override // com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22464b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22464b.AbstractC22465a mo36760a(android.app.Activity r6, com.bytedance.sdk.p1625a.p1652k.p1656c.C22479f r7, com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b r8) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.p1625a.p1652k.p1654b.p1655a.C22469a.mo36760a(android.app.Activity, com.bytedance.sdk.a.k.c.f, com.bytedance.sdk.a.k.c.b):com.bytedance.sdk.a.k.a.b$a");
    }
}
