package com.p2082ss.ttvideoengine.p4411e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.ttvideoengine.p4410d.C86408c;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.ss.ttvideoengine.e.d */
public final class C86418d {

    /* renamed from: a */
    public static final C86418d f193745a = new C86418d();

    /* renamed from: b */
    public AbstractC86423f f193746b;

    /* renamed from: c */
    public long f193747c;

    /* renamed from: d */
    public long f193748d;

    /* renamed from: e */
    public long f193749e;

    /* renamed from: f */
    public ArrayList<C86412a> f193750f;

    /* renamed from: g */
    public ArrayList<C86412a> f193751g;

    /* renamed from: h */
    public ArrayList<Long> f193752h;

    /* renamed from: i */
    public boolean f193753i;

    /* renamed from: j */
    public Handler f193754j;

    /* renamed from: k */
    public Context f193755k;

    /* renamed from: l */
    public C86408c f193756l;

    /* renamed from: m */
    private ArrayList<C86412a> f193757m;

    /* renamed from: n */
    private ArrayList<C86412a> f193758n;

    /* renamed from: o */
    private C86420b f193759o;

    static {
        Covode.recordClassIndex(101646);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.e.d$b */
    public static class C86420b {

        /* renamed from: a */
        HandlerThread f193763a;

        /* renamed from: b */
        Handler f193764b;

        static {
            Covode.recordClassIndex(101648);
        }

        public C86420b() {
            try {
                HandlerThread handlerThread = new HandlerThread("vclould.engine.download.tasks");
                this.f193763a = handlerThread;
                handlerThread.start();
                this.f193764b = new Handler(this.f193763a.getLooper()) {
                    /* class com.p2082ss.ttvideoengine.p4411e.C86418d.C86420b.HandlerC864211 */

                    static {
                        Covode.recordClassIndex(101649);
                    }

                    public final void handleMessage(Message message) {
                        C86419a aVar;
                        if (message != null) {
                            try {
                                if (!(message.obj instanceof ArrayList)) {
                                    C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] obj should instance of ArrayList");
                                    return;
                                }
                                ArrayList arrayList = (ArrayList) message.obj;
                                if (arrayList == null) {
                                    C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] obj should instance of ArrayList");
                                    return;
                                }
                                C86418d dVar = (C86418d) arrayList.get(0);
                                int i = message.what;
                                if (i == 10) {
                                    dVar.f193756l = new C86408c(dVar.f193755k, "TTVideoEngine_download_database_v01");
                                    if (dVar.f193756l != null && dVar.f193756l.f193689a) {
                                        C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] open db success");
                                        dVar.f193751g = dVar.mo137446a();
                                        if (dVar.f193754j != null) {
                                            dVar.f193754j.sendMessage(Message.obtain(dVar.f193754j, 4));
                                        }
                                    } else if (dVar.f193754j != null) {
                                        dVar.f193754j.sendMessage(Message.obtain(dVar.f193754j, 5));
                                    }
                                } else if (i == 11 && arrayList.size() == 2 && (aVar = (C86419a) arrayList.get(1)) != null) {
                                    dVar.mo137448a(aVar.f193760a, aVar.f193761b);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                };
            } catch (Throwable unused) {
                this.f193763a = null;
                this.f193764b = null;
            }
        }
    }

    private C86418d() {
        this.f193748d = 1073741824;
        this.f193759o = new C86420b();
        this.f193749e = -1;
        this.f193750f = new ArrayList<>();
        this.f193752h = new ArrayList<>();
        this.f193757m = new ArrayList<>();
        this.f193758n = new ArrayList<>();
        this.f193747c = 1;
        this.f193748d = 1073741824;
        this.f193753i = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x015e A[Catch:{ all -> 0x016d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.p2082ss.ttvideoengine.p4411e.C86412a> mo137446a() {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4411e.C86418d.mo137446a():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.e.d$a */
    public class C86419a {

        /* renamed from: a */
        C86412a f193760a;

        /* renamed from: b */
        ArrayList<C86412a> f193761b;

        static {
            Covode.recordClassIndex(101647);
        }

        private C86419a() {
        }

        /* synthetic */ C86419a(C86418d dVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo137449a(String str) {
        Handler handler;
        if (!TextUtils.isEmpty(str) && (handler = this.f193754j) != null) {
            handler.sendMessage(Message.obtain(handler, 0, str));
        }
    }

    /* renamed from: a */
    private static String m149109a(ArrayList<Long> arrayList) {
        StringBuilder sb = new StringBuilder(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static ArrayList<String> m149110b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split == null || split.length <= 0) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str2 : split) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                    }
                } catch (Throwable unused) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo137452c(C86412a aVar) {
        this.f193750f.remove(aVar);
        this.f193752h.remove(Long.valueOf(aVar.f193700b));
        this.f193757m.remove(aVar);
        aVar.mo137434a(new C86633c("kTTVideoErrorDomainDownload", -9995, 0, "task info: " + aVar.toString()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo137451b(C86412a aVar) {
        if (!this.f193758n.contains(aVar)) {
            this.f193758n.add(aVar);
        }
        if (this.f193757m.contains(aVar)) {
            C86641i.m150110a("TTVideoEngine.Downloader", "[downloader] resume task. is waiting,  task = " + aVar.toString());
            this.f193757m.remove(aVar);
        }
        if (aVar.f193702d >= 1) {
            int i = (aVar.f193703e > 1 ? 1 : (aVar.f193703e == 1 ? 0 : -1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo137450a(C86412a aVar) {
        if (((long) this.f193758n.size()) < this.f193747c || (this.f193758n.contains(aVar) && (aVar.f193704f == 3 || aVar.f193704f == 5))) {
            long c = C86640h.m150094c(this.f193755k);
            C86641i.m150110a("TTVideoEngine.Downloader", "[downloader] get free size, size = " + c + ", limite = " + this.f193748d);
            if (c > this.f193748d) {
                return true;
            }
            aVar.mo137434a(new C86633c("kTTVideoErrorDomainDownload", -9947, 0, "available size is less than 1073741824 M"));
            return false;
        }
        aVar.mo137433a(1);
        if (!this.f193757m.contains(aVar)) {
            this.f193757m.add(aVar);
        }
        C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] task is waiting, task info " + aVar.toString());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo137447a(C86412a aVar, C86633c cVar) {
        if (!aVar.f193709k || aVar.f193710l) {
            if (cVar != null) {
                C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] error info " + cVar.toString());
            }
            aVar.f193709k = true;
            C86419a aVar2 = new C86419a(this, (byte) 0);
            aVar2.f193760a = aVar;
            aVar2.f193761b = new ArrayList<>(this.f193750f);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            arrayList.add(aVar2);
            C86420b bVar = this.f193759o;
            if (!(bVar.f193764b == null || bVar.f193763a == null)) {
                Message obtain = Message.obtain();
                obtain.what = 11;
                obtain.obj = arrayList;
                bVar.f193764b.sendMessage(obtain);
            }
            C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] task complete, task info = " + aVar.toString());
            if (this.f193758n.contains(aVar)) {
                this.f193758n.remove(aVar);
            }
            if (((long) this.f193758n.size()) == this.f193747c) {
                C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] running task count is " + this.f193758n.size() + " max count is " + this.f193747c);
            } else if (this.f193757m.size() <= 0) {
                C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] waiting task is empty");
            } else {
                C86412a aVar3 = this.f193757m.get(0);
                this.f193757m.remove(aVar3);
                aVar3.mo137432a();
                C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] auto resume waiting task: " + aVar3.toString());
            }
        } else {
            C86641i.m150113b("TTVideoEngine.Downloader", "[downloader] task did finished, info = " + aVar.toString());
        }
    }

    /* renamed from: a */
    public final void mo137448a(C86412a aVar, ArrayList<C86412a> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<C86412a> it = arrayList.iterator();
        while (it.hasNext()) {
            C86412a next = it.next();
            if (!arrayList2.contains(Long.valueOf(next.f193700b))) {
                arrayList2.add(Long.valueOf(next.f193700b));
            }
        }
        Collections.sort(arrayList2);
        String a = m149109a(arrayList2);
        this.f193756l.mo137430a("index", a);
        SharedPreferences.Editor edit = C34822d.m71158a(this.f193755k, "TTVideoEngine_download_index_v01", 0).edit();
        edit.putString("index", a);
        edit.commit();
        String jSONObject = aVar.mo137438c().toString();
        String valueOf = String.valueOf(aVar.f193700b);
        C86641i.m150110a("TTVideoEngine.Downloader", "[downloader] write task. key " + valueOf + " value: " + jSONObject);
        if (arrayList.contains(aVar)) {
            if (!this.f193756l.mo137430a(valueOf, jSONObject)) {
                C86641i.m150117e("TTVideoEngine.Downloader", "[downloader] save task fail, videoid = " + aVar.f193711m + " taskIdentifier = " + aVar.f193700b);
                aVar.mo137434a(new C86633c("kTTVideoErrorDomainDownload", -9949, -1, jSONObject));
            }
        } else if (!this.f193756l.mo137429a(valueOf)) {
            C86641i.m150117e("TTVideoEngine.Downloader", "[downloader] remve task fail, videoid = " + aVar.f193711m + " taskIdentifier = " + aVar.f193700b);
            aVar.mo137434a(new C86633c("kTTVideoErrorDomainDownload", -9949, -1, jSONObject));
        }
    }
}
