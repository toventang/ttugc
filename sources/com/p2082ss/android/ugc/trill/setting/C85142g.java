package com.p2082ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.net.AbstractC61331d;
import com.p2082ss.android.ugc.aweme.net.C61305b;
import com.p2082ss.android.ugc.p2207a.p2208a.p2210b.C31008a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.p4383a.C85118a;

/* renamed from: com.ss.android.ugc.trill.setting.g */
public final class C85142g extends C31008a<PushSettingActivity> {

    /* renamed from: c */
    public int f190494c;

    /* renamed from: d */
    private AbstractC61331d<String> f190495d = new AbstractC61331d<String>() {
        /* class com.p2082ss.android.ugc.trill.setting.C85142g.C851431 */

        static {
            Covode.recordClassIndex(99183);
        }

        @Override // com.p2082ss.android.ugc.aweme.net.AbstractC61331d
        /* renamed from: a */
        public final /* synthetic */ void mo60108a() {
            if (C85142g.this.f74328a != null) {
                int i = C85142g.this.f190494c;
                if (i == 1) {
                    C85142g.this.f74328a.mo130053c();
                } else if (i == 2) {
                    C85142g.this.f74328a.mo130052b();
                } else if (i == 3) {
                    C85142g.this.f74328a.mo130054d();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.net.AbstractC61331d
        /* renamed from: a */
        public final void mo60109a(Exception exc) {
            C33615a.m68848a(C17867d.m33078a(), (Throwable) exc, (int) R.string.g1i);
        }
    };

    static {
        Covode.recordClassIndex(99182);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo130073a(int i, boolean z) {
        if (i == R.id.c8r) {
            this.f190494c = 2;
        } else if (i == R.id.b6t) {
            this.f190494c = 1;
        } else if (i == R.id.a9x) {
            this.f190494c = 3;
        }
        if (this.f74328a != null) {
            C61305b<String> a = C85118a.m146385a(this.f190494c, z ? 1 : 0);
            a.f139225a = (AbstractC61331d<T>) this.f190495d;
            a.mo98934a(C17867d.m33078a());
        }
    }
}
