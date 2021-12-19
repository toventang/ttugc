package com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23783a;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23789e;
import com.p1795d.p1796a.p1797a.p1798a.p1806g.AbstractC23805a;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.AbstractAsyncTaskC23815b;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.h.a.e */
public final class AsyncTaskC23820e extends AbstractAsyncTaskC23814a {
    static {
        Covode.recordClassIndex(27928);
    }

    public AsyncTaskC23820e(AbstractAsyncTaskC23815b.AbstractC23817b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    @Override // com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.AbstractAsyncTaskC23815b
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C23783a aVar = C23783a.f56269a;
        if (aVar != null) {
            for (C23781l lVar : Collections.unmodifiableCollection(aVar.f56270b)) {
                if (this.f56331a.contains(lVar.f56263f)) {
                    AbstractC23805a aVar2 = lVar.f56260c;
                    if (this.f56333c >= aVar2.f56308e && aVar2.f56307d != AbstractC23805a.EnumC23806a.AD_STATE_NOTVISIBLE) {
                        aVar2.f56307d = AbstractC23805a.EnumC23806a.AD_STATE_NOTVISIBLE;
                        C23789e.f56285a.mo39258b(aVar2.mo39272c(), str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ String doInBackground(Object[] objArr) {
        return this.f56332b.toString();
    }
}
