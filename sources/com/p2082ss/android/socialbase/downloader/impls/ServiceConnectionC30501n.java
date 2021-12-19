package com.p2082ss.android.socialbase.downloader.impls;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30417k;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30424p;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.C30405d;
import com.p2082ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.p2082ss.android.socialbase.downloader.model.DownloadTask;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.p2189k.C30536h;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.impls.n */
public class ServiceConnectionC30501n extends AbstractC30396a implements ServiceConnection {

    /* renamed from: f */
    private static final String f72716f = ServiceConnectionC30501n.class.getSimpleName();

    /* renamed from: g */
    private AbstractC30417k f72717g;

    /* renamed from: h */
    private AbstractC30424p f72718h;

    /* renamed from: i */
    private int f72719i = -1;

    static {
        Covode.recordClassIndex(37029);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a, com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: g */
    public final void mo54041g() {
        if (this.f72717g == null) {
            mo54028a(C30399c.m61674B(), this);
        }
    }

    /* renamed from: h */
    private void m62304h() {
        SparseArray clone;
        MethodCollector.m26663i(6279);
        try {
            synchronized (this.f72396b) {
                try {
                    clone = this.f72396b.clone();
                    this.f72396b.clear();
                } finally {
                    MethodCollector.m26664o(6279);
                }
            }
            if (!(clone == null || clone.size() <= 0 || C30399c.m61737u() == null)) {
                for (int i = 0; i < clone.size(); i++) {
                    List<DownloadTask> list = (List) clone.get(clone.keyAt(i));
                    if (list != null) {
                        for (DownloadTask downloadTask : list) {
                            try {
                                this.f72717g.mo54100a(C30536h.m62624a(downloadTask));
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            C30434a.m62023a(f72716f);
            MethodCollector.m26664o(6279);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a, com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public final void mo54029a(AbstractC30424p pVar) {
        this.f72718h = pVar;
    }

    public void onBindingDied(ComponentName componentName) {
        this.f72717g = null;
        AbstractC30424p pVar = this.f72718h;
        if (pVar != null) {
            pVar.mo54203i();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a, com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public final void mo54026a(int i) {
        AbstractC30417k kVar = this.f72717g;
        if (kVar == null) {
            this.f72719i = i;
            return;
        }
        try {
            kVar.mo54130l(i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a, com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: c */
    public final void mo54037c(DownloadTask downloadTask) {
        if (downloadTask != null) {
            C30405d.m61749a().mo54052a(downloadTask.getDownloadId(), true);
            AbstractC30474a u = C30399c.m61737u();
            if (u != null) {
                u.mo54277a(downloadTask);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C30434a.m62027b(f72716f, "onServiceDisconnected ");
        this.f72717g = null;
        this.f72397c = false;
        AbstractC30424p pVar = this.f72718h;
        if (pVar != null) {
            pVar.mo54203i();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a, com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: a */
    public final IBinder mo54025a(Intent intent) {
        if (intent != null && intent.getBooleanExtra("fix_downloader_db_sigbus", false)) {
            try {
                if (C30472a.f72640b == null) {
                    C30472a.f72640b = new JSONObject();
                }
                C30472a.f72640b.put("fix_sigbus_downloader_db", 1);
            } catch (JSONException unused) {
            }
        }
        C30434a.m62027b(f72716f, "onBind IndependentDownloadBinder");
        return new BinderC30500m();
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a, com.p2082ss.android.socialbase.downloader.downloader.AbstractC30425q
    /* renamed from: b */
    public final void mo54034b(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            String str = f72716f;
            StringBuilder sb = new StringBuilder("tryDownload aidlService == null:");
            if (this.f72717g == null) {
                z = true;
            } else {
                z = false;
            }
            C30434a.m62027b(str, sb.append(z).toString());
            if (this.f72717g == null) {
                mo54030a(downloadTask);
                mo54028a(C30399c.m61674B(), this);
                return;
            }
            m62304h();
            try {
                this.f72717g.mo54100a(C30536h.m62624a(downloadTask));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m62303a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.impls.ServiceConnectionC30501n.m62303a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        String str = f72716f;
        C30434a.m62027b(str, "onServiceConnected ");
        this.f72717g = AbstractC30417k.AbstractBinderC30418a.m61845a(iBinder);
        AbstractC30424p pVar = this.f72718h;
        if (pVar != null) {
            pVar.mo54202a(iBinder);
        }
        StringBuilder sb = new StringBuilder("onServiceConnected aidlService!=null");
        if (this.f72717g != null) {
            z = true;
        } else {
            z = false;
        }
        C30434a.m62027b(str, sb.append(z).append(" pendingTasks.size:").append(this.f72396b.size()).toString());
        if (this.f72717g != null) {
            C30405d.m61749a().mo54054b();
            this.f72397c = true;
            this.f72399e = false;
            int i = this.f72719i;
            if (i != -1) {
                try {
                    this.f72717g.mo54130l(i);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            if (this.f72717g != null) {
                m62304h();
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30396a
    /* renamed from: a */
    public final void mo54028a(Context context, ServiceConnection serviceConnection) {
        try {
            C30434a.m62027b(f72716f, "bindService");
            Intent intent = new Intent(context, IndependentProcessDownloadService.class);
            if (C30535g.m62557a()) {
                intent.putExtra("fix_downloader_db_sigbus", C30472a.f72639a.mo54262a("fix_sigbus_downloader_db", false));
            }
            if (serviceConnection != null) {
                if (context == null || !(context instanceof Context)) {
                    context.bindService(intent, serviceConnection, 1);
                } else if (!C65713d.m117625a(context, intent)) {
                    context.bindService(intent, serviceConnection, 1);
                }
            }
            m62303a(context, intent);
        } catch (Throwable unused) {
        }
    }
}
