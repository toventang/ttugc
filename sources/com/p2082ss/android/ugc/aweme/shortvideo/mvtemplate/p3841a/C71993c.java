package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.view.style.ProgressDialogC84982h;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c */
public final class C71993c {

    /* renamed from: a */
    public AbstractC72001h f161327a;

    /* renamed from: b */
    public AbstractC71996b f161328b;

    /* renamed from: c */
    List<Bitmap> f161329c;

    /* renamed from: d */
    int f161330d;

    /* renamed from: e */
    AbstractC31071f f161331e;

    /* renamed from: f */
    int[] f161332f;

    /* renamed from: g */
    AbstractC85541q f161333g;

    /* renamed from: h */
    Handler f161334h;

    /* renamed from: i */
    HandlerThread f161335i;

    /* renamed from: j */
    Handler f161336j;

    /* renamed from: k */
    ProgressDialogC84982h f161337k;

    /* renamed from: l */
    public C1213t<Bitmap> f161338l;

    /* renamed from: m */
    public C1213t<Boolean> f161339m;

    /* renamed from: n */
    boolean f161340n;

    /* renamed from: o */
    private int f161341o;

    /* renamed from: p */
    private int f161342p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c$b */
    public interface AbstractC71996b {
        static {
            Covode.recordClassIndex(84636);
        }

        /* renamed from: a */
        void mo78807a(String str);
    }

    static {
        Covode.recordClassIndex(84633);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bitmap mo114166a() {
        AbstractC31071f fVar = this.f161331e;
        if (fVar == null) {
            return null;
        }
        int i = this.f161341o;
        if (i == 0) {
            return fVar.mo56340c();
        }
        return fVar.mo56298a(i);
    }

    public C71993c() {
        this.f161329c = Collections.synchronizedList(new ArrayList());
        this.f161330d = 7;
        HandlerThread handlerThread = new HandlerThread("mv_cover_creator");
        this.f161335i = handlerThread;
        handlerThread.start();
        this.f161334h = new Handler(this.f161335i.getLooper()) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.HandlerC719941 */

            static {
                Covode.recordClassIndex(84634);
            }

            public final void handleMessage(Message message) {
                C71993c cVar = C71993c.this;
                if (message.what != 1001) {
                    cVar.f161336j.sendEmptyMessage(1003);
                    return;
                }
                int size = cVar.f161329c.size();
                if (size >= cVar.f161330d - 1) {
                    if (size == cVar.f161330d - 1) {
                        cVar.f161329c.add(cVar.mo114166a());
                    }
                    cVar.f161336j.sendEmptyMessage(1003);
                } else if (cVar.f161331e == null) {
                    cVar.f161336j.sendEmptyMessage(1003);
                } else {
                    Bitmap a = cVar.mo114166a();
                    cVar.f161329c.add(a);
                    int i = size + 1;
                    if (i == 1) {
                        ArrayList arrayList = new ArrayList(cVar.f161330d);
                        for (int i2 = 0; i2 < cVar.f161330d; i2++) {
                            arrayList.add(a);
                        }
                        Message message2 = new Message();
                        message2.obj = arrayList;
                        message2.what = 1002;
                        cVar.f161336j.sendMessage(message2);
                    }
                    cVar.f161331e.mo56265a(cVar.f161332f[i], C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
        };
        this.f161336j = new HandlerC71995a(this);
    }

    /* renamed from: a */
    private void m127084a(String str) {
        AbstractC71996b bVar = this.f161328b;
        if (bVar != null) {
            bVar.mo78807a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c$a */
    static class HandlerC71995a extends Handler {

        /* renamed from: a */
        private WeakReference<C71993c> f161344a;

        static {
            Covode.recordClassIndex(84635);
        }

        HandlerC71995a(C71993c cVar) {
            this.f161344a = new WeakReference<>(cVar);
        }

        public final void handleMessage(Message message) {
            if (this.f161344a.get() != null) {
                if (message.what == 1002) {
                    List<Bitmap> list = (List) message.obj;
                    if (this.f161344a.get().f161327a != null) {
                        this.f161344a.get().f161327a.mo78808a(list);
                        if (list != null && !list.isEmpty() && list.get(0) != null) {
                            if (this.f161344a.get().f161339m != null) {
                                if (!Boolean.TRUE.equals(this.f161344a.get().f161339m.getValue())) {
                                    this.f161344a.get().f161339m.setValue(true);
                                } else {
                                    return;
                                }
                            }
                            if (this.f161344a.get().f161338l != null) {
                                this.f161344a.get().f161338l.setValue(list.get(0));
                            }
                        }
                    }
                } else if (message.what == 1003) {
                    C71993c cVar = this.f161344a.get();
                    if (cVar.f161327a != null) {
                        cVar.f161327a.mo78808a(cVar.f161329c);
                    }
                    if (cVar.f161331e != null) {
                        cVar.f161331e.mo56265a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                    }
                    if (!(cVar.f161331e == null || cVar.f161333g == null)) {
                        cVar.f161331e.mo56349d(cVar.f161333g);
                    }
                    if (cVar.f161335i != null) {
                        int i = Build.VERSION.SDK_INT;
                        cVar.f161335i.quitSafely();
                    }
                    if (cVar.f161337k != null) {
                        cVar.f161337k.dismiss();
                    }
                    if (cVar.f161339m != null) {
                        cVar.f161339m.setValue(false);
                    }
                    cVar.f161327a = null;
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m127085a(Context context) {
        if (context == null) {
            this.f161336j.sendEmptyMessage(1003);
            return false;
        } else if (context instanceof Activity) {
            if (!((Activity) context).isFinishing()) {
                return true;
            }
            this.f161336j.sendEmptyMessage(1003);
            return false;
        } else if (!((Activity) context).isFinishing()) {
            return true;
        } else {
            this.f161336j.sendEmptyMessage(1003);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m127086a(File file) {
        MethodCollector.m26663i(11779);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11779);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11779);
        return delete;
    }

    /* renamed from: b */
    private static int[] m127087b(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    /* renamed from: a */
    public final C71993c mo114167a(int i, int i2) {
        this.f161341o = i;
        this.f161342p = i2;
        return this;
    }

    /* renamed from: a */
    public final void mo114168a(Context context, AbstractC31071f fVar, int i, AbstractC72001h hVar) {
        if (m127085a(context)) {
            ProgressDialogC84982h a = ProgressDialogC84982h.m146057a(context, context.getString(R.string.g1j));
            this.f161337k = a;
            a.setIndeterminate(true);
            this.f161327a = hVar;
            this.f161330d = i;
            this.f161331e = fVar;
            if (fVar == null) {
                this.f161336j.sendEmptyMessage(1003);
                return;
            }
            this.f161332f = m127087b(fVar.mo56368j(), this.f161330d);
            this.f161333g = new C72000g(this);
            fVar.mo56390u();
            fVar.mo56344c(this.f161333g);
            fVar.mo56265a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    public C71993c(AbstractC31071f fVar, String str, int i, AbstractC71996b bVar, AbstractC72004a aVar) {
        this(fVar, str, i, null, bVar, aVar);
    }

    public C71993c(AbstractC31071f fVar, String str, int i, AbstractC88434g<Bitmap, Bitmap> gVar, AbstractC71996b bVar, AbstractC72004a aVar) {
        this.f161329c = Collections.synchronizedList(new ArrayList());
        this.f161330d = 7;
        long currentTimeMillis = System.currentTimeMillis();
        this.f161328b = bVar;
        if (fVar == null) {
            m127084a("MvChooseCoverBitmap veEditor is null");
        } else if (TextUtils.isEmpty(str)) {
            m127084a("MvChooseCoverBitmap imgPath is null");
        } else {
            this.f161331e = fVar;
            try {
                if (C84902i.m145892a(str)) {
                    C24428k.m46551a().mo40247e().mo40228a(Uri.fromFile(new File(str)));
                    m127086a(new File(str));
                }
                this.f161333g = new C71997d(this, currentTimeMillis, str, gVar, aVar);
                fVar.mo56390u();
                fVar.mo56344c(this.f161333g);
                int a = fVar.mo56265a(i, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                if (a != 0) {
                    m127084a("MvChooseCoverBitmap start time " + i + ", seek error " + a);
                }
            } catch (Exception e) {
                e.getMessage();
                m127084a("MvChooseCoverBitmap exception" + e.toString());
            }
        }
    }
}
