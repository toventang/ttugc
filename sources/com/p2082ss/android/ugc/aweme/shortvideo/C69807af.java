package com.p2082ss.android.ugc.aweme.shortvideo;

import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.C69824ag;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73912m;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73837aa;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73904i;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73908j;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73915p;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73924x;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.EnumC73918s;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73895a;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.af */
public final class C69807af implements AbstractC73910l {

    /* renamed from: a */
    public final Lock f155987a;

    /* renamed from: b */
    public final Condition f155988b;

    /* renamed from: c */
    public final Lock f155989c;

    /* renamed from: d */
    public final Condition f155990d;

    /* renamed from: e */
    public final C73915p f155991e = new C73915p();

    /* renamed from: f */
    public final RandomAccessFile f155992f;

    /* renamed from: g */
    public volatile int f155993g = 0;

    /* renamed from: h */
    public volatile boolean f155994h;

    /* renamed from: i */
    public volatile C73904i.EnumC73907c f155995i;

    /* renamed from: j */
    public AbstractC73910l.AbstractC73911a f155996j;

    /* renamed from: k */
    public int f155997k = 0;

    /* renamed from: l */
    public byte[] f155998l = null;

    /* renamed from: m */
    public final LinkedList<C73837aa> f155999m = new LinkedList<>();

    /* renamed from: n */
    public final File f156000n;

    /* renamed from: o */
    public int f156001o = 0;

    /* renamed from: p */
    public final String f156002p;

    /* renamed from: q */
    private final boolean f156003q;

    /* renamed from: r */
    private final C73895a<Long> f156004r = new C73895a<>(-1L);

    /* renamed from: s */
    private boolean f156005s = false;

    static {
        Covode.recordClassIndex(82213);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: c */
    public final boolean mo110159c() {
        return this.f155994h;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: a */
    public final void mo110156a(byte[] bArr, int i, int i2, boolean z) {
        mo110154a("produce offset:%d size:%d isFinish:%b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        if (m123345g() >= 0) {
            C69812d dVar = new C69812d(bArr, i, i2);
            this.f155987a.lock();
            try {
                this.f155991e.mo116361a(dVar);
                this.f155988b.await();
                if (dVar.f156018a == null) {
                    this.f155987a.unlock();
                    this.f155994h = z;
                    this.f155989c.lock();
                    this.f155990d.signalAll();
                    this.f155989c.unlock();
                    return;
                }
                throw new C73908j(dVar.f156018a);
            } catch (InterruptedException e) {
                throw new C73908j(e);
            } catch (Throwable th) {
                this.f155987a.unlock();
                throw th;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: d */
    public final long mo110160d() {
        return ((Long) this.f156004r.f165905a).longValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: e */
    public final long mo110161e() {
        if (this.f155994h) {
            return this.f156000n.length();
        }
        return -1;
    }

    /* renamed from: g */
    private int m123345g() {
        if (C73904i.EnumC73907c.UPLOAD_FINISH.equals(this.f155995i)) {
            return -1;
        }
        if (C73904i.EnumC73907c.UPLOAD_CANCEL.equals(this.f155995i)) {
            return -2;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: a */
    public final int mo110149a() {
        mo110154a("StartGetHeaderSize", new Object[0]);
        int f = m123344f();
        mo110154a("EndGetHeaderSize result:%d", Integer.valueOf(f));
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af$1 */
    public static /* synthetic */ class C698081 {

        /* renamed from: a */
        static final /* synthetic */ int[] f156006a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 82214(0x14126, float:1.15206E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.shortvideo.upload.i$a[] r0 = com.p2082ss.android.ugc.aweme.shortvideo.upload.C73904i.EnumC73905a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.shortvideo.C69807af.C698081.f156006a = r2
                com.ss.android.ugc.aweme.shortvideo.upload.i$a r0 = com.p2082ss.android.ugc.aweme.shortvideo.upload.C73904i.EnumC73905a.CONSUME_FAIL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.shortvideo.C69807af.C698081.f156006a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.shortvideo.upload.i$a r0 = com.p2082ss.android.ugc.aweme.shortvideo.upload.C73904i.EnumC73905a.CONSUME_END     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C69807af.C698081.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af$c */
    public class C69811c implements AbstractC73912m {

        /* renamed from: a */
        public volatile C73904i.EnumC73906b f156016a;

        static {
            Covode.recordClassIndex(82217);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73912m
        /* renamed from: a */
        public final void mo110162a() {
            if (C69807af.this.f155993g > 0) {
                C69807af.this.f155989c.lock();
                this.f156016a = C73904i.EnumC73906b.GET_HEADER_SIZE_DONE;
                C69807af.this.f155990d.signalAll();
                C69807af.this.f155989c.unlock();
                return;
            }
            this.f156016a = C73904i.EnumC73906b.GET_HEADER_SIZE_WAIT;
        }

        private C69811c() {
        }

        /* synthetic */ C69811c(C69807af afVar, byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: b */
    public final void mo110157b() {
        mo110158b("stop cancelUpload, currentStatus:" + this.f155995i, new Object[0]);
        if (this.f155995i == C73904i.EnumC73907c.UPLOADING) {
            this.f155995i = C73904i.EnumC73907c.UPLOAD_CANCEL;
            try {
                C69824ag.m123390a(this.f156000n.getPath());
                this.f155991e.mo116361a(new C69810b(EnumC73918s.CANCEL));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af$e */
    public class C69813e implements AbstractC73912m {

        /* renamed from: a */
        public volatile int f156023a;

        /* renamed from: b */
        public Exception f156024b;

        /* renamed from: c */
        public volatile C73904i.EnumC73905a f156025c;

        /* renamed from: e */
        private final long f156027e;

        /* renamed from: f */
        private final byte[] f156028f;

        /* renamed from: g */
        private final long f156029g;

        /* renamed from: h */
        private final long f156030h;

        static {
            Covode.recordClassIndex(82219);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73912m
        /* renamed from: a */
        public final void mo110162a() {
            int length = (int) C69807af.this.f156000n.length();
            if (!C69807af.this.f155994h) {
                if (this.f156029g > ((long) length)) {
                    this.f156025c = C73904i.EnumC73905a.CONSUME_WAIT_DATA;
                } else {
                    m123365a(length);
                }
            } else if (this.f156027e < ((long) length)) {
                m123365a(length);
            } else {
                m123366a(C73904i.EnumC73905a.CONSUME_END);
            }
        }

        /* renamed from: a */
        private void m123366a(C73904i.EnumC73905a aVar) {
            C69807af.this.f155989c.lock();
            this.f156025c = aVar;
            C69807af.this.f155990d.signalAll();
            C69807af.this.f155989c.unlock();
        }

        /* renamed from: b */
        private int m123367b(int i) {
            long min = Math.min(this.f156030h, (long) i) - this.f156027e;
            if (min > 16) {
                min -= min % 16;
            }
            return (int) min;
        }

        /* renamed from: a */
        private void m123365a(int i) {
            this.f156023a = m123367b(i);
            try {
                C69807af.this.f155992f.seek(this.f156027e);
                C69807af.this.f155992f.read(this.f156028f, 0, this.f156023a);
                m123366a(C73904i.EnumC73905a.CONSUME_DONE);
            } catch (IOException e) {
                this.f156024b = e;
                m123366a(C73904i.EnumC73905a.CONSUME_FAIL);
            }
        }

        private C69813e(long j, byte[] bArr, int i, int i2) {
            this.f156027e = j;
            this.f156028f = bArr;
            this.f156030h = ((long) i) + j;
            this.f156029g = j + ((long) i2);
        }

        /* synthetic */ C69813e(C69807af afVar, long j, byte[] bArr, int i, int i2, byte b) {
            this(j, bArr, i, i2);
        }
    }

    /* renamed from: f */
    private int m123344f() {
        boolean await;
        int g = m123345g();
        if (g < 0) {
            return g;
        }
        if (this.f155993g > 0) {
            return this.f155993g;
        }
        C69811c cVar = new C69811c(this, (byte) 0);
        this.f155989c.lock();
        do {
            try {
                this.f155991e.mo116361a(cVar);
                do {
                    await = this.f155990d.await(30, TimeUnit.SECONDS);
                } while (cVar.f156016a == null);
                if (await) {
                    int g2 = m123345g();
                    if (g2 < 0) {
                        this.f155989c.unlock();
                        return g2;
                    }
                } else {
                    this.f156001o = -1;
                    throw new C73908j("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new C73908j(e);
            } catch (Throwable th) {
                this.f155989c.unlock();
                throw th;
            }
        } while (cVar.f156016a == C73904i.EnumC73906b.GET_HEADER_SIZE_WAIT);
        this.f155989c.unlock();
        if (this.f155993g <= 0) {
            return -1;
        }
        return this.f155993g;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af$b */
    class C69810b implements AbstractC73912m {

        /* renamed from: b */
        private final EnumC73918s f156015b;

        static {
            Covode.recordClassIndex(82216);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73912m
        /* renamed from: a */
        public final void mo110162a() {
            C69807af.this.f155989c.lock();
            C69807af.this.f155990d.signalAll();
            C69807af.this.f155989c.unlock();
            if (C69807af.this.f155996j != null) {
                C69807af.this.f155996j.mo114893a(this.f156015b);
            }
            C69807af.this.f155987a.lock();
            C69807af.this.f155988b.signalAll();
            C69807af.this.f155987a.unlock();
            try {
                C69807af.this.f155992f.close();
                C69807af.this.mo110158b("raf.close();", new Object[0]);
            } catch (IOException e) {
                C69807af.this.mo110158b("raf.close() " + e.getMessage(), new Object[0]);
            }
            if (C69807af.this.f156000n.exists()) {
                m123361a(C69807af.this.f156000n);
            }
            C69807af.this.f155991e.f165942a.quit();
        }

        /* renamed from: a */
        private static boolean m123361a(File file) {
            MethodCollector.m26663i(7312);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(7312);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(7312);
            return delete;
        }

        public C69810b(EnumC73918s sVar) {
            this.f156015b = sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af$d */
    class C69812d implements AbstractC73912m {

        /* renamed from: a */
        public volatile Exception f156018a;

        /* renamed from: c */
        private final byte[] f156020c;

        /* renamed from: d */
        private final int f156021d;

        /* renamed from: e */
        private final int f156022e;

        static {
            Covode.recordClassIndex(82218);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73912m
        /* renamed from: a */
        public final void mo110162a() {
            try {
                if (C69807af.this.f155992f.length() == 0) {
                    int i = this.f156021d;
                    if (i % 16 != 0) {
                        C69807af.this.f155997k = 16 - (i % 16);
                        i = this.f156021d + C69807af.this.f155997k;
                        C69807af afVar = C69807af.this;
                        afVar.f155998l = Arrays.copyOf(this.f156020c, afVar.f155997k);
                    }
                    C69807af.this.f155993g = i;
                    C69807af afVar2 = C69807af.this;
                    afVar2.mo110158b("Produce on empty file, mMp4HeaderSize:%d", Integer.valueOf(afVar2.f155993g));
                    if (this.f156021d == 0) {
                        C80510gr.m139528a(C69807af.this.f156002p, 100102, "");
                    }
                    C12290b.m22060a("parallel_upload_ve_compile_first_offset", i, (JSONObject) null);
                    C69807af.this.f155992f.write(new byte[i], 0, i);
                    C69807af.this.f155992f.write(this.f156020c, C69807af.this.f155997k, this.f156022e - C69807af.this.f155997k);
                } else {
                    C69807af.this.f155992f.seek((long) this.f156021d);
                    C69807af.this.f155992f.write(this.f156020c, 0, this.f156022e);
                    if (this.f156021d == 0 && C69807af.this.f155998l != null) {
                        C69807af.this.f155992f.write(C69807af.this.f155998l, 0, C69807af.this.f155997k);
                    }
                }
                C69807af.this.mo110154a("write offset:%d size:%d", Integer.valueOf(this.f156021d), Integer.valueOf(this.f156022e));
            } catch (IOException e) {
                this.f156018a = e;
            }
            C69807af.this.f155987a.lock();
            C69807af.this.f155988b.signalAll();
            C69807af.this.f155987a.unlock();
        }

        public C69812d(byte[] bArr, int i, int i2) {
            this.f156020c = bArr;
            this.f156021d = i;
            this.f156022e = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af$a */
    public class C69809a implements AbstractC73912m {

        /* renamed from: a */
        public volatile int f156007a;

        /* renamed from: b */
        public Exception f156008b;

        /* renamed from: c */
        public volatile C73904i.EnumC73905a f156009c;

        /* renamed from: e */
        private final int f156011e;

        /* renamed from: f */
        private volatile int f156012f;

        /* renamed from: g */
        private final byte[] f156013g;

        static {
            Covode.recordClassIndex(82215);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73912m
        /* renamed from: a */
        public final void mo110162a() {
            C73837aa aaVar;
            int a;
            String cVar;
            Iterator<C73837aa> it = C69807af.this.f155999m.iterator();
            do {
                aaVar = null;
                if (!it.hasNext()) {
                    break;
                }
                aaVar = it.next();
            } while (this.f156011e != aaVar.f165759a);
            if (aaVar == null) {
                if (C69807af.this.f155999m.isEmpty()) {
                    C69807af afVar = C69807af.this;
                    afVar.mo110158b("[SliceConsume] createSliceIfNeed mMp4HeaderSize:%d", Integer.valueOf(afVar.f155993g));
                    if (C69807af.this.f155993g > 0) {
                        a = C69807af.this.f155993g;
                    } else {
                        C69807af.this.mo110158b("[SliceConsume] sliceModel=null consume wait", new Object[0]);
                        this.f156009c = C73904i.EnumC73905a.CONSUME_WAIT_DATA;
                        return;
                    }
                } else {
                    a = C69807af.this.f155999m.getLast().mo116295a();
                    if (C69807af.this.f155994h) {
                        if (this.f156011e == 0) {
                            this.f156012f = C69807af.this.f155993g;
                        } else if (((long) a) >= C69807af.this.f156000n.length()) {
                            this.f156012f = 0;
                        }
                        a = 0;
                    }
                }
                aaVar = new C73837aa(this.f156011e, a, this.f156012f);
            }
            long length = C69807af.this.f156000n.length();
            if (length == 0) {
                C69807af.this.mo110158b("parallel_upload_file_delete_on_consume OutputFileLength:" + length + " UploadStatus:" + C69807af.this.f155995i, new Object[0]);
                C69840ar a2 = new C69840ar().mo110188a("OutputFileLength", Long.valueOf(length));
                if (C69807af.this.f155995i == null) {
                    cVar = "null";
                } else {
                    cVar = C69807af.this.f155995i.toString();
                }
                C34611o.m70668a("parallel_upload_file_delete_on_consume", a2.mo110189a("UploadStatus", cVar).mo110191a());
            }
            try {
                if (((long) aaVar.mo116295a()) > C69807af.this.f156000n.length()) {
                    if (!C69807af.this.f155994h) {
                        this.f156009c = C73904i.EnumC73905a.CONSUME_WAIT_DATA;
                        return;
                    }
                    aaVar.f165761c = ((int) C69807af.this.f156000n.length()) - aaVar.f165760b;
                }
                this.f156007a = aaVar.f165761c;
                C69807af.this.f155992f.seek((long) aaVar.f165760b);
                if (aaVar.f165761c < 0) {
                    C51423a.m95790a((Throwable) new Exception("ArrayIndexOutOfBoundsException sliceModel.getOffset():" + aaVar.f165760b + "  mOutputFile.length():" + C69807af.this.f156000n.length()));
                    m123359a(C73904i.EnumC73905a.CONSUME_FAIL);
                    return;
                }
                C69807af.this.f155992f.read(this.f156013g, 0, aaVar.f165761c);
                C69807af.this.f155999m.add(aaVar);
                if (aaVar.f165760b == 0 && aaVar.f165761c == 0) {
                    m123359a(C73904i.EnumC73905a.CONSUME_END);
                } else {
                    m123359a(C73904i.EnumC73905a.CONSUME_DONE);
                }
                C69807af.this.mo110154a("consume execute %d-%d", Integer.valueOf(aaVar.f165760b), Integer.valueOf(aaVar.mo116295a()));
                C69807af.this.mo110158b("consume execute %d-%d", Integer.valueOf(aaVar.f165760b), Integer.valueOf(aaVar.mo116295a()));
            } catch (IOException e) {
                this.f156008b = e;
                m123359a(C73904i.EnumC73905a.CONSUME_FAIL);
            }
        }

        /* renamed from: a */
        private void m123359a(C73904i.EnumC73905a aVar) {
            C69807af.this.f155989c.lock();
            this.f156009c = aVar;
            C69807af.this.f155990d.signalAll();
            C69807af.this.f155989c.unlock();
        }

        private C69809a(int i, byte[] bArr, int i2) {
            this.f156011e = i;
            this.f156013g = bArr;
            this.f156012f = i2;
        }

        /* synthetic */ C69809a(C69807af afVar, int i, byte[] bArr, int i2, byte b) {
            this(i, bArr, i2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: a */
    public final void mo110153a(AbstractC73910l.AbstractC73911a aVar) {
        this.f155996j = aVar;
    }

    /* renamed from: a */
    private static boolean m123339a(File file) {
        MethodCollector.m26663i(8824);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8824);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8824);
        return delete;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: a */
    public final void mo110155a(boolean z) {
        EnumC73918s sVar;
        mo110158b("stop stopUpload, currentStatus:" + this.f155995i, new Object[0]);
        if (this.f155995i == C73904i.EnumC73907c.UPLOADING) {
            this.f155995i = C73904i.EnumC73907c.UPLOAD_FINISH;
            try {
                C69824ag.m123390a(this.f156000n.getPath());
                C73915p pVar = this.f155991e;
                if (z) {
                    sVar = EnumC73918s.SUCCESS;
                } else {
                    sVar = EnumC73918s.FAILED;
                }
                pVar.mo116361a(new C69810b(sVar));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private void m123343c(String str, Object... objArr) {
        m123338a(true, true, str, objArr);
    }

    /* renamed from: a */
    public final void mo110154a(String str, Object... objArr) {
        m123338a(true, false, str, objArr);
    }

    /* renamed from: b */
    public final void mo110158b(String str, Object... objArr) {
        m123338a(false, true, str, objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: a */
    public final long mo110152a(long j, long j2) {
        long b = m123342b(j, j2);
        mo110154a("GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(b));
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r2 == null) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072 A[SYNTHETIC, Splitter:B:36:0x0072] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m123342b(long r14, long r16) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C69807af.m123342b(long, long):long");
    }

    public C69807af(String str, String str2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f155987a = reentrantLock;
        this.f155988b = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f155989c = reentrantLock2;
        this.f155990d = reentrantLock2.newCondition();
        File file = new File(str);
        this.f156000n = file;
        this.f156002p = str2;
        this.f155995i = C73904i.EnumC73907c.UPLOADING;
        try {
            new File((String) Objects.requireNonNull(file.getParent())).mkdirs();
            String parent = file.getParent();
            C89219l.m154721d(parent, "");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(C69824ag.f156045a);
            C84902i.m145888a(parent, new C69824ag.C69825a(linkedHashSet));
            String path = file.getPath();
            C89219l.m154721d(path, "");
            C69824ag.f156045a.add(path);
            if (file.exists()) {
                m123339a(file);
            }
            file.createNewFile();
            this.f155992f = new RandomAccessFile(file, "rw");
            mo110154a("createFile,filePath:%s", str);
            this.f156003q = C16048b.m29633a().mo25421a(true, "enable_publish_detail_alog", false);
            this.f156005s = C68747m.m121182c();
        } catch (IOException e) {
            throw new C73908j(e);
        }
    }

    /* renamed from: b */
    private int m123340b(int i, byte[] bArr, int i2) {
        int g = m123345g();
        if (g < 0) {
            return g;
        }
        C69809a aVar = new C69809a(this, i, bArr, i2, (byte) 0);
        this.f155989c.lock();
        do {
            try {
                aVar.f156009c = null;
                this.f155991e.mo116361a(aVar);
                boolean z = true;
                do {
                    if (this.f156005s) {
                        this.f155990d.await();
                    } else {
                        z = this.f155990d.await(30, TimeUnit.SECONDS);
                    }
                } while (aVar.f156009c == null);
                if (z) {
                    int g2 = m123345g();
                    if (g2 < 0) {
                        this.f155989c.unlock();
                        return g2;
                    }
                } else {
                    this.f156001o = -1;
                    throw new C73908j("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new C73908j(e);
            } catch (Throwable th) {
                this.f155989c.unlock();
                throw th;
            }
        } while (aVar.f156009c == C73904i.EnumC73905a.CONSUME_WAIT_DATA);
        this.f155989c.unlock();
        int i3 = C698081.f156006a[aVar.f156009c.ordinal()];
        if (i3 == 1) {
            throw new C73908j(aVar.f156008b);
        } else if (i3 != 2) {
            return aVar.f156007a;
        } else {
            return 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: a */
    public final int mo110150a(int i, byte[] bArr, int i2) {
        m123343c("StartSliceConsume sliceId:%d size:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f155999m.isEmpty()) {
            this.f156004r.mo116340a(0L);
        } else {
            this.f156004r.mo116340a(Long.valueOf((long) this.f155999m.getLast().mo116295a()));
        }
        int b = m123340b(i, bArr, i2);
        m123343c("EndSliceConsume sliceId:%d size:%d result:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b));
        return b;
    }

    /* renamed from: a */
    private void m123338a(boolean z, boolean z2, String str, Object... objArr) {
        String str2 = C1764a.m5929a(Locale.US, str, objArr) + " hash:" + hashCode() + ",publishId:" + this.f156002p;
        if (z2) {
            C84911q.m145921a("ConcurrentUploadByFile:".concat(String.valueOf(str2)));
        }
        if (z) {
            C73924x.f165970a.mo116372a(str2);
        }
    }

    /* renamed from: b */
    private int m123341b(long j, byte[] bArr, int i, int i2) {
        int g = m123345g();
        if (g < 0) {
            return g;
        }
        C69813e eVar = new C69813e(this, j, bArr, i, i2, (byte) 0);
        this.f155989c.lock();
        do {
            try {
                eVar.f156025c = null;
                this.f155991e.mo116361a(eVar);
                boolean z = true;
                do {
                    if (this.f156005s) {
                        this.f155990d.await();
                    } else {
                        z = this.f155990d.await(30, TimeUnit.SECONDS);
                    }
                } while (eVar.f156025c == null);
                if (z) {
                    int g2 = m123345g();
                    if (g2 < 0) {
                        this.f155989c.unlock();
                        return g2;
                    }
                } else {
                    this.f156001o = -1;
                    throw new C73908j("upload timeout");
                }
            } catch (InterruptedException e) {
                throw new C73908j(e);
            } catch (Throwable th) {
                this.f155989c.unlock();
                throw th;
            }
        } while (eVar.f156025c == C73904i.EnumC73905a.CONSUME_WAIT_DATA);
        this.f155989c.unlock();
        int i3 = C698081.f156006a[eVar.f156025c.ordinal()];
        if (i3 == 1) {
            throw new C73908j(eVar.f156024b);
        } else if (i3 != 2) {
            return eVar.f156023a;
        } else {
            return 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l
    /* renamed from: a */
    public final int mo110151a(long j, byte[] bArr, int i, int i2) {
        m123338a(true, this.f156003q, "StartStreamConsume offset:%d maxSize:%d minSize:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
        this.f156004r.mo116340a(Long.valueOf(j));
        int b = m123341b(j, bArr, i, i2);
        m123338a(true, this.f156003q, "EndStreamConsume offset:%d maxSize:%d minSize:%d result:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b));
        return b;
    }
}
