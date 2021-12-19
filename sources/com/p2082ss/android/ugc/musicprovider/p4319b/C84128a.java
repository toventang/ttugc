package com.p2082ss.android.ugc.musicprovider.p4319b;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84163d;

/* renamed from: com.ss.android.ugc.musicprovider.b.a */
public final class C84128a {

    /* renamed from: a */
    public AbstractC84163d f187743a;

    /* renamed from: b */
    public boolean f187744b;

    /* renamed from: c */
    private boolean f187745c = true;

    static {
        Covode.recordClassIndex(98027);
    }

    public C84128a(AbstractC84163d dVar) {
        this.f187743a = dVar;
    }

    /* renamed from: a */
    public final void mo128945a(final String str, boolean z) {
        this.f187744b = z;
        new AsyncTask() {
            /* class com.p2082ss.android.ugc.musicprovider.p4319b.C84128a.AsyncTaskC841291 */

            static {
                Covode.recordClassIndex(98028);
            }

            /* access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public final Object doInBackground(Object[] objArr) {
                try {
                    return NetworkUtils.executeGet(0, str);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public final void onPostExecute(Object obj) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (C84128a.this.f187743a != null) {
                        C84128a.this.f187743a.mo98519a(str, C84128a.this.f187744b);
                    }
                } else if (C84128a.this.f187743a != null) {
                    C84128a.this.f187743a.mo98520b();
                }
            }
        }.execute((Object[]) null);
    }
}
