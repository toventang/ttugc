package com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a;

import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.h.a.b */
public abstract class AbstractAsyncTaskC23815b extends AsyncTask<Object, Void, String> {

    /* renamed from: d */
    public AbstractC23816a f56334d;

    /* renamed from: e */
    protected final AbstractC23817b f56335e;

    /* renamed from: com.d.a.a.a.h.a.b$a */
    public interface AbstractC23816a {
        static {
            Covode.recordClassIndex(27924);
        }

        /* renamed from: a */
        void mo39283a();
    }

    /* renamed from: com.d.a.a.a.h.a.b$b */
    public interface AbstractC23817b {
        static {
            Covode.recordClassIndex(27925);
        }

        /* renamed from: a */
        JSONObject mo39284a();

        /* renamed from: a */
        void mo39285a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(27923);
    }

    public AbstractAsyncTaskC23815b(AbstractC23817b bVar) {
        this.f56335e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        AbstractC23816a aVar = this.f56334d;
        if (aVar != null) {
            aVar.mo39283a();
        }
    }

    /* renamed from: a */
    public final void mo39281a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
